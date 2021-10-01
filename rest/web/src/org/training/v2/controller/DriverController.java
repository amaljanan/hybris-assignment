package org.training.v2.controller;


import de.hybris.platform.commercewebservicescommons.dto.drivers.DriversDetailsWsDTO;
import de.hybris.training.facades.drivers.DriversFacade;
import de.hybris.training.facades.product.data.DriversDataList;
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
@Api(tags = "Training Driver")
public class DriverController extends BaseCommerceController {

    private static final Logger LOGGER = Logger.getLogger(DriverController.class);

    @Resource(name = "driversFacade")
    private DriversFacade driversFacade;

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "getAllDrivers", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getDriverDetails", value = "Get drivers details", notes = "Return details of all drivers"
            , authorizations = { @Authorization(value = "oauth2_client_credentials") })
    public DriversDetailsWsDTO getDealersDetails(
                                                 @ApiParam(value = "Response Configuration. This is the list of fields that should be returned to the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                 @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields)
    {
        final DriversDataList driversDataList = new DriversDataList();
        driversDataList.setDrivers(driversFacade.getDriverDetails());
        return getDataMapper().map(driversDataList, DriversDetailsWsDTO.class, fields);
    }
}
