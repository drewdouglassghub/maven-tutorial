package net.drewdouglass;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BandMemberTest {

	BandMember Drew;
	BandMember Sam;
	BandMember Nick;
	
	@Before 						//test for constructors
	public void createBandMate() {
		Drew  = new BandMember("Drew", "Bass", "Drew@kidschasingcars.com", "5157297086", .25);
		Sam = new BandMember("Sam", "Drums", "Sam@kidschasingcars.com", "5155555555", .25);
		Nick = new BandMember("Nick", "Drums", "Nick@kidschasingcars.com", "5155555554", .25);	
	}
	
	@Test							//test for memberPay function
	public void testMemberPay() {
		assertTrue(Drew.payMember(Drew.bandFee) == Drew.feePercentage * Drew.bandFee);
	}

}
