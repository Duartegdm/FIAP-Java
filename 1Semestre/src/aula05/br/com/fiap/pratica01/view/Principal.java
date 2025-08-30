package aula05.br.com.fiap.pratica01.view;

import aula05.br.com.fiap.pratica01.model.Aviao;
import aula05.br.com.fiap.pratica01.model.Carro;
import aula05.br.com.fiap.pratica01.model.Cor;
import aula05.br.com.fiap.pratica01.model.Lancha;

public class Principal {
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        Cor cor = new Cor();
        Carro carro = new Carro();
        Lancha lancha = new Lancha();


        // Colocando informações no avião
        aviao.setModelo("14 BIS");
        aviao.setComprimento(9.6);

        cor.alterarCor(255, 255, 255, "Branco");

        aviao.setCor(cor);
        aviao.setAnoFabricacao(1906);
        aviao.setQuantidadeDeLugares(1);
        aviao.setQuantidadeDeTurbinas(0);
        aviao.setPrefixo("BIS");

        //Exibit informações do avião
        System.out.printf("""
                Modelo: %s
                Quantidade de lugares: %d
                Prefixo: %s
                Comprimento: %.2f
                Ano de fabricação: %d
                Cor: %c
                Quantidade de Turbinas: %d
                
                """, aviao.getModelo(), aviao.getQuantidadeDeLugares(),
                aviao.getPrefixo(),aviao.getComprimento(),
                aviao.getAnoFabricacao(), aviao.getCor(),
                aviao.getQuantidadeDeTurbinas()
                );
    }
}
