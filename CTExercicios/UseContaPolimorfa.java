package CTExercicios;
import java.util.Scanner;

public class UseContaPolimorfa {
    public static void main(String[] args) {
        Conta c = null;
        Scanner scan = new Scanner(System.in);
        int opcao;
        System.out.println("Qual o tipo de conta deseja criar para José?");
        System.out.println("1 - Conta");
        System.out.println("2 - Conta Especial");
        System.out.println("3 - Conta Poupança");
        opcao = scan.nextInt();
        switch(opcao){
            case 1:
                c = new Conta(opcao, "José");
            break;
            case 2:
                c = new ContaEspecial(opcao, "José", 100.000);
            break;
            case 3:
                c = new ContaPoupanca(opcao, "José");
            break;
        }
        c.imprimirTipoConta();
    }
}
