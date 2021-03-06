package net.drewdouglass;

/**
 * @author Drew Douglass, 1/19/19, amdouglass@dmacc.edu
 *this class uses a strings for member name, instrument, email, and phone to create a band member.  It also has a double called feePerecentage that is the percentage the musician takes
 *from the gig.
 */
public class BandMember {

	String memberName;
	String instrument;
	String email;
	String phone;
	double feePercentage;

	/**
	 * @param memberName
	 * @param instrument
	 * @param email
	 * @param phone
	 * @param feePercentage
	 */
	public BandMember(String memberName, String instrument, String email, String phone, double feePercentage) {
		this.memberName = memberName;
		this.instrument = instrument;
		this.email = email;
		this.phone = phone;
		this.feePercentage = feePercentage;
	}

	/**
	 * @param fee
	 * @return
	 */
	public double payMember(double fee) {

		return feePercentage * fee;

	}

}
