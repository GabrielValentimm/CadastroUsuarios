package com.cadastrousuario.CadastroUsuario.Usuarios.Controller.Service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // difinir que é um controller
@RequestMapping // usamos para encontrar a nossa rota no mesmo lugar local:host
public class Controller {

    private UsuarioService usuarioService; //injetar dependencias e inicializar o construtor

    public Controller(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/boasvindas") // pegar as informações e o nome da rota
    public String boasVindas(){
        return "Essa é a nossa primeira rota";
    }

    //Adicionar Usuario (Create)
    @PostMapping("/criar")
    public String criarUsuario(){
        return "Usuario criado";
    }

    // Mostrar todos os usuarios(Read)
    @GetMapping("/todos")
    public List<UsuarioModel> listaUsuarios(){
        return usuarioService.listaUsuarios();
    }

    @GetMapping("/todosID")
    public String mostrarTodosUsuariosID(){
        return "Mostrar todos os Id do usuarios";
    }

    @PutMapping("/alterarId")
    public  String alterarUsuarioPorID(){
        return "alterar usuarios por id";
    }

}
