package com.ifreeky.learn.tree.binary.huffmantree;


import com.ifreeky.learn.tree.binary.base.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 哈夫曼树
 * @author ifreeky
 * @since 27 六月 2020
 */
public class HuffmanTree {

    public Node createHuffmanTree(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        List<Node> nodeList = Arrays.stream(arr)
                .mapToObj(Node::new)
                .collect(Collectors.toList());
        while (nodeList.size() > 1) {
            Collections.sort(nodeList);
            Node leftNode = nodeList.get(0);
            Node rightNode = nodeList.get(1);
            Node parentNode = new Node(leftNode.getData() + rightNode.getData());
            parentNode.setLeft(leftNode);
            parentNode.setRight(rightNode);
            nodeList.remove(leftNode);
            nodeList.remove(rightNode);
            nodeList.add(parentNode);
        }
        return nodeList.get(0);
    }
}
