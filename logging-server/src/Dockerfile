FROM java:8

VOLUME /tmp
ADD logging-server.jar logging-server.jar
RUN bash -c 'touch /logging-server.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar","/logging-server.jar"]