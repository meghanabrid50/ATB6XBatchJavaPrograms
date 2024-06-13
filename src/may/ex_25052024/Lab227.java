package may.ex_25052024;

public class Lab227 {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank(100 , "INR");
        Bank jpmorgan = new Bank(10 , "USD");
        Integer total =sbi.add(jpmorgan);
        System.out.println(total);
    }
}
