/**
 */
package fr.inria.fabmodeling.fabm.model.fabm.impl;

import fr.inria.fabmodeling.fabm.model.fabm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FabmFactoryImpl extends EFactoryImpl implements FabmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FabmFactory init() {
		try {
			FabmFactory theFabmFactory = (FabmFactory) EPackage.Registry.INSTANCE.getEFactory(FabmPackage.eNS_URI);
			if (theFabmFactory != null) {
				return theFabmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FabmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FabmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FabmPackage.FAB_MODEL:
			return createFabModel();
		case FabmPackage.ASSET_GROUP:
			return createAssetGroup();
		case FabmPackage.ASSET:
			return createAsset();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FabModel createFabModel() {
		FabModelImpl fabModel = new FabModelImpl();
		return fabModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetGroup createAssetGroup() {
		AssetGroupImpl assetGroup = new AssetGroupImpl();
		return assetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FabmPackage getFabmPackage() {
		return (FabmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FabmPackage getPackage() {
		return FabmPackage.eINSTANCE;
	}

} //FabmFactoryImpl
