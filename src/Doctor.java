public class Doctor {
//    atributos
    static  int id = 0;
    String name;
    String email;

    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto contructor");
//        id++;
    }
    Doctor(String name, String speciality){
        System.out.println("Construyendo el contructor");
        id++;
        this.name = name;
        this.speciality = speciality;
    }
//    Comportamiento - Metodo
    public void showName(){ //no devuelve nada
        System.out.println("Mi Nombre : " + name);
    }
    public void showId(){
        System.out.println("ID Doctor " + Doctor.id);
    }

}
