package builder;


/***
 *  Problem: A food company wants to have an application that takes the customers order
 *  The order consists of four parts: Bread, Condiment, dressing and meat
 *  Customers can request the order to have any of the parts (flexible)
 *
 *  Approach 1: A class with a constructor that takes in parameter
 *  Issue: If the value is null , we have not way of knowing whether the order is valid or not
 *
 *
 */

public class LunchOrderBean {
    private String bread;
    private String condiment;
    private String dressing;
    private String meat;


    public LunchOrderBean() {
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondiment() {
        return condiment;
    }

    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
