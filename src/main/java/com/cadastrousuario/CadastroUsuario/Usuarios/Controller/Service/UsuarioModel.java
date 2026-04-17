package com.cadastrousuario.CadastroUsuario.Usuarios.Controller.Service;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "tb_cadastro")
@Data
@AllArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String Nome;
    private String Email;
    private int idade;
    private String cpf;
}
