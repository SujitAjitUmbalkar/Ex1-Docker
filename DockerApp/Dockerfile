
# Stage 1 : Build the Spring Boot application

# Maven image with JDK 21
FROM maven:3.9.11-eclipse-temurin-21 AS builder

# Create and switch to /app
WORKDIR /app

# Copy the complete Spring Boot project
COPY . .

# Docker executes Maven and creates the JAR
RUN mvn clean package -DskipTests

# Stage 2 : Create lightweight runtime image

# JRE only (smaller than JDK)
FROM eclipse-temurin:21-jre

# Working directory
WORKDIR /app

# Copy ONLY the generated JAR from the builder stage
COPY --from=builder /app/target/DockerApp-0.0.1-SNAPSHOT.jar app.jar

# Application listens on port 8080
EXPOSE 8080

# Start the Spring Boot application
ENTRYPOINT ["java","-jar","app.jar"]