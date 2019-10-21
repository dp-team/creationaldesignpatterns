public class FactoryCreator {
    public static BranchFactory getFactory(String branch){
        if(branch.equalsIgnoreCase("Ethiopia")){
            return new EthiopiaBranch();
        }
        else if (branch.equalsIgnoreCase("France")){
            return new FranceBranch();
        }
        return null;
    }
}
