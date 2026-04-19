# Sistema de Gerenciamento de Inventário em Java
Este é o meu primeiro projeto desenvolvido em Java, focado na aplicação prática dos fundamentos da linguagem e dos pilares da Programação Orientada a Objetos (POO)

. O sistema permite o controle de um estoque de produtos através de uma interface interativa via console.

Funcionalidades
O sistema oferece um menu dinâmico que permite ao usuário interagir com o inventário em tempo real:
Adicionar Produto: Cadastro de itens com nome, preço e quantidade.
Listar Estoque: Exibição detalhada de todos os itens armazenados, incluindo eletrônicos com lógica própria.
Remover Produto: Exclusão de itens do inventário utilizando índices dinâmicos
.
Tratamento de Erros: O sistema utiliza blocos try-catch para garantir que entradas inválidas (como letras em campos de preço) não travem a aplicação
.
Tecnologias Utilizadas
Linguagem: Java 26 (OpenJDK)
.
IDE: IntelliJ IDEA Community Edition
.
Ferramentas: Java Virtual Machine (JVM) para portabilidade e execução
.
Conceitos de Programação Aplicados
Para construir este sistema, apliquei conceitos fundamentais que demonstram uma base sólida em engenharia de software:
Encapsulamento: Utilizei modificadores de acesso private nos atributos das classes, protegendo os dados e permitindo o acesso apenas através de métodos Getters e Setters
.
Herança e Polimorfismo: Criei uma classe base Produto e uma subclasse Eletronico. A classe Eletronico herda os atributos de produto e sobrescreve (@Override) o método de desconto para aplicar regras específicas do setor
.
Interfaces: Implementei a interface Promocional para definir um contrato de comportamento que as classes de produtos devem seguir
.
Listas Dinâmicas: Empreguei o uso de ArrayList em vez de vetores fixos, permitindo que o estoque cresça ou diminua de acordo com a necessidade
.
Tipagem Forte: O projeto respeita a natureza fortemente tipada do Java, garantindo segurança na manipulação de inteiros, decimais e textos
