package de.hybris.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.training.core.model.AccessoriesColorVariantProductModel;
import de.hybris.training.core.model.AccessoriesVehicleVariantProductModel;
import de.hybris.training.core.model.VehicleAccessoriesModel;
import org.springframework.beans.factory.annotation.Required;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SupportedVehicleNameProvider implements FieldValueProvider, Serializable {

    private FieldNameProvider fieldNameProvider;

    @Override
    public Collection<FieldValue> getFieldValues(IndexConfig indexConfig, IndexedProperty indexedProperty, Object model) throws FieldValueProviderException {

        if (model instanceof AccessoriesColorVariantProductModel) {
            final AccessoriesColorVariantProductModel accessoriesColorVariantProductModel = (AccessoriesColorVariantProductModel) model;
            final Collection<FieldValue> fieldValues = new ArrayList<FieldValue>();
            fieldValues.addAll(createFieldValue(accessoriesColorVariantProductModel, indexedProperty));
            return fieldValues;
        }
        throw new FieldValueProviderException("Item is not of Product Instance");
    }

    private List<FieldValue> createFieldValue(AccessoriesColorVariantProductModel accessories, IndexedProperty indexedProperty) {

        final List<FieldValue> fieldValues = new ArrayList<FieldValue>();
        final String vehicleModelName = getvehicleModelName(accessories);
        if (vehicleModelName != null) {
            addFieldValues(fieldValues, indexedProperty, vehicleModelName);
        }
        return fieldValues;
    }

    protected void addFieldValues(final List<FieldValue> fieldValues, final IndexedProperty indexedProperty, final Object value) {
        final Collection<String> fieldNames = fieldNameProvider.getFieldNames(indexedProperty, null);
        for (final String fieldName : fieldNames) {
            fieldValues.add(new FieldValue(fieldName, value));
        }
    }

    private String getvehicleModelName(AccessoriesColorVariantProductModel accessories) {

        final ProductModel baseProduct = accessories.getBaseProduct();

        if (baseProduct instanceof AccessoriesVehicleVariantProductModel) {
            String vehicleModelName = ((AccessoriesVehicleVariantProductModel) baseProduct).getSupportedVehicle();
            return vehicleModelName;
        } else if (baseProduct instanceof VehicleAccessoriesModel) {
            String vehicleModelName = "Supports all vehicle";
            return vehicleModelName;
        }
        return "";
    }

    @Required
    public void setFieldNameProvider(final FieldNameProvider fieldNameProvider) {
        this.fieldNameProvider = fieldNameProvider;
    }

}
