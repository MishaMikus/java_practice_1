package java_basics.hw_3;

/*
3. Create "class enum" User, create a few user roles inside, every enum must have two parameters:
	1. user name,
	2. user pass

4. Create three methods:
	1. startPrint() - should print: "Start printing user credentials" (use annotation @Deprecated with),
	2. printUserCredentials() - should print all credential of priviusly created users roles (use annotation @Test with),
	3. finishPrint() - should print: “Finish printing user credentials" (use annotation @After with)
*/

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
        return "java_basics.hw_3.UserEnum{" +
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
