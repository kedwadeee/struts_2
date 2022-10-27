package training.lab7.token;

public class TestTokenAction {
    public String init() {
        return "afterInit";
    }
    public String submit() {
        System.out.println("Action Submitted");
        return "afterSubmit";
    }

}
