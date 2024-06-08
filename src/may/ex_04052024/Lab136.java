package may.ex_04052024;

public class Lab136 {
    public static void main(String[] args) {
      //Double the array and store it
        int[] arr = {30,40,50};
        int[] arr2= new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] * 2;
        }

        System.out.println("Printing Arrays !!");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);

        }
        }
    }

