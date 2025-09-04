class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String saudacao() {
        return "Olá, sou " + nome;
    }
}

class Cliente extends Pessoa {
    private int fidelidade;

    public Cliente(String nome, int fidelidade) {
        super(nome);
        this.fidelidade = fidelidade;
    }

    @Override
    public String saudacao() {
        return super.saudacao() + ", cliente número " + fidelidade + ".";
    }
}


