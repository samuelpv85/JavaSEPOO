import model.*;

import javax.jws.soap.SOAPBinding;
import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
//    instanciar la clase model.Doctor;
//        model.Doctor myDoctor = new model.Doctor();
//        myDoctor.name = "Samuel";
//        myDoctor.showName();
//        myDoctor.showId();
//        System.out.println("");
//        model.Doctor myDoctor2 = new model.Doctor();0
//        myDoctor2.name = "Patiño";
//        myDoctor2.showName();
//        myDoctor2.showId();
//        UIMenu.showMenu();
//        showMenu();
//        showPatientMenu();
//        Doctor myDoctor = new Doctor("Juan", "juan@gmail.com");
//        myDoctor.addAvailableAppintments(new Date(), "08 AM");
//        myDoctor.addAvailableAppintments(new Date(), "10 AM");
//        myDoctor.addAvailableAppintments(new Date(), "12 AM");
//        for (Doctor.AvailableAppintment aA : myDoctor.getAvailableAppintments()){
//            System.out.println(aA.getId() + "-" + aA.getDate() + " " + aA.getTime());
//        }
//        System.out.println(myDoctor.name);
//        System.out.println(myDoctor.speciality);
//        System.out.println(myDoctor.id);

//        Patient patient = new Patient("Samuel", "samuel@gmail.com");
////        System.out.println(patient.name);
////        System.out.println(patient.email);
//        patient.setPhoneNumber("12564626");
//        System.out.println("tlfon: " + patient.getPhoneNumber());
//        System.out.println(" ");
//        System.out.println(patient);
////        System.out.println(myDoctor);
//        System.out.println(" ");
//        System.out.println("clase-Metodos Abstratos");
//        User user = new Doctor("Samuel", "Pediatra");
//        user.showDataUser();
//        User user2 = new Nurse("maria", "Penfermera");
//        user2.showDataUser();
//        User user3 = new Patient("Samuel", "Psciente");
//        user3.showDataUser();
//        System.out.println(" ");
//        User u1 = new User("sa", "sa@sa.com") {
//            @Override
//            public void showDataUser() {
//                System.out.println("Uso de clase Anonima");
//            }
//        };
//        u1.showDataUser();
//
//        ISchedulable ISchedulable = new ISchedulable() {
//            @Override
//            public void schedule(Date date, String time) {
//                System.out.println("Tambien se puede instanciar metodos de interfaces de forma anonima");
//            }
//        };
////        ISchedulable.schedule();
        showMenu();

    }
}