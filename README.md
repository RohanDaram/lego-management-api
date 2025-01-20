# lego-management-api
A Spring Boot-based REST API for managing LEGO collections. It allows users to retrieve, update, and delete LEGO sets, making it easier to organize and track LEGO sets.

The code in this branch of the project uses an in-memory H2 database to store LEGO set data, improving upon the earlier cache version of the project.

## How to run this project

### Prerequisites
- Java
- Maven
- Spring Boot Dependencies which are already included within the project

### Running the Application
Use Maven Spring Boot plugin to run this project

```bash
mvn spring-boot:run
```
This above command will start the Spring Boot application and the API will be accessible at
```bash
http://localhost:8080/lego-management/api/v1/
```
Note: You need to append a valid mapping at the end of the above url which can be found in the ```LegoSetController.java``` class

### H2 In-Memory Database
This project uses an H2 in-memory database, which is automatically created when the application starts. Since it’s an in-memory database, all data will be lost when the application stops.

You can access the H2 console to view or make changes to the database by accessing the following URL:

```http://localhost:8080/lego-management/api/v1/h2-console```

Default Username:
```user```

Default Password:
```password```

### How to Test
You can use tools like [Postman](https://www.postman.com/downloads/) or ```cURL``` to interact with the API endpoints.

#### Running the GET Endpoint of the API
You will need to navigate to the following URL using any tool of your choice:
```bash
http://localhost:8080/lego-management/api/v1/legosets
```
This retrieves all the LEGO sets stored in the database and should result in the following output:
```bash
[
    {
        "name": "LEGO Millennium Falcon",
        "setNumber": 75192,
        "pieceCount": 7541,
        "releaseDate": "2017-09-01",
        "retirementDate": "2022-12-31",
        "targetAge": 16,
        "theme": "Star Wars",
        "price": 799.99,
        "numMinifigures": 7,
        "licensed": true
    },
    {
        "name": "LEGO Hogwarts Castle",
        "setNumber": 71043,
        "pieceCount": 6020,
        "releaseDate": "2018-09-01",
        "retirementDate": "2023-12-31",
        "targetAge": 16,
        "theme": "Harry Potter",
        "price": 469.99,
        "numMinifigures": 4,
        "licensed": true
    },
    {
        "name": "LEGO Technic Bugatti Chiron",
        "setNumber": 42083,
        "pieceCount": 3599,
        "releaseDate": "2018-06-01",
        "retirementDate": "2022-12-31",
        "targetAge": 16,
        "theme": "Technic",
        "price": 349.99,
        "numMinifigures": 0,
        "licensed": true
    },
    {
        "name": "LEGO Tree House",
        "setNumber": 21318,
        "pieceCount": 3036,
        "releaseDate": "2019-08-01",
        "retirementDate": "2023-07-31",
        "targetAge": 12,
        "theme": "Ideas",
        "price": 199.99,
        "numMinifigures": 4,
        "licensed": false
    },
    {
        "name": "LEGO NASA Apollo Saturn V",
        "setNumber": 21309,
        "pieceCount": 1969,
        "releaseDate": "2017-06-01",
        "retirementDate": "2020-12-31",
        "targetAge": 14,
        "theme": "Ideas",
        "price": 119.99,
        "numMinifigures": 0,
        "licensed": true
    }
]
```
