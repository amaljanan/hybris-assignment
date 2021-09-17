package de.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;

public class VehiclePopulator extends SearchResultVariantProductPopulator {

    @Override
    public void populate(SearchResultValueData source, ProductData target){

        super.populate(source, target);
        target.setRegistrationNumber(this.<String> getValue(source, "registrationNumber"));
        target.setDealerName(this.<String> getValue(source, "dealerName"));
        target.setDriverName(this.<String> getValue(source, "driverName"));

    }

}
