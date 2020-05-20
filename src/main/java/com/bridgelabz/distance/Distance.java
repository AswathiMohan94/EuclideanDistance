package com.bridgelabz.distance;

public class Distance {
    private double firstXCoordinate1;
    private double firstYCoordinate1;
    private double secondXCoordinate2;
    private double secondYCoordinate2;
    private double result;


    public Distance(double firstXCoordinate1, double firstYCoordinate1, double secondXCoordinate2, double secondYCoordinate2) {
        this.firstXCoordinate1 = firstXCoordinate1;
        this.firstYCoordinate1 = firstYCoordinate1;
        this.secondXCoordinate2 = secondXCoordinate2;
        this.secondYCoordinate2 = secondYCoordinate2;
    }
    public void findEuclideanDistance() throws EuclideanDistanceException {

        if(((secondYCoordinate2 - firstYCoordinate1) * (secondYCoordinate2 - firstYCoordinate1) + (secondXCoordinate2 - firstXCoordinate1) * (secondXCoordinate2 - firstXCoordinate1))<=0){
            throw new EuclideanDistanceException("Euclidean distance cannot be calculated for these values");
        }
        else
            this.result=Math.sqrt((secondYCoordinate2 - firstYCoordinate1) * (secondYCoordinate2 - firstYCoordinate1) + (secondXCoordinate2 - firstXCoordinate1) * (secondXCoordinate2 - firstXCoordinate1));
    }


    @Override
    public String toString() {
        return "euclidean distance ='" + result + '\'' ;
    }
}