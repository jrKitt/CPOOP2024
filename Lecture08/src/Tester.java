public class Tester extends Employee {
    public Tester(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public String work(){
        return "Tester";
    }
}
