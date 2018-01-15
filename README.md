# SampleWebApp

This is a sample spring boot application built using maven.

#### Required tools to run
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](https://maven.apache.org/download.cgi)
* [Git](https://git-scm.com/downloads)
* [Tomcat](https://tomcat.apache.org/download-80.cgi)

### A note before running the application 
   - Ensure `JAVA_HOME` environment variable is set and points to your JDK installation.
   - Ensure that the bin directory of the apache-maven installed on you machine is added to the `PATH` environment variable.
   - You could verify both of these by running the command `mvn -v` on your terminal/command prompt. This should show your maven and java version installed on your machine
   
## How to run?
#### 1. Clone this repository
 - Run the command: `git clone https://github.com/Pradeep-525512/SampleWebApp`
 
#### 2. Use Maven to build the application
- Navigate to the folder where the rpository was cloned and look for the directory with pom.xml 
- Then run the command: `mvn clean package`

#### 3. Deploy your application in the tomcat container.
- Copy your war file(samplewebapp.war) from the target folder where the application was built.
- Navigate to your tomcat installation directory and place the war file under the webapps folder.
- Restart your Tomcat.

**Application will now be available at : http://localhost:8080/samplewebapp/**


