import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        double num = leitor.nextDouble();
        String resultado = (num > 0) ? "O valor é positivo" : (num < 0) ? "O valor é negativo" : "O valor é zero";
        System.out.println(resultado);

        leitor.close();
    }
}