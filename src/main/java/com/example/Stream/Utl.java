package com.example.Stream;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;

public class Utl {

    // Help encrypt the user password before save to the database
    public static String encryptPassword(String userId, String password) throws IOException {
        return DigestUtils.md5Hex(userId + DigestUtils.md5Hex(password)).toLowerCase();

    }
}
