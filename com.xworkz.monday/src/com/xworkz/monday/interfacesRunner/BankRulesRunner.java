package com.xworkz.monday.interfacesRunner;

import com.xworkz.monday.interfaces.AxixBank;
import com.xworkz.monday.interfaces.BankImplementation;

public class BankRulesRunner {
	public static void main(String[] args) {
		AxixBank axixbank=new BankImplementation();
		axixbank.adhereToTransactionLimits();
		axixbank.avoidIllegalTransactions();
		axixbank.display();
		axixbank.ensureSignatureMatches();
		axixbank.followATMUsageGuidelines();
		axixbank.followBankWorkingHours();
		axixbank.followDisputeResolutionProcess();
		axixbank.keepAccountDetailsConfidential();
		axixbank.maintainMinimumBalance();
		axixbank.maintainProperConduct();
		axixbank.practiceSafeOnlineBanking();
		axixbank.provideValidID();
		axixbank.repayLoansOnTime();
		axixbank.reportLostCard();
		axixbank.respectBankPrivacyPolicy();
		axixbank.updatePersonalInfo();
	}
	
}
