package com.doglab.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns="/*")
public class AutorizationFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) req;
		HttpServletResponse httpRes = (HttpServletResponse) res;
		
		String actionURI = httpReq.getRequestURI().split("/")[2];
		req.setAttribute("URI", actionURI);
		
		boolean needAutorization = !(actionURI.equals("Login") 
										|| actionURI.equals("ValidateLogin")
										|| actionURI.equals("InvalidateLogin"));
		boolean hasSession = (httpReq.getSession().getAttribute("user") == null);
		if(needAutorization && hasSession) {
			httpRes.sendRedirect("Login");
			return;
		}

		chain.doFilter(req, res);
		
	}

}
