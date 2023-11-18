package br.senac.go.music.relationship.onetoone;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    //A diretiva joincolumn está relacionada ao vínculo dos registros (ids) via banco de dados
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
}
