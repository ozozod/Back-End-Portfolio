FROM amazoncorretto:11-alpine-jdk
MAINTAINER DaJ
COPY target/dj-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]