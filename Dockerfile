# Build Stage
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .   # Copy only the pom.xml first to leverage Docker caching
RUN mvn dependency:go-offline  # Pre-fetch dependencies for faster builds
COPY src ./src  # Copy the source files
RUN mvn clean package -DskipTests

# Run Stage
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=build /app/target/productstore-0.0.1-SNAPSHOT.jar productstore.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "productstore.jar"]

