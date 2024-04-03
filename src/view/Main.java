package view;

import model.Agendamento;
import model.Cliente;
import model.Servico;



public class Main {

    public static void main(String[] args) {
        Servico servico = new Servico(1, "Cabelo", 20);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        Servico corte = new Servico(2,"Raspar",35);

        Cliente cliente = new Cliente(1,
                "Romulo",
                "rua brasil",
                26285467);
        System.out.println(cliente.getNome());
        System.out.println(cliente.getTelefone());


        Agendamento agendamento = new Agendamento(1, servico, 20, "25/04/2024 09:30", cliente);
        System.out.println();


    }
}
