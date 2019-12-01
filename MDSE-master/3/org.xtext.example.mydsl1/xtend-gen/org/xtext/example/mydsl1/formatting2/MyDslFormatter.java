/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl1.formatting2;

import brickModel2.AbstractBrick;
import brickModel2.BrickElement;
import brickModel2.BrickModel;
import brickModel2.Limits;
import brickModel2.Size;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final BrickModel brickModel, @Extension final IFormattableDocument document) {
    EList<BrickElement> _contains = brickModel.getContains();
    for (final BrickElement brickElement : _contains) {
      document.<BrickElement>format(brickElement);
    }
    document.<Limits>format(brickModel.getLimits());
  }
  
  protected void _format(final AbstractBrick abstractBrick, @Extension final IFormattableDocument document) {
    document.<Size>format(abstractBrick.getDimensions());
  }
  
  public void format(final Object abstractBrick, final IFormattableDocument document) {
    if (abstractBrick instanceof XtextResource) {
      _format((XtextResource)abstractBrick, document);
      return;
    } else if (abstractBrick instanceof AbstractBrick) {
      _format((AbstractBrick)abstractBrick, document);
      return;
    } else if (abstractBrick instanceof BrickModel) {
      _format((BrickModel)abstractBrick, document);
      return;
    } else if (abstractBrick instanceof EObject) {
      _format((EObject)abstractBrick, document);
      return;
    } else if (abstractBrick == null) {
      _format((Void)null, document);
      return;
    } else if (abstractBrick != null) {
      _format(abstractBrick, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(abstractBrick, document).toString());
    }
  }
}
