package de.hybris.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

public class AbortableCronJobExample extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(AbortableCronJobExample.class);
    @Override
    public PerformResult perform(CronJobModel cronJobModel) {

        for(int i=0;i<100;i++)
        {
            try {
                LOG.info("Printing 0 to 100 :" + i);
                Thread.sleep(500);
                if(clearAbortRequestedIfNeeded(cronJobModel))
                {
                    return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
                }
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    @Override
    public boolean isAbortable() {
        return true;
    }
}
