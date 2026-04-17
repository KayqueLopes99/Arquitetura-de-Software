## Introdução à Arquitetura de Software
> A arquitetura é a ponte entre metas de negócio abstratas e um sistema resultante concreto;

> Pode ser projetada, analisada, documentada e rastreada.

### **O que é Arquitetura de Software?**
- A arquitetura de software de um sistema é o conjunto de estruturas necessárias para raciocinar sobre o sistema. Estas estruturas incluem elementos de software, relacionamentos entre eles, e as propriedades de ambos.

### **Arquitetura é um Conjunto de Estruturas**

* Uma estrutura é um conjunto de elementos colocados em um grupo por alguma relação.
* Sistemas de software são compostos por muitas estruturas, e nenhuma delas isoladamente pode alegar ser "A Arquitetura".
* Estruturas arquiteturais podem ser organizadas em três categorias principais:
* Estruturas de Componentes & Conectores.
* Estruturas de Módulo.
* Estruturas de Alocação.



### **Arquitetura é uma Abstração**

* Descreve o sistema em alto nível, sem todos os detalhes de design.
* Serve como uma visão simplificada para lidar com a complexidade, mostrando os elementos principais e como interagem.
* Permite a compreensão do sistema.
* Futuro.

> *"A arquitetura abstrai a complexidade para focar no essencial."*

- Arquitetura versus Design:
* Arquitetura foca em decisões estruturais de alto impacto; Design trata dos detalhes de implementação.
* As fronteiras não são rígidas: arquitetura e design se complementam.

> *"Arquitetura é design, mas nem todo design é arquitetura."*

### Todo sistema de software possui uma Arquitetura

* Mesmo sistemas pequenos e sem documentação possuem decisões arquiteturais implícitas.
* Essas decisões afetam qualidade, desempenho e manutenção. 
- *"Toda implementação de software reflete escolhas arquiteturais, conscientes ou não."*

---

## Estruturas Arquiteturais e Visões

Um sistema é descrito por múltiplas estruturas, e nenhuma delas isoladamente captura toda a arquitetura. Uma **visão arquitetural** é a projeção de uma dessas estruturas usada para comunicar decisões de design, já que diferentes *stakeholders* precisam de perspectivas diferentes do sistema.

### 1. Componentes e Conectores (C&C)

Foca em como os elementos interagem em **tempo de execução**, sendo essencial para analisar desempenho, confiabilidade e gargalos.

* **Componentes:** Unidades de execução ou armazenamento (processos, serviços, bancos de dados).
* **Conectores:** Mecanismos de interação entre componentes (chamadas de procedimento, APIs, mensagens, protocolos).
* **Estrutura de Serviço:** Organiza serviços independentes que se comunicam via interfaces bem definidas (fundamental para microsserviços).
* **Estrutura de Concorrência:** Mostra execução em paralelo (threads, processos), ajudando a analisar sincronização e pontos críticos.

### 2. Estruturas de Módulos

Foca na decomposição **estática** do sistema, agrupando elementos que mudam juntos (pacotes, bibliotecas). É vital para atribuir responsabilidades e organizar o trabalho da equipe.
> Estruturas:
* **Decomposição:** Árvore hierárquica que divide o sistema em partes menores.
* **Uso:** Mapeamento de dependências (se o módulo A "usa" B, A depende de B), avaliando o acoplamento.
* **Camadas:** Níveis hierárquicos onde cada camada oferece serviços à camada superior (ex: Apresentação → Negócio → Persistência → Infrestrutura).
* **Classes:** Organização estática de herança e composição, perfeita para estruturar sistemas orientados a objetos em Java.
* **Modelo de Dados:** Foco nos dados persistentes e suas relações, essencial para modelagem e integridade em bancos de dados SQL. Mostra entidades, atributos e associações (ex.: ER diagramas).

### 3. Estruturas de Alocação
Foca em como os elementos de software são mapeados para o **ambiente externo** físico ou organizacional. Ex: Organização em diretórios ou arquivos.


* **Implantação (Deployment):** Mapeamento do software para o hardware (servidores, contêineres, nuvem), vital para escalabilidade. Destaca interações de rede, dependências e restrições de recursos.

* **Implementação:** Organização prática dos artefatos e código-fonte (diretórios, módulos de build).
* **Atribuição de Trabalho:** Distribuição de tarefas e módulos específicos entre as equipes ou indivíduos responsáveis.

---

## Resumo dos Relacionamentos

| Categoria | Foco | Principais Questões |
| --- | --- | --- |
| **Componentes e Conectores** | Comportamento em tempo de execução | Como os elementos interagem? Como lidar com concorrência e falhas? |
| **Módulos** | Organização estática do software | Como o sistema é decomposto? Quais dependências existem? Como atribuir responsabilidades? |
| **Alocação** | Mapeamento para o ambiente físico/externo | Onde o software será implantado? Como recursos e equipes suportam o sistema? |

---

## Definindo a Arquitetura

### Menos é Melhor (Simplicidade)

* Arquiteturas simples reduzem a complexidade e os riscos, evitando a sobreengenharia.
* Focar no essencial facilita a compreensão, a manutenção e a evolução do sistema, além de permitir decisões mais ágeis.

### Quais Estruturas Escolher?

A escolha das estruturas deve focar em comunicar apenas as decisões importantes. 
- A escolha depende das respostas que se busca:

* **Performance e falhas**  Estruturas de Componentes e Conectores.
* **Organização estática e responsabilidades**  Estruturas de Módulos.
* **Implantação, hardware e equipes**  Estruturas de Alocação.

### Padrões Arquiteturais

São soluções recorrentes para problemas comuns que documentam boas práticas de organização e reduzem riscos na tomada de decisão. Exemplos clássicos incluem:

* **Layered (Camadas):**

* **Client-Server (Cliente-Servidor):**

* **Publish-Subscribe (Publicação-Assinatura):**

### O que faz uma "Boa Arquitetura"?

O principal critério de uma boa arquitetura é a sua **capacidade de ser avaliada**. É preciso analisar de forma contínua se ela é adequada para atender aos objetivos e requisitos de qualidade do sistema.

### Recomendações de Processo (Como criar)

1. **Integridade técnica:** A arquitetura deve ser definida.
2. **Foco na qualidade:** A base da arquitetura deve nascer dos requisitos de qualidade do sistema.
3. **Documentação:** Deve ser documentada.
4. **Avaliação contínua:** Deve ser avaliada pela sua capacidade de atender aos requisitos definidos.
5. **Implementação incremental:** O processo deve favorecer entregas graduais.

### Recomendações de Produto (O que entregar)

1. **Definição clara:** Módulos devem ter responsabilidades e interfaces bem definidas.
2. **Uso do que já funciona:** Atributos de qualidade geralmente são alcançados utilizando padrões de projeto.
3. **Independência tecnológica:** A arquitetura nunca deve depender diretamente de uma versão específica de um produto
4. **Desacoplamento de dados:** Módulos que produzem dados devem ser separados dos que os consomem.
6. **Flexibilidade de execução:** Processos devem ser escritos para que seu executor seja facilmente modificado.
8. **Restrições claras:** Adote um conjunto pequeno de restrições bem especificadas.

---


## A Importância da Arquitetura de Software

A arquitetura representa as decisões mais fundamentais e críticas de um sistema. Ela atua como o alicerce do projeto e traz impactos profundos em diversas áreas:

### 1. Atributos de Qualidade e Previsibilidade

* **Viabiliza Qualidade:** Influencia diretamente atributos como desempenho, segurança, confiabilidade e manutenibilidade.
* **Previsibilidade:** Permite prever o comportamento do sistema e identificar riscos *antes* da implementação completa, utilizando análises, simulações e protótipos.
* **Trade-offs:** Ajuda a tomar decisões conscientes quando atributos entram em conflito (ex: desempenho *vs.* segurança).

### 2. Comunicação e Alinhamento

* **Linguagem Comum:** Fornece uma representação compartilhada que facilita a comunicação entre todos os *stakeholders* (desenvolvedores, gerentes, clientes, operações).
* **Negociação:** Facilita a discussão de decisões de design, reduzindo mal-entendidos e alinhando expectativas.

### 3. Decisões Precoces e Restrições de Design

* **Custo da Mudança:** Captura as decisões que são mais difíceis e caras de serem alteradas tardiamente no projeto.
* **Restrição de Alternativas:** Define limites (linguagens, frameworks, protocolos) e restringe o "vocabulário de design". Isso evita escolhas incoerentes, reduz a complexidade e garante a consistência do código.

### 4. Gestão de Mudanças e Desenvolvimento Incremental

* **Evolução Segura:** Fornece uma base para raciocinar sobre o impacto de novos requisitos ou mudanças tecnológicas, minimizando efeitos colaterais indesejados.
* **Entregas Graduais:** Viabiliza o desenvolvimento incremental e paralelo, permitindo integração contínua e validação precoce sem comprometer a integridade do sistema.

### 5. Impacto Organizacional e Treinamento

* **Estrutura das Equipes:** A arquitetura dita como as equipes e responsabilidades são distribuídas (ou vice-versa). Ela dita a comunicação entre os grupos, podendo promover eficiência ou criar silos.
* **Onboarding:** Serve como a principal referência de documentação e contexto, acelerando drasticamente o treinamento e a integração de novos membros na equipe.

### 6. Planejamento de Custos e Prazos

* **Estimativas Precisas:** É o artefato-chave que permite a arquitetos e gerentes avaliarem a complexidade, as dependências e os recursos necessários, reduzindo surpresas financeiras e atrasos.

### 7. Reuso e Integração de Componentes
- Arquitetura suporta integração de componentes externos ou paralelos.
* **Modelos Transferíveis:** Uma boa arquitetura pode ser reaproveitada como modelo base para novos projetos ou linhas de produtos, poupando tempo e custo.
* **Integração de Terceiros:** Define interfaces e protocolos claros que permitem incorporar facilmente módulos externos, APIs ou elementos desenvolvidos por equipes independentes.

Aqui está a última parte das suas anotações, enxuta e direto ao ponto para fechar a Aula 01 com chave de ouro!

---

## Leis da Arquitetura de Software
### Primeira Lei: Tudo é um *Trade-off*
> *"Tudo em uma Arquitetura de Software é um trade-off."*
- Trade-off é um conceito de tomada de decisão que envolve uma troca ou renúncia: ao escolher uma opção (ganho), perde-se os benefícios de outra (custo de oportunidade).

* A arquitetura busca sempre atender aos requisitos de qualidade, mas é um erro analisar esses atributos de forma isolada.
* Tudo exige escolhas e concessões. Atributos como desempenho, segurança e manutenibilidade frequentemente entram em conflito e precisam ser rigorosamente priorizados e balanceados.

### Segunda Lei: O "Porquê" importa mais que o "Como"
* Para garantir a qualidade e o alinhamento com os requisitos, as principais decisões arquiteturais devem ser obrigatoriamente documentadas.
* A partir do momento em que a decisão estrutural está tomada e bem fundamentada, a forma exata como a arquitetura será implementada no código torna-se uma preocupação secundária.