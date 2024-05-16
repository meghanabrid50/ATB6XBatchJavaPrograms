package ex_02052024;

public class Lab124 {
    public static void main(String[] args) {
        int[] age= {27,32,34,53,33};  //Fixed Elements

        int[] age2 = new int[5]; //Here by default value of all the elements will be?  it is 0

        System.out.println(age2[0]);
        System.out.println(age2[4]);

        age2[0]=11;
        System.out.println(age2[0]);


        String[] breakfast = {"milk","Idli","Tea","Coffee","Poha"};
        System.out.println(breakfast.length);

    }
}
