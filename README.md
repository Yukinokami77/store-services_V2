Магазин: 
Реализовано 2 сервиса, каждый отвечающий за свою доменную область: 
  Сервис 1: Склад. Предназначен для предоставление информации о товарах их детализации, количестве. Позволяет добавлять, удалять, изменять информацию о товарах. 
  Сервис 2: Заказы. Предназначен для формирования заказов. Позволяет создавать заказы на основании позиций из сервиса склад, удалять ранее созданные заказы, просматривать состав заказа. 
  Для получения информации о позиции со склада осуществляется Rest вызов сервиса 1 
Переработанный store-services, прошлой версии с более понятной бизнес-логикой в рамках доменной области.
Проект не доделан, потому что постоянно вылезали маленькие ошибки и не хватило времени их доделать, так же не сделаны тесты. 
Также была проблема с pom.xml в корне, сборка не могла его найти.

Требования:
- Java 17
- Maven
- PostgreSQL

Запуск проекта
1. Клонируйте этот репозиторий: git clone https://github.com/Yukinokami77/store-services_V2.git
2. Перейдите в папку проекта и запустите:
   mvn clean install
   mvn quarks:dev
