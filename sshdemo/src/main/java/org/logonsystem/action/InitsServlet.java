package org.logonsystem.action;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet(urlPatterns="/InitsServlet",loadOnStartup=1)
public class InitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public InitsServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		getServletContext().setAttribute("base", getServletContext().getContextPath());
		System.out.println(getServletContext().getContextPath());
		getServletContext().setAttribute("authcodes", "");
	}
	
}
