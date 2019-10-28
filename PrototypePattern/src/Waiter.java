public class Waiter extends Prototype {
    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    private Integer tableNumber;
    private String uniform;
    private Double salary;

    public Waiter(Integer tableNumber, Double salary, String uniform){
        this.tableNumber  = tableNumber;
        this.salary = salary;
        this.uniform = uniform;
    }
    public Waiter(Waiter waiter){
        this.tableNumber  = waiter.tableNumber;
        this.salary = waiter.salary;
        this.uniform = waiter.uniform;

    }
    @Override
    public Waiter copy() {
        return new Waiter(this);
    }

    @Override
    public String toString() {
        return "Waiter at table--"+this.tableNumber.toString()+"\nsalary- "+this.salary.toString()+"\nuniform-"+this.uniform;
    }
}
