package com.bridgelabz.distanceCalculator;

public class DistanceCalculator {

    public double findEuclideanDistance(double firstXCoordinate1,double firstYCoordinate1, double secondXCoordinate2,double secondYCoordinate2) {
        double euclideanDistance = Math.sqrt((secondYCoordinate2 - firstYCoordinate1) * (secondYCoordinate2 - firstYCoordinate1) + (secondXCoordinate2 - firstXCoordinate1) * (secondXCoordinate2 - firstXCoordinate1));
        return euclideanDistance;
    }
    public static void main(String[] args){
        DistanceCalculator euclideanDistance= new DistanceCalculator();
        System.out.println(euclideanDistance.findEuclideanDistance(2,4,3,8)) ;
    }
}

