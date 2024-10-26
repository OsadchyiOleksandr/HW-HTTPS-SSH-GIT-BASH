package app;

import app.core.DistanceConvertor;
import app.core.Support;
import app.core.View;

public class Main {
    public static void main(String[] args) {
        View.toDisplay("This App converting \"miles to km\" and \"km to miles\"");
        Main.runApp();
    }

    public static void runApp(){
        DistanceConvertor convertor = new DistanceConvertor();
        View.toDisplay("Please chose:" +
                "\n\t1.Convert Miles to KMs" +
                "\n\t2.Convert KMs to Miles");
        int chose = Support.getIntFromUser("");
        switch (chose) {
            case 1:
                convertor.milesToKms(Support.getDoubleFromUser("Please enter amount of miles\n\t --->"));
                break;
            case 2:
                convertor.kmsToMiles(Support.getDoubleFromUser("Please enter amount of kms\n\t --->"));
                break;
            default:
                System.out.println("No such conversion. Bye");
        }
    }
}
