import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o primeiro lado de um triângulo: ");
        double num = leitor.nextDouble();
        System.out.println("Informe o segundo lado de um triângulo: ");
        double num2 = leitor.nextDouble();
        System.out.println("Informe o terceiro lado de um triângulo: ");
        double num3 = leitor.nextDouble();
        String resultado = (num == num2 && num2 == num3) ? "O triângulo é equilátero" : (num == num2 || num2 == num3 || num == num3) ? "O triângulo é isósceles" : "O triângulo é escaleno";
        System.out.println(resultado);

        leitor.close();
    }
}