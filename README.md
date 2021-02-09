# portal-artesanato-backend
Projeto com objetivo de estudos e aprendizado de novas linguagens.


# Técnologias/Frameworks e  ferramentas envolvidas
- Spring boot
- Gradle
- Kotlin
- Flyway


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

# Migrations / Banco de dados

Criar o banco de dados MySQL com usuário, senha e schema definidos na configuração do flyway (build.grade.kts)

Executar a aplicação normalmente ou task flyway.migrate do gradle