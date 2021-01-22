class Bank
{
    int Cust_ID;
    String Cust_Name;
    
    String Acc_Type;
    double Acc_Balance;
    
    Bank(int id, String Cust_Name, String Acc_Type, double Acc_Balance)
    {
        Cust_ID = id;     
        Cust_Name = Cust_Name;
        Acc_Type = Acc_Type;
        Acc_Balance = Acc_Balance;
    }
    
    void Print()
    {
        System.out.println("Hello  "+Cust_Name+" Your id is "+Cust_ID+" "+"Your Accout type is  "+Acc_Type+"Your balance is "+Acc_Balance);
    }
}
public class TestBank 
{
    public static void main(String args[])
    {
        Bank C1 = new Bank(001,"Richard","Savaing Account",100000);
        Bank C2 = new Bank(502,"Gilfoyle","Current Account",100000);
        Bank C3 = new Bank(150,"Donald","Recurring Deposite Account",100000);
        
        System.out.println("Custmor ID "+" Cust_Name "+" Acc_Type "+" Acc_Balance");
        
        // C1.Print();
        // C2.Print();
        // C3.Print();
       
    }
}