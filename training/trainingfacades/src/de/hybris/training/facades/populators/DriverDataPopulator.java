package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.DriverModel;
import de.hybris.training.facades.product.data.DriverData;

public class DriverDataPopulator implements Populator<DriverModel, DriverData> {

    @Override
    public void populate(final DriverModel source, final DriverData target) throws ConversionException {

        target.setDriverId(source.getDriverId());
        target.setDriverName(source.getDriverName());
        target.setExperience(source.getExperience());

    }
}
