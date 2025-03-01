package com.example.crapsgame;

/**
 *  ChallengesFPOE class have the challenges that we did in class
 *
 * @author Jeremy Astaiza Gutierrez
 * @version 1.0.0
 */



public class ChallengesFPOE {
    /**
     * It is the student full name
     * @serialField
     */
    private String studentName;

    /**
     * To calculate rectangle area
     * @param width: To represent the base of rectangle
     * @param height: To represent the height of rectangle
     * @return The rectangle are
     */
    public double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    /**
     * To calculate Triangle area
     * @param width: To represent the base of Triangle
     * @param height: To represent the height of Triangle
     * @return The Triangle are
     * @throws ArithmeticException division by 0
     */
    public double calculateTriangleArea(double width, double height) throws ArithmeticException {
        int divisor = 2;
        return (width * height) / divisor;
    }

    /**
     * To print in console rectangle area
     * @param width: To represent the base of rectangle
     * @param height: To represent the height of rectangle* @return The rectangle are
     * @see #calculateRectangleArea(double, double)
     * @since 1.0.0
     */
    public void ShowRectangleArea(double width, double height) {
        System.out.println("tThe rectangle area is: " + this.calculateRectangleArea(width, height));
    }
}

