package br.senac.go.music.relationship.onetoone;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @NotBlank
    @NotNull
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @NotBlank
    @NotNull
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;

    //@OneToOne(cascade = CascadeType.ALL)
    //A diretiva joincolumn está relacionada ao vínculo dos registros (ids) via banco de dados
    //@JoinColumn(name = "address_id", referencedColumnName = "id")

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;
}
