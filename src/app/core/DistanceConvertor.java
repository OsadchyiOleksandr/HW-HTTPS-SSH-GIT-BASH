package app.core;

public class DistanceConvertor {

    private final double STATUTE_MILE = 1.60934;
    private final double NAUTICAL_MILE = 1.852;

    public void milesToKms(double miles){
        double kmStatute = Support.round(miles * this.STATUTE_MILE, 3);
        double kmNautical = Support.round(miles * this.NAUTICAL_MILE, 3);
        View.toDisplay(String.format("You wanna convert %s miles" +
                "\nIf needed statute miles it's = %s" +
                "\nIf needed nautical it's = %s", miles, kmStatute, kmNautical));
    }
}
