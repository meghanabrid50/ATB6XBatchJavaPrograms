package ex_02052024;

public class Lab127 {
    public static void main(String[] args) {
        // == -> Ref
        // .equals -> Content/Values

        int[] arr1 ={1,2,3,4,5};
        int[] arr2 ={1,2,3,4,5};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1==arr2);

        int [] arr3= arr1;
        System.out.println(arr1==arr3);
        System.out.println(arr1.equals(arr2)); //Ref -Objects.java

        String s1 = "Meghana";
        String s2 = "Meghana";
        System.out.println(s1.equals(s2)); //Content -Strings.java
        //Only for string equals method is check content and for others it checks for ref.





    }
}
