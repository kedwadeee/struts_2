package training.lab6.scope;
import training.lab5.taglib.User;

import java.util.ArrayList;

public class TestScopeAction {
    private ArrayList<User> users;
    // Use this method to Start Scope
    public String start() throws Exception {
        return "redirectToInit";
    }
    public String init() {
        users = new ArrayList<User>();
        User user1 = new User();
        user1.setUserId("1");
        user1.setUsername("Dev1");
        user1.setPassword("bbb");
        user1.setRole("Dev");
        users.add(user1);
        User user2 = new User();
        user2.setUserId("2");
        user2.setUsername("Dev2");
        user2.setPassword("sss");
        user2.setRole("Dev");
        users.add(user2);
        User user3 = new User();
        user3.setUserId("3");
        user3.setUsername("SA1");
        user3.setPassword("nnn");
        user3.setRole("SA");
        users.add(user3);
        return "afterInit";
    }
    public String submit() {
        return "afterSubmit";
    }

    public String end() {
        return "afterEnd";
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
