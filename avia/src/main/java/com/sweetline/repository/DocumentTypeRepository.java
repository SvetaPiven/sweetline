package com.sweetline.repository;

import com.sweetline.model.entity.DocumentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentTypeRepository extends JpaRepository<DocumentType, Integer> {
}