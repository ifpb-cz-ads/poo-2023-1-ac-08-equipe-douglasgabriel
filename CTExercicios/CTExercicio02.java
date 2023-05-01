package CTExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class CTExercicio02{
	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<>(); //Criando a o ArrayList
		Conta c = null; //Iniciando a conta com o null
        Scanner scan = new Scanner(System.in); //Scanner para ler as informações
        int opcao; //Para escolher o fazer
		int num; //Num de escolha da conta
		int numeroConta; //Numero da conta
		String nome; //Nome do Titular
		double saldo; //Valor do saldo ou limite
		do{//Menu principal
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Saldo conta");
			System.out.println("3 - Sacar");
			System.out.println("4 - Depositar");
			System.out.println("0 - Finalizar");
			opcao = scan.nextInt(); //Escolha da oção
			switch(opcao){
				case 1://Caso seja a criação de conta
					System.out.println("Qual o tipo de conta deseja criar para José?");
					System.out.println("1 - Conta");
					System.out.println("2 - Conta Especial");
					System.out.println("3 - Conta Poupança");
					num = scan.nextInt();
					
					switch(num){
						case 1: //Criando a conta comum
							System.out.println("Nome:");
							nome = scan.next();
							System.out.println("Numero da conta: ");
							numeroConta = scan.nextInt();
							c = new Conta(numeroConta, nome);
						break;
						case 2: //Criando a conta especial
							System.out.println("Nome:");
							nome = scan.next();
							System.out.println("Limite:");
							saldo = scan.nextDouble();
							System.out.println("Numero da conta: ");
							numeroConta = scan.nextInt();
							c = new ContaEspecial(numeroConta, nome, saldo);
						break;
						case 3: //Criando a conta poupança
							System.out.println("Nome:");
							nome = scan.next();
							System.out.println("Numero da conta: ");
							numeroConta = scan.nextInt();
							c = new ContaPoupanca(numeroConta, nome);
						break;
					}
					lista.add(c); //Adicionando a lista
				break;
				case 2: //Saldo da conta
					System.out.println("Informe o numero de sua conta:");
					numeroConta = scan.nextInt(); //Para ler os dados da conta que será usado
					for(int k = 0; k<lista.size(); k++){
						Conta n = lista.get(k);
						if(n.numero == numeroConta){
							System.out.println("O saldo da conta eh: " + n.getSaldo());
							break;
						}
						if(k+1 == lista.size()){
							System.out.println("Numero de conta não existente");
							break;
						}
					} 
				break;
				case 3: //Sacar valor da conta
					System.out.println("Informe o numero de sua conta:");
					numeroConta = scan.nextInt(); //Para ler os dados da conta que será usado
					for(int k = 0; k<lista.size(); k++){
						Conta n = lista.get(k);
						if(n.numero == numeroConta){
							System.out.println("Qual o valor pretente sacar?");
							saldo = scan.nextDouble();
							n.sacar(saldo);
							System.out.println("Voce sacou: " + saldo);
							System.out.println("Seu saldo atual: " + n.getSaldo());
							break;
						}
						if(k+1 == lista.size()){ //Caso o numero da conta seja invalido
							System.out.println("Numero de conta não existente");
							break;
						}
					}
				break;
				case 4: //Para depositar
					System.out.println("Informe o numero de sua conta:");
					numeroConta = scan.nextInt(); //Para ler os dados da conta que será usado
					for(int k = 0; k<lista.size(); k++){ 
						Conta n = lista.get(k);
						if(n.numero == numeroConta){
							System.out.println("Qual o valor do deposito?");
							saldo = scan.nextDouble();
							n.depositar(saldo);
							System.out.println("Voce depositou: " + saldo);
							System.out.println("Seu saldo atual: " + n.getSaldo());
							break;
						}
						if(k+1 == lista.size()){ //Caso o numero da conta seja invalido
							System.out.println("Numero de conta não existente");
							break;
						}
					}
				break;
				default:
					if(opcao > 4 || opcao < 0){
						System.out.println("Opcao invalida");
					}
			}
		}while(opcao != 0);
	}
}