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
public class TriangleExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PotentialTriangle pt3 = new PotentialTriangle(Integer.MAX_VALUE+1 , Integer.MAX_VALUE, 1);
        //PotentialTriangle pt4 = new PotentialTriangle(1, 0, 3);
        //System.out.println(TriangleType.ofPotentialTriangle(pt));
        //System.out.println(TriangleType.ofPotentialTriangle(pt1));
        //System.out.println(TriangleType.ofPotentialTriangle(pt2));
        System.out.println(TriangleType.ofPotentialTriangle(pt3));
        //System.out.println(TriangleType.ofPotentialTriangle(pt4));
        
                }
    
}
