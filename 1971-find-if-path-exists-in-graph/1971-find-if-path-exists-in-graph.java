class Solution {
    public boolean helper(int n, List<Integer>[] graph, int source, int destination,boolean visited[]){
        if(source==destination){
            return true;
        }
        visited[source]=true;
        for(int neighbor:graph[source]){
            if(!visited[neighbor] && helper(n,graph,neighbor,destination,visited)){
                return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] graph=new ArrayList[n];
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int[] e:edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        return helper(n,graph,source,destination,visited);
    }
}