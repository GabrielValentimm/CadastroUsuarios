package com.cadastrousuario.CadastroUsuario.Curso;

import com.cadastrousuario.CadastroUsuario.Usuarios.Controller.Service.UsuarioModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_curso")
public class CursoModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nomeDoCurso;


    @OneToMany(mappedBy = "curso") // Um Curso tem muitos usuários
    @JsonIgnore // tira o loop de inicialização
    private List<UsuarioModel> usuario; // acessar a nossa outra tabela
}
