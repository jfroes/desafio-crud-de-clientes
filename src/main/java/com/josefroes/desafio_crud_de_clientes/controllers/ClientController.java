package com.josefroes.desafio_crud_de_clientes.controllers;

import com.josefroes.desafio_crud_de_clientes.dto.ClientDTO;
import com.josefroes.desafio_crud_de_clientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
        ClientDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<ClientDTO>> findAll(@PageableDefault(size = 10) Pageable pageable){
        Page<ClientDTO> dto = service.findAll(pageable);
        return  ResponseEntity.ok(dto);
    }

    //TODO: Update by id
    //TODO: Delete by id
}
