/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 08-Oct-2021, 1:41:59 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.VehicleAccessories;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SupportedVehicles}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSupportedVehicles extends GenericItem
{
	/** Qualifier of the <code>SupportedVehicles.vehicleModel</code> attribute **/
	public static final String VEHICLEMODEL = "vehicleModel";
	/** Qualifier of the <code>SupportedVehicles.engineType</code> attribute **/
	public static final String ENGINETYPE = "engineType";
	/** Qualifier of the <code>SupportedVehicles.vehicleAccessories</code> attribute **/
	public static final String VEHICLEACCESSORIES = "vehicleAccessories";
	/** Relation ordering override parameter constants for AccessoriesToVehicles from ((trainingcore))*/
	protected static String ACCESSORIESTOVEHICLES_SRC_ORDERED = "relation.AccessoriesToVehicles.source.ordered";
	protected static String ACCESSORIESTOVEHICLES_TGT_ORDERED = "relation.AccessoriesToVehicles.target.ordered";
	/** Relation disable markmodifed parameter constants for AccessoriesToVehicles from ((trainingcore))*/
	protected static String ACCESSORIESTOVEHICLES_MARKMODIFIED = "relation.AccessoriesToVehicles.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VEHICLEMODEL, AttributeMode.INITIAL);
		tmp.put(ENGINETYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicles.engineType</code> attribute.
	 * @return the engineType
	 */
	public EnumerationValue getEngineType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENGINETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicles.engineType</code> attribute.
	 * @return the engineType
	 */
	public EnumerationValue getEngineType()
	{
		return getEngineType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicles.engineType</code> attribute. 
	 * @param value the engineType
	 */
	public void setEngineType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENGINETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicles.engineType</code> attribute. 
	 * @param value the engineType
	 */
	public void setEngineType(final EnumerationValue value)
	{
		setEngineType( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("VehicleAccessories");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(ACCESSORIESTOVEHICLES_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicles.vehicleAccessories</code> attribute.
	 * @return the vehicleAccessories
	 */
	public Collection<VehicleAccessories> getVehicleAccessories(final SessionContext ctx)
	{
		final List<VehicleAccessories> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLES,
			"VehicleAccessories",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicles.vehicleAccessories</code> attribute.
	 * @return the vehicleAccessories
	 */
	public Collection<VehicleAccessories> getVehicleAccessories()
	{
		return getVehicleAccessories( getSession().getSessionContext() );
	}
	
	public long getVehicleAccessoriesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLES,
			"VehicleAccessories",
			null
		);
	}
	
	public long getVehicleAccessoriesCount()
	{
		return getVehicleAccessoriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicles.vehicleAccessories</code> attribute. 
	 * @param value the vehicleAccessories
	 */
	public void setVehicleAccessories(final SessionContext ctx, final Collection<VehicleAccessories> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCESSORIESTOVEHICLES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicles.vehicleAccessories</code> attribute. 
	 * @param value the vehicleAccessories
	 */
	public void setVehicleAccessories(final Collection<VehicleAccessories> value)
	{
		setVehicleAccessories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicleAccessories. 
	 * @param value the item to add to vehicleAccessories
	 */
	public void addToVehicleAccessories(final SessionContext ctx, final VehicleAccessories value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCESSORIESTOVEHICLES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicleAccessories. 
	 * @param value the item to add to vehicleAccessories
	 */
	public void addToVehicleAccessories(final VehicleAccessories value)
	{
		addToVehicleAccessories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicleAccessories. 
	 * @param value the item to remove from vehicleAccessories
	 */
	public void removeFromVehicleAccessories(final SessionContext ctx, final VehicleAccessories value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCESSORIESTOVEHICLES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicleAccessories. 
	 * @param value the item to remove from vehicleAccessories
	 */
	public void removeFromVehicleAccessories(final VehicleAccessories value)
	{
		removeFromVehicleAccessories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicles.vehicleModel</code> attribute.
	 * @return the vehicleModel
	 */
	public String getVehicleModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VEHICLEMODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicles.vehicleModel</code> attribute.
	 * @return the vehicleModel
	 */
	public String getVehicleModel()
	{
		return getVehicleModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicles.vehicleModel</code> attribute. 
	 * @param value the vehicleModel
	 */
	public void setVehicleModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VEHICLEMODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicles.vehicleModel</code> attribute. 
	 * @param value the vehicleModel
	 */
	public void setVehicleModel(final String value)
	{
		setVehicleModel( getSession().getSessionContext(), value );
	}
	
}
