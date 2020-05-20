package com.bridgelabz.distance;

public class Distance {
    double firstXCoordinate1;
    private double firstYCoordinate1;
    private double secondXCoordinate2;
    private double secondYCoordinate2;

    public Distance(double firstXCoordinate1, double firstYCoordinate1, double secondXCoordinate2, double secondYCoordinate2) {
        this.firstXCoordinate1 = firstXCoordinate1;
        this.firstYCoordinate1 = firstYCoordinate1;
        this.secondXCoordinate2 = secondXCoordinate2;
        this.secondYCoordinate2 = secondYCoordinate2;
    }
    public double findEuclideanDistance() {
        return Math.sqrt((secondYCoordinate2 - firstYCoordinate1) * (secondYCoordinate2 - firstYCoordinate1) + (secondXCoordinate2 - firstXCoordinate1) * (secondXCoordinate2 - firstXCoordinate1));
    }

}