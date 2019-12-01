/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.mydsl1.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class BrickModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.BrickModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBrickModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLimitsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLimitsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLimitsLimitsParserRuleCall_4_0 = (RuleCall)cLimitsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cContainsAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cContainsBrickElementParserRuleCall_5_0_0 = (RuleCall)cContainsAssignment_5_0.eContents().get(0);
		private final Assignment cContainsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cContainsBrickElementParserRuleCall_5_1_0 = (RuleCall)cContainsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//BrickModel:
		//	'BrickModel'
		//	name=EString
		//	'{'
		//	'limits' limits=Limits (contains+=BrickElement contains+=BrickElement*)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'BrickModel' name=EString '{' 'limits' limits=Limits (contains+=BrickElement contains+=BrickElement*)? '}'
		public Group getGroup() { return cGroup; }
		
		//'BrickModel'
		public Keyword getBrickModelKeyword_0() { return cBrickModelKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'limits'
		public Keyword getLimitsKeyword_3() { return cLimitsKeyword_3; }
		
		//limits=Limits
		public Assignment getLimitsAssignment_4() { return cLimitsAssignment_4; }
		
		//Limits
		public RuleCall getLimitsLimitsParserRuleCall_4_0() { return cLimitsLimitsParserRuleCall_4_0; }
		
		//(contains+=BrickElement contains+=BrickElement*)?
		public Group getGroup_5() { return cGroup_5; }
		
		//contains+=BrickElement
		public Assignment getContainsAssignment_5_0() { return cContainsAssignment_5_0; }
		
		//BrickElement
		public RuleCall getContainsBrickElementParserRuleCall_5_0_0() { return cContainsBrickElementParserRuleCall_5_0_0; }
		
		//contains+=BrickElement*
		public Assignment getContainsAssignment_5_1() { return cContainsAssignment_5_1; }
		
		//BrickElement
		public RuleCall getContainsBrickElementParserRuleCall_5_1_0() { return cContainsBrickElementParserRuleCall_5_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class BrickElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.BrickElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAbstractBrickParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComplexBrickParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//BrickElement:
		//	AbstractBrick | ComplexBrick;
		@Override public ParserRule getRule() { return rule; }
		
		//AbstractBrick | ComplexBrick
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AbstractBrick
		public RuleCall getAbstractBrickParserRuleCall_0() { return cAbstractBrickParserRuleCall_0; }
		
		//ComplexBrick
		public RuleCall getComplexBrickParserRuleCall_1() { return cComplexBrickParserRuleCall_1; }
	}
	public class LimitsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.Limits");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLimitsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLimitsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWidthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cWidthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cWidthEIntParserRuleCall_3_1_0 = (RuleCall)cWidthAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cHeightKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLengthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cLengthEIntParserRuleCall_4_1_0 = (RuleCall)cLengthAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Limits:
		//	{Limits}
		//	'Limits'
		//	'{' ('width' width=EInt)? ('height' length=EInt)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Limits} 'Limits' '{' ('width' width=EInt)? ('height' length=EInt)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Limits}
		public Action getLimitsAction_0() { return cLimitsAction_0; }
		
		//'Limits'
		public Keyword getLimitsKeyword_1() { return cLimitsKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('width' width=EInt)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'width'
		public Keyword getWidthKeyword_3_0() { return cWidthKeyword_3_0; }
		
		//width=EInt
		public Assignment getWidthAssignment_3_1() { return cWidthAssignment_3_1; }
		
		//EInt
		public RuleCall getWidthEIntParserRuleCall_3_1_0() { return cWidthEIntParserRuleCall_3_1_0; }
		
		//('height' length=EInt)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'height'
		public Keyword getHeightKeyword_4_0() { return cHeightKeyword_4_0; }
		
		//length=EInt
		public Assignment getLengthAssignment_4_1() { return cLengthAssignment_4_1; }
		
		//EInt
		public RuleCall getLengthEIntParserRuleCall_4_1_0() { return cLengthEIntParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class SizeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.Size");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSizeAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cHeightKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cBrickHeightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cBrickHeightEIntParserRuleCall_1_1_0 = (RuleCall)cBrickHeightAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cWidthKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cBrickWidthAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cBrickWidthEIntParserRuleCall_2_1_0 = (RuleCall)cBrickWidthAssignment_2_1.eContents().get(0);
		
		//Size:
		//	{Size} ('height' brickHeight=EInt)? ('width' brickWidth=EInt)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Size} ('height' brickHeight=EInt)? ('width' brickWidth=EInt)?
		public Group getGroup() { return cGroup; }
		
		//{Size}
		public Action getSizeAction_0() { return cSizeAction_0; }
		
		//('height' brickHeight=EInt)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'height'
		public Keyword getHeightKeyword_1_0() { return cHeightKeyword_1_0; }
		
		//brickHeight=EInt
		public Assignment getBrickHeightAssignment_1_1() { return cBrickHeightAssignment_1_1; }
		
		//EInt
		public RuleCall getBrickHeightEIntParserRuleCall_1_1_0() { return cBrickHeightEIntParserRuleCall_1_1_0; }
		
		//('width' brickWidth=EInt)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'width'
		public Keyword getWidthKeyword_2_0() { return cWidthKeyword_2_0; }
		
		//brickWidth=EInt
		public Assignment getBrickWidthAssignment_2_1() { return cBrickWidthAssignment_2_1; }
		
		//EInt
		public RuleCall getBrickWidthEIntParserRuleCall_2_1_0() { return cBrickWidthEIntParserRuleCall_2_1_0; }
	}
	public class AbstractBrickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.AbstractBrick");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAbstractBrickAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAbstractKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cBrickKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameEStringParserRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cDimensionsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Alternatives cAlternatives_5_1 = (Alternatives)cGroup_5.eContents().get(1);
		private final Group cGroup_5_1_0 = (Group)cAlternatives_5_1.eContents().get(0);
		private final Assignment cGetSizeAssignment_5_1_0_0 = (Assignment)cGroup_5_1_0.eContents().get(0);
		private final CrossReference cGetSizeBrickElementCrossReference_5_1_0_0_0 = (CrossReference)cGetSizeAssignment_5_1_0_0.eContents().get(0);
		private final RuleCall cGetSizeBrickElementEStringParserRuleCall_5_1_0_0_0_1 = (RuleCall)cGetSizeBrickElementCrossReference_5_1_0_0_0.eContents().get(1);
		private final Keyword cHeightKeyword_5_1_0_1 = (Keyword)cGroup_5_1_0.eContents().get(1);
		private final Assignment cGetSizeAssignment_5_1_0_2 = (Assignment)cGroup_5_1_0.eContents().get(2);
		private final CrossReference cGetSizeBrickElementCrossReference_5_1_0_2_0 = (CrossReference)cGetSizeAssignment_5_1_0_2.eContents().get(0);
		private final RuleCall cGetSizeBrickElementEStringParserRuleCall_5_1_0_2_0_1 = (RuleCall)cGetSizeBrickElementCrossReference_5_1_0_2_0.eContents().get(1);
		private final Keyword cWidthKeyword_5_1_0_3 = (Keyword)cGroup_5_1_0.eContents().get(3);
		private final Assignment cDimensionsAssignment_5_1_1 = (Assignment)cAlternatives_5_1.eContents().get(1);
		private final RuleCall cDimensionsSizeParserRuleCall_5_1_1_0 = (RuleCall)cDimensionsAssignment_5_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//AbstractBrick:
		//	{AbstractBrick}
		//	'abstract' 'Brick'
		//	name=EString
		//	'{' ('Dimensions' (getSize+=[BrickElement|EString] '.height' getSize+=[BrickElement|EString] '.width' |
		//	dimensions=Size))?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{AbstractBrick} 'abstract' 'Brick' name=EString '{' ('Dimensions' (getSize+=[BrickElement|EString] '.height'
		//getSize+=[BrickElement|EString] '.width' | dimensions=Size))? '}'
		public Group getGroup() { return cGroup; }
		
		//{AbstractBrick}
		public Action getAbstractBrickAction_0() { return cAbstractBrickAction_0; }
		
		//'abstract'
		public Keyword getAbstractKeyword_1() { return cAbstractKeyword_1; }
		
		//'Brick'
		public Keyword getBrickKeyword_2() { return cBrickKeyword_2; }
		
		//name=EString
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_3_0() { return cNameEStringParserRuleCall_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//('Dimensions' (getSize+=[BrickElement|EString] '.height' getSize+=[BrickElement|EString] '.width' | dimensions=Size))?
		public Group getGroup_5() { return cGroup_5; }
		
		//'Dimensions'
		public Keyword getDimensionsKeyword_5_0() { return cDimensionsKeyword_5_0; }
		
		//getSize+=[BrickElement|EString] '.height' getSize+=[BrickElement|EString] '.width' | dimensions=Size
		public Alternatives getAlternatives_5_1() { return cAlternatives_5_1; }
		
		//getSize+=[BrickElement|EString] '.height' getSize+=[BrickElement|EString] '.width'
		public Group getGroup_5_1_0() { return cGroup_5_1_0; }
		
		//getSize+=[BrickElement|EString]
		public Assignment getGetSizeAssignment_5_1_0_0() { return cGetSizeAssignment_5_1_0_0; }
		
		//[BrickElement|EString]
		public CrossReference getGetSizeBrickElementCrossReference_5_1_0_0_0() { return cGetSizeBrickElementCrossReference_5_1_0_0_0; }
		
		//EString
		public RuleCall getGetSizeBrickElementEStringParserRuleCall_5_1_0_0_0_1() { return cGetSizeBrickElementEStringParserRuleCall_5_1_0_0_0_1; }
		
		//'.height'
		public Keyword getHeightKeyword_5_1_0_1() { return cHeightKeyword_5_1_0_1; }
		
		//getSize+=[BrickElement|EString]
		public Assignment getGetSizeAssignment_5_1_0_2() { return cGetSizeAssignment_5_1_0_2; }
		
		//[BrickElement|EString]
		public CrossReference getGetSizeBrickElementCrossReference_5_1_0_2_0() { return cGetSizeBrickElementCrossReference_5_1_0_2_0; }
		
		//EString
		public RuleCall getGetSizeBrickElementEStringParserRuleCall_5_1_0_2_0_1() { return cGetSizeBrickElementEStringParserRuleCall_5_1_0_2_0_1; }
		
		//'.width'
		public Keyword getWidthKeyword_5_1_0_3() { return cWidthKeyword_5_1_0_3; }
		
		//dimensions=Size
		public Assignment getDimensionsAssignment_5_1_1() { return cDimensionsAssignment_5_1_1; }
		
		//Size
		public RuleCall getDimensionsSizeParserRuleCall_5_1_1_0() { return cDimensionsSizeParserRuleCall_5_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ComplexBrickElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.ComplexBrick");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComplexBrickAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBrickKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cCreateBrickKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cDimensionsKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cGetSizeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cGetSizeBrickElementCrossReference_8_0 = (CrossReference)cGetSizeAssignment_8.eContents().get(0);
		private final RuleCall cGetSizeBrickElementEStringParserRuleCall_8_0_1 = (RuleCall)cGetSizeBrickElementCrossReference_8_0.eContents().get(1);
		private final Keyword cCommaKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cGetSizeAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cGetSizeBrickElementCrossReference_10_0 = (CrossReference)cGetSizeAssignment_10.eContents().get(0);
		private final RuleCall cGetSizeBrickElementIDTerminalRuleCall_10_0_1 = (RuleCall)cGetSizeBrickElementCrossReference_10_0.eContents().get(1);
		private final Keyword cCommaKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cHasPositionAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cHasPositionPositionParserRuleCall_12_0 = (RuleCall)cHasPositionAssignment_12.eContents().get(0);
		private final Group cGroup_13 = (Group)cGroup.eContents().get(13);
		private final Keyword cCommaKeyword_13_0 = (Keyword)cGroup_13.eContents().get(0);
		private final Assignment cHasPositionAssignment_13_1 = (Assignment)cGroup_13.eContents().get(1);
		private final RuleCall cHasPositionPositionParserRuleCall_13_1_0 = (RuleCall)cHasPositionAssignment_13_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cRightCurlyBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cRightCurlyBracketKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//ComplexBrick:
		//	{ComplexBrick}
		//	'Brick'
		//	name=EString
		//	'{'
		//	'createBrick' '{' 'Dimensions' '(' getSize+=[BrickElement|EString] ',' getSize+=[BrickElement] ','
		//	hasPosition+=Position ("," hasPosition+=Position)* ')' '}'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{ComplexBrick} 'Brick' name=EString '{' 'createBrick' '{' 'Dimensions' '(' getSize+=[BrickElement|EString] ','
		//getSize+=[BrickElement] ',' hasPosition+=Position ("," hasPosition+=Position)* ')' '}' '}'
		public Group getGroup() { return cGroup; }
		
		//{ComplexBrick}
		public Action getComplexBrickAction_0() { return cComplexBrickAction_0; }
		
		//'Brick'
		public Keyword getBrickKeyword_1() { return cBrickKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//'createBrick'
		public Keyword getCreateBrickKeyword_4() { return cCreateBrickKeyword_4; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//'Dimensions'
		public Keyword getDimensionsKeyword_6() { return cDimensionsKeyword_6; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_7() { return cLeftParenthesisKeyword_7; }
		
		//getSize+=[BrickElement|EString]
		public Assignment getGetSizeAssignment_8() { return cGetSizeAssignment_8; }
		
		//[BrickElement|EString]
		public CrossReference getGetSizeBrickElementCrossReference_8_0() { return cGetSizeBrickElementCrossReference_8_0; }
		
		//EString
		public RuleCall getGetSizeBrickElementEStringParserRuleCall_8_0_1() { return cGetSizeBrickElementEStringParserRuleCall_8_0_1; }
		
		//','
		public Keyword getCommaKeyword_9() { return cCommaKeyword_9; }
		
		//getSize+=[BrickElement]
		public Assignment getGetSizeAssignment_10() { return cGetSizeAssignment_10; }
		
		//[BrickElement]
		public CrossReference getGetSizeBrickElementCrossReference_10_0() { return cGetSizeBrickElementCrossReference_10_0; }
		
		//ID
		public RuleCall getGetSizeBrickElementIDTerminalRuleCall_10_0_1() { return cGetSizeBrickElementIDTerminalRuleCall_10_0_1; }
		
		//','
		public Keyword getCommaKeyword_11() { return cCommaKeyword_11; }
		
		//hasPosition+=Position
		public Assignment getHasPositionAssignment_12() { return cHasPositionAssignment_12; }
		
		//Position
		public RuleCall getHasPositionPositionParserRuleCall_12_0() { return cHasPositionPositionParserRuleCall_12_0; }
		
		//("," hasPosition+=Position)*
		public Group getGroup_13() { return cGroup_13; }
		
		//","
		public Keyword getCommaKeyword_13_0() { return cCommaKeyword_13_0; }
		
		//hasPosition+=Position
		public Assignment getHasPositionAssignment_13_1() { return cHasPositionAssignment_13_1; }
		
		//Position
		public RuleCall getHasPositionPositionParserRuleCall_13_1_0() { return cHasPositionPositionParserRuleCall_13_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_14() { return cRightParenthesisKeyword_14; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_15() { return cRightCurlyBracketKeyword_15; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_16() { return cRightCurlyBracketKeyword_16; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	public class PositionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.Position");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPositionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cCoordinatesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCoordinatesBrickPositionEnumRuleCall_1_0 = (RuleCall)cCoordinatesAssignment_1.eContents().get(0);
		
		//Position:
		//	{Position} coordinates=BrickPosition?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Position} coordinates=BrickPosition?
		public Group getGroup() { return cGroup; }
		
		//{Position}
		public Action getPositionAction_0() { return cPositionAction_0; }
		
		//coordinates=BrickPosition?
		public Assignment getCoordinatesAssignment_1() { return cCoordinatesAssignment_1; }
		
		//BrickPosition
		public RuleCall getCoordinatesBrickPositionEnumRuleCall_1_0() { return cCoordinatesBrickPositionEnumRuleCall_1_0; }
	}
	
	public class BrickPositionElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.BrickPosition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLeftEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLeftLeftKeyword_0_0 = (Keyword)cLeftEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cRightEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cRightRightKeyword_1_0 = (Keyword)cRightEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cCenterEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cCenterCenterKeyword_2_0 = (Keyword)cCenterEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum BrickPosition:
		//	Left | Right | Center;
		public EnumRule getRule() { return rule; }
		
		//Left | Right | Center
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Left
		public EnumLiteralDeclaration getLeftEnumLiteralDeclaration_0() { return cLeftEnumLiteralDeclaration_0; }
		
		//'Left'
		public Keyword getLeftLeftKeyword_0_0() { return cLeftLeftKeyword_0_0; }
		
		//Right
		public EnumLiteralDeclaration getRightEnumLiteralDeclaration_1() { return cRightEnumLiteralDeclaration_1; }
		
		//'Right'
		public Keyword getRightRightKeyword_1_0() { return cRightRightKeyword_1_0; }
		
		//Center
		public EnumLiteralDeclaration getCenterEnumLiteralDeclaration_2() { return cCenterEnumLiteralDeclaration_2; }
		
		//'Center'
		public Keyword getCenterCenterKeyword_2_0() { return cCenterCenterKeyword_2_0; }
	}
	
	private final BrickModelElements pBrickModel;
	private final BrickElementElements pBrickElement;
	private final LimitsElements pLimits;
	private final EStringElements pEString;
	private final SizeElements pSize;
	private final AbstractBrickElements pAbstractBrick;
	private final ComplexBrickElements pComplexBrick;
	private final EIntElements pEInt;
	private final PositionElements pPosition;
	private final BrickPositionElements eBrickPosition;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pBrickModel = new BrickModelElements();
		this.pBrickElement = new BrickElementElements();
		this.pLimits = new LimitsElements();
		this.pEString = new EStringElements();
		this.pSize = new SizeElements();
		this.pAbstractBrick = new AbstractBrickElements();
		this.pComplexBrick = new ComplexBrickElements();
		this.pEInt = new EIntElements();
		this.pPosition = new PositionElements();
		this.eBrickPosition = new BrickPositionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl1.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//BrickModel:
	//	'BrickModel'
	//	name=EString
	//	'{'
	//	'limits' limits=Limits (contains+=BrickElement contains+=BrickElement*)?
	//	'}';
	public BrickModelElements getBrickModelAccess() {
		return pBrickModel;
	}
	
	public ParserRule getBrickModelRule() {
		return getBrickModelAccess().getRule();
	}
	
	//BrickElement:
	//	AbstractBrick | ComplexBrick;
	public BrickElementElements getBrickElementAccess() {
		return pBrickElement;
	}
	
	public ParserRule getBrickElementRule() {
		return getBrickElementAccess().getRule();
	}
	
	//Limits:
	//	{Limits}
	//	'Limits'
	//	'{' ('width' width=EInt)? ('height' length=EInt)?
	//	'}';
	public LimitsElements getLimitsAccess() {
		return pLimits;
	}
	
	public ParserRule getLimitsRule() {
		return getLimitsAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Size:
	//	{Size} ('height' brickHeight=EInt)? ('width' brickWidth=EInt)?;
	public SizeElements getSizeAccess() {
		return pSize;
	}
	
	public ParserRule getSizeRule() {
		return getSizeAccess().getRule();
	}
	
	//AbstractBrick:
	//	{AbstractBrick}
	//	'abstract' 'Brick'
	//	name=EString
	//	'{' ('Dimensions' (getSize+=[BrickElement|EString] '.height' getSize+=[BrickElement|EString] '.width' |
	//	dimensions=Size))?
	//	'}';
	public AbstractBrickElements getAbstractBrickAccess() {
		return pAbstractBrick;
	}
	
	public ParserRule getAbstractBrickRule() {
		return getAbstractBrickAccess().getRule();
	}
	
	//ComplexBrick:
	//	{ComplexBrick}
	//	'Brick'
	//	name=EString
	//	'{'
	//	'createBrick' '{' 'Dimensions' '(' getSize+=[BrickElement|EString] ',' getSize+=[BrickElement] ','
	//	hasPosition+=Position ("," hasPosition+=Position)* ')' '}'
	//	'}';
	public ComplexBrickElements getComplexBrickAccess() {
		return pComplexBrick;
	}
	
	public ParserRule getComplexBrickRule() {
		return getComplexBrickAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//Position:
	//	{Position} coordinates=BrickPosition?;
	public PositionElements getPositionAccess() {
		return pPosition;
	}
	
	public ParserRule getPositionRule() {
		return getPositionAccess().getRule();
	}
	
	//enum BrickPosition:
	//	Left | Right | Center;
	public BrickPositionElements getBrickPositionAccess() {
		return eBrickPosition;
	}
	
	public EnumRule getBrickPositionRule() {
		return getBrickPositionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
