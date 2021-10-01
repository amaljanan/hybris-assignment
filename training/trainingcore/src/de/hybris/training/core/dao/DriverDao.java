package de.hybris.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import de.hybris.training.core.model.DriverModel;

import java.util.List;

public interface DriverDao extends Dao {
    List<DriverModel> getDriverDetails();
}
