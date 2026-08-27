public class Gerente extends FuncionarioCLT {
    private int tamanhoEquipe;
    private double percentualBonus; // Ex: 0.20 para 20%

    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        double bonus = getSalarioBase() * percentualBonus;
        return super.calcularSalario() + bonus;
    }

    @Override
    public double calcularDesconto() {
        double desconto = super.calcularDesconto();
        if (tamanhoEquipe > 10) {
            desconto += 100.00;
        }
        return desconto;
    }
}
