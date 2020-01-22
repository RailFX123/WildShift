FROM jboss/wildfly
 
# Maintainer
MAINTAINER "David Natareno" "eduardo.natareno@claro.com.gt"
 
# Create user jota with password jota1234
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin2020 --silent
 
# Add custom configuration file
#ADD standalone.xml /opt/jboss/wildfly/standalone/configuration/
 
# Add example.war to deployments
ADD target/redhat-1.0-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/
 
# JBoss ports
EXPOSE 8080 9990 8009
 
# Run
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-c", "standalone.xml"]