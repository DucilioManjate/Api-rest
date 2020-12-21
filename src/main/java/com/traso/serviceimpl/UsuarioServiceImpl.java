package com.traso.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traso.model.Usuario;
import com.traso.repo.UsuarioRepository;
import com.traso.serviceinterface.UsuarioServiceInterface;

@Service 
public class UsuarioServiceImpl implements UsuarioServiceInterface {
	
	@Autowired
	private UsuarioRepository usuarioRepo;

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepo.save(usuario);
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepo.save(usuario); // mesmo método de salvar é usado para salvar o novo usuário
	}

	@Override
	public List<Usuario> findAllUsuarios() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioRepo.findAll();
		
	}
	@Override
	public void deleteUsuario(int id) {
		// TODO Auto-generated method stub
		usuarioRepo.deleteById(id);
	}

}
