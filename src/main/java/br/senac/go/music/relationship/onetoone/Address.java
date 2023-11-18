package br.senac.go.music.relationship.onetoone;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "ID")
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "STREET")
    private String street;

    //@OneToOne(mappedBy = "address")
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
