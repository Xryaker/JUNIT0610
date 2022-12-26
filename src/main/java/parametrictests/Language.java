package parametrictests;

public enum Language {
    ENGLISH("en"),
    FRANCE("fr"),
    ESPANIOL("es");
    private String code;

    Language(String code) {
        this.code = code;
    }

    public String getCountryCode() {
        return code;
    }
}
