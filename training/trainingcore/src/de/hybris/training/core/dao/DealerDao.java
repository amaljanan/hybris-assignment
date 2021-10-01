package de.hybris.training.core.dao;

import de.hybris.platform.servicelayer.internal.dao.Dao;
import de.hybris.training.core.model.DealerModel;

import java.util.List;

public interface DealerDao extends Dao {

    List<DealerModel> getDealersDetailsById();

}
