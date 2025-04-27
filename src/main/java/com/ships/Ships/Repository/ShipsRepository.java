package com.ships.Ships.Repository;

import com.ships.Ships.Models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ShipsRepository extends JpaRepository<Ship, Long> {

    @Query(value = "SELECT s FROM Ship s")
    List<Ship> findAllShips();

    @Query(value = "Select s From Ship s Where upper(s.name) like upper('%'||:name||'%') order by s.id")
    List<Ship> findByName(String name);

}
