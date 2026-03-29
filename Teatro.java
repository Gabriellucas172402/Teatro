import java.util.Scanner;
import java.util.Random;

class Sala {
    String nome;
    String espetaculo;
    double preco;
    char[][] lugares = new char[12][12];

    public void inicializar(String nomeSala, String nomeShow, double precoBase) {
        this.nome = nomeSala;
        this.espetaculo = nomeShow;
        this.preco = precoBase;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                lugares[i][j] = ' ';
            }
        }
    }

    public void gerarSimulacao() {
        Random rand = new Random();
        // Limpa a sala antes de simular para não acumular
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) lugares[i][j] = ' ';
        }
        
        int totalOcupados = rand.nextInt(145); 
        for (int i = 0; i < totalOcupados; i++) {
            int l = rand.nextInt(12);
            int c = rand.nextInt(12);
            if (lugares[l][c] == ' ') {
                lugares[l][c] = (rand.nextInt(2) == 0) ? 'R' : 'X';
            }
        }
    }

    public void exibirSala() {
        System.out.println("===========================================");
        System.out.println("  SALA: " + nome);
        System.out.println("  ESPETÁCULO: " + espetaculo);
        System.out.println("===========================================");
        System.out.print("      ");
        for (int j = 1; j <= 12; j++) System.out.printf("%-4d", j);
        System.out.println();

        for (int i = 0; i < 12; i++) {
            System.out.print("  " + (char) ('A' + i) + "  ");
            for (int j = 0; j < 12; j++) {
                System.out.print("[" + lugares[i][j] + "] ");
            }
            System.out.println();
        }
        mostrarResumo();
    }

    public void mostrarResumo() {
        int livres = 0, reservados = 0, ocupados = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (lugares[i][j] == ' ') livres++;
                else if (lugares[i][j] == 'R') reservados++;
                else if (lugares[i][j] == 'X') ocupados++;
            }
        }
        double arrecadado = ocupados * preco;
        double emReservas = reservados * (preco * 0.5);
        double receitaPotencialMax = (livres + reservados + ocupados) * preco;

        System.out.println("\n  [ ] Livre  [R] Reservada  [X] Ocupada");
        System.out.println("  Livres: " + livres + " | Reservadas: " + reservados + " | Ocupadas: " + ocupados);
        System.out.println("  Total Pago (100%): R$ " + arrecadado);
        System.out.println("  Total Reservas (50%): R$ " + emReservas);
        System.out.println("  Receita Máxima Possível: R$ " + receitaPotencialMax);
        System.out.println("===========================================");
    }

    public void leituraAvancada(String entrada, Scanner scanner) {
        entrada = entrada.toUpperCase();
        if (entrada.matches("[A-L][0-9]+")) {
            int linha = entrada.charAt(0) - 'A';
            int coluna = Integer.parseInt(entrada.substring(1)) - 1;
            if (coluna >= 0 && coluna < 12) {
                escolha_de_sofia(linha, coluna, scanner);
            } else System.out.println("Coluna inválida!");
        } 
        else if (entrada.length() == 1 && entrada.charAt(0) >= 'A' && entrada.charAt(0) <= 'L') {
            LinhaSelecionada(entrada.charAt(0) - 'A');
        } 
        else if (entrada.matches("\\d+")) {
            int col = Integer.parseInt(entrada) - 1;
            if (col >= 0 && col < 12) ColunaSelecionada(col);
            else System.out.println("Coluna inválida!");
        } else System.out.println("Comando inválido!");
    }

    public void LinhaSelecionada(int linhaSel) {
        System.out.println("\n--- Visualizando Linha " + (char)('A' + linhaSel) + " ---");
        System.out.print("  " + (char)('A' + linhaSel) + " ");
        for (int j = 0; j < 12; j++) System.out.print("[" + lugares[linhaSel][j] + "]> ");
        System.out.println("\n");
    }

    public void ColunaSelecionada(int colSel) {
        System.out.println("\n--- Visualizando Coluna " + (colSel + 1) + " ---");
        for (int i = 0; i < 12; i++) {
            System.out.println("  " + (char)('A' + i) + " [" + lugares[i][colSel] + "] v");
        }
        System.out.println();
    }

    public void escolha_de_sofia(int linha, int coluna, Scanner scanner) {
        System.out.println("\nCadeira " + (char)('A'+linha) + (coluna+1));
        System.out.println("1- Reservar (R$ " + (preco*0.5) + ") | 2- Comprar (R$ " + preco + ") | 3- Cancelar | 4- Sair");
        int op = scanner.nextInt();
        switch(op) {
            case 1: reservarLugar(linha, coluna); break;
            case 2: comprarLugar(linha, coluna); break;
            case 3: cancelarReserva(linha, coluna); break;
        }
    }

    public void reservarLugar(int l, int c) {
        if (lugares[l][c] == ' ') {
            lugares[l][c] = 'R';
            System.out.println("Sucesso: Lugar Reservado!");
        } else System.out.println("Erro: Lugar já ocupado ou reservado!");
    }

    public void comprarLugar(int l, int c) {
        if (lugares[l][c] == 'X') System.out.println("Erro: Lugar já está vendido!");
        else {
            lugares[l][c] = 'X';
            System.out.println("Sucesso: Compra efetuada!");
        }
    }

    public void cancelarReserva(int l, int c) {
        if (lugares[l][c] == 'R') {
            lugares[l][c] = ' ';
            System.out.println("Sucesso: Reserva cancelada e lugar liberado.");
        } else System.out.println("Erro: Só é possível cancelar lugares em estado [R].");
    }
}

public class Teatro {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Sala[] salas = new Sala[3];
        String[] nomes = {"Beethoven", "Mozart", "Vivaldi"};
        
        for (int i = 0; i < 3; i++) {
            salas[i] = new Sala();
            salas[i].inicializar(nomes[i], "Concerto nº " + (i+1), 80.0);
            salas[i].gerarSimulacao();
        }

        int salaAtual = 0;
        int resposta;

        do {
            System.out.println("\n--- MENU PRINCIPAL DEVISATE ---");
            System.out.println("1- Acessar Sala: " + salas[salaAtual].nome);
            System.out.println("2- Trocar/Simular Nova Sala (>)");
            System.out.println("7- Lista de Exercícios (Submenu)");
            System.out.println("0- Sair do Sistema");
            System.out.print("Escolha: ");
            resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    salas[salaAtual].exibirSala();
                    System.out.println("Comandos: 'A1' para selecionar, 'A' para linha, '1' para coluna.");
                    System.out.print("Entrada: ");
                    String input = scanner.next();
                    salas[salaAtual].leituraAvancada(input, scanner);
                    break;
                case 2:
                    salaAtual = (salaAtual + 1) % 3;
                    salas[salaAtual].gerarSimulacao(); 
                    System.out.println("Sala alterada para: " + salas[salaAtual].nome);
                    break;
                case 7:
                    menuExercicios(scanner);
                    break;
            }
        } while (resposta != 0);
        System.out.println("Sistema encerrado.");
    }

    public static void menuExercicios(Scanner scanner) {
        String[] titulos = new String[20];
        String[] enunciados = new String[20];
        
   
        for(int i=0; i<20; i++) {
            titulos[i] = "Exercício Teórico " + (i+1);
            enunciados[i] = "Este é o enunciado completo do exercício " + (i+1) + " sobre lógica em Java.";
        }
        // Customizando alguns como exemplo:
        titulos[0] = "Par ou Ímpar"; enunciados[0] = "Crie um programa que receba um número e verifique se o resto da divisão por 2 é zero.";
        titulos[3] = "Cálculo de IMC"; enunciados[3] = "Algoritmo para ler peso e altura e calcular o índice de massa corporal.";

        int paginaAtual = 0;
        int itensPorPagina = 7;
        int totalExercicios = 20;
        int totalPaginas = (int) Math.ceil((double) totalExercicios / itensPorPagina);

        String comando;
        do {
            int inicio = paginaAtual * itensPorPagina;
            int fim = Math.min(inicio + itensPorPagina, totalExercicios);

            System.out.println("\n===== LISTA DE EXERCÍCIOS (Pág " + (paginaAtual + 1) + ") =====");
            for (int i = inicio; i < fim; i++) {
                System.out.println((i + 1) + " - " + titulos[i]);
            }

            // Operador ternário conforme exigido pelo professor
            String opA = (paginaAtual > 0) ? "A - Anterior | " : "";
            String opP = (paginaAtual < totalPaginas - 1) ? "P - Próxima | " : "";

            System.out.println("\n" + opA + opP + "V - Voltar ao Teatro | (Digite o número)");
            System.out.print("Comando: ");
            comando = scanner.next().toUpperCase();

            if (comando.equals("P") && paginaAtual < totalPaginas - 1) paginaAtual++;
            else if (comando.equals("A") && paginaAtual > 0) paginaAtual--;
            else if (comando.equals("V")) break;
            else if (comando.matches("\\d+")) {
                int escolha = Integer.parseInt(comando) - 1;
                if (escolha >= 0 && escolha < 20) {
                    System.out.println("\n>>> EXIBINDO: " + titulos[escolha]);
                    System.out.println(enunciados[escolha]);
                    System.out.println("Pressione Enter para voltar...");
                    scanner.nextLine(); scanner.nextLine(); // Pausa
                }
            }
        } while (true);
    }
}