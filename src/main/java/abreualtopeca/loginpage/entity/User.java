package abreualtopeca.loginpage.entity;

import jakarta.persistence.*;

@Entity 
@Table(name= "usuario")
public class User {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long userId;

    @Column(name = "login") 
    private String login ;

    @Column(name = "senha")
    private String senha ; 

    public User()
    {} 

    public User(String login, String senha, Long userId) {
        this.login = login;
        this.senha = senha;
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
