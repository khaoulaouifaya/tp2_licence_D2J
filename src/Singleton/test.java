package Singleton;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terre t1= Terre.getInstance(1000, 2000);
		Terre t2= Terre.getInstance(4000, 5000);
System.out.println(t1.distanceToSoleil);
System.out.println(t1.surface);
System.out.println(t2.distanceToSoleil);
System.out.println(t2.surface);
	}

}
