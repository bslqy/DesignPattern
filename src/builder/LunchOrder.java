package builder;

/***
 *  Problem: A food company wants to have an application that takes the customers order
 *  The order consists of four parts: Bread, Condiment, dressing and meat
 *  Customers can request the order to have any of the parts (flexible)
 *
 *  Approach 3: Builder
 *
 */
public class LunchOrder {

    // Inner static class
    public static class Builder {
        private String bread;
        private String condiment;
        private String dressing;
        private String meat;

        public Builder(){}

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        // methods that returns the builder itself
        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiment(String condiment) {
            this.condiment = condiment;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }
    private final String bread;
    private final String condiment;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiment = builder.condiment;
        this.dressing = builder.dressing;
        this.meat = builder.meat;

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
