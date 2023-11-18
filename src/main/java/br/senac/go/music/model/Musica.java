package br.senac.go.music.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //lombok
@Entity //jpa
@Table (name = "musica") // jpa
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(
            name = "NM_MUSICA",
            length = 100,
            unique = true,
            nullable = false,
            columnDefinition = "VARCHAR(45)",
            insertable = true,
            updatable = true
            /*table = "outra_tabela"*/)
    private String nome;
}
