public class ComputerStore {
    public static void main(String[] args) {
 ComputerFactory factory = new ComputerFactory();
 Computer comp1 = factory.create("Intel i5", 15);
//        comp1.procesor = "Intel i5";
//        comp1.memeory = 16;
 Computer comp2 = factory.create("AMD Ryzen", 30);

//        comp2.procesor = "AMD Ryzen 1230";
//        comp2.memeory = 32;


        System.out.println(comp1.getInfo());
        System.out.println(comp2.getInfo());
        System.out.println("---------------UPGRADE------------------");
        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(comp1, 5);
        System.out.println(comp1.getInfo());

        computerUpgrade.addMemory(comp2, 10);
        System.out.println(comp2.getInfo());




    }
}
