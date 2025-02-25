# Use an official JDK image as a parent image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Build the application (only needed if you're using Maven or Gradle)
RUN ./mvnw package

# Run the application
CMD ["java", "-jar", "target/contact-app-0.0.1-SNAPSHOT.jar"]

# Expose port 8080
EXPOSE 9091
