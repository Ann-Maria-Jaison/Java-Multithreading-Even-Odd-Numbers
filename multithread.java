class Even extends Thread{
    public void run(){
        int i;
        	System.out.println("even numbers:");
        for(i=0;i<=50;i++){
            System.out.println(i*2);
        }
    }
}
class Odd extends Thread{
    public void run(){
        int i;
        	System.out.println("odd numbers:");
        for(i=0;i<50;i++){
           int j=i*2;
            System.out.println(j+1);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	Even e=new Even();
	Thread t1=new Thread(e);
		t1.start();
	Odd o=new Odd();
	Thread t2=new Thread(o);
	t2.start();
	}
}