public class Waiter extends Prototype {
    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    private Integer tableNumber;
    public Waiter(Integer tableNumber){
        this.tableNumber  = tableNumber;
    }
    public Waiter(Waiter waiter){
        this.tableNumber  = waiter.tableNumber;
    }
    @Override
    public Waiter copy() {
        return new Waiter(this);
    }

    @Override
    public String toString() {
        return "Waiter at table--"+this.tableNumber.toString();
    }
}
