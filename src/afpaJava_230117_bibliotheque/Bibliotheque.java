package afpaJava_230117_bibliotheque;

public class Bibliotheque {

	private String nom;
	private int N_LIVRES_MAX = 100, nbLivresDistincts = 0, nbLivresTotal = 0;
	private Livre[] livres = new Livre[N_LIVRES_MAX];
	
	public Bibliotheque(String nom) {
		this.nom = nom;
//		this.livres = livres;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public Livre[] getLivres() {
		return this.livres;
	}
	
	public void afficheCatalogue() {
		System.out.println(this.nom + " :");
		System.out.println("Total : " + nbLivresTotal + " livres. (" + nbLivresDistincts + " livres distincts).");
		for (Livre livre : livres) {
			if (livre != null) {
				livre.afficher();
			}
		}
	}
	
	public boolean possede(Livre livre) {
		if (nbLivresDistincts != 0) {
			for (Livre l: this.livres) {
				if (l != null) {
					if (l.getReference().equals(livre.getReference()) == true) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public void ajoutLivre(Livre livre) {
		if (nbLivresTotal >= N_LIVRES_MAX) {
			System.out.println("Nb de livres max (" + N_LIVRES_MAX + ") atteint.");
		} else {
			if (this.possede(livre) == true) {
				// livre déjà présent dans la biblio
				for (Livre l: this.livres) {
					if (l != null) {
						if (l.getReference().equals(livre.getReference()) == true) {
							l.nouvelExemplaire();
							nbLivresTotal += 1;
						}
					}
				}
			} else {
				// pas d'exemplaire présent
				this.livres[nbLivresDistincts] = livre;
				livres[nbLivresDistincts].setNbExemplaires(1);
				nbLivresDistincts += 1;
				nbLivresTotal += 1;
			}
		}
		
	}
	
	
	public String getTitre(String ref) {
		for (Livre livre: this.livres) {
			if (livre != null) {
				if (livre.getReference().equals(ref) == true) {
					return livre.getTitre();
				}
			}
		}
		return null;
	}
	
	public Auteur getAuteur(String ref) {
		for (Livre livre: this.livres) {
			if (livre != null) {
				if (livre.getReference().equals(ref) == true) {
					return livre.getAuteur();
				}
			}
		}
		return null;
	}
	
	public String getEditeur(String ref) {
		for (Livre livre: this.livres) {
			if (livre != null) {
				if (livre.getReference().equals(ref) == true) {
					return livre.getEditeur();
				}				
			}
		}
		return null;
	}
	
	public String getGenre(String ref) {
		for (Livre livre: this.livres) {
			if (livre != null) {
				if (livre.getReference().equals(ref) == true) {
					return livre.getGenre();
				}				
			}
		}
		return null;
	}
	
	public int getNbExemplaires(String ref) {
		for (Livre livre: this.livres) {
			if (livre != null) {
				if (livre.getReference().equals(ref) == true) {
					return livre.getNbExemplaires();
				}
			}
		}
		return 0;
	}
	
	public void afficheLivre(String ref) {
		for (Livre livre: this.livres) {
			if (livre != null) {
				if (livre.getReference().equals(ref) == true) {
					livre.afficher();
				}
			}
		}
	}
	
	
	
	
	
}
