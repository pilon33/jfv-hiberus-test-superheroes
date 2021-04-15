
## W2M - Hiberus : Spring boot , Maven , Java 11 , Flyway, H2,Exception Handling, Spring Security , Spring JPA,Spring Cache , Swagger , Docker,Lombok ,Junit.

### Sr Developer José Francisco valdez 
 Linkedin https://www.linkedin.com/in/jose-francisco-valdez-282a1b1a/

## How it works:
## 1- Runs as Spring boot app.


### Clone the repository:
1) git clone https://github.com/pilon33/jfv-hiberus-test-superheroes.git


2) Update maven project  
3) Build project 
4) Runs As --> Spring Boot App 


###  Swagger UI:


![image](https://user-images.githubusercontent.com/12847173/114819090-45b25300-9d93-11eb-9a54-a2101b7789cd.png)






### GET request Input List

* Example: curl -X GET "http://localhost:8080/api-challenge/inputList/getSexo-H  "accept: */*"

* Example: curl -X GET "http://localhost:8080/api-challenge/inputList/getOrigenesPoder "accept: */*"


### PUT request to    `/api-challenge/superheroes/admin/actualizarSuperHereo

* Example: curl -X PUT "http://localhost:8080/api-challenge/superheroes/admin/actualizarSuperHereo" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"edad\": 34, \"id\": 4, \"nombre\": \"rwer\", \"origenPoderId\": 1, \"profesion\": \"rt\", \"puedeVolar\": \"r\", \"sexoId\": 1}"


### GET request to `/super-heroes/name-like/{name}

* Example: curl -X GET "http://localhost:8080/api-challenge/super-heroes/name-like/man" -H  "accept: */*"


### DELETE request to `/superheroes/admin/eliminarSuperHereo/{id} 

* Example: curl -X DELETE "http://localhost:8080/superheroes/admin/eliminarSuperHereo/2" -H "accept: */*"


### GET request to `/super-heroes/name-like/{name}

* Example: curl -X GET "http://localhost:8080/superheroes/getSuperHeroes" -H "accept: */*"


## 2- Run Test from Image Docker Hub :
  
* docker pull jfvadez/jfv-challenge-hiberus-docker-img

* docker run -p 8080:8080 jfvadez/jfv-challenge-hiberus-docker-img


![image](https://user-images.githubusercontent.com/12847173/114819353-bfe2d780-9d93-11eb-9f21-2487eeef16c6.png)



## 3- Credentials :


### Authentication --> rol admin : admin/pass  --> rol user : user/pass


### H2 --> /h2-console 

* username=sa

* password=sa


### script bd --> /jfv-hiberus-test-superheroes/src/main/resources/db/migration

