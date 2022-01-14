package reflection;

import accesInClass.Salle;

public class testReflection {

	public static void main(String[] args) {
		
		Salle t=new Salle();
		System.out.println(t.id+"  "+t.nom+"  ");
		t.setData();
		Salle s1=new Salle(1,"koko");
		Salle s2=new Salle(1,"koko");
		
		if(s1.equals(s2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	
	
	
	
}
