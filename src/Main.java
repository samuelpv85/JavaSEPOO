import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
//    instanciar la clase Doctor;
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Samuel";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println("");
//        Doctor myDoctor2 = new Doctor();
//        myDoctor2.name = "Patiño";
//        myDoctor2.showName();
//        myDoctor2.showId();
//        UIMenu.showMenu();
        showMenu();
        showPatientMenu();
    }
}