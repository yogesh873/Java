FROM adoptopenjdk:11-jdk-openj9
MAINTAINER ykyogeshkumar873@gmail.com

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH
RUN mkdir -p "$CATALINA_HOME"
WORKDIR $CATALINA_HOME

COPY target/*.war /usr/local/tomcat/webapps/config.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
