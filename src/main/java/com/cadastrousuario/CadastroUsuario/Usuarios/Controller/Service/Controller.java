package com.cadastrousuario.CadastroUsuario.Usuarios.Controller.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // difinir que é um controller
@RequestMapping // usamos para encontrar a nossa rota no mesmo lugar local:host
public class Controller {

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
    public String mostrarTodosUsuarios(){
        return "Mostrar Usuario";
    }

    @GetMapping("/todosID")
    public String mostrarTodosUsuariosID(){
        return "Mostrar todos os Id do usuarios";
    }



}
