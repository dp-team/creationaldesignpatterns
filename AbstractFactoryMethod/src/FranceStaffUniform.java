public class FranceStaffUniform  implements StaffUniform{
    private final String COLOR;
    public FranceStaffUniform(){
        COLOR ="RED";
    }
    @Override
    public String getColor() {
        return COLOR;
    }
}
