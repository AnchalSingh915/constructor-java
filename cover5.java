import java.io.*;
class cover5
{
    public cover5(int x)//parameterized constructor
    { 
        
    }
    public cover5(int x,int y)//parameterized constructor
      {     
       }
    public static void main(String ar[])
    {
        cover5 obj1,obj2;
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
            obj1=new cover5(a);    
            if(c==2)
            obj2=new cover5(a,b);
        }
        catch(Exception ge)
        {
            System.out.println(ge);
        }
    }
}
