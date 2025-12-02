import datastructures.Vertex;
import search.BFS;
import search.BinarySearch;
import search.DFS;
import search.LinearSearch;
import sort.*;
import twopointers.LargestRectangleHistogram;
import twopointers.ThreeSum;

void main() {

    sortAlgos();

    searchAlgos();

    twoPointers();

}

private static void twoPointers() {
    LargestRectangleHistogram.largestRectangleHistogram();

    ThreeSum.threeSum();
}

private void searchAlgos() {
    breadthFirstSearch();

    depthFirstSearch();
}

private static void sortAlgos() {
    bubbleSort();

    selectionSort();

    insertionSort();

    mergeSort();

    radixSort();

    quickSort();

    linearSearch();

    binarySearch();
}

private static void binarySearch() {
    int[] arr7 = {1, 5, 6, 18, 39, 100};
    System.out.println("\nbinary search:");
    System.out.println(BinarySearch.search(arr7, 5));
}

private static void linearSearch() {
    int[] arr6 = {5, 2, 8, 4, 1};
    System.out.println("\nlinear search:");
    System.out.println(LinearSearch.search(arr6, 1));
}

private static void quickSort() {
    int[] arr5 = {5, 2, 8, 4, 1};
    System.out.println("\nquick sort:");
    RadixSort.sort(arr5);
    for (int num : arr5)
        System.out.print(num + "\t");
    System.out.println();
}

private static void radixSort() {
    int[] arr4 = {5, 2, 8, 4, 1};
    System.out.println("\nradix sort:");
    RadixSort.sort(arr4);
    for (int num : arr4)
        System.out.print(num + "\t");
    System.out.println();
}

private static void mergeSort() {
    int[] arr3 = {5, 2, 8, 4, 1};
    System.out.println("\nmerge sort:");
    MergeSort.sort(arr3, 0, arr3.length - 1);
    for (int num : arr3)
        System.out.print(num + "\t");
    System.out.println();
}

private static void insertionSort() {
    int[] arr2 = new int[]{5, 3, 6, 1, 2};
    arr2 = InsertionSort.sort(arr2);
    System.out.println("\ninsertion sort:");
    for (int i = 0; i < 5; i++) {
        System.out.print(arr2[i] + "\t");
    }
}

private static void selectionSort() {
    int[] arr1 = new int[]{5, 3, 6, 1, 2};
    arr1 = SelectionSort.sort(arr1);
    System.out.println("\nselection sort:");
    for (int i = 0; i < 5; i++) {
        System.out.print(arr1[i] + "\t");
    }
}

private static void bubbleSort() {
    int[] arr = new int[]{5, 3, 6, 1, 2};
    arr = BubbleSort.sort(arr, 5);
    System.out.println("bubble sort:");
    for (int i = 0; i < 5; i++) {
        System.out.print(arr[i] + "\t");
    }
}

private void breadthFirstSearch() {

    Vertex<Integer> v1 = new Vertex<>(1);
    Vertex<Integer> v2 = new Vertex<>(2);
    Vertex<Integer> v3 = new Vertex<>(3);
    Vertex<Integer> v4 = new Vertex<>(4);
    Vertex<Integer> v5 = new Vertex<>(5);
    Vertex<Integer> v6 = new Vertex<>(6);

    v1.setNeighbours(List.of(v2, v6));
    v2.setNeighbours(List.of(v5));
    v4.setNeighbours(List.of(v5, v3));
    v5.setNeighbours(List.of(v1));
    v6.setNeighbours(List.of(v4));

    System.out.println("search.BFS traversal: ");
    BFS<Integer> bfs = new BFS<>(v1);
    bfs.traverse();

}

private void depthFirstSearch() {

    Vertex<Integer> v1 = new Vertex<>(1);
    Vertex<Integer> v2 = new Vertex<>(2);
    Vertex<Integer> v3 = new Vertex<>(3);
    Vertex<Integer> v4 = new Vertex<>(4);
    Vertex<Integer> v5 = new Vertex<>(5);
    Vertex<Integer> v6 = new Vertex<>(6);

    v1.setNeighbours(List.of(v2, v6));
    v2.setNeighbours(List.of(v5));
    v4.setNeighbours(List.of(v5, v3));
    v5.setNeighbours(List.of(v1));
    v6.setNeighbours(List.of(v4));

    System.out.println("\nsearch.DFS traversal: ");
    DFS<Integer> dfs = new DFS<>(v1);
    dfs.traverse();

}
