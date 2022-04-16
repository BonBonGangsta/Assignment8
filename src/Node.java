public class Node {
    int cumulativeWeight = 0;
    int remainingWeight = 0;

    Node includeNode = null;
    Node excludeNode = null;

    Node(int cumulativeW, int remainingWeight){
        cumulativeWeight = cumulativeW;
        this.remainingWeight = remainingWeight;
    }
}
