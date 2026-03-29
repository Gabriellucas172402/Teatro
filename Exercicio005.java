import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        double num = leitor.nextDouble();
         System.out.println("Informe outro numero: ");
        double num2 = leitor.nextDouble(); 
        System.out.println("Escolha uma operação: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = leitor.nextInt();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = num + num2;
                break;

            case 2:
                resultado = num - num2;
                break;

            case 3:
                resultado = num * num2;
                break;

            case 4:
                resultado = num / num2;
                break;
                
            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println("O resultado é: " + resultado);
        leitor.close();
    }
}