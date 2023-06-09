import java.util;
public class MultipleCatchDemo{
public static void main(String[] args)
{
int a=0; b=0; c=0;
Scanner s=new Scanner(System.in);
try{
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=a/b;
}
catch(ArithmeticExpression aae) {
System.out.print("the denominator should not be zero");
System.out.print("ENter a new value for b:");
c=a/b;
}
System.out.print(c);
}