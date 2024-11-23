package com.dailycodebuffer.stratergypattern.controller;

import com.dailycodebuffer.stratergypattern.service.EncryptionFactory;
import com.dailycodebuffer.stratergypattern.service.EncryptionType;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@AllArgsConstructor
@RestController
public class EncryptionController {
    private EncryptionFactory encryptionFactory;

    @PostMapping("/encrypt")
    public ResponseEntity<Void> encrypt(@RequestHeader("type") EncryptionType encryption, @RequestBody Map<String, String> requestBody){
        String value = requestBody.get("value"); // Extract the required attribute
        encryptionFactory.getEncryption(encryption).encrypt(value);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
