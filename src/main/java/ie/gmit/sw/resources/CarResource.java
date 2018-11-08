package ie.gmit.sw.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import ie.gmit.sw.G00341457_DS.*;

@Path("cars")
public class CarResource {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCar() {
		/*
		Car testCar = new Car();
		testCar.setMake("ford");
		testCar.setReg("02Mo5252");
		testCar.setColor("blue");
		testCar.setCondition("great");
		testCar.setYearMade(2011);
		
		return testCar;*/
		return "hello";
		
	}

}
