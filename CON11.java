class Employee
{
private String name;
private int rn;
public Employee()
{
name="raju";
rn=03;
}
public void print()
{
System.out.print("\n name="+name+" rn="+rn);
}
}
class CON11
{
public static void main(String[] args)
{
Employee emp1=new Employee();
Employee emp2=new Employee();
emp1.print();
emp2.print();
}
}