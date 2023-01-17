package afpaJava_230117_bibliotheque;


public class Livre {

		private String reference, titre, editeur, genre;
		private Auteur auteur;
		private int nbExemplaires;
		
		public Livre(String reference, String titre, Auteur auteur, String editeur, int nbExemplaires, String genre) {
			this.reference = reference;
			this.titre= titre;
			this.auteur = auteur;
			this.editeur = editeur;
			this.nbExemplaires = nbExemplaires;
			this.genre = genre;
		}
		
		public String getReference() {
			return this.reference;
		}
		
		public String getTitre() {
			return this.titre;
		}
		
		public Auteur getAuteur() {
			return this.auteur;
		}
		
		public String getEditeur() {
			return this.editeur;
		}
		
		public int getNbExemplaires() {
			return this.nbExemplaires;
		}
		
		public String getGenre() {
			return this.genre;
		}
		
		public void setEditeur(String editeur) {
			this.editeur = editeur;
		}
		
		public void setNbExemplaires(int n) {
			this.nbExemplaires = n;
		}
		
		public void afficher() {
			System.out.println(
					this.getReference() + " - " +
					this.getTitre() + " - " +
					this.getAuteur().getNom() + " " +
					this.getAuteur().getPrenom() + " - " +
					this.getEditeur() + " - " +
					this.getNbExemplaires()
					);
		}
		
		public boolean egal(Livre livre) {
			if (this.getReference().equals(livre.getReference())) {
				return true;
			} else {
				return false;
			}
		}
		
		public void nouvelExemplaire() {
			this.nbExemplaires += 1;
		}
		
		public void nouvelExemplaire(int nb) {
			this.nbExemplaires += nb;
		}
		
		public void perteExemplaire() {
			if (this.nbExemplaires > 0) this.nbExemplaires += -1; 
		}
		
		public boolean present() {
			if (this.nbExemplaires > 0) {
				return true;
			} else {
				return false;
			}
		}
		
		
		
		
		
}
