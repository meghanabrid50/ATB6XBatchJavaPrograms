package may.ex_25052024.Collections;

public class Lab212 {
}

class PersonATB{
    Integer rollNo;
    String name;
    Long phoneNo;

    public PersonATB(String name, Long phoneNo, Integer rollNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }
}