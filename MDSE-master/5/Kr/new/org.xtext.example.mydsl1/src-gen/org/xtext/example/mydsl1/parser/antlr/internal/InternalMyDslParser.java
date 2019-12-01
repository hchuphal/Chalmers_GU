package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BrickModel'", "'{'", "'limits'", "'}'", "'Limits'", "'width'", "'height'", "'abstract'", "'Brick'", "'Dimensions'", "'.height'", "'.width'", "'createBrick'", "'('", "','", "')'", "'-'", "'Left'", "'Right'", "'Center'"
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
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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
    // InternalMyDsl.g:65:1: entryRuleBrickModel returns [EObject current=null] : iv_ruleBrickModel= ruleBrickModel EOF ;
    public final EObject entryRuleBrickModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrickModel = null;


        try {
            // InternalMyDsl.g:65:51: (iv_ruleBrickModel= ruleBrickModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleBrickModel= ruleBrickModel EOF
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
    // InternalMyDsl.g:72:1: ruleBrickModel returns [EObject current=null] : (otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'BrickModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'limits' ( (lv_limits_4_0= ruleLimits ) ) ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBrickModelAccess().getBrickModelKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleEString
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
            		
            // InternalMyDsl.g:111:3: ( (lv_limits_4_0= ruleLimits ) )
            // InternalMyDsl.g:112:4: (lv_limits_4_0= ruleLimits )
            {
            // InternalMyDsl.g:112:4: (lv_limits_4_0= ruleLimits )
            // InternalMyDsl.g:113:5: lv_limits_4_0= ruleLimits
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

            // InternalMyDsl.g:130:3: ( ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=18 && LA2_0<=19)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:131:4: ( (lv_contains_5_0= ruleBrickElement ) ) ( (lv_contains_6_0= ruleBrickElement ) )*
                    {
                    // InternalMyDsl.g:131:4: ( (lv_contains_5_0= ruleBrickElement ) )
                    // InternalMyDsl.g:132:5: (lv_contains_5_0= ruleBrickElement )
                    {
                    // InternalMyDsl.g:132:5: (lv_contains_5_0= ruleBrickElement )
                    // InternalMyDsl.g:133:6: lv_contains_5_0= ruleBrickElement
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

                    // InternalMyDsl.g:150:4: ( (lv_contains_6_0= ruleBrickElement ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=18 && LA1_0<=19)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:151:5: (lv_contains_6_0= ruleBrickElement )
                    	    {
                    	    // InternalMyDsl.g:151:5: (lv_contains_6_0= ruleBrickElement )
                    	    // InternalMyDsl.g:152:6: lv_contains_6_0= ruleBrickElement
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
    // InternalMyDsl.g:178:1: entryRuleBrickElement returns [EObject current=null] : iv_ruleBrickElement= ruleBrickElement EOF ;
    public final EObject entryRuleBrickElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrickElement = null;


        try {
            // InternalMyDsl.g:178:53: (iv_ruleBrickElement= ruleBrickElement EOF )
            // InternalMyDsl.g:179:2: iv_ruleBrickElement= ruleBrickElement EOF
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
    // InternalMyDsl.g:185:1: ruleBrickElement returns [EObject current=null] : (this_AbstractBrick_0= ruleAbstractBrick | this_ComplexBrick_1= ruleComplexBrick ) ;
    public final EObject ruleBrickElement() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractBrick_0 = null;

        EObject this_ComplexBrick_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:191:2: ( (this_AbstractBrick_0= ruleAbstractBrick | this_ComplexBrick_1= ruleComplexBrick ) )
            // InternalMyDsl.g:192:2: (this_AbstractBrick_0= ruleAbstractBrick | this_ComplexBrick_1= ruleComplexBrick )
            {
            // InternalMyDsl.g:192:2: (this_AbstractBrick_0= ruleAbstractBrick | this_ComplexBrick_1= ruleComplexBrick )
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
                    // InternalMyDsl.g:193:3: this_AbstractBrick_0= ruleAbstractBrick
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
                    // InternalMyDsl.g:202:3: this_ComplexBrick_1= ruleComplexBrick
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
    // InternalMyDsl.g:214:1: entryRuleLimits returns [EObject current=null] : iv_ruleLimits= ruleLimits EOF ;
    public final EObject entryRuleLimits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimits = null;


        try {
            // InternalMyDsl.g:214:47: (iv_ruleLimits= ruleLimits EOF )
            // InternalMyDsl.g:215:2: iv_ruleLimits= ruleLimits EOF
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
    // InternalMyDsl.g:221:1: ruleLimits returns [EObject current=null] : ( () otherlv_1= 'Limits' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}' ) ;
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
            // InternalMyDsl.g:227:2: ( ( () otherlv_1= 'Limits' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:228:2: ( () otherlv_1= 'Limits' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:228:2: ( () otherlv_1= 'Limits' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:229:3: () otherlv_1= 'Limits' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )? (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:229:3: ()
            // InternalMyDsl.g:230:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitsAccess().getLimitsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLimitsAccess().getLimitsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getLimitsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:244:3: (otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:245:4: otherlv_3= 'width' ( (lv_width_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitsAccess().getWidthKeyword_3_0());
                    			
                    // InternalMyDsl.g:249:4: ( (lv_width_4_0= ruleEInt ) )
                    // InternalMyDsl.g:250:5: (lv_width_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:250:5: (lv_width_4_0= ruleEInt )
                    // InternalMyDsl.g:251:6: lv_width_4_0= ruleEInt
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

            // InternalMyDsl.g:269:3: (otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:270:4: otherlv_5= 'height' ( (lv_length_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitsAccess().getHeightKeyword_4_0());
                    			
                    // InternalMyDsl.g:274:4: ( (lv_length_6_0= ruleEInt ) )
                    // InternalMyDsl.g:275:5: (lv_length_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:275:5: (lv_length_6_0= ruleEInt )
                    // InternalMyDsl.g:276:6: lv_length_6_0= ruleEInt
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
    // InternalMyDsl.g:302:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:302:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:303:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:309:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:315:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:316:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:316:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMyDsl.g:317:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:325:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:336:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalMyDsl.g:336:45: (iv_ruleSize= ruleSize EOF )
            // InternalMyDsl.g:337:2: iv_ruleSize= ruleSize EOF
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
    // InternalMyDsl.g:343:1: ruleSize returns [EObject current=null] : ( () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_brickHeight_2_0 = null;

        AntlrDatatypeRuleToken lv_brickWidth_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:349:2: ( ( () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )? ) )
            // InternalMyDsl.g:350:2: ( () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )? )
            {
            // InternalMyDsl.g:350:2: ( () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )? )
            // InternalMyDsl.g:351:3: () (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )? (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )?
            {
            // InternalMyDsl.g:351:3: ()
            // InternalMyDsl.g:352:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSizeAccess().getSizeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:358:3: (otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:359:4: otherlv_1= 'height' ( (lv_brickHeight_2_0= ruleEInt ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getHeightKeyword_1_0());
                    			
                    // InternalMyDsl.g:363:4: ( (lv_brickHeight_2_0= ruleEInt ) )
                    // InternalMyDsl.g:364:5: (lv_brickHeight_2_0= ruleEInt )
                    {
                    // InternalMyDsl.g:364:5: (lv_brickHeight_2_0= ruleEInt )
                    // InternalMyDsl.g:365:6: lv_brickHeight_2_0= ruleEInt
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

            // InternalMyDsl.g:383:3: (otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:384:4: otherlv_3= 'width' ( (lv_brickWidth_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getSizeAccess().getWidthKeyword_2_0());
                    			
                    // InternalMyDsl.g:388:4: ( (lv_brickWidth_4_0= ruleEInt ) )
                    // InternalMyDsl.g:389:5: (lv_brickWidth_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:389:5: (lv_brickWidth_4_0= ruleEInt )
                    // InternalMyDsl.g:390:6: lv_brickWidth_4_0= ruleEInt
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
    // InternalMyDsl.g:412:1: entryRuleAbstractBrick returns [EObject current=null] : iv_ruleAbstractBrick= ruleAbstractBrick EOF ;
    public final EObject entryRuleAbstractBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBrick = null;


        try {
            // InternalMyDsl.g:412:54: (iv_ruleAbstractBrick= ruleAbstractBrick EOF )
            // InternalMyDsl.g:413:2: iv_ruleAbstractBrick= ruleAbstractBrick EOF
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
    // InternalMyDsl.g:419:1: ruleAbstractBrick returns [EObject current=null] : ( () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:425:2: ( ( () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}' ) )
            // InternalMyDsl.g:426:2: ( () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:426:2: ( () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}' )
            // InternalMyDsl.g:427:3: () otherlv_1= 'abstract' otherlv_2= 'Brick' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )? otherlv_11= '}'
            {
            // InternalMyDsl.g:427:3: ()
            // InternalMyDsl.g:428:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbstractBrickAccess().getAbstractBrickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAbstractBrickAccess().getAbstractKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAbstractBrickAccess().getBrickKeyword_2());
            		
            // InternalMyDsl.g:442:3: ( (lv_name_3_0= ruleEString ) )
            // InternalMyDsl.g:443:4: (lv_name_3_0= ruleEString )
            {
            // InternalMyDsl.g:443:4: (lv_name_3_0= ruleEString )
            // InternalMyDsl.g:444:5: lv_name_3_0= ruleEString
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
            		
            // InternalMyDsl.g:465:3: (otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:466:4: otherlv_5= 'Dimensions' ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getAbstractBrickAccess().getDimensionsKeyword_5_0());
                    			
                    // InternalMyDsl.g:470:4: ( ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' ) | ( (lv_dimensions_10_0= ruleSize ) ) )
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
                            // InternalMyDsl.g:471:5: ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' )
                            {
                            // InternalMyDsl.g:471:5: ( ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width' )
                            // InternalMyDsl.g:472:6: ( ( ruleEString ) ) otherlv_7= '.height' ( ( ruleEString ) ) otherlv_9= '.width'
                            {
                            // InternalMyDsl.g:472:6: ( ( ruleEString ) )
                            // InternalMyDsl.g:473:7: ( ruleEString )
                            {
                            // InternalMyDsl.g:473:7: ( ruleEString )
                            // InternalMyDsl.g:474:8: ruleEString
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

                            otherlv_7=(Token)match(input,21,FOLLOW_3); 

                            						newLeafNode(otherlv_7, grammarAccess.getAbstractBrickAccess().getHeightKeyword_5_1_0_1());
                            					
                            // InternalMyDsl.g:492:6: ( ( ruleEString ) )
                            // InternalMyDsl.g:493:7: ( ruleEString )
                            {
                            // InternalMyDsl.g:493:7: ( ruleEString )
                            // InternalMyDsl.g:494:8: ruleEString
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

                            otherlv_9=(Token)match(input,22,FOLLOW_11); 

                            						newLeafNode(otherlv_9, grammarAccess.getAbstractBrickAccess().getWidthKeyword_5_1_0_3());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:514:5: ( (lv_dimensions_10_0= ruleSize ) )
                            {
                            // InternalMyDsl.g:514:5: ( (lv_dimensions_10_0= ruleSize ) )
                            // InternalMyDsl.g:515:6: (lv_dimensions_10_0= ruleSize )
                            {
                            // InternalMyDsl.g:515:6: (lv_dimensions_10_0= ruleSize )
                            // InternalMyDsl.g:516:7: lv_dimensions_10_0= ruleSize
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
    // InternalMyDsl.g:543:1: entryRuleComplexBrick returns [EObject current=null] : iv_ruleComplexBrick= ruleComplexBrick EOF ;
    public final EObject entryRuleComplexBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexBrick = null;


        try {
            // InternalMyDsl.g:543:53: (iv_ruleComplexBrick= ruleComplexBrick EOF )
            // InternalMyDsl.g:544:2: iv_ruleComplexBrick= ruleComplexBrick EOF
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
    // InternalMyDsl.g:550:1: ruleComplexBrick returns [EObject current=null] : ( () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' ( (lv_hasPosition_12_0= rulePosition ) ) (otherlv_13= ',' ( (lv_hasPosition_14_0= rulePosition ) ) )* otherlv_15= ')' otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleComplexBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_hasPosition_12_0 = null;

        EObject lv_hasPosition_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:556:2: ( ( () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' ( (lv_hasPosition_12_0= rulePosition ) ) (otherlv_13= ',' ( (lv_hasPosition_14_0= rulePosition ) ) )* otherlv_15= ')' otherlv_16= '}' otherlv_17= '}' ) )
            // InternalMyDsl.g:557:2: ( () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' ( (lv_hasPosition_12_0= rulePosition ) ) (otherlv_13= ',' ( (lv_hasPosition_14_0= rulePosition ) ) )* otherlv_15= ')' otherlv_16= '}' otherlv_17= '}' )
            {
            // InternalMyDsl.g:557:2: ( () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' ( (lv_hasPosition_12_0= rulePosition ) ) (otherlv_13= ',' ( (lv_hasPosition_14_0= rulePosition ) ) )* otherlv_15= ')' otherlv_16= '}' otherlv_17= '}' )
            // InternalMyDsl.g:558:3: () otherlv_1= 'Brick' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'createBrick' otherlv_5= '{' otherlv_6= 'Dimensions' otherlv_7= '(' ( ( ruleEString ) ) otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' ( (lv_hasPosition_12_0= rulePosition ) ) (otherlv_13= ',' ( (lv_hasPosition_14_0= rulePosition ) ) )* otherlv_15= ')' otherlv_16= '}' otherlv_17= '}'
            {
            // InternalMyDsl.g:558:3: ()
            // InternalMyDsl.g:559:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexBrickAccess().getComplexBrickAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexBrickAccess().getBrickKeyword_1());
            		
            // InternalMyDsl.g:569:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:570:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:570:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:571:5: lv_name_2_0= ruleEString
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
            		
            otherlv_4=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexBrickAccess().getCreateBrickKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexBrickAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexBrickAccess().getDimensionsKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_7());
            		
            // InternalMyDsl.g:608:3: ( ( ruleEString ) )
            // InternalMyDsl.g:609:4: ( ruleEString )
            {
            // InternalMyDsl.g:609:4: ( ruleEString )
            // InternalMyDsl.g:610:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexBrickRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_8_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexBrickAccess().getCommaKeyword_9());
            		
            // InternalMyDsl.g:628:3: ( (otherlv_10= RULE_ID ) )
            // InternalMyDsl.g:629:4: (otherlv_10= RULE_ID )
            {
            // InternalMyDsl.g:629:4: (otherlv_10= RULE_ID )
            // InternalMyDsl.g:630:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexBrickRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_10, grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_11, grammarAccess.getComplexBrickAccess().getCommaKeyword_11());
            		
            // InternalMyDsl.g:645:3: ( (lv_hasPosition_12_0= rulePosition ) )
            // InternalMyDsl.g:646:4: (lv_hasPosition_12_0= rulePosition )
            {
            // InternalMyDsl.g:646:4: (lv_hasPosition_12_0= rulePosition )
            // InternalMyDsl.g:647:5: lv_hasPosition_12_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_24);
            lv_hasPosition_12_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexBrickRule());
            					}
            					add(
            						current,
            						"hasPosition",
            						lv_hasPosition_12_0,
            						"org.xtext.example.mydsl1.MyDsl.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:664:3: (otherlv_13= ',' ( (lv_hasPosition_14_0= rulePosition ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:665:4: otherlv_13= ',' ( (lv_hasPosition_14_0= rulePosition ) )
            	    {
            	    otherlv_13=(Token)match(input,25,FOLLOW_23); 

            	    				newLeafNode(otherlv_13, grammarAccess.getComplexBrickAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:669:4: ( (lv_hasPosition_14_0= rulePosition ) )
            	    // InternalMyDsl.g:670:5: (lv_hasPosition_14_0= rulePosition )
            	    {
            	    // InternalMyDsl.g:670:5: (lv_hasPosition_14_0= rulePosition )
            	    // InternalMyDsl.g:671:6: lv_hasPosition_14_0= rulePosition
            	    {

            	    						newCompositeNode(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_hasPosition_14_0=rulePosition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComplexBrickRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hasPosition",
            	    							lv_hasPosition_14_0,
            	    							"org.xtext.example.mydsl1.MyDsl.Position");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_15=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_14());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalMyDsl.g:705:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:705:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:706:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:712:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:718:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:719:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:719:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:720:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:720:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:721:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_25); 

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
    // InternalMyDsl.g:738:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalMyDsl.g:738:49: (iv_rulePosition= rulePosition EOF )
            // InternalMyDsl.g:739:2: iv_rulePosition= rulePosition EOF
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
    // InternalMyDsl.g:745:1: rulePosition returns [EObject current=null] : ( () ( (lv_coordinates_1_0= ruleBrickPosition ) )? ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Enumerator lv_coordinates_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:751:2: ( ( () ( (lv_coordinates_1_0= ruleBrickPosition ) )? ) )
            // InternalMyDsl.g:752:2: ( () ( (lv_coordinates_1_0= ruleBrickPosition ) )? )
            {
            // InternalMyDsl.g:752:2: ( () ( (lv_coordinates_1_0= ruleBrickPosition ) )? )
            // InternalMyDsl.g:753:3: () ( (lv_coordinates_1_0= ruleBrickPosition ) )?
            {
            // InternalMyDsl.g:753:3: ()
            // InternalMyDsl.g:754:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPositionAccess().getPositionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:760:3: ( (lv_coordinates_1_0= ruleBrickPosition ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=28 && LA13_0<=30)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:761:4: (lv_coordinates_1_0= ruleBrickPosition )
                    {
                    // InternalMyDsl.g:761:4: (lv_coordinates_1_0= ruleBrickPosition )
                    // InternalMyDsl.g:762:5: lv_coordinates_1_0= ruleBrickPosition
                    {

                    					newCompositeNode(grammarAccess.getPositionAccess().getCoordinatesBrickPositionEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_coordinates_1_0=ruleBrickPosition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPositionRule());
                    					}
                    					set(
                    						current,
                    						"coordinates",
                    						lv_coordinates_1_0,
                    						"org.xtext.example.mydsl1.MyDsl.BrickPosition");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "ruleBrickPosition"
    // InternalMyDsl.g:783:1: ruleBrickPosition returns [Enumerator current=null] : ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'Center' ) ) ;
    public final Enumerator ruleBrickPosition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:789:2: ( ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'Center' ) ) )
            // InternalMyDsl.g:790:2: ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'Center' ) )
            {
            // InternalMyDsl.g:790:2: ( (enumLiteral_0= 'Left' ) | (enumLiteral_1= 'Right' ) | (enumLiteral_2= 'Center' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:791:3: (enumLiteral_0= 'Left' )
                    {
                    // InternalMyDsl.g:791:3: (enumLiteral_0= 'Left' )
                    // InternalMyDsl.g:792:4: enumLiteral_0= 'Left'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getBrickPositionAccess().getLeftEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBrickPositionAccess().getLeftEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:799:3: (enumLiteral_1= 'Right' )
                    {
                    // InternalMyDsl.g:799:3: (enumLiteral_1= 'Right' )
                    // InternalMyDsl.g:800:4: enumLiteral_1= 'Right'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getBrickPositionAccess().getRightEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBrickPositionAccess().getRightEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:807:3: (enumLiteral_2= 'Center' )
                    {
                    // InternalMyDsl.g:807:3: (enumLiteral_2= 'Center' )
                    // InternalMyDsl.g:808:4: enumLiteral_2= 'Center'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getBrickPositionAccess().getCenterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBrickPositionAccess().getCenterEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleBrickPosition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000034030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000076000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});

}