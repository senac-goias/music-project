package br.senac.go.music.service;

import br.senac.go.music.relationship.onetoone.User;
import br.senac.go.music.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public User create(User user){
        log.info("criando o usuário na camada de serviço.");
        User usuarioGravado = userRepository.save(user);
        return usuarioGravado;
    }
}
