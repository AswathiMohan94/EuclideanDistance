package com.bridgelabz.distance;

import org.junit.Assert;
import org.junit.Test;

public class DistanceTest {
    private Distance euclideanDistance;
    @Test
    public void givenValuesOfCoordinates_IfValidForCalculation_ShouldReturnDistance() throws EuclideanDistanceException {
         euclideanDistance= new Distance(2,4,3,8);
        euclideanDistance.findEuclideanDistance();
        Assert.assertEquals("euclidean distance ='4.123105625617661'",euclideanDistance.toString());

    }
    @Test
    public void givenValuesOfCoordinates_IfInValidForCalculation_ShouldThrowException() throws EuclideanDistanceException {
        try {
            euclideanDistance = new Distance(2, 4, 2, 4);
            euclideanDistance.findEuclideanDistance();
        }catch (EuclideanDistanceException e)
        {
            Assert.assertEquals("Euclidean distance cannot be calculated for these values",e.getMessage());
        }
    }

}
