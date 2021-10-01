package de.hybris.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.facades.product.data.DealerData;

public class DealerDataPopulator implements Populator<DealerModel, DealerData> {

    @Override
    public void populate(final DealerModel source, final DealerData target) throws ConversionException {

        target.setDealerId(source.getDealerId());
        target.setDealerName(source.getDealerName());
    }
}
