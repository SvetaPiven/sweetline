package com.sweetline.controller.rest;

import com.sweetline.model.entity.DocumentPass;
import com.sweetline.repository.DocumentPassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/documentpass")
@RequiredArgsConstructor
public class DocumentPassRestController {
    private final DocumentPassRepository documentPassRepository;

    @GetMapping()
    public ResponseEntity<List<DocumentPass>> getAllDocumentPass() {

        List<DocumentPass> documentPass = documentPassRepository.findAll();

        return new ResponseEntity<>(documentPass, HttpStatus.OK);
    }
}
