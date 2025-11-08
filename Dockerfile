#Stage1: To build the application
FROM eclipse-temurin:21-jdk-jammy AS builder

#Set the working directory inside the container
WORKDIR /app

# Install the Apache Maven build tool
# Update package lists and install Maven without recommended packages to keep the layer small
RUN apt-get update && apt-get install -y --no-install-recommends maven && rm -rf /var/lib/apt/lists/*
#Copy the project object model(pom) file from host to container's WORKDIR(/app)
COPY pom.xml .
#Download project dependencies
RUN mvn dependency:go-offline -B
#copy the application source code
COPY src ./src
#package the spring boot app into a JAR file
RUN mvn clean package -Dmaven.test.skip=true

#Stage2 is to build a production ready image
#setting up the run time environment
FROM eclipse-temurin:21-jre-jammy
#set the working directory inside the container
WORKDIR /app

#Copy the final executable JAR file from the builder stage's target directory
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8090
# Define the command to run the application whn the container starts
ENTRYPOINT ["java","-jar","app.jar"]