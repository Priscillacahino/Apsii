package Exercicio01;

import java.util.ArrayList;

public interface AgendaDeAniversarios {
    //adiciona um novo aniversariante
    public void adicionarAniversariante(String nome, int dia, int mes);

    // retorna uma lista contendo os nomes dos aniversariantes do dia e mês passados como parâmetros
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes);

    // remove o(s) aniversariante(s) que tenham como nome o valor passado como parâmetro para o método
    public void removerAniversariante(String nomeAniversariante);
}
