package com.casestudy;

import java.time.LocalDate;

public class Trasacation {
	
		private long accNo;
		
		private String typeOfTrans;
		
		private LocalDate date;
		
		private float withdrawlAmount;
		
		private float depositAmount;
		
		private float balance;
		
		private long transId;
		
		

		@Override
		public String toString() {
			return "Trasacation [accNo=" + accNo + ", typeOfTrans=" + typeOfTrans + ", date=" + date
					+ ", withdrawlAmount=" + withdrawlAmount + ", depositAmount=" + depositAmount + ", balance="
					+ balance + ", transId=" + transId + "]";
		}

		public long getAccNo() {
			return accNo;
		}

		public void setAccNo(long accNo) {
			this.accNo = accNo;
		}

		public String getTypeOfTrans() {
			return typeOfTrans;
		}

		public void setTypeOfTrans(String typeOfTrans) {
			this.typeOfTrans = typeOfTrans;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public float getWithdrawlAmount() {
			return withdrawlAmount;
		}

		public void setWithdrawlAmount(float withdrawlAmount) {
			this.withdrawlAmount = withdrawlAmount;
		}

		public float getDepositAmount() {
			return depositAmount;
		}

		public void setDepositAmount(float depositAmount) {
			this.depositAmount = depositAmount;
		}

		public float getBalance() {
			return balance;
		}

		public void setBalance(float balance) {
			this.balance = balance;
		}

		public long getTransId() {
			return transId;
		}

		public void setTransId(long transId) {
			this.transId = transId;
		}

		public Trasacation(long accNo, String typeOfTrans, LocalDate date, float withdrawlAmount, float depositAmount,
				float balance, long transId) {
			super();
			this.accNo = accNo;
			this.typeOfTrans = typeOfTrans;
			this.date = date;
			this.withdrawlAmount = withdrawlAmount;
			this.depositAmount = depositAmount;
			this.balance = balance;
			this.transId = transId;
		}
		
		

}
