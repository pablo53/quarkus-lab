# quarkus-lab
Experiments with Quarkus framework - a laboratory project.

### Building the application

   ```
   ./gradlew build
   ```

### Starting the application

1. In Dev mode:
   
   In shell, type
   ```
   ./gradlew :quarkusDev
   ```
   Next, open e.g. `http://localhost:28080/api/diag/echo/HelloWorld?username=Pablo`

2. In Prod mode:
   
   In shell, type
   ```
   java -jar build/quarkus-app/quarkus-run.jar
   ```
   Next, open e.g. `http://localhost:8080/api/diag/echo/HelloWorld?username=Pablo`
   Note, however, that this is advisable to create a docker image for production version.
