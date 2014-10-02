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

import PizzaPoacher.gae.db.Pizzerias;

@SuppressWarnings("serial")
public class AddPizzaServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pizzaSize = req.getParameter("Size");
		String pizzaTopping = req.getParameter("Topping");
		String pizzaType = req.getParameter("Pizza Type")
		Pizzerias.createOrder(orderID);
		resp.sendRedirect("/gae/admin/outputOrder.jsp"); //output order == redirect .jsp
