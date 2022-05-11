package dio.main;

//classe de mensagem de acordo com a hora do dia

public class Mensagem {

    public static void Envia (int hora) {
        switch (hora) {

            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Bom dia");
                break;

            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Boa Tarde");
                break;

            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Boa Noite");
                break;
            default:
                System.out.println("Hora Inválida");
                break;

        }


    }

}
