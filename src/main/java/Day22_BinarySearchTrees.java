import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Day22_BinarySearchTrees{
    public static int getHeight(Node root){
        int height = 0;
        if(root == null){
            height = -1;
        }else{
            height = 1 + max(getHeight(root.left), getHeight(root.right));
        }
        return height;
    }

    public static int max(int left, int right){
        if(left >= right){
            return left;
        }else{
            return right;
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}


