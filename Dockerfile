FROM maven

COPY ./target/ /ultradir/

WORKDIR /ultradir/

RUN ls -la
CMD java -jar learn-springboot3-0.0.1-SNAPSHOT.jar
