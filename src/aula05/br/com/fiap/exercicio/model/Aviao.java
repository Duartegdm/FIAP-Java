package aula05.br.com.fiap.exercicio.model;

public class Aviao {
    private String modelo;
    private int quantidadeDeLugares;
    private String prefixo;
    private double comprimento;
    private int anoFabricacao;
    private Cor cor;
    private int quantidadeDeTurbinas;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadeDeLugares() {
        return quantidadeDeLugares;
    }

    public void setQuantidadeDeLugares(int quantidadeDeLugares) {
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQuantidadeDeTurbinas() {
        return quantidadeDeTurbinas;
    }

    public void setQuantidadeDeTurbinas(int quantidadeDeTurbinas) {
        this.quantidadeDeTurbinas = quantidadeDeTurbinas;
    }
}
