/**
 *
 * $Id$
 */
package manufacturingSystem.validation;

import manufacturingSystem.BinaryType;
import manufacturingSystem.InputCondition;

/**
 * A sample validator interface for {@link manufacturingSystem.BinaryCondition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BinaryConditionValidator {
	boolean validate();

	boolean validateLeft(InputCondition value);
	boolean validateRight(InputCondition value);
	boolean validateType(BinaryType value);
}
