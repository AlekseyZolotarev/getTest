
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Branch3");
        BranchTest branchTest = new BranchTest();
        branchTest.printBranchTest();
        BranchTest2 branchTest2 = new BranchTest2();
        branchTest2.printBranchTest2();
        branchTest2.printBranchTest3();
        BranchTestLinux branchTestLinux = new BranchTestLinux();
        branchTestLinux.printBranchTestLinux();
    }
}