# 🎓 Desafio: Design Patterns com Java

Este projeto é a resolução de um desafio que faz parte do Bootcamp Claro - Java com Spring Boot na [Digital Innovation One (DIO)](https://www.dio.me). O objetivo do desafio é demonstrar a aplicação de padrões de design em Java, incluindo Singleton, Strategy e Facade.

## 📖 Descrição do Projeto

O projeto consiste em um sistema que permite realizar pagamentos utilizando diferentes métodos, como Cartão de Crédito e PayPal. O sistema implementa padrões de design para garantir uma arquitetura limpa e escalável, além de proporcionar um registro das operações realizadas.

## ✨ Funcionalidades

- **Configuração**: Classe Singleton que gerencia a configuração do sistema, como a moeda utilizada.
- **Métodos de Pagamento**: Implementação dos métodos de pagamento utilizando o padrão Strategy:
    - **Cartão de Crédito**: Realiza pagamentos através de cartão de crédito.
    - **PayPal**: Realiza pagamentos através do PayPal.
- **Facade**: Classe Facade que simplifica a interface do sistema de pagamentos, permitindo que os usuários realizem pagamentos sem se preocupar com a implementação interna.
- **Registro de Log**: Sistema de log para registrar as operações realizadas, facilitando o rastreamento e a auditoria dos pagamentos.
- **Validação de Pagamentos**: Validações que garantem que os valores dos pagamentos sejam válidos antes da execução.

## ⚙️ Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para implementar o sistema.
- **Padrões de Design**: Implementação dos padrões Singleton, Strategy e Facade para estruturação do código.

## 📚 Como Executar o Projeto

1. Clone este repositório em sua máquina local.
2. Abra o projeto em sua IDE preferida (Eclipse, IntelliJ, etc.).
3. Compile o projeto.
4. Execute a classe `Main` para testar as funcionalidades.

## ✍️ Autor

Desenvolvido por [Alysson Zanchi](https://www.linkedin.com/in/alyssonzanchi/).