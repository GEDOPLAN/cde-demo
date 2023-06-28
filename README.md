# Container Development Environment Demo

Diese Demo kann zur Nutzung in CDEs verwendet werden. Sie enthält eine Konfiguration für Gitpod auf Basis von einem JDK 17.

In den einzelnen Modulen ist sowohl ein JSE- als auch ein JEE-Beispiel enthalten. Zusätzlich kann über die JSE-Demo ein Unit-Test und ein Docker-Container innerhalb der CDE verwendet werden.

Das Projekt kann über ein `mvn clean install` gebaut werden. Es enthält eine `cde-base` die einen Service und eine Rest-Resource bereitstellt. Diese wird sowohl von der JSE- als auch der JEE-Demo verwendet.

## Java SE Demo

In dieser Demo wird eine Jakarta RESTful Resource über das SE-Bootstraping aus Jakarta EE 10 bereitgestellt. Als Implementierung kommt Resteasy inklusive Undertow und CDI zum Einsatz.

Darüber hinaus ist ein einfacher JUnit-Test enthalten, der eine simple String-Concetanation vornimmer. Der Test dient lediglich zur Demonstration der Testmöglichkeiten innerhalb der CDE.

Die Möglichkeit zur Nutzung von Docker innerhalb der CDE kann über das Dockerfile unter `src/main/docker` erfolgen. Hierzu muss zunächst der Docker-Build über `docker build -t gedoplan/jse-demo .` erfolgen. Anschließend kann dann der Container mit `docker run -p 8082:8081 gedoplan/jse-demo` gestartet werden.

## Jakarta EE Demo

In dieser Demo wird ebenfalls eine Jakarta RESTful Resource bereitgestellt. Diese kann entweder über Quarkus oder über eine Wildfly-Bootable-Jar gestartet werden. Hierzu sind entsprechende Maven-Profile vorhanden.
