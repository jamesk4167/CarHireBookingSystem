package ie.gmit.sw.resources;

import ie.gmit.sw.ds.Booking;
import ie.gmit.sw.ds.Car;
import ie.gmit.sw.ds.Owner;
import ie.gmit.sw.ds.ObjectFactory;


import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.*;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBElement;
import javax.xml.transform.stream.StreamSource;

@Singleton
@Path("/bookings")
public class BookingResource {

	
	ArrayList<Booking> orders = new ArrayList<Booking>();
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	@Path("/{value}")
	/* Note how this method has been annotated to produce both XML and JSON
	 * The response format which is sent will depend on the Accept: header field in the HTTP request from the client 
	 */
	public Booking getOrder(@PathParam("value") String value) {
		Booking requested = null;
		for(Booking b : orders) {
			if(b.getOrderNumber().equals(value)) {
				requested = b;
			}
		}
		
		return requested;		
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/{value}")
	public Response createOrder(@PathParam("value") String value, Booking toCreate) {
		Booking requested = null;
		for(Booking b : orders) {
			if(b.getOrderNumber().equals(value)) {
				requested = b;
			}
		}
		
		if(requested != null) {
			String msg = "The order number " + value + " already exists";
			return Response.status(409).entity(msg).build();
		}
		else {
			orders.add(toCreate);
			String msg = "Resource created!";
			return Response.status(201).entity(msg).build(); // return 201 for resource created
		}
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/{value}")
	public Response updateOrder(@PathParam("value") String value, Booking updated) {
		Booking requested = null;
		for(Booking b : orders) {
			if(b.getOrderNumber().equals(value)) {
				requested = b;
			}
		}
		
		if(requested != null) {
			String msg = "The order number " + value + " was updated!";
			orders.remove(requested);
			orders.add(updated);
			return Response.status(200).entity(msg).build();
		}
		else {
			String msg = "The order number " + value + " does not exist";;
			return Response.status(404).entity(msg).build(); // return 404 for resource not found
		}
	}
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{value}")
	public Response deleteOrder(@PathParam("value") String value) {
		Booking requested = null;
		for(Booking b : orders) {
			if(b.getOrderNumber().equals(value)) {
				requested = b;
			}
		}
		
		if(requested != null) {
			String msg = "The order number " + value + " was deleted!";
			orders.remove(requested);
			return Response.status(200).entity(msg).build();
		}
		else {
			String msg = "The order number " + value + " does not exist";;
			return Response.status(404).entity(msg).build(); // return 404 for resource not found
		}
	}
	
	public BookingResource() {		
		init();
	}
		
	private void init() {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date(System.nanoTime()));
		XMLGregorianCalendar date = null;
		try {
			date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		ObjectFactory objFactory = new ObjectFactory();

		Booking po = objFactory.createBooking();
		po.setOrderNumber("55522-BABA");
		po.setOrderDate(date);

		Owner shipTo = new Owner();
		shipTo.setName("John Doe");
		shipTo.setAge(20);
		shipTo.setDateOfBirth("020895");
		po.setShipTo(shipTo);
		po.setBillTo(shipTo);

	
	}
}
