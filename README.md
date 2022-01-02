# spring-boot-mongodb

https://www.mongodb.com/compatibility/spring-boot

##Spring Boot Integration with MongoDB Tutorial

MongoDB can connect to Spring Boot in two ways:
- the **MongoRepository** interface
- the **MongoTemplate** class. 

MongoRepository extends the CrudRepository interface that contains methods to perform basic CRUD operations. 

For writing custom queries and aggregations, and for a finer control over query filters, 
we can use the MongoTemplate class. MongoTemplate class implements interfaces that support operations like 

- **aggregation**
- **find** 
- **update**
- **upsert**
- **index**
- **remove**

and more.