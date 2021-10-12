package de.hybris.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import de.hybris.training.core.model.VehicleAccessoriesModel;

import java.util.List;

public interface VehicleAccessoriesDao extends Dao {
    List<VehicleAccessoriesModel> getVehicleAccessories();
}
