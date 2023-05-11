FROM amazoncorretto:11-alpine-jdk
MAINTAINER DJ
COPY target/dj-0.0.1-SNAPSHOT.jar dj-app.jar
ENTRYPOINT ["java","-jar","/dj-app.jar"]