package CreationPatterns.Builder;

public class LunchOrder {
    //One way to build objects is to use an empty constructor and then set those object attributes using getter/setter
    //methods

    public LunchOrder(){

    }

    private String condiment;
    private String dressing;
    private String meat;
    private String bread;

    public void setBread(String bread) {
        this.bread = bread;
    }
    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }
    public void setMeat(String meat) {
        this.meat = meat;
    }
    public void setDressing(String dressing) {
        this.dressing = dressing;
    }
    public String getBread() {
        return bread;
    }
    public String getCondiment() {
        return condiment;
    }
    public String getDressing() {
        return dressing;
    }
    public String getMeat() {
        return meat;
    }
}
