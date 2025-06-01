package abreualtopeca.loginpage.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import abreualtopeca.loginpage.entity.User;

@Repository 
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);
}