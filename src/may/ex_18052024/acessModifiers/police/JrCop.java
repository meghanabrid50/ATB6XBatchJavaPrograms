package may.ex_18052024.acessModifiers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop cop1 = new Cop(10);
        System.out.println(cop1.gun);
        cop1.canIShoot();
    }
}
