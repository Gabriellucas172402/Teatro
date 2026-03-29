import java.util.Scanner;

public class Exercicio019 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a valocidade: ");
        double velocidade = leitor.nextDouble();
        System.out.println("Informe o limite da via: ");
        double limite = leitor.nextDouble();
        String resultado = (velocidade == limite) ? "Sem multa" : (velocidade == 1.2 * limite) ? "Multa leve" : (velocidade > 1.2 * limite && velocidade <= 1.5 * limite) ? "Multa Grave" : (velocidade >= 1.5 * limite) ? "Multa Gravíssima + Suspensão" : "Dentro do limite";
        System.out.println(resultado);
        leitor.close();
    }
}