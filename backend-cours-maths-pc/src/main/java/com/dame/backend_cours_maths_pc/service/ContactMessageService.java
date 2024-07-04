package com.dame.backend_cours_maths_pc.service;

import com.dame.backend_cours_maths_pc.entity.ContactMessage;
import com.dame.backend_cours_maths_pc.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {

    @Autowired
    private ContactMessageRepository contactMessageRepository;

    public ContactMessage saveContactMessage(ContactMessage contactMessage) {
        return contactMessageRepository.save(contactMessage);
    }
}
