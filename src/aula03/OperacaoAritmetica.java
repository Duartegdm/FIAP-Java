package aula03;

import java.util.Scanner;

public class OperacaoAritmetica {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Lê o nome do aluno
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        //Pega a nota da das CPs
        System.out.println("Digite as notas dos CPs");
        double cp1 = scanner.nextDouble();
        double cp2 = scanner.nextDouble();
        double cp3 = scanner.nextDouble();
        double mediaCPs = (cp1 + cp2 + cp3) / 3;

        // Pega a nota do challenge
        System.out.println("Digite a nota do challenge: ");
        double challenge = scanner.nextDouble();

        //Pega a nota da gs
        System.out.println("Digite a nota da GS: ");
        double gs = scanner.nextDouble();

        //Calcular a média do semestre
        double mediaTotal = (mediaCPs * 0.2 + challenge * 0.2 + gs * 0.6);

        //Exibir a média do aluno
        System.out.println(nome + "possui a média: " + mediaTotal);
    }
}
