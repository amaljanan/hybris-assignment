/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 12-Oct-2021, 2:17:40 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.variants.jalo.VariantProduct;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct AccessoriesVehicleVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedAccessoriesVehicleVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>AccessoriesVehicleVariantProduct.supportedVehicle</code> attribute **/
	public static final String SUPPORTEDVEHICLE = "supportedVehicle";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUPPORTEDVEHICLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccessoriesVehicleVariantProduct.supportedVehicle</code> attribute.
	 * @return the supportedVehicle - Supported Vehicle.
	 */
	public String getSupportedVehicle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAccessoriesVehicleVariantProduct.getSupportedVehicle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SUPPORTEDVEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccessoriesVehicleVariantProduct.supportedVehicle</code> attribute.
	 * @return the supportedVehicle - Supported Vehicle.
	 */
	public String getSupportedVehicle()
	{
		return getSupportedVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccessoriesVehicleVariantProduct.supportedVehicle</code> attribute. 
	 * @return the localized supportedVehicle - Supported Vehicle.
	 */
	public Map<Language,String> getAllSupportedVehicle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SUPPORTEDVEHICLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccessoriesVehicleVariantProduct.supportedVehicle</code> attribute. 
	 * @return the localized supportedVehicle - Supported Vehicle.
	 */
	public Map<Language,String> getAllSupportedVehicle()
	{
		return getAllSupportedVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccessoriesVehicleVariantProduct.supportedVehicle</code> attribute. 
	 * @param value the supportedVehicle - Supported Vehicle.
	 */
	public void setSupportedVehicle(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAccessoriesVehicleVariantProduct.setSupportedVehicle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SUPPORTEDVEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccessoriesVehicleVariantProduct.supportedVehicle</code> attribute. 
	 * @param value the supportedVehicle - Supported Vehicle.
	 */
	public void setSupportedVehicle(final String value)
	{
		setSupportedVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccessoriesVehicleVariantProduct.supportedVehicle</code> attribute. 
	 * @param value the supportedVehicle - Supported Vehicle.
	 */
	public void setAllSupportedVehicle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SUPPORTEDVEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccessoriesVehicleVariantProduct.supportedVehicle</code> attribute. 
	 * @param value the supportedVehicle - Supported Vehicle.
	 */
	public void setAllSupportedVehicle(final Map<Language,String> value)
	{
		setAllSupportedVehicle( getSession().getSessionContext(), value );
	}
	
}
