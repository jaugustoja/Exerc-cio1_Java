package dio.main;

//classe calculadora de exmplo para a aula

public class Calculadora {

    public static void Soma (double num1,double num2) {

        double s = num1 + num2;
        System.out.println("A soma de " + num1 + " e " + num2 + " é " + s);
    }

    public static void Subtraçao (double num1, double num2) {

        double s = num1 - num2;
        System.out.println("A subtraçao de " + num1 + " e " + num2 + " é " + s);
    }

    public static void Multiplicaçao (double num1, double num2) {

        double m = num1 * num2;
        System.out.println("A multiplicação de "+ num1 + " e " + num2 + " é " + m);

    }

    public static void Divisao (double num1, double num2) {

        double d = num1 / num2;
        System.out.println("A divisão de " + num1 + " e " + num2 + " é " + d);

    }
}
