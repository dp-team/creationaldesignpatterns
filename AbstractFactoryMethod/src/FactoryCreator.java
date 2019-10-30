public class FactoryCreator {
    public static BranchFactory getFactory(String branch){
        if(branch.equalsIgnoreCase("Ethiopia")){
            return new EthiopiaBranchFactory();
        }
        else if (branch.equalsIgnoreCase("France")){
            return new FranceBranchFactory();
        }
        return null;
    }
}
