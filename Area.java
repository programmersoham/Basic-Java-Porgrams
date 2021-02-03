class cal_area{
     void areac(double r){
        double area;
        area=3.14*r*r;
        System.out.println("area of circle is " + area);        
    }
     void areac(double l,double w){
        double area;
        area=l*w;
        System.out.println("area of rect. is " + area);        
    }
     void areac(int b,int h){
         double area;
        area=0.5*h*b;
        System.out.println("area of triangle is " + area);        
    }
    
}
public class Area{
public static void main(String args[])
    {   
        
        cal_area o1=new cal_area();
        cal_area o2=new cal_area();
        cal_area o3=new cal_area();
        o1.areac(5.5);
        o2.areac(8.6,7.7);
        o3.areac(5,3);
        

    }
}