package dio.main;

public class Main {
    public static void main(String[] args) {

// Calculadora


        System.out.println("Calculadora: ");
        Calculadora.Soma(3,4);
        Calculadora.Subtraçao(3,4);
        Calculadora.Multiplicaçao(3,4);
        Calculadora.Divisao(3,4);

        // Mensagem

        System.out.println("Mensagem: ");
        Mensagem.Envia(13);

        // Empréstimo

        System.out.println("Empréstimo: ");
        Emprestimo.Calcular(1500,2);

    }

}