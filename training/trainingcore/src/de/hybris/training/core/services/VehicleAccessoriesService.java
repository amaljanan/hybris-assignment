package de.hybris.training.core.services;

import de.hybris.training.core.dao.VehicleAccessoriesDao;
import de.hybris.training.core.model.VehicleAccessoriesModel;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.List;

public class VehicleAccessoriesService {

    private static final Logger LOG = Logger.getLogger(VehicleAccessoriesService.class);
    @Resource
    private final VehicleAccessoriesDao vehicleAccessoriesDao;

    public VehicleAccessoriesService(VehicleAccessoriesDao vehicleAccessoriesDao) {
        this.vehicleAccessoriesDao = vehicleAccessoriesDao;
    }

    public List<VehicleAccessoriesModel> getVehicleAccessories(){
        final List<VehicleAccessoriesModel> accessories = vehicleAccessoriesDao.getVehicleAccessories();
        accessories.forEach(accessory -> LOG.info(getRecordToPrint(accessory)));
        return accessories;
    }

    private Object getRecordToPrint(final VehicleAccessoriesModel vehicleAccessoriesModel) {
        return vehicleAccessoriesModel.getCode() + "--" + vehicleAccessoriesModel.getName() + "--" + vehicleAccessoriesModel.getMaterial();
    }

}
