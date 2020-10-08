FROM maven:3.6-jdk-11 AS build
COPY pom.xml /home/app/pom.xml
RUN ls /home/app
RUN mvn -f /home/app/pom.xml verify clean --fail-never
COPY src /home/app/src
RUN mvn -f /home/app/pom.xml  package 

FROM openjdk:11-jre-slim
VOLUME /tmp 
COPY --from=build /home/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

