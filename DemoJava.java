class Car
    {
         String Model;
         String color;
         int capacity;
        double weight;
        Car(String m,String cl,int c,double w)
        {
            Model=m;
            color=cl;
            capacity=c;
            weight=w;

        }
        void display()
        {
            System.out.println("model is " + Model+" color is "+color+" capacity is "+ capacity + " weight is "+ weight);

        }


    }
public class DemoJava {
    public static void main(String args[]) 
    {
       Car c1=new Car("Audi", "red", 5, 200);
       Car c2=new Car("i20", "black", 4, 150);
    //    c1.SetValue();
    //    c2.SetValue();
       c1.display();
       c2.display();
        

        
    }
    
}

