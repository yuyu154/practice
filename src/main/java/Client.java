public class Client {

    public static void main(String[] args) {
        Program program = new OldProgram();
        if (program.proceed(5) == 5) {
            System.out.println("PASS");
        }
    }

    private void method() {
        Program program = new OldProgram();
        program.proceed(3);
    }

    private void method2() {
        Program program2 = new OldProgram();
        program2.proceed(7);
    }
}
