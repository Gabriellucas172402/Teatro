import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um mês (1-12): ");
        double num = leitor.nextDouble();
        String resultado = (num >= 1 && num <= 2 && num == 12) ? "Verão" : (num >= 3 && num <= 5) ? "Outono" : (num >= 6 && num <= 8) ? "Inverno" : (num >= 9 && num <= 11) ? "Primavera" : "Mês inválido";
        System.out.println(resultado);

        leitor.close();
    }
}