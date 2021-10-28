# ProjetMS
# AppWebDistribuee
Projet application web distribuée.

SPRING BOOT MICROCSERVICE USING SPRING BOOT, NODEJS, EUREKA, ZUUL, DOCKER
This project is created to get experience on Microservices. This is a simple project for projects managment.

**There are seven microservices:**
- *Matieres*
- *Events* 
- *Clubs* 
- *Etudiants*
- *Authentification* 
- *Classes* 
- *Notes* 



### Gateways ###
 **Service	EndPoint**
- Matieres	/mlatiere-service/
- Events	/event-service/
- Clubs	/club-service/
- Etudiants	/etudiant-service/
- Authentification	/node-service/
- URI for gateway : http://localhost:8762
- Notes /note-service/
- Classes /classe-service/


### Build & Run ###

In repository /build/docker run :

- *>sudo ./deploy.sh* : build docker images and containers and run containers
- *>sudo ./clean.sh* : stop the dockerized services

**Each maven module has a Dockerfile.**

## In docker-compose.yml file:

 - *Matieres : 8080 port is mapped to 3000 port of host
 - *Equipment Service : 8700 port is mapped to 7501 port of host
 - *Events Service : 8090 port is mapped to 3002 port of host
 - *Clubs Service : 8085 port is mapped to 3001 port of host
 - *Authentification Service : 5000 port is mapped to 5000 port of host
 - *Eureka Discovery Service : 8761 port is mapped to 8761 port of host
 - *Zuul Gateway Service : 8762 port is mapped to 8762 port of host
 - Etudiants  : 8083 port is mapped to 3003 port of host

