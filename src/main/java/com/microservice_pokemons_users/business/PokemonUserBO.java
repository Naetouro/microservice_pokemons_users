package com.microservice_pokemons_users.business;

import com.microservice_pokemons_users.data.objects.PokemonUserDO;
import com.microservice_pokemons_users.data.transfer.objects.PokemonUserDTO;
import com.microservice_pokemons_users.repositories.PokemonUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonUserBO {

    @Autowired
    private PokemonUserRepository repo;

    public List<PokemonUserDTO> findByUserId(final int id) {
        final List<PokemonUserDO> pokemonUserDOS = repo.findByIdUser(id);
        final List<PokemonUserDTO> pokemonUserDTOS = new ArrayList<>();

        for (PokemonUserDO pokemonUserDO : pokemonUserDOS) {
            final PokemonUserDTO pokemonUserDTO = new PokemonUserDTO();
            pokemonUserDTO.setIdPokemon(pokemonUserDO.getIdPokemon());
            pokemonUserDTO.setIdUser(pokemonUserDO.getIdUser());
            pokemonUserDTOS.add(pokemonUserDTO);
        }

        return pokemonUserDTOS;
    }

    public boolean existsByIdPokemonAndIdUser(final int idPokemon, final int idUser){
        return repo.existsByIdPokemonAndIdUser(idPokemon, idUser);
    }

    public void save(final PokemonUserDTO pokemonUserDTO){
        final PokemonUserDO pokemonUserDO = new PokemonUserDO();
        pokemonUserDO.setIdPokemon(pokemonUserDTO.getIdPokemon());
        pokemonUserDO.setIdUser(pokemonUserDTO.getIdUser());
        repo.save(pokemonUserDO);
    }

    public void delete(final PokemonUserDTO pokemonUserDTO){
        final PokemonUserDO pokemonUserDO = new PokemonUserDO();
        pokemonUserDO.setIdPokemon(pokemonUserDTO.getIdPokemon());
        pokemonUserDO.setIdUser(pokemonUserDTO.getIdUser());
        repo.delete(pokemonUserDO);
    }
}

