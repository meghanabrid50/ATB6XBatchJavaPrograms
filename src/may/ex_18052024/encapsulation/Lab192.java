package may.ex_18052024.encapsulation;

public class Lab192 {
    public static void main(String[] args) {
        vwLogin1 v = new vwLogin1("admin", "admin123");
        String username = v.getUsername();
        //Code to Auth isAuth=true
       // String password = v.getPassword(false);
        v.setPassword("Meghana", true);
       // System.out.println(password);
    }
}
class vwLogin1{
    private String username;
    private String password;

    public vwLogin1(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword(boolean isAuth) {
        if (isAuth){
            return password;
        }
        else {
            return "Not allowed";
        }

    }

    public void setPassword(String password , boolean isAuth) {

        if (isAuth){
            this.password = password;
        }
        else {
            System.out.println("Not allowed");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
