package app;

import app.core.DistanceConvertor;
import app.core.View;

public class Main {
    public static void main(String[] args) {
        View.toDisplay("This App converting \"miles to km\" and \"km to miles\"");
        DistanceConvertor convertor = new DistanceConvertor();
        convertor.milesToKms(10);
    }
}
