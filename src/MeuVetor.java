public class MeuVetor {
    private int[] elementos;
    private int tamanho; // Controla quantos elementos reais existem

    public MeuVetor(int capacidadeInicial) {
        this.elementos = new int[capacidadeInicial];
        this.tamanho = 0;
    }

    // TODO 1: Adicionar elemento ao final[cite: 1]
    public void adicionar(int elemento) {
        garantirEspaco();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    // TODO 2: Dobra o tamanho do array caso esteja cheio[cite: 1]
    private void garantirEspaco() {
        if (this.tamanho == this.elementos.length) {
            int[] novoArray = new int[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novoArray[i] = this.elementos[i];
            }
            this.elementos = novoArray;
        }
    }

    // TODO 3: Retornar o elemento de uma posição específica[cite: 1]
    public int obter(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        return this.elementos[posicao];
    }

    // TODO 4: Remover elemento de uma posição[cite: 1]
    public void remover(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    // ==================== DESAFIOS BÔNUS ====================

    // BÔNUS 1: Adicionar um elemento em uma posição específica[cite: 1]
    public void adicionarNoIndice(int indice, int elemento) {
        if (indice < 0 || indice > this.tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        garantirEspaco();
        for (int i = this.tamanho; i > indice; i--) {
            this.elementos[i] = this.elementos[i - 1];
        }
        this.elementos[indice] = elemento;
        this.tamanho++;
    }

    // BÔNUS 2: Remover a primeira ocorrência de um valor[cite: 1]
    public void removerPorValor(int valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == valor) {
                remover(i);
                break;
            }
        }
    }

    // BÔNUS 3: Verificar se um valor existe no vetor[cite: 1]
    public boolean contem(int elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    // BÔNUS 4: Sobrescrever toString()[cite: 1]
    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.tamanho; i++) {
            sb.append(this.elementos[i]);
            if (i < this.tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}