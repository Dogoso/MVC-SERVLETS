package com.doglab.actions;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.doglab.models.Banco;
import com.doglab.models.Pessoa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NovoRegistroAction implements Action{

	public String exec(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		Pessoa pessoa = new Pessoa();
		
		String name = req.getParameter("nome");
		pessoa.setName(name);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String data = req.getParameter("data");
		Date date = null;
		try {
			date = sdf.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		pessoa.setNascimento(date);
		
		pessoa.setId(0);
		pessoa.setGenero("desconhecido");
		
		Banco banco = new Banco();
		banco.addFuncionario(pessoa);

		return "redirect:ListaPessoas";
	}
	
}
