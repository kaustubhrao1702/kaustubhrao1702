class A
{
int i,j;
A(int a,int b)
{
i=a;
j=b;
}
void show()
{
System.out.println("Value of i and j is "+""+i+""+j);
}
}
class B extends A
{
int k;
B(int x,int y, int z)
{
super(x,y);
k=z;
}
void show()
{
super.show();
System.out.println("Value of k is "+""+k);
}
}
class override
{
public static void main(String args[])
{
B subob = new B(90, 100, 105);
subob.show();
}
}

