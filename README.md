
# 🧾 Desafio CRUD de Clientes

Este projeto é um **CRUD completo de clientes**, desenvolvido como parte de um desafio prático para reforçar os conhecimentos em **Java**, **Spring Boot** e **JPA/Hibernate**. A aplicação permite criar, listar, atualizar e remover registros de clientes, com validações e boas práticas de arquitetura REST.

## 🚀 Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2-4479A1?style=for-the-badge&logo=h2&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

## 🧠 Conceitos Aplicados

- RESTful API básica
- Validações com Bean Validation
- Tratamento global de exceções com `@ControllerAdvice`
- Padrão DTO (Data Transfer Object)
- Acesso a banco de dados com Spring Data JPA
- Banco em memória H2 para testes e desenvolvimento

## 📬 Endpoints Principais

| Método | Rota              | Descrição                           |
|--------|-------------------|-------------------------------------|
| GET    | /clients          | Lista paginada de todos os clientes |
| GET    | /clients/{id}     | Busca cliente por ID                |
| POST   | /clients          | Cria novo cliente                   |
| PUT    | /clients/{id}     | Atualiza cliente existente          |
| DELETE | /clients/{id}     | Deleta cliente                      |

> 💡 Os dados de entrada são validados conforme previsto nos requisitos do desafio como `@NotBlank`, `@NotNull`, `@PastOrPresent`.

## 📈 Exemplo de Requisição (POST)

```json
POST /clients
Content-Type: application/json

{
    "name": "Maria Silva",
    "cpf": "12345678901",
    "income": 6500.0,
    "birthDate": "1994-07-20",
    "children": 2
}
```

## 👨‍💻 Autor

Desenvolvido por **José Froes**  
🔗 [LinkedIn](https://www.linkedin.com/in/josepaulofroes/)  
🐱 [GitHub](https://github.com/jfroes)

