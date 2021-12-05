package com.doglab.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class EntranceFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		long curMilis = System.currentTimeMillis();
		chain.doFilter(req, res);
		long newCurMilis = System.currentTimeMillis();
		System.out.println("Tempo de execução: " + (newCurMilis - curMilis));
	}

}
