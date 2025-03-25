# Use the official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/courseApp.jar app.jar

# Run the JAR file when the container starts
CMD ["java", "-jar", "app.jar"]
