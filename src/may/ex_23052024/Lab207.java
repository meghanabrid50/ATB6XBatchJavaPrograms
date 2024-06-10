package may.ex_23052024;

public class Lab207 {
    public static void main(String[] args) {
        OOC oc = new OOC();
        OOC.SNIC snic = new OOC.SNIC();
        snic.show();
    }
}

class OOC{
    static int a=10;
    int oa=20;

    static class SNIC{
        void show(){
            System.out.println(a);
            //System.out.println(oa);
        }
    }
}

