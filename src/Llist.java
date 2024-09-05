class Node1
{
    String data;
    Node1 next;

    Node1(String data)
    {
        this.data=data;
        this.next=null;
    }
}
class LL
{
    Node1 head;
    void first(String data)
    {
        Node1 newnode= new Node1(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        else {
            newnode.next=head;
            head=newnode;
        }
    }

    void last(String data)
    {
        Node1 newnode = new Node1(data);
        if(head==null)
        {
            head=newnode;
            return;

        }
        else {
            Node1 curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newnode;
        }
    }
    void print()
    {
        if(head==null)
        {
            System.out.println("null");
            return;
        }
        Node1 curr;
        curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data + "-->");
            curr=curr.next;


        }
        System.out.println("NULL");

    }
    void fristdelete()
    {
        if(head==null)
        {
            return;
        }
        head=head.next;
    }
    void lastdelete()
    {
        if(head==null)
        {
            return;
        }
        Node1 curr=head;
        while(curr.next.next!=null)
        {
            curr = curr.next;
        }
        curr.next=null;

    }
}
class Llist1{
    public static void main(String[] args) {
        LL obj1 = new LL();

        obj1.first("a");
        obj1.first("is");
       obj1.print();


        obj1.last("good");
        obj1.print();


        obj1.first("gayathri");
        obj1.print();


        obj1.fristdelete();
        obj1.print();


        obj1.lastdelete();
        obj1.print();


    }
}


