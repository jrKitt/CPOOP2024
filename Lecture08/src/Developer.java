public class Developer extends Employee {
    public Developer(int id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public String work(){
        return "Developer";
    }
}
