package gr.manousos.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ActivateBean extends RegisterBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ActivateBean(){
		super();
	}
	
	private String otp;

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}	
	
}
