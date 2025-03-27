package aula02;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //Declarar 3 variáveis (cp, challenge e gs)
        double cp1 = 10.0;
        double cp2 = 10.0;
        double cp3 = 10.0;
        double challenge = 10.0;
        double gs = 10.0;
        //Calcular a média do semestre
        double mediaCPs = (cp1 + cp2 + cp3) / 3;
        double mediaTotal = (((mediaCPs + challenge) * 40/100) + gs * 60/100) / 2;
        //Exibir a média do semestre
        System.out.println(mediaTotal);

    }

}
