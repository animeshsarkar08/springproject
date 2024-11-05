FROM maven:3.8.3-openjdk-7 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/productstore-0.0.1-SNAPSHOT.jar productstore.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","productstore.jar"]
