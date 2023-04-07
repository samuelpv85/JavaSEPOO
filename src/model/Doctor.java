package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
//    atributos
    private String speciality;
    private ArrayList<AvailableAppintment> availableAppintments = new ArrayList<>();

//    model.Doctor(){
//        System.out.println("Construyendo el objeto contructor");
////        id++;
//    }
    public Doctor(String name, String email){
        super(name, email);
//        super(String name, String email);
//        System.out.println("Construyendo el contructor");
////        id++;
////        this.name = name;
//        this.speciality = speciality;
    }
//    Comportamiento - Metodo
//    public void showName(){ //no devuelve nada
//        System.out.println("Mi Nombre : " + name);
//    }
//    public void showId(){
//        System.out.println("ID model.Doctor " + model.Doctor.id);
//    }
    public void addAvailableAppintments(String date, String time) {
        availableAppintments.add(new Doctor.AvailableAppintment(date,time));
    }
    public ArrayList<AvailableAppintment> getAvailableAppintments(){
        return availableAppintments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpaciality: " + speciality + "\nAvailable: " + availableAppintments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("hospital metodoAbstrato");
    }

    public static class AvailableAppintment{
        private int id = 0;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        public AvailableAppintment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }
        public void setDate(Date date) {
            this.date = date;
        }
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
    }
//    public String getSpeciality() {
//        return speciality;
//    }
//    public void setSpeciality(String speciality) {
//        this.speciality = speciality;
//    }


    }
}
