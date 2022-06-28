public class AppPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Fulano", 99, "001");
        Pessoa pessoa3 = new Pessoa("Beltrano", 17, "002", 54, 178);

        System.out.println(pessoa3.ehMaiorIdade());
        System.out.println(pessoa3.calcularIMC());
        System.out.printf(pessoa3.toString());
    }
}
