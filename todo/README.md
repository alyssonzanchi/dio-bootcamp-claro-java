
# 📋 API de Gerenciamento de Tarefas

Este projeto é a resolução de um desafio que faz parte do Bootcamp Claro - Java com Spring Boot na [Digital Innovation One (DIO)](https://www.dio.me).

## 📖 Descrição do Projeto

O projeto consiste em uma API que permite o gerenciamento de tarefas, onde os usuários podem criar suas tarefas, definir prazos e acompanhar o status das mesmas. A aplicação utiliza uma arquitetura limpa e modular, garantindo a fácil manutenção e escalabilidade.

## ✨ Funcionalidades

- **Autenticação de Usuários**: Os usuários podem se autenticar para acessar seus dados de tarefas.
- **CRUD de Tarefas**:
  - **Criar Tarefa**: Os usuários podem criar novas tarefas fornecendo título, descrição e prazo.
  - **Atualizar Tarefa**: Permite a edição das informações de uma tarefa existente.
  - **Deletar Tarefa**: Remove uma tarefa do sistema.
  - **Listar Tarefas**: Visualização de todas as tarefas do usuário, com filtros por status ou prazo.
- **Associação de Usuário**: Cada tarefa é associada a um usuário específico.
- **Validação de Dados**: A API valida os dados de entrada para garantir que os campos obrigatórios sejam preenchidos corretamente.

## ⚙️ Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento do sistema.
- **Spring Boot**: Framework utilizado para facilitar a criação de APIs RESTful.
- **Spring Data JPA**: Para o mapeamento objeto-relacional (ORM) e acesso ao banco de dados.
- **PostgreSQL**: Banco de dados relacional para armazenar as informações de usuários e tarefas.
- **Springdoc OpenAPI (Swagger)**: Para gerar automaticamente a documentação da API.

## ✍️ Autor

Desenvolvido por [Alysson Zanchi](https://www.linkedin.com/in/alyssonzanchi/).
