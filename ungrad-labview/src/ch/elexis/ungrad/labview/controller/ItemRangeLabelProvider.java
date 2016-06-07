/*******************************************************************************
 * Copyright (c) 2016 by G. Weirich
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 * G. Weirich - initial implementation
 *********************************************************************************/
package ch.elexis.ungrad.labview.controller;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;

import ch.elexis.core.types.Gender;
import ch.elexis.data.Patient;
import ch.elexis.ungrad.labview.model.Item;
import ch.elexis.ungrad.labview.model.LabResultsRow;

/**
 * LabelProvider for the norm-Range column
 * @author gerry
 *
 */
public class ItemRangeLabelProvider extends CellLabelProvider {

	@Override
	public void update(ViewerCell cell) {
		LabResultsRow results=(LabResultsRow) cell.getElement();
		Item item=results.getItem();
		Patient pat=results.getPatient();
		if(pat.getGender()==Gender.FEMALE){
			cell.setText(item.refFrauOrTx);
		}else{
			cell.setText(item.refMann);
		}
	}

}