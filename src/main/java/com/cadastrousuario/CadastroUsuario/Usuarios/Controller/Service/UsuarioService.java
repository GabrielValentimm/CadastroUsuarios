package com.cadastrousuario.CadastroUsuario.Usuarios.Controller.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired // usa no lugar do construtor
    private UsuarioRepository UsuarioRepository; // injeção de dependencias


    // Listar todos os meus usuarios
    public List<UsuarioModel> listaUsuarios(){
        return UsuarioRepository.findAll(); // vai ser como insert into no banco de dados
    }
}
