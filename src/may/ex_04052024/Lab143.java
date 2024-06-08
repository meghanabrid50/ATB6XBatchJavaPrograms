package may.ex_04052024;

public class Lab143 {
    public static void main(String[] args) {
        String s1 ="Meghana";
        String s2 = new String("Meghana");

        //String --> Immutable in nature--> Once created can't be changed

        StringBuffer stringBuffer = new StringBuffer("Meghana");
        stringBuffer.append("Brid");
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Meghana");
        stringBuilder.append("Brid");


        String pass = "pass@123";
        pass = "123";

        //Mutable --> That can be changed
        StringBuilder pwd = new StringBuilder("Meghana");
        pwd.append("Brid");
        System.out.println(pwd);


    }
}
