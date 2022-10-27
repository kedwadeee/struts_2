package training.web.login;

public class LoginAction {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public String loginInit() {
        return "login_main";
    }

    public String login() {

        String action = "";

        String username = user.getUsername();
        String password = user.getPassword();

        if (username.equals("su") && password.equals("1234")) {
            action = "login_success";
        }
        else {
            action = "login_fail";
        }

        return action;
    }

}
