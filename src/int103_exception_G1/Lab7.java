package int103_exception_G1;


public class Lab7 {
    
    public static void main(String[] args) {
        System.out.println("Main method call method doThis()");
        try {
            doThis();
        } catch (java.lang.Exception e) {
            System.out.println("Main method receive exception " + e.getMessage());
        }
    }

    public static void doThis() throws java.lang.Exception {
        System.out.println("Method doThis() call method doThat()");
        doThat();
    }

    public static void doThat() throws java.lang.Exception {
        throw new MyException();
    }
}