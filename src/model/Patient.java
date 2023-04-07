package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();
//    model.Patient(){
//        System.out.println("Construyendo el objeto contructor");
////        id++;
//    }
    public Patient(String name, String email){
        super(name, email);
//        System.out.println("Construyendo el metodo contructor");
//        this.name = name;
//        this.email = email;
    }

    public String getBirthday () {
        return birthday;
    }

    public void setBirthday (String birthday){
        this.birthday = birthday;
    }

    public String getWeight () {
        return this.weight + " KG.";
    }

    public void setWeight (double weight){
        this.weight = weight;
    }

    public String getHeight () {
        return height + " Mts.";
    }

    public void setHeight ( double height){
        this.height = height;
    }

    public String getBlood () {
        return blood;
    }

    public void setBlood (String blood){
        this.blood = blood;
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCumple: " + birthday + "\nWeight" + getWeight() +
                "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Pasiente- Sobre escribiendo el metodo showDataUser de la clase padre");
    }
}