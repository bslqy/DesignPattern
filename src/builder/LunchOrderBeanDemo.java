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
public class LunchOrderBeanDemo {
    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiment("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiment());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
}
