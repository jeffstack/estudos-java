# Exercício: Calculadora e Cadastro de Pessoa

Programa desenvolvido em Java com interface gráfica Swing, conforme a proposta do exercício.

## ✨ Funcionalidades

A aplicação atende aos itens solicitados no exercício:

- **Calculadora:** realiza as operações de adição, subtração, multiplicação e divisão.
- **Botão C:** limpa a memória da calculadora e zera o campo de resultado.
- **Tratamento de erros:** utiliza `try`, `catch` e `finally` para tratar entradas inválidas e divisão por zero.
- **Classe `Pessoa`:** possui os atributos `kp`, `nome`, `sexo` e `idade`.
- **Contador `kp`:** atributo estático que informa a quantidade de pessoas distintas cadastradas durante a execução.
- **Cadastro de pessoa:** ao pressionar o botão **OK**, os dados preenchidos são transferidos para o objeto `UmaPessoa`.
- **Seleção de sexo:** utiliza componentes `JRadioButton` com as opções `M` e `F`.
- **Mostrar:** exibe os dados armazenados no objeto `UmaPessoa`, incluindo o contador `kp`.
- **Limpar:** apaga o conteúdo dos campos do formulário.
- **Sair:** encerra a aplicação.

## 🖥️ Interface

A aplicação possui duas abas:

### Calculadora

A calculadora possui:

- Campo de resultado;
- Botões numéricos;
- Botões das operações `+`, `-`, `*` e `/`;
- Botão `C`;
- Botão `=`.

### FormPessoa

O formulário possui:

- Campo **Número**, bloqueado para digitação;
- Campo **Nome**;
- Opções de **Sexo** com `JRadioButton`;
- Campo **Idade**;
- Botões **OK**, **Limpar**, **Mostrar** e **Sair**.

## 📁 Arquivos

```text
src/
└── tp03/
    ├── TP03.java
    ├── Pessoa.java
    ├── TelaPrincipal.java
    ├── PainelCalculadora.java
    └── PainelPessoa.java
```

- `TP03.java`: classe principal que inicia a aplicação.
- `Pessoa.java`: classe solicitada no exercício, com seus atributos, métodos e contador estático `kp`.
- `TelaPrincipal.java`: janela principal com as abas da calculadora e do formulário.
- `PainelCalculadora.java`: calculadora e suas operações.
- `PainelPessoa.java`: formulário para cadastro e exibição dos dados da pessoa.

## 🚀 Como Executar no NetBeans

1. Abra o NetBeans.
2. Selecione **File > Open Project**.
3. Escolha a pasta do projeto `TP03`.
4. Aguarde o carregamento do projeto.
5. Execute o projeto pela classe principal `tp03.TP03`.

## ⌨️ Como Executar pelo Terminal

Na pasta do projeto, compile os arquivos Java:

```bash
mkdir -p build/classes
javac -encoding UTF-8 -d build/classes src/tp03/*.java
```

Depois, execute o programa:

```bash
java -cp build/classes tp03.TP03
```

Os dados da pessoa e o contador `kp` ficam armazenados somente em memória durante a execução do programa.
