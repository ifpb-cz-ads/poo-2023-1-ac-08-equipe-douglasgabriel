// Classe referente à questão 4

public class Equipamento{
    private boolean funciona; // Funciona ou não
    private int numSerie; // Número de série do equipamento 
    
    // Método construtor
    public Equipamento(){
        this.funciona = true;
    }

    // Get's e Set's referentes à questão 6
    public int getNumSerie() {
        return numSerie;
    }
    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }
    public boolean getFunciona(){
        return this.funciona;
    }
    public void setFunciona(boolean funciona) {
        this.funciona = funciona;
    }

}