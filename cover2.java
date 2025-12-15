import java.io.*;
class cover2
{
    public cover2(int x)//parameterized constructor
    {
         System.out.println("max is"+x);
    }
    public cover2(int x,int y)//parameterized constructor
    {
        if(x>y)
        System.out.println("max is"+x);
        else
        System.out.println("max is"+y);
    }
    public cover2(int x,int y,int z)//parameterized constructor
    {
        if(x>y && x>z)
        System.out.println("max is"+x);
        if(y>x && y>z)
        System.out.println("max is"+y);
        else
        System.out.println("max is"+z);
    }
    public static void main(String ar[])
    {
        try
        {
            int a=0,b=0,c=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the no.");
            a=Integer.parseInt(br.readLine());
            System.out.println("enter the no.");
            b=Integer.parseInt(br.readLine());
            System.out.println("enter the no.");
            c=Integer.parseInt(br.readLine());
            cover2 obj1=new cover2(a);
            cover2 obj2=new cover2(a,b);
            cover2 obj3=new cover2(a,b,c);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
