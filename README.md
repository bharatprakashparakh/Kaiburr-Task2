# Swagger CodeGen
Task2 : Kaiburr Task2

# Project Title

The project is about REST API implementation in Java and  using Swagger Dependencies in SpringBoot framework.It helps developers design, build, document, and consume RESTful web services.The application provides a REST API with endpoints for searching,creating ,deleting and updating “server” objects. The variety of Software Platforms are available as a resource on the server side.The REST API are created and client can request for a resource over this URL. 

## Getting Started

1.git clone https://github.com/bharatprakashparakh/Kaiburr-Task2.git

### Prerequisites

* Downlaod Java version 1.8
* Downlaod SpringToolSuite version 4.6.0
* Downlaod Apache Tomcat Server 8.5
* Install Postman REST Client
* Downlaod Mongo Database 4.2.5


## Running the tests

* Run the mongod server at port 27017 using "mongod command"
* Add a Swagger2 dependency in spring tool suite
   <dependency>
   <groupId>io.springfox</groupId>
   <artifactId>springfox-swagger2</artifactId>
   <version>2.9.2</version>
  </dependency>
* Enable Swagger in your code through the @EnableSwagger2 annotation
* Run the platform-api-data/src/main/java/io/glacier/PlatformApiDataApplication.java as JavaApplication.
* Open Postman and send client request to REST API.

### Break down into end to end tests

* Now Swagger is ready to generate documentation .Verify that Swagger is running by creating a request to
  http://localhost:8080/v2/api-docs
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/apidocs1.PNG)
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/apidocs2.PNG)
  
  The result is a JSON response with a large number of key-value pairs.
  
  * Add the dependency in pom.xml file for Swagger Ui
     <dependency>
   <groupId>io.springfox</groupId>
   <artifactId>springfox-swagger-ui</artifactId>
   <version>2.9.2</version>
</dependency>
  
 * Get the Swagger UI using http://localhost:8080/swagger-ui.html#/
 
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/swagget-ui1.PNG)
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/swagger-ui2.PNG)
  
  * Interact with Swagger UI with following ways-

* **Find all platforms available.[GET Request]**

![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getfinal.PNG)

* **Create a platform by mentioning platform object details.[POST Reuest]**

  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/post1.PNG)

  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/post2.PNG)

* **Find a Platform by mentioning Id in URL[GET Request]**

  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getid1.PNG)
 
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getid2.PNG)
  
 * **Returns an error as response if platform with given id is not present in list.**
 
   Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getiderror1.PNG)
 
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getiderror2.PNG)
  
* **Find a platform by mentioning name in URL[GET Request]**

   Get a single platform as output . 
  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getname1.PNG)
 
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getname2.PNG)
  
  Get a list of Platform with mentioned name
  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getnamelist1.PNG)
 
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getnamelist2.PNG)

* **Returns an error as response if platform with given name is not present in list[GET Request]**

  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getnameerror1.PNG)
 
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/getnameerror2.PNG)
 
* **Update a platform with given details [PUT]**
  
 Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/post1.PNG)
 
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/post2.PNG)
  
* **Delete a platform with given Id. [DELETE]**
  
  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/delete1.PNG)
 
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/delete2.PNG)
  
  * **Collection in a Mongo Database**
   
     ![](https://github.com/bharatprakashparakh/Kaiburr-Task2/blob/master/Images/Swagger%20Outputs/mongod.PNG)
  

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* Swagger


## Contributing

Contributions are welcome.

 ## Author

* **Bharat Prakash Parakh** 



