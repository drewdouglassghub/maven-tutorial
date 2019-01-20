package net.drewdouglass;

import org.junit.*;
import static org.junit.Assert.*;



import org.junit.Test;

public class BandTest {

	Band kcc ;
	
	
	@Before							//tests constructors
	public void createBand() {
		kcc = new Band ("Kids Chasing Cars", 3, "Pop/Punk, Rock", 650, 300);
		kcc.members.add("Nick");
		kcc.members.add("Sam");
		kcc.members.add("Drew");		
	}	
	
	
	
	@Test							//test to make sure there are members in the band
	public void testMembers() {
		assertNotNull(kcc.members.get(0));
	}
	
	@Test							//test to make sure banter works
	public void testBanter() {
		assertEquals(kcc.fridayNightBanter(), "Thanks for coming out tonight! We are " + kcc.bandName + ". Please go like us on Facebook"
				+ " and Instagram!");
	}
	
	
	
	@Test							//test for introduce band method
	public void introduceBand() {
		assertEquals(kcc.introduceBand(), "Hey everybody, We are " + kcc.bandName + ". This is " + kcc.members.get(0) + ", that's " + kcc.members.get(1) + ", and I'm " + kcc.members.get(2) + " we'll be here playing music for you all night long.");
	}
	
	
}
