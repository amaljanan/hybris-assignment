package de.hybris.training.facades.vehicleAccessories.Impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.VehicleAccessoriesModel;
import de.hybris.training.core.services.VehicleAccessoriesService;
import de.hybris.training.facades.product.data.VehicleAccessoriesData;
import de.hybris.training.facades.vehicleAccessories.VehicleAccessoriesFacade;

import java.util.List;

public class VehicleAccessoriesFacadeImpl implements VehicleAccessoriesFacade {

    private VehicleAccessoriesService vehicleAccessoriesService;
    private Converter<VehicleAccessoriesModel, VehicleAccessoriesData> accessoriesConverter;

    @Override
    public List<VehicleAccessoriesData> getVehicleAccessories() {

        final List<VehicleAccessoriesModel> vehicleAccessoriesModel = getVehicleAccessoriesService().getVehicleAccessories();
        return Converters.convertAll(vehicleAccessoriesModel, getAccessoriesConverter());

    }

    public VehicleAccessoriesService getVehicleAccessoriesService() {
        return vehicleAccessoriesService;
    }

    public void setVehicleAccessoriesService(VehicleAccessoriesService vehicleAccessoriesService) {
        this.vehicleAccessoriesService = vehicleAccessoriesService;
    }

    public Converter<VehicleAccessoriesModel, VehicleAccessoriesData> getAccessoriesConverter() {
        return accessoriesConverter;
    }

    public void setAccessoriesConverter(Converter<VehicleAccessoriesModel, VehicleAccessoriesData> accessoriesConverter) {
        this.accessoriesConverter = accessoriesConverter;
    }
}
