import java.util.ArrayList;
import java.util.List;

public class WaiterFactory {
    private static Waiter p = new Waiter(1);

    public static Waiter createWaiter(Integer tableNumber) {
        Waiter clone = p.copy();
        clone.setTableNumber(tableNumber);
        return clone;
    }
}
