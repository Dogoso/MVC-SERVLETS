package com.doglab.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Banco {

	private static List<Pessoa> funcionarios = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();
	
	static {
		Pessoa p = new Pessoa();
		p.setName("Marcela");
		p.setId(1);
		p.setGenero("Feminino");
		p.setNascimento(new Date());
		funcionarios.add(p);
		
		Pessoa p2 = new Pessoa();
		p2.setName("Josivaldo");
		p2.setId(2);
		p2.setGenero("Masculino");
		p2.setNascimento(new Date());
		funcionarios.add(p2);
		
		Pessoa p3 = new Pessoa();
		p3.setName("Helena");
		p3.setId(3);
		p3.setGenero("Feminino");
		funcionarios.add(p3);
		
		Pessoa p4 = new Pessoa();
		p4.setName("Viktor");
		p4.setId(4);
		p4.setGenero("Não-binário");
		funcionarios.add(p4);
		
		Usuario u1 = new Usuario();
		u1.setLogin("admin");
		u1.setPassword("admin");
		usuarios.add(u1);
		
	}
	
	public List<Pessoa> getFuncionarios() {
		return Banco.funcionarios;
	}
	
	public void addFuncionario(Pessoa pessoa) {
		Banco.funcionarios.add(pessoa);
	}
	
	public Usuario catchUser(String login, String password) {
		for(Usuario u : usuarios) {
			if(u.checkUser(login, password)) {
				return u;
			}
		}
		return null;
	}
	
}
