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
		String reqHeader = req.getHeader("Accept");
		String pessoasToString = null;
		String protocol = "null";
		if(reqHeader.contains("application/xml")) {
			XStream xStream = new XStream();
			xStream.alias("Pessoa", Pessoa.class);
			pessoasToString = xStream.toXML(listaPessoas);
			protocol = "xml";
		}else if(reqHeader.contains("application/json")) {
			 Gson gson = new Gson();
			 pessoasToString = gson.toJson(listaPessoas);
			 protocol = "json";
		}
		return protocol+":"+pessoasToString;
	}

}
