package data;

public class UFieald {
    private String str;




    public UFieald(String str) {
        this.str = str;
    }

    private UFieald() {
    }

    public String getStr() {
        return str;
    }

    public static UFieald.Builderr builder() {// вызов вложеного класса

        return new UFieald().new Builderr();
    }

    public class Builderr {
        private String strt;

        public Builderr setStrt(String strt) {
            this.strt = strt;
            return this;
        }




        public UFieald buid() {
            return new UFieald(strt);
        }// Вызов конструктора главного класса

    }
}
