# Currency Converter
Este é um simples aplicativo de conversão de moedas que permite ao usuário converter valores entre diferentes moedas usando as taxas de câmbio fornecidas pela API ExchangeRate-API.

### Funcionalidades
Conversão de valores entre diferentes moedas.
Suporte para 6 tipos de moedas: USD, EUR, GBP, JPY, AUD, CAD.
Interface de linha de comando para selecionar a conversão desejada e inserir valores.
Uso da biblioteca Gson para manipulação de JSON.
Tecnologias Utilizadas
Java
API ExchangeRate-API
Biblioteca Gson
Pré-requisitos
JDK 11 ou superior
Maven (para gerenciamento de dependências)
Dependências
Adicione a seguinte dependência ao seu pom.xml para usar a biblioteca Gson:


### Configuração
Clone o repositório:

#### Bash
Copiar código
git clone https://github.com/marydatacode/CurrencyConverter.git

cd CurrencyConverter
Adicione sua chave da API ExchangeRate-API:

Substitua "YOUR_API_KEY" pela sua chave da API na classe ExchangeRateAPI:

#### JAVA
Copiar código
private static final String API_KEY = "YOUR_API_KEY";

### Uso
Ao iniciar o programa, você verá um menu de opções para selecionar o tipo de conversão de moeda desejado.

Escolha a conversão desejada inserindo o número correspondente.

Insira o valor que deseja converter.

O programa exibirá o valor convertido.

Você pode optar por fazer outra conversão ou sair do programa.

##### Exemplo:

Copiar código
Bem-vindo ao Conversor de Moedas!
Escolha a conversão desejada:
1. USD para EUR
2. EUR para USD
3. GBP para JPY
4. JPY para GBP
5. AUD para CAD
6. CAD para AUD
0. Sair

### Estrutura do Projeto
Main.java: Classe principal que contém a lógica de interface com o usuário.
CurrencyConverter.java: Classe responsável por converter os valores das moedas.
ExchangeRateAPI.java: Classe responsável por se comunicar com a API ExchangeRate-API e obter as taxas de câmbio.