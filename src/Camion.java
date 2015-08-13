/** dok nchof ^^
 * Created by hiba on 11/08/2015.
 */
public class Camion extends Voiture {
    private float quantiteEssenceConsommeCamion;
    private float distanceCamion;
    private float poidsCamion;
    private float facteurDistance = 0;
    private int unite =0;

    public Camion(String marque, String type, float consommationParKm) {
        super(marque, type, consommationParKm);
    }


    public float getQuantiteEssenceConsommeCamion() {
        return quantiteEssenceConsommeCamion;
    }

    public void setQuantiteEssenceConsommeCamion(float quantiteEssenceConsommeCamion) {
        this.quantiteEssenceConsommeCamion = quantiteEssenceConsommeCamion;
    }

    public float getDistanceCamion() {
        return distanceCamion;
    }

    public void setDistanceCamion(float distanceCamion) {
        this.distanceCamion = distanceCamion;
    }

    public float getPoidsCamion() {
        return poidsCamion;
    }

    public void setPoidsCamion(float poidsCamion) {
        this.poidsCamion = poidsCamion;
    }

    public float getFacteur() {
        return facteurDistance;
    }

    public void setFacteur(float facteur) {
        this.facteurDistance = facteur;
    }

    public int getUnite() {
        return unite;
    }

    public void setUnite(int unite) {
        this.unite = unite;
    }
int i =0;
    public float getQantiteEssenceCamion() {// 1 T = 1000kg

        if (distanceCamion > 100) {
            facteurDistance = distanceCamion / 100;
                unite= (int) poidsCamion / 1000;//appel moi stpp ok

                return quantiteEssenceConsommeCamion = (float) (unite * 0.5)*facteurDistance + quantiteEssenceConsommeCamion;

            } else return quantiteEssenceConsommeCamion;


    }

    @Override
    public void marche(int distance) {

        float quantiteCsm = distance*(/1000);
        quantiteEssence-=quantiteCsm;
    }
}