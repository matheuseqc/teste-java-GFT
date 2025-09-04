class Caneta {
    private String nome;
    private int quantidade;

    public Caneta(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void retirar(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
        } else {
            System.out.println("Não é possível retirar " + qtd + " unidades. Estoque insuficiente!");
        }
    }

    public void exibirDados() {
        System.out.println("Item: " + nome + ", Quantidade: " + quantidade);
    }
}
