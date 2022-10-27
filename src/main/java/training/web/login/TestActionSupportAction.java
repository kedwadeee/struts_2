package training.web.login;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class TestActionSupportAction extends ActionSupport{
    private static final long serialVersionUID = 1L;
    private String friendName;
    private String message;

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String execute() throws Exception {
        friendName = getText("user.username");
        message = "Hello " + friendName + " From Action Support";
        return Action.SUCCESS;
    }



}
