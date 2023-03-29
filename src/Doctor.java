public class Doctor {
//    atributos
    static  int id = 0;
    String name;
    String Speciality;

    Doctor(){
        System.out.println("Construyendo el contructor");
        id++;
    }
//    Comportamiento - Metodo
    public void showName(){ //no devuelve nada
        System.out.println("Mi Nombre : " + name);
    }
    public void showId(){
        System.out.println("ID Doctor " + Doctor.id);
    }

}
