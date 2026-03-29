import java.util.Scanner;

public class Exercicio009 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um dia da semana (1-7): ");
        int dia = leitor.nextInt();
        String nomeDia = "";

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;

            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }

        System.out.println("O dia informado é: " + nomeDia);
        leitor.close();
    }
}
    