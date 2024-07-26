import java.util.ArrayList;
import java.util.List;


public class Personne {
	
	public String Nom;
	public String Prenom;
	public int Age;
	public List<Sport> SportsPratiques;
	
	public Personne (String nom, String prenom, int age) 
	{
		this.Nom = nom;
		this.Prenom = prenom;
		this.Age = age;
		this.SportsPratiques = new ArrayList<>();
		this.SportsPratiques.add(new Sport("Crossfit"));
		this.SportsPratiques.add(new Sport("MMA"));
		
	}
	
	   public static void main(String[] args) {
		   Personne personne = new Personne("Desruelle","Romain", 30);
		   
	        System.out.println("Hello " + personne.Prenom + " " + personne.Nom);
	        System.out.println("Tu as " + personne.Age + " ans");
	        System.out.println("Tu pratiques les sports suivants");
	        for (Sport sport : personne.SportsPratiques) {
	        	 System.out.println(sport.Nom);
	        }
	        
	    }
}
