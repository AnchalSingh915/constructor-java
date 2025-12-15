import java.io.*;
class cover3
{
    public cover3(int x)//parameterized constructor
    { 
        int y=1,z=0;
        for(y=1;y<=10;y++)
        {
            z=x*y;
            System.out.println(x+"*"+y+"="+z);
        }
    }
    public cover3(int x,int y)//parameterized constructor
    {
        int z=1,l=0,m=0;
        for(z=1;z<=10;z++)
        {
            for(m=x;m<=y;m++)
            {
                l=m*z;
                System.out.print(m+"*"+z+"="+l+"\t");
            }
         System.out.println(" ");
        }
    }
    public static void main(String ar[])
    {
        cover3 obj1,obj2;
        try
        {
            int a=0,b=0,c=0;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the first no.");
            a=Integer.parseInt(br.readLine());
            System.out.println("enter the second no.");
            b=Integer.parseInt(br.readLine());
            System.out.println("1.for first number range");
            System.out.println("2. for specific range");
            System.out.println("enter the choice");
            c=Integer.parseInt(br.readLine());
            if (c==1)
            obj1=new cover3(a);    
            if(c==2)
            obj2=new cover3(a,b);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
