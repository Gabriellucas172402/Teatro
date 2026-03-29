import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = leitor.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        String resultado = (imc >= 18.5) && (imc < 25) ? "Dentro da faixa saudavel" : "Sobrepeso" ;
        System.out.println(resultado);
        leitor.close();
    }
}