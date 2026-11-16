# 🗂️ Sistema de Pesquisa de Funcionários

O objetivo deste sistema é pesquisar funcionários cadastrados em um banco de dados SQL Server, utilizando uma interface gráfica simples em Java Swing. A aplicação foi desenvolvida conforme a atividade prática da disciplina CBTLPR2 e permite consultar funcionários pelo nome, visualizar seus dados e navegar pelos registros encontrados.

## ✅ Funcionalidades Implementadas

- **Pesquisa de Funcionários**: Busca funcionários pelo nome informado no campo de pesquisa.
- **Consulta com `LIKE`**: Utilização de `LIKE` para localizar nomes completos ou partes do nome.
- **Uso de `PreparedStatement`**: Execução do comando SQL por meio de `PreparedStatement`.
- **Exibição de Dados**: Apresentação do nome, salário e cargo do funcionário.
- **Navegação pelos Registros**: Uso dos botões **Anterior** e **Próximo** para percorrer os resultados da pesquisa.
- **Relacionamento entre Tabelas**: Consulta envolvendo as tabelas `funcionarios` e `cargos`.
- **Conexão JDBC**: Comunicação entre a aplicação Java e o banco de dados SQL Server.

## 💻 Tecnologias e Conceitos Aplicados

- **Linguagem**: Java.
- **IDE**: NetBeans 8.2.
- **Banco de Dados**: Microsoft SQL Server.
- **Interface Gráfica**: Java Swing.
- **Conectividade**: JDBC.
- **Conceitos Explorados**:
  - Criação de uma interface gráfica com `JFrame`, `JPanel`, `JLabel`, `JTextField` e `JButton`.
  - Uso de eventos de clique nos botões.
  - Utilização de `Connection`, `PreparedStatement` e `ResultSet`.
  - Consulta com `INNER JOIN` entre funcionários e cargos.
  - Navegação em registros com `ResultSet`.
  - Organização do projeto Java utilizando o padrão de projeto do NetBeans.

## 🗃️ Estrutura do Banco de Dados

O banco de dados utilizado se chama `aulajava` e possui as seguintes tabelas:

- `cargos`: armazena o código e a descrição dos cargos.
- `funcionarios`: armazena o código, nome, salário e o cargo relacionado.

O relacionamento entre as tabelas é feito pelo campo `cd_cargo`.

## 🚀 Como Executar

1. Instale o JDK 8.
2. Instale ou tenha acesso ao Microsoft SQL Server.
3. Abra o SQL Server Management Studio e execute o arquivo `banco_aulajava.sql`.
4. Se quiser adicionar registros extras para teste, execute o arquivo `inserts_teste.sql`.
5. Baixe o Microsoft JDBC Driver para SQL Server compatível com Java 8.
6. Copie o arquivo `mssql-jdbc-11.2.0.jre8.jar` para a pasta `lib` do projeto.
7. Abra a pasta do projeto no NetBeans 8.2.
8. Adicione o arquivo `.jar` em **Bibliotecas > Adicionar JAR/Pasta**.
9. Confira os dados da conexão no arquivo `src/trabalhopratico04/Conexao.java`.
10. Clique com o botão direito no projeto e escolha **Limpar e Construir**.
11. Execute o projeto com `F6`.
12. Digite um nome, como `Marcelo`, e clique em **Pesquisar**.

## 📁 Arquivos Principais

- `src/trabalhopratico04/FrmFuncionario.java`: interface gráfica e funcionalidades dos botões.
- `src/trabalhopratico04/Conexao.java`: conexão com o SQL Server por JDBC.
- `banco_aulajava.sql`: criação do banco, tabelas e registros iniciais.
- `inserts_teste.sql`: registros adicionais para teste.
- `nbproject/`: configurações do projeto NetBeans.
