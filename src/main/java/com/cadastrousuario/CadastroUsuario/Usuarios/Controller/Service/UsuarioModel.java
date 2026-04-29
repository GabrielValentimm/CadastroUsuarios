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

    @Column(unique = true, nullable = true)
    private String Email;

    private int idade;

    @Column(unique = true, nullable = true, length = 11)
    private String cpf;

    @Column (name = "img_url")
    private String imgUrl;

    // Um usuário tem um único curso
    @ManyToOne
    @JoinColumn(name = "curso_id")

    private CursoModel curso;
}
