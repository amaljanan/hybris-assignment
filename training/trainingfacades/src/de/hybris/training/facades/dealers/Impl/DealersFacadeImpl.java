package de.hybris.training.facades.dealers.Impl;


import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.services.DealerService;
import de.hybris.training.facades.dealers.DealersFacade;
import de.hybris.training.facades.product.data.DealerData;

import java.util.List;

public class DealersFacadeImpl implements DealersFacade {

    private DealerService dealerService;
    private Converter<DealerModel, DealerData> dealerConverter;

    @Override
    public List<DealerData> getDealerDetails() {

        final List<DealerModel> dealerModel = getDealerService().getDealerDetails();

        return Converters.convertAll(dealerModel, getDealerConverter());
    }

    public DealerService getDealerService() {
        return dealerService;
    }

    public void setDealerService(DealerService dealerService) {
        this.dealerService = dealerService;
    }

    public Converter<DealerModel, DealerData> getDealerConverter() {
        return dealerConverter;
    }

    public void setDealerConverter(Converter<DealerModel, DealerData> dealerConverter) {
        this.dealerConverter = dealerConverter;
    }
}
