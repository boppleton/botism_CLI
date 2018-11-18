import api.API;

public class Main {

    ///////////////////////////////////////
    private static double version = 0.1; // version
    ///////////////////////////////////////

    private static API api;

    public static void main(String[] args) {

        System.out.println("[ botism v" + version + " ]");

        //run API contructor, access via static instance - API.getInstance()
        new API();

        test1();


    }

    private static void test1() {

        System.out.println("instance: " + API.getInstance().apiTestString("instance", "ay"));




    }
}
