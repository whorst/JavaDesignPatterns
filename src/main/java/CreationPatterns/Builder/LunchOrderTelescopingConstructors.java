package CreationPatterns.Builder;

public class LunchOrderTelescopingConstructors {
    //If you want a more configurable constructor than another thing to do is use telescoping constructor. While better,
    //it's limited in the combination of parameters which can be passed and doesn't provide immutability

    public LunchOrderTelescopingConstructors(String bread){
            this.bread = bread;
        }
    public LunchOrderTelescopingConstructors(String bread, String meat){
            new LunchOrderTelescopingConstructors(bread);
            this.meat = meat;
        }
    public LunchOrderTelescopingConstructors(String bread, String meat, String dressing){
            new LunchOrderTelescopingConstructors(bread, meat);
            this.dressing = dressing;
        }
    public LunchOrderTelescopingConstructors(String bread, String meat, String dressing, String condiment){
            new LunchOrderTelescopingConstructors(bread, meat, dressing);
            this.condiment = condiment;
        }

    private String condiment;
    private String dressing;
    private String meat;
    private String bread;

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
