package com.dailycodebuffer.stratergypattern.service.impl;

import com.dailycodebuffer.stratergypattern.service.Encryption;
import com.dailycodebuffer.stratergypattern.service.EncryptionType;
import org.springframework.stereotype.Service;

@Service
public class Md5Encryption implements Encryption {
    @Override
    public void encrypt(String plainText) {
        System.out.println(plainText + " This text is encrypted using MD5");
    }

    @Override
    public EncryptionType getEncryptionType() {
        return EncryptionType.MD5;
    }
}
