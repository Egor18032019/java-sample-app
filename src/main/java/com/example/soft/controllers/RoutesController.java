package com.example.soft.controllers;

import com.example.soft.service.UserService;
import com.example.soft.store.User;
import com.example.soft.schemas.UsersResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import com.example.soft.utils.EndPoint;

@Tag(name = "Создание и показ пользователей")
@RestController
@RequestMapping(EndPoint.api)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RoutesController {
    UserService userService;

    public RoutesController(UserService userService) {
        this.userService = userService;
    }

    @Operation(
            summary = "Запрос на получение всех пользователей",
            description = " "
    )
    @GetMapping(value = EndPoint.user)
    public User[]  showUsers() {

        return userService.getAllUsers();
    }

    @Operation(
            summary = "Создание пользователя",
            description = "На вход ждет User"
    )
    @PostMapping(value = EndPoint.user)
    public User[] createUser(@RequestBody() User user) {

        return userService.save(user);
    }
}
