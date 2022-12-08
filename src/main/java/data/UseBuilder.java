package data;

public class UseBuilder {
    private String email;
    private String telephone;

    private String name;

    private int age;

    public int getAge() {
        return age;

    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getName() {
        return name;
    }


    public UseBuilder() {
    }

    public UseBuilder(String email, String telephone, String name, int age) {
        this.email = email;
        this.telephone = telephone;
        this.name = name;
        this.age = age;
    }

    public static Builder builder() {

        return new UseBuilder().new Builder();
    }

    public class Builder {
        private String email;
        private String telephone;
        private String name;
        private int age;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public UseBuilder buid() {
            return new UseBuilder(email, telephone, name, age);
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
    }
}
