package lld.splitwise.main.model;
import java.util.UUID;;
public class User {
    private String name;
    private String id;
    private String email;
    private String phoneNumber;

    public User(String name,String email,String phoneNumber) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
