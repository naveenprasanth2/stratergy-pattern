package com.dailycodebuffer.stratergypattern.service.impl;

import com.dailycodebuffer.stratergypattern.service.Encryption;
import com.dailycodebuffer.stratergypattern.service.EncryptionType;
import org.springframework.stereotype.Service;

@Service
public class Sha256Encryption implements Encryption {
    @Override
    public void encrypt(String plainText) {
        System.out.println(plainText + " This text is encrypted using Sha256");
    }

    @Override
    public EncryptionType getEncryptionType() {
        return EncryptionType.SHA256;
    }
}
