/**
 */
package fr.inria.fabmodeling.fabm.model.fabm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.fabmodeling.fabm.model.fabm.FabmPackage
 * @generated
 */
public interface FabmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FabmFactory eINSTANCE = fr.inria.fabmodeling.fabm.model.fabm.impl.FabmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fab Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fab Model</em>'.
	 * @generated
	 */
	FabModel createFabModel();

	/**
	 * Returns a new object of class '<em>Asset Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Group</em>'.
	 * @generated
	 */
	AssetGroup createAssetGroup();

	/**
	 * Returns a new object of class '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset</em>'.
	 * @generated
	 */
	Asset createAsset();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FabmPackage getFabmPackage();

} //FabmFactory
