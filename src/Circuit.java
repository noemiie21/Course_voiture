import java.util.ArrayList;

public class Circuit {

    private String nomcircuit;
    private int nbtours;
    private int nbkm;
    private ArrayList<Voiture> VoituresList;

    public Circuit(String nomcircuit, int nbtours, int nbkm, ArrayList<Voiture> VoituresList) {
        this.nomcircuit = nomcircuit;
        this.nbtours = nbtours;
        this.nbkm = nbkm;
        this.VoituresList = VoituresList;
    }

    public String getNomcircuit() {
        return nomcircuit;
    }

    public void setNomcircuit(String nomcircuit) {
        this.nomcircuit = nomcircuit;
    }

    public int getNbtours() {
        return nbtours;
    }

    public void setNbtours(int nbtours) {
        this.nbtours = nbtours;
    }

    public int getNbkm() {
        return nbkm;
    }

    public void setNbkm(int nbkm) {
        this.nbkm = nbkm;
    }

    public ArrayList<Voiture> getVoitureList() {
        return VoituresList;
    }


    public void setReponsesList(ArrayList<Voiture> voituresList) {
        this.VoituresList = VoituresList;
    }

    public void first_voiture(){
        getVoitureList().get(1);
    }


}
