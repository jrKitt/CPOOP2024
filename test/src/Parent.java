public class Parent {
    private String securityId;
    private String name;
    protected String city;

    public Parent() {
        this.securityId = "xxx-x";
        this.name = "xxx";
        this.city = "xx";
    }
    public Parent(String securityId , String name, String city) {
        this.securityId = securityId;
        this.name = name;
        this.city = city;
    }

    public String bark(){
        return "hong";
    }

    public void showPersonalInfo(){
        System.out.println("Print from Parent >> ...");
        System.out.println("\t SecurityId: " + this.securityId);
        System.out.println("\t Name: " + this.name);
        System.out.println("\t City: " + this.city);
    }

    public String getSecurityId() {
        return securityId;
    }
    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}