FROM logstash

ADD logstash-spring-boot.conf /conf/logstash-spring-boot.conf

EXPOSE 5043

ENTRYPOINT ["logstash", "-f", "/conf/logstash-spring-boot.conf"]