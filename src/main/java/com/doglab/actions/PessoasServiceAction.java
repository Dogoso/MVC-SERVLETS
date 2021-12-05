package com.doglab.actions;

import java.io.IOException;
import java.util.List;

import com.doglab.models.Banco;
import com.doglab.models.Pessoa;
import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Web Service!
public class PessoasServiceAction implements Action {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		List<Pessoa> listaPessoas = new Banco().getFuncionarios();
		
		XStream xStream = new XStream();
		xStream.alias("Pessoa", Pessoa.class);
		String pessoasXML = xStream.toXML(listaPessoas);
		
		// Gson gson = new Gson();
		// String pessoasJson = gson.toJson(listaPessoas);
		
		return "xml:"+pessoasXML;
	}

}
