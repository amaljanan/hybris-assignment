package de.hybris.training.core.dao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

public interface ProductListResultDao {
    public SearchResult<ProductModel> findProductsByFirstLetter();
}
