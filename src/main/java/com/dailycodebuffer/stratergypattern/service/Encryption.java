package com.dailycodebuffer.stratergypattern.service;

public interface Encryption {
    void encrypt(String password);
    EncryptionType getEncryption();
}
