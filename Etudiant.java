public class Etudiant{
	 //Proprités
	 private String nomEtudiant;
	 private String prenomEtudiant;
	 //Constructeurs
	 public Etudiant(){
	 }
	 public Etudiant(String nomEtudiant, String prenomEtudiant){
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		
		 //Getters et setters
	 public String getNomEtudiant(){
		 return this.nomEtudiant;
	 }
	 public String getPrenomEtudiant(){
		 return this.prenomEtudiant;
	 }
	 
	 public void setNomEtudiant(String nomEtudiant){
		 this.nomEtudiant = nomEtudiant;
	 }
	 public void setPrenomEtudiant(String prenomEtudiant){
		 this.prenomEtudiant = prenomEtudiant;
	 }
	 //Methodes
	 public void affiche(){
		 system.out.println(this.nomEtudiant + " " + this.prenomEtudiant);
	 }
	 }
}