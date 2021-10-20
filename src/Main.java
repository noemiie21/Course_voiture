public class Main {

    public static void main(String[] args) {
        Course Course = new Course();
        Course.remplirCourse();


        for (Circuit Circuit : Course.getCircuitList()) {
            Course.setGagnant(Circuit.getVoitureList().get(0).getNom());

            //System.out.println(Circuit.getNbtours());
            for (Voiture Voiture : Circuit.getVoitureList()) {

                float depart = 0;
                //System.out.println(Voiture.getNom());


                while (depart <= Circuit.getNbtours()*Circuit.getNbkm()*1000){
                    while (depart <= 100){
                        depart += (float) (Voiture.getVitesse_min()*0.003)*1000;
                        //System.out.println("La voiture a avancé de " + depart + "m");
                        Voiture.setTempscourse((float) (Voiture.getTempscourse()+0.003));
                        //System.out.println(Voiture.getNom());

                    }
                    depart += Math.random() * (Voiture.getVitesse_max()-Voiture.getVitesse_min());
                    Voiture.setTempscourse((float) (Voiture.getTempscourse()+0.003));
                    //System.out.println("La voiture a avancé de " + depart + "m en : " + Voiture.getTempscourse());

                }
                float premier = Circuit.getVoitureList().get(0).getTempscourse();
                //System.out.println(premier);

                //System.out.println(Voiture.getTempscourse());
                if (premier > Voiture.getTempscourse()) {
                    premier = Voiture.getTempscourse();
                    Course.setGagnant(Voiture.getNom());
                    //System.out.println(premier);
                }

                System.out.println("La voiture " + Voiture.getNom() + "a avancé de " + depart + "m en : " + Voiture.getTempscourse());
                //System.out.println(premier);

            }

            System.out.println("Le gagnant de la course et la " + Course.getGagnant());



        }


    }
}
