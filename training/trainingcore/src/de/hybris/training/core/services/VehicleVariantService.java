package de.hybris.training.core.services;

import de.hybris.training.core.dao.VehicleVariantDao;
import de.hybris.training.core.model.AccessoriesVehicleVariantProductModel;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.List;

public class VehicleVariantService {
    private static final Logger LOG = Logger.getLogger(VehicleVariantService.class);
    @Resource
    private final VehicleVariantDao vehicleVariantDao;

    public VehicleVariantService(VehicleVariantDao vehicleVariantDao) {
        this.vehicleVariantDao = vehicleVariantDao;
    }

    public List<AccessoriesVehicleVariantProductModel> getVehicleVariants() {
        final List<AccessoriesVehicleVariantProductModel> vehicleVariants = vehicleVariantDao.getVehicleVariants();
        vehicleVariants.forEach(variants -> LOG.info(getRecordToPrint(variants)));
        return vehicleVariants;
    }

    private Object getRecordToPrint(final AccessoriesVehicleVariantProductModel accessoriesVehicleVariantProductModel) {
        return accessoriesVehicleVariantProductModel.getCode() + "--" + accessoriesVehicleVariantProductModel.getName() + "--" + accessoriesVehicleVariantProductModel.getSupportedVehicle();
    }
}
