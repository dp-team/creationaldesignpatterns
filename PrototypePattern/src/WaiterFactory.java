public class WaiterFactory {
    private static Waiter waiter = new Waiter(1, 1200.00, "RED");

    public static Waiter createWaiter(Integer tableNumber) {
        Waiter clone = waiter.copy();
        clone.setTableNumber(tableNumber);
        return clone;
    }
}
