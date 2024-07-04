package com.dame.backend_cours_maths_pc.repository;

import com.dame.backend_cours_maths_pc.entity.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
