import java.util.Scanner;

public class Exercicio017 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor da compra: ");
        double num = leitor.nextDouble();
        String resultado = (num > 500) ? "Desconto de 20%" : (num >= 200 && num <= 500) ? "Desconto de 10%" : "Sem desconto";
        System.out.println(resultado);

        leitor.close();
    }
}