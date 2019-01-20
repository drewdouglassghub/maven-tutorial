package net.drewdouglass;

import java.util.ArrayList;

public class BandMember extends Band {

	String memberName;
	String instrument;
	String email;
	String phone;
	double feePercentage;

	public BandMember(String memberName, String instrument, String email, String phone, double feePercentage) {
		super();
	}

	public BandMember(String bandName, int numMembers, String musicStyle, int bandFee) {
		super(bandName, numMembers, musicStyle, bandFee, bandFundBalance);

	}

	public BandMember(String bandName, int numMembers, String musicStyle, int bandFee, double bandFundBalance,
			String memberName, String instrument, String email, String phone, double feePercentage) {
		super(bandName, numMembers, musicStyle, bandFee, bandFundBalance);
		this.memberName = memberName;
		this.instrument = instrument;
		this.email = email;
		this.phone = phone;
		this.feePercentage = feePercentage;
	}

	public double payMember(double fee) {

		return feePercentage * fee;

	}

}
