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
public class PotentialTriangle {
    private final long a, b, c;

    public PotentialTriangle(int sideA, int sideB, int sideC) {
        a = sideA;
        b = sideB;
        c = sideC;
    }

    public boolean isAnySideTooShort() {
        return a <= 0 || b <= 0 || c <= 0;
    }

    public boolean violatesTriangleInequality() {
        return a > b + c || b > a + c || c > a + b;
    }

    public boolean areSidesEqual() {
        return a == b && b == c;
    }

    public boolean areAtLeastTwoSidesEqual() {
        return a == b || b == c || c == a;
    }
    public boolean checkTriangle(){
        int max = (int) Math.max(Math.max(a, b), c); 
        if (max == a)
            return checkTriangleMax(a, b, c);
        else if (max == b)
            return checkTriangleMax(b, a, c);
        else  return checkTriangleMax(c, a, b);
    }
    
    public boolean checkTriangleMax(long max, long x, long y)
    {
        // Assume that we've already checked all three are > 0.
        // Therefore if x + y < 0 the sum overflowed and is greater than max.
        
        
        return x + y > 0 && x + y <= max;
            
    }
    
}
