package BehavioralPatterns.Memento.EmployeeExample;

import java.io.*;

public class SerializableExample {
    public static void exampleOne(){
        Employee emp = new Employee();
        emp.setName("Bryan");
        emp.setAddress("111 23 St");
        emp.setPhone("1112223333");
        
        serialize(emp);
        
        Employee newEmp = deserialize();
    }

    private static Employee deserialize() {
        Employee emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return emp;
    }

    public static void serialize(Employee emp){
        try{
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
