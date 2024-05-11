package ex_25042024;

public class Lab089 {
    public static void main(String[] args) {
        char code ='B';
        int val = switch (code){
            case 'A':
                yield 65;  // Yeild is a keyword means that it returns a value.Break is not needed in this case
            case 'B':
                yield  66;
            default:
                System.out.println("Not able to find");
                throw  new IllegalStateException("Error");
        };;
    }
}
