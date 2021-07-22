package de.hybris.training.core.dao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.daos.impl.DefaultProductDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.ProductListResultDao;

public class ProductListResultDaoImpl extends DefaultProductDao implements ProductListResultDao {

    public ProductListResultDaoImpl(String typecode) {
        super(typecode);
    }

    @Override
    public SearchResult<ProductModel> findProductsByFirstLetter() {

        final StringBuilder query = new StringBuilder();
        query.append("SELECT {p:").append(ProductModel.PK).append("} ");
        query.append("FROM {").append(ProductModel._TYPECODE).append(" As p ").append("} ");
        query.append("WHERE ").append("{p.code} Like '1%'");

        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());

        return getFlexibleSearchService().search(searchQuery);
    }


}
