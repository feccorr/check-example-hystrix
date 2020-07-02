# Score-example-hystrix
 example-hystrix


1)URL do projeto que gera o score : 
http://localhost:8080/getPersonDetailsForGroup/PF

2)URL do projeto que consulta o score (gerador do circuit break)
http://localhost:8081/getPersonScoreByGroup/PF

3)URL do monitor
http://localhost:8081/hystrix
-Entrar como http://localhost:8081/actuator/hystrix.stream
