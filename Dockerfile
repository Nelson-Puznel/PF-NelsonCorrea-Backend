from amazoncorretto:11-alpine-jdk
MAINTAINER Correa Nelson
COPY target/CorreaNelson-0.0.1-SNAPSHOT.jar cn-app.jar
ENTRYPOINT ["java","-jar","/cn-app.jar"]
