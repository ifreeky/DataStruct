package com.ifreeky.learn.exc.binary.order;

/**
 * 顺序二叉树
 * 1. 顺序二叉树通常只考虑完全二叉树
 * 2. 第n个元素的左子节点为 2 * n + 1
 * 3. 第n个元素的右子节点为 2 * n + 2
 * 4. 第 n 个元素的父节点为 (n-1) / 2
 * 5. n : 表示二叉树中的第几个元素
 *
 * @author ifreeky
 * @since 31 五月 2020
 */
public class OrderBinaryTree {

    /**
     * 存放数据节点的数组
     */
    private int[] arr;

    public OrderBinaryTree(int[] arr) {
        this.arr = arr;
    }

    /**
     * 前序遍历
     */
    public void preOrder() {
        preOrder(0);
    }

    /**
     * 中序遍历
     */
    public void midOrder() {
        midOrder(0);
    }


    /**
     * 后序遍历
     */
    public void postOrder() {
        postOrder(0);
    }

    private void preOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空");
            return;
        }

        System.out.println(arr[index]);

        //向左遍历
        if (index * 2 + 1 < arr.length) {
            preOrder(index * 2 + 1);
        }

        if (index * 2 + 2 < arr.length) {
            preOrder(index * 2 + 2);
        }
    }

    private void midOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空");
            return;
        }

        //向左遍历
        if (index * 2 + 1 < arr.length) {
            midOrder(index * 2 + 1);
        }

        System.out.println(arr[index]);

        if (index * 2 + 2 < arr.length) {
            midOrder(index * 2 + 2);
        }
    }


    private void postOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空");
            return;
        }

        //向左遍历
        if (index * 2 + 1 < arr.length) {
            postOrder(index * 2 + 1);
        }

        if (index * 2 + 2 < arr.length) {
            postOrder(index * 2 + 2);
        }
        System.out.println(arr[index]);
    }
}
