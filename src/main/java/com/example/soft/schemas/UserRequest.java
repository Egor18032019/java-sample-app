package com.example.soft.schemas;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "координаты офиса и его загрузка")
public class UserRequest {
    @Schema(description = "username")
    private String username;

    @Schema(description = "email")
    private String email;
    @Schema(description = "password_hash")
    private String password_hash;
}
