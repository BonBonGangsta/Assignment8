import java.util.ArrayList;

/**
 * Write a Java program that uses a backtracking approach with a bounding function to solve (or not solve...depending
 * on the weights) the sum of subsets problem. To get any credit your output must show similar to the following (for the
 * example I did in class):
 *
 * X0[0,73], x1=1[5,68], x2=1[15,58], x3=1[27,46], x4=1[40,33] B1, x4=0[27,33],x5=1[43,18] B1, x5=0[27,18], x6=1[45,0]
 * B1, x6=0[27,0] B2,...x5=0[28,18], x6=1[46,0] B1,...x4=0[15,33],x5=1[30,18] Solution found: X1=1, X2=1, X3=0, X4=0,
 * X5=1, X6=0
 */

public class Moonwalker {

    private ArrayList<Integer> allObjectWeights = null;
    private int totWeight = 0;
    private int goalWeight = 0;

    Moonwalker(ArrayList<Integer> weights, int goalWeight){
        this.allObjectWeights = weights;
        this.goalWeight = goalWeight;
    }

    private void calcTotWeight(){
        for (int w: allObjectWeights){
            totWeight += w;
        }
    }

    public int getTotWeight(){
        return totWeight;
    }

    

    


}
