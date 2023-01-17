package afpaJava_230117_bibliotheque;


public class DemoBiblio {
	
	public static void main(String[] args) {
		
		// tests class Auteur
		Auteur a1 = new Auteur("abc", "Pierre", "Richard", "FR", 69);
		Auteur a2 = new Auteur("aze", "Michel", "Houellebecq", "FR", 50);
		Auteur a3 = new Auteur("wxc", "Aldous", "Huxley", "GB", 0 );
		Auteur a4 = new Auteur("zzz", "Robert", "Greene", "US", 64);
		Auteur a5 = new Auteur("wxc", "Ald", "Hxl", "US", 64);
		Auteur a6 = new Auteur("mcs", "Michel", "Serres", "FR", 0);

		a3.afficher();
		a3.setAge(0);
		a3.afficher();
		System.out.println(a1.egal(a2));
		System.out.println(a3.egal(a5));
		System.out.println("------------------------------");
		
		// tests class Livre
		Livre l1 = new Livre("12315", "Les lois de la nature humaine", a4, "Larousse", 4, "Dvl pers.");
		Livre l2 = new Livre("48685", "Les portes de la perception", a3, "Nathan", 2, "Essai");
		Livre l3 = new Livre("78945", "Petite Poucette", a6, "EdtFR", 7, "Essai");
		Livre l4 = new Livre("78945", "htrhtrz", a6, "htrshb", 0, "jkbhui");
		
		l1.afficher();
		l3.setEditeur("eidteurModif");
		System.out.println(l1.egal(l4));
		System.out.println(l3.egal(l4));
		System.out.println(l1.present());
		System.out.println(l4.present());
		System.out.println("------------------------------");
		
		
		// tests class Bibliotheque
		Bibliotheque b1 = new Bibliotheque("Bibliotheque Afpa n°1");
		Bibliotheque b2 = new Bibliotheque("Bibliotheque Afpa n°2");

		b1.ajoutLivre(l3);
		b1.ajoutLivre(l1);
		b1.ajoutLivre(l3);
		b1.ajoutLivre(l3);
		b1.afficheCatalogue();
		System.out.println("---");
		b1.ajoutLivre(l4);
		b1.ajoutLivre(l2);
		b1.ajoutLivre(l2);
		b1.afficheCatalogue();
		System.out.println("---");
		
		System.out.println(b1.getTitre("48685"));
		System.out.println("---");
		
		b1.afficheLivre("48685");
		System.out.println("---");
		
		
		
	}
	
	
	
	
	
// ====================================================== //
	
	
	
	
}
