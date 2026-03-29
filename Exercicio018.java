import java.util.Scanner;

public class Exercicio018 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero (1-10): ");
        int dia = leitor.nextInt();
        String nomeDia = "";

        switch (dia) {
            case 1:
                nomeDia = "I";
                break;

            case 2:
                nomeDia = "II";
                break;
            case 3:
                nomeDia = "III";
                break;
            case 4:
                nomeDia = "IV";
                break;
            case 5:
                nomeDia = "V";
                break;
            case 6:
                nomeDia = "VI";
                break;
            case 7:
                nomeDia = "VII";
                break;
            case 8:
                nomeDia = "VIII";
                break;
            case 9:
                nomeDia = "IX";
                break;
            case 10:
                nomeDia = "X";
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }

        System.out.println("O número informado é: " + nomeDia);
        leitor.close();
    }
}
    