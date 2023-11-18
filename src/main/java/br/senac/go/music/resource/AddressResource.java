package br.senac.go.music.resource;

import br.senac.go.music.relationship.onetoone.Address;
import br.senac.go.music.relationship.onetoone.User;
import br.senac.go.music.service.AddressService;
import br.senac.go.music.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/address")
public class AddressResource {

    @Autowired
    private AddressService addressService;

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Address create(@Valid @RequestBody Address address){
        log.info("Acessando a camada de serviço");

        return this.addressService.create(address);
    }
}
