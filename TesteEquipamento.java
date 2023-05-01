public class TesteEquipamento {
    public static void main(String[] args) {
        // criando obj equip1
        Equipamento equip1 = new Equipamento();
        equip1.setFunciona(true);
        equip1.setNumSerie(123);
        //Criando o obj comp1
        Computador comp1 = new Computador();
        comp1.setArm(1024);
        comp1.setFunciona(true);
        comp1.setNumSerie(1234);
        comp1.setNomeComp("Desktop-1");
        // Exibindo informações dos objetos

        System.out.println("\t"+equip1.getFunciona()+" "+equip1.getNumSerie());

        System.out.println("\t"+comp1.getArm()+" "+comp1.getNumSerie()+" "+comp1.getNomeComp()+" "+comp1.getFunciona() );
    }
}
