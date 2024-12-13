package dao.custom.impl;

import dao.custom.UserDao;
import entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public User get(String s) {
        return null;
    }

    @Override
    public List<User> getAll(User user) {
        return null;
    }
}
