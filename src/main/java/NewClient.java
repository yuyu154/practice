public class NewClient {
    public static void main(String[] args) {
        NewProgram newProgram = new NewProgram();
        if (newProgram.produce(5).equals("5")) {
            System.out.println("NEW PASS");
        }
    }
}
