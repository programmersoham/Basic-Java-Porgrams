class Bank
    {
         String name;
         String type;
         int custID;
        double bal;
        Bank(String m,String cl,int c,double w)
        {
            name=m;
            type=cl;
            custID=c;
            bal=w;

        }
        void display()
        {
            System.out.println("Welcome " + name+"! . your accouont type is "+type+". Your custID is "+ custID + ". Your bal is "+ bal);

        }
        void balance()
        {
            System.out.println("Hello " + name + " your balance is "+ bal);
        }

        void withdraw(double a)
        {
             a=a;
             bal=bal-a;
        }
        void deposite(double b)
        {
            b=b;
            bal=bal+b;
        }




    }
public class BasicBank{
    public static void main(String args[]) 
    {
       Bank c1=new Bank("Ramesh", "saving", 501, 10000);
       Bank c2=new Bank("Suresh", "current", 404, 10000);
    //    c1.SetValue();
    //    c2.SetValue();
       c1.display();
       c2.display();

       c1.withdraw(1);
       c2.deposite(1);
       c1.balance();
       c2.balance();
        

        
    }
    
}