public class ocurrence {
    static int first= -1;
     static int last=-1;
    public static void findoccurence(String str,int ind,char element)
    {
        if(ind==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;

        }
        char currchar=str.charAt(ind);
        if(currchar==element)
        {
            if(first==-1)
            {
                first=ind;
            }else {
                last=ind;
            }
        }
//        findoccurence(str,ind+1,element);
//        if(ind==str.length())
//        {
//            System.out.println(first);
//            System.out.println(last);
//            return;
//
//        }
        findoccurence(str,ind+1,element);


    }

    public static void main(String[] args) {
        String str="ahsaaaaghjaaahja";
        findoccurence(str,0,'a');
    }
}
