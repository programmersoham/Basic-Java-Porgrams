class areac
{
    double x_pos, y_pos, length, area;
    
    areac(double l)
    {
        x_pos = 0;
        y_pos = 0;
        length = l;
    }

    areac(double x, double y, double l)
    {
        x_pos = x;
        y_pos = y;
        length = l;

    }

    void calculateArea()
    {
        area = length*length;
    }

    void display()
    {
        System.out.println("Origin of the Cube is: " + x_pos + "," + y_pos);
        System.out.println("length of the Cube is: " + length);
        System.out.println(" Surface Area of the Cube is: " + area);
    }
}



public class Cube 
{
    public static void main(String args[])
    {
        areac c1 = new areac(2.4);
        areac c2 = new areac(2.3,1.1,7);

        c1.calculateArea();
        c1.display();
        c2.calculateArea();
        c2.display();

    }
}