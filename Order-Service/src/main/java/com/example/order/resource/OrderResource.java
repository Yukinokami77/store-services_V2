package com.example.order.resource;

import com.example.order.model.Order;
import com.example.order.repository.OrderRepository;
import com.example.warehouse.model.Product;
import com.example.warehouse.repository.ProductRepository;
import jakarta.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/orders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderResource {

    @Inject
    OrderRepository orderRepository;

    @Inject
    ProductRepository productRepository;

    @POST
    public Response createOrder(Order order) {
        Product product = productRepository.find("name", order.getProductName()).firstResult();

        if (product == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Product not found").build();
        }

        order.setTotalPrice(product.price * order.getQuantity());
        orderRepository.persist(order);
        return Response.status(Response.Status.CREATED).entity(order).build();
    }
}
