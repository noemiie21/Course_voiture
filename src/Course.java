import java.util.ArrayList;

public class Course {
    private ArrayList<Circuit> CircuitList;
    private String gagnant;

    public Course() {
        CircuitList = new ArrayList<>();
        gagnant = "";
    }

    public void remplirCourse(){

        ArrayList Voitures = new ArrayList<Voiture>();
        Voitures.add(new Voiture("Voiture 1 ",20, 80, 100));
        Voitures.add(new Voiture("Voiture 2 ",10, 20, 40));
        Voitures.add(new Voiture("Voiture 3 ", 60, 100, 450));

        Circuit Circuit = new Circuit("Circuit1 ", 3, 40, Voitures);
        CircuitList.add(Circuit);

    }

    public ArrayList<Circuit> getCircuitList() {
        return CircuitList;
    }

    public void setCircuitList(ArrayList<Circuit> circuitList) {
        CircuitList = circuitList;
    }

    public String getGagnant() {
        return gagnant;
    }

    public void setGagnant(String gagnant) {
        this.gagnant = gagnant;
    }
}


