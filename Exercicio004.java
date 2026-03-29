import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Celsius: ");
        double num = leitor.nextDouble();
     String resultado = (num >= 25) ? "Está muito quente" : (num > 15) && (num < 25) ? "Está agradável" : "Está frio";
        System.out.println(resultado);
        leitor.close();
    }
}