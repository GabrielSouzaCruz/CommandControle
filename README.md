# CommandControle

Este projeto demonstra a aplicação correta do **padrão de projeto Command**, conforme descrito por Gamma et al. (GoF), utilizando um cenário de **automação residencial** como estudo de caso.

O objetivo é evidenciar como o padrão Command promove o **desacoplamento entre o invocador e os receptores**, facilitando a extensibilidade, manutenção e suporte a funcionalidades avançadas como **undo** e **macrocomandos**.

---

## 🎯 Objetivo

- Aplicar o padrão **Command** em Java
- Separar claramente os papéis de:
  - **Invoker**
  - **Command**
  - **Receiver**
- Demonstrar a criação de **MacroCommand**
- Evidenciar a aderência aos princípios **SOLID**, principalmente:
  - DIP (Dependency Inversion Principle)
  - OCP (Open/Closed Principle)

---

## 🏗️ Estrutura do Projeto

```

src
├─ model
│  ├─ command
│  │  ├─ Command.java
│  │  ├─ LigarLuzCommand.java
│  │  ├─ LigarSomCommand.java
│  │  ├─ LigarArCondicionadoCommand.java
│  │  └─ MacroCommand.java
│  ├─ invoker
│  │  └─ ControleRemoto.java
│  └─ receiver
│     ├─ Luz.java
│     ├─ Som.java
│     └─ ArCondicionado.java
└─ view
└─ Main.java

```

---

## 🧩 Descrição dos Componentes

### Command
- Interface que define o contrato comum (`execute()` e `undo()`)
- Permite encapsular solicitações como objetos

### Comandos Concretos
- Implementam a interface `Command`
- Encapsulam ações específicas sobre os receptores

### Invoker (`ControleRemoto`)
- Não conhece os receptores concretos
- Executa comandos através da interface `Command`
- Mantém histórico para suporte a **undo**

### Receivers
- Contêm a lógica de negócio real
- Não conhecem o padrão Command

### MacroCommand
- Implementa o padrão **Composite**
- Permite agrupar múltiplos comandos em uma única ação
- Executa e desfaz comandos de forma consistente

---

## ▶️ Execução

Execute a classe:

```

view.Main

```

O console exibirá:
- Execução de comandos individuais
- Execução de um macrocomando (Modo Cinema)
- Reversão das ações via `undo`

---

## 📚 Conceitos Aplicados

- Padrão de Projeto Command
- Encapsulamento de solicitações
- Desacoplamento entre camadas
- Undo / Histórico de comandos
- Macrocomandos

---

## 📖 Referências

- GAMMA, E. et al. *Padrões de Projeto: Soluções Reutilizáveis de Software Orientado a Objetos*
- FREEMAN, E. *Use a Cabeça! Padrões de Projeto*
- MARTIN, R. C. *Clean Code*
