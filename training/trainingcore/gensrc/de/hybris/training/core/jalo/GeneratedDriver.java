/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 10-Oct-2021, 5:20:49 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.Dealer;
import de.hybris.training.core.jalo.Vehicle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Driver}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDriver extends GenericItem
{
	/** Qualifier of the <code>Driver.driverId</code> attribute **/
	public static final String DRIVERID = "driverId";
	/** Qualifier of the <code>Driver.driverName</code> attribute **/
	public static final String DRIVERNAME = "driverName";
	/** Qualifier of the <code>Driver.experience</code> attribute **/
	public static final String EXPERIENCE = "experience";
	/** Qualifier of the <code>Driver.dealers</code> attribute **/
	public static final String DEALERS = "dealers";
	/** Relation ordering override parameter constants for DealerToDriver from ((trainingcore))*/
	protected static String DEALERTODRIVER_SRC_ORDERED = "relation.DealerToDriver.source.ordered";
	protected static String DEALERTODRIVER_TGT_ORDERED = "relation.DealerToDriver.target.ordered";
	/** Relation disable markmodifed parameter constants for DealerToDriver from ((trainingcore))*/
	protected static String DEALERTODRIVER_MARKMODIFIED = "relation.DealerToDriver.markmodified";
	/** Qualifier of the <code>Driver.vehicles</code> attribute **/
	public static final String VEHICLES = "vehicles";
	/** Relation ordering override parameter constants for DriverToVehicle from ((trainingcore))*/
	protected static String DRIVERTOVEHICLE_SRC_ORDERED = "relation.DriverToVehicle.source.ordered";
	protected static String DRIVERTOVEHICLE_TGT_ORDERED = "relation.DriverToVehicle.target.ordered";
	/** Relation disable markmodifed parameter constants for DriverToVehicle from ((trainingcore))*/
	protected static String DRIVERTOVEHICLE_MARKMODIFIED = "relation.DriverToVehicle.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DRIVERID, AttributeMode.INITIAL);
		tmp.put(DRIVERNAME, AttributeMode.INITIAL);
		tmp.put(EXPERIENCE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.dealers</code> attribute.
	 * @return the dealers
	 */
	public Collection<Dealer> getDealers(final SessionContext ctx)
	{
		final List<Dealer> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALERTODRIVER,
			"Dealer",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.dealers</code> attribute.
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
			TrainingCoreConstants.Relations.DEALERTODRIVER,
			"Dealer",
			null
		);
	}
	
	public long getDealersCount()
	{
		return getDealersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.dealers</code> attribute. 
	 * @param value the dealers
	 */
	public void setDealers(final SessionContext ctx, final Collection<Dealer> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALERTODRIVER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALERTODRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.dealers</code> attribute. 
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
			TrainingCoreConstants.Relations.DEALERTODRIVER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALERTODRIVER_MARKMODIFIED)
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
			TrainingCoreConstants.Relations.DEALERTODRIVER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALERTODRIVER_MARKMODIFIED)
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
	 * <i>Generated method</i> - Getter of the <code>Driver.driverId</code> attribute.
	 * @return the driverId
	 */
	public Integer getDriverId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DRIVERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.driverId</code> attribute.
	 * @return the driverId
	 */
	public Integer getDriverId()
	{
		return getDriverId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.driverId</code> attribute. 
	 * @return the driverId
	 */
	public int getDriverIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDriverId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.driverId</code> attribute. 
	 * @return the driverId
	 */
	public int getDriverIdAsPrimitive()
	{
		return getDriverIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverId</code> attribute. 
	 * @param value the driverId
	 */
	public void setDriverId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DRIVERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverId</code> attribute. 
	 * @param value the driverId
	 */
	public void setDriverId(final Integer value)
	{
		setDriverId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverId</code> attribute. 
	 * @param value the driverId
	 */
	public void setDriverId(final SessionContext ctx, final int value)
	{
		setDriverId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverId</code> attribute. 
	 * @param value the driverId
	 */
	public void setDriverId(final int value)
	{
		setDriverId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.driverName</code> attribute.
	 * @return the driverName
	 */
	public String getDriverName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DRIVERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.driverName</code> attribute.
	 * @return the driverName
	 */
	public String getDriverName()
	{
		return getDriverName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverName</code> attribute. 
	 * @param value the driverName
	 */
	public void setDriverName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DRIVERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverName</code> attribute. 
	 * @param value the driverName
	 */
	public void setDriverName(final String value)
	{
		setDriverName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.experience</code> attribute.
	 * @return the experience
	 */
	public Integer getExperience(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EXPERIENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.experience</code> attribute.
	 * @return the experience
	 */
	public Integer getExperience()
	{
		return getExperience( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.experience</code> attribute. 
	 * @return the experience
	 */
	public int getExperienceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getExperience( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.experience</code> attribute. 
	 * @return the experience
	 */
	public int getExperienceAsPrimitive()
	{
		return getExperienceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EXPERIENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final Integer value)
	{
		setExperience( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final SessionContext ctx, final int value)
	{
		setExperience( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final int value)
	{
		setExperience( getSession().getSessionContext(), value );
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
			return Utilities.getMarkModifiedOverride(DEALERTODRIVER_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Vehicle");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DRIVERTOVEHICLE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.vehicles</code> attribute.
	 * @return the vehicles
	 */
	public Collection<Vehicle> getVehicles(final SessionContext ctx)
	{
		final List<Vehicle> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
			"Vehicle",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.vehicles</code> attribute.
	 * @return the vehicles
	 */
	public Collection<Vehicle> getVehicles()
	{
		return getVehicles( getSession().getSessionContext() );
	}
	
	public long getVehiclesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
			"Vehicle",
			null
		);
	}
	
	public long getVehiclesCount()
	{
		return getVehiclesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.vehicles</code> attribute. 
	 * @param value the vehicles
	 */
	public void setVehicles(final SessionContext ctx, final Collection<Vehicle> value)
	{
		new PartOfHandler<Collection<Vehicle>>()
		{
			@Override
			protected Collection<Vehicle> doGetValue(final SessionContext ctx)
			{
				return getVehicles( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<Vehicle> _value)
			{
				final Collection<Vehicle> value = _value;
				setLinkedItems( 
					ctx,
					true,
					TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(DRIVERTOVEHICLE_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.vehicles</code> attribute. 
	 * @param value the vehicles
	 */
	public void setVehicles(final Collection<Vehicle> value)
	{
		setVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicles. 
	 * @param value the item to add to vehicles
	 */
	public void addToVehicles(final SessionContext ctx, final Vehicle value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVERTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicles. 
	 * @param value the item to add to vehicles
	 */
	public void addToVehicles(final Vehicle value)
	{
		addToVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicles. 
	 * @param value the item to remove from vehicles
	 */
	public void removeFromVehicles(final SessionContext ctx, final Vehicle value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DRIVERTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVERTOVEHICLE_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,TrainingCoreConstants.Relations.DRIVERTOVEHICLE,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicles. 
	 * @param value the item to remove from vehicles
	 */
	public void removeFromVehicles(final Vehicle value)
	{
		removeFromVehicles( getSession().getSessionContext(), value );
	}
	
}
