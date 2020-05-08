package com.bridgelabz.EuclideanTest;

import com.bridgelabz.Euclidean.Euclidean;
import org.junit.Assert;
import org.junit.Test;

public class EuclideanTest {
    @Test
    public void givenTwoPoints_WhenFindEuclideanDistance() {
        Euclidean euclidean = new Euclidean();
        double distance = euclidean.findEuclideanDistance(2, 4, 1, 3);
        Assert.assertEquals(2.8284271247461903, distance, 0);
    }
}
