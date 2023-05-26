FROM amazoncorretto:11-alpine-jdk
MAINTAINER hr
COPY target/hr-0.0.1-SNAPSHOT.jar  hr-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/hr-app.jar"]
