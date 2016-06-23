# example-javacode
A maven project containing some advance java code examples


```
mvn clean package

```

This sample also wraps a jetty server (embedded jetty). To access /ping API:
```
mvn clean package
java -jar target/example-javacode-0.1.jar; starts jetty server
curl http://localhost:4080/ping
```