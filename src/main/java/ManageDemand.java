import java.util.Collections;
import java.util.List;

public class ManageDemand {
    public long filledOrders(List<Long> orders, long k){
        Collections.sort(orders);
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
