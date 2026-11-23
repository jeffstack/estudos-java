# Projeto Threads Java

Programa desenvolvido em Java com interface gráfica (Swing) para a disciplina LP2 (Java) do curso de Análise e Desenvolvimento de Sistemas, no IFSP Campus Cubatão.

## ✨ Funcionalidades

A aplicação atende aos itens solicitados no exercício:

- **Duas threads:** ao pressionar o botão **Iniciar**, são criadas duas threads. Cada uma conta de 0 até o valor de **Máximo** (sem incluir o próprio Máximo, como na figura do PDF) e adiciona cada número à sua lista.
- **Prioridades:** a thread 1 usa a prioridade digitada no campo **Prioridade 1** e a thread 2 usa a do campo **Prioridade 2**, aplicadas com `setPriority`.
- **Validação das prioridades:** se algum valor não estiver entre 1 e 10, as threads não são iniciadas e uma mensagem é mostrada com `JOptionPane`.
- **Labels Final:** cada label **Final** só aparece quando a contagem da respectiva thread termina.
- **Limpar:** esvazia as duas listas e esconde os labels **Final**.
- **Interface segura:** as listas e os labels são atualizados com `SwingUtilities.invokeLater`.

## 🖥️ Interface

O formulário possui:

- Janela com o título **Trabalho Prático 5**;
- Campo **Máximo** (valor inicial `1000`);
- Campos **Prioridade 1** (valor inicial `1`) e **Prioridade 2** (valor inicial `10`), com o texto "Número entre 1 e 10" ao lado;
- Botão **Iniciar**;
- Duas listas (`JList` dentro de `JScrollPane`), uma à esquerda e outra à direita, para os valores das threads 1 e 2;
- Um label **Final** abaixo de cada lista, invisível ao iniciar;
- Botão **Limpar**.

Os componentes foram posicionados com `setLayout(null)` e `setBounds`, seguindo a figura do exercício.

## 📁 Arquivos

```text
src/
└── tp03/
    ├── TelaPrincipal.java
    └── PainelThreads.java
```

- `TelaPrincipal.java`: `JFrame` principal, que contém o método `main`.
- `PainelThreads.java`: `JPanel` que implementa `Runnable`, com o formulário, os botões e o método `run()` usado pelas duas threads.

## 🚀 Como Executar no NetBeans

1. Abra o NetBeans.
2. Selecione **Arquivo > Abrir Projeto**.
3. Escolha a pasta **TP03**.
4. Execute o projeto com **F6** (classe principal `tp03.TelaPrincipal`).

Os valores das listas ficam armazenados somente em memória durante a execução do programa.
