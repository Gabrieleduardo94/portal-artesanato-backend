# portal-artesanato-backend
Projeto com objetivo de estudos e aprendizado de novas linguagens.


# Técnologias/Frameworks e  ferramentas envolvidas
- Spring boot
- Gradle
- Kotlin


# Overview da Arquitetura

## Camadas
- Web: Controllers e ações do spring
- Application: Orquestrador de jobs/tarefas no dominio
- Domain: Local onde ocorrerá as regras de negocio
- Infrastructure: Local onde reside as chamadas externas (Acessos ao banco de dados, envio de emails, chamada de APIs externas)


# Executando 

**Linux/MacOS:**

 ```
./gradlew build 
 ```

**Windows:**

 ```
gradlew.bat build
 ```
