public class FranceWallPicture implements WallPicture {
    private final String PIC;
    public FranceWallPicture(){
        PIC ="Eiffel Tower";
    }
    @Override
    public String displayPicture() {
        return PIC;
    }
}
