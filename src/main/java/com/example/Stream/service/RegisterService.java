package com.example.Stream.service;

import com.example.Stream.Utl;
import com.example.Stream.dao.RegisterDao;
import com.example.Stream.entity.db.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class RegisterService {

    @Autowired
    private RegisterDao registerDao;

    public boolean register(User user) throws IOException {
        user.setPassword(Utl.encryptPassword(user.getUserId(), user.getPassword()));
        return registerDao.register(user);
    }
}
