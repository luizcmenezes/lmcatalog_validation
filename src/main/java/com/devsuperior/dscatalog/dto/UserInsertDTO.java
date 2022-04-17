package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.entities.User;
import com.devsuperior.dscatalog.services.validation.UserInsertValid;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@UserInsertValid
public class UserInsertDTO extends UserDTO {
    private static final long serialVersionUID = 1L;

    private String password;

    public UserInsertDTO() {
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
