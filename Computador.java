// Classe referente à questão 5
public class Computador extends Equipamento {
    private int arm; // Capacidade de armazenamento
    private String nomeComp; // Nome do computador 

    // Get's e Set's referentes à questão 6
    public String getNomeComp() {
        return nomeComp;
    }
    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }
    public int getArm() {
        return arm;
    }
    public void setArm(int arm) {
        this.arm = arm;
    }
}
