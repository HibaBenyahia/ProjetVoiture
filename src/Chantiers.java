import java.util.ArrayList;

/**
 * Created by hiba on 12/08/2015.
 */
public class Chantiers {

    private ArrayList<Camion> cammions = new ArrayList<Camion>();
    private ArrayList<Voiture> voitures= new ArrayList<Voiture>();
    private int numChantier ;

    //constructeur et getters et setters ?? maderthomch dirihom men fadhlek ^^
    //tres bien merci, si tu peux ajouter un constructeur vide et un attribut : numéro chantier stp ^^
    //don't forget private !
    //tres bien, hakda une classe paerfaite, yaatik essaha ^^
    //haya ndourou lhadja wahhdokhra
    //ok doka upload to git hub nkhalik diriha wahdek ? nhar li nefehmek wech habit t9oul rani ndirha wahdi t'

    //ok maalihch, upload l github ya3ni tal3i le projet ta3ek fel les serveur ta3 github
    //tal3ou bla mantala3hom*
    //diri click droit fel le projet




    public Chantiers(ArrayList<Camion> cammions, ArrayList<Voiture> voitures, int numChantier) {
        this.cammions = cammions;
        this.voitures = voitures;
        this.numChantier= numChantier;
    }

    public ArrayList<Camion> getCammions() {
        return cammions;
    }

    public void setCammions(ArrayList<Camion> cammions) {
        this.cammions = cammions;
    }

    public ArrayList<Voiture> getVoitures() {
        return voitures;
    }

    public void setVoitures(ArrayList<Voiture> voitures) {
        this.voitures = voitures;
    }

    //get set num stp ^^ dirhom nta ok

    public int getNumChantier() {
        return numChantier;
    }

    public void setNumChantier(int numChantier) {
        this.numChantier = numChantier;
    }
}
