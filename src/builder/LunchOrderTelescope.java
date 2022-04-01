package builder;

/***
 *  Problem: A food company wants to have an application that takes the customers order
 *  The order consists of four parts: Bread, Condiment, dressing and meat
 *  Customers can request the order to have any of the parts (flexible)
 *
 *  Approach 2: Multiple constructor that calls each other. First one is the bread constructor that takes in bread argument
 *  public
 *  The second one being the condiment constructor that takes in bread and condiment
 *  Issue: Need to add new constructor for new combination that is unusual.
 *
 */

public class LunchOrderTelescope {
    private String bread;
    private String condiment;
    private String dressing;
    private String meat;

    public LunchOrderTelescope (String bread) {
        this.bread = bread;
    }

    public LunchOrderTelescope(String bread, String condiment) {
        this(bread);
        this.condiment = condiment;
    }

    public LunchOrderTelescope(String bread, String condiment, String dressing) {
        this(bread, condiment);
        this.dressing = dressing;
    }

    public LunchOrderTelescope(String bread, String condiment, String dressing, String meat) {
        this(bread, condiment, dressing);
        this.meat = meat;
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
