 class Node{
        Node next;
        Node prev;
        int val;
        int key;
        Node(int val,int key){
            this.key=key;
            this.val=val;
        }
    }
class LRUCache {
    Node dhead=new Node(-1,-1);
    Node dtail=new Node(-1,-1);
    Map<Integer,Node> map=new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        dhead.next=dtail;
        dtail.prev=dhead;
    }
    private void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void insert(Node node){
        map.put(node.key,node);
        Node headnxt=dhead.next;
        dhead.next=node;
        node.prev=dhead;
        headnxt.prev=node;
        node.next=headnxt;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        } else{
            return -1;
        }
    }
    
    
    
   
  

    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(dtail.prev);
        }
        insert(new Node(value,key));
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

