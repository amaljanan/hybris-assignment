package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.VehicleVariantDao;
import de.hybris.training.core.model.AccessoriesVehicleVariantProductModel;

import java.util.Collections;
import java.util.List;

public class VehicleVariantDaoImpl extends AbstractItemDao implements VehicleVariantDao {

    private static final String QUERY = "SELECT {" + AccessoriesVehicleVariantProductModel.PK + "} FROM {" + AccessoriesVehicleVariantProductModel._TYPECODE + "}";

    @Override
    public List<AccessoriesVehicleVariantProductModel> getVehicleVariants() {
        final SearchResult<AccessoriesVehicleVariantProductModel> vehicleVariant = getFlexibleSearchService().search(QUERY);
        return vehicleVariant.getResult() == null ? Collections.emptyList() : vehicleVariant.getResult();

    }
}
