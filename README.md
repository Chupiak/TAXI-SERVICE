# Hello ! 
### Welcome to little web application "TAXI - SERVICE"   :)
![](https://image.freepik.com/free-vector/taxi-service-logo-template_1057-4799.jpg)
## We have 4 tables that we can manage in browser:
Driver | Car | Manufacturer | Cars_Drivers
--- | --- | --- | ---
name | model | name | car_id
licenseNumber | manufacturer_id | country | driver_id

## You get a small interface to control the basic functions of the taxi service. You can :
- **Register new driver**
- **Show all drivers**
- **Register new manufacturer**
- **Register new Car**
- **Adding driver to car**

## For start 
1. Create schema and tables as described in the file `init_db.sql`
2. Configure access to your database in class ConnectionUtil ![](https://i.imgur.com/6xASjwX.png)
3. let's install `Tomcat 9.0.50`. If you decide to install version 10 and above, you should use a different dependency for servlets and JSTL as well.
4. RUN application

## Technologies used :
- JAVA Core
- SQL Basic
- JAVA JDBC
- JSP
- JSTL
- DAO and Service layers
- Dependency injection
- Custom Exception
