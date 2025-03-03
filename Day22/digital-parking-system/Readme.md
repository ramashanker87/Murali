## Build Application

    mvn clean install

## Start localstack docker

    docker-compose up

## Start Parking

    curl -X POST "http://localhost:8082/parking/start?parkingNumber=12345" \
     -H "Content-Type: application/json" \
     -d '{
          "ownerName": "Murali Adennagari",
          "registrationNumber": "AP-03-CS-0054",
          "modelNumber": "ROYAL ENFIELD CLASSIC 350",
          "fuelType": "PETROL BS4"
        }'


##  End Parking 

    curl -X DELETE "http://localhost:8082/parking/end?parkingNumber=12345"


## check queues in Rabbit MQ  - 

    http://localhost:15672/#/queues
 
## run and check data in mysql

    docker exec -it <container id> bash

    mysql -u user -p

## password
    password

    show databases;
    use parking;

    select * from car;
    select * from parking_start;
    select * from parking_end;

## Dockerization

    docker build -t digital-parking-system .

## List docker images

    docker images

## Start and run both container same time

    docker-compose up

## Stop docker container

    docker-compose down


