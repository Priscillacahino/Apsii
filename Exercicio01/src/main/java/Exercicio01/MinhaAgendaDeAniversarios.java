package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        aniversariantes = new ArrayList<Aniversariante>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante aniversariante = new Aniversariante(nome, dia, mes);
        aniversariantes.add(aniversariante);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> aniversariantesDoDia = new ArrayList<String>();
        DataAniversario data = new DataAniversario(dia, mes);

        for (Aniversariante aniversariante : aniversariantes) {
            if (aniversariante.getDataAniversario().equals(data)) {
                aniversariantesDoDia.add(aniversariante.getNome());
            }
        }

        return aniversariantesDoDia;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for (int i = aniversariantes.size() - 1; i >= 0; i--) {
            if (aniversariantes.get(i).getNome().equals(nomeAniversariante)) {
                aniversariantes.remove(i);
            }
        }
    }
}
