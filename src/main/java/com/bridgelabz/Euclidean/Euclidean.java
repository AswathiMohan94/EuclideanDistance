package com.bridgelabz.Euclidean;

public class Euclidean {
    public double findEuclideanDistance(double x1, double x2, double y1, double y2) {
        double euclideanDistance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        return euclideanDistance;

    }
}
