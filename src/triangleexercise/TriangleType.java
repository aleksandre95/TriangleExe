/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangleexercise;

/**
 *
 * @author user
 */
public enum TriangleType {ISOSCELES,EQUILATERAL,SCALENE;

 public static TriangleType ofPotentialTriangle(PotentialTriangle triangle) {
        throwIf(triangle.isAnySideTooShort(), 
                "Length of sides cannot be equal to or less than zero");
        throwIf(triangle.violatesTriangleInequality(), 
                "Sum of any two sides must be larger than the remaining side");
        
        throwIf(triangle.checkTriangle(),"fault integrity");// The same as the above
        if (triangle.areSidesEqual()) {
            return EQUILATERAL;
        }
        if (triangle.areAtLeastTwoSidesEqual()) {
            return ISOSCELES;
        }
        return SCALENE;
    }

    private static void throwIf(boolean condition, String message) {
        if (condition) {
            throw new IllegalArgumentException(message);
        }
    }




    
}
