# Desafio iPhone — Programação Orientada a Objetos em Java

Projeto desenvolvido para praticar conceitos de **Programação Orientada a Objetos (POO)** em Java, por meio da modelagem simplificada de um iPhone com três conjuntos de funcionalidades: reprodutor musical, aparelho telefônico e navegador de internet.

## Objetivo

Demonstrar como interfaces podem definir comportamentos e como uma única classe pode implementar diferentes interfaces.

## Funcionalidades demonstradas

- **Reprodutor musical:** tocar, pausar e selecionar uma música.
- **Aparelho telefônico:** ligar, atender e iniciar o correio de voz.
- **Navegador de internet:** exibir uma página, adicionar uma aba e atualizar a página.

As funcionalidades são simuladas por mensagens no console. O projeto não reproduz música, realiza chamadas reais nem abre páginas em um navegador.

## Conceitos praticados

- Interfaces em Java
- Implementação de múltiplas interfaces
- Sobrescrita de métodos com `@Override`
- Organização de classes em arquivos separados
- Criação de objetos e chamadas de métodos
- Testes automatizados para verificar as mensagens exibidas pelos métodos

## Estrutura do projeto

```text
Desafio-iPhone--POO/
├── AparelhoTelefonico.java
├── Main.java
├── NavegadorInternet.java
├── ReprodutorMusical.java
├── iPhone.java
├── tests/
│   └── TesteIPhone.java
└── README.md
```

## Pré-requisitos

- JDK instalado
- Terminal ou editor de código, como o Visual Studio Code

Verifique a instalação do Java:

```powershell
java -version
javac -version
```

## Como compilar e executar

Abra o terminal na pasta principal do projeto e execute:

```powershell
javac *.java
java Main
```

## Como executar os testes

Compile a classe principal e o arquivo de teste:

```powershell
javac *.java .\tests\TesteIPhone.java
```

Execute os testes:

```powershell
java -cp ".;tests" TesteIPhone
```

## Testes realizados

O arquivo `TesteIPhone.java` verifica as mensagens exibidas pelos nove métodos do projeto:

- Tocar música
- Pausar música
- Selecionar música
- Ligar
- Atender chamada
- Iniciar correio de voz
- Exibir página
- Adicionar nova aba
- Atualizar página

**Última execução realizada:** 9 testes aprovados.

## Autor

**Márcio Eufrazio**

Tecnólogo em Análise e Desenvolvimento de Sistemas.
