/**
 * Copyright 2014 -
 * Licensed under the Academic Free License version 3.0
 * http://opensource.org/licenses/AFL-3.0
 * 
 * Authors: Stephanie Olson & Tetis Chang
 */

package PizzaPoacher.gae.db;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.datastore.Transaction;

public final class Pizzerias

//ADD PIZZA <--> User story A task

//DELETE PIZZA  <--> User story A task

//QUERY PIZZERIAS  <--> User story A task?

//GET PIZZERIA  <--> User story A task?

//ADD PIZZERIA  <--> User story C task** AddPizzeriaServlet.java written

//UPDATE PIZZERIA <--> User story C task** UpdatePizzeriaSerlvet.java written

//DELETE PIZZERIA  <--> User story C task** DeletePizzeriaServlet.java written
