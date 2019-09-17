package com.sigtrans.sigtrans.model.usuarios;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Usuario {
    private @Id
    @GeneratedValue
    UUID id;

    @ManyToOne
    private Parceiro parceiro;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String senha;

    @Column(name = "tipo_usuario")
    private int tipoUsuario;

    public Usuario() {
    }

    public Usuario(Parceiro parceiro, String nome, String email, String telefone, String login, String senha, int tipoUsuario) {
        this.parceiro = parceiro;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
    }
}
