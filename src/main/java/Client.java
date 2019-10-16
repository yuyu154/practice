public class Client {

    public static void main(String[] args) {
        Program program = getOldProgram();
        if (program.proceed(5) == 5) {
            System.out.println("PASS");
        }
    }

    private static void method() {
        Program program = getOldProgram();
        program.proceed(3);
    }

    private static void method2() {
        Program program2 = getOldProgram();
        program2.proceed(7);
    }

    private static Program getOldProgram() {
        return new OldProgram();
    }
}
