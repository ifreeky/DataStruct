package com.ifreeky.learn.test.tree.binary.huffmantree;

import com.ifreeky.learn.tree.binary.base.Node;
import com.ifreeky.learn.tree.binary.huffmantree.HuffmanTree;
import com.ifreeky.learn.tree.binary.traverse.preorder.PreOrder;

/**
 * @author ifreeky
 * @since 27 六月 2020
 */
public class HuffmanTreeTest {

    public static void main(String[] args) {
        int[] arr = {13, 7, 8, 3, 29, 6, 1};
        HuffmanTree huffmanTree = new HuffmanTree();
        Node huffmanTreeNode = huffmanTree.createHuffmanTree(arr);
        PreOrder preOrder = new PreOrder();
        preOrder.recursive(huffmanTreeNode);
    }
}
