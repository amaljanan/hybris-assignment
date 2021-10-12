package org.training.v2.controller;//package org.training.v2.controller;

import de.hybris.platform.commercewebservicescommons.dto.vehicleAccessories.VehicleVariantDataListWsDTO;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;
import de.hybris.training.facades.product.data.VehicleVariantDataList;
import de.hybris.training.facades.vehicleAccessories.vehicleVariant.VehicleVariantFacade;
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
@Api(tags = "Accessories vehicle variants")
public class VehicleVariantController extends BaseCommerceController {
    private static final Logger LOGGER = Logger.getLogger(VehicleVariantController.class);
    @Resource(name = "vehicleVariantFacade")
    private VehicleVariantFacade vehicleVariantFacade;

    @Secured("ROLE_TRUSTED_CLIENT")
    @RequestMapping(value = "/getAllVehicleVariants", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(nickname = "getAllVehicleVariants", value = "Get accessories vehicle variants details", notes = "Return vehicle variant of accessories"
            , authorizations = {@Authorization(value = "oauth2_client_credentials")})
    @ApiBaseSiteIdParam
    public VehicleVariantDataListWsDTO getVehicleVariants(@ApiParam(value = "Response Configuration. This is the list of fields that should be returned to the response body", allowableValues = "BASIC,DEFAULT,FULL")
                                                          @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) {
        final VehicleVariantDataList vehicleVariantDataList = new VehicleVariantDataList();
        vehicleVariantDataList.setVehicleVariants(vehicleVariantFacade.getVehicleVariants());
        return getDataMapper().map(vehicleVariantDataList, VehicleVariantDataListWsDTO.class, fields);

    }
}
