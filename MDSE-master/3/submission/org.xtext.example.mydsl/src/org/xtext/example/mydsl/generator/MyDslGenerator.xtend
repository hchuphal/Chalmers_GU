/*
 * generated by XText 2.16.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import manufacturingSystem.ManufacturingSystem
import manufacturingSystem.ManufacturingSystemElement
import java.util.*; 

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        fsa.generateFile('ManuSysStg.gv',
            '''digraph G {
            	«FOR m : resource.allContents.filter(ManufacturingSystem).toIterable»
                    «IF(m.consistsOf.size() > 0)»
                        «FOR i : 0 ..< m.consistsOf.size()»
                        	«m.name » -> «m.consistsOf.get(i).name»
                        «ENDFOR»
                        «m.name » -> «m.responsible.name»
                     «ENDIF»
                     «IF(m.uses.size() > 0)»
                        «FOR j : 0 ..< m.uses.size()»
                 		     «m.name » -> «m.uses.get(j).name»
                        «ENDFOR»
                    «ENDIF»
               «ENDFOR»

               «FOR e : resource.allContents.filter(ManufacturingSystemElement).toIterable»
                    «IF(e.transition.size() > 0)»
                        «FOR k : 0 ..< e.transition.size()»
				               «e.name» -> «e.transition.get(k).name»
                        «ENDFOR»
					 «e.name » -> «e.responsible.name»
                    «ENDIF»
               «ENDFOR»
            }
            '''
            )
    }   
}

