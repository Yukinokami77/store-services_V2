package com.example.warehouse.resource;

import com.example.warehouse.model.Product;
import com.example.warehouse.repository.ProductRepository;
import jakarta.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WarehouseResource {

    @Inject
    ProductRepository productRepository;

    @GET
    public Response getAllProducts() {
        return Response.ok(productRepository.listAll()).build();
    }

    @POST
    public Response createProduct(Product product) {
        productRepository.persist(product);
        return Response.status(Response.Status.CREATED).entity(product).build();
    }
}
