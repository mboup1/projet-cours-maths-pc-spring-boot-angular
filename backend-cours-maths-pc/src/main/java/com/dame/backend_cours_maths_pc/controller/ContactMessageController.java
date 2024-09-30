package com.dame.backend_cours_maths_pc.controller;

import com.dame.backend_cours_maths_pc.entity.ContactMessage;
import com.dame.backend_cours_maths_pc.service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "http://35.184.173.232:4200")
//@CrossOrigin(origins = "*")
public class ContactMessageController {

    @Autowired
    private ContactMessageService contactMessageService;

    @PostMapping
    public ContactMessage saveContactMessage(@RequestBody ContactMessage contactMessage) {
        return contactMessageService.saveContactMessage(contactMessage);
    }

    @GetMapping("/{id}")
    public ContactMessage getContactMessageById(@PathVariable Long id) {
        return contactMessageService.getContactMessageById(id);
    }

    @GetMapping
    public List<ContactMessage> getAllContactMessages() {
        return contactMessageService.getAllContactMessages();
    }
}
