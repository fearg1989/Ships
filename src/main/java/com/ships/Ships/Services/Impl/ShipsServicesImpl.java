package com.ships.Ships.Services.Impl;

import com.ships.Ships.Models.Ship;
import com.ships.Ships.Repository.ShipsRepository;
import com.ships.Ships.Services.ShipsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipsServicesImpl implements ShipsServices {

    @Autowired
    private ShipsRepository shipsRepository;

    @Override
    @Cacheable(value = "ships")
    public List<Ship> getAllShips() {
        return  shipsRepository.findAllShips();
    }

    @Override
    @Cacheable(value = "ships", key = "#id")
    public Optional<Ship> getShipById(Long id) {
        return shipsRepository.findById(id);
    }

    @Override
    @Cacheable(value = "ships", key = "#name")
    public List<Ship> getShipsByName(String name){
        return shipsRepository.findByName(name.toUpperCase());
    }

    @Override
    @CachePut(value = "ships", key = "#ship.id")
    public String saveShip(Ship ship){
        shipsRepository.save(ship);
        return "Nave guardada con exito, ID: " + ship.getId();
    }

    @Override
    @CacheEvict(value="ships",  allEntries = true) 
    public String updateShip(Ship ship){
        shipsRepository.save(ship);
        return "Nave actualizada con exito";
    }

    @Override
    @CacheEvict(value = "ships", key = "#id")
    public String deleteShip(Long id){
        shipsRepository.deleteById(id);
        return "Nave eliminada con exito";
    }

}
