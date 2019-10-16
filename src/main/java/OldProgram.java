public class OldProgram implements Program {

    @Override
    public int proceed(int number) {
        System.out.println("I'm an old program");
        return 5;
    }
}
