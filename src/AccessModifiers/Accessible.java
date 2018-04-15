package AccessModifiers;

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface? -> package-private
// 2. the int variable SOME_CONSTANT -> public (why? All interface variables are automatically public static final)
// 3. methodA? -> Accessible everywhere
// 4. methodB and methodC? -> public (why? All interface's methods are automatically public, so in this case the lack of access modifiers does not imply a package-private access).
//


interface Accessible {
     int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();


}
