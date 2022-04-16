/**
 * Write a Java program that uses a backtracking approach with a bounding function to solve (or not solve...depending
 * on the weights) the sum of subsets problem. To get any credit your output must show similar to the following (for the
 * example I did in class):
 *
 * X0[0,73], x1=1[5,68], x2=1[15,58], x3=1[27,46], x4=1[40,33] B1, x4=0[27,33],x5=1[43,18] B1, x5=0[27,18], x6=1[45,0]
 * B1, x6=0[27,0] B2,...x5=0[28,18], x6=1[46,0] B1,...x4=0[15,33],x5=1[30,18] Solution found: X1=1, X2=1, X3=0, X4=0,
 * X5=1, X6=0
 *
 * You must prompt the user for the weights W[i,j] (i.e., 5, 10, 12, 13, 15, 18) and the goal weight i.e., 30.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * TODO: 1. Do user Entry - ensure that we can take in as many object with their weights.
 *       2. Make sure we can get the total weight and goal weight
 *       3. 0/1 knapsack with backtracking.
 *          spanning tree with the root being [0, TotWeight]
 *          nodes being [0/1 (leave it or take it), the remaining weight]
 */

public class BacktrackingTester {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            ArrayList<Integer> weights = getObjectsAndWeights(scanner);
            printWeights(weights);
            System.out.print(getGoalWeight(scanner));
        }catch(Exception e){
            System.exit(0);
        }


    }

    /*
        From the user get the list of weights.
        Note: weights cannot be negative.
        array starts 0 therefore skip it.
     */
    public static ArrayList<Integer> getObjectsAndWeights(Scanner scan){
        ArrayList<Integer> weights = new ArrayList<>();
        System.out.println("Please list out the weights of the objects");
        try{
            scan = new Scanner(scan.nextLine());
            while(scan.hasNextInt()){
                int tempWeight = scan.nextInt();
                if(tempWeight <= 0){
                    throw new IllegalArgumentException();
                }
                weights.add(tempWeight);
            }
        }catch(IllegalArgumentException e){
            System.out.println("An invalid weight was given. Please re-run me again.");
            return null;
        }
        return weights;
    }

    public static void printWeights(ArrayList<Integer> list){
        for (int i : list){
            System.out.print( i + " ");
        }
        System.out.println();
    }

    public static int getGoalWeight(Scanner scan){
        System.out.println("Please enter the goal weight.");
        try{
            int goalWeight = scan.nextInt();
            if (goalWeight <= 0){
                throw new IllegalArgumentException();
            }
            return goalWeight;
        }catch(IllegalArgumentException e ){
            System.out.println("An illegal goal weight has been given. Please re-run me again.");
        }
        return 0;
    }
}
