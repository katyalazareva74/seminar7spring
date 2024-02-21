package com.example.hwsem7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResourceController {
    /**
     * Запрос к ресурсу public-data работает для всех аутентифицированных пользователей.
     * Если пользователь не аутентифицирован, то выдается запрос на его аутентификацию.
     * @return - возвращает страницу с ресурсом public-data
     */
    @GetMapping("/public-data")
    public String userResource() {
        return "public_data.html";
    }

    /**
     * Этот запрос возникает, когда пользователь хочет попасть на ресурс private-data,
     * а у него нет прав ADMIN
     * @return - возвращает страницу  с отказом в доступе access_denied.
     */
    @GetMapping("/access-denied")
    public String deniedResource() {
        return "access_denied.html";
    }

    /**
     * Запрос к ресурсу private-data работает для всех аутентифицированных пользователей с правами ADMIN.
     * Если пользователь не аутентифицирован, то выдается запрос на его аутентификацию.
     * @return - возвращает страницу с ресурсом private-data
     */
    @GetMapping("/private-data")
    public String adminResource() {
        return "private_data.html";
    }
}
