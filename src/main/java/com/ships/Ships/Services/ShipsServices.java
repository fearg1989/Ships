package com.ships.Ships.Services;

import com.ships.Ships.Models.Ship;


import java.util.List;
import java.util.Optional;

public interface ShipsServices {

    List<Ship> getAllShips();

    Optional<Ship> getShipById(Long id);

    List<Ship> getShipsByName(String name);

    String saveShip(Ship ship);

    String updateShip(Ship ship);

    String deleteShip(Long id);

}
