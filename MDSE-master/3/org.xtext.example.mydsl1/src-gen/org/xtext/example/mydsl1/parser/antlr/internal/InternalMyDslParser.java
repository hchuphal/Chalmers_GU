package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BrickModel'", "'{'", "'limits'", "'}'", "'Dimensions'", "'width'", "'height'", "'abstract'", "'Brick'", "'.height'", "'.width'", "'createBrick'", "'('", "')'", "','", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "BrickModel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBrickModel"
    // InternalMyDsl.g:64:1: entryRuleBrickModel returns [EObject current=null] : iv_ruleBrickModel= ruleBrickModel EOF ;
    public final EObject entryRuleBrickModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrickModel = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleBrickModel= ruleBrickModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleBrickModel= ruleBrickModel EOF
            {
             newCompositeNode(grammarAccess.getBrickModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrickModel=ruleBrickModel();

            state._fsp--;

             current =iv_ruleBrickModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrickModel"


    // $ANTLR start "ruleBrickModel"
    // InternalMyDsl.g:71:1: ruleBrickModel returns [EObject current=null] : (otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleBrickModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_limits_4_0 = null;

        EObject lv_contains_5_0 = null;

        EObject lv_contains_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBrickModelAccess().getBrickModelKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBrickModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBrickModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBrickModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getBrickModelAccess().getLimitsKeyword_3());
            		
            // InternalMyDsl.g:110:3: ( (lv_limits_4_0= ruleLimits ) )
            // InternalMyDsl.g:111:4: (lv_limits_4_0= ruleLimits )
            {
            // InternalMyDsl.g:111:4: (lv_limits_4_0= ruleLimits )
            // InternalMyDsl.g:112:5: lv_limits_4_0= ruleLimits
            {

            					newCompositeNode(grammarAccess.getBrickModelAccess().getLimitsLimitsParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_limits_4_0=ruleLimits();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBrickModelRule());
            					}
            					set(
            						current,
            						"limits",
            						lv_limits_4_0,
            						"org.xtext.example.mydsl1.MyDsl.Limits");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:129:3: ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=19)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:130:4: ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )*
                    {
                    // InternalMyDsl.g:130:4: ( (lv_contains_5_0= ruleBrickElement ) )
                    // InternalMyDsl.g:131:5: (lv_contains_5_0= ruleBrickElement )
                    {
                    // InternalMyDsl.g:131:5: (lv_contains_5_0= ruleBrickElement )
                    // InternalMyDsl.g:132:6: lv_contains_5_0= ruleBrickElement
                    {

                    						newCompositeNode(grammarAccess.getBrickModelAccess().getContainsBrickElementParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_contains_5_0=ruleBrickElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBrickModelRule());
                    						}
                    						add(
                    							current,
                    							"contains",
                    							lv_contains_5_0,
                    							"org.xtext.example.mydsl1.MyDsl.BrickElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:149:4: ( (lv_contains_6_0= ruleBrickElement ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=18 && LA1_0<=19)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:150:5: (lv_contains_6_0= ruleBrickElement )
                    	    {
                    	    // InternalMyDsl.g:150:5: (lv_contains_6_0= ruleBrickElement )
                    	    // InternalMyDsl.g:151:6: lv_contains_6_0= ruleBrickElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getBrickModelAccess().getContainsBrickElementParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_contains_6_0=ruleBrickElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBrickModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"contains",
                    	    							lv_contains_6_0,
                    	    							"org.xtext.example.mydsl1.MyDsl.BrickElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getBrickModelAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrickModel"


    // $ANTLR start "entryRuleBrickElement"
    // InternalMyDsl.g:177:1: entryRuleBrickElement returns [EObject current=null] : iv_ruleBrickElement= ruleBrickElement EOF ;
    public final EObject entryRuleBrickElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrickElement = null;


        try {
            // InternalMyDsl.g:177:53: (iv_ruleBrickElement= ruleBrickElement EOF )
            // InternalMyDsl.g:178:2: iv_ruleBrickElement= ruleBrickElement EOF
            {
             newCompositeNode(grammarAccess.getBrickElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrickElement=ruleBrickElement();

            state._fsp--;

             current =iv_ruleBrickElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrickElement"


    // $ANTLR start "ruleBrickElement"
    // InternalMyDsl.g:184:1: ruleBrickElement returns [EObject current=null] : (this_AbstractBrick_0= ruleAbstractBrick | this_ComplexBrick_1= ruleComplexBrick ) ;
    public final EObject ruleBrickElement() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractBrick_0 = null;

        EObject this_ComplexBrick_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:190:2: ( (this_AbstractBrick_0= ruleAbstractBrick | this_ComplexBrick_1= ruleComplexBrick ) )
            // InternalMyDsl.g:191:2: (this_AbstractBrick_0= ruleAbstractBrick | this_ComplexBrick_1= ruleComplexBrick )
            {
            // InternalMyDsl.g:191:2: (this_AbstractBrick_0= ruleAbstractBrick | this_ComplexBrick_1= ruleComplexBrick )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:192:3: this_AbstractBrick_0= ruleAbstractBrick
                    {

                    			newCompositeNode(grammarAccess.getBrickElementAccess().getAbstractBrickParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractBrick_0=ruleAbstractBrick();

                    state._fsp--;


                    			current = this_AbstractBrick_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:201:3: this_ComplexBrick_1= ruleComplexBrick
                    {

                    			newCompositeNode(grammarAccess.getBrickElementAccess().getComplexBrickParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexBrick_1=ruleComplexBrick();

                    state._fsp--;


                    			current = this_ComplexBrick_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrickElement"


    // $ANTLR start "entryRuleLimits"
    // InternalMyDsl.g:213:1: entryRuleLimits returns [EObject current=null] : iv_ruleLimits= ruleLimits EOF ;
    public final EObject entryRuleLimits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimits = null;


        try {
            // InternalMyDsl.g:213:47: (iv_ruleLimits= ruleLimits EOF )
            // InternalMyDsl.g:214:2: iv_ruleLimits= ruleLimits EOF
            {
             newCompositeNode(grammarAccess.getLimitsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimits=ruleLimits();

            state._fsp--;

             current =iv_ruleLimits; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimits"


    // $ANTLR start "ruleLimits"
    // InternalMyDsl.g:220:1: ruleLimits returns [EObject current=null] : ( () otherlv_1= 'Dimensions' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleLimits() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_width_4_0 = null;

        AntlrDatatypeRuleToken lv_length_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:226:2: ( ( () otherlv_1= 'Dimensions' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:227:2: ( () otherlv_1= 'Dimensions' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:227:2: ( () otherlv_1= 'Dimensions' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:228:3: () otherlv_1= 'Dimensions' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:228:3: ()
            // InternalMyDsl.g:229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitsAccess().getLimitsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitsAccess().getDimensionsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:243:3: (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:244:4: otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitsAccess().getWidthKeyword_3_0());
                    			
                    // InternalMyDsl.g:248:4: ( (lv_width_4_0= ruleEInt ) )
                    // InternalMyDsl.g:249:5: (lv_width_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:249:5: (lv_width_4_0= ruleEInt )
                    // InternalMyDsl.g:250:6: lv_width_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLimitsAccess().getWidthEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_width_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitsRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:268:3: (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:269:4: otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitsAccess().getHeightKeyword_4_0());
                    			
                    // InternalMyDsl.g:273:4: ( (lv_length_6_0= ruleEInt ) )
                    // InternalMyDsl.g:274:5: (lv_length_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:274:5: (lv_length_6_0= ruleEInt )
                    // InternalMyDsl.g:275:6: lv_length_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLimitsAccess().getLengthEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_length_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitsRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_6_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLimitsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimits"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:301:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:301:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:302:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:308:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:314:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:315:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:315:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:316:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:324:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSize"
    // InternalMyDsl.g:335:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalMyDsl.g:335:45: (iv_ruleSize= ruleSize EOF )
            // InternalMyDsl.g:336:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalMyDsl.g:342:1: ruleSize returns [EObject current=null] : ( () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_brickHeight_2_0 = null;

        AntlrDatatypeRuleToken lv_brickWidth_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:348:2: ( ( () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )? ) )
            // InternalMyDsl.g:349:2: ( () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )? )
            {
            // InternalMyDsl.g:349:2: ( () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )? )
            // InternalMyDsl.g:350:3: () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )?
            {
            // InternalMyDsl.g:350:3: ()
            // InternalMyDsl.g:351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSizeAccess().getSizeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:357:3: (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:358:4: otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getHeightKeyword_1_0());
                    			
                    // InternalMyDsl.g:362:4: ( (lv_brickHeight_2_0= ruleEInt ) )
                    // InternalMyDsl.g:363:5: (lv_brickHeight_2_0= ruleEInt )
                    {
                    // InternalMyDsl.g:363:5: (lv_brickHeight_2_0= ruleEInt )
                    // InternalMyDsl.g:364:6: lv_brickHeight_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSizeAccess().getBrickHeightEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_brickHeight_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSizeRule());
                    						}
                    						set(
                    							current,
                    							"brickHeight",
                    							lv_brickHeight_2_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:382:3: (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:383:4: otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getWidthKeyword_2_0());
                    			
                    // InternalMyDsl.g:387:4: ( (lv_brickWidth_4_0= ruleEInt ) )
                    // InternalMyDsl.g:388:5: (lv_brickWidth_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:388:5: (lv_brickWidth_4_0= ruleEInt )
                    // InternalMyDsl.g:389:6: lv_brickWidth_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSizeAccess().getBrickWidthEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_brickWidth_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSizeRule());
                    						}
                    						set(
                    							current,
                    							"brickWidth",
                    							lv_brickWidth_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleAbstractBrick"
    // InternalMyDsl.g:411:1: entryRuleAbstractBrick returns [EObject current=null] : iv_ruleAbstractBrick= ruleAbstractBrick EOF ;
    public final EObject entryRuleAbstractBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBrick = null;


        try {
            // InternalMyDsl.g:411:54: (iv_ruleAbstractBrick= ruleAbstractBrick EOF )
            // InternalMyDsl.g:412:2: iv_ruleAbstractBrick= ruleAbstractBrick EOF
            {
             newCompositeNode(grammarAccess.getAbstractBrickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractBrick=ruleAbstractBrick();

            state._fsp--;

             current =iv_ruleAbstractBrick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractBrick"


    // $ANTLR start "ruleAbstractBrick"
    // InternalMyDsl.g:418:1: ruleAbstractBrick returns [EObject current=null] : ( () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAbstractBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_dimensions_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:424:2: ( ( () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}' ) )
            // InternalMyDsl.g:425:2: ( () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:425:2: ( () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}' )
            // InternalMyDsl.g:426:3: () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}'
            {
            // InternalMyDsl.g:426:3: ()
            // InternalMyDsl.g:427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbstractBrickAccess().getAbstractBrickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractBrickAccess().getAbstractKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractBrickAccess().getBrickKeyword_2());
            		
            // InternalMyDsl.g:441:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:442:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:442:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:443:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAbstractBrickAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractBrickRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getAbstractBrickAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:464:3: (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:465:4: otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getAbstractBrickAccess().getDimensionsKeyword_5_0());
                    			
                    // InternalMyDsl.g:469:4: ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==EOF||LA9_0==14||(LA9_0>=16 && LA9_0<=17)) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:470:5: ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' )
                            {
                            // InternalMyDsl.g:470:5: ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' )
                            // InternalMyDsl.g:471:6: ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width'
                            {
                            // InternalMyDsl.g:471:6: ( ( ruleEString ) )
                            // InternalMyDsl.g:472:7: ( ruleEString )
                            {
                            // InternalMyDsl.g:472:7: ( ruleEString )
                            // InternalMyDsl.g:473:8: ruleEString
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAbstractBrickRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementCrossReference_5_1_0_0_0());
                            							
                            pushFollow(FOLLOW_16);
                            ruleEString();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_7=(Token)match(input,20,FOLLOW_3); 

                            						newLeafNode(otherlv_7, grammarAccess.getAbstractBrickAccess().getHeightKeyword_5_1_0_1());
                            					
                            // InternalMyDsl.g:491:6: ( ( ruleEString ) )
                            // InternalMyDsl.g:492:7: ( ruleEString )
                            {
                            // InternalMyDsl.g:492:7: ( ruleEString )
                            // InternalMyDsl.g:493:8: ruleEString
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getAbstractBrickRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementCrossReference_5_1_0_2_0());
                            							
                            pushFollow(FOLLOW_17);
                            ruleEString();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            otherlv_9=(Token)match(input,21,FOLLOW_11); 

                            						newLeafNode(otherlv_9, grammarAccess.getAbstractBrickAccess().getWidthKeyword_5_1_0_3());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:513:5: ( (lv_dimensions_10_0= ruleSize ) )
                            {
                            // InternalMyDsl.g:513:5: ( (lv_dimensions_10_0= ruleSize ) )
                            // InternalMyDsl.g:514:6: (lv_dimensions_10_0= ruleSize )
                            {
                            // InternalMyDsl.g:514:6: (lv_dimensions_10_0= ruleSize )
                            // InternalMyDsl.g:515:7: lv_dimensions_10_0= ruleSize
                            {

                            							newCompositeNode(grammarAccess.getAbstractBrickAccess().getDimensionsSizeParserRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_dimensions_10_0=ruleSize();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getAbstractBrickRule());
                            							}
                            							set(
                            								current,
                            								"dimensions",
                            								lv_dimensions_10_0,
                            								"org.xtext.example.mydsl1.MyDsl.Size");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAbstractBrickAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractBrick"


    // $ANTLR start "entryRuleComplexBrick"
    // InternalMyDsl.g:542:1: entryRuleComplexBrick returns [EObject current=null] : iv_ruleComplexBrick= ruleComplexBrick EOF ;
    public final EObject entryRuleComplexBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexBrick = null;


        try {
            // InternalMyDsl.g:542:53: (iv_ruleComplexBrick= ruleComplexBrick EOF )
            // InternalMyDsl.g:543:2: iv_ruleComplexBrick= ruleComplexBrick EOF
            {
             newCompositeNode(grammarAccess.getComplexBrickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexBrick=ruleComplexBrick();

            state._fsp--;

             current =iv_ruleComplexBrick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexBrick"


    // $ANTLR start "ruleComplexBrick"
    // InternalMyDsl.g:549:1: ruleComplexBrick returns [EObject current=null] : ( () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_hasPosition_10_0= rulePosition ) ) otherlv_11= ')' (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' ( (lv_hasPosition_15_0= rulePosition ) ) otherlv_16= ')' )* otherlv_17= ')' otherlv_18= '}' otherlv_19= '}' ) ;
    public final EObject ruleComplexBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_hasPosition_10_0 = null;

        EObject lv_hasPosition_15_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:555:2: ( ( () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_hasPosition_10_0= rulePosition ) ) otherlv_11= ')' (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' ( (lv_hasPosition_15_0= rulePosition ) ) otherlv_16= ')' )* otherlv_17= ')' otherlv_18= '}' otherlv_19= '}' ) )
            // InternalMyDsl.g:556:2: ( () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_hasPosition_10_0= rulePosition ) ) otherlv_11= ')' (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' ( (lv_hasPosition_15_0= rulePosition ) ) otherlv_16= ')' )* otherlv_17= ')' otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalMyDsl.g:556:2: ( () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_hasPosition_10_0= rulePosition ) ) otherlv_11= ')' (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' ( (lv_hasPosition_15_0= rulePosition ) ) otherlv_16= ')' )* otherlv_17= ')' otherlv_18= '}' otherlv_19= '}' )
            // InternalMyDsl.g:557:3: () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= '(' ( (lv_hasPosition_10_0= rulePosition ) ) otherlv_11= ')' (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' ( (lv_hasPosition_15_0= rulePosition ) ) otherlv_16= ')' )* otherlv_17= ')' otherlv_18= '}' otherlv_19= '}'
            {
            // InternalMyDsl.g:557:3: ()
            // InternalMyDsl.g:558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexBrickAccess().getComplexBrickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexBrickAccess().getBrickKeyword_1());
            		
            // InternalMyDsl.g:568:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:569:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:569:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:570:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComplexBrickAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexBrickRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexBrickAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexBrickAccess().getCreateBrickKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexBrickAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexBrickAccess().getDimensionsKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_7());
            		
            // InternalMyDsl.g:607:3: ( ( ruleEString ) )
            // InternalMyDsl.g:608:4: ( ruleEString )
            {
            // InternalMyDsl.g:608:4: ( ruleEString )
            // InternalMyDsl.g:609:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexBrickRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_8_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_9());
            		
            // InternalMyDsl.g:627:3: ( (lv_hasPosition_10_0= rulePosition ) )
            // InternalMyDsl.g:628:4: (lv_hasPosition_10_0= rulePosition )
            {
            // InternalMyDsl.g:628:4: (lv_hasPosition_10_0= rulePosition )
            // InternalMyDsl.g:629:5: lv_hasPosition_10_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_20);
            lv_hasPosition_10_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexBrickRule());
            					}
            					add(
            						current,
            						"hasPosition",
            						lv_hasPosition_10_0,
            						"org.xtext.example.mydsl1.MyDsl.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_11, grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_11());
            		
            // InternalMyDsl.g:650:3: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' ( (lv_hasPosition_15_0= rulePosition ) ) otherlv_16= ')' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:651:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) otherlv_14= '(' ( (lv_hasPosition_15_0= rulePosition ) ) otherlv_16= ')'
            	    {
            	    otherlv_12=(Token)match(input,25,FOLLOW_22); 

            	    				newLeafNode(otherlv_12, grammarAccess.getComplexBrickAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:655:4: ( (otherlv_13= RULE_ID ) )
            	    // InternalMyDsl.g:656:5: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMyDsl.g:656:5: (otherlv_13= RULE_ID )
            	    // InternalMyDsl.g:657:6: otherlv_13= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getComplexBrickRule());
            	    						}
            	    					
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_13, grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_12_1_0());
            	    					

            	    }


            	    }

            	    otherlv_14=(Token)match(input,23,FOLLOW_9); 

            	    				newLeafNode(otherlv_14, grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_12_2());
            	    			
            	    // InternalMyDsl.g:672:4: ( (lv_hasPosition_15_0= rulePosition ) )
            	    // InternalMyDsl.g:673:5: (lv_hasPosition_15_0= rulePosition )
            	    {
            	    // InternalMyDsl.g:673:5: (lv_hasPosition_15_0= rulePosition )
            	    // InternalMyDsl.g:674:6: lv_hasPosition_15_0= rulePosition
            	    {

            	    						newCompositeNode(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_12_3_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_hasPosition_15_0=rulePosition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComplexBrickRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hasPosition",
            	    							lv_hasPosition_15_0,
            	    							"org.xtext.example.mydsl1.MyDsl.Position");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_16=(Token)match(input,24,FOLLOW_21); 

            	    				newLeafNode(otherlv_16, grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_12_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_17=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_13());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_18, grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexBrick"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:712:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:712:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:713:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:719:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:725:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:726:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:726:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:727:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:727:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:728:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePosition"
    // InternalMyDsl.g:745:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalMyDsl.g:745:49: (iv_rulePosition= rulePosition EOF )
            // InternalMyDsl.g:746:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalMyDsl.g:752:1: rulePosition returns [EObject current=null] : ( () ( (lv_x_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEInt ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:758:2: ( ( () ( (lv_x_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:759:2: ( () ( (lv_x_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:759:2: ( () ( (lv_x_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEInt ) ) )
            // InternalMyDsl.g:760:3: () ( (lv_x_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEInt ) )
            {
            // InternalMyDsl.g:760:3: ()
            // InternalMyDsl.g:761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPositionAccess().getPositionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:767:3: ( (lv_x_1_0= ruleEInt ) )
            // InternalMyDsl.g:768:4: (lv_x_1_0= ruleEInt )
            {
            // InternalMyDsl.g:768:4: (lv_x_1_0= ruleEInt )
            // InternalMyDsl.g:769:5: lv_x_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getXEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_x_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.xtext.example.mydsl1.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:790:3: ( (lv_y_3_0= ruleEInt ) )
            // InternalMyDsl.g:791:4: (lv_y_3_0= ruleEInt )
            {
            // InternalMyDsl.g:791:4: (lv_y_3_0= ruleEInt )
            // InternalMyDsl.g:792:5: lv_y_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getYEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_y_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.xtext.example.mydsl1.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000034030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});

}