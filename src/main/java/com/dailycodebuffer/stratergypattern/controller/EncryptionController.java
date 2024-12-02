package com.dailycodebuffer.stratergypattern.controller;


import com.dailycodebuffer.stratergypattern.service.EncryptionType;
import com.dailycodebuffer.stratergypattern.service.impl.EncryptionFactory;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/encrypt")
public class EncryptionController {
    private EncryptionFactory encryptionFactory;

    @PostMapping("/message")
    public ResponseEntity<Void> encryptMessage(@RequestHeader("type")EncryptionType encryptionType, @RequestBody String message){
        encryptionFactory.getEncryption(encryptionType).encrypt(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
