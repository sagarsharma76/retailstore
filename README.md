# Retail Store Discounts


This program calculates the total payable amount after the various discounts components applied as per the below conditions: 
- If the user is an employee of the store, he gets a 30% discount
- If the user is an affiliate of the store, he gets a 10% discount
- If the user has been a customer for over 2 years, he gets a 5% discount.
- For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45
as a discount).
- The percentage based discounts do not apply on groceries
- A user can get only one of the percentage based discounts on a bill.

# Getting Started


These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
* **Prerequisites:**
    * Install the latest version of [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and    [Maven](https://maven.apache.org/download.html).
    * You may need to set your `JAVA_HOME`.
    * Setup [Sonar](https://docs.sonarqube.org/display/SONAR/Installing+the+Server). 
      - Test the local sonar installation by navigating to http://localhost:9000.
    * Download Spring Tool Suite Editor [STS](https://spring.io/tools/sts/all)

* **Setting up project:**
    * Clone the git repo
        ``` 
        https://github.com/sagarsharma76/retailstoreapp.git 
        ```
    * Download dependenices by executing the below command from project root folder
        ``` 
        mvn clean install
        ```    
    * Compile project and generate a jar file. 
        ``` 
        mvn clean package
        ```
        The jar file will be generated in target/ folder
    * Running the project locally 
        ```
        java -jar target/app-retailstorediscounts-1.0-SNAPSHOT.jar
        ```
        The program uses the sample data to run the program locally. Later input can be passed either by VXXcommand line as well or by converting into Spring Boot and exposing apis to pass the data.
# Running the tests

 * Tests can be run locally by running the following command from project root folder.
      ```
      mvn test
      ```
# Running Code Quality Reports
 * [Sonar](https://docs.sonarqube.org/display/SONAR/Get+Started+in+Two+Minutes) is used to do a static code analysis and generate test coverage reports. 

      ```
      mvn sonar:sonar
      ```
      After the successful execution of above command, SONAR report can be viewed locally from the below url
      ```
      http://localhost:9000/dashboard?id=com.retailstore%3Aretailstorediscounts
      ```
      Snapshot of SONAR report
      ![Alt text](/sonarreport/dashboard.png)
      ![Alt text](/sonarreport/coveragereport.png)

# Code Formatting rules
* Code formatting rules are placed at below location under project root directory. ```
   ```
    formattingrules/codeformattingrules.xml
   ```
To import these settings in your current workspace, click on Project -> Formatter -> Import- > Select xml file from above location. 

# UML Diagram
  * UML Diagram for the proposed solution is as below
  	![Alt text](/uml/RetailStoreupdated.png)
      
# CI/CD
 * I did not have much time to setup the CI/CD pipeline for the project. However i would have used the following to set it up.
    - JENKINS
    - DOCKER
    

## Authors

* **Sagar Sharma**

      

    
    

