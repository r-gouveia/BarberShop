package model;

import java.util.Date;

public class Cliente extends Pessoa {

    private String endereco;
    private int cep;

    public Cliente(int id, String nome, String sexo, Date dataNascimento, int telefone, String email, int rg, String endereco, int cep) {
        super(id, nome, sexo, String.valueOf(dataNascimento), telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String endereco, int cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }
}


