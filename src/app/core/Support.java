package app.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Support {

    public static BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

    public static String getDataFromUser() throws IOException {
        return scanner.readLine();

    }

    public static double getDoubleFromUser(){
        double doubleFromUser = 0;
        try{
            doubleFromUser = Double.parseDouble(Support.getDataFromUser());
        } catch (NumberFormatException e){
            System.out.println("Wrong value. Try again");
            getDoubleFromUser();
        } catch (IOException e) {
            System.out.println("Something wrong");
            throw new RuntimeException(e);
        }
        return doubleFromUser;
    }

    public static double round(double num, int scale){
        BigDecimal bigDecimal = new BigDecimal(Double.toString(num));
        bigDecimal = bigDecimal.setScale(scale, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}
