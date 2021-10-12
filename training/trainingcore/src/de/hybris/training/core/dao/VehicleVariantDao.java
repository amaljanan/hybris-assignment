package de.hybris.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import de.hybris.training.core.model.AccessoriesVehicleVariantProductModel;

import java.util.List;

public interface VehicleVariantDao extends Dao {
    List<AccessoriesVehicleVariantProductModel> getVehicleVariants();
}
