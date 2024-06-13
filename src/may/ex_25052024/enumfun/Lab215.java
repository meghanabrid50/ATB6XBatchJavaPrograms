package may.ex_25052024.enumfun;

public class Lab215 {
    public static void main(String[] args) {
        Day d = Day.Friday;
        System.out.println(d);

        for (Size size : Size.values()){
            System.out.println("Size: " + size + " , Abbreviation: "+ size.getSize());
        }
    }
}

enum  Day{
    Sunday, Monday , Tuesday , Wednesday , Thursday , Friday , Saturday
}

enum Size{
    Small("s") , Medium("M"), Large("L"),Extra_L("XL");
private String size;
    Size(String s) {
        this.size = s;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
