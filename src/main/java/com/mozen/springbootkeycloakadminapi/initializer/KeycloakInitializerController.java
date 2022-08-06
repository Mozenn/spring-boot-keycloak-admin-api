package com.mozen.springbootkeycloakadminapi.initializer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/keycloak")
public class KeycloakInitializerController {

    private KeycloakInitializer keycloakInitializer;

    public KeycloakInitializerController(KeycloakInitializer keycloakInitializer) {
        this.keycloakInitializer = keycloakInitializer;
    }

    @PostMapping("/init")
    public void init(@RequestParam boolean overwrite) {
        keycloakInitializer.init(overwrite);
    }

    @DeleteMapping("/reset")
    public void reset() {
        keycloakInitializer.reset();
    }
}
