<h1 align="center">Challenge Conversor de moedas</h1>

Desafio proposto pela Oracle e Alura no Programa G8 ONE onde o objetivo é criar um conversor de moedas, dinâmico que pega as cotações em tempo real de uma api. o objetivo é praticar todos os conhecimentos adquiridos até aqui na formação de Backend e Java.

## 📋 Descrição

Este é um conversor de moedas em linha de comando desenvolvido em Java 17, que realiza consultas em tempo real de taxas de câmbio utilizando a API pública ExchangeRate-API.
A aplicação permite ao usuário converter valores entre diferentes moedas de forma simples e interativa, apresentando um menu amigável no terminal.

## 🎯 Funcionalidades

✅ Consulta de taxas de câmbio ao vivo

✅ Conversão entre múltiplas moedas:

-  USD ⇄ ARS (Peso Argentino)

- USD ⇄ BRL (Real Brasileiro)

- USD ⇄ COP (Peso Colombiano)

✅ Interface amigável em modo texto

✅ Código limpo, organizado e orientado a objetos

## 🚀 Tecnologias Utilizadas
✅ Java 17

✅ API ExchangeRate-API

✅ Biblioteca Gson (Google JSON Library)

✅ Java HttpClient (API HTTP nativa do Java)

## 🛠️ Como executar o projeto
### Pré-requisitos
Java 17 ou superior instalado na máquina.

Biblioteca gson-X.X.X.jar adicionada ao classpath.

Passos para executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/currency-converter-java.git
```

2. Adicione a biblioteca Gson ao seu classpath (caso não use Maven).

3. Compile os arquivos:

```bash
javac -cp ".:dependencias/gson-X.X.X.jar" application/Program.java
```
4. Execute a aplicação:

```bash
java -cp ".:dependencias/gson-X.X.X.jar" application.Program
```
## 💡 Exemplo de uso

********************************************************************************************************
Seja bem-vindo(a) ao Conversor de Moeda =]

1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileiro
4) Real brasileiro =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Sair
   
Digite a opção desejada:
********************************************************************************************************

## Saída no Console

![saida](https://github.com/user-attachments/assets/ab530928-2427-4f95-a698-3cac1c198a8a)

## 📚 Aprendizados e Boas Práticas aplicadas

Uso de API REST com Java puro.

Separação de responsabilidades com classes especializadas.

Manipulação de JSON usando Gson.

Estruturação clara com uso de record para resposta da API.

Tratamento de exceções com mensagens amigáveis ao usuário.

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Autor

   <div align="center">
   <h2>Wellington Rodrigues</h2>
      <img src="https://avatars.githubusercontent.com/u/99605930?v=4" width="100px;" alt="Wellington Rodrigues">
   </div>
   </br>

   <div align="center">
   <a href="mailto:rodrigueswellington3@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" alt="Enviar e-mail para o Gmail"></a>
  <a href="https://www.linkedin.com/in/wellington-rodrigues-rsdev" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
</div>


