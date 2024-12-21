# Use a base image with Java installed
FROM openjdk:18

# Set the working directory in the container
WORKDIR /src

# Copy the compiled JAR file from target directory to the container
COPY target/microservice1.jar /app/microservice1.jar

# Expose the port that the microservice listens on
EXPOSE 8081

# Command to run the microservice when the container starts
CMD ["java", "-jar", "microservice1.jar"]
