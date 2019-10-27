import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Waiter> waiters = new ArrayList<>();
        for (String tableNumber :args){
            Waiter waiter = WaiterFactory.createWaiter(Integer.parseInt(tableNumber));
            if(waiter !=null){
                waiters.add(waiter);
            }
        }
        for (Waiter w: waiters){
            System.out.println(w);
        }

    }
}
