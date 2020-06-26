package CreationPatterns.Prototype;

import com.sun.prism.impl.Disposer;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

public class Statement implements Cloneable {

    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.record = record;
        this.parameters = parameters;
    }

    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }

    public String getSql() {
        return sql;
    }

    public static void firstExample(){
        List<String> parameters = new ArrayList<>();
        Record record = new Record();
        String sql = "fake sql statement";
        parameters.add("Star Wars");

        Statement firstStatement = new Statement(sql, parameters, record);
        Statement secondStatement = firstStatement.clone();

        //The important thing to note here is that the records will have the same address. It's a shallow copy.
        System.out.println(firstStatement.getRecord());
        System.out.println(secondStatement.getRecord());
    }
}
