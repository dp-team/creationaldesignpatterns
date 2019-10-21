public class FranceBranch extends BranchFactory {
    @Override
    public StaffUniform getStaffUniform() {
        return new FranceStaffUniform();
    }

    @Override
    public WallPicture getWallPicture() {
        return new FranceWallPicture();
    }
}
