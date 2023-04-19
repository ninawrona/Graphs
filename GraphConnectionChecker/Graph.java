import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer> adjLists[];
    private int V;

    private int count;

    public Graph(int vertices){
        V = vertices;
        adjLists = new LinkedList[V];

        for(int i = 0; i<vertices; i++){
            adjLists[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int src, int dest){
        adjLists[src].add(dest);
    }

    void DFSUtil(int vertex, boolean visited[]){
        // Mark the current node as visited and print it
        visited[vertex] = true;
        System.out.print(vertex + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adjLists[vertex].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
            System.out.printf(" " + count);
        }
    }

    // The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper
        // function to print DFS
        // traversal
        while(hasUnvisitedNodes(adjLists)) {
            DFSUtil(v, visited);
            count++;
        }
    }

    private boolean hasUnvisitedNodes(LinkedList<Integer>[] adjLists) {
        for(int i = 0; i<)
    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        // Function call
        g.DFS(2);
        System.out.println("\n" + g.count);
    }

}
