# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app/sqms

# Copy the application JAR file to the working directory
COPY target/sqms.jar sqms.jar

# Expose the application port
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "sqms.jar"]