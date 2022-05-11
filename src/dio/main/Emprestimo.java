package dio.main;

// classe de emprestimo

public class Emprestimo {


    public static double Duas_Parcelas() {

        return 1.10;
    }
    public static double Tres_Parcelas() {

        return 1.20;
    }

    public static void Calcular(int valor, int parcelas) {

        if (parcelas == 1) {
            System.out.println("O pagamento é à vista R$" + valor);

        }

        if (parcelas == 2 ) {

            double valor_final = valor * Duas_Parcelas();
            System.out.println("O pagamento terá taxa de 10% e ficará R$" + valor_final);
        }
        if (parcelas == 3) {

            double valor_final2 = valor * Tres_Parcelas();
            System.out.println("O pagamento terá taxa de 20% e ficará R$" + valor_final2);
        }
        else {
            System.out.println("Inexistente");
        }
        }


    }

