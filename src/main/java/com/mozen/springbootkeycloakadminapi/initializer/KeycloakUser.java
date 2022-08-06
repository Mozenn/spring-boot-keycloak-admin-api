package com.mozen.springbootkeycloakadminapi.initializer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KeycloakUser {

    private String username;

    private String password;

    private String email;

    private boolean isAdmin;
}
