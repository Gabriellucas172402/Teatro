import java.util.Scanner;

public class Exercicio016 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        double numero = leitor.nextDouble();
        String resultado = (numero % 3 == 0) && (numero % 5 == 0) ? "O numero é um multiplo de 3 e de 5 simultaneamente" : (numero % 5 == 0) ? "O numero é um multiplo de 5" : (numero % 3 == 0) ? "O numero é um multiplo de 3" : "O numero não é um multiplo nem de 3 e nem de 5";
        System.out.println(resultado);
        leitor.close();
    }
}