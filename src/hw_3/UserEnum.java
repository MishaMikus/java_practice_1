package hw_3;

//HW_3_3
public enum UserEnum {
    ADMIN("misha", "mishaPASS"),
    USER("vasja", "qwer"),
    EDITOR("Petro", "1111");

    private String userName;
    private String pass;

    UserEnum(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
    }

    public String info() {
        return "hw_3.UserEnum{" +
                "userName='" + userName + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public static void main(String[] args) {
        for(Object enumEntry:UserEnum.class.getEnumConstants()){
            System.out.println(enumEntry);
        }
        //HW_3_4
        USER.startPrint();
        USER.printUserCredentials();
        USER.finishPrint();
    }

    //HW_3_4
    @Deprecated
    void startPrint() {
        System.out.println("Start printing user credentials");
    }

    void printUserCredentials() {
        System.out.println(info());
    }

    void finishPrint() {
        System.out.println("Finish printing user credentials");
    }
}
