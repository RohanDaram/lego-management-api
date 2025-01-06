# Use OpenJDK 17 as the base image, with a slim variant for smaller image size
FROM openjdk:17-jdk-slim

# Set the working directory inside the container to /app
WORKDIR /app

# Update package lists, install curl, and then clean up temporary files to reduce image size
RUN apt-get update && apt-get install -y curl && apt-get clean

# Copy the Spring Boot JAR file from the local target directory into the container's /app directory
COPY ./target/lego-management-api-1.0.0-SNAPSHOT.jar .

# Set the entrypoint to run the Spring Boot application using the copied JAR file
ENTRYPOINT ["java", "-jar", "/app/lego-management-api-1.0.0-SNAPSHOT.jar"]
