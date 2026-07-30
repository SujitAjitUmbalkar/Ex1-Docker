FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/DockerApp-0.0.1-SNAPSHOT.jar app.jar

# Create user
RUN useradd -m dockeruser

# Switch user
USER dockeruser

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]