public class Employe{
	 //Proprités
	 private String nom;
	 private String prenom;
	 //Constructeurs
	 public Employe(){
	 }
	 public Employe(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	 }
	 
	 public Employe(String nom){
		this.nom = nom;
	
	 }
	 
	 //Getters et setters
	 public String getNom(){
		 return this.nom;
	 }
	 public String getPrenom(){
		 return this.prenom;
	 }
	 
	 public void setNom(String nom){
		 this.nom = nom;
	 }
	 public void setPrenom(String prenom){
		 this.prenom = prenom;
	 }
	 //Methodes
	 public void affiche(){
		 system.out.println(this.nom + " " + this.prenom);
	 }
}