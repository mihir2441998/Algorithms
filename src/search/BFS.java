package search;

import datastructures.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class BFS<T> {

    Vertex<T> start;

    public BFS(Vertex<T> start) {
        this.start = start;
    }

    public void traverse(){
        if(start == null) return;
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            Vertex<T>  current = queue.poll();

            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.print(current.getData()+  "\t");

                for(Vertex<T> vertex: current.getNeighbours()){
                    if (!vertex.isVisited()){
                        queue.add(vertex);
                    }
                }
            }
        }
    }
}
