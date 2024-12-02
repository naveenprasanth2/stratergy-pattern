package com.dailycodebuffer.stratergypattern.service.impl;

import com.dailycodebuffer.stratergypattern.service.Encryption;
import com.dailycodebuffer.stratergypattern.service.EncryptionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class EncryptionFactory {
    Map<EncryptionType, Encryption> encryptionMap;

    @Autowired
    public EncryptionFactory(Set<Encryption> encryptionSet) {
        encryptionMap = new HashMap<>();
        setEncryption(encryptionSet);
    }


    private void setEncryption(Set<Encryption> encryptionSet) {
        encryptionSet.forEach(x -> encryptionMap.put(x.getEncryption(), x));
    }

    public Encryption getEncryption(EncryptionType encryptionType){
        return encryptionMap.get(encryptionType);
    }
}
