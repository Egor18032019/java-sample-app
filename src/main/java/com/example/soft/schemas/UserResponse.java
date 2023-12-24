package com.example.soft.schemas;

import com.example.soft.store.User;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Ответ на создание пользователя.")
public class UserResponse {
    private User user;
}
