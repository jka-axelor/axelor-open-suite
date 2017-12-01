/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2017 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.bankpayment.service.bankstatement;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.axelor.apps.account.db.InterbankCodeLine;
import com.axelor.apps.bankpayment.db.BankStatement;
import com.axelor.apps.bankpayment.db.BankStatementLine;
import com.axelor.apps.base.db.BankDetails;
import com.axelor.apps.base.db.Currency;
import com.google.inject.Inject;

public class BankStatementLineService {

	@Inject
	public BankStatementLineService()  {
		
	}

	
	public BankStatementLine createBankStatementLine(BankStatement bankStatement, int sequence, BankDetails bankDetails, BigDecimal debit, BigDecimal credit, Currency currency, 
			String description, LocalDate operationDate, LocalDate valueDate, InterbankCodeLine operationInterbankCodeLine, InterbankCodeLine rejectInterbankCodeLine, String origin, String reference)  {
		
		BankStatementLine bankStatementLine = new BankStatementLine();
		bankStatementLine.setBankStatement(bankStatement);
		bankStatementLine.setSequence(sequence);
		bankStatementLine.setBankDetails(bankDetails);
		bankStatementLine.setDebit(debit);
		bankStatementLine.setCredit(credit);
		bankStatementLine.setCurrency(currency);
		bankStatementLine.setDescription(description);
		bankStatementLine.setOperationDate(operationDate);
		bankStatementLine.setValueDate(valueDate);
		bankStatementLine.setOperationInterbankCodeLine(operationInterbankCodeLine);
		bankStatementLine.setRejectInterbankCodeLine(rejectInterbankCodeLine);
		bankStatementLine.setOrigin(origin);
		bankStatementLine.setReference(reference);
		
		return bankStatementLine;
		
	}
	

}
