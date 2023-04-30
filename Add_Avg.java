class Add_Avg
{
public static void main(String argv[])
{
int a,b,add;
double avg;
	
a=Integer.parseInt(argv[0]);
b=Integer.parseInt(argv[1]);

add=a+b;
avg=add/2.0;

System.out.println("add="+add+"avg="+avg);
}
}