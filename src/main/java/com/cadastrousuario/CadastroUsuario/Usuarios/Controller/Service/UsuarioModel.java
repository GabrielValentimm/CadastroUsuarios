package com.cadastrousuario.CadastroUsuario.Usuarios.Controller.Service;

import com.cadastrousuario.CadastroUsuario.Curso.CursoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

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

    // Um usuário tem um único curso
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private CursoModel curso;
}
