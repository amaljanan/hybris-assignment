package de.hybris.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import de.hybris.training.core.dao.DealerDao;
import de.hybris.training.core.model.DealerModel;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DealerDaoImpl extends AbstractItemDao implements DealerDao {

    private static final String DEALERS_QUERY = "SELECT {" + DealerModel.PK+ "} FROM {" + DealerModel._TYPECODE + "}";


    @Override
    public List<DealerModel> getDealersDetailsById() {

//        ServicesUtil.validateParameterNotNull(dealerId, "dealerId must not be null");
//        final Map<String, Object> params = new HashMap<>();
//        params.put("dealerId",dealerId);

        final SearchResult<DealerModel> dealers = getFlexibleSearchService().search( DEALERS_QUERY);
        return dealers.getResult() == null? Collections.emptyList() : dealers.getResult();
        
    }
}
