public class NewProgram implements Program{
    public String produce(int number) {
        System.out.println("I'm a new program");
        return Integer.toString(number);
    }
}
