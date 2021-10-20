public class Voiture {

    private String nom;
    private float vitesse_min;
    private float vitesse_moy;
    private float vitesse_max;
    private float tempscourse ;

    public Voiture(String nom, float vitesse_min, float vitesse_moy, float vitesse_max) {
        this.nom = nom;
        this.vitesse_min = vitesse_min;
        this.vitesse_moy = vitesse_moy;
        this.vitesse_max = vitesse_max;
        tempscourse = 0 ;
    }

    public float getVitesse_min() {
        return vitesse_min;
    }

    public void setVitesse_min(float vitesse_min) {
        this.vitesse_min = vitesse_min;
    }

    public float getVitesse_moy() {
        return vitesse_moy;
    }

    public void setVitesse_moy(float vitesse_moy) {
        this.vitesse_moy = vitesse_moy;
    }

    public float getVitesse_max() {
        return vitesse_max;
    }

    public void setVitesse_max(float vitesse_max) {
        this.vitesse_max = vitesse_max;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getTempscourse() {
        return tempscourse;
    }

    public void setTempscourse(float tempscourse) {
        this.tempscourse = tempscourse;
    }

}
