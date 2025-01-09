#
#
#
## mvn spring-boot:run -Dspring-boot.run.profiles=local
#
##Spring Boot Profiles
##https://zetcode.com/springboot/profile/
#
#
##production
##staging
##workstation
#
#run : ;\
#	java -Dspring.profiles.active=workstation -jar target/spring-boot-jsp.war ;\
#
##	echo "$!"
##awk '{print $2}'
##jobs -p
#
#test : ;\
#	echo ; curl -D- localhost:7777/spring-boot-jsp/book/viewBooks ; echo ; echo ;\
#	curl -D- localhost:7777/spring-boot-jsp/stuff/viewStuff ; echo ; echo
#
#test2 : ;\
#	echo ; curl -D- localhost:7777/spring-boot-jsp/v1 ; echo ; echo ;\
#	curl -D- localhost:7777/spring-boot-jsp/v1/ -u 'allo:bobo' ; echo ; echo
#
#rtest : ;\
#	echo ; curl -D- https://philippeduval.ca/manoj/book/viewBooks ; echo ; echo ;\
#	curl -D- https://philippeduval.ca/manoj/stuff/viewStuff ; echo ; echo
#
#rtest2 : ;\
#	echo ; curl -D- https://philippeduval.ca/manoj/v1 ; echo ; echo ;\
#	curl -D- https://philippeduval.ca/manoj/v1/ -u 'allo:bobo' ; echo ; echo
#
#build : ;\
#	mvn package
#
#deploy : ;\
#	scp  target/spring-boot-jsp.war root@philippeduval.ca:./target/spring-boot-jsp.war
#
#list : ;\
#    grep -e '^[^#[:space:]].*:' makefile
#
#stop : ;\
##	kill -HUP 9999
#

full-toute : ;\
	mvn clean install test

