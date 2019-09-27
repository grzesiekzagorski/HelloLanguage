package pl.zagorski.utils;

public class Util {
    public static int generatorPageNumber(int lower,int upper) {
        int lowerBound = lower;
        int upperBound = upper;
        return lowerBound + (int) (Math.random() * ((upperBound - lowerBound) + 1));
    }
}
