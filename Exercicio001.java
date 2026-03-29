import java.util.Scanner;


public class Exercicio001 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número ");
       int numero = scanner.nextInt(); 
  String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
System.out.println("O número " + numero + " é " + resultado);
scanner.close();






    }






}