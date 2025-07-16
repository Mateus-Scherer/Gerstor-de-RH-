# 💼 RHControl – Sistema de Gestão de Recursos Humanos

Bem-vindo ao **RHControl**, um sistema simples e eficiente de **Gestão de Recursos Humanos** desenvolvido por *Mateus Scherer Teles* com o objetivo de facilitar o cadastro, gerenciamento e operações com funcionários de forma prática e interativa.

## 📌 Sobre o Projeto

O RHControl foi desenvolvido com foco no aprendizado e aplicação prática dos conceitos de programação Java integrados a uma interface web simples. Com ele, é possível:

- Cadastrar funcionários com nome, cargo e salário;
- Listar todos os funcionários cadastrados;
- Reajustar salários individualmente por percentual;
- Excluir funcionários com confirmação;

## 🚀 Funcionalidades

- 📋 **Cadastro de Funcionários**
- 📑 **Lista de Funcionários**
- 💰 **Reajuste Salarial**
- ❌ **Exclusão de Funcionário**

## 🛠️ Tecnologias e Ferramentas Utilizadas

| Ferramenta | Finalidade |
|------------|------------|
| **Java** | Lógica de negócio (back-end) |
| **HTML5** | Estrutura das páginas web |
| **CSS3** | Estilização das páginas |
| **JavaScript** | Interatividade e integração com o back-end |
| **MySQL** | Banco de dados para persistência dos dados (versão local Java) |
| **Visual Studio Code** | Edição de código |
| **Apache Maven** | Gerenciamento de dependências Java |
| **Git & GitHub** | Versionamento de código e hospedagem do projeto |
| **GitHub Pages** | Publicação da interface web |

## 📂 Organização do Projeto

```
RHControl/
├── backend/                 # Código Java (lógica do sistema)
├── frontend/                # Arquivos HTML, CSS e JS
│   ├── index.html           # Página principal com menu
│   ├── cadastrar.html       # Página de cadastro
│   ├── listar.html          # Página de listagem
│   ├── reajustar.html       # Página de reajuste salarial
│   ├── excluir.html         # Página de exclusão
├── README.md                # Documentação do projeto
```

## 🧪 Como Executar o Projeto

Você pode visualizar o sistema diretamente pelo navegador:

🌐 [Versão Online (GitHub Pages)](https://mateus-scherer.github.io/Gerstor-de-RH-/)

Se quiser rodar o sistema localmente com a parte do back-end em Java (ex: para fins acadêmicos ou análise técnica), siga os passos abaixo:

### 🔧 Requisitos
- JDK 17 ou superior
- Apache Maven
- Visual Studio Code (ou outro editor)
- Navegador Web (Chrome, Firefox, etc)

### ▶️ Etapas

1. Clone o repositório:
   ```bash
   git clone https://github.com/Mateus-Scherer/Gerstor-de-RH-.git
   ```

2. Acesse o diretório do back-end e execute:
   ```bash
   cd RHControl/backend
   mvn clean install
   mvn exec:java
   ```

3. Abra `index.html` da pasta `frontend` no navegador para testar a interface com o servidor Java.

## 🙋‍♂️ Autor

**Mateus Scherer Teles**  
📧 mateusschererteles2020@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/mateus-teles-215717365/)  
🔗 [GitHub](https://github.com/Mateus-Scherer?tab=repositories)
