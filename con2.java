import java.io.*;
class con2
{
    public con2(int x)//parameterized constructor
    {
        if(x%2==0)
        System.out.println("even"+x);
        else
        System.out.println("odd"+x);
    }
    public static void main(String ar[])
    {
        try
        {
            int a=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the no.");
            a=Integer.parseInt(br.readLine());
            con2 obj=new con2(a);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
