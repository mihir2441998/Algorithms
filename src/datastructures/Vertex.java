package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {

    T data;
    boolean visited;
    List<Vertex<T>> neighbours;

    public Vertex(T data) {
        this.data = data;
        this.neighbours = new ArrayList<>();
        this.visited= false;
    }

    public List<Vertex<T>> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex<T>> neighbours) {
        this.neighbours = neighbours;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
