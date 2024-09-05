public class overriding {
    void sum()
    {
        System.out.println("hello");

    }
}
class child extends overriding
{
    void sum()
    {
        System.out.println("hiiiiii");

    }

}
class gayu
{
    public static void main(String[] args) {
//        overriding obj =new overriding();
//        obj.sum();


      child obj2 = new child();
        obj2.sum();


    }
}
