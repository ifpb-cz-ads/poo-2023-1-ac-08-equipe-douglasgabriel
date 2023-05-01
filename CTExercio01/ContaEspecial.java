package CTExercio01;
/*
 * Crie a hierarquia de classes utilizada como exemplo nesta aula: crie a clas-
*  se ContaEspecial (Figura 4.1) e ContaPoupanca (Figura 4.2), crie os cons-
*  trutores dessas classes (Figuras 4.3 e 4.4), crie o método reajustar na clas-
* se ContaPoupanca (Figura 4.5) e o método sacar na classe ContaEspecial
* (Figura 4.8).
*/

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, String nomeTitular, double limite){
        super(numero, nomeTitular);
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }

    public void setLimite(double newLimite){
        this.limite = newLimite;
    }

    @Override
    public boolean sacar (double valor){
        if(valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Especial");
    }
}