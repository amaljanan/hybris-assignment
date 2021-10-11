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
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.AccessoriesColorVariantProduct;
import de.hybris.training.core.jalo.VehicleAccessories;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem VehicleSupported}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleSupported extends GenericItem
{
	/** Qualifier of the <code>VehicleSupported.vehicleModelName</code> attribute **/
	public static final String VEHICLEMODELNAME = "vehicleModelName";
	/** Qualifier of the <code>VehicleSupported.vehicleCode</code> attribute **/
	public static final String VEHICLECODE = "vehicleCode";
	/** Qualifier of the <code>VehicleSupported.model</code> attribute **/
	public static final String MODEL = "model";
	/** Qualifier of the <code>VehicleSupported.engineType</code> attribute **/
	public static final String ENGINETYPE = "engineType";
	/** Qualifier of the <code>VehicleSupported.vehicleAccessories</code> attribute **/
	public static final String VEHICLEACCESSORIES = "vehicleAccessories";
	/** Relation ordering override parameter constants for AccessoriesToVehicle from ((trainingcore))*/
	protected static String ACCESSORIESTOVEHICLE_SRC_ORDERED = "relation.AccessoriesToVehicle.source.ordered";
	protected static String ACCESSORIESTOVEHICLE_TGT_ORDERED = "relation.AccessoriesToVehicle.target.ordered";
	/** Relation disable markmodifed parameter constants for AccessoriesToVehicle from ((trainingcore))*/
	protected static String ACCESSORIESTOVEHICLE_MARKMODIFIED = "relation.AccessoriesToVehicle.markmodified";
	/** Qualifier of the <code>VehicleSupported.accessoriesColorVariantProduct</code> attribute **/
	public static final String ACCESSORIESCOLORVARIANTPRODUCT = "accessoriesColorVariantProduct";
	/** Relation ordering override parameter constants for VariantToVehicle from ((trainingcore))*/
	protected static String VARIANTTOVEHICLE_SRC_ORDERED = "relation.VariantToVehicle.source.ordered";
	protected static String VARIANTTOVEHICLE_TGT_ORDERED = "relation.VariantToVehicle.target.ordered";
	/** Relation disable markmodifed parameter constants for VariantToVehicle from ((trainingcore))*/
	protected static String VARIANTTOVEHICLE_MARKMODIFIED = "relation.VariantToVehicle.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VEHICLEMODELNAME, AttributeMode.INITIAL);
		tmp.put(VEHICLECODE, AttributeMode.INITIAL);
		tmp.put(MODEL, AttributeMode.INITIAL);
		tmp.put(ENGINETYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.accessoriesColorVariantProduct</code> attribute.
	 * @return the accessoriesColorVariantProduct
	 */
	public Collection<AccessoriesColorVariantProduct> getAccessoriesColorVariantProduct(final SessionContext ctx)
	{
		final List<AccessoriesColorVariantProduct> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VARIANTTOVEHICLE,
			"AccessoriesColorVariantProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.accessoriesColorVariantProduct</code> attribute.
	 * @return the accessoriesColorVariantProduct
	 */
	public Collection<AccessoriesColorVariantProduct> getAccessoriesColorVariantProduct()
	{
		return getAccessoriesColorVariantProduct( getSession().getSessionContext() );
	}
	
	public long getAccessoriesColorVariantProductCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.VARIANTTOVEHICLE,
			"AccessoriesColorVariantProduct",
			null
		);
	}
	
	public long getAccessoriesColorVariantProductCount()
	{
		return getAccessoriesColorVariantProductCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.accessoriesColorVariantProduct</code> attribute. 
	 * @param value the accessoriesColorVariantProduct
	 */
	public void setAccessoriesColorVariantProduct(final SessionContext ctx, final Collection<AccessoriesColorVariantProduct> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VARIANTTOVEHICLE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(VARIANTTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.accessoriesColorVariantProduct</code> attribute. 
	 * @param value the accessoriesColorVariantProduct
	 */
	public void setAccessoriesColorVariantProduct(final Collection<AccessoriesColorVariantProduct> value)
	{
		setAccessoriesColorVariantProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accessoriesColorVariantProduct. 
	 * @param value the item to add to accessoriesColorVariantProduct
	 */
	public void addToAccessoriesColorVariantProduct(final SessionContext ctx, final AccessoriesColorVariantProduct value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VARIANTTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VARIANTTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accessoriesColorVariantProduct. 
	 * @param value the item to add to accessoriesColorVariantProduct
	 */
	public void addToAccessoriesColorVariantProduct(final AccessoriesColorVariantProduct value)
	{
		addToAccessoriesColorVariantProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accessoriesColorVariantProduct. 
	 * @param value the item to remove from accessoriesColorVariantProduct
	 */
	public void removeFromAccessoriesColorVariantProduct(final SessionContext ctx, final AccessoriesColorVariantProduct value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VARIANTTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VARIANTTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accessoriesColorVariantProduct. 
	 * @param value the item to remove from accessoriesColorVariantProduct
	 */
	public void removeFromAccessoriesColorVariantProduct(final AccessoriesColorVariantProduct value)
	{
		removeFromAccessoriesColorVariantProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.engineType</code> attribute.
	 * @return the engineType
	 */
	public String getEngineType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ENGINETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.engineType</code> attribute.
	 * @return the engineType
	 */
	public String getEngineType()
	{
		return getEngineType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.engineType</code> attribute. 
	 * @param value the engineType
	 */
	public void setEngineType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ENGINETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.engineType</code> attribute. 
	 * @param value the engineType
	 */
	public void setEngineType(final String value)
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
			return Utilities.getMarkModifiedOverride(ACCESSORIESTOVEHICLE_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("AccessoriesColorVariantProduct");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(VARIANTTOVEHICLE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.model</code> attribute.
	 * @return the model
	 */
	public String getModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.model</code> attribute.
	 * @return the model
	 */
	public String getModel()
	{
		return getModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.model</code> attribute. 
	 * @param value the model
	 */
	public void setModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.model</code> attribute. 
	 * @param value the model
	 */
	public void setModel(final String value)
	{
		setModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.vehicleAccessories</code> attribute.
	 * @return the vehicleAccessories
	 */
	public Collection<VehicleAccessories> getVehicleAccessories(final SessionContext ctx)
	{
		final List<VehicleAccessories> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLE,
			"VehicleAccessories",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.vehicleAccessories</code> attribute.
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
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLE,
			"VehicleAccessories",
			null
		);
	}
	
	public long getVehicleAccessoriesCount()
	{
		return getVehicleAccessoriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.vehicleAccessories</code> attribute. 
	 * @param value the vehicleAccessories
	 */
	public void setVehicleAccessories(final SessionContext ctx, final Collection<VehicleAccessories> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCESSORIESTOVEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.vehicleAccessories</code> attribute. 
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
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCESSORIESTOVEHICLE_MARKMODIFIED)
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
			TrainingCoreConstants.Relations.ACCESSORIESTOVEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCESSORIESTOVEHICLE_MARKMODIFIED)
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
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.vehicleCode</code> attribute.
	 * @return the vehicleCode
	 */
	public Integer getVehicleCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, VEHICLECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.vehicleCode</code> attribute.
	 * @return the vehicleCode
	 */
	public Integer getVehicleCode()
	{
		return getVehicleCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.vehicleCode</code> attribute. 
	 * @return the vehicleCode
	 */
	public int getVehicleCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getVehicleCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.vehicleCode</code> attribute. 
	 * @return the vehicleCode
	 */
	public int getVehicleCodeAsPrimitive()
	{
		return getVehicleCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.vehicleCode</code> attribute. 
	 * @param value the vehicleCode
	 */
	public void setVehicleCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, VEHICLECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.vehicleCode</code> attribute. 
	 * @param value the vehicleCode
	 */
	public void setVehicleCode(final Integer value)
	{
		setVehicleCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.vehicleCode</code> attribute. 
	 * @param value the vehicleCode
	 */
	public void setVehicleCode(final SessionContext ctx, final int value)
	{
		setVehicleCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.vehicleCode</code> attribute. 
	 * @param value the vehicleCode
	 */
	public void setVehicleCode(final int value)
	{
		setVehicleCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.vehicleModelName</code> attribute.
	 * @return the vehicleModelName
	 */
	public String getVehicleModelName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VEHICLEMODELNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleSupported.vehicleModelName</code> attribute.
	 * @return the vehicleModelName
	 */
	public String getVehicleModelName()
	{
		return getVehicleModelName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.vehicleModelName</code> attribute. 
	 * @param value the vehicleModelName
	 */
	public void setVehicleModelName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VEHICLEMODELNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleSupported.vehicleModelName</code> attribute. 
	 * @param value the vehicleModelName
	 */
	public void setVehicleModelName(final String value)
	{
		setVehicleModelName( getSession().getSessionContext(), value );
	}
	
}
