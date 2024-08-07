# Use the OpenJDK 17 JDK slim image as the base image
FROM openjdk:17-jdk-slim

# Copy the JAR file from the target directory to the /app directory in the container
COPY target/backend-cours-maths-pc-0.0.1-SNAPSHOT.jar /app/backend-cours-maths-pc.jar

# Set the working directory to /app
WORKDIR /app

# Expose port 8080
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "backend-cours-maths-pc.jar"]
