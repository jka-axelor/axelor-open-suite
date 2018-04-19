/*
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
package com.axelor.apps.account.service.invoice.print;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.axelor.apps.account.db.Invoice;
import com.axelor.apps.report.engine.ReportSettings;
import com.axelor.exception.AxelorException;

public interface InvoicePrintService {

    /**
     * Print an invoice.
     *
     * @param invoice  the invoice to print
     * @param toAttach whether we attach the invoice to the object
     * @return the report settings to generate the file
     * @throws AxelorException
     */
    ReportSettings printInvoice(Invoice invoice, boolean toAttach) throws AxelorException;

    /**
     * Print a list of invoices in the same output.
     *
     * @param ids ids of the invoice.
     * @return the link to the generated file.
     * @throws IOException
     */
    String printInvoices(List<Long> ids) throws IOException;


    /**
     * Print an invoice.
     *
     * @param invoice an invoice.
     * @return a file with the invoice as PDF.
     */
    File getPrintedInvoice(Invoice invoice) throws AxelorException;
}
