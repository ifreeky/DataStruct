package com.ifreeky.learn.test.tree.binary.order;

import com.ifreeky.learn.exc.tree.binary.order.OrderBinaryTree;

/**
 * @author ifreeky
 * @since 31 五月 2020
 */
public class OrderBinaryTreeTest {

    public static void main(String[] args) {
        OrderBinaryTree preOrderBinaryTree = new OrderBinaryTree(new int[]{1, 2, 3, 4, 5, 6, 7});
        preOrderBinaryTree.preOrder();

        OrderBinaryTree midOrderBinaryTree = new OrderBinaryTree(new int[]{1, 2, 3, 4, 5, 6, 7});
        midOrderBinaryTree.midOrder();

        OrderBinaryTree postOrderBinaryTree = new OrderBinaryTree(new int[]{1, 2, 3, 4, 5, 6, 7});
        postOrderBinaryTree.postOrder();


    }
}
