package com.myspace.deposit_retention;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer_Profile implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String ccid;
	private java.lang.String firstName;
	private java.lang.String lastName;

	private java.lang.Boolean thirdPartyTransfer;

	private java.lang.Boolean inFlow;

	private java.lang.Boolean outFlow;

	private java.util.Date accountPaymentDueDate;

	public Customer_Profile() {
	}

	public java.lang.String getCcid() {
		return this.ccid;
	}

	public void setCcid(java.lang.String ccid) {
		this.ccid = ccid;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.lang.Boolean getThirdPartyTransfer() {
		return this.thirdPartyTransfer;
	}

	public void setThirdPartyTransfer(java.lang.Boolean thirdPartyTransfer) {
		this.thirdPartyTransfer = thirdPartyTransfer;
	}

	public java.lang.Boolean getInFlow() {
		return this.inFlow;
	}

	public void setInFlow(java.lang.Boolean inFlow) {
		this.inFlow = inFlow;
	}

	public java.lang.Boolean getOutFlow() {
		return this.outFlow;
	}

	public void setOutFlow(java.lang.Boolean outFlow) {
		this.outFlow = outFlow;
	}

	public java.util.Date getAccountPaymentDueDate() {
		return this.accountPaymentDueDate;
	}

	public void setAccountPaymentDueDate(java.util.Date accountPaymentDueDate) {
		this.accountPaymentDueDate = accountPaymentDueDate;
	}

	public Customer_Profile(java.lang.String ccid, java.lang.String firstName,
			java.lang.String lastName, java.lang.Boolean thirdPartyTransfer,
			java.lang.Boolean inFlow, java.lang.Boolean outFlow,
			java.util.Date accountPaymentDueDate) {
		this.ccid = ccid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.thirdPartyTransfer = thirdPartyTransfer;
		this.inFlow = inFlow;
		this.outFlow = outFlow;
		this.accountPaymentDueDate = accountPaymentDueDate;
	}

}