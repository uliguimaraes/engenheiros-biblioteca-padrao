public class MinhaMatriz {
    private int[][] dados;
    private int linhas;
    private int colunas;

    public MinhaMatriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    // TODO 1: Inserir valor em uma linha e coluna específicas[cite: 1]
    public void setValor(int linha, int coluna, int valor) {
        if (linha < 0 || linha >= this.linhas || coluna < 0 || coluna >= this.colunas) {
            throw new IndexOutOfBoundsException("Posição inválida na matriz.");
        }
        this.dados[linha][coluna] = valor;
    }

    // TODO 2: Retornar valor de uma coordenada[cite: 1]
    public int getValor(int linha, int coluna) {
        if (linha < 0 || linha >= this.linhas || coluna < 0 || coluna >= this.colunas) {
            throw new IndexOutOfBoundsException("Posição inválida na matriz.");
        }
        return this.dados[linha][coluna];
    }

    // TODO 3: Preencher a matriz inteira com um valor padrão[cite: 1]
    public void preencher(int valorPadrao) {
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                this.dados[i][j] = valorPadrao;
            }
        }
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    // ==================== DESAFIOS BÔNUS ====================

    // BÔNUS 1: Retornar nova matriz com a soma das duas[cite: 1]
    public MinhaMatriz somar(MinhaMatriz outra) {
        if (this.linhas != outra.getLinhas() || this.colunas != outra.getColunas()) {
            return null;
        }
        MinhaMatriz resultado = new MinhaMatriz(this.linhas, this.colunas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                resultado.setValor(i, j, this.dados[i][j] + outra.getValor(i, j));
            }
        }
        return resultado;
    }

    // BÔNUS 2: Somar valores de uma linha[cite: 1]
    public int somarLinha(int linha) {
        if (linha < 0 || linha >= this.linhas) {
            throw new IndexOutOfBoundsException("Linha inválida.");
        }
        int soma = 0;
        for (int j = 0; j < this.colunas; j++) {
            soma += this.dados[linha][j];
        }
        return soma;
    }

    // BÔNUS 3: Somar valores de uma coluna[cite: 1]
    public int somarColuna(int coluna) {
        if (coluna < 0 || coluna >= this.colunas) {
            throw new IndexOutOfBoundsException("Coluna inválida.");
        }
        int soma = 0;
        for (int i = 0; i < this.linhas; i++) {
            soma += this.dados[i][coluna];
        }
        return soma;
    }

    // BÔNUS 4: Retornar o maior valor da matriz[cite: 1]
    public int obterMaior() {
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                if (this.dados[i][j] > maior) {
                    maior = this.dados[i][j];
                }
            }
        }
        return maior;
    }

    // BÔNUS 5: Retornar o menor valor da matriz[cite: 1]
    public int obterMenor() {
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                if (this.dados[i][j] < menor) {
                    menor = this.dados[i][j];
                }
            }
        }
        return menor;
    }

    // BÔNUS 6: Calcular a média da matriz[cite: 1]
    public double calculaMedia() {
        double soma = 0;
        int totalElementos = this.linhas * this.colunas;
        if (totalElementos == 0) return 0.0;

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                soma += this.dados[i][j];
            }
        }
        return soma / totalElementos;
    }

    // BÔNUS 7: Sobrescrever toString()[cite: 1]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                sb.append(this.dados[i][j]);
                if (j < this.colunas - 1) {
                    sb.append(" ");
                }
            }
            if (i < this.linhas - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
