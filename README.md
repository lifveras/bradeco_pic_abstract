# BRADECO PIC Abstract

Este projeto contém **abstrações base do PIC (Processo de Integração de Componentes)** para Java. Ele foi desenvolvido como parte da disciplina de **Desenvolvimento de Componentes (BRADECO)** do curso de Tecnologia em Análise e Desenvolvimento de Sistemas - Campus Bragança Paulista. Ele tem como objetivo fornecer um conjunto de interfaces e classes abstratas que representam os principais elementos arquiteturais de um sistema baseado em componentes reutilizáveis.

> O padrão de abstração adotado foi baseado no trabalho do **Prof. Ricardo Silva**, autor do livro [*Desenvolvimento Orientado a Componentes com UML*](https://www.amazon.com.br/Desenvolvimento-Orientado-Componentes-com-UML/dp/8574525244).

---

## Estrutura do Projeto

O projeto é distribuído como um `jar` contendo apenas **interfaces e classes abstratas**, com o propósito de servir como **API de contrato**. As classes estão organizadas da seguinte forma:

```

src/main/java/io/github/lifveras/bredeco\_pic\_abstract/
├── provided/
│   ├── ComponentInterface.java
│   └── InterfacePort.java
└── required/
│   ├── BroadcastPortOutbox.java
│   ├── NonComponentPortOutbox.java
│   ├── PortOutbox.java
│   └── StandardPortOutbox.java

````

### Pacote `provided`
Contém abstrações que representam **interfaces fornecidas** por componentes.

### Pacote `required`
Contém abstrações relacionadas às **interfaces requeridas**, simulando caixas de saída (outboxes) de comunicação entre componentes.

---

## Como Usar

Este projeto está disponível no [Maven Central](https://central.sonatype.com/artifact/io.github.lifveras/bredeco_pic_abstract).

Adicione a dependência no seu `pom.xml`:

```xml
<dependency>
    <groupId>io.github.lifveras</groupId>
    <artifactId>bredeco_pic_abstract</artifactId>
    <version>1.0.0</version>
</dependency>
````

Você pode então criar suas implementações concretas estendendo as classes abstratas ou implementando as interfaces fornecidas neste artefato.

---

## Sobre o autor do padrão

O padrão utilizado neste projeto é uma abstração inspirada no modelo proposto pelo Prof. Ricardo Silva.

📘 Livro: [Desenvolvimento Orientado a Componentes com UML](https://www.amazon.com.br/Desenvolvimento-orientado-componentes-com-UML-ebook/dp/B07DYDSMCZ/ref=sr_1_1)
📺 Canal do YouTube - Parte Teórica: [Parte Teórica](https://www.youtube.com/watch?v=0BmWe7d17NU&list=PLQb3t1uw-rpFIPbyWZCfOc9CTN5chPa0d)
📺 Canal do YouTube [Parte Prática](https://www.youtube.com/watch?v=4mnZnNAYHKc&list=PLQb3t1uw-rpHXs0N674qsdYB_Dlgoriy3)

---
