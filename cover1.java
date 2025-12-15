import java.io.*;
class cover1
{
    public cover1(int x)//parameterized constructor
    {
        int y=0;
        y=y+x;
        System.out.println("sum is"+y);
    }
    public cover1(int x,int y)//parameterized constructor
    {
        int z=0;
        z=x+y;
        System.out.println("sum is"+z);
    }
    public cover1(int x,int y,int z)//parameterized constructor
    {
        int l=0;
        l=x+y+z;
        System.out.println("sum is"+l);
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
            cover1 obj1=new cover1(a);
            cover1 obj2=new cover1(a,b);
            cover1 obj3=new cover1(a,b,c);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
