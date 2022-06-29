package Exercicio1;

public class AppPraticaExcecoes {
    public static void main(String[] args) {
        PraticaExcecoes pratica1 = new PraticaExcecoes();

//        System.out.println(pratica1.divideBPerA());

        try {
            pratica1.divideBPerA();
        } catch (ArithmeticException exception) {
//          System.out.println("Ocorreu um erro");
            throw new IllegalArgumentException("Não pode ser divido por zero");
        } finally {
            System.out.println("Programa Finalizado");
        }
    }
}
