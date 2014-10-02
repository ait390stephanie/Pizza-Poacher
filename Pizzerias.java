/**
 * Copyright 2014 -
 * Licensed under the Academic Free License version 3.0
 * http://opensource.org/licenses/AFL-3.0
 * 
 * Authors: Stephanie Olson
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

//QUERY PIZZERIAS  <--> User story B task

//GET PIZZERIA 

//ADD PIZZERIA ** AddPizzeriaServlet.java

//UPDATE PIZZERIA ** UpdatePizzeriaSerlvet.java

//DELETE PIZZERIA ** DeletePizzeriaServlet.java
