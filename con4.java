import java.io.*;
class con4
{
    public con4(int a,int b)//parameterized constructor
    {
        int z=0,u=0,l=0;
        if(a-b==2 || b-a==2)
        {
                l=0;
                for(z=1;z<=a;z++)
                {
                    if(a%z==0)
                    l=l+1;
                }
                if(l==2)
                {
                    u=0;
                    for(z=1;z<=b;z++)
                    {
                        if(b%z==0)
                        u=u+1;
                    }
                    if(u==2)
                    System.out.println("twin prime no.");
                    else
                    System.out.println("non twin prime no.");;
                }
                else
                System.out.println("non twin prime no.");;
        }
        else
         System.out.println("non twin prime no.");;
    }
    public static void main(String ar[])
    {
        try
        {
            int x=0,y=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the no.");
            x=Integer.parseInt(br.readLine());
            System.out.println("enter the no.");
            y=Integer.parseInt(br.readLine());
            con4 obj=new con4(x,y);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
