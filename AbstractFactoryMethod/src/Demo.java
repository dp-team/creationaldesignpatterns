import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *       Abstract Factory method demonstration
 * Choose a branch of the cafe to create, either France
 * or Ethiopia and the FactoryCreator will generate
 * the appropriate object, which then display to the console.
 *
 */
public class Demo {

    public static void main(String args[]) throws IOException {
        System.out.print("choose the branch to create:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String branchName = br.readLine();
        BranchFactory branch = FactoryCreator.getFactory(branchName);
        String staffUniform = branch.getStaffUniform().getColor();
        String wallPicture = branch.getWallPicture().displayPicture();
        // display branch info to console
        System.out.println("Design-pattern Cafe---" + branchName + " branch");
        System.out.println("Staff Uniform-----" + staffUniform);
        System.out.println("Wall Picture-----" + wallPicture);

    }
}
