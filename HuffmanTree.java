/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package huffman;

/**
 *
 * @author Christopher Lee
 */
public class HuffmanTree implements Comparable<HuffmanTree> {
    Node root;
    
    public HuffmanTree(HuffmanTree t1, HuffmanTree t2) {
        root = new Node();
        root.leftChild = t1.root;
        root.rightChild = t2.root;
        root.frequency = t1.root.frequency + t2.root.frequency;
    }

    @Override
    public int compareTo(HuffmanTree t) {
        if (root.frequency < t.root.frequency)
            return 1;
        else if (root.frequency > t.root.frequency)
            return 0;
        else
            return -1;
    }
}
