package org.training.v2.controller;



import de.hybris.platform.commercewebservicescommons.dto.vehicleAccessories.VehicleAccessoriesDetailsWsDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.training.facades.product.data.VehicleAccessoriesDataList;
import de.hybris.training.facades.vehicleAccessories.VehicleAccessoriesFacade;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import org.apache.log4j.Logger;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/{baseSiteId}")
@Api(tags = "Vehicle Accessories")
public class VehicleAccessoriesController extends BaseCommerceController{

    private static final Logger LOGGER = Logger.getLogger(VehicleAccessoriesController.class);
    @Resource(name = "vehicleAccessoriesFacade")
    private VehicleAccessoriesFacade vehicleAccessoriesFacade;

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "/getAllVehicleAccessories", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getAllVehicleAccessories", value = "Get accessories details", notes = "Return base produc of vehicle accessories"
            , authorizations = { @Authorization(value = "oauth2_client_credentials") })
    @ApiBaseSiteIdParam
    public VehicleAccessoriesDetailsWsDTO getVehicleAccessories(@ApiParam(value = "Response Configuration. This is the list of fields that should be returned to the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                                    @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields){
        final VehicleAccessoriesDataList vehicleAccessoriesDataList = new VehicleAccessoriesDataList();
        vehicleAccessoriesDataList.setAccessories(vehicleAccessoriesFacade.getVehicleAccessories());
        return getDataMapper().map(vehicleAccessoriesDataList, VehicleAccessoriesDetailsWsDTO.class, fields);

    }


}
