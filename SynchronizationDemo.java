class Odd{
    
    synchronized void printOdd(String name,int n) throws InterruptedException {
        for(int i=1;i<=n;i++){
           if(i%2!=0){
            System.out.print(name +"->"+i);
            Thread.sleep(500);
           }
        }
    }
}
class A extends Thread{
    Odd o;
    String name;
    int n;
    A(Odd o,String name,int n) {
        this.name=name;
        this.n=n;
        this.o=o;

    }
    public void run(){
        try{
            o.printOdd(name, n);

        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class B extends Thread {
    Odd o;
    String name;
    int n;
    B(Odd o,String name,int n) {
        this.name=name;
        this.n=n;
        this.o=o;
    }

public void run()
{
    try{
        o.printOdd(name, n);
    }
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }
}
        }
        public class SynchronizationDemo{
            public static void main(String[] args)
            {
                Odd o=new Odd();
                A a = new A(o,"A", 5);
                B b=new A(o, "B", 10);
                a.start();
                b.start();

            }
        }