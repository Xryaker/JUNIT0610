package data;

public class User {
    public User(String name, String email, String telephone) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    String name;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    String email;
    String telephone;

    public User() {
        this.name="Ivan";
        this.email="email@mail.com";
        this.telephone="8065456126";
    }
}
