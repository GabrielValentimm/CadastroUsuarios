package com.cadastrousuario.CadastroUsuario.Curso;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @GetMapping("/listar")
    public  String listarCursos(){
        return "Listar Cursos";
    }

    @PutMapping("/alterar")
    public String alterarCursos(){
        return "Cursos alterados";
    }

    @PostMapping("/cria")
    public String criarCursos(){
        return "cursos Criados";
    }

    @DeleteMapping("/deletar")
    public String deletarCursos() {
        return  "Cursos deletados";
    }

}
