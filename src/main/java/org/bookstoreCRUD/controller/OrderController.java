package org.bookstoreCRUD.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bookstoreCRUD.bean.Order;
import org.bookstoreCRUD.service.OrderService;


@Path("/orders")
public class OrderController {
	
	OrderService orderService= new OrderService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Order> getOrders()
	{
		
		List<Order> listOfOrders=orderService.getOrders();
		return listOfOrders;
	}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Order getOrderById(@PathParam("id") int id)
	{
		return orderService.getOrder(id);
	}
   
    private Order getOrder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@POST
    @Produces(MediaType.APPLICATION_JSON)
	public static Order addOrder(Order Order)
	{
		return OrderService.addOrder(Order);
	}

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
	public static Order updateOrder(Order Order)
	{
		return OrderService.updateOrder(Order);
		
	}
	
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public static void deleteOrder(@PathParam("id") int id)
	{
		 OrderService.deleteOrder(id);
		
	}
	
}
