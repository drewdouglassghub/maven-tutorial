package net.drewdouglass;

import java.util.ArrayList;

public class Band {

	String bandName;
	int numMembers;
	ArrayList<String> members = new ArrayList<String>(numMembers);
	String musicStyle;
	int bandFee;
	static double bandFundBalance;
	
	public Band(String bandName, int numMembers,  String musicStyle, int bandFee, double bandFundBalance) {
		super();
		this.bandName = bandName;
		this.numMembers = numMembers;
		this.musicStyle = musicStyle;
		this.bandFee = bandFee;
		this.bandFundBalance = bandFundBalance;
	}
	
	public Band() {
		
	}


	public String introduceBand() {
		System.out.println("Hey everybody, We are " + bandName + ". This is " + members.get(0) + ", that's " + members.get(1) + ", and I'm " + members.get(2) + ". We'll be here playing music for you all night long.");
		return ("Hey everybody, We are " + bandName + ". This is " + members.get(0) + ", that's " + members.get(1) + ", and I'm " + members.get(2) + " we'll be here playing music for you all night long.");
	}

	public String fridayNightBanter() {
		System.out.println("Thanks for coming out tonight! We are " + bandName + ". Please go like us on Facebook"
				+ " and Instagram!");
		return ("Thanks for coming out tonight! We are " + bandName + ". Please go like us on Facebook"
				+ " and Instagram!");
	}
	
}
