package com.ideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add( new Usuario( 1, "Juan", "Perez" ) );
		this.lista.add( new Usuario( 2, "Edilperto", "García" ) );
		this.lista.add( new Usuario( 3, "Luis", "Fernandez" ) );
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		
		for(Usuario u : this.lista ) {
			if( u.getId().equals( id ) ) { // usar operado == en integer referencia y .equals en clase valor de obj Integer 
				resultado = u;
				break;
			}
		}
		
		return resultado;
	}

}
