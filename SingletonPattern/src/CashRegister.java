public final class CashRegister {
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    private Double money;
    private CashRegister(){}
    private static final CashRegister INSTANCE = new CashRegister();
    public static CashRegister getInstance(){
        return INSTANCE;
    }
}
