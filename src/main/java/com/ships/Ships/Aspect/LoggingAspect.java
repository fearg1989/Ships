package com.ships.Ships.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.ships.Ships.Services.ShipsServices.getShipById(..)) && args(id)")
    public void logBefore(Long id) {
        if (id < 0) {
            System.out.println("Se ha solicitado una nave con un ID negativo: " + id);
        }
    }
}
