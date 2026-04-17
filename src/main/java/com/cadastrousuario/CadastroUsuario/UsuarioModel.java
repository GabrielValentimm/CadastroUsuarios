package com.cadastrousuario.CadastroUsuario;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String Nome;
    String Email;
    int idade;
    String cpf;
}
