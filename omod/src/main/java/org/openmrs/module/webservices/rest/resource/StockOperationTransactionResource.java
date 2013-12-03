/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webservices.rest.resource;

import org.openmrs.module.openhmis.commons.api.entity.IObjectDataService;
import org.openmrs.module.openhmis.inventory.api.model.StockOperationTransaction;
import org.openmrs.module.openhmis.inventory.web.ModuleRestConstants;
import org.openmrs.module.webservices.rest.web.annotation.Resource;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;

@Resource(name = ModuleRestConstants.OPERATION_TRANSACTION_RESOURCE, supportedClass=StockOperationTransaction.class, supportedOpenmrsVersions={"1.9"})
public class StockOperationTransactionResource extends BaseRestObjectResource<StockOperationTransaction> {
	@Override
	public StockOperationTransaction newDelegate() {
		return new StockOperationTransaction();
	}

	@Override
	public Class<? extends IObjectDataService<StockOperationTransaction>> getServiceClass() {
		return null;
	}

	@Override
	protected DelegatingResourceDescription getDefaultRepresentationDescription() {
		DelegatingResourceDescription description = super.getDefaultRepresentationDescription();

		description.addProperty("operation", Representation.DEFAULT);
		description.addProperty("item", Representation.DEFAULT);
		description.addProperty("quantity", Representation.DEFAULT);
		description.addProperty("expiration", Representation.DEFAULT);
		description.addProperty("creator", Representation.DEFAULT);
		description.addProperty("dateCreated", Representation.DEFAULT);
		description.addProperty("stockroom", Representation.DEFAULT);
		description.addProperty("patient", Representation.DEFAULT);

		return description;
	}
}

