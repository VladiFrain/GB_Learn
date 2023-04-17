package OOP.seminar5.view;

import OOP.seminar5.model.User;

public class UserView {
    private User currentUser;
    private boolean authorized;

    public UserView() {
        authorized = false;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    public void authorize(User user){
        this.currentUser = user;
        this.authorized = true;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void showBalance() {
        currentUser.showBalance();
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void unauthorize() {
        authorized = false;
        currentUser = null;
    }
}
