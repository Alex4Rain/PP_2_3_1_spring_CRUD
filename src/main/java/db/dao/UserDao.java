package db.dao;

import db.models.User;

public interface UserDao {
    void add(User user);
    User getUser(Long id);
    void removeUser(User user);
}
