package de.hybris.training.core.job;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.training.core.dao.ProductListResultDao;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.logging.Logger;


public class ProductListJobPerformable extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(String.valueOf(ProductListJobPerformable.class));

    private ProductListResultDao productListResultDao;


    public ProductListJobPerformable(ProductListResultDao productListResultDao) {
        this.productListResultDao = productListResultDao;
    }

    @Override
    public PerformResult perform(final CronJobModel cronJob) {

        final SearchResult<ProductModel> searchResult = productListResultDao.findProductsByFirstLetter();

        LOG.info("Printing All Products starting with 1");
        for (int i = 0; i < searchResult.getTotalCount(); i++) {

            if (clearAbortRequestedIfNeeded(cronJob)) {
                LOG.info("Aborting the ProductList CronJob");
                return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
            }
            printProductCodes(searchResult.getResult().get(i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // searchResult.getResult().stream().forEach(this::printProductCodes);

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    protected void printProductCodes(final ProductModel productModel) {
        LOG.info(productModel.getCode() + " " + productModel.getName());
    }

    @Override
    public boolean isAbortable() {
        return true;
    }
}
