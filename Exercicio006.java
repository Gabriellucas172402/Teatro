import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o ano: ");
        int ano = leitor.nextInt();
        String resultado = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? "O ano é bissexto" : "O ano não é bissexto";
        System.out.println(resultado);
        leitor.close();
    }
}

