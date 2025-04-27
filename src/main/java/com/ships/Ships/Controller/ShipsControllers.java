package com.ships.Ships.Controller;

import com.ships.Ships.Models.Ship;
import com.ships.Ships.Services.ShipsServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/ships")
@Tag(name = "Ship resource")
public class ShipsControllers {

    @Autowired
    private ShipsServices shipsServices;

    @Operation(summary = "View a list of available ships")
    @GetMapping
    public ResponseEntity<?> getAllShips(){
        return ResponseEntity.ok(shipsServices.getAllShips());
    }

    @Operation(summary = "Get a ship by Id")
    @GetMapping("/{id}")
    public ResponseEntity<?> getShipById(@PathVariable Long id){
        return ResponseEntity.ok(shipsServices.getShipById(id));
    }

    @Operation(summary = "Get a ship by Name")
    @GetMapping("/search")
    public ResponseEntity<?> getShipsByName(@RequestParam String name){
        return ResponseEntity.ok(shipsServices.getShipsByName(name));
    }

    @Operation(summary = "Add a ship")
    @PostMapping
    public ResponseEntity<?> createShip(@RequestBody Ship ship){
        return ResponseEntity.ok(shipsServices.saveShip(ship));
    }

    @Operation(summary = "Update a ship")
    @PutMapping("/{id}")
    public ResponseEntity<?> updateShip(@PathVariable Long id, @RequestBody Ship ship) {
        ship.setId(id);
        return ResponseEntity.ok(shipsServices.updateShip(ship));
    }

    @Operation(summary = "Delete a ship")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSpaceship(@PathVariable Long id) {
        return ResponseEntity.ok(shipsServices.deleteShip(id));
    }
}
