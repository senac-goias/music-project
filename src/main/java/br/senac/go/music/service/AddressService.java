package br.senac.go.music.service;

import br.senac.go.music.relationship.onetoone.Address;
import br.senac.go.music.relationship.onetoone.User;
import br.senac.go.music.repository.AddressRepository;
import br.senac.go.music.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Address create(Address address){
        log.info("criando o usuário na camada de serviço.");
        return addressRepository.save(address);
    }

}
