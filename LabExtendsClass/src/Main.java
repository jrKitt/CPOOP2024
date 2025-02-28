public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("P001", "Phatsaporn", "Chaiyaphoom");
        Child child = new Child("C001", "Kittichai", "Udonthani", "Honda",  "KKU");

//        parent.showPersonalInfo();
        child.bark();
    }

}