        /**
         * Created by hiba on 08/08/2015.
         */
        public class Voiture {
            //commence par les attribut ou mba3d na3etlk hadja mliha ;)

            private String marque;
            private int distance;
            private float consommationParKm; //kemli apres sahla ^^
            private float quantiteEssence;
            private String type;

            //tu fais Alt + Ins (Alt + Inserer) et voilaaa tu ecris que les attributs mdrr ;) ;)

            public Voiture(String marque, String type, float consommationParKm ) {
                this.marque = marque;
                this.type= type;
                this.consommationParKm= consommationParKm;

            }

            //la méthode qui calcule la consommation de l'essence pour une distance marché
        //    public float marcher( int distanceAmarcher) {
        //
        //    }

            public String getMarque() {
                return marque;
            }

            public int getDistance() {
                return distance;
            }

            public float getQuantiteEssence() {
                return quantiteEssence;
            }

            public float getConsommationParKm() {
                return consommationParKm;
            }

            public void setMarque(String marque) {
                this.marque = marque;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getType() {
                return type;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public void setConsommationParKm(float consommationParKm) {
                this.consommationParKm = consommationParKm;
            }

            public void setQuantiteEssence(float quantiteEssence) {
                this.quantiteEssence = quantiteEssence;
            }
            //chefti ch7al sahla ki ykounou les idées bien organisées la programmation va pas prendre du temps ^^ oui c vrai en plus mazel mabdinach la progrm ne tkt pas on est f tri9 zidi STP toString ok

            @Override
            public String toString() {
                return "Voiture{" +
                        "marque='" + marque + '\'' +
                        ", distance=" + distance +
                        ", consommationParKm=" + consommationParKm +
                        ", quantiteEssence=" + quantiteEssence +
                        '}';
            }

            public void marche(int distance) {
        float quantiteCsm = distance*(consommationParKm/1000);
              quantiteEssence-=quantiteCsm;
            }
        }
