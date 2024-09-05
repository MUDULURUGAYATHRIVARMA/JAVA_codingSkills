abstract class abstractclass {
    void display()
    {
        System.out.println("turn");

    }
}
class sem extends abstractclass
{
    void display()
    {
        System.out.println("turn off");
    }
}
class main
{
    public static void main(String[] args) {
        sem obj = new sem();
        obj.display();
    }
}