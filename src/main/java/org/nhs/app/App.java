/*public class App
{
    public static void main(String args[])
    {
        int foo=3;
        for(int n=0;foo>n;n+=2)
        {
         foo++;
         System.out.println(foo+" "+n+" ");}}}*/

public class App
{
    public static void main(String args[])
    {
        problem();
        practice1();
        practice2();
        practice3();
        challenge();
    }
    public static void problem()
    {
        for(int number=1;number<=5;number++)
        {
            for(int counter=1;counter<=4;counter++)

            {
                System.out.print(number);
            }
         System.out.println();
        }
    }

    public static void practice1()
    {
        for(int number=1;number<=5;number++)
        {
            for(int counter=1;counter<=number;counter++)

            {
                System.out.print(number);
            }
         System.out.println();
        }
    }

    public static void practice2()
    {
        int counter;
        int j;
        for(int number=1;number<=5;number++)
        {
            for(counter=5-number;counter>0;counter--)

            {
                System.out.print(".");
            }
            for(j=1;j<=number;j++)
            {
                System.out.print(number);
            }
         System.out.println();
        }
    }

    public static void practice3()
    {
        for(int number=1;number<=5;number++)
        {
            for(int counter=1;counter<=5;counter++)

            {
                if(counter==6-number)
                {
                System.out.print(number);
                }
                else
                {
                    System.out.print(".");
                }
                }
            
         System.out.println();
        }
    }

    public static void challenge()
    {
        int i;
        int j;
        int k;
        int l;
        int m;
        int n;
        for(i=1;i<=9;i++)
        { 
           for(j=9-i;j>0;j--)
           {
               System.out.print(" ");
           }
           for(k=1;k<=2*i;k++)
           {
               System.out.print(i);
           }
           System.out.println();
        }
        for(i=8;i>0;i--)
        { 
           for(j=9-i;j>0;j--)
           {
               System.out.print(" ");
           }
           for(k=1;k<=2*i;k++)
           {
               System.out.print(i);
           }
           System.out.println();
        }
    }
}
