FROM maven:3.8.1-openjdk-17-slim AS build

WORKDIR /app

# Копируем родительский pom.xml из родительской директории
COPY ../pom.xml /app/

# Копируем pom.xml для warehouse-service
COPY pom.xml /app/warehouse-service/

# Копируем исходный код проекта
COPY src /app/src/
RUN mvn dependency:go-offline


RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/warehouse-service-1.0-SNAPSHOT-runner.jar /app/warehouse-service.jar

CMD ["java", "-jar", "/app/warehouse-service.jar"]
