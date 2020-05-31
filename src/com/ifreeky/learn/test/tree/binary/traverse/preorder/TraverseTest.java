package com.ifreeky.learn.test.tree.binary.traverse.preorder;

import com.ifreeky.learn.tree.binary.base.Node;
import com.ifreeky.learn.tree.binary.traverse.midorder.MiddleOrder;
import com.ifreeky.learn.tree.binary.traverse.postorder.PostOrder;
import com.ifreeky.learn.tree.binary.traverse.preorder.PreOrder;

/**
 * @author ifreeky
 * @since 15 五月 2020
 */
public class TraverseTest {

   private static Node root = new Node(1);
     static {
         Node node2 = new Node(2);
         Node node3 = new Node(3);
         Node node4 = new Node(4);
         Node node5 = new Node(5);
         Node node6 = new Node(6);
         Node node7 = new Node(7);
         root.setLeft(node2);
         root.setRight(node3);
         node2.setLeft(node4);
         node2.setRight(node5);
         node3.setLeft(node6);
         node3.setRight(node7);

    }

    public static void main(String[] args) {
        TraverseTest traverseTest = new TraverseTest();
        traverseTest.testMiddleOrder();
    }
    public void testPreOrder(){
        PreOrder preOrder = new PreOrder();
        preOrder.unRecursive(root);
    }

    public void testMiddleOrder() {
        MiddleOrder middleOrder = new MiddleOrder();
        middleOrder.unRecursive(root);
    }

    public void testPostOrder() {
        PostOrder postOrder = new PostOrder();
        postOrder.unRecursive(root);
    }
}
