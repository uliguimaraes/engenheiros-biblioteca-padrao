# 🚀 Engenheiros da Biblioteca Padrão (Vetor Dinâmico & Matriz em Java)

Este projeto foi desenvolvido como parte de uma atividade prática sobre **Estruturas de Dados Básicas e Programação Orientada a Objetos em Java**, aplicando a metodologia de **Pair Programming** (Trabalho em Dupla).

O objetivo principal é criar classes base para **Vetor Dinâmico** (simulando um `ArrayList`) e **Matriz Bidimensional**, construindo a lógica de alocação, redistribuição de memória e manipulação de índices do zero — **sem utilizar coleções nativas como `ArrayList`**.

---

## 📁 Estrutura do Projeto

```text
src/
├── MeuVetor.java      # Implementação da estrutura de Vetor Dinâmico
├── MinhaMatriz.java   # Implementação da estrutura de Matriz 2D
├── MainVetor.java     # Testes automatizados e validações para o MeuVetor
└── MainMatriz.java    # Testes automatizados e validações para a MinhaMatriz
```

---

## 🛠️ Funcionalidades Implementadas

### 1. `MeuVetor` (Vetor Dinâmico)
A classe `MeuVetor` gerencia um array interno de inteiros que redimensiona dinamicamente conforme novos elementos são inseridos.

* **Obrigatórios (TODOs):**
  * `adicionar(int elemento)`: Adiciona um elemento ao final do vetor (redimensiona se cheio).
  * `garantirEspaco()`: Dobra a capacidade do array interno quando atinge o limite.
  * `obter(int posicao)`: Retorna o elemento em um índice (lança exceção se inválido).
  * `remover(int posicao)`: Remove o elemento da posição e desloca os subsequentes para a esquerda.
* **Desafios Bônus:**
  * `adicionarNoIndice(int indice, int elemento)`: Insere um elemento em posição específica deslocando os demais para a direita.
  * `removerPorValor(int valor)`: Localiza e remove a primeira ocorrência de um valor.
  * `contem(int elemento)`: Retorna `true` se o valor existir no vetor.
  * `toString()`: Formata a exibição do vetor no padrão `[10, 20, 30]`.

---

### 2. `MinhaMatriz` (Matriz 2D)
A classe `MinhaMatriz` encapsula uma matriz bidimensional (`int[][]`) oferecendo operações utilitárias e estatísticas.

* **Obrigatórios (TODOs):**
  * `setValor(int linha, int coluna, int valor)`: Insere um valor na coordenada informada (com validação de limites).
  * `getValor(int linha, int coluna)`: Retorna o valor de uma coordenada.
  * `preencher(int valorPadrao)`: Preenche todas as células com um valor específico.
* **Desafios Bônus:**
  * `somar(MinhaMatriz outra)`: Retorna uma nova matriz fruto da soma matricial.
  * `somarLinha(int linha)` / `somarColuna(int coluna)`: Soma os valores de uma linha ou coluna específica.
  * `obterMaior()` / `obterMenor()`: Retorna o maior ou menor elemento contido na matriz.
  * `calculaMedia()`: Retorna a média aritmética de todos os elementos da matriz.
  * `toString()`: Formata a matriz linha por linha para exibição no console.

---

## 💻 Como Executar

### Pré-requisitos
* **Java Development Kit (JDK)** versão 8 ou superior.
* IDE de sua preferência (IntelliJ IDEA, VS Code, Eclipse) ou terminal.

### Passos
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/engenheiros-biblioteca-padrao.git
   cd engenheiros-biblioteca-padrao
   ```

2. **Compilar os arquivos Java:**
   ```bash
   javac -d bin src/*.java
   ```

3. **Executar os testes do Vetor:**
   ```bash
   java -cp bin MainVetor
   ```

4. **Executar os testes da Matriz:**
   ```bash
   java -cp bin MainMatriz
   ```

---

## 👥 Metodologia: Pair Programming
Este projeto foi construído utilizando a prática de **Pair Programming**:
* **Piloto:** Digita o código e foca na sintaxe/execução imediata.
* **Copiloto / Navegador:** Revisa a lógica em tempo real, consulta a documentação e antecipa exceções/casos de borda.
* Houve alternância periódica dos papéis para garantir que ambos dominassem a lógica do vetor dinâmico e das matrizes.

---

## 📜 Licença
Este projeto é de uso acadêmico/educacional.
