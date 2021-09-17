package de.hybris.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.training.core.model.DealerModel;
import de.hybris.training.core.model.VehicleModel;
import org.springframework.beans.factory.annotation.Required;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class DealerNameProvider implements FieldValueProvider, Serializable {

    private FieldNameProvider fieldNameProvider;

    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {

        if(model instanceof VehicleModel)
        {
            final VehicleModel vehicleModel = (VehicleModel) model;
            final Collection<FieldValue> fieldValues = new ArrayList<FieldValue>();
            fieldValues.addAll(createFieldValue(vehicleModel, indexedProperty));
            return fieldValues;
        }

        throw new FieldValueProviderException("Item is not of Product Instance");

    }

    private List<FieldValue> createFieldValue(VehicleModel vehicle, IndexedProperty indexedProperty) {

        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();

        //final Collection<DealerModel> dealers = vehicle.getDealers();
        final String dealerName = getDealerName(vehicle);


        if (dealerName!= null)
        {
            addFieldValues(fieldValues, indexedProperty, dealerName);
        }

        return fieldValues;
    }

    protected void addFieldValues(final List<FieldValue> fieldValues, final IndexedProperty indexedProperty, final Object value)
    {
        final Collection<String> fieldNames = fieldNameProvider.getFieldNames(indexedProperty,null);
        for(final String fieldName : fieldNames)
        {
            fieldValues.add(new FieldValue(fieldName, value));
        }
    }

    private String getDealerName(VehicleModel vehicle) {

        final Collection<DealerModel> dealers = vehicle.getDealers();

        String dealerName = "";

        for (final DealerModel dealer : dealers)
        {
            dealerName = dealer.getDealerName();
        }
        return dealerName;

    }

/*    protected FieldNameProvider getFieldNameProvider()
    {
        return fieldNameProvider;
    }*/

    @Required
    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
    {
        this.fieldNameProvider = fieldNameProvider;
    }




}
