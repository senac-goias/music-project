package br.senac.go.music.repository;

import br.senac.go.music.relationship.onetoone.Address;
import br.senac.go.music.relationship.onetoone.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
