package com.njucm.itf.server;

import com.njucm.itf.dao.User;
import com.njucm.itf.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service
public class UserService {
    @Autowired
    private UserRepository UR;

    public Iterable<User> getAllUsers() {
        return UR.findAll();
    }

    public List<User> findByNameAndPassword(String Name, String PassWord) {
        return UR.findByNameAndPassword(Name,PassWord);
    }

    public List<User> findByName(String Name) {
        return UR.findByName(Name);
    }

    public boolean add(String name, String password) {
        User user = new User();
        user.setName(name);
        user.setPassWord(password);
        UR.save(user);
        return true;
    }
}
