package pkgB;

public class C {

    void getValueFromB() {

        int gotIt = new B().defaultPackageAccess; // default access
        int gotIt2 = new B().protectedAccess; // protected access
    }

}
