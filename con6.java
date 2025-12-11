import java.io.*;
class con6
{
    public con6(int x)//parameterized constructor
    {
        int y=0,z=1,a=0;
        for(;x>0;)
        {
            a=x%10;
            y=y+a;
            z=z*a;
            x=x/10;
        }
        if(z==y)
        System.out.println("spy no.");
        else
        System.out.println("not spy no.");
    }
    public static void main(String ar[])
    {
        try
        {
            int a=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the no.");
            a=Integer.parseInt(br.readLine());
            con6 obj=new con6(a);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
