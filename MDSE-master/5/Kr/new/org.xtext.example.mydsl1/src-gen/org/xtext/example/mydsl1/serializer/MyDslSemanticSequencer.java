/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl1.serializer;

import brickModel2.AbstractBrick;
import brickModel2.BrickModel;
import brickModel2.BrickModel2Package;
import brickModel2.ComplexBrick;
import brickModel2.Limits;
import brickModel2.Position;
import brickModel2.Size;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BrickModel2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BrickModel2Package.ABSTRACT_BRICK:
				sequence_AbstractBrick(context, (AbstractBrick) semanticObject); 
				return; 
			case BrickModel2Package.BRICK_MODEL:
				sequence_BrickModel(context, (BrickModel) semanticObject); 
				return; 
			case BrickModel2Package.COMPLEX_BRICK:
				sequence_ComplexBrick(context, (ComplexBrick) semanticObject); 
				return; 
			case BrickModel2Package.LIMITS:
				sequence_Limits(context, (Limits) semanticObject); 
				return; 
			case BrickModel2Package.POSITION:
				sequence_Position(context, (Position) semanticObject); 
				return; 
			case BrickModel2Package.SIZE:
				sequence_Size(context, (Size) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     BrickElement returns AbstractBrick
	 *     AbstractBrick returns AbstractBrick
	 *
	 * Constraint:
	 *     (name=EString ((getSize+=[BrickElement|EString] getSize+=[BrickElement|EString]) | dimensions=Size)?)
	 */
	protected void sequence_AbstractBrick(ISerializationContext context, AbstractBrick semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BrickModel returns BrickModel
	 *
	 * Constraint:
	 *     (name=EString limits=Limits (contains+=BrickElement contains+=BrickElement*)?)
	 */
	protected void sequence_BrickModel(ISerializationContext context, BrickModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BrickElement returns ComplexBrick
	 *     ComplexBrick returns ComplexBrick
	 *
	 * Constraint:
	 *     (name=EString getSize+=[BrickElement|EString] getSize+=[BrickElement|ID] hasPosition+=Position hasPosition+=Position*)
	 */
	protected void sequence_ComplexBrick(ISerializationContext context, ComplexBrick semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Limits returns Limits
	 *
	 * Constraint:
	 *     (width=EInt? length=EInt?)
	 */
	protected void sequence_Limits(ISerializationContext context, Limits semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Position returns Position
	 *
	 * Constraint:
	 *     coordinates=BrickPosition?
	 */
	protected void sequence_Position(ISerializationContext context, Position semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Size returns Size
	 *
	 * Constraint:
	 *     (brickHeight=EInt? brickWidth=EInt?)
	 */
	protected void sequence_Size(ISerializationContext context, Size semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
