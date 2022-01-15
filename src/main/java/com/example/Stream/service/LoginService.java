package com.example.Stream.service;

import com.example.Stream.Utl;
import com.example.Stream.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public String verifyLogin(String userId, String password) throws IOException {
        password = Utl.encryptPassword(userId, password);
        return loginDao.verifyLogin(userId, password);
    }
}
