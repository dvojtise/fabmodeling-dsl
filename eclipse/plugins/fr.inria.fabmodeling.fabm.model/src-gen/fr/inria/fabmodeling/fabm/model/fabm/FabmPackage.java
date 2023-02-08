/**
 */
package fr.inria.fabmodeling.fabm.model.fabm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.fabmodeling.fabm.model.fabm.FabmFactory
 * @model kind="package"
 * @generated
 */
public interface FabmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fabm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.fr/fabmodeling/fabm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fabm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FabmPackage eINSTANCE = fr.inria.fabmodeling.fabm.model.fabm.impl.FabmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.fabmodeling.fabm.model.fabm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.NamedElementImpl
	 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.fabmodeling.fabm.model.fabm.impl.FabModelImpl <em>Fab Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabModelImpl
	 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabmPackageImpl#getFabModel()
	 * @generated
	 */
	int FAB_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAB_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAB_MODEL__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Asset Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAB_MODEL__ASSET_GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fab Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAB_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fab Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAB_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.fabmodeling.fabm.model.fabm.impl.AssetGroupImpl <em>Asset Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.AssetGroupImpl
	 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabmPackageImpl#getAssetGroup()
	 * @generated
	 */
	int ASSET_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_GROUP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_GROUP__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Asset Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_GROUP__ASSET_GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_GROUP__ASSET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asset Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_GROUP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asset Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_GROUP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.fabmodeling.fabm.model.fabm.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.AssetImpl
	 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabmPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.fabmodeling.fabm.model.fabm.FabModel <em>Fab Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fab Model</em>'.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.FabModel
	 * @generated
	 */
	EClass getFabModel();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.fabmodeling.fabm.model.fabm.FabModel#getAssetGroups <em>Asset Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset Groups</em>'.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.FabModel#getAssetGroups()
	 * @see #getFabModel()
	 * @generated
	 */
	EReference getFabModel_AssetGroups();

	/**
	 * Returns the meta object for class '{@link fr.inria.fabmodeling.fabm.model.fabm.AssetGroup <em>Asset Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Group</em>'.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.AssetGroup
	 * @generated
	 */
	EClass getAssetGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.fabmodeling.fabm.model.fabm.AssetGroup#getAssetGroups <em>Asset Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset Groups</em>'.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.AssetGroup#getAssetGroups()
	 * @see #getAssetGroup()
	 * @generated
	 */
	EReference getAssetGroup_AssetGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.fabmodeling.fabm.model.fabm.AssetGroup#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset</em>'.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.AssetGroup#getAsset()
	 * @see #getAssetGroup()
	 * @generated
	 */
	EReference getAssetGroup_Asset();

	/**
	 * Returns the meta object for class '{@link fr.inria.fabmodeling.fabm.model.fabm.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for class '{@link fr.inria.fabmodeling.fabm.model.fabm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.fabmodeling.fabm.model.fabm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.fabmodeling.fabm.model.fabm.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.inria.fabmodeling.fabm.model.fabm.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FabmFactory getFabmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.fabmodeling.fabm.model.fabm.impl.FabModelImpl <em>Fab Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabModelImpl
		 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabmPackageImpl#getFabModel()
		 * @generated
		 */
		EClass FAB_MODEL = eINSTANCE.getFabModel();

		/**
		 * The meta object literal for the '<em><b>Asset Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAB_MODEL__ASSET_GROUPS = eINSTANCE.getFabModel_AssetGroups();

		/**
		 * The meta object literal for the '{@link fr.inria.fabmodeling.fabm.model.fabm.impl.AssetGroupImpl <em>Asset Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.AssetGroupImpl
		 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabmPackageImpl#getAssetGroup()
		 * @generated
		 */
		EClass ASSET_GROUP = eINSTANCE.getAssetGroup();

		/**
		 * The meta object literal for the '<em><b>Asset Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_GROUP__ASSET_GROUPS = eINSTANCE.getAssetGroup_AssetGroups();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_GROUP__ASSET = eINSTANCE.getAssetGroup_Asset();

		/**
		 * The meta object literal for the '{@link fr.inria.fabmodeling.fabm.model.fabm.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.AssetImpl
		 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabmPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '{@link fr.inria.fabmodeling.fabm.model.fabm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.NamedElementImpl
		 * @see fr.inria.fabmodeling.fabm.model.fabm.impl.FabmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

	}

} //FabmPackage
