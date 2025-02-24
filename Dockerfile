# Use an official Tomcat image
FROM tomcat:9-jdk11-openjdk-slim

# Set environment variables (optional, for customizing Tomcat port)
ENV CATALINA_HOME /usr/local/tomcat

# Copy the WAR file into the Tomcat webapps directory
COPY target/EmployeeManagementSystem.war $CATALINA_HOME/webapps/ROOT.war

# Expose the port that Tomcat runs on (default is 8080)
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
