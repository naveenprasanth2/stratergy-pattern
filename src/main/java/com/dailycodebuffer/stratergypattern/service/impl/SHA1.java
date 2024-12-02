package com.dailycodebuffer.stratergypattern.service.impl;

import com.dailycodebuffer.stratergypattern.service.Encryption;
import com.dailycodebuffer.stratergypattern.service.EncryptionType;
import org.springframework.stereotype.Service;

@Service
public class SHA1 implements Encryption {
    @Override
    public void encrypt(String password) {
        System.out.println("This string is encrypted using sha1");
    }

    @Override
    public EncryptionType getEncryption() {
        return EncryptionType.SHA1;
    }
}
