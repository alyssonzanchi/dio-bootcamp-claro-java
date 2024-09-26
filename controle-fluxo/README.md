# Desafio de Controle de Fluxo - Bootcamp Claro Java DIO

Este projeto foi desenvolvido como parte do desafio de controle de fluxo em Java proposto no Bootcamp **Claro Java** da [Digital Innovation One (DIO)](https://www.dio.me/). O desafio faz parte da trilha de aprendizado de **Java básico** e tem como objetivo praticar os fundamentos da linguagem Java. 

## 📝 Descrição do Desafio

O desafio consiste em implementar uma lógica de contagem baseada em dois parâmetros fornecidos pelo usuário. O primeiro parâmetro deve ser menor que o segundo, e o programa deve lançar uma exceção customizada chamada `ParametrosInvalidosException` caso a condição não seja atendida.

## ⚙️ Funcionalidades

O programa possui as seguintes funcionalidades:
- Leitura de dois parâmetros inteiros fornecidos pelo usuário.
- Validação para garantir que o segundo parâmetro seja maior que o primeiro.
- Exceção customizada (`ParametrosInvalidosException`) que é lançada quando o primeiro parâmetro é maior ou igual ao segundo.
- Impressão dos números a partir do primeiro parâmetro até o segundo, caso a validação seja bem-sucedida.

## 🎯 Exemplo de execução

### ✅ Caso de sucesso:
Quando o segundo parâmetro for maior que o primeiro, o programa imprime uma sequência de números:

```
Digite o primeiro parâmetro:
3
Digite o segundo parâmetro:
7
Imprimindo número: 1
Imprimindo número: 2
Imprimindo número: 3
Imprimindo número: 4
```

### ❌ Caso de erro
Se o segundo parâmetro for menor ou igual ao primeiro, o programa lança uma exceção e imprime a seguinte mensagem:

```
Digite o primeiro parâmetro:
5
Digite o segundo parâmetro:
3
O segundo parâmetro deve ser maior que o primeiro
```

## 🏗️ Estrutura do projeto

O código é composto por:

- **Classe `Contador`**: Contém o método principal e a lógica de controle de fluxo.
- **Método `contar`**: Realiza a contagem e validação dos parâmetros.
- **Exceção `ParametrosInvalidosException`**: Exceção customizada que é lançada quando os parâmetros não são válidos.

## 💻 Como executar o projeto

1. Clone este repositório para sua máquina local:

   ```bash
   git clone https://github.com/alyssonzanchi/dio-bootcamp-claro-java.git
   ```
2. Navegue até o diretório do projeto:

   ```bash
   cd dio-bootcamp-claro-java/controle-fluxo
   ```   
3. Compile o arquivo Java:

   ```bash
   javac Contador.java
   ```
4. Execute o programa:

   ```bash
   java Contador
   ```

## 🚀 Tecnologias utilizadas

- **Java**: Linguagem de programação usada para desenvolver o projeto.
- **Scanner**: Utilizado para entrada de dados pelo terminal.
- **Try-Catch**: Estrutura de controle de exceções para tratar a exceção customizada.

## ✍️ Autor

Desenvolvido por [Alysson Zanchi](https://www.linkedin.com/in/alyssonzanchi/).