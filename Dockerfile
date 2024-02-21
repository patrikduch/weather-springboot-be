# Use the OpenJDK image that matches the JDK version used for building
FROM openjdk:21-jdk
EXPOSE 8080

# Copy the built JAR from the Gradle build stage into this image
COPY /build/libs/WeatherSpringBootBE-1.0.0-SNAPSHOT.jar /WeatherSpringBootBE-1.0.0-SNAPSHOT.jar

# Define the entrypoint or command to run the application
CMD ["java", "-XshowSettings:vm", "-XX:+UnlockExperimentalVMOptions", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/SpringBootCorsTemplate-1.0.0-SNAPSHOT.jar"]