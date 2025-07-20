# 🎮 Catálogo de Jogos

Este projeto tem como objetivo criar um catálogo de jogos, e ser possível monitorar os preços de jogos desejados e registrar automaticamente o menor preço histórico de cada título. No momento a consulta dos preços são feitos apenas na Steam.

---

## 📌 Funcionalidades

- Consulta automática de preços atuais dos jogos na Steam.
- Armazenamento do menor preço já registrado de forma histórica.
- Atualização manual via botão na interface web ou via requisição PUT.
- Interface simples para visualizar todos os jogos e preços.
- Backend estruturado com Java + Spring Boot.
- Integração com a API [SteamStore API (não oficial)](https://rapidapi.com/psimavel/api/steam-store/) via RapidAPI.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database (em memória)
- REST API
- HTML + JavaScript (frontend básico)
- Axios (requisições HTTP no frontend)
- [SteamStore API via RapidAPI](https://rapidapi.com/psimavel/api/steam-store/)

---

## 🗂️ Estrutura do Projeto

├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.exemplo.steamtracker/
│ │ │ ├── controller/
│ │ │ ├── model/
│ │ │ ├── repository/
│ │ │ ├── service/
│ │ │ └── SteamTrackerApplication.java
│ │ └── resources/
│ │ ├── static/
│ │ │ └── index.html
│ │ └── application.properties

---

## 💻 Como executar

### Pré-requisitos

- Java 17+
- Maven
- Conta gratuita no [RapidAPI](https://rapidapi.com/) com acesso à API SteamStore

---

### 🧩 Passos

1. Clonar o projeto

bash
git clone https://github.com/GuiBaeta/CatalogoDeJogos
cd seu-repositorio

2. Configurar a API Key

Edite o arquivo src/main/resources/application.properties:
steam.api.key=SUA_CHAVE_RAPIDAPI

3. Executar o projeto
./mvnw spring-boot:run

O projeto estará disponível em:
📍 http://localhost:8080

---

📡 Rotas disponíveis

GET /jogos
Lista todos os jogos cadastrados.

PUT /jogos/atualizar-precos-steam
Atualiza os preços dos jogos com base na Steam.
Pode ser chamado manualmente via Postman, Insomnia ou clicando no botão Atualizar Preços na interface web.

GET /usuarios
Exibe a lista de usuários cadastrados.

GET /catalogo
Exibe os jogos de cada usuário, separando os que possuem dos que estão na lista de desejos.

---

🌐 Interface Web
Acesse:
📍 http://localhost:8080/index.html

Exibe todos os jogos e preços em uma tabela.

Preços nulos aparecem como —.

Clique em Atualizar Preços para consultar os valores atuais na Steam.

O menor preço é salvo automaticamente, se for inferior ao anterior.

---

## 🖼️ Capturas de Tela

### 🎯 Antes da atualização dos preços:
![Antes da atualização](images/antes-atualizacao.png)

### ✅ Após a atualização dos preços:
![Após a atualização](images/depois-atualizacao.png)

---

📄 Licença
Este projeto é de uso pessoal/educacional. Sinta-se livre para adaptar, melhorar e usar como base para seus próprios projetos.

---

👨‍💻 Autor
Feito com 💻 por Guilherme Baeta
📫 https://www.linkedin.com/in/guilhermebaeta/
🐙 https://github.com/GuiBaeta