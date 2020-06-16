package com.microservice_pokemons_users.data.objects;

import javax.persistence.*;

@Entity
@Table(name = "pokemons_users", schema = "", catalog = "")
@IdClass(PokemonUserDOPK.class)
public class PokemonUserDO {
    private Integer idPokemon;
    private Integer idUser;

    @Id
    @Column(name = "id_pokemon", nullable = false)
    public Integer getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(Integer idpok) {
        this.idPokemon = idpok;
    }

    @Id
    @Column(name = "id_user", nullable = false)
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}
