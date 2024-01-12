FROM amazoncorretto:21

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springkubernetes.jar

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar springkubernetes.jar"]