package com.ifreeky.learn.test.tree.binary.threaded;

import com.ifreeky.learn.tree.binary.threaded.ThreadedBinaryTree;
import com.ifreeky.learn.tree.binary.threaded.ThreadedNode;

/**
 * @author ifreeky
 * @since 06 六月 2020
 */
public class ThreadedBinaryTreeTest {


    public static void main(String[] args) {
        ThreadedNode root = new ThreadedNode(1);
        ThreadedNode node2 = new ThreadedNode(3);
        ThreadedNode node3 = new ThreadedNode(6);
        ThreadedNode node4 = new ThreadedNode(8);
        ThreadedNode node5 = new ThreadedNode(10);
        ThreadedNode node6 = new ThreadedNode(14);
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        ThreadedBinaryTree threadedBinaryTree = new ThreadedBinaryTree();

        threadedBinaryTree.midThreadedBinaryTree(root);
        System.out.println(node5.getLeft().getData());
        System.out.println(node5.getRight().getData());
    }
}
