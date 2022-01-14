package accesInClass;

public class Salle {
	
	 public int id;
	 public String nom;
	 public  Salle() {
		
	}
	 
	 public  Salle(String noS) {
			this.nom=noS;
	}

	 public Salle(int idm,String nomS) {
		 this.id=idm;
		 this.nom=nomS;
	 }


	 public void setData() {
		 System.out.println("show or get data froSalle ");
	 }
	 
	 public static void main(String[] args) {
		Salle s=new Salle();
		Salle s1=new Salle("salle info");
		Salle s2=new Salle(2,"salle math");
		if(s1.equals(s2)) {
		System.out.println(s1.nom+" "+s2.id+" "+s2.nom);}
	}
	 
	

}
