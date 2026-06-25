# 📅 Sistema de Agendamento de Consultas

O objetivo deste sistema é gerenciar agendamentos de consultas médicas, aplicando conceitos fundamentais de Orientação a Objetos e seguindo especificações técnicas detalhadas em diagrama UML. O sistema permite instanciar consultas, manipular dados de pacientes e médicos, e persistir os resultados em arquivos de texto.

## ✅ Funcionalidades Implementadas

- **Gestão de Agendamentos**: Criação de consultas com informações de data, hora, paciente e médico.
- **Sobrecarga de Construtores**: Suporte a diferentes métodos de inicialização, permitindo instanciar objetos tanto por parâmetros diretos quanto por entrada via console.
- **Encapsulamento**: Uso rigoroso de modificadores de acesso e métodos Getter/Setter.
- **Persistência de Dados**: Implementação de funcionalidade para exportar o resultado das consultas para um arquivo de texto (`FileWriter`).
- **Lógica `static`**: Uso de atributos estáticos para rastreamento da quantidade total de consultas realizadas.

## 💻 Tecnologias e Conceitos Aplicados

- **Linguagem**: Java (JDK).
- **Paradigma**: Programação Orientada a Objetos (POO).
- **Conceitos Explorados**:
    - Encapsulamento e modificadores de visibilidade.
    - Sobrecarga de métodos e construtores.
    - Manipulação de classes de Data e Hora.
    - Operações de I/O (Input/Output) para escrita em arquivos físicos.
    - Uso de métodos e atributos `static`.

## 🚀 Como Executar

1. Certifique-se de ter o JDK instalado.
2. Clone este repositório.
3. Compile as classes.
4. Execute o programa para interagir com a interface de agendamento via console e gerar o arquivo de saída.