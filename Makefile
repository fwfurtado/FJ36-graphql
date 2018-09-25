run/server: package
	@ java -jar target/*.jar

package:
ifdef skip_tests
	@ ./mvnw clean package -DskipTests
else
	@ ./mvnw clean package
endif


run/database:
	@ docker-compose -f src/main/resources/docker-compose.yml up -d

stop/database:
	@ docker-compose -f src/main/resources/docker-compose.yml down -v
