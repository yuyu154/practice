public class MainApp {
    public static void main(String[] args) {
//        AbstractDatabase database = new DataBase();
        UserDao dao = DaoFactory.userDao();

        User user = new User();
        user.setId("1");
        user.setName("name");

        dao.add(user);
        System.out.println(user);

        User user2 = dao.get(user.getId());
        System.out.println(user2);
    }
}
