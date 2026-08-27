package Exercicio01;

import java.util.ArrayList;

public class TesteMinhaAgendaDeAniversarios {
    public static void main(String[] args) {
        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

        agenda.adicionarAniversariante("Ana", 10, 5);
        agenda.adicionarAniversariante("Bruno", 10, 5);
        agenda.adicionarAniversariante("Carlos", 20, 8);

        ArrayList<String> aniversariantes = agenda.obterAniversariantesDoDia(10, 5);
        System.out.println("Aniversariantes de 10/5: " + aniversariantes);

        agenda.removerAniversariante("Bruno");
        System.out.println("Depois da remoção: " + agenda.obterAniversariantesDoDia(10, 5));

        Aniversariante a = new Aniversariante("Ana", 10, 5);
        Aniversariante b = new Aniversariante("Ana", new DataAniversario(10, 5));
        System.out.println("Ana é igual a Ana? " + a.equals(b));
    }
}
