FROM openjdk:11-jre
COPY ./target/eureka-server-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch eureka-server-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","eureka-server-0.0.1-SNAPSHOT.jar"]