package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.VehicleAccessoriesDao;
import de.hybris.training.core.model.VehicleAccessoriesModel;

import java.util.Collections;
import java.util.List;

public class VehicleAccessoriesDaoImpl extends AbstractItemDao implements VehicleAccessoriesDao {

    private static final String QUERY = "SELECT {" + VehicleAccessoriesModel.PK + "} FROM {" + VehicleAccessoriesModel._TYPECODE + "}";

    @Override
    public List<VehicleAccessoriesModel> getVehicleAccessories() {

        final SearchResult<VehicleAccessoriesModel> vehicleAccessories = getFlexibleSearchService().search(QUERY);
        return vehicleAccessories.getResult() == null ? Collections.emptyList() : vehicleAccessories.getResult();
    }
}
