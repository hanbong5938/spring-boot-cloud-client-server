# spring-boot-cloud-client-server
spring boot cloud client server

Spring cloud config 파일 정보를 불러오는 일반적인 서버



2.4 이전에는 client 에 bootstrap.yml를 우선 순위로 사용하였으나 현재는 사용하지 않는다.

application.yml

```
spring:
  config:
    import: "optional:configserver:http://localhost:8888"
```    

configserver: url 없이 "optional:configserver:" 라고만 적으면 localhost:8888 이 default 로 지정되게 된다.

 "optional:" 사용하지 않으면 config server 에 붙지 못했을때 client 가 뜨지 않는다. optional 이 붙어있으면 config server 에서 응답을 받지 못해도 client 애플리케이션은 구동된다. 
 

optional 대신 spring.cloud.config.uri 사용할 수 도 있다.

Config server 우선 순위
![img](https://user-images.githubusercontent.com/51283645/144939704-cb032860-17b6-4379-8523-2698f7d75f34.png)
