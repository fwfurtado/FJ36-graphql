run/server: package
	@ java -jar target/*.jar

package:
ifdef skip_tests
	@ ./mvnw clean package -DskipTests
else
	@ ./mvnw clean package
endif