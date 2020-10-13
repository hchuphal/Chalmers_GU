/**
 *
 * $Id$
 */
package manufacturingSystem.validation;

import manufacturingSystem.ManufacturingStep;
import manufacturingSystem.Storage;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link manufacturingSystem.ManufacturingSystem}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ManufacturingSystemValidator {
	boolean validate();

	boolean validateManufacturingsteps(EList<ManufacturingStep> value);
	boolean validateStorageFacilities(Storage value);
	boolean validateEndpoint(Storage value);
	boolean validateStartpoint(Storage value);
}