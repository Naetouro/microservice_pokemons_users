package com.microservice_pokemons_users.data.transfer.objects;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PokemonUserDTO {
    private int idUser;
    private int idPokemon;
}
