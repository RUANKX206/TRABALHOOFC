public class ProdutoAgricola extends Produto {
    private double pesoKg;

    public ProdutoAgricola(String nome, double precoCusto, int quantidade, double pesoKg) {
        super(nome, precoCusto, quantidade);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPrecoVenda() {
        double precoVenda = precoCusto;

        if (pesoKg <= 100) {
            precoVenda *= 1.08;
            precoVenda += pesoKg * 0.10;
        } else if (pesoKg <= 200) {
            precoVenda *= 1.05;
            precoVenda += pesoKg * 0.08;
        } else {
            precoVenda *= 1.035;
            precoVenda += pesoKg * 0.05;
        }

        return precoVenda;
    }
}
