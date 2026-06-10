public class LinkedList {
    public static class Node
    {
         int data=0;
         Node next=null;
         public Node(int data)
         {
            this.data=data;
            this.next=next;
         }
    }
    public static Node Head;
    public static Node Tail;
    public void addfirst(int data)
    {
        Node newNode = new Node(data);
        if(Head==null)
        {
            Head=Tail=newNode;
            return;
        }
        newNode.next=Head;
        Head=newNode;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addfirst(4);
        ll.addfirst(8);
        ll.addfirst(15);
    }
}


