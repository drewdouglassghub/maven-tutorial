package net.drewdouglass;

import java.util.ArrayList;

/**
 * @author Drew Douglass, 1/19/19, amdouglass@dmacc.edu
 * this class uses a band name, the number of members, the music style, and an array list of members to define a band.  It also includes the attributes of band fee and a band fund
 * balance.
 *
 */
public class Band {

	String bandName;
	int numMembers;
	ArrayList<String> members = new ArrayList<String>(numMembers);
	String musicStyle;
	int bandFee;
	static double bandFundBalance;
	
	/**
	 * @param bandName
	 * @param numMembers
	 * @param musicStyle
	 * @param bandFee
	 * @param bandFundBalance
	 * uses the attributes of band name, number of members, music style, the fee the band charges, and the balance of money the band has to create a band.
	 */
	public Band(String bandName, int numMembers,  String musicStyle, int bandFee, double bandFundBalance) {
		super();
		this.bandName = bandName;
		this.numMembers = numMembers;
		this.musicStyle = musicStyle;
		this.bandFee = bandFee;
		Band.bandFundBalance = bandFundBalance;
	}
	
	/**
	 * blank constructor
	 */
	public Band() {
		
	}


	/**
	 * @return 
	 * this method uses the attributes of the band name and the members array list to return a string that introduces the band
	 */
	public String introduceBand() {
		System.out.println("Hey everybody, We are " + bandName + ". This is " + members.get(0) + ", that's " + members.get(1) + ", and I'm " + members.get(2) + ". We'll be here playing music for you all night long.");
		return ("Hey everybody, We are " + bandName + ". This is " + members.get(0) + ", that's " + members.get(1) + ", and I'm " + members.get(2) + " we'll be here playing music for you all night long.");
	}

	/**
	 * @return
	 * this method uses the band name attribute to banter between songs
	 */
	public String fridayNightBanter() {
		System.out.println("Thanks for coming out tonight! We are " + bandName + ". Please go like us on Facebook"
				+ " and Instagram!");
		return ("Thanks for coming out tonight! We are " + bandName + ". Please go like us on Facebook"
				+ " and Instagram!");
	}
	
}
