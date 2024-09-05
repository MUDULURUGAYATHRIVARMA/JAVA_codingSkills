public class inhertance {
        int legs=4;
        public static void eat()
        {
            System.out.println("eating");

        }
        public static void sleep()
        {
            System.out.println("sleeping");

        }
        public int get()
        {
            return legs;
        }


    }
    class dog extends inhertance{
        String name="jimmy";
    }
    class hello
    {
        public static void main(String[] args)
        {
            inhertance obj1=new inhertance();
            System.out.println(obj1.legs);
            obj1.eat();
            obj1.sleep();
            System.out.println(obj1.get());

            dog obj2 = new dog();
            System.out.println(obj2.name);



        }
    }

