package ex_23042024;

import java.util.concurrent.locks.Condition;

public class Lab069 {
    public static void main(String[] args) {
        //age > 18 You can watch Movie
        // You can't watch the movie

      //  if (Condition --> Boolean true or false) //This is Keyword
      //  {  }
      //  else{
      //   }

        int age =65;
        if (age>18){
            System.out.println("You can watch Movie A");
        }
        else {
            System.out.println("You can't");
        }
    }
}
