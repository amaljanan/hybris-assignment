package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.VehicleAccessoriesModel;
import de.hybris.training.facades.product.data.VehicleAccessoriesData;

public class AccessoriesPopulator implements Populator<VehicleAccessoriesModel, VehicleAccessoriesData> {

    @Override
    public void populate(final VehicleAccessoriesModel source, final VehicleAccessoriesData target) throws ConversionException {

       target.setCode(source.getCode());
       target.setName(source.getName());
       target.setMaterial(source.getMaterial());

    }
}
