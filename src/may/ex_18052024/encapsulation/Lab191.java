package may.ex_18052024.encapsulation;

public class Lab191 {
    public static void main(String[] args) {
        vwoLogin v1 =new vwoLogin("admin", "admin123");
        //v1.username = "admin";
        //v1.password = " admin123";
        System.out.println(v1.password);
    }

}
class vwoLogin{
    String username;
    String password;

    public vwoLogin(String username, String password) {
        this.password = password;
        this.username = username;
    }
}