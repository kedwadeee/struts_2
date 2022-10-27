package training.lab5.taglib;
import java.util.ArrayList;
public class TestTaglibAction {
    private ArrayList<User> users;
    private String selectedUserId;
    public String init() {
        users = new ArrayList<User>();
        User user1 = new User();
        user1.setUserId("1");
        user1.setUsername("Dev1");
        user1.setPassword("111");
        user1.setRole("Dev");
        users.add(user1);
        User user2 = new User();
        user2.setUserId("2");
        user2.setUsername("Dev2");
        user2.setPassword("222");
        user2.setRole("Dev");
        users.add(user2);
        User user3 = new User();
        user3.setUserId("3");
        user3.setUsername("SA1");
        user3.setPassword("sss");
        user3.setRole("SA");
        users.add(user3);
        return "showListPage";
    }
    public String submit() {
        System.out.println("Selected User: " + selectedUserId);
        return "showSelectedUserId";
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public String getSelectedUserId() {
        return selectedUserId;
    }

    public void setSelectedUserId(String selectedUserId) {
        this.selectedUserId = selectedUserId;
    }
}
