FROM openjdk:17-jdk-slim as build

WORKDIR /app
RUN apt-get update && apt-get install -y maven
COPY pom.xml /app/pom.xml
COPY . /app/
RUN mvn dependency:go-offline

COPY src /app/src

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/order-service-1.0-SNAPSHOT-runner.jar /app/order-service.jar

CMD ["java", "-jar", "/app/order-service.jar"]
