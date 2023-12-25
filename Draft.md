подключиться к бд из контейнера
docker exec -it d59c7fa3e062 bash
psql --username=postgres --dbname=postgres
Эта команда запустит нам контейнер PostgreSQL в фоновом (detached) режиме и присвоит ему имя sample:
docker run --name users -p 5432:5432 -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=users -d postgres:11-alpine 


 ;-)