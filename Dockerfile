FROM openjdk:8-jdk-alpine

MAINTAINER Jean-Marc Robin "jmrobin2pi@gmail.com"

WORKDIR /usr/local/bin

COPY ./target/docky2-0.0.1-SNAPSHOT.jar webapp.jar

EXPOSE 8183

CMD ["java", "-Dspring.profiles.active=docker", "-jar", "webapp.jar"]