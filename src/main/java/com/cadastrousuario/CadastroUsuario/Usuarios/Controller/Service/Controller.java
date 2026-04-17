package com.cadastrousuario.CadastroUsuario.Usuarios.Controller.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // difinir que é um controller
@RequestMapping // usamos para encontrar a nossa rota no mesmo lugar local:host
public class Controller {

    @GetMapping("/boasvindas") // pegar as informações e o nome da rota
    public String boasVindas(){
        return "Essa é a nossa primeira rota";
    }

}
