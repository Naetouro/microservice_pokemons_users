package com.microservice_pokemons_users.controllers;

import com.microservice_pokemons_users.business.PokemonUserBO;
import com.microservice_pokemons_users.data.transfer.objects.PokemonUserDTO;
import com.microservice_pokemons_users.repositories.PokemonUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class Controller {

    @Autowired
    private PokemonUserBO bo;

    @Autowired
    private PokemonUserRepository repo;

    /**
     * @apiNote GET /user/{id}
     * @param id int
     * @return List PokemonUserDTO
     */
    @GetMapping("/user/{id}")
    public List<PokemonUserDTO> findAll(@PathVariable final int id) {
        return bo.findByUserId(id);
    }

    /**
     * @param idPokemon int
     * @param idUser int
     * @return boolean
     */
    @GetMapping(value = "/pokemon/{idPokemon}/user/{idUser}")
    public boolean existsByIdPokemonAndIdUser(@PathVariable final int idPokemon, @PathVariable final int idUser) {
        return bo.existsByIdPokemonAndIdUser(idPokemon, idUser);
    }

    /**
     * @param pokemonUserDTO class
     */
    @PostMapping
    public void save(@RequestBody final PokemonUserDTO pokemonUserDTO){
        bo.save(pokemonUserDTO);
    }

    /**
     * @param pokemonUserDTO class
     */
    @DeleteMapping
    public void delete(@RequestBody final PokemonUserDTO pokemonUserDTO){
        bo.delete(pokemonUserDTO);
    }
}
