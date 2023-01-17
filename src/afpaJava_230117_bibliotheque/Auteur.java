package afpaJava_230117_bibliotheque;

public class Auteur {

	private String reference, nom, prenom, nationalite;
	int age;
	
	public Auteur(String reference, String nom, String prenom, String nationalite, int age) {
		this.reference = reference;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.age = age;
		}
	
	public String getReference() {
		return this.reference;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getNationalite() {
		return this.nationalite;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void afficher() {
		System.out.println(
				this.getReference() + ' ' +
				this.getNom() + ' ' +
				this.getPrenom() + ' ' +
				this.getNationalite() + ' ' +
				this.getAge()
				);
	}
	
	public boolean egal(Auteur auteur) {
		if (this.getReference().equals(auteur.getReference())) {
			return true;
		} else {
			return false;
		}
	}

	
	
}
