package day03;

import java.util.ArrayList;
import java.util.List;

public class Webshop {

    List<Purchasable> purchasables = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public List<Purchasable> getPurchasables() {
        return purchasables;
    }

    public List<User> getUsers() {
        return users;
    }

    public void purchase(String userName, String purchasableName) {
        User user = getUserByName(userName);
        Purchasable purchasable = getPurchasableByName(purchasableName);
        user.purchase(purchasable.copy());
    }

    private User getUserByName(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                return user;
            }
        }
        throw new IllegalArgumentException("User not found");
    }

    private Purchasable getPurchasableByName(String purchasableName) {
        for (Purchasable purchasable : purchasables) {
            if (purchasable.getName().equals(purchasableName)) {
                return purchasable;
            }
        }
        throw new IllegalArgumentException("Purchasable not found");
    }
}
