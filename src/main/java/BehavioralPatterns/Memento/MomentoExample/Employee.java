package BehavioralPatterns.Memento.MomentoExample;

@SuppressWarnings("serial")
public class Employee {


    private String address;
    private String phone;
    private String name;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String s) {
        this.phone = s;
    }

    public void setAddress(String s) {
        this.address = s;
    }

    public void setName(String s) {
        this.name = s;
    }

    public EmployeeMemento save(){
        return new EmployeeMemento(name, phone);
    }

    public void revert(EmployeeMemento emp){
        this.name = emp.getName();
        this.phone = emp.getPhone();
    }

}
