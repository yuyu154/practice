public class DaoFactory {
    public static UserDao userDao() {
        AbstractDatabase database = getDatabase();
        UserDao userDao = new UserDao(database);
        return userDao;
    }

    private static DataBase getDatabase() {
        return new DataBase();
    }
}
