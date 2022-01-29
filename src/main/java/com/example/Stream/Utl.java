package com.example.Stream;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;

public class Utl {

    // Encrypt entries save in the DB
    public static String encryptPassword(String userId, String password) throws IOException {
        return DigestUtils.md5Hex(userId + DigestUtils.md5Hex(password)).toLowerCase();
    }
}
