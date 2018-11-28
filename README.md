# Spring Boot Docker demo

Run

````console
$ docker network create networth
$ docker container run --network networth --name disney -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=duffy -d mysql:5
$ mvn clean package
$ docker image build -t docky2 .
$ docker container run -d -p8183:8183 --network networth --name webapp --rm docky2
````