package srs;

public class Main {
    public static void main(String[] args) {
        String[] userEmail = {"testEmail@gmail.com:100", "user@yahoo.com:1",
                "second-user@gmail.com:20", "alice@mail.us:0"};
        String first = "testEmail@gmail.com:100";
        String second = "alice@mail.us:0_+";

        UserService user = new UserService();
        System.out.println(user.getUserScore(userEmail, first));
        System.out.println(user.getUserScore(userEmail, second));
    }
}
