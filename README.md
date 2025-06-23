# Sistema-de-cadastro-de-produtos-com-java
# 🛍️ Cadastro de Produtos - Java Swing + MySQL

Este é um projeto básico desenvolvido em **Java Swing**, que permite **cadastrar produtos** e listá-los em uma **tabela**, com persistência em banco de dados **MySQL**. O sistema foi criado para fins de prática com **interface gráfica**, **JDBC** e manipulação de dados em tempo real.

---

## 🧰 Tecnologias Utilizadas

- **Java 24** (JDK 24)
- **Apache NetBeans**
- **Java Swing** (Interface gráfica)
- **MySQL 5.7** (via XAMPP)
- **JDBC** (Driver de conexão com o banco)
- **XAMPP** (Servidor local)

---

## 🎯 Funcionalidades

- Cadastro de produtos com:
  - Nome
  - Tipo
  - Quantidade
- Visualização dos produtos cadastrados em uma tabela
- Armazenamento no banco de dados MySQL
- Atualização automática da lista de produtos após o cadastro

---

## ⚙️ Como Executar o Projeto

. **Clone este repositório:**
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git

   
---

 ⚙️ Como Executar o Projeto

 **Clone este repositório:**
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
Importe o projeto no NetBeans.

Configure o banco de dados:

Abra o XAMPP e inicie o MySQL.

Importe o arquivo SQL localizado em bd/produtos_db.sql no phpMyAdmin.

Verifique a string de conexão no código Java:


String url = "jdbc:mysql://localhost:3306/super_descontos";
String usuario = "root";
String senha = "";
Execute o projeto pelo NetBeans.





📝 Observações
O projeto não utiliza padrão MVC; todo o código está organizado de forma funcional para facilitar a compreensão.

O banco de dados já está incluído na pasta bd/, pronto para importação.

![Tela de cadastro](https://github.com/user-attachments/assets/90634a20-923f-40fa-9fb6-c55a8aceefa5)

![Tela de exibicao produtos](https://github.com/user-attachments/assets/b873c2de-a721-47f8-a682-e300122cb341)



Recomendado para fins educacionais ou como base para projetos maiores.

📄 Licença
Este projeto está sob a licença MIT.
