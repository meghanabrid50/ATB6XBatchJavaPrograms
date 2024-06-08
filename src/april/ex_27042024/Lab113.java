package april.ex_27042024;

public class Lab113 {
    public static void main(String[] args) {
        //continue-> If this true continue
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5){
                continue;
            }
            System.out.println("After");
        }
    }
}
