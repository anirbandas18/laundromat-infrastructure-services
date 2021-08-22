mvn clean package -DskipTests -Ddockerfile.skip -e

# mvn clean package -Ddockerfile.skip -e

# mvn spring-boot:run -Ddockerfile.skip -e

# mvn surefire-report:report -e

# mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -DskipTests -Ddockerfile.skip -e

# hoverfly.exe -pp 1080 -webserver