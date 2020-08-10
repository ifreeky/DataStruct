package com.ifreeky.learn.exc.binary.threaded;

/**
 * 线索化二叉树
 *
 * @author ifreeky
 * @since 06 六月 2020
 */
public class ThreadedBinaryTree {

    private ThreadedNode preThreadedNode;

    public void midThreadedBinaryTree(ThreadedNode threadedNode) {
        if (threadedNode == null) {
            return;
        }

        midThreadedBinaryTree(threadedNode.getLeft());

        // 线索化前驱结点
        if (threadedNode.getLeft() == null) {
            threadedNode.setLeft(preThreadedNode);
            threadedNode.setLeftType(1);
        }

        // 线索化后继结点
        if (preThreadedNode != null && preThreadedNode.getRight() == null) {
            preThreadedNode.setRight(threadedNode);
            preThreadedNode.setRightType(1);
        }

        preThreadedNode = threadedNode;

        midThreadedBinaryTree(threadedNode.getRight());
    }

    /**
     * 遍历中序线索化二叉树
     */
    public void midOrderTraverseThreadedBinaryTree(ThreadedNode threadedNode) {
        ThreadedNode node = threadedNode;
        while (node != null) {

            while (node.getLeftType() == 0) {
                node = node.getLeft();
            }

            System.out.println(node.getData());

            while (node.getRightType() == 1) {
                node = node.getRight();
                System.out.println(node.getData());
            }

            node = node.getRight();
        }


    }
}
