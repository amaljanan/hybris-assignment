package de.hybris.training.facades.vehicleAccessories.vehicleVariant.Impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.AccessoriesVehicleVariantProductModel;
import de.hybris.training.core.services.VehicleVariantService;
import de.hybris.training.facades.product.data.AccessoriesVehicleVariantData;
import de.hybris.training.facades.vehicleAccessories.vehicleVariant.VehicleVariantFacade;

import java.util.List;

public class VehicleVariantFacadeImpl implements VehicleVariantFacade {

    private VehicleVariantService vehicleVariantService;
    private Converter<AccessoriesVehicleVariantProductModel, AccessoriesVehicleVariantData> vehicleVariantConverter;

    @Override
    public List<AccessoriesVehicleVariantData> getVehicleVariants() {
        final List<AccessoriesVehicleVariantProductModel> accessoriesVehicleVariantProductModel = getVehicleVariantService().getVehicleVariants();
        return Converters.convertAll(accessoriesVehicleVariantProductModel, getVehicleVariantConverter());
    }

    public VehicleVariantService getVehicleVariantService() {
        return vehicleVariantService;
    }

    public void setVehicleVariantService(VehicleVariantService vehicleVariantService) {
        this.vehicleVariantService = vehicleVariantService;
    }

    public Converter<AccessoriesVehicleVariantProductModel, AccessoriesVehicleVariantData> getVehicleVariantConverter() {
        return vehicleVariantConverter;
    }

    public void setVehicleVariantConverter(Converter<AccessoriesVehicleVariantProductModel, AccessoriesVehicleVariantData> vehicleVariantConverter) {
        this.vehicleVariantConverter = vehicleVariantConverter;
    }
}
