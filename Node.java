package huffman;

/**
 * Node class for the Huffman tree.
 * @author Christopher Lee
 */
public class Node implements Comparable<Node> {
    public Node leftChild, rightChild;
    public char value;
    public int frequency;
    
    /**
     * Base constructor; creates an empty node.
     */
    public Node() {
        this.leftChild = null;
        this.rightChild = null;
    }
    
    /**
     * Overloaded constructor; creates a node with the given parameters.
     * 
     * @param leftChild Reference to the left subtree
     * @param rightChild Reference to the right subtree
     * @param value Character of a leaf node
     * @param frequency Frequency of the subtree rooted a this node
     */
    public Node(Node leftChild, Node rightChild, char value, int frequency) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.value = value;
        this.frequency = frequency;
    }

    /**
     * Compare Huffman nodes by frequency.
     * 
     * @param t Node being compared to
     * @return 
     */
    @Override
    public int compareTo(Node t) {
        return this.frequency - t.frequency;
    }
}
