package com.xworkz.monday.interfaces;

public class BankImplementation implements AxixBank {

	@Override
	public void maintainMinimumBalance() {
		System.out.println("Maintain a minimum balance in the account as per bank policy");
	}

	@Override
	public void provideValidID() {
		System.out.println("Provide valid identification documents for account opening or transactions");
	}

	@Override
	public void keepAccountDetailsConfidential() {
		System.out.println("Do not share PIN or account details with others");

	}

	@Override
	public void reportLostCard() {
		System.out.println("Notify the bank immediately in case of lost or stolen cards");
	}

	@Override
	public void adhereToTransactionLimits() {
		System.out.println("Follow transaction limits for withdrawals and deposits");

	}

	@Override
	public void followBankWorkingHours() {
		System.out.println("Respect bank working hours and schedules for transactions");

	}

	@Override
	public void ensureSignatureMatches() {
		System.out.println("Ensure signatures match the bank's records for checks and documents");

	}

	@Override
	public void repayLoansOnTime() {
		System.out.println("Pay back loans and credit card dues on time to avoid penalties");
	}

	@Override
	public void followDisputeResolutionProcess() {
		System.out.println("Use the bank's grievance mechanism to resolve disputes or issues");

	}

	@Override
	public void avoidIllegalTransactions() {
		System.out.println("Avoid using the account for illegal or unauthorized activities");

	}

	@Override
	public void updatePersonalInfo() {
		System.out.println("Keep personal information updated with the bank");

	}

	@Override
	public void respectBankPrivacyPolicy() {
		System.out.println("Respect the bank's privacy policy and data protection guidelines");

	}

	@Override
	public void maintainProperConduct() {
		System.out.println("Do not use offensive language or behavior towards bank staff");

	}

	@Override
	public void followATMUsageGuidelines() {
		System.out.println("Follow ATM usage guidelines and avoid misuse");

	}

	@Override
	public void practiceSafeOnlineBanking() {
		System.out.println("Adhere to online banking security practices to avoid fraud");

	}

	@Override
	public void display() {
		System.out.println("Running display");

	}

}
