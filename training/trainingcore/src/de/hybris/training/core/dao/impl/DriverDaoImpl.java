package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.DriverDao;
import de.hybris.training.core.model.DriverModel;

import java.util.Collections;
import java.util.List;

public class DriverDaoImpl extends AbstractItemDao implements DriverDao {

    private static final String DRIVERS_QUERY = "SELECT {" + DriverModel.PK+ "} FROM {" + DriverModel._TYPECODE + "}";

    @Override
    public List<DriverModel> getDriverDetails() {

        final SearchResult<DriverModel> drivers = getFlexibleSearchService().search(DRIVERS_QUERY);
        return drivers.getResult() == null? Collections.emptyList() : drivers.getResult();
    }
}
