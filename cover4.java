import java.io.*;
class cover4
{
    public cover4(int x)//parameterized constructor
    { 
        int z=1,l=0;
          for(z=1;z<=x;z++)
          {
              if(x%z==0)
                l=l+1;
          }
            if(l==2)
             System.out.println("prime no."+x);
            else
             System.out.println("non prime no."+x);
    }
    public cover4(int x,int y)//parameterized constructor
      {     int z=0,l=0,u=0;
            if(x-y==2 || y-x==2)
            {
                l=0;
                for(z=1;z<=x;z++)
                {
                    if(x%z==0)
                    l=l+1;
                }
                if(l==2)
                {
                    u=0;
                    for(z=1;z<=y;z++)
                    {
                        if(y%z==0)
                        u=u+1;
                    }
                    if(u==2)
                    System.out.println("twin prime no.");
                    else
                    System.out.println("non twin prime no.");
                }
                else
                System.out.println("non twin prime no.");
            }
            else
            System.out.println("non twin prime no.");
       }
    public static void main(String ar[])
    {
        cover4 obj1,obj2;
        try
        {
            int a=0,b=0,c=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the first no.");
            a=Integer.parseInt(br.readLine());
            System.out.println("enter the second no.");
            b=Integer.parseInt(br.readLine());
            System.out.println("1.for first number is prime or not");
            System.out.println("2. for both number are twin prime or not");
            System.out.println("enter the choice");
            c=Integer.parseInt(br.readLine());
            if(c==1)
            obj1=new cover4(a);    
            if(c==2)
            obj2=new cover4(a,b);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
