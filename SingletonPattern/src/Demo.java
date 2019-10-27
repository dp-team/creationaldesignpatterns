public class Demo {
    public static void main(String[] args) {
        CashRegister register = CashRegister.getInstance();
        register.setMoney(1221.0);
        System.out.println(register.getMoney().toString());
        CashRegister register1 = CashRegister.getInstance();
        System.out.println(register1.getMoney().toString());

    }
}
