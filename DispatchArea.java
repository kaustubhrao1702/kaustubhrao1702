class Area1{
int a,b;
Area1(int x, int y)
{
a=x;
b=y;
}
double Area()
{
System.out.println("Area is not defined");
return 0;
}
}
class Rectangle extends Area1
{
Rectangle(int x, int y)
{
super(x,y);
}
double Area()
{
double c1;
c1=a*b;
return c1;
}
}
class Triangle extends Area1
{
Triangle(int x, int y)
{
super(x,y);
}
double Area()
{
double t1;
t1=0.5*a*b;
return t1;
}
}
class DispatchArea{
public static void main(String args[])
{
Area1 a1=new Area1(0,0);
Rectangle r1=new 
Rectangle(15,30);
Triangle t=new
Triangle(20,30);
Area1 r;
r=a1;
System.out.println("Area of Area1 "+""+r.Area());
r=r1;
System.out.println("Area of rectangle "+""+r.Area());
r=t;
System.out.println("Area of triangle "+""+r.Area());
}
}
