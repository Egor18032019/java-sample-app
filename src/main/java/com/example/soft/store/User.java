package com.example.soft.store;

import com.example.soft.store.entity.AbstractBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User  extends AbstractBaseEntity {
    @Column(name = "username")
    private String username;
    @NotBlank
    @Column(name = "email")
    private String email;
    @Column(name = "password_hash")
    private String password_hash;

}
