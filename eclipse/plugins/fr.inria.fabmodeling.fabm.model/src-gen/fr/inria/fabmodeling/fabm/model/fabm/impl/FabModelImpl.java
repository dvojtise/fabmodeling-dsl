/**
 */
package fr.inria.fabmodeling.fabm.model.fabm.impl;

import fr.inria.fabmodeling.fabm.model.fabm.AssetGroup;
import fr.inria.fabmodeling.fabm.model.fabm.FabModel;
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
 * An implementation of the model object '<em><b>Fab Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.fabmodeling.fabm.model.fabm.impl.FabModelImpl#getAssetGroups <em>Asset Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FabModelImpl extends NamedElementImpl implements FabModel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FabModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FabmPackage.Literals.FAB_MODEL;
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
					FabmPackage.FAB_MODEL__ASSET_GROUPS);
		}
		return assetGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FabmPackage.FAB_MODEL__ASSET_GROUPS:
			return ((InternalEList<?>) getAssetGroups()).basicRemove(otherEnd, msgs);
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
		case FabmPackage.FAB_MODEL__ASSET_GROUPS:
			return getAssetGroups();
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
		case FabmPackage.FAB_MODEL__ASSET_GROUPS:
			getAssetGroups().clear();
			getAssetGroups().addAll((Collection<? extends AssetGroup>) newValue);
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
		case FabmPackage.FAB_MODEL__ASSET_GROUPS:
			getAssetGroups().clear();
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
		case FabmPackage.FAB_MODEL__ASSET_GROUPS:
			return assetGroups != null && !assetGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FabModelImpl
