package Tree;

public class t1 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     public static class T{
        static int idx = -1;
        public static Node BuildTree( int nodes []){
    idx++;
    if(nodes[idx]==-1){
        return null;}
    Node Newnode = new Node(nodes[idx]);
    Newnode.left = BuildTree(nodes);
    Newnode.right = BuildTree(nodes);
    return Newnode;
        }
    }
    public static void main(String[] args) {
        int nodes [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         T t = new T();
         Node root = t.BuildTree(nodes);
        System.out.println(root.data);
    }

}
