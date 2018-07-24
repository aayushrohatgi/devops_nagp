FROM tomcat

MAINTAINER Aayush Rohatgi

RUN wget -O /usr/local/tomcat/webapps/demosampleapplication.war --user admin --password admin http://10.127.126.113:8081/artifactory/aayushrohatgi_artifactory_nagp_4630/com/nagarro/devops-tools/devops/demosampleapplication/1.0.0-SNAPSHOT/demosampleapplication-1.0.0-SNAPSHOT.war

CMD ["run"]
ENTRYPOINT ["/usr/local/tomcat/bin/catalina.sh"]
EXPOSE 8080