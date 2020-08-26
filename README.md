# Score-example-hystrix
 example-hystrix
 


1) URL do projeto que gera o score : 
http://localhost:8080/getPersonDetailsForGroup/PF

2) URL do projeto que consulta o score (gerador do circuit break)
http://localhost:8081/getPersonScoreByGroup/PF

3) URL do monitor
http://localhost:8081/hystrix

> Entrar no monitor com a seguinte URL : http://localhost:8081/actuator/hystrix.stream

> Docs do hystrix command : https://github.com/Netflix/Hystrix/wiki/Configuration#execution.timeout.enabled


![hystrix stream](https://user-images.githubusercontent.com/45246027/89957596-33818300-dc0e-11ea-8929-429162550666.jpg)
