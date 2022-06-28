public class Pessoa {
    String nome;
    int idade;
    String ID;
    float peso;
    float altura;

    public Pessoa () {
    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC(float altura, float peso) {
        float IMCCalc = peso / (altura * altura);
        if (IMCCalc < 20) {
            return "Abaixo do peso";
        }
        if (IMCCalc > 25) {
            return "SobrePeso";
        }
        return "Peso Saudável";
    }

    public boolean ehMaiorIdade(int idade) {
        if (idade > 18) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "" + nome + this.idade + this.ID + this.peso + this.altura;
    }



    public static void Main (String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Fulano", 99, "01");
        Pessoa pessoa3 = new Pessoa("Fulano", 99, "01", 54, 178);
//        Pessoa pessoa4 = new Pessoa("Beltrano", "17");

        pessoa3.ehMaiorIdade(pessoa3.idade);
    }

}
