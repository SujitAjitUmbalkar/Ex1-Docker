## Base Image
## Download a lightweight Linux image that already has Java 21 installed.
#FROM eclipse-temurin:21-jdk
#
## Create and switch to /app directory inside the container.
## All following commands execute from here.
#WORKDIR /app
#
## Copy the JAR from your local project into the container.
## Source (local): target/DockerApp-0.0.1-SNAPSHOT.jar
## Destination (inside container): /app/app.jar
#COPY target/DockerApp-0.0.1-SNAPSHOT.jar app.jar
#
##EXPOSE tells Docker which port the application inside the container listens on.
##It does NOT publish the port to your host machine.
##(Just tells others: "Application listens here")
##"This image expects the application to listen on port 8080."
#EXPOSE 8080
#
## Command executed when the container starts.
#ENTRYPOINT ["java", "-jar", "app.jar"]


#for pushing purpose only we are using small image
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY target/DockerApp-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]