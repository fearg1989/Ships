package com.ships.Ships.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;


@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Ships CRUD",
                version = "1.0.0",
                description = "This is a CRUD for management Ships"
        )
)
public class SwaggerConfig {

}
