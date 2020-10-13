/**
 * generated by XText 2.16.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterators;
import manufacturingSystem.ManufacturingSystem;
import manufacturingSystem.ManufacturingSystemElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("digraph G {");
    _builder.newLine();
    {
      Iterable<ManufacturingSystem> _iterable = IteratorExtensions.<ManufacturingSystem>toIterable(Iterators.<ManufacturingSystem>filter(resource.getAllContents(), ManufacturingSystem.class));
      for(final ManufacturingSystem m : _iterable) {
        {
          int _size = m.getConsistsOf().size();
          boolean _greaterThan = (_size > 0);
          if (_greaterThan) {
            {
              int _size_1 = m.getConsistsOf().size();
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
              for(final Integer i : _doubleDotLessThan) {
                String _name = m.getName();
                _builder.append(_name);
                _builder.append(" -> ");
                String _name_1 = m.getConsistsOf().get((i).intValue()).getName();
                _builder.append(_name_1);
                _builder.newLineIfNotEmpty();
              }
            }
            String _name_2 = m.getName();
            _builder.append(_name_2);
            _builder.append(" -> ");
            String _name_3 = m.getResponsible().getName();
            _builder.append(_name_3);
            _builder.newLineIfNotEmpty();
          }
        }
        {
          int _size_2 = m.getUses().size();
          boolean _greaterThan_1 = (_size_2 > 0);
          if (_greaterThan_1) {
            {
              int _size_3 = m.getUses().size();
              ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_3, true);
              for(final Integer j : _doubleDotLessThan_1) {
                String _name_4 = m.getName();
                _builder.append(_name_4);
                _builder.append(" -> ");
                String _name_5 = m.getUses().get((j).intValue()).getName();
                _builder.append(_name_5);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    {
      Iterable<ManufacturingSystemElement> _iterable_1 = IteratorExtensions.<ManufacturingSystemElement>toIterable(Iterators.<ManufacturingSystemElement>filter(resource.getAllContents(), ManufacturingSystemElement.class));
      for(final ManufacturingSystemElement e : _iterable_1) {
        {
          int _size_4 = e.getTransition().size();
          boolean _greaterThan_2 = (_size_4 > 0);
          if (_greaterThan_2) {
            {
              int _size_5 = e.getTransition().size();
              ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_5, true);
              for(final Integer k : _doubleDotLessThan_2) {
                String _name_6 = e.getName();
                _builder.append(_name_6);
                _builder.append(" -> ");
                String _name_7 = e.getTransition().get((k).intValue()).getName();
                _builder.append(_name_7);
                _builder.newLineIfNotEmpty();
              }
            }
            String _name_8 = e.getName();
            _builder.append(_name_8);
            _builder.append(" -> ");
            String _name_9 = e.getResponsible().getName();
            _builder.append(_name_9);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    fsa.generateFile("ManuSysStg.gv", _builder);
  }
}