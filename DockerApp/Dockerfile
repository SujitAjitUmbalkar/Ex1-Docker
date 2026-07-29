# Base Image
# Download a lightweight Linux image that already has Java 21 installed.
FROM eclipse-temurin:21-jdk

# Create and switch to /app directory inside the container.
# All following commands execute from here.
WORKDIR /app

# Copy the JAR from your local project into the container.
# Source (local): target/DockerApp-0.0.1-SNAPSHOT.jar
# Destination (inside container): /app/app.jar
COPY target/DockerApp-0.0.1-SNAPSHOT.jar app.jar

# Inform Docker that this application listens on port 8080.
# (Documentation only; it doesn't actually publish the port.)
EXPOSE 8080

# Command executed when the container starts.
ENTRYPOINT ["java", "-jar", "app.jar"]