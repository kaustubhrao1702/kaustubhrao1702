abstract class Areadim
{
double dim1, dim2;
Areadim(double a, double b)
{
dim1=a;
dim2=b;
}
abstract double Area();
}
class Rectangle extends Areadim
{
Rectangle(double a, double b)
{
super(a,b);
}
double Area()
{
double c;
c = dim1*dim2;
return c;
}
}
class Triangle extends Areadim
{
Triangle(double a, double b)
{
super(a,b);
}
double Area()
{
double t;
t = 0.5*dim1*dim2;
return t;
}
}
class Area
{
public static void main(String args[])
{
Rectangle r1 = new Rectangle(10,20);
System.out.println("The area is: "+r1.Area());
Triangle t1 = new Triangle(10,20);
System.out.println("The area is: "+t1.Area());
}
}
