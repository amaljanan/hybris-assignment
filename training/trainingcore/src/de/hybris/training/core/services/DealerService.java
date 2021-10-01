package de.hybris.training.core.services;

import de.hybris.training.core.dao.DealerDao;
import de.hybris.training.core.model.DealerModel;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.List;

public class DealerService {

    private static final Logger LOG = Logger.getLogger(DealerService.class);
    @Resource
    private DealerDao dealerDao;

    public DealerService(DealerDao dealerDao) {
        this.dealerDao = dealerDao;
    }

    public List<DealerModel> getDealerDetails() {

        final List<DealerModel> dealerModels = dealerDao.getDealersDetailsById();
        dealerModels.forEach(dealerModel -> LOG.info(getRecordToPrint(dealerModel)));

        return dealerModels;
    }

    private Object getRecordToPrint(final DealerModel dealerModel) {
        return dealerModel.getDealerId() + "--" + dealerModel.getDealerName();
    }


}
