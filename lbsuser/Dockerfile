FROM java:8-jdk-alpine
COPY target/lbsuser-0.0.1-SNAPSHOT.war /usr/library/
WORKDIR /usr/library
EXPOSE 5556
ENTRYPOINT ["java", "-jar", "lbsuser-0.0.1-SNAPSHOT.war"]
