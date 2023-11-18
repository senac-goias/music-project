package br.senac.go.music.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //lombok
@Entity //jpa
@Table (name = "musica") // jpa
//@IdClass(MusicaId.class)
public class Musica {

  /*  @Id
    private int duracaoSegundos;
    @Id
    private String nome;
    */
  @EmbeddedId
  private MusicaId id;
}
