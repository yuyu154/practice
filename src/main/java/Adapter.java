public class Adapter implements Program {
    private final NewProgram newProgram;

    public Adapter(NewProgram newProgram) {
        this.newProgram = newProgram;
    }

    @Override
    public int proceed(int number) {
        return Integer.parseInt(newProgram.produce(number));
    }
}
