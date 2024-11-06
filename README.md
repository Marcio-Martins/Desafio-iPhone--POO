# Desafio iPhone - POO

Este projeto representa a modelagem UML do componente iPhone, com funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar(): void
        +pausar(): void
        +selecionarMusica(String musica): void
    }

    class AparelhoTelefonico {
        +ligar(String numero): void
        +atender(): void
        +iniciarCorreioVoz(): void
    }

    class NavegadorInternet {
        +exibirPagina(String url): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    class iPhone {
        +tocar(): void
        +pausar(): void
        +selecionarMusica(String musica): void
        +ligar(String numero): void
        +atender(): void
        +iniciarCorreioVoz(): void
        +exibirPagina(String url): void
        +adicionarNovaAba(): void
        +atualizarPagina(): void
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
