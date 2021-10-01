/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-Sep-2021, 10:36:38 AM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.Dealer;
import de.hybris.training.core.jalo.Driver;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Vehicle}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicle extends Product
{
	/** Qualifier of the <code>Vehicle.registrationNumber</code> attribute **/
	public static final String REGISTRATIONNUMBER = "registrationNumber";
	/** Qualifier of the <code>Vehicle.dealers</code> attribute **/
	public static final String DEALERS = "dealers";
	/** Relation ordering override parameter constants for DealerToVehicle from ((trainingcore))*/
	protected static String DEALERTOVEHICLE_SRC_ORDERED = "relation.DealerToVehicle.source.ordered";
	protected static String DEALERTOVEHICLE_TGT_ORDERED = "relation.DealerToVehicle.target.ordered";
	/** Relation disable markmodifed parameter constants for DealerToVehicle from ((trainingcore))*/
	protected static String DEALERTOVEHICLE_MARKMODIFIED = "relation.DealerToVehicle.markmodified";
	/** Qualifier of the <code>Vehicle.driver</code> attribute **/
	public static final String DRIVER = "driver";
	/** Relation ordering override parameter constants for DriverToVehicle from ((trainingcore))*/
	protected static String DRIVERTOVEHICLE_SRC_ORDERED = "relation.DriverToVehicle.source.ordered";
	protected static String DRIVERTOVEHICLE_TGT_ORDERED = "relation.DriverToVehicle.target.ordered";
	/** Relation disable markmodifed parameter constants for DriverToVehicle from ((trainingcore))*/
	protected static String DRIVERTOVEHICLE_MARKMODIFIED = "relation.DriverToVehicle.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REGISTRATIONNUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.dealers</code> attribute.
	 * @return the dealers
	 */
	public Collection<Dealer> getDealers(final SessionContext ctx)
	{
		final List<Dealer> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALERTOVEHICLE,
			"Dealer",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.dealers</code> attribute.
	 * @return the dealers
	 */
	public Collection<Dealer> getDealers()
	{
		return getDealers( getSession().getSessionContext() );
	}
	
	public long getDealersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALERTOVEHICLE,
			"Dealer",
			null
		);
	}
	
	public long getDealersCount()
	{
		return getDealersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.dealers</code> attribute. 
	 * @param value the dealers
	 */
	public void setDealers(final SessionContext ctx, final Collection<Dealer> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALERTOVEHICLE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALERTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.dealers</code> attribute. 
	 * @param value the dealers
	 */
	public void setDealers(final Collection<Dealer> value)
	{
		setDealers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealers. 
	 * @param value the item to add to dealers
	 */
	public void addToDealers(final SessionContext ctx, final Dealer value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALERTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALERTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealers. 
	 * @param value the item to add to dealers
	 */
	public void addToDealers(final Dealer value)
	{
		addToDealers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealers. 
	 * @param value the item to remove from dealers
	 */
	public void removeFromDealers(final SessionContext ctx, final Dealer value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALERTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALERTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealers. 
	 * @param value the item to remove from dealers
	 */
	public void removeFromDealers(final Dealer value)
	{
		removeFromDealers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.driver</code> attribute.
	 * @return the driver
	 */
	public Collection<Driver> getDriver(final SessionContext ctx)
	{
		final List<Driver> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
			"Driver",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.driver</code> attribute.
	 * @return the driver
	 */
	public Collection<Driver> getDriver()
	{
		return getDriver( getSession().getSessionContext() );
	}
	
	public long getDriverCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
			"Driver",
			null
		);
	}
	
	public long getDriverCount()
	{
		return getDriverCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.driver</code> attribute. 
	 * @param value the driver
	 */
	public void setDriver(final SessionContext ctx, final Collection<Driver> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVERTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.driver</code> attribute. 
	 * @param value the driver
	 */
	public void setDriver(final Collection<Driver> value)
	{
		setDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driver. 
	 * @param value the item to add to driver
	 */
	public void addToDriver(final SessionContext ctx, final Driver value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVERTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driver. 
	 * @param value the item to add to driver
	 */
	public void addToDriver(final Driver value)
	{
		addToDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driver. 
	 * @param value the item to remove from driver
	 */
	public void removeFromDriver(final SessionContext ctx, final Driver value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVERTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driver. 
	 * @param value the item to remove from driver
	 */
	public void removeFromDriver(final Driver value)
	{
		removeFromDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Dealer");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DEALERTOVEHICLE_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Driver");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DRIVERTOVEHICLE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.registrationNumber</code> attribute.
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGISTRATIONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.registrationNumber</code> attribute.
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber()
	{
		return getRegistrationNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.registrationNumber</code> attribute. 
	 * @param value the registrationNumber
	 */
	public void setRegistrationNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGISTRATIONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.registrationNumber</code> attribute. 
	 * @param value the registrationNumber
	 */
	public void setRegistrationNumber(final String value)
	{
		setRegistrationNumber( getSession().getSessionContext(), value );
	}
	
}
