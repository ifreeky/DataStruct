package com.ifreeky.learn.exc.binary.huffmantree;


import com.ifreeky.learn.exc.binary.base.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 哈夫曼树
 * 构建思路
 * 1. 从小到大排序，将每个数据看做一个节点，即一颗最简单的二叉树
 * 2. 取出权值最小的两颗二叉树
 * 3. 组成一颗新的二叉树，该新的二叉树的根节点的权值是前面两颗二叉树根节点的权值的和
 * 4. 再将这颗新的二叉树放入序列中，按照根节点的权值进行排序，重复1~4，就得到了一颗哈弗曼树
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
