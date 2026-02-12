FROM maven:3.8.6-openjdk-11-slim AS build

WORKDIR /app

# Copy pom.xml files for dependency resolution
COPY pom.xml .
COPY cloud-sdk/pom.xml cloud-sdk/
COPY sample/pom.xml sample/

# Download dependencies (better caching)
RUN mvn dependency:go-offline -B || true

# Copy source code
COPY cloud-sdk/src cloud-sdk/src
COPY sample/src sample/src

# Build the application
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:11-jre

WORKDIR /app

# Copy the built JAR from build stage
COPY --from=build /app/sample/target/*.jar app.jar

# Expose port
EXPOSE 6789

# Run the application
CMD ["java", "-jar", "app.jar"]