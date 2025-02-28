public class Child extends Parent{

    private String nickname;
    private String university;

    public Child(){
        this.nickname = "Dada";
        this.university = "KKU";
    }

    public Child(String securityId , String name, String city, String nickname, String university) {
        super(securityId, name, city);
        this.nickname = nickname;
        this.university = university;
    }

    public String bark(){
        return "hong";
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getUniversity(){
        return university;
    }

    public void setUniversity(String university){
        this.nickname = university;
    }

    public void showPersonalInfo(){
        System.out.println("Print from Child >> ...");
        super.showPersonalInfo();
        System.out.println("\t Nickname: " + this.nickname);
        System.out.println("\t University: " + this.university);
    }


}
