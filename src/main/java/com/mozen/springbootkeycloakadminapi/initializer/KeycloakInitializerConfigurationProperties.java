package com.mozen.springbootkeycloakadminapi.initializer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "keycloak-initializer")
public class KeycloakInitializerConfigurationProperties {

    @Getter(AccessLevel.NONE)
    private boolean initializeOnStartup;

    public boolean initializeOnStartup() {
        return initializeOnStartup;
    }

    private String masterRealm;

    private String applicationRealm;

    private String clientId;

    private String username;

    private String password;

    private String url;
}
