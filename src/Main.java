public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        //bien sur mazel makmelnch voiture
        //icic on crée une voiture (Polo)
        Voiture polo = new Voiture("wolsvagen", "la toute", 100);
        Voiture deuxCentSept = new Voiture("peugeot","HDI", 110 );

        Voiture turan = new Voiture("hhhh","HDI", 135);

        //On met 20 litre d'essance dans la Polo
        //il faut tt d' abore creer la methode pour mettre l'essence ? pour marcher ih  bah
         polo.setQuantiteEssence(20);// c la même pprksoli je fais un changement oui en plus il falais pas te7at fel constructeur tu vois skype stpp ohkk dirou nta
         deuxCentSept.setQuantiteEssence(18);
         turan.setQuantiteEssence(28);
        //elle marche 120 km
        polo.marche(120);
        deuxCentSept.marche(38);
        turan.marche(200);

        //on affiche la quantité d'essance qui reste
System.out.println("pour la polo "+ polo.getQuantiteEssence() + "  pour la 207 " + deuxCentSept.getQuantiteEssence()+ "  pour la turan "+ turan.getQuantiteEssence());
    }
}
//thank's you are welcome
