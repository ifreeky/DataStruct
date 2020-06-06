package com.ifreeky.learn.tree.binary.threaded;

import com.ifreeky.learn.tree.binary.base.Node;

/**
 * @author ifreeky
 * @since 06 六月 2020
 */
public class ThreadedNode extends Node {

    /**
     * 如果leftType=0,表示指向的是左子树，如果为1，表示指向的是前驱结点
     */
    private int leftType;

    /**
     * 如果rightType=0,表示指向的是右子树，如果为1，表示指向的是后继结点
     */
    private int rightType;

    public ThreadedNode(int data) {
        super(data);
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }
}
