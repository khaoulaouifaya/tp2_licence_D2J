package accesInClass;

public class Main extends Salle{

	public static void main(String[] args) {
	
		salleCours sc=new salleCours(1,67, "Gestion");
		System.out.print(sc.id+"  "+sc.nom+" "+sc.nbrPlace);

	}

}
