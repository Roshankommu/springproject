
# Use an official Java runtime as a parent image
FROM openjdk:17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the project JAR file to the container
COPY target/contact-app-0.0.1-SNAPSHOT app.jar

# Expose the port that your application runs on
EXPOSE 9091

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
