package com.cadastrousuario.CadastroUsuario.Usuarios.Controller.Service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
