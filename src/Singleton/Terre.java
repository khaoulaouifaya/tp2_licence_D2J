package Singleton;

public class Terre {
	 double distanceToSoleil; 
	 double surface;
	private static Terre t;
	private Terre(double distanceToSoleil,double surface) {
		this.distanceToSoleil=distanceToSoleil;
		this.surface=surface;
	}
	
	public static Terre getInstance(double distanceToSoleil,double surface) {
		if(t==null) {
			synchronized (Terre.class) {
				if (t==null) {
					return t = new Terre(distanceToSoleil, surface);
				}
			}
			
		}
		return t;
	}

}
