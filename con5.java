import java.io.*;
class con5
{
    public con5(int x)//parameterized constructor
    {
        int y=0,z=0,a=0;
        a=x;
        for(;x>0;)
        {
            y=x%10;
            z=z+y*y*y;
            x=x/10;
        }
        if(z==a)
        System.out.println("Armstrong no.");
        else
        System.out.println("non Armstrong no.");
    }
    public static void main(String ar[])
    {
        try
        {
            int a=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the no.");
            a=Integer.parseInt(br.readLine());
            con5 obj=new con5(a);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
