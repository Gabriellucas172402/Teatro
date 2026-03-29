import java.util.Scanner;

public class Exercicio014 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = leitor.nextDouble();
       System.out.println("Digite outro numero: ");
        double num2 = leitor.nextDouble();
         System.out.println("Digite outro numero: ");
        double num3 = leitor.nextDouble();
     String resultado = (num > num2 && num > num3) ? "O primeiro numero é maior" : (num2 > num && num2 > num3) ? "O segundo numero é maior" :(num3 > num && num3 > num2) ? "O terceiro numero é maior" : "Os numeros são iguais";
        System.out.println(resultado);

        leitor.close();
    }
}