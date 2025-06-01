package abreualtopeca.loginpage.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abreualtopeca.loginpage.entity.User;
import abreualtopeca.loginpage.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> autenticar(String login, String senha) {
        Optional<User> userOpt = userRepository.findByLogin(login);
        if (userOpt.isPresent() && userOpt.get().getSenha().equals(senha)) {
            return userOpt;
        }
        return Optional.empty();
    }


}