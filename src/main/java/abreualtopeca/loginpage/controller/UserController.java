package abreualtopeca.loginpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import abreualtopeca.loginpage.entity.User;
import abreualtopeca.loginpage.service.UserService;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        Optional<User> userOpt = userService.autenticar(user.getLogin(), user.getSenha());
        if (userOpt.isPresent()) {
            return ResponseEntity.ok("Login realizado com sucesso!");
        } else {
            return ResponseEntity.status(401).body("Login ou senha inválidos.");
        }
    }
}