package api;

public class API {

    private static API api;

    public API() {
        api = this;
    }

    public static API getInstance() {
        return api;
    }

    public String apiTestString(String exchange, String out) {

        return "[]" + exchange + " - " + out;

    }
}
