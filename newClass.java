class student
    {
         String name;
         String division;
         
        double weight;
        student(String m,String cl,double w)
        {
            name=m;
            division=cl;
            
            weight=w;

        }
        void display()
        {
            System.out.println("name is " + Name+" division is "+division +  " weight is "+ weight);

        }


    }
public class newClass{
    public static void main(String args[]) 
    {
       student c1=new student("Jake", "CS2", 50);
       student c2=new student("Linus", "CS1",60);
    //    c1.SetValue();
    //    c2.SetValue();
       c1.display();
       c2.display();
        

        
    }
    
}

