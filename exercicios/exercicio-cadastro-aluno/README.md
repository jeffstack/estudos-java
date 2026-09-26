# Cadastro de Alunos — CBTLPR2

Programa desenvolvido em Java com interface gráfica para o exercício da disciplina CBTLPR2 (Java).

## ✨ Funcionalidades

A aplicação atende aos itens solicitados no exercício:

- **Classe `Aluno`:** possui os atributos `endereco`, `idade`, `nome` e `uuid`.
- **Identificador único:** o atributo `uuid` é criado com `UUID.randomUUID()`.
- **Cadastro:** ao pressionar o botão **Ok**, os dados preenchidos na tela são armazenados em memória.
- **Lista de alunos:** os objetos são armazenados em uma `List<Aluno>` utilizando `ArrayList<Aluno>`.
- **Limpar:** apaga o conteúdo dos campos do formulário.
- **Mostrar:** exibe uma janela com o ID e o nome de todos os alunos cadastrados durante a execução.
- **Sair:** encerra a aplicação.

## 🖥️ Interface

O formulário possui:

- Campo **Nome**;
- Campo **Idade**;
- Campo **Endereço**;
- Botões **Ok**, **Limpar**, **Mostrar** e **Sair**.

Os painéis foram posicionados com `BorderLayout`. O painel superior utiliza `GridLayout(3, 2)` e o painel inferior utiliza `GridLayout(1, 4)`, conforme a proposta do exercício.

## 📁 Arquivos

```text
src/
├── Aluno.java
└── CadastroAlunosFrame.java
```

- `Aluno.java`: classe solicitada no item (a).
- `CadastroAlunosFrame.java`: formulário e funcionalidades solicitadas nos itens (b) e (c).

## 🚀 Como Executar no NetBeans

1. Abra o NetBeans.
2. Selecione **File > Open Project**.
3. Escolha a pasta do projeto.
4. Execute o projeto pela classe `CadastroAlunosFrame`.

## ⌨️ Como Executar pelo Terminal

Na pasta do projeto, compile os arquivos Java:

```bash
mkdir -p build/classes
javac -encoding UTF-8 -d build/classes src/Aluno.java src/CadastroAlunosFrame.java
```

Depois, execute o programa:

```bash
java -cp build/classes CadastroAlunosFrame
```

Os dados ficam armazenados somente em memória durante a execução do programa.
