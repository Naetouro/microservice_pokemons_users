package com.microservice_pokemons_users.repositories;

import com.microservice_pokemons_users.data.objects.PokemonUserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonUserRepository extends JpaRepository<PokemonUserDO, Integer> {
    List<PokemonUserDO> findByIdUser(int id);
    boolean existsByIdPokemonAndIdUser(int idPokemon, int idUser);
}
