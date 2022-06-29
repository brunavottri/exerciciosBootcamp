package Exercicio2;

public class Pereciveis extends Produto {
    int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    public double calcular(int quantidadeDeProdutos) {
        double precoCalc =  preco * quantidadeDeProdutos;
        if (diasParaVencer == 1) {
            setPreco(precoCalc/4);
        } else if ( diasParaVencer == 2) {
            setPreco(precoCalc/3);
        } else if ( diasParaVencer == 3) {
            setPreco(precoCalc/2);
        }
        return precoCalc;
    }
}
