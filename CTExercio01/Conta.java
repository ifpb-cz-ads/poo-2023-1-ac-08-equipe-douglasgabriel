package CTExercio01;
public class Conta {
    protected int numero;
    protected String nomeTitular;
    protected double saldo;

    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public Conta(int numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = getSaldo() + valor;
    }

    public boolean sacar(double valor){
        if(this.getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void imprimirTipoConta(){
        System.out.println("Conta Comum");   
    }

    public double getSaldo(){
        return saldo;
    }
    public int getNumero(){
        return numero;
    }
    public String getTitular(){
        return nomeTitular;
    } 
    public void setTitular(String newTitular){
        this.nomeTitular = newTitular;
    }
}
