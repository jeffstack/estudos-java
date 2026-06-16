# 🗓️ Classe Data em Java

Este repositório contém a implementação da classe `Data` em Java. O objetivo foi criar uma classe para manipulação de datas, seguindo especificações detalhadas e com foco na validação de entradas.

## ✨ Funcionalidades

A classe `Data` oferece as seguintes funcionalidades:

*   **Construtores:** Permitem a criação de objetos `Data` com ou sem parâmetros iniciais. O construtor padrão interage com o usuário para obter os valores de dia, mês e ano.
*   **Validação Robusta:** Todos os métodos de entrada (`entraDia`, `entraMes`, `entraAno`) e o construtor interativo realizam validação rigorosa dos dados. Em caso de entrada inválida, o programa solicita a redigitação até que um valor aceitável seja fornecido. Isso inclui a verificação de dias válidos para cada mês e anos bissextos. 🛡️
*   **Tratamento de Exceções:** Implementação de `try-catch` para lidar com entradas não numéricas, garantindo que o programa não falhe inesperadamente. 🚫🔢
*   **Métodos de Acesso (Getters):** `retDia()`, `retMes()`, `retAno()` para obter os valores dos atributos.
*   **Formatos de Exibição:**
    *   `mostra1()`: Retorna a data no formato `dd/mm/aaaa`.
    *   `mostra2()`: Retorna a data no formato `dd/MêsPorExtenso/aaaa`.
*   **Verificação de Ano Bissexto:** O método `bissexto()` informa se o ano da data é bissexto ou não. 📅
*   **Cálculo de Dias Transcorridos:** O método `diasTranscorridos()` retorna a quantidade de dias que se passaram no ano até a data atual do objeto.
*   **Data Atual:** O método `apresentaDataAtual()` exibe a data atual do sistema no formato completo.

## 🚀 Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone <URL_DO_SEU_REPOSITORIO>
    ```
2.  **Navegue até a pasta `src`:**
    ```bash
    cd TrabalhoPratico04/src
    ```
3.  **Compile os arquivos Java:**
    ```bash
    javac Data.java TestaData.java
    ```
4.  **Execute o programa de teste:**
    ```bash
    java TestaData
    ```