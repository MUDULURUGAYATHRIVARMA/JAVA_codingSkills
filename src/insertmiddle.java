class Node
{
    int data;
    Node next;
     Node(int data1)
     {
         this.data=data1;
         this.next=null;
     }


}
class Listmiddle
{
    Node head;
    int size=0;

    void inset(int data)
    {
        Node newnode = new Node(data);
         if(head==null)
         {
             head=newnode;
             return;
         }
         newnode.next =head;
         head=newnode;
         size++;

    }

    void mid(int data)
    {
        Node newnode= new Node(data);
        if(head==null)
        {
            newnode.next=head;
            head=newnode;
            size++;
            return;
        }
        int midvalue=(size%2==0)?(size/2):(size+1)/2 ;
        Node curr =head;
        while(--midvalue>0)
        {
            curr=curr.next;

        }
        newnode.next = curr.next;
        curr.next=newnode;
    }
    void print()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->" );
            curr=curr.next;

        }
        System.out.println("  NULL");
    }
}


public class insertmiddle {
    public static void main(String[] args) {
        Listmiddle obj1 = new Listmiddle();
         obj1.inset(80);
         obj1.inset(90);
         obj1.print();


         obj1.mid(30);
         obj1.print();


         obj1.mid(20);
         obj1.print();




    }
}
