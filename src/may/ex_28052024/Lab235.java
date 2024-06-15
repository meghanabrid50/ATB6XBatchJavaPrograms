package may.ex_28052024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab235 {
    public static void main(String[] args) {
        ArrayList mylist1 = new ArrayList();   //Child  Reference - Child Object
        List mylist = new ArrayList();  // Father Reference - Child Object
        SequencedCollection mylist2 = new ArrayList();//GrandF Ref - Child Object
        Collection mylist3 = new ArrayList();  //GrandGrandF Ref - Child Object
        //ArrayList
        //Size filler around 90 , it double the size automatically
        //Size is dynamic
        //Duplicate is allowed
        //Insertion order is preserved
        //Heterogeneous objects are allowed
        //Null insertion is possible
    }
}
