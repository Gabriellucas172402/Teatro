import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe a " + (i + 1) + "ª nota: ");
            notas[i] = entrada.nextDouble();
        }

        double soma = notas[0] + notas[1] + notas[2] + notas[3];

        String res = (soma / 4 >= 7) ? "Aprovado"
                : (soma / 4 >= 5) && (soma / 4 < 7)
                ? "Recuperação"
                : (soma / 4 < 5) ? "Reprovado" : "Reprovado";

        System.out.println(res);

        entrada.close();
    }
}