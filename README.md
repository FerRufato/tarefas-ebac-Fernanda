# ✅ Tarefas EBAC - Camada de Domínio

Este projeto faz parte de uma aplicação para **gerenciamento de tarefas**, desenvolvido durante o curso da EBAC. A camada de domínio representa o núcleo da aplicação, com foco nas **entidades, regras de negócio** e **interfaces de persistência**.

---

## 🧠 Sobre o Projeto

O objetivo é permitir o cadastro e gerenciamento de tarefas de forma simples e organizada. A estrutura do projeto segue os princípios da arquitetura em camadas, onde esta parte do código representa a **camada de domínio**, responsável por:

- Definir os **modelos de dados** (entidades);
- Especificar **interfaces de repositórios**;
- Implementar **serviços com regras de negócio**;
- Garantir **testabilidade e manutenibilidade** do sistema.

---

## 📂 Estrutura

src/
└── br/
└── com/
└── FeRufato/
└── domain/
├── model/ # Entidades do sistema (ex: Tarefa)
├── repository/ # Interfaces para persistência de dados
└── service/ # Regras de negócio aplicadas às entidades

---

## 🛠️ Tecnologias Utilizadas

- **Java 17** — Linguagem principal  
- **Maven** — Gerenciador de dependências  
- **JUnit** — Testes automatizados  

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/FerRufato/tarefas-ebac-Fernanda.git
