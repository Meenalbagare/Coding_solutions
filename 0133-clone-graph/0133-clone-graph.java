/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> hashmap=new HashMap<>();
        return dfs(node,hashmap);
    }
    public Node dfs(Node node,HashMap<Node,Node> hashmap){
        if(node==null){
            return null;
        }
        if (hashmap.containsKey(node)){
            return hashmap.get(node);
        }
        Node clone=new Node(node.val);
        hashmap.put(node,clone);
        
        for(Node nei : node.neighbors){
            clone.neighbors.add(dfs(nei,hashmap));
        }
        return clone;
                                   
                                 
    }
}