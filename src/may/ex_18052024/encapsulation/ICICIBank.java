package may.ex_18052024.encapsulation;

public class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(long bal, String name) {
        this.bal = bal;
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if (bal > 0) {
            this.bal = bal;
        } else {
            System.out.println("Not Allowed");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
