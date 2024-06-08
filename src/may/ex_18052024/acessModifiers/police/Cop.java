package may.ex_18052024.acessModifiers.police;

public class Cop {
     public int gun;
    private  String idCard;

    Cop(int gun){
        this.gun= gun;

    }

    public void canIShoot(){
        System.out.println("Of-course, shoot!");
    }
}
