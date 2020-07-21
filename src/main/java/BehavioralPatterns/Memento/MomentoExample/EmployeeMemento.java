package BehavioralPatterns.Memento.MomentoExample;

public class EmployeeMemento {


    private String name;
    private String phone;
    public EmployeeMemento(String name, String phoneNumber){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
