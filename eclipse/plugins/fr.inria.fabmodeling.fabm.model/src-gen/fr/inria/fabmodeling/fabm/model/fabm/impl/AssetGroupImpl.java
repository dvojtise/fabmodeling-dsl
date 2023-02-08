/**
 */
package fr.inria.fabmodeling.fabm.model.fabm.impl;

import fr.inria.fabmodeling.fabm.model.fabm.Asset;
import fr.inria.fabmodeling.fabm.model.fabm.AssetGroup;
import fr.inria.fabmodeling.fabm.model.fabm.FabmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.fabmodeling.fabm.model.fabm.impl.AssetGroupImpl#getAssetGroups <em>Asset Groups</em>}</li>
 *   <li>{@link fr.inria.fabmodeling.fabm.model.fabm.impl.AssetGroupImpl#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetGroupImpl extends NamedElementImpl implements AssetGroup {
	/**
	 * The cached value of the '{@link #getAssetGroups() <em>Asset Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<AssetGroup> assetGroups;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> asset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FabmPackage.Literals.ASSET_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssetGroup> getAssetGroups() {
		if (assetGroups == null) {
			assetGroups = new EObjectContainmentEList<AssetGroup>(AssetGroup.class, this,
					FabmPackage.ASSET_GROUP__ASSET_GROUPS);
		}
		return assetGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAsset() {
		if (asset == null) {
			asset = new EObjectContainmentEList<Asset>(Asset.class, this, FabmPackage.ASSET_GROUP__ASSET);
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FabmPackage.ASSET_GROUP__ASSET_GROUPS:
			return ((InternalEList<?>) getAssetGroups()).basicRemove(otherEnd, msgs);
		case FabmPackage.ASSET_GROUP__ASSET:
			return ((InternalEList<?>) getAsset()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FabmPackage.ASSET_GROUP__ASSET_GROUPS:
			return getAssetGroups();
		case FabmPackage.ASSET_GROUP__ASSET:
			return getAsset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FabmPackage.ASSET_GROUP__ASSET_GROUPS:
			getAssetGroups().clear();
			getAssetGroups().addAll((Collection<? extends AssetGroup>) newValue);
			return;
		case FabmPackage.ASSET_GROUP__ASSET:
			getAsset().clear();
			getAsset().addAll((Collection<? extends Asset>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FabmPackage.ASSET_GROUP__ASSET_GROUPS:
			getAssetGroups().clear();
			return;
		case FabmPackage.ASSET_GROUP__ASSET:
			getAsset().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FabmPackage.ASSET_GROUP__ASSET_GROUPS:
			return assetGroups != null && !assetGroups.isEmpty();
		case FabmPackage.ASSET_GROUP__ASSET:
			return asset != null && !asset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssetGroupImpl
