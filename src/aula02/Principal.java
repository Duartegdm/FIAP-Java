package aula02;

public class Principal {
    //Método principal, por onde o programa começa
    public static void main(String[] args) {
        //Criar um objeto a partir da classe piloto
        Piloto bortoleto = new Piloto();
        bortoleto.equipe = "Sauber";
        bortoleto.nome = "Gabriel Bortoleto";
        bortoleto.peso = 45;
        bortoleto.vitorias = 0;

        Piloto ayrton = new Piloto();
        ayrton.nome = "Ayrton Senna";
        ayrton.equipe = "Ferrari";
        ayrton.peso = 60;
        ayrton.vitorias = 100;


    }
}
