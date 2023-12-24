подключиться к бд из контейнера
docker exec -it d59c7fa3e062 bash
psql --username=postgres --dbname=postgres
Эта команда запустит нам контейнер PostgreSQL в фоновом (detached) режиме и присвоит ему имя sample:
docker run --name users -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres:11-alpine 

* Проверить работоспособность;
```shell
curl -i -X GET http://127.0.0.1:5001/api/user
```
```shell
curl -i -X POST http://127.0.0.1:5001/api/user -H 'Content-Type: application/json' -d '{"username":"user12","email":"user@example.com" ,"password_hash":"password_hash"}'
```
echo "# devOps" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:Egor18032019/devOps.git
git push -u origin main