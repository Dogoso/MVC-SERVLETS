package com.doglab.actions;

import java.io.IOException;
import java.util.Iterator;

import com.doglab.models.Banco;
import com.doglab.models.Pessoa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExcluirPessoaAction implements Action{

	public String exec(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		Banco banco = new Banco();
		Iterator<Pessoa> it = banco.getFuncionarios().iterator();
		
		while(it.hasNext()) {
			Pessoa p = it.next();
			if(id == p.getId()) {
				it.remove();
				break;
			}
		}
		return "redirect:ListaPessoas";
	}
	
}
