/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl1.generator;

import brickModel2.ComplexBrick;
import com.google.common.collect.Iterators;
import java.util.Collections;
import java.util.Set;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
    final Set<String> mySet = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("Center", "Center"));
    _builder.newLineIfNotEmpty();
    {
      Iterable<ComplexBrick> _iterable = IteratorExtensions.<ComplexBrick>toIterable(Iterators.<ComplexBrick>filter(resource.getAllContents(), ComplexBrick.class));
      for(final ComplexBrick m : _iterable) {
        int xAxis = 0;
        _builder.newLineIfNotEmpty();
        int yAxis = 0;
        _builder.newLineIfNotEmpty();
        int zAxis = 0;
        _builder.newLineIfNotEmpty();
        int i = 0;
        _builder.newLineIfNotEmpty();
        {
          int _size = m.getGetSize().size();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
          for(final Integer total : _doubleDotLessThan) {
            {
              int _brickHeight = m.getGetSize().get(i).getDimensions().getBrickHeight();
              boolean _greaterEqualsThan = (_brickHeight >= 1);
              if (_greaterEqualsThan) {
                {
                  int _brickHeight_1 = m.getGetSize().get(i).getDimensions().getBrickHeight();
                  ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _brickHeight_1, true);
                  for(final Integer y : _doubleDotLessThan_1) {
                    _builder.append("tube = new Cylinder(0.75, 1, 1, 1);");
                    _builder.newLine();
                    _builder.append("pos = new Vec3(");
                    _builder.append((xAxis + 0.75));
                    _builder.append(", ");
                    _builder.append(zAxis);
                    _builder.append(", ");
                    _builder.append(((((y).intValue() * 2.75) + 0.75) + yAxis));
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));\t\t\t\t\t ");
                    _builder.newLine();
                    {
                      int _brickWidth = m.getGetSize().get(i).getDimensions().getBrickWidth();
                      boolean _greaterThan = (_brickWidth > 1);
                      if (_greaterThan) {
                        {
                          int _brickWidth_1 = m.getGetSize().get(i).getDimensions().getBrickWidth();
                          ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(1, _brickWidth_1, true);
                          for(final Integer x : _doubleDotLessThan_2) {
                            _builder.append("tube = new Cylinder(0.75, 1, 1, 1);");
                            _builder.newLine();
                            _builder.append("pos = new Vec3(");
                            _builder.append(((((x).intValue() * 2.75) + 0.75) + xAxis));
                            _builder.append(", ");
                            _builder.append(zAxis);
                            _builder.append(", ");
                            _builder.append(((((y).intValue() * 2.75) + 0.75) + yAxis));
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                            _builder.append("script.addObject(tube, new CoordinateSystem(pos, 0, 0, 0));");
                            _builder.newLine();
                          }
                        }
                      }
                    }
                  }
                }
                _builder.newLine();
              }
            }
            _builder.append("//Top Line");
            _builder.newLine();
            {
              int _brickWidth_2 = m.getGetSize().get(i).getDimensions().getBrickWidth();
              ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(0, _brickWidth_2, true);
              for(final Integer x_1 : _doubleDotLessThan_3) {
                _builder.append("//bottom wall");
                _builder.newLine();
                _builder.append("cube = new Cube(2.9, 2, 0.25);");
                _builder.newLine();
                _builder.append("pos = new Vec3(");
                _builder.append((((2.75 * (x_1).intValue()) + 0.75) + xAxis));
                _builder.append(", ");
                _builder.append((1.4 + zAxis));
                _builder.append(",");
                _builder.append((yAxis - 0.6));
                _builder.append(" );");
                _builder.newLineIfNotEmpty();
                _builder.append("script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));");
                _builder.newLine();
                _builder.newLine();
                _builder.append("//top wall");
                _builder.newLine();
                _builder.append("cube = new Cube(2.9, 2, 0.25);");
                _builder.newLine();
                _builder.append("pos = new Vec3(");
                _builder.append((((2.75 * (x_1).intValue()) + 0.75) + xAxis));
                _builder.append(",");
                _builder.append((1.4 + zAxis));
                _builder.append(", ");
                int _brickHeight_2 = m.getGetSize().get(i).getDimensions().getBrickHeight();
                double _multiply = (2.75 * _brickHeight_2);
                double _minus = (_multiply - 0.6);
                double _plus = (_minus + yAxis);
                _builder.append(_plus);
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("\t                ");
                _builder.append("script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));");
                _builder.newLine();
              }
            }
            {
              int _brickHeight_3 = m.getGetSize().get(i).getDimensions().getBrickHeight();
              ExclusiveRange _doubleDotLessThan_4 = new ExclusiveRange(0, _brickHeight_3, true);
              for(final Integer y_1 : _doubleDotLessThan_4) {
                _builder.append("//left wall");
                _builder.newLine();
                _builder.append("cube = new Cube(0.25, 2, 2.9);");
                _builder.newLine();
                _builder.append("pos = new Vec3(");
                _builder.append((xAxis - 0.6));
                _builder.append(", ");
                _builder.append((1.4 + zAxis));
                _builder.append(",");
                _builder.append((((2.75 * (y_1).intValue()) + 0.85) + yAxis));
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));");
                _builder.newLine();
                _builder.newLine();
                _builder.append("//Right wall");
                _builder.newLine();
                _builder.append("cube = new Cube(0.25, 2, 2.9);");
                _builder.newLine();
                _builder.append("pos = new Vec3(");
                int _brickWidth_3 = m.getGetSize().get(i).getDimensions().getBrickWidth();
                double _multiply_1 = (2.75 * _brickWidth_3);
                double _minus_1 = (_multiply_1 - 0.6);
                _builder.append(_minus_1);
                _builder.append(", ");
                _builder.append((1.4 + zAxis));
                _builder.append(",");
                _builder.append((((2.75 * (y_1).intValue()) + 0.85) + yAxis));
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("script.addObject(cube, new CoordinateSystem(pos, 0, 0, 0));");
                _builder.newLine();
                _builder.newLine();
              }
            }
            _builder.append("// Connect other Brick to :: x= ");
            _builder.append(xAxis = m.getHasPosition().get(i).getX());
            _builder.append(" y= ");
            _builder.append(yAxis = m.getHasPosition().get(i).getY());
            _builder.append(" z=");
            _builder.append(zAxis = (zAxis + 2));
            _builder.append(" for brick No ");
            int _plusPlus = i++;
            _builder.append(_plusPlus);
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("                  ");
        _builder.newLine();
      }
    }
    fsa.generateFile("LegoBrick.gv", _builder);
  }
}
