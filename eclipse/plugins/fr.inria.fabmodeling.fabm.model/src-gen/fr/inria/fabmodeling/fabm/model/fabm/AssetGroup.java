/**
 */
package fr.inria.fabmodeling.fabm.model.fabm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.fabmodeling.fabm.model.fabm.AssetGroup#getAssetGroups <em>Asset Groups</em>}</li>
 *   <li>{@link fr.inria.fabmodeling.fabm.model.fabm.AssetGroup#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see fr.inria.fabmodeling.fabm.model.fabm.FabmPackage#getAssetGroup()
 * @model
 * @generated
 */
public interface AssetGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Asset Groups</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.fabmodeling.fabm.model.fabm.AssetGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Groups</em>' containment reference list.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.FabmPackage#getAssetGroup_AssetGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssetGroup> getAssetGroups();

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.fabmodeling.fabm.model.fabm.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference list.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.FabmPackage#getAssetGroup_Asset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAsset();

} // AssetGroup
