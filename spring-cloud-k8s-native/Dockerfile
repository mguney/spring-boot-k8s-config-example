FROM amazoncorretto:21

WORKDIR /app

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springkubernetes.jar


VOLUME /app/config

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar springkubernetes.jar"]