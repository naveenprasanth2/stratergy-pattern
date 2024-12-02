package com.dailycodebuffer.stratergypattern.service.impl;

import com.dailycodebuffer.stratergypattern.service.Encryption;
import com.dailycodebuffer.stratergypattern.service.EncryptionType;
import org.springframework.stereotype.Service;

@Service
public class MD5 implements Encryption {
    @Override
    public void encrypt(String password) {
        System.out.println("The string is encrypted using MD5");
    }

    @Override
    public EncryptionType getEncryption() {
        return EncryptionType.MD5;
    }
}
