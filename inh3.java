class Student
{
private String name;
private int rn;
public void setStudent(String name,int rn)
{
this.name=name;
this.rn=rn;
}
public void printStudent()
{
System.out.print("\n name="+name+" rn="+rn);
}
}
class Marks extends Student
{
protected int sub1,sub2;
public void setMarks(int sub1,int sub2)
{
this.sub1=sub1;
this.sub2=sub2;
}
public void printMarks()
{
System.out.print("\n sub1="+sub1+" sub2="+sub2);
}
}
class Feez extends Marks
{
private String feeztype;
private int amount;
public void setFeez(String feeztype,int amount)
{
this.feeztype=feeztype;
this.amount=amount;
}
public void printFeez()
{
System.out.print("\n feeztype="+feeztype+" amount="+amount);
}
}
class Result extends Feez
{
private int tot;
private double avg;
public void calculate()
{
tot=sub1+sub2;
avg=tot/2.0;
}
public void printResult()
{
System.out.print("\n total="+tot+" avg="+avg);
}
}

class Inh3
{
public static void main(String argv[])
{
Result ob=new Result();
ob.setStudent("jona",03);
ob.setMarks(79,88);
ob.setFeez("convernot",88890);
ob.printStudent();
ob.printMarks();
ob.calculate();
ob.printFeez();
ob.printResult();

}
}
