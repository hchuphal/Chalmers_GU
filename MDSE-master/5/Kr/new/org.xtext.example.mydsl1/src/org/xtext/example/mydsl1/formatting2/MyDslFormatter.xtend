/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl1.formatting2

import brickModel2.AbstractBrick
import brickModel2.BrickModel
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl1.services.MyDslGrammarAccess

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(BrickModel brickModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (brickElement : brickModel.contains) {
			brickElement.format
		}
		brickModel.limits.format
	}

	def dispatch void format(AbstractBrick abstractBrick, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		abstractBrick.dimensions.format
	}
	
	// TODO: implement for ComplexBrick
}
