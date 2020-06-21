package CreationPatterns.Builder;

public class CorrectLunchOrderBuilder {

    private String condiment;
    private String dressing;
    private String meat;
    private String bread;

    CorrectLunchOrderBuilder(Builder builder) {
        this.condiment = builder.condiment;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
        this.bread = builder.bread;
    }

    public static class Builder {
        private String condiment;
        private String dressing;
        private String meat;
        private String bread;

        public Builder() {

        }

        public CorrectLunchOrderBuilder build(){
            return new CorrectLunchOrderBuilder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this; //Will return an instance of a builder
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this; //Will return an instance of a builder
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this; //Will return an instance of a builder
        }

        public Builder condiment(String condiment) {
            this.condiment = condiment;
            return this; //Will return an instance of a builder
        }

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
