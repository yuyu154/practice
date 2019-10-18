public class UserDao {

    private AbstractDatabase database;

    public UserDao(AbstractDatabase database) {
        this.database = database;
    }

    public void add(User user) {
        database.add(user);
    }

    public User get(String id) {
        return database.get(id);
    }
}
