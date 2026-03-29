# Padrões de Projeto - Abstract Factory

Este repositório contém um exemplo prático de implementação do padrão de projeto **Abstract Factory** utilizando **Java**, com o tema focado na montagem de **Veículos**.

O objetivo do exercício é demonstrar como criar famílias de objetos relacionados ou dependentes (como motores e rodas de carros ou motos) sem precisar especificar suas classes concretas no código cliente.

---

## Estrutura do Projeto

O projeto está organizado nas seguintes interfaces e classes principais:

- **Interfaces (Fábrica e Produtos Abstratos):** `FabricaVeiculo`, `Motor` e `Roda`.
- **Classes Concretas (Fábricas):** `FabricaCarro` e `FabricaMoto`.
- **Classes Concretas (Produtos):** `MotorCarro`, `MotorMoto`, `RodaCarro` e `RodaMoto`.
- **Cliente:** `MontagemVeiculo` → Classe que utiliza a fábrica para montar o veículo.
- **Testes:** `MontagemVeiculoTest` → Classe de testes unitários utilizando JUnit.

---

## Padrão Abstract Factory

O padrão Abstract Factory fornece uma interface para criar famílias de objetos relacionados. No nosso exemplo, isso garante que um carro não seja montado com a roda de uma moto, e vice-versa. 
Isso é feito através de:

- **Fábrica Abstrata:** Uma interface que declara os métodos de criação dos produtos.
- **Fábricas Concretas:** Classes que implementam a interface da fábrica para criar os produtos específicos de uma "família".
- **Desacoplamento:** O cliente interage apenas com as interfaces, nunca diretamente com as classes concretas.

---

## Diagrama de Classes

Abaixo está o diagrama de classes representando a estrutura da implementação e como as famílias de objetos se relacionam.

<img width="848" height="570" alt="Diagrama-AbstractFactor" src="https://github.com/user-attachments/assets/bddb0159-79c4-4d96-809f-61243c4dc41a" />
