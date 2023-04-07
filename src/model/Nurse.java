package model;

public class Nurse extends User{
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
//        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
//        System.out.println("Enfremera metodoAbs");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
