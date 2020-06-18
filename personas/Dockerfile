FROM openjdk:11-jre
COPY ./target/personas-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch personas-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","personas-0.0.1-SNAPSHOT.jar"]