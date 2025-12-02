package datastructures;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {

    T data;
    List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    void addChild(TreeNode<T> child){
        this.children.add(child);
    }



}