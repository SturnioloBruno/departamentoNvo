package com.example.Dpto.util;

import java.util.Arrays;
import java.util.List;

public enum Role {

    CUSTOMER(Arrays.asList(Permission.CREAR_RESERVAS)),
    ADMINISTRATOR(Arrays.asList(Permission.ADMINISTRAR, Permission.CREAR_RESERVAS));

    private List<Permission> permissions;

    Role(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
