package db.service;

import db.models.User;

public interface UserService {
    void add(User user);
    User getUser(Long id);
    void removeUser(User user);
}
