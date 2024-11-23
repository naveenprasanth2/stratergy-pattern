package com.dailycodebuffer.stratergypattern.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Set;

@Service
public class EncryptionFactory {

    HashMap<EncryptionType, Encryption> encryptionMap;

    @Autowired
    public EncryptionFactory(Set<Encryption> encryption) {
        setEncryptionMap(encryption);
    }

    private void setEncryptionMap(Set<Encryption> encryption) {
        encryptionMap = new HashMap<>();
        encryption.forEach(encryptionType -> encryptionMap.put(encryptionType.getEncryptionType(), encryptionType));
    }

    public Encryption getEncryption(EncryptionType encryptionType) {
        return encryptionMap.get(encryptionType);
    }
}
