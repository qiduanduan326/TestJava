FROM testJenkins3

ADD ./pom.xml pom.xml
ADD ./src src/

RUN mvn clean package

FROM openjdk:11

COPY --from=builder target/Java_Devops_Demo-1.0-SNAPSHOT.jar /app/app.jar

WORKDIR /app

ENV JAVA_OPTS=""
EXPOSE 8088

ENTRYPOINT java ${JAVA_OPTS} -jar app.jar
