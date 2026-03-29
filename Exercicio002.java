import java.util.Scanner;


public class Exercicio002 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número\n ");
         int numero1 = scanner.nextInt(); 
        System.out.println("Informe o segundo número");

       int numero2 = scanner.nextInt(); 
  String maior = (numero1>numero2) ? " O número "+ numero1 + "é maior que o segundo , "+numero2+ "  " : "O segundo número "+ numero2+ " é maior que o primeiro, " + numero1 + "";
System.out.println(maior);
scanner.close();






    }






}