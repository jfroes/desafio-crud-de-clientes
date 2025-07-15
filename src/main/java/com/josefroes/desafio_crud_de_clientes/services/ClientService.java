package com.josefroes.desafio_crud_de_clientes.services;

import com.josefroes.desafio_crud_de_clientes.dto.ClientDTO;
import com.josefroes.desafio_crud_de_clientes.entities.Client;
import com.josefroes.desafio_crud_de_clientes.repositories.ClientRepository;
import com.josefroes.desafio_crud_de_clientes.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;


    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado."));
        return new  ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client>  clients = repository.findAll(pageable);
        return clients.map(client -> new  ClientDTO(client));
    }

    @Transactional
    public ClientDTO insert(ClientDTO dto){
        Client client = new Client();

        copyDtoToEntity(client, dto);

        client = repository.save(client);

        return new ClientDTO(client);
    }

    @Transactional
    public ClientDTO update(Long id, ClientDTO dto){
        Client entity = repository.getReferenceById(id);

        copyDtoToEntity(entity, dto);
        entity = repository.save(entity);

        return new ClientDTO(entity);
    }

    @Transactional
    public void delete(Long id){
        repository.deleteById(id);
    }

    private void copyDtoToEntity(Client entity, ClientDTO dto){
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }
}
