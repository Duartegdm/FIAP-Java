package aula03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno gabriel = new Aluno();

        System.out.println("Digite a nota da cp 1: ");
        gabriel.cp1 = scanner.nextDouble();

        System.out.println("Digite a nota da cp 2: ");
        gabriel.cp2 = scanner.nextDouble();

        System.out.println("Digite a nota da cp 3: ");
        gabriel.cp3 = scanner.nextDouble();

        System.out.println("Digite a nota da GS");
        gabriel.gs = scanner.nextDouble();

        System.out.println("Digite a nota do Challenge");
        gabriel.challenge = scanner.nextDouble();

        System.out.println(gabriel.calcularMedia());
    }

}
