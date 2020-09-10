import java.util.List;
import java.util.logging.Logger;

public class ManageDemand {
    public static long filledOrders(List<Long> orders, long k){
        //TODO add your code here
        int totalWidgets = 0;
        int n = orders.size();
        int totalOrders = 0;
        while (totalOrders < n) {
            totalWidgets += orders.get(totalOrders);
            if (totalWidgets > k) {
                break;
            }
            totalOrders += 1;
        }
        return totalOrders;
    }
}
