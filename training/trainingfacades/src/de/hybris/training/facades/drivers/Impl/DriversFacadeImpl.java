package de.hybris.training.facades.drivers.Impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.DriverModel;
import de.hybris.training.core.services.DriverService;
import de.hybris.training.facades.drivers.DriversFacade;
import de.hybris.training.facades.product.data.DriverData;

import java.util.List;

public class DriversFacadeImpl implements DriversFacade {

    private DriverService driverService;
    private Converter<DriverModel, DriverData> driverConverter;

    @Override
    public List<DriverData> getDriverDetails() {

        final List<DriverModel> driverModel = getDriverService().getDriverDetails();

        return Converters.convertAll(driverModel, getDriverConverter());
    }

    public DriverService getDriverService() {
        return driverService;
    }

    public void setDriverService(DriverService driverService) {
        this.driverService = driverService;
    }

    public Converter<DriverModel, DriverData> getDriverConverter() {
        return driverConverter;
    }

    public void setDriverConverter(Converter<DriverModel, DriverData> driverConverter) {
        this.driverConverter = driverConverter;
    }
}
