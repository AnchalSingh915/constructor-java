import java.io.*;
class con3
{
    public con3(int x)//parameterized constructor
    {
        int y=0,z=0;
        for(y=1;y<=x;y++)
        {
            if(x%y==0)
            z=z+1;
        }
        if(z==2)
        System.out.println("prime no."+x);
        else
        System.out.println("non prime no."+x);
    }
    public static void main(String ar[])
    {
        try
        {
            int a=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the no.");
            a=Integer.parseInt(br.readLine());
            con3 obj=new con3(a);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
