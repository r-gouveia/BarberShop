package model;

public class Servico  {
    private int id;
    private String descricao;
    private int valor;

    public Servico(int id, String descricao, int valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public int getValor() {

        return valor;
    }

    public void setValor(int valor) {

        this.valor = valor;
    }
}
