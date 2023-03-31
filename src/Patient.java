public class Patient {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;
//    Patient(){
//        System.out.println("Construyendo el objeto contructor");
////        id++;
//    }
    Patient(String name, String email){
        System.out.println("Construyendo el objeto contructor");
        this.name = name;
        this.email = email;
        this.weight = 82.5;
        System.out.println(weight + "KG");
    }

    public void showName() {
        System.out.println("Nombr del pasiente " + name);
    }
    public void showEmail() {
        System.out.println("Nombr del pasiente " + email);
    }


}
