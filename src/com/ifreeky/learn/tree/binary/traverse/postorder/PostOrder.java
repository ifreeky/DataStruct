package com.ifreeky.learn.tree.binary.traverse.postorder;

import com.ifreeky.learn.tree.binary.base.Node;

/**
 * @author ifreeky
 * @since 15 五月 2020
 */
public class PostOrder {

    public void recursive(Node root) {
        if (null == root){
            return;
        }
        recursive(root.getLeft());
        recursive(root.getRight());
        print(root);
    }


    private void print(Node node) {
        System.out.println(node.getData());
    }
}
