public class EthiopiaWallPicture implements WallPicture {
    private final String PIC;
    public EthiopiaWallPicture(){
        PIC ="Ras Dashen Mountain ";
    }
    @Override
    public String displayPicture() {
        return PIC;
    }
}
