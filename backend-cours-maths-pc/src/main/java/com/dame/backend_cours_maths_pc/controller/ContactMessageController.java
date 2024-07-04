package com.dame.backend_cours_maths_pc.controller;

import com.dame.backend_cours_maths_pc.entity.ContactMessage;
import com.dame.backend_cours_maths_pc.service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactMessageController {

    @Autowired
    private ContactMessageService contactMessageService;

    @PostMapping
    public ContactMessage saveContactMessage(@RequestBody ContactMessage contactMessage) {
        return contactMessageService.saveContactMessage(contactMessage);
    }
}
