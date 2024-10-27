package com.ships.Ships.Services;

import com.ships.Ships.Models.Ship;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ShipsServices {

    List<Ship> getAllShips(Pageable pageable);

    Optional<Ship> getShipById(Long id);

    List<Ship> getShipsByName(String name);

    String saveShip(Ship ship);

    String updateShip(Ship ship);

    String deleteShip(Long id);

}
