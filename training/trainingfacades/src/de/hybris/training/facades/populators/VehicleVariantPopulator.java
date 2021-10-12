package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.AccessoriesVehicleVariantProductModel;
import de.hybris.training.facades.product.data.AccessoriesVehicleVariantData;

public class VehicleVariantPopulator implements Populator<AccessoriesVehicleVariantProductModel, AccessoriesVehicleVariantData> {

    @Override
    public void populate(final AccessoriesVehicleVariantProductModel source, final AccessoriesVehicleVariantData target) throws ConversionException {
        target.setCode(source.getCode());
        target.setName(source.getName());
        target.setSupportedVehicle(source.getSupportedVehicle());
    }
}
