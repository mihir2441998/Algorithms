//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    int[] arr = new int[]{5,3,6,1,2};
    arr = BubbleSort.sort(arr, 5);
    System.out.println("bubble sort:");
    for(int i = 0; i< 5; i++)
    {
        System.out.print(arr[i] + "\t");
    }

    arr = SelectionSort.sort(arr);
    System.out.println("\nselection sort:");
    for(int i = 0; i< 5; i++)
    {
        System.out.print(arr[i] + "\t");
    }

    arr = InsertionSort.sort(arr);
    System.out.println("\ninsertion sort:");
    for(int i = 0; i< 5; i++)
    {
        System.out.print(arr[i] + "\t");
    }

    int[] arr1 = {5, 2, 8, 4, 1};
    System.out.println("\nmerge sort:");
    MergeSort.sort(arr, 0, arr.length - 1);
    for (int num : arr)
        System.out.print(num + "\t");
    System.out.println();

    int[] arr2 = {5, 2, 8, 4, 1};
    System.out.println("\nradix sort:");
    RadixSort.sort(arr);
    for (int num : arr)
        System.out.print(num + "\t");
    System.out.println();


    int[] arr3 = {5, 2, 8, 4, 1};
    System.out.println("\nquick sort:");
    RadixSort.sort(arr);
    for (int num : arr)
        System.out.print(num + "\t");
    System.out.println();

    int[] arr4 = {5, 2, 8, 4, 1};
    System.out.println("\nlinear search:");
    System.out.println(LinearSearch.search(arr4, 1));

    int[] arr5 = {1,5,6,18,39,100};
    System.out.println("\nbinary search:");
    System.out.println(BinarySearch.search(arr5, 5 ));

    breadthFirstSearch();
    depthFirstSearch();

}

private void breadthFirstSearch() {

    Vertex<Integer>  v1 = new Vertex<>(1);
    Vertex<Integer>  v2 = new Vertex<>(2);
    Vertex<Integer>  v3 = new Vertex<>(3);
    Vertex<Integer>  v4 = new Vertex<>(4);
    Vertex<Integer>  v5 = new Vertex<>(5);
    Vertex<Integer>  v6 = new Vertex<>(6);

    v1.setNeighbours(List.of(v2, v6));
    v2.setNeighbours(List.of(v5));
    v4.setNeighbours(List.of(v5,v3));
    v5.setNeighbours(List.of(v1));
    v6.setNeighbours(List.of(v4));

    System.out.println("BFS traversal: ");
    BFS<Integer> bfs= new BFS<>(v1);
    bfs.traverse();

}

private void depthFirstSearch() {

    Vertex<Integer>  v1 = new Vertex<>(1);
    Vertex<Integer>  v2 = new Vertex<>(2);
    Vertex<Integer>  v3 = new Vertex<>(3);
    Vertex<Integer>  v4 = new Vertex<>(4);
    Vertex<Integer>  v5 = new Vertex<>(5);
    Vertex<Integer>  v6 = new Vertex<>(6);

    v1.setNeighbours(List.of(v2, v6));
    v2.setNeighbours(List.of(v5));
    v4.setNeighbours(List.of(v5,v3));
    v5.setNeighbours(List.of(v1));
    v6.setNeighbours(List.of(v4));

    System.out.println("\nDFS traversal: ");
    DFS<Integer> dfs= new DFS<>(v1);
    dfs.traverse();

}
