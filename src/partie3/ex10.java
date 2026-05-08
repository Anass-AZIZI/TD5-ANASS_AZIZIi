package partie3;

class User {
    String name;
    User(String n) { name = n; }
    public String toString() { return name; }
}

class Repository<T> {
    void save(T obj) { System.out.println("Saving: " + obj); }
}

class UserRepository extends Repository<User> {}

public class ex10 {
    public static void main(String[] args) {
        UserRepository ur = new UserRepository();
        ur.save(new User("REDA"));
    }
}