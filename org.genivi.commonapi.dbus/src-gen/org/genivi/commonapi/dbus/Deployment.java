/*******************************************************************************
* This file has been generated by Franca's FDeployGenerator.
* Source: deployment specification 'org.genivi.commonapi.dbus.deployment'
*******************************************************************************/
package org.genivi.commonapi.dbus;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.franca.core.franca.FArgument;
import org.franca.core.franca.FArrayType;
import org.franca.core.franca.FAttribute;
import org.franca.core.franca.FEnumerator;
import org.franca.core.franca.FField;
import org.franca.core.franca.FInterface;
import org.franca.core.franca.FModelElement;
import org.franca.core.franca.FUnionType;
import org.franca.deploymodel.core.FDeployedInterface;
import org.franca.deploymodel.core.FDeployedRootElement;
import org.franca.deploymodel.core.FDeployedTypeCollection;
import org.franca.deploymodel.core.MappingGenericPropertyAccessor;
import org.franca.deploymodel.dsl.fDeploy.FDCompoundOverwrites;
import org.franca.deploymodel.dsl.fDeploy.FDEnumValue;
import org.franca.deploymodel.dsl.fDeploy.FDEnumerationOverwrites;
import org.franca.deploymodel.dsl.fDeploy.FDExtensionElement;
import org.franca.deploymodel.dsl.fDeploy.FDExtensionRoot;
import org.franca.deploymodel.dsl.fDeploy.FDField;
import org.franca.deploymodel.dsl.fDeploy.FDOverwriteElement;
import org.franca.deploymodel.dsl.fDeploy.FDTypeOverwrites;

import com.google.common.collect.Maps;

/**
 * This is a collection of all interfaces and classes needed for
 * accessing deployment properties according to deployment specification
 * 'org.genivi.commonapi.dbus.deployment'.
 */
public class Deployment {

	/**
	 * Enumerations for deployment specification org.genivi.commonapi.dbus.deployment.
	 */
	public interface Enums
		extends org.genivi.commonapi.core.Deployment.Enums
	{
		public enum DBusBusType {
			system, session
		}
		 
		public enum DBusDefaultAttributeType {
			CommonAPI, freedesktop
		}
		 
		public enum DBusAttributeType {
			CommonAPI, freedesktop
		}
		 
		public enum DBusVariantType {
			DBus, CommonAPI
		}
		 
	}

	/**
	 * Interface for data deployment properties for 'org.genivi.commonapi.dbus.deployment' specification
	 * 
	 * This is the data types related part only.
	 */
	public interface IDataPropertyAccessor
		extends Enums, org.genivi.commonapi.core.Deployment.IDataPropertyAccessor
	{
		// host 'strings'
		public Boolean getIsObjectPath(EObject obj);
			
		// host 'unions'
		public DBusVariantType getDBusVariantType(FUnionType obj);
			
		// host 'integers'
		public Boolean getIsUnixFD(EObject obj);
			
		
		/**
		 * Get an overwrite-aware accessor for deployment properties.</p>
		 *
		 * This accessor will return overwritten property values in the context 
		 * of a Franca FField object. I.e., the FField obj has a datatype
		 * which can be overwritten in the deployment definition (e.g., Franca array,
		 * struct, union or enumeration). The accessor will return the overwritten values.
		 * If the deployment definition didn't overwrite the value, this accessor will
		 * delegate to its parent accessor.</p>
		 *
		 * @param obj a Franca FField which is the context for the accessor
		 * @return the overwrite-aware accessor
		 */
		public IDataPropertyAccessor getOverwriteAccessor(FField obj);
	
		/**
		 * Get an overwrite-aware accessor for deployment properties.</p>
		 *
		 * This accessor will return overwritten property values in the context 
		 * of a Franca FArrayType object. I.e., the FArrayType obj has a datatype
		 * which can be overwritten in the deployment definition (e.g., Franca array,
		 * struct, union or enumeration). The accessor will return the overwritten values.
		 * If the deployment definition didn't overwrite the value, this accessor will
		 * delegate to its parent accessor.</p>
		 *
		 * @param obj a Franca FArrayType which is the context for the accessor
		 * @return the overwrite-aware accessor
		 */
		public IDataPropertyAccessor getOverwriteAccessor(FArrayType obj);
	}

	/**
	 * Helper class for data-related property accessors.
	 */		
	public static class DataPropertyAccessorHelper implements Enums
	{
		final private MappingGenericPropertyAccessor target;
		final private IDataPropertyAccessor owner;
		
		public DataPropertyAccessorHelper(
			MappingGenericPropertyAccessor target,
			IDataPropertyAccessor owner
		) {
			this.target = target;
			this.owner = owner;
		}
	
		public static DBusBusType convertDBusBusType(String val) {
			if (val.equals("system"))
				return DBusBusType.system; else 
			if (val.equals("session"))
				return DBusBusType.session;
			return null;
		}
		
		public static DBusDefaultAttributeType convertDBusDefaultAttributeType(String val) {
			if (val.equals("CommonAPI"))
				return DBusDefaultAttributeType.CommonAPI; else 
			if (val.equals("freedesktop"))
				return DBusDefaultAttributeType.freedesktop;
			return null;
		}
		
		public static DBusAttributeType convertDBusAttributeType(String val) {
			if (val.equals("CommonAPI"))
				return DBusAttributeType.CommonAPI; else 
			if (val.equals("freedesktop"))
				return DBusAttributeType.freedesktop;
			return null;
		}
		
		public static DBusVariantType convertDBusVariantType(String val) {
			if (val.equals("DBus"))
				return DBusVariantType.DBus; else 
			if (val.equals("CommonAPI"))
				return DBusVariantType.CommonAPI;
			return null;
		}
		
		
		protected IDataPropertyAccessor getOverwriteAccessorAux(FModelElement obj) {
			FDOverwriteElement fd = (FDOverwriteElement)target.getFDElement(obj);
			FDTypeOverwrites overwrites = fd.getOverwrites();
			if (overwrites==null)
				return owner;
			else
				return new OverwriteAccessor(overwrites, owner, target);
		}
	}

	/**
	 * Accessor for deployment properties for Franca type collections according
	 * to deployment specification 'org.genivi.commonapi.dbus.deployment'.
	 */		
	public static class TypeCollectionPropertyAccessor
		extends org.genivi.commonapi.core.Deployment.TypeCollectionPropertyAccessor
		implements IDataPropertyAccessor
	{
		private final MappingGenericPropertyAccessor target;
		private final DataPropertyAccessorHelper helper;
	
		public TypeCollectionPropertyAccessor(FDeployedTypeCollection target) {
			super(target);
			this.target = target;
			this.helper = new DataPropertyAccessorHelper(target, this);
		}
		
		// host 'strings'
		@Override
		public Boolean getIsObjectPath(EObject obj) {
			return target.getBoolean(obj, "IsObjectPath");
		}
			
		// host 'unions'
		@Override
		public DBusVariantType getDBusVariantType(FUnionType obj) {
			String e = target.getEnum(obj, "DBusVariantType");
			if (e==null) return null;
			return DataPropertyAccessorHelper.convertDBusVariantType(e);
		}
			
		// host 'integers'
		@Override
		public Boolean getIsUnixFD(EObject obj) {
			return target.getBoolean(obj, "IsUnixFD");
		}
			
		
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FField obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FArrayType obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	}

	/**
	 * Accessor for deployment properties for Franca interfaces according to
	 * deployment specification 'org.genivi.commonapi.dbus.deployment'.
	 */
	public static class InterfacePropertyAccessor
		extends org.genivi.commonapi.core.Deployment.InterfacePropertyAccessor
		implements IDataPropertyAccessor
	{
		private final MappingGenericPropertyAccessor target;
		private final DataPropertyAccessorHelper helper;
	
		public InterfacePropertyAccessor(FDeployedInterface target) {
			super(target);
			this.target = target;
			this.helper = new DataPropertyAccessorHelper(target, this);
		}
		
		// host 'interfaces'
		public DBusDefaultAttributeType getDBusDefaultAttributeType(FInterface obj) {
			String e = target.getEnum(obj, "DBusDefaultAttributeType");
			if (e==null) return null;
			return DataPropertyAccessorHelper.convertDBusDefaultAttributeType(e);
		}
			
		// host 'attributes'
		public DBusAttributeType getDBusAttributeType(FAttribute obj) {
			String e = target.getEnum(obj, "DBusAttributeType");
			if (e==null) return null;
			return DataPropertyAccessorHelper.convertDBusAttributeType(e);
		}
			
		// host 'strings'
		@Override
		public Boolean getIsObjectPath(EObject obj) {
			return target.getBoolean(obj, "IsObjectPath");
		}
			
		// host 'unions'
		@Override
		public DBusVariantType getDBusVariantType(FUnionType obj) {
			String e = target.getEnum(obj, "DBusVariantType");
			if (e==null) return null;
			return DataPropertyAccessorHelper.convertDBusVariantType(e);
		}
			
		// host 'integers'
		@Override
		public Boolean getIsUnixFD(EObject obj) {
			return target.getBoolean(obj, "IsUnixFD");
		}
			
		
		/**
		 * Get an overwrite-aware accessor for deployment properties.</p>
		 *
		 * This accessor will return overwritten property values in the context 
		 * of a Franca FAttribute object. I.e., the FAttribute obj has a datatype
		 * which can be overwritten in the deployment definition (e.g., Franca array,
		 * struct, union or enumeration). The accessor will return the overwritten values.
		 * If the deployment definition didn't overwrite the value, this accessor will
		 * delegate to its parent accessor.</p>
		 *
		 * @param obj a Franca FAttribute which is the context for the accessor
		 * @return the overwrite-aware accessor
		 */
		public IDataPropertyAccessor getOverwriteAccessor(FAttribute obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	
		/**
		 * Get an overwrite-aware accessor for deployment properties.</p>
		 *
		 * This accessor will return overwritten property values in the context 
		 * of a Franca FArgument object. I.e., the FArgument obj has a datatype
		 * which can be overwritten in the deployment definition (e.g., Franca array,
		 * struct, union or enumeration). The accessor will return the overwritten values.
		 * If the deployment definition didn't overwrite the value, this accessor will
		 * delegate to its parent accessor.</p>
		 *
		 * @param obj a Franca FArgument which is the context for the accessor
		 * @return the overwrite-aware accessor
		 */
		public IDataPropertyAccessor getOverwriteAccessor(FArgument obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FField obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FArrayType obj) {
			return helper.getOverwriteAccessorAux(obj);
		}
	}

	/**
	 * Accessor for deployment properties for 'provider' roots
	 * (which are defined by the 'providers and instances' extension)
	 * according to the 'org.genivi.commonapi.dbus.deployment' specification.
	 */
	public static class ProviderPropertyAccessor
		extends org.genivi.commonapi.core.Deployment.ProviderPropertyAccessor
		implements Enums
	{
		final private FDeployedRootElement<FDExtensionRoot> target;
	
		public ProviderPropertyAccessor(FDeployedRootElement<FDExtensionRoot> target) {
			super(target);
			this.target = target;
		}
		
		// host 'instances'
		public String getDBusServiceName(FDExtensionElement obj) {
			return target.getString(obj, "DBusServiceName");
		}
		public String getDBusObjectPath(FDExtensionElement obj) {
			return target.getString(obj, "DBusObjectPath");
		}
		public String getDBusInterfaceName(FDExtensionElement obj) {
			return target.getString(obj, "DBusInterfaceName");
		}
		public DBusBusType getDBusBusType(FDExtensionElement obj) {
			String e = target.getEnum(obj, "DBusBusType");
			if (e==null) return null;
			return DataPropertyAccessorHelper.convertDBusBusType(e);
		}
		public Boolean getDBusPredefined(FDExtensionElement obj) {
			return target.getBoolean(obj, "DBusPredefined");
		}
		
	}
	
	/**
	 * Accessor for getting overwritten property values.
	 */		
	public static class OverwriteAccessor
		extends org.genivi.commonapi.core.Deployment.OverwriteAccessor
		implements IDataPropertyAccessor
	{
		private final MappingGenericPropertyAccessor target;
		private final IDataPropertyAccessor delegate;
		
		private final FDTypeOverwrites overwrites;
		private final Map<FField, FDField> mappedFields;
		private final Map<FEnumerator, FDEnumValue> mappedEnumerators;
	
		public OverwriteAccessor(
				FDTypeOverwrites overwrites,
				IDataPropertyAccessor delegate,
				MappingGenericPropertyAccessor genericAccessor)
		{
			super(overwrites, delegate, genericAccessor);
			this.target = genericAccessor;
			this.delegate = delegate;
	
			this.overwrites = overwrites;
			this.mappedFields = Maps.newHashMap();
			this.mappedEnumerators = Maps.newHashMap();
			if (overwrites!=null) {
				if (overwrites instanceof FDCompoundOverwrites) {
					// build mapping for compound fields
					for(FDField f : ((FDCompoundOverwrites)overwrites).getFields()) {
						this.mappedFields.put(f.getTarget(), f);
					}
				}
				if (overwrites instanceof FDEnumerationOverwrites) {
					// build mapping for enumerators
					for(FDEnumValue e : ((FDEnumerationOverwrites)overwrites).getEnumerators()) {
						this.mappedEnumerators.put(e.getTarget(), e);
					}
				}
			}
		}
		
		// host 'strings'
		@Override
		public Boolean getIsObjectPath(EObject obj) {
			if (obj instanceof FField) {
				// check if this field is overwritten
				if (mappedFields.containsKey(obj)) {
					FDField fo = mappedFields.get(obj);
					Boolean v = target.getBoolean(fo, "IsObjectPath");
					if (v!=null)
						return v;
				}
			} else {
				if (overwrites!=null) {
					// this is some model element which might be overwritten
					Boolean v = target.getBoolean(obj, "IsObjectPath");
					if (v!=null)
						return v;
				}
			}
			return delegate.getIsObjectPath(obj);
		}
			
		// host 'unions'
		@Override
		public DBusVariantType getDBusVariantType(FUnionType obj) {
			if (overwrites!=null) {
				String e = target.getEnum(overwrites, "DBusVariantType");
				if (e!=null) {
					return DataPropertyAccessorHelper.convertDBusVariantType(e);
				}
			}
			return delegate.getDBusVariantType(obj);
		}
			
		// host 'integers'
		@Override
		public Boolean getIsUnixFD(EObject obj) {
			if (obj instanceof FField) {
				// check if this field is overwritten
				if (mappedFields.containsKey(obj)) {
					FDField fo = mappedFields.get(obj);
					Boolean v = target.getBoolean(fo, "IsUnixFD");
					if (v!=null)
						return v;
				}
			} else {
				if (overwrites!=null) {
					// this is some model element which might be overwritten
					Boolean v = target.getBoolean(obj, "IsUnixFD");
					if (v!=null)
						return v;
				}
			}
			return delegate.getIsUnixFD(obj);
		}
			
		
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FField obj) {
			// check if this field is overwritten
			if (mappedFields.containsKey(obj)) {
				FDField fo = mappedFields.get(obj);
				FDTypeOverwrites overwrites = fo.getOverwrites();
				if (overwrites==null)
					return this; // TODO: correct?
				else
					// TODO: this or delegate?
					return new OverwriteAccessor(overwrites, this, target);
				
			}
			return delegate.getOverwriteAccessor(obj);
		}
	
		@Override
		public IDataPropertyAccessor getOverwriteAccessor(FArrayType obj) {
			// check if this array is overwritten
			if (overwrites!=null) {
				// TODO: this or delegate?
				return new OverwriteAccessor(overwrites, this, target);
			}
			return delegate.getOverwriteAccessor(obj);
		}
	}
}
	
