package de.hybris.training.core.services;


import de.hybris.training.core.dao.DriverDao;
import de.hybris.training.core.model.DriverModel;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.List;


public class DriverService {

    private static final Logger LOG = Logger.getLogger(DriverService.class);
    @Resource
    private DriverDao driverDao;

    public DriverService(DriverDao driverDao) {
        this.driverDao = driverDao;
    }

    public List<DriverModel> getDriverDetails() {

        final List<DriverModel> driverModels = driverDao.getDriverDetails();
        driverModels.forEach(driverModel -> LOG.info(getRecordToPrint(driverModel)));

        return driverModels;
    }

    private Object getRecordToPrint(final DriverModel driverModel) {
        return driverModel.getDriverId() + "--" + driverModel.getDriverName() + "--" + driverModel.getExperience();
    }

}
