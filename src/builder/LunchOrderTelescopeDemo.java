package builder;

public class LunchOrderTelescopeDemo {
    public static void main(String[] args) {
        LunchOrderTelescope lunchOrderTelescope = new LunchOrderTelescope("Wheat","lettuce");

        System.out.println(lunchOrderTelescope.getBread());
        System.out.println(lunchOrderTelescope.getCondiment());
        System.out.println(lunchOrderTelescope.getDressing());
        System.out.println(lunchOrderTelescope.getMeat());
    }
}
