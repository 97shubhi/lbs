FROM java:8-jdk-alpine
COPY target/eureka-0.0.1-SNAPSHOT.war /usr/library/
WORKDIR /usr/library
EXPOSE 5556
ENTRYPOINT ["java", "-jar", "eureka-0.0.1-SNAPSHOT.war"]
