public class ProdutoIndustrializado extends Produto {
    private int quantidade;

    public ProdutoIndustrializado(String nome, double precoCusto, int quantidadeEstoque, int quantidade) {
        super(nome, precoCusto, quantidadeEstoque);
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPrecoVenda() {
        double precoVenda = precoCusto;

        if (quantidade <= 50) {
            precoVenda *= 1.12;
            precoVenda += quantidade * 0.35;
        } else if (quantidade <= 200) {
            precoVenda *= 1.105;
            precoVenda += quantidade * 0.30;
        } else {
            precoVenda *= 1.09;
            precoVenda += quantidade * 0.25;
        }

        precoVenda *= 1.05; // 5% de IPI
        precoVenda *= 1.12; // 12% de ICMS

        return precoVenda;
    }
}
