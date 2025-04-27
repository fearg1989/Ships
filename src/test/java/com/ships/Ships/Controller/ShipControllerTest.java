package com.ships.Ships.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ShipControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllShips() throws Exception {

        mockMvc.perform(get("/api/ships"))
                .andExpect(status().isOk());
    }
}
