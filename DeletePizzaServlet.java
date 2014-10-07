/**
 * Copyright 2014 -
 * Licensed under the Academic Free License version 3.0
 * http://opensource.org/licenses/AFL-3.0
 * 
 * Authors: Stephanie Olson & Tetis Chang
 */
package PizzaPoacher.gae.servlet;
 
import java.io.IOException;
 
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import PizzaPoacher.gae.db.Driver;

@SuppressWarnings("serial")
public class DeletePizzaServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		boolean result=Driver.deletePizzaCommand(req.getParameter("pizzaID")); //"pizzaID assuming that each pizza ordered will be given an identification num"
		resp.setStatus((result)?HttpServletResponse.SC_OK:HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	}
}
