public class Config {
    private static Config instance;
    private String currency;

    private Config() {
        this.currency = "BRL";
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getCurrency() {
        return currency;
    }
}
