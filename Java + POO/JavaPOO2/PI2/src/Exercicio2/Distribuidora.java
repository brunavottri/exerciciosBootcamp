package Exercicio2;

public class Distribuidora {
    public static void main(String[] args) {
        Pereciveis[] produtosPereciveis = new Pereciveis[5];
        NaoPereciveis[] produtosNaoPereciveis = new NaoPereciveis[5];

        produtosPereciveis[0] = new Pereciveis("queijo", 8.90,1);
        produtosPereciveis[1] = new Pereciveis("laranja", 2, 3);
        produtosPereciveis[2] = new Pereciveis("ovos", 13, 5);
        produtosPereciveis[3] = new Pereciveis("alface", 2.90, 2);
        produtosPereciveis[4] = new Pereciveis("uva", 5, 4);

        produtosNaoPereciveis[0] = new NaoPereciveis("arroz", 4.50, "alimento");
        produtosNaoPereciveis[1] = new NaoPereciveis("detergente", 2, "produto de limpeza");
        produtosNaoPereciveis[2] = new NaoPereciveis("papel higienico", 10, "higiene pessoal");
        produtosNaoPereciveis[3] = new NaoPereciveis("creme dental", 2, "higiene pessoal");
        produtosNaoPereciveis[1] = new NaoPereciveis("bolacha", 3, "alimento");
    }
}
