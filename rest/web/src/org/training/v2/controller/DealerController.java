package org.training.v2.controller;


import de.hybris.platform.commercewebservicescommons.dto.dealers.DealersDetailsWsDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.training.facades.dealers.DealersFacade;
import de.hybris.training.facades.product.data.DealersDataList;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
//@RequestMapping(value = "/{baseSiteId}")
@RequestMapping(value = "/")
@Api(tags = "Training Dealer")
public class DealerController extends BaseCommerceController {

    private static final Logger LOGGER = Logger.getLogger(DealerController.class);

    @Resource(name = "dealersFacade")
    private DealersFacade dealersFacade;

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "getAllDealers", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getDealerDetails", value = "Get a dealer details", notes = "Return details of a specific dealer"
            , authorizations = {@Authorization(value = "oauth2_client_credentials")})
    public DealersDetailsWsDTO getDealersDetails(@ApiParam(value = "Response Configuration. This is the list of fields that should be returned to the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                 @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) {

        final DealersDataList dealersDataList = new DealersDataList();
        dealersDataList.setDealers(dealersFacade.getDealerDetails());
        return getDataMapper().map(dealersDataList, DealersDetailsWsDTO.class, fields);
    }
}
