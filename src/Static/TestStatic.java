package Static;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etudiant e1= new Etudiant(1, "AHMED", 20);
		Etudiant e2= new Etudiant(2, "SAID", 30);
		System.out.println(e1.id+"  "+e1.name+"  "+e1.nbEtudiants);
		System.out.println(e2.id+"  "+e2.name+"  "+e2.nbEtudiants);
	}

}
