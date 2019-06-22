package com.gradle.study;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(1, 2);
    }

    @Test
    public void should_calculate_and_return_area() {
        Assert.assertEquals(2, rectangle.calculateArea());
    }

    @Test
    public void should_calculate_and_return_circumference() {
        Assert.assertEquals(6, rectangle.calculateCircumference());
    }
}