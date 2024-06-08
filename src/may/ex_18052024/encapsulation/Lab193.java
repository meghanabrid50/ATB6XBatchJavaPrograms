package may.ex_18052024.encapsulation;

public class Lab193 {
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank(100, "Meghana");
        System.out.println(i.getBal());
        i.setBal(-1);
        System.out.println(i.getBal());
    }
}
