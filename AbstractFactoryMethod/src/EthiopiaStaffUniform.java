public class EthiopiaStaffUniform implements StaffUniform {
    private final String COLOR;
    public EthiopiaStaffUniform(){
        COLOR ="YELLOW";
    }
    @Override
    public String getColor() {
        return COLOR;
    }
}
