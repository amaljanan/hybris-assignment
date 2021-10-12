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
import de.hybris.platform.jalo.product.Product;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product VehicleAccessories}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleAccessories extends Product
{
	/** Qualifier of the <code>VehicleAccessories.material</code> attribute **/
	public static final String MATERIAL = "material";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MATERIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessories.material</code> attribute.
	 * @return the material
	 */
	public String getMaterial(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleAccessories.getMaterial requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MATERIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessories.material</code> attribute.
	 * @return the material
	 */
	public String getMaterial()
	{
		return getMaterial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessories.material</code> attribute. 
	 * @return the localized material
	 */
	public Map<Language,String> getAllMaterial(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MATERIAL,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessories.material</code> attribute. 
	 * @return the localized material
	 */
	public Map<Language,String> getAllMaterial()
	{
		return getAllMaterial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessories.material</code> attribute. 
	 * @param value the material
	 */
	public void setMaterial(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleAccessories.setMaterial requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MATERIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessories.material</code> attribute. 
	 * @param value the material
	 */
	public void setMaterial(final String value)
	{
		setMaterial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessories.material</code> attribute. 
	 * @param value the material
	 */
	public void setAllMaterial(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MATERIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessories.material</code> attribute. 
	 * @param value the material
	 */
	public void setAllMaterial(final Map<Language,String> value)
	{
		setAllMaterial( getSession().getSessionContext(), value );
	}
	
}
