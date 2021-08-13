package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testLength(){
        Point p1 = new Point(1, 5);
        Point p2 = new Point(1, 10);
        Assert.assertEquals(p1.distance(p2), 5);
    }
}
