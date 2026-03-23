import java.util.Scanner;


 class Sala {
    String nome;
    String[]  nome_espetaculo= new String[10];      
    double preco;
   
  char[][] lugares = new char[12][12];
int[] colunas = new int[12];
String[] li= new String[12];

public void inicializar() {
    for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
            lugares[i][j] = ' ';
        }
    }



}

public void mostrarResumo() {
    int livres = 0;
    int reservados = 0;
    int ocupados = 0;

    for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {

            if (lugares[i][j] == ' ') {
                livres++;
            } else if (lugares[i][j] == 'R') {
                reservados++;
            } else if (lugares[i][j] == 'X') {
                ocupados++;
            }

        }
    }

    System.out.println("\nResumo da sala:");
    System.out.println("Livres: " + livres);
    System.out.println("Reservados: " + reservados);
    System.out.println("Ocupados: " + ocupados);
}







public void comprarLugar(int linha, int coluna) {
    if (lugares[linha][coluna] == ' ') {
        lugares[linha][coluna] = 'X';
        System.out.println("Lugar comprado com sucesso!");
    } else if (lugares[linha][coluna] == 'R') {
        lugares[linha][coluna] = 'X';
        System.out.println("Reserva convertida em compra!");
    } else if (lugares[linha][coluna] == 'X') {
        System.out.println("Lugar já está ocupado!");
    }
}


public void exibirSala() {

    System.out.println("===========================================");
    System.out.println("  SALA: " + nome);
    System.out.println("  ESPETÁCULO: " + nome_espetaculo[0]);
    System.out.println("===========================================");

    System.out.print("     ");
    for (int j = 1; j <= 12; j++) {
        System.out.printf("%-4d", j);
    }
    System.out.println();

    int livres = 0, reservadas = 0, ocupadas = 0;

    for (int i = 0; i < 12; i++) {
        char linha = (char) ('A' + i);
        System.out.print("  " + linha + "  ");

        for (int j = 0; j < 12; j++) {
            char estado = lugares[i][j];

            
            char simbolo = (estado == ' ') ? ' ' : estado;

            System.out.print("[" + simbolo + "]");

   
            if (estado == ' ') livres++;
            else if (estado == 'R') reservadas++;
            else if (estado == 'X') ocupadas++;
        }
        System.out.println();
    }

    System.out.println("\n  [ ] Livre   [R] Reservada   [X] Ocupada");
    System.out.println("  Livres: " + livres +
                       " | Reservadas: " + reservadas +
                       " | Ocupadas: " + ocupadas);

    System.out.println("===========================================");
}




public void reservarLugar(int linha, int coluna) {
    if (lugares[linha][coluna] == ' ') {
        lugares[linha][coluna] = 'R';
        System.out.println("Lugar reservado com sucesso!");
    } else {
        System.out.println("Lugar já ocupado!");
    }
}


}
 class Menu_01 {

    public static void dizerOla() {
        System.out.println("Olá! Tudo bem?");
    }
}



 class ValidaEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        boolean valido = false;

        do {
            System.out.print("Informe apenas uma letra: ");
            entrada = scanner.nextLine();

      
            if (entrada.length() == 1) {

                System.out.println("Ativação permitida. Letra: " + entrada);

                valido = true; 

            } else {
                System.out.println("Erro: Você informou mais de uma letra ou nenhum valor.");
                System.out.println("Por favor, tente novamente.");
            }
        } while (!valido);

  Sala sala = new Sala();
  sala.inicializar();
sala.exibirSala();



        scanner.close();
    }
}



public class Teatro {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in); 
 int resposta=0 ;      
Sala sala = new Sala();
sala.inicializar();



 do{
            System.out.println("1-Escolha uma sala: ");
            System.out.println("2-Ver compras/reservas: ");
            System.out.println("3-Espetaculos");
            System.out.println("4-cancelar uma reserva");
            System.out.println("5-");
            System.out.println("6-");

            System.out.println("7-Menu de Exercícios ");
            System.out.println("0 - Sair");
             resposta = scanner.nextInt(); 

          switch (resposta) {
          case 1:
            sala.exibirSala();

System.out.println("Escolha a linha (A a L): ");
char linhaChar = scanner.next().toUpperCase().charAt(0);
int linha = linhaChar - 'A';

System.out.println("Escolha a coluna (1 a 12): ");
int coluna = scanner.nextInt();
coluna = coluna - 1;
if (linha >= 0 && linha < 12 && coluna >= 0 && coluna < 12) {
    sala.reservarLugar(linha, coluna);
} else {
    System.out.println("Posição inválida!");
}

           

    
          break;
 case 2:
    sala.exibirSala();

    System.out.println("Escolha a linha (A a L): ");
    char linhaChar2 = scanner.next().toUpperCase().charAt(0);
    int linha2 = linhaChar2 - 'A';

    System.out.println("Escolha a coluna (1 a 12): ");
    int coluna2 = scanner.nextInt() - 1;

    if (linha2 >= 0 && linha2 < 12 && coluna2 >= 0 && coluna2 < 12) {
        sala.comprarLugar(linha2, coluna2);
    } else {
        System.out.println("Posição inválida!");
    }



    break;
       
case 3:
    sala.mostrarResumo();
    break;





            case 4:
    sala.exibirSala();

    System.out.println("Escolha a linha (A a L): ");
    char linhaChar3 = scanner.next().toUpperCase().charAt(0);
    int linha3 = linhaChar3 - 'A';

    System.out.println("Escolha a coluna (1 a 12): ");
    int coluna3 = scanner.nextInt() - 1;

    if (linha3 >= 0 && linha3 < 12 && coluna3 >= 0 && coluna3 < 12) {
        sala.cancelarReserva(linha3, coluna3);
    } else {
        System.out.println("Posição inválida!");
    }
    break;

 
        default:
        
}

 } while(resposta!=0)






    
       
        
    
        
        scanner.close(); 
    }
}



/*

===========================================
  SALA: Sala Beethoven
  ESPETÁCULO: O Fantasma da Ópera
===========================================

      1    2    3    4    5    6    7    8    9   10   11   12
  A  [ ]  [ ]  [ ]  [R]  [ ]  [ ]  [X]  [ ]  [ ]  [ ]  [ ]  [ ]
  B  [ ]  [X]  [ ]  [ ]  [ ]  [R]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]
  C  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]
  ...
  L  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ]

  [ ] Livre   [R] Reservada   [X] Ocupada
  Livres: 140 | Reservadas: 2 | Ocupadas: 2


