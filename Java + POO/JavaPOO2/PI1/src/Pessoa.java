public class Pessoa {
    public String nome;
    public int idade;
    public String ID;
    public float peso;
    public float altura;

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

    public String calcularIMC() {
        float IMCCalc = peso / (altura * altura);
        if (IMCCalc < 20) {
            return "Abaixo do peso";
        }
        if (IMCCalc > 25) {
            return "SobrePeso";
        }
            return "Peso Saudável";
    }

    public boolean ehMaiorIdade() {
        return idade > 18;
    }

    public String toString() {
        float alturaEmMetros = altura/100;
        return String.format("Nome:%s, idade:%d, ID:%s, peso:%d, altura:%d", nome, idade, ID, Math.round(peso), Math.round(altura));
    }
}
