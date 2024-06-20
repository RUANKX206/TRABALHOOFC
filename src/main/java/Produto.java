public  class Produto {

    protected String nome;

    protected double precoCusto;

    protected int quantidade;

    public Produto(String nome, double precoCusto, int quantidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.quantidade = quantidade;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
