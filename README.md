My application has not done to the finish, so I just send current version with description what has been done.
There are Liquibase migration scripts for creating database with all requirements and necessary settings for building application and running it by help of Docker.
In addition, there is necessary entities in terms of developed database using Hibernate.
In addition, I've introduced mapper and dto using Spring Data Jpa and developed base structure for application.
To run application by help of Docker the next steps are required:
1) git pull <master>
2) ./gradlew clean build
3) docker-compose build --no-cache
4) docker-compose up -d