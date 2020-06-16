package com.microservice_pokemons_users.data.objects;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PokemonUserDOPK implements Serializable {
    private Integer idpok;
    private Integer idUser;

    @Column(name = "id_pokemon", nullable = false)
    @Id
    public Integer getIdPokemon() {
        return idpok;
    }

    public void setIdPokemon(Integer idpok) {
        this.idpok = idpok;
    }

    @Column(name = "id_user", nullable = false)
    @Id
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}
