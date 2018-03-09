/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author romul
 */
@Entity
public class Usuario {
    
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    
    @Column(unique = true)
    private String usuario ;
    private String senha;
    private String email;
    @Column(name = "NomeCompleto",length = 70,nullable = false)
    private String nome;
            
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoAcesso;
    
    
    private boolean ehAdministrador;

    public Usuario(String usuario, String senha, String email, String nome, int id, Date ultimoAcesso, boolean ehAdministrador) {
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.nome = nome;
        this.id = id;
        this.ultimoAcesso = ultimoAcesso;
        this.ehAdministrador = ehAdministrador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Date ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public boolean isEhAdministrador() {
        return ehAdministrador;
    }

    public void setEhAdministrador(boolean ehAdministrador) {
        this.ehAdministrador = ehAdministrador;
    }
    
    
    

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
