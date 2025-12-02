package search;

import datastructures.Vertex;

import java.util.Deque;
import java.util.LinkedList;

public class DFS<T> {

    Vertex<T> start;

    public DFS(Vertex<T> start) {
        this.start = start;
    }

    public void traverse(){
        if(start == null) return;
        Deque<Vertex<T>> stack = new LinkedList<>();
        stack.push(start);
        while (!stack.isEmpty()){
            Vertex<T> current = stack.pop();
            while(!current.isVisited()){
                current.setVisited(true);
                System.out.print(current.getData() + "\t");

                for(Vertex<T> vertex: current.getNeighbours()){
                    if(!vertex.isVisited()){
                        stack.push(vertex);
                    }
                }
            }
        }
    }
}
