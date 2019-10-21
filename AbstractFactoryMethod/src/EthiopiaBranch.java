public class EthiopiaBranch extends BranchFactory {
    @Override
    public StaffUniform getStaffUniform() {
        return new EthiopiaStaffUniform();
    }

    @Override
    public WallPicture getWallPicture() {
        return new EthiopiaWallPicture();
    }
}
