class Node2
{
    int data;
    Node2 next;

    Node2(int data1)
    {
        this.data=data1;
        this.next=null;

    }
}

class recursion
{
    Node2 head;

    void insert(int data)
    {
        Node2 newnode= new Node2(data);
        if(head==null)
        {
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;

    }

    void rec()
    {

       if(head==null || head.next==null)
      {
           return ;
       }

        Node2 prev=null;
        Node2 temp=head;
        Node2 front = null;
        while(temp!=null)
        {
             front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
         //head.next=null;
        head=prev;

    }
  public Node2 recc(Node2 head)
    {
        if(head==null|| head.next==null)
        {
            return head;
        }

        Node2 newnode=recc(head.next);
        Node2  front=head.next;
        front.next=head;
        head.next=null;
        return newnode;


    }

    void print()
    {
        Node2 curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("NULL");
    }
}
public class reverselinkedlist {
    public static void main(String[] args) {
        recursion obj1 = new recursion();

        obj1.insert(10);
        obj1.insert(20);
        obj1.insert(30);
        obj1.insert(60);

        obj1.print();

//         obj1.rec();
//         obj1.print();


         obj1.head=obj1.recc(obj1.head);
         obj1.print();


    }
}
