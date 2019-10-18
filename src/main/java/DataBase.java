import java.util.HashMap;
import java.util.Map;

public class DataBase implements AbstractDatabase {
    private static final Map<String, User> db = new HashMap<>();

    public void add(User user) {
        db.put(user.getId(), user);
    }

    public User get(String id) {
        return db.get(id);
    }
}
