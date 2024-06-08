package april.ex_18042024;

public class Lab043 {
    public static void main(String[] args) {
        float course = 100;
        float GST = 18.45f;
        double total = course + GST;
        System.out.println(total);

        double total2 = course + (int)GST;
        System.out.println(total2);
    }
}
