package DomaciVozilo;

public class TestVoznja {
    public static void main(String[] args) {

        AutomobilDrugi auto1 = new AutomobilDrugi("Volkswagen", "polo", 4, "Dragana Mitrovic");
        AutomobilDrugi auto2 = new AutomobilDrugi("Toyota", "Yaris", 2, "Ruzica Mitrovic");
        //bez vlasnika
        AutomobilDrugi auto3 = new AutomobilDrugi("BMW", "Sport", 3);

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);

        // moze i ovako
        /*System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());*/


    }

}
