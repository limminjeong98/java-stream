package chapter10.service;

import chapter10.model.User;

public class MakeMoreFriendsEmailProvider implements EmailProvider {
    @Override
    public String getEmail(User user) {
        return "'Make More Friend's email for " + user.getName();
    }
}
