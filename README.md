Проект для практикума
---
Применяемые технологии: Spring Boot, PostgreSQL
***
# Deployment
Создать бд 'users' через интерфейс или через докер как показано ниже
```shell
docker run --name users -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=users -d postgres:11-alpine
```
Установить мавен(если есть то пропустить этот пункт)
```shell
sudo apt-get install maven
```
Собрать исполняемый файл jar
```shell
mvn -f pom.xml clean package -D  maven.test.skip=true
```
Запустить приложение 
```shell
java -jar target/soft-0.0.1-SNAPSHOT.jar --status=running
```


API information
---

**Show users: `GET /api/user`**

* **URL**

  `/api/user`

* **Method**

  `GET`

* **URL Params**

  None

* **Data Params**

  None

* **Success Response**

    * **Code:** 200 <br />
      **Content:**

      ```[{"id": 1,"username": "user123", "email": "user@example.com","password_hash": "example"}]```

* **Error Response**

  None

* **Sample Call**

```shell
curl -i -X GET http://127.0.0.1:5001/api/user
```
**Create user: `POST /api/user`**

* **URL**

  `/api/user`

* **Method**

  `POST`

*  **URL Params**

   None

* **Data Params**

  JSON with required fields: `username`, `email`, `password_hash`

* **Success Response**

    * **Code:** 200 <br />
      **Content:** `{ "id" : 12, "username" : "user123",  "email": "user@example.com", "password_hash": "example"}`

* **Error Response**

    * **Code:** 400 Bad Request <br />
      **Content:** `validate error`

* **Sample Call**

```shell
curl -i -X POST http://127.0.0.1:5001/api/user -H 'Content-Type: application/json' -d '{"email":"user@example.com" ,"password_hash":"password_hash"}'
```

License
---

MIT / BSD

Author Information
---

This app was created in 24.12.2023 by [Egor](https://github.com/Egor18032019).


 