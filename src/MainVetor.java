public class MainVetor {
    public static void main(String[] args) {
        MeuVetor vetor = new MeuVetor(2); // capacidade inicial pequena de propósito, para forçar o crescimento

        System.out.println("=== Testando métodos obrigatórios ===");

        // TODO 1 e TODO 2: adicionar() + garantirEspaco()
        vetor.adicionar(10);
        vetor.adicionar(20);
        vetor.adicionar(30); // aqui o vetor deve crescer sozinho (capacidade era 2)
        System.out.println("Tamanho esperado: 3 | Tamanho obtido: " + vetor.getTamanho());

        // TODO 3: obter()
        System.out.println("Elemento na posição 1 (esperado 20): " + vetor.obter(1));

        try {
            vetor.obter(10); // posição inválida
            System.out.println("ERRO: deveria ter lançado exceção para posição inválida");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("OK: exceção lançada corretamente para posição inválida");
        }

        // TODO 4: remover()
        vetor.remover(0); // remove o 10
        System.out.println("Após remover posição 0, tamanho esperado 2 | obtido: " + vetor.getTamanho());
        System.out.println("Elemento na posição 0 agora (esperado 20): " + vetor.obter(0));

        System.out.println("\n=== Testando métodos BÔNUS ===");

        // BÔNUS 1: adicionarNoIndice()
        vetor.adicionarNoIndice(1, 99); // esperado: [20, 99, 30]
        System.out.println("Após adicionarNoIndice (1, 99), elemento na posição 1 (esperado 99): " + vetor.obter(1));

        // BÔNUS 3: contem()
        System.out.println("contem(99) esperado true: " + vetor.contem(99));
        System.out.println("contem(1000) esperado false: " + vetor.contem(1000));

        // BÔNUS 2: removerPorValor()
        vetor.removerPorValor(99); // esperado: [20, 30]
        System.out.println("Após removerPorValor(99), contem(99) esperado false: " + vetor.contem(99));

        // BÔNUS 4: toString() / listar
        System.out.println("Vetor final (esperado algo como [20, 30]): " + vetor);
    }
}