package aula03;

import java.util.Scanner;

public class Aluno {
    double cp1;
    double cp2;
    double cp3;
    double gs;
    double challenge;

    public double calcularMedia() {
        return ((cp1 + cp2 + cp3) /3) * 0.2 + challenge * 0.2 + gs * 0.6;
    }
}
