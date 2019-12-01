package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ManufacturingSystem'", "'{'", "'set'", "'start'", "'storage'", "','", "'end'", "'create'", "'responsible'", "'lead'", "'workpiece'", "'type'", "'processes'", "'initiate'", "'}'", "'ManufacturingSystemElement'", "'transition'", "'('", "')'", "'StoragePoint'", "'stores'", "'WorkPiece'", "'of'", "'ManufacturingStep'", "'speed'", "'='", "'input'", "'output'", "'TransportStep'", "'QualityAssuranceStep'", "'CompositeManufacturingStep'", "'contains'", "'-'", "'InputCondition'", "'condition'", "'requires'", "'BinaryCondition'", "'left'", "'right'", "'Negation'", "'and'", "'or'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
        	return "ManufacturingSystem";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleManufacturingSystem"
    // InternalMyDsl.g:65:1: entryRuleManufacturingSystem returns [EObject current=null] : iv_ruleManufacturingSystem= ruleManufacturingSystem EOF ;
    public final EObject entryRuleManufacturingSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManufacturingSystem = null;


        try {
            // InternalMyDsl.g:65:60: (iv_ruleManufacturingSystem= ruleManufacturingSystem EOF )
            // InternalMyDsl.g:66:2: iv_ruleManufacturingSystem= ruleManufacturingSystem EOF
            {
             newCompositeNode(grammarAccess.getManufacturingSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManufacturingSystem=ruleManufacturingSystem();

            state._fsp--;

             current =iv_ruleManufacturingSystem; 
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
    // $ANTLR end "entryRuleManufacturingSystem"


    // $ANTLR start "ruleManufacturingSystem"
    // InternalMyDsl.g:72:1: ruleManufacturingSystem returns [EObject current=null] : (otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'start' otherlv_5= 'storage' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'set' otherlv_10= 'end' otherlv_11= 'storage' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= 'create' otherlv_16= 'responsible' ( (lv_staff_17_0= ruleResponsible ) ) (otherlv_18= ',' ( (lv_staff_19_0= ruleResponsible ) ) )* otherlv_20= 'set' otherlv_21= 'lead' otherlv_22= 'responsible' ( ( ruleEString ) ) (otherlv_24= 'workpiece' otherlv_25= 'type' ( (lv_uses_26_0= ruleWorkPieceType ) ) (otherlv_27= ',' ( (lv_uses_28_0= ruleWorkPieceType ) ) )* )? (otherlv_29= 'processes' ( (lv_transforms_30_0= ruleWorkPiece ) ) (otherlv_31= ',' ( (lv_transforms_32_0= ruleWorkPiece ) ) )* )? (otherlv_33= 'initiate' ( ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )* | (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' ) ) )* otherlv_38= '}' ) ;
    public final EObject ruleManufacturingSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_staff_17_0 = null;

        EObject lv_staff_19_0 = null;

        EObject lv_uses_26_0 = null;

        EObject lv_uses_28_0 = null;

        EObject lv_transforms_30_0 = null;

        EObject lv_transforms_32_0 = null;

        EObject lv_consistsOf_34_0 = null;

        EObject lv_consistsOf_36_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'start' otherlv_5= 'storage' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'set' otherlv_10= 'end' otherlv_11= 'storage' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= 'create' otherlv_16= 'responsible' ( (lv_staff_17_0= ruleResponsible ) ) (otherlv_18= ',' ( (lv_staff_19_0= ruleResponsible ) ) )* otherlv_20= 'set' otherlv_21= 'lead' otherlv_22= 'responsible' ( ( ruleEString ) ) (otherlv_24= 'workpiece' otherlv_25= 'type' ( (lv_uses_26_0= ruleWorkPieceType ) ) (otherlv_27= ',' ( (lv_uses_28_0= ruleWorkPieceType ) ) )* )? (otherlv_29= 'processes' ( (lv_transforms_30_0= ruleWorkPiece ) ) (otherlv_31= ',' ( (lv_transforms_32_0= ruleWorkPiece ) ) )* )? (otherlv_33= 'initiate' ( ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )* | (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' ) ) )* otherlv_38= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'start' otherlv_5= 'storage' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'set' otherlv_10= 'end' otherlv_11= 'storage' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= 'create' otherlv_16= 'responsible' ( (lv_staff_17_0= ruleResponsible ) ) (otherlv_18= ',' ( (lv_staff_19_0= ruleResponsible ) ) )* otherlv_20= 'set' otherlv_21= 'lead' otherlv_22= 'responsible' ( ( ruleEString ) ) (otherlv_24= 'workpiece' otherlv_25= 'type' ( (lv_uses_26_0= ruleWorkPieceType ) ) (otherlv_27= ',' ( (lv_uses_28_0= ruleWorkPieceType ) ) )* )? (otherlv_29= 'processes' ( (lv_transforms_30_0= ruleWorkPiece ) ) (otherlv_31= ',' ( (lv_transforms_32_0= ruleWorkPiece ) ) )* )? (otherlv_33= 'initiate' ( ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )* | (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' ) ) )* otherlv_38= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'start' otherlv_5= 'storage' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'set' otherlv_10= 'end' otherlv_11= 'storage' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= 'create' otherlv_16= 'responsible' ( (lv_staff_17_0= ruleResponsible ) ) (otherlv_18= ',' ( (lv_staff_19_0= ruleResponsible ) ) )* otherlv_20= 'set' otherlv_21= 'lead' otherlv_22= 'responsible' ( ( ruleEString ) ) (otherlv_24= 'workpiece' otherlv_25= 'type' ( (lv_uses_26_0= ruleWorkPieceType ) ) (otherlv_27= ',' ( (lv_uses_28_0= ruleWorkPieceType ) ) )* )? (otherlv_29= 'processes' ( (lv_transforms_30_0= ruleWorkPiece ) ) (otherlv_31= ',' ( (lv_transforms_32_0= ruleWorkPiece ) ) )* )? (otherlv_33= 'initiate' ( ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )* | (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' ) ) )* otherlv_38= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'ManufacturingSystem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'start' otherlv_5= 'storage' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= 'set' otherlv_10= 'end' otherlv_11= 'storage' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= 'create' otherlv_16= 'responsible' ( (lv_staff_17_0= ruleResponsible ) ) (otherlv_18= ',' ( (lv_staff_19_0= ruleResponsible ) ) )* otherlv_20= 'set' otherlv_21= 'lead' otherlv_22= 'responsible' ( ( ruleEString ) ) (otherlv_24= 'workpiece' otherlv_25= 'type' ( (lv_uses_26_0= ruleWorkPieceType ) ) (otherlv_27= ',' ( (lv_uses_28_0= ruleWorkPieceType ) ) )* )? (otherlv_29= 'processes' ( (lv_transforms_30_0= ruleWorkPiece ) ) (otherlv_31= ',' ( (lv_transforms_32_0= ruleWorkPiece ) ) )* )? (otherlv_33= 'initiate' ( ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )* | (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' ) ) )* otherlv_38= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getManufacturingSystemAccess().getManufacturingSystemKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManufacturingSystemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getManufacturingSystemAccess().getSetKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getManufacturingSystemAccess().getStartKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getManufacturingSystemAccess().getStorageKeyword_5());
            		
            // InternalMyDsl.g:119:3: ( ( ruleEString ) )
            // InternalMyDsl.g:120:4: ( ruleEString )
            {
            // InternalMyDsl.g:120:4: ( ruleEString )
            // InternalMyDsl.g:121:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManufacturingSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_6_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:135:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:136:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:140:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:141:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:141:5: ( ruleEString )
            	    // InternalMyDsl.g:142:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getManufacturingSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getManufacturingSystemAccess().getSetKeyword_8());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getManufacturingSystemAccess().getEndKeyword_9());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getManufacturingSystemAccess().getStorageKeyword_10());
            		
            // InternalMyDsl.g:169:3: ( ( ruleEString ) )
            // InternalMyDsl.g:170:4: ( ruleEString )
            {
            // InternalMyDsl.g:170:4: ( ruleEString )
            // InternalMyDsl.g:171:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManufacturingSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_11_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:185:3: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:186:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMyDsl.g:190:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:191:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:191:5: ( ruleEString )
            	    // InternalMyDsl.g:192:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getManufacturingSystemRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_12_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getManufacturingSystemAccess().getCreateKeyword_13());
            		
            otherlv_16=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getManufacturingSystemAccess().getResponsibleKeyword_14());
            		
            // InternalMyDsl.g:215:3: ( (lv_staff_17_0= ruleResponsible ) )
            // InternalMyDsl.g:216:4: (lv_staff_17_0= ruleResponsible )
            {
            // InternalMyDsl.g:216:4: (lv_staff_17_0= ruleResponsible )
            // InternalMyDsl.g:217:5: lv_staff_17_0= ruleResponsible
            {

            					newCompositeNode(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_8);
            lv_staff_17_0=ruleResponsible();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
            					}
            					add(
            						current,
            						"staff",
            						lv_staff_17_0,
            						"org.xtext.example.mydsl.MyDsl.Responsible");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:234:3: (otherlv_18= ',' ( (lv_staff_19_0= ruleResponsible ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:235:4: otherlv_18= ',' ( (lv_staff_19_0= ruleResponsible ) )
            	    {
            	    otherlv_18=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_18, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalMyDsl.g:239:4: ( (lv_staff_19_0= ruleResponsible ) )
            	    // InternalMyDsl.g:240:5: (lv_staff_19_0= ruleResponsible )
            	    {
            	    // InternalMyDsl.g:240:5: (lv_staff_19_0= ruleResponsible )
            	    // InternalMyDsl.g:241:6: lv_staff_19_0= ruleResponsible
            	    {

            	    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_staff_19_0=ruleResponsible();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"staff",
            	    							lv_staff_19_0,
            	    							"org.xtext.example.mydsl.MyDsl.Responsible");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_20=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_20, grammarAccess.getManufacturingSystemAccess().getSetKeyword_17());
            		
            otherlv_21=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_21, grammarAccess.getManufacturingSystemAccess().getLeadKeyword_18());
            		
            otherlv_22=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_22, grammarAccess.getManufacturingSystemAccess().getResponsibleKeyword_19());
            		
            // InternalMyDsl.g:271:3: ( ( ruleEString ) )
            // InternalMyDsl.g:272:4: ( ruleEString )
            {
            // InternalMyDsl.g:272:4: ( ruleEString )
            // InternalMyDsl.g:273:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManufacturingSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleCrossReference_20_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:287:3: (otherlv_24= 'workpiece' otherlv_25= 'type' ( (lv_uses_26_0= ruleWorkPieceType ) ) (otherlv_27= ',' ( (lv_uses_28_0= ruleWorkPieceType ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:288:4: otherlv_24= 'workpiece' otherlv_25= 'type' ( (lv_uses_26_0= ruleWorkPieceType ) ) (otherlv_27= ',' ( (lv_uses_28_0= ruleWorkPieceType ) ) )*
                    {
                    otherlv_24=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_24, grammarAccess.getManufacturingSystemAccess().getWorkpieceKeyword_21_0());
                    			
                    otherlv_25=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getManufacturingSystemAccess().getTypeKeyword_21_1());
                    			
                    // InternalMyDsl.g:296:4: ( (lv_uses_26_0= ruleWorkPieceType ) )
                    // InternalMyDsl.g:297:5: (lv_uses_26_0= ruleWorkPieceType )
                    {
                    // InternalMyDsl.g:297:5: (lv_uses_26_0= ruleWorkPieceType )
                    // InternalMyDsl.g:298:6: lv_uses_26_0= ruleWorkPieceType
                    {

                    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_uses_26_0=ruleWorkPieceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    						}
                    						add(
                    							current,
                    							"uses",
                    							lv_uses_26_0,
                    							"org.xtext.example.mydsl.MyDsl.WorkPieceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:315:4: (otherlv_27= ',' ( (lv_uses_28_0= ruleWorkPieceType ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:316:5: otherlv_27= ',' ( (lv_uses_28_0= ruleWorkPieceType ) )
                    	    {
                    	    otherlv_27=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_21_3_0());
                    	    				
                    	    // InternalMyDsl.g:320:5: ( (lv_uses_28_0= ruleWorkPieceType ) )
                    	    // InternalMyDsl.g:321:6: (lv_uses_28_0= ruleWorkPieceType )
                    	    {
                    	    // InternalMyDsl.g:321:6: (lv_uses_28_0= ruleWorkPieceType )
                    	    // InternalMyDsl.g:322:7: lv_uses_28_0= ruleWorkPieceType
                    	    {

                    	    							newCompositeNode(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_21_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_uses_28_0=ruleWorkPieceType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"uses",
                    	    								lv_uses_28_0,
                    	    								"org.xtext.example.mydsl.MyDsl.WorkPieceType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:341:3: (otherlv_29= 'processes' ( (lv_transforms_30_0= ruleWorkPiece ) ) (otherlv_31= ',' ( (lv_transforms_32_0= ruleWorkPiece ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:342:4: otherlv_29= 'processes' ( (lv_transforms_30_0= ruleWorkPiece ) ) (otherlv_31= ',' ( (lv_transforms_32_0= ruleWorkPiece ) ) )*
                    {
                    otherlv_29=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_29, grammarAccess.getManufacturingSystemAccess().getProcessesKeyword_22_0());
                    			
                    // InternalMyDsl.g:346:4: ( (lv_transforms_30_0= ruleWorkPiece ) )
                    // InternalMyDsl.g:347:5: (lv_transforms_30_0= ruleWorkPiece )
                    {
                    // InternalMyDsl.g:347:5: (lv_transforms_30_0= ruleWorkPiece )
                    // InternalMyDsl.g:348:6: lv_transforms_30_0= ruleWorkPiece
                    {

                    						newCompositeNode(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_22_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_transforms_30_0=ruleWorkPiece();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    						}
                    						add(
                    							current,
                    							"transforms",
                    							lv_transforms_30_0,
                    							"org.xtext.example.mydsl.MyDsl.WorkPiece");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:365:4: (otherlv_31= ',' ( (lv_transforms_32_0= ruleWorkPiece ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:366:5: otherlv_31= ',' ( (lv_transforms_32_0= ruleWorkPiece ) )
                    	    {
                    	    otherlv_31=(Token)match(input,16,FOLLOW_16); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getManufacturingSystemAccess().getCommaKeyword_22_2_0());
                    	    				
                    	    // InternalMyDsl.g:370:5: ( (lv_transforms_32_0= ruleWorkPiece ) )
                    	    // InternalMyDsl.g:371:6: (lv_transforms_32_0= ruleWorkPiece )
                    	    {
                    	    // InternalMyDsl.g:371:6: (lv_transforms_32_0= ruleWorkPiece )
                    	    // InternalMyDsl.g:372:7: lv_transforms_32_0= ruleWorkPiece
                    	    {

                    	    							newCompositeNode(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_22_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_transforms_32_0=ruleWorkPiece();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transforms",
                    	    								lv_transforms_32_0,
                    	    								"org.xtext.example.mydsl.MyDsl.WorkPiece");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:391:3: (otherlv_33= 'initiate' ( ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )* | (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:392:4: otherlv_33= 'initiate' ( ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )* | (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' ) )
            	    {
            	    otherlv_33=(Token)match(input,24,FOLLOW_18); 

            	    				newLeafNode(otherlv_33, grammarAccess.getManufacturingSystemAccess().getInitiateKeyword_23_0());
            	    			
            	    // InternalMyDsl.g:396:4: ( ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )* | (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>=24 && LA10_0<=26)||LA10_0==30||LA10_0==34||(LA10_0>=39 && LA10_0<=41)) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==12) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalMyDsl.g:397:5: ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )*
            	            {
            	            // InternalMyDsl.g:397:5: ( (lv_consistsOf_34_0= ruleManufacturingSystemElement ) )*
            	            loop8:
            	            do {
            	                int alt8=2;
            	                int LA8_0 = input.LA(1);

            	                if ( (LA8_0==26||LA8_0==30||LA8_0==34||(LA8_0>=39 && LA8_0<=41)) ) {
            	                    alt8=1;
            	                }


            	                switch (alt8) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:398:6: (lv_consistsOf_34_0= ruleManufacturingSystemElement )
            	            	    {
            	            	    // InternalMyDsl.g:398:6: (lv_consistsOf_34_0= ruleManufacturingSystemElement )
            	            	    // InternalMyDsl.g:399:7: lv_consistsOf_34_0= ruleManufacturingSystemElement
            	            	    {

            	            	    							newCompositeNode(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_23_1_0_0());
            	            	    						
            	            	    pushFollow(FOLLOW_19);
            	            	    lv_consistsOf_34_0=ruleManufacturingSystemElement();

            	            	    state._fsp--;


            	            	    							if (current==null) {
            	            	    								current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
            	            	    							}
            	            	    							add(
            	            	    								current,
            	            	    								"consistsOf",
            	            	    								lv_consistsOf_34_0,
            	            	    								"org.xtext.example.mydsl.MyDsl.ManufacturingSystemElement");
            	            	    							afterParserOrEnumRuleCall();
            	            	    						

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop8;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:417:5: (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' )
            	            {
            	            // InternalMyDsl.g:417:5: (otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}' )
            	            // InternalMyDsl.g:418:6: otherlv_35= '{' ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )* otherlv_37= '}'
            	            {
            	            otherlv_35=(Token)match(input,12,FOLLOW_20); 

            	            						newLeafNode(otherlv_35, grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_23_1_1_0());
            	            					
            	            // InternalMyDsl.g:422:6: ( (lv_consistsOf_36_0= ruleManufacturingSystemElement ) )*
            	            loop9:
            	            do {
            	                int alt9=2;
            	                int LA9_0 = input.LA(1);

            	                if ( (LA9_0==26||LA9_0==30||LA9_0==34||(LA9_0>=39 && LA9_0<=41)) ) {
            	                    alt9=1;
            	                }


            	                switch (alt9) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:423:7: (lv_consistsOf_36_0= ruleManufacturingSystemElement )
            	            	    {
            	            	    // InternalMyDsl.g:423:7: (lv_consistsOf_36_0= ruleManufacturingSystemElement )
            	            	    // InternalMyDsl.g:424:8: lv_consistsOf_36_0= ruleManufacturingSystemElement
            	            	    {

            	            	    								newCompositeNode(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_23_1_1_1_0());
            	            	    							
            	            	    pushFollow(FOLLOW_20);
            	            	    lv_consistsOf_36_0=ruleManufacturingSystemElement();

            	            	    state._fsp--;


            	            	    								if (current==null) {
            	            	    									current = createModelElementForParent(grammarAccess.getManufacturingSystemRule());
            	            	    								}
            	            	    								add(
            	            	    									current,
            	            	    									"consistsOf",
            	            	    									lv_consistsOf_36_0,
            	            	    									"org.xtext.example.mydsl.MyDsl.ManufacturingSystemElement");
            	            	    								afterParserOrEnumRuleCall();
            	            	    							

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop9;
            	                }
            	            } while (true);

            	            otherlv_37=(Token)match(input,25,FOLLOW_21); 

            	            						newLeafNode(otherlv_37, grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_23_1_1_2());
            	            					

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_38=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_24());
            		

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
    // $ANTLR end "ruleManufacturingSystem"


    // $ANTLR start "entryRuleManufacturingSystemElement"
    // InternalMyDsl.g:456:1: entryRuleManufacturingSystemElement returns [EObject current=null] : iv_ruleManufacturingSystemElement= ruleManufacturingSystemElement EOF ;
    public final EObject entryRuleManufacturingSystemElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManufacturingSystemElement = null;


        try {
            // InternalMyDsl.g:456:67: (iv_ruleManufacturingSystemElement= ruleManufacturingSystemElement EOF )
            // InternalMyDsl.g:457:2: iv_ruleManufacturingSystemElement= ruleManufacturingSystemElement EOF
            {
             newCompositeNode(grammarAccess.getManufacturingSystemElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManufacturingSystemElement=ruleManufacturingSystemElement();

            state._fsp--;

             current =iv_ruleManufacturingSystemElement; 
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
    // $ANTLR end "entryRuleManufacturingSystemElement"


    // $ANTLR start "ruleManufacturingSystemElement"
    // InternalMyDsl.g:463:1: ruleManufacturingSystemElement returns [EObject current=null] : (this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl | this_ManufacturingStep_1= ruleManufacturingStep | this_TransportStep_2= ruleTransportStep | this_QualityAssuranceStep_3= ruleQualityAssuranceStep | this_StoragePoint_4= ruleStoragePoint | this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep ) ;
    public final EObject ruleManufacturingSystemElement() throws RecognitionException {
        EObject current = null;

        EObject this_ManufacturingSystemElement_Impl_0 = null;

        EObject this_ManufacturingStep_1 = null;

        EObject this_TransportStep_2 = null;

        EObject this_QualityAssuranceStep_3 = null;

        EObject this_StoragePoint_4 = null;

        EObject this_CompositeManufacturingStep_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:469:2: ( (this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl | this_ManufacturingStep_1= ruleManufacturingStep | this_TransportStep_2= ruleTransportStep | this_QualityAssuranceStep_3= ruleQualityAssuranceStep | this_StoragePoint_4= ruleStoragePoint | this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep ) )
            // InternalMyDsl.g:470:2: (this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl | this_ManufacturingStep_1= ruleManufacturingStep | this_TransportStep_2= ruleTransportStep | this_QualityAssuranceStep_3= ruleQualityAssuranceStep | this_StoragePoint_4= ruleStoragePoint | this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep )
            {
            // InternalMyDsl.g:470:2: (this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl | this_ManufacturingStep_1= ruleManufacturingStep | this_TransportStep_2= ruleTransportStep | this_QualityAssuranceStep_3= ruleQualityAssuranceStep | this_StoragePoint_4= ruleStoragePoint | this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 39:
                {
                alt12=3;
                }
                break;
            case 40:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            case 41:
                {
                alt12=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:471:3: this_ManufacturingSystemElement_Impl_0= ruleManufacturingSystemElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getManufacturingSystemElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManufacturingSystemElement_Impl_0=ruleManufacturingSystemElement_Impl();

                    state._fsp--;


                    			current = this_ManufacturingSystemElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:480:3: this_ManufacturingStep_1= ruleManufacturingStep
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getManufacturingStepParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ManufacturingStep_1=ruleManufacturingStep();

                    state._fsp--;


                    			current = this_ManufacturingStep_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:489:3: this_TransportStep_2= ruleTransportStep
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getTransportStepParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransportStep_2=ruleTransportStep();

                    state._fsp--;


                    			current = this_TransportStep_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:498:3: this_QualityAssuranceStep_3= ruleQualityAssuranceStep
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getQualityAssuranceStepParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualityAssuranceStep_3=ruleQualityAssuranceStep();

                    state._fsp--;


                    			current = this_QualityAssuranceStep_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:507:3: this_StoragePoint_4= ruleStoragePoint
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getStoragePointParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StoragePoint_4=ruleStoragePoint();

                    state._fsp--;


                    			current = this_StoragePoint_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:516:3: this_CompositeManufacturingStep_5= ruleCompositeManufacturingStep
                    {

                    			newCompositeNode(grammarAccess.getManufacturingSystemElementAccess().getCompositeManufacturingStepParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeManufacturingStep_5=ruleCompositeManufacturingStep();

                    state._fsp--;


                    			current = this_CompositeManufacturingStep_5;
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
    // $ANTLR end "ruleManufacturingSystemElement"


    // $ANTLR start "entryRuleInputCondition"
    // InternalMyDsl.g:528:1: entryRuleInputCondition returns [EObject current=null] : iv_ruleInputCondition= ruleInputCondition EOF ;
    public final EObject entryRuleInputCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCondition = null;


        try {
            // InternalMyDsl.g:528:55: (iv_ruleInputCondition= ruleInputCondition EOF )
            // InternalMyDsl.g:529:2: iv_ruleInputCondition= ruleInputCondition EOF
            {
             newCompositeNode(grammarAccess.getInputConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputCondition=ruleInputCondition();

            state._fsp--;

             current =iv_ruleInputCondition; 
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
    // $ANTLR end "entryRuleInputCondition"


    // $ANTLR start "ruleInputCondition"
    // InternalMyDsl.g:535:1: ruleInputCondition returns [EObject current=null] : (this_InputCondition_Impl_0= ruleInputCondition_Impl | this_WorkPieceCondition_1= ruleWorkPieceCondition | this_BinaryCondition_2= ruleBinaryCondition | this_Negation_3= ruleNegation ) ;
    public final EObject ruleInputCondition() throws RecognitionException {
        EObject current = null;

        EObject this_InputCondition_Impl_0 = null;

        EObject this_WorkPieceCondition_1 = null;

        EObject this_BinaryCondition_2 = null;

        EObject this_Negation_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:541:2: ( (this_InputCondition_Impl_0= ruleInputCondition_Impl | this_WorkPieceCondition_1= ruleWorkPieceCondition | this_BinaryCondition_2= ruleBinaryCondition | this_Negation_3= ruleNegation ) )
            // InternalMyDsl.g:542:2: (this_InputCondition_Impl_0= ruleInputCondition_Impl | this_WorkPieceCondition_1= ruleWorkPieceCondition | this_BinaryCondition_2= ruleBinaryCondition | this_Negation_3= ruleNegation )
            {
            // InternalMyDsl.g:542:2: (this_InputCondition_Impl_0= ruleInputCondition_Impl | this_WorkPieceCondition_1= ruleWorkPieceCondition | this_BinaryCondition_2= ruleBinaryCondition | this_Negation_3= ruleNegation )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 47:
                {
                alt13=3;
                }
                break;
            case 50:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:543:3: this_InputCondition_Impl_0= ruleInputCondition_Impl
                    {

                    			newCompositeNode(grammarAccess.getInputConditionAccess().getInputCondition_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputCondition_Impl_0=ruleInputCondition_Impl();

                    state._fsp--;


                    			current = this_InputCondition_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:552:3: this_WorkPieceCondition_1= ruleWorkPieceCondition
                    {

                    			newCompositeNode(grammarAccess.getInputConditionAccess().getWorkPieceConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkPieceCondition_1=ruleWorkPieceCondition();

                    state._fsp--;


                    			current = this_WorkPieceCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:561:3: this_BinaryCondition_2= ruleBinaryCondition
                    {

                    			newCompositeNode(grammarAccess.getInputConditionAccess().getBinaryConditionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryCondition_2=ruleBinaryCondition();

                    state._fsp--;


                    			current = this_BinaryCondition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:570:3: this_Negation_3= ruleNegation
                    {

                    			newCompositeNode(grammarAccess.getInputConditionAccess().getNegationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negation_3=ruleNegation();

                    state._fsp--;


                    			current = this_Negation_3;
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
    // $ANTLR end "ruleInputCondition"


    // $ANTLR start "entryRuleManufacturingSystemElement_Impl"
    // InternalMyDsl.g:582:1: entryRuleManufacturingSystemElement_Impl returns [EObject current=null] : iv_ruleManufacturingSystemElement_Impl= ruleManufacturingSystemElement_Impl EOF ;
    public final EObject entryRuleManufacturingSystemElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManufacturingSystemElement_Impl = null;


        try {
            // InternalMyDsl.g:582:72: (iv_ruleManufacturingSystemElement_Impl= ruleManufacturingSystemElement_Impl EOF )
            // InternalMyDsl.g:583:2: iv_ruleManufacturingSystemElement_Impl= ruleManufacturingSystemElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManufacturingSystemElement_Impl=ruleManufacturingSystemElement_Impl();

            state._fsp--;

             current =iv_ruleManufacturingSystemElement_Impl; 
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
    // $ANTLR end "entryRuleManufacturingSystemElement_Impl"


    // $ANTLR start "ruleManufacturingSystemElement_Impl"
    // InternalMyDsl.g:589:1: ruleManufacturingSystemElement_Impl returns [EObject current=null] : ( () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= '}' ) ;
    public final EObject ruleManufacturingSystemElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:595:2: ( ( () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= '}' ) )
            // InternalMyDsl.g:596:2: ( () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= '}' )
            {
            // InternalMyDsl.g:596:2: ( () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= '}' )
            // InternalMyDsl.g:597:3: () otherlv_1= 'ManufacturingSystemElement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transition' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= '}'
            {
            // InternalMyDsl.g:597:3: ()
            // InternalMyDsl.g:598:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementKeyword_1());
            		
            // InternalMyDsl.g:608:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:609:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:609:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:610:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingSystemElement_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getManufacturingSystemElement_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:631:3: (otherlv_4= 'transition' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:632:4: otherlv_4= 'transition' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getManufacturingSystemElement_ImplAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMyDsl.g:640:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:641:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:641:5: ( ruleEString )
                    // InternalMyDsl.g:642:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManufacturingSystemElement_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:656:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:657:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getManufacturingSystemElement_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:661:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:662:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:662:6: ( ruleEString )
                    	    // InternalMyDsl.g:663:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManufacturingSystemElement_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getManufacturingSystemElement_ImplAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getManufacturingSystemElement_ImplAccess().getSetKeyword_5());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleKeyword_6());
            		
            // InternalMyDsl.g:691:3: ( ( ruleEString ) )
            // InternalMyDsl.g:692:4: ( ruleEString )
            {
            // InternalMyDsl.g:692:4: ( ruleEString )
            // InternalMyDsl.g:693:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManufacturingSystemElement_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleCrossReference_7_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getManufacturingSystemElement_ImplAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleManufacturingSystemElement_Impl"


    // $ANTLR start "entryRuleStoragePoint"
    // InternalMyDsl.g:715:1: entryRuleStoragePoint returns [EObject current=null] : iv_ruleStoragePoint= ruleStoragePoint EOF ;
    public final EObject entryRuleStoragePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoragePoint = null;


        try {
            // InternalMyDsl.g:715:53: (iv_ruleStoragePoint= ruleStoragePoint EOF )
            // InternalMyDsl.g:716:2: iv_ruleStoragePoint= ruleStoragePoint EOF
            {
             newCompositeNode(grammarAccess.getStoragePointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoragePoint=ruleStoragePoint();

            state._fsp--;

             current =iv_ruleStoragePoint; 
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
    // $ANTLR end "entryRuleStoragePoint"


    // $ANTLR start "ruleStoragePoint"
    // InternalMyDsl.g:722:1: ruleStoragePoint returns [EObject current=null] : (otherlv_0= 'StoragePoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'responsible' ( ( ruleEString ) ) (otherlv_6= 'stores' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'transition' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleStoragePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:728:2: ( (otherlv_0= 'StoragePoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'responsible' ( ( ruleEString ) ) (otherlv_6= 'stores' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'transition' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )? otherlv_14= '}' ) )
            // InternalMyDsl.g:729:2: (otherlv_0= 'StoragePoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'responsible' ( ( ruleEString ) ) (otherlv_6= 'stores' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'transition' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )? otherlv_14= '}' )
            {
            // InternalMyDsl.g:729:2: (otherlv_0= 'StoragePoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'responsible' ( ( ruleEString ) ) (otherlv_6= 'stores' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'transition' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )? otherlv_14= '}' )
            // InternalMyDsl.g:730:3: otherlv_0= 'StoragePoint' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'set' otherlv_4= 'responsible' ( ( ruleEString ) ) (otherlv_6= 'stores' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? (otherlv_10= 'transition' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStoragePointAccess().getStoragePointKeyword_0());
            		
            // InternalMyDsl.g:734:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:735:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:735:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:736:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStoragePointAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoragePointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStoragePointAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getStoragePointAccess().getSetKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getStoragePointAccess().getResponsibleKeyword_4());
            		
            // InternalMyDsl.g:765:3: ( ( ruleEString ) )
            // InternalMyDsl.g:766:4: ( ruleEString )
            {
            // InternalMyDsl.g:766:4: ( ruleEString )
            // InternalMyDsl.g:767:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoragePointRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStoragePointAccess().getResponsibleResponsibleCrossReference_5_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:781:3: (otherlv_6= 'stores' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:782:4: otherlv_6= 'stores' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getStoragePointAccess().getStoresKeyword_6_0());
                    			
                    // InternalMyDsl.g:786:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:787:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:787:5: ( ruleEString )
                    // InternalMyDsl.g:788:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoragePointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:802:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:803:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getStoragePointAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:807:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:808:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:808:6: ( ruleEString )
                    	    // InternalMyDsl.g:809:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStoragePointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:825:3: (otherlv_10= 'transition' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:826:4: otherlv_10= 'transition' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getStoragePointAccess().getTransitionKeyword_7_0());
                    			
                    // InternalMyDsl.g:830:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:831:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:831:5: ( ruleEString )
                    // InternalMyDsl.g:832:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoragePointRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:846:4: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:847:5: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getStoragePointAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalMyDsl.g:851:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:852:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:852:6: ( ruleEString )
                    	    // InternalMyDsl.g:853:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getStoragePointRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_28);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getStoragePointAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleStoragePoint"


    // $ANTLR start "entryRuleWorkPieceType"
    // InternalMyDsl.g:877:1: entryRuleWorkPieceType returns [EObject current=null] : iv_ruleWorkPieceType= ruleWorkPieceType EOF ;
    public final EObject entryRuleWorkPieceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkPieceType = null;


        try {
            // InternalMyDsl.g:877:54: (iv_ruleWorkPieceType= ruleWorkPieceType EOF )
            // InternalMyDsl.g:878:2: iv_ruleWorkPieceType= ruleWorkPieceType EOF
            {
             newCompositeNode(grammarAccess.getWorkPieceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkPieceType=ruleWorkPieceType();

            state._fsp--;

             current =iv_ruleWorkPieceType; 
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
    // $ANTLR end "entryRuleWorkPieceType"


    // $ANTLR start "ruleWorkPieceType"
    // InternalMyDsl.g:884:1: ruleWorkPieceType returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleWorkPieceType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:890:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:891:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:891:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:892:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:892:3: ()
            // InternalMyDsl.g:893:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkPieceTypeAccess().getWorkPieceTypeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:899:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:900:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:900:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:901:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkPieceTypeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkPieceTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleWorkPieceType"


    // $ANTLR start "entryRuleWorkPiece"
    // InternalMyDsl.g:922:1: entryRuleWorkPiece returns [EObject current=null] : iv_ruleWorkPiece= ruleWorkPiece EOF ;
    public final EObject entryRuleWorkPiece() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkPiece = null;


        try {
            // InternalMyDsl.g:922:50: (iv_ruleWorkPiece= ruleWorkPiece EOF )
            // InternalMyDsl.g:923:2: iv_ruleWorkPiece= ruleWorkPiece EOF
            {
             newCompositeNode(grammarAccess.getWorkPieceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkPiece=ruleWorkPiece();

            state._fsp--;

             current =iv_ruleWorkPiece; 
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
    // $ANTLR end "entryRuleWorkPiece"


    // $ANTLR start "ruleWorkPiece"
    // InternalMyDsl.g:929:1: ruleWorkPiece returns [EObject current=null] : (otherlv_0= 'WorkPiece' otherlv_1= '{' otherlv_2= 'of' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleWorkPiece() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:935:2: ( (otherlv_0= 'WorkPiece' otherlv_1= '{' otherlv_2= 'of' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:936:2: (otherlv_0= 'WorkPiece' otherlv_1= '{' otherlv_2= 'of' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:936:2: (otherlv_0= 'WorkPiece' otherlv_1= '{' otherlv_2= 'of' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:937:3: otherlv_0= 'WorkPiece' otherlv_1= '{' otherlv_2= 'of' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkPieceAccess().getWorkPieceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkPieceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkPieceAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkPieceAccess().getTypeKeyword_3());
            		
            // InternalMyDsl.g:953:3: ( ( ruleEString ) )
            // InternalMyDsl.g:954:4: ( ruleEString )
            {
            // InternalMyDsl.g:954:4: ( ruleEString )
            // InternalMyDsl.g:955:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkPieceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWorkPieceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleWorkPiece"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:977:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:977:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:978:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:984:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:990:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:991:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:991:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:992:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1000:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleResponsible"
    // InternalMyDsl.g:1011:1: entryRuleResponsible returns [EObject current=null] : iv_ruleResponsible= ruleResponsible EOF ;
    public final EObject entryRuleResponsible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResponsible = null;


        try {
            // InternalMyDsl.g:1011:52: (iv_ruleResponsible= ruleResponsible EOF )
            // InternalMyDsl.g:1012:2: iv_ruleResponsible= ruleResponsible EOF
            {
             newCompositeNode(grammarAccess.getResponsibleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResponsible=ruleResponsible();

            state._fsp--;

             current =iv_ruleResponsible; 
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
    // $ANTLR end "entryRuleResponsible"


    // $ANTLR start "ruleResponsible"
    // InternalMyDsl.g:1018:1: ruleResponsible returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleResponsible() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1024:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1025:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1025:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:1026:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:1026:3: ()
            // InternalMyDsl.g:1027:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResponsibleAccess().getResponsibleAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1033:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1034:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1034:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1035:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResponsibleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResponsibleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleResponsible"


    // $ANTLR start "entryRuleManufacturingStep"
    // InternalMyDsl.g:1056:1: entryRuleManufacturingStep returns [EObject current=null] : iv_ruleManufacturingStep= ruleManufacturingStep EOF ;
    public final EObject entryRuleManufacturingStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManufacturingStep = null;


        try {
            // InternalMyDsl.g:1056:58: (iv_ruleManufacturingStep= ruleManufacturingStep EOF )
            // InternalMyDsl.g:1057:2: iv_ruleManufacturingStep= ruleManufacturingStep EOF
            {
             newCompositeNode(grammarAccess.getManufacturingStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManufacturingStep=ruleManufacturingStep();

            state._fsp--;

             current =iv_ruleManufacturingStep; 
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
    // $ANTLR end "entryRuleManufacturingStep"


    // $ANTLR start "ruleManufacturingStep"
    // InternalMyDsl.g:1063:1: ruleManufacturingStep returns [EObject current=null] : (otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject ruleManufacturingStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_speed_5_0 = null;

        EObject lv_input_15_0 = null;

        EObject lv_input_17_0 = null;

        EObject lv_output_21_0 = null;

        EObject lv_output_23_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1069:2: ( (otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // InternalMyDsl.g:1070:2: (otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // InternalMyDsl.g:1070:2: (otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // InternalMyDsl.g:1071:3: otherlv_0= 'ManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getManufacturingStepAccess().getManufacturingStepKeyword_0());
            		
            // InternalMyDsl.g:1075:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1076:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1076:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1077:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManufacturingStepAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getManufacturingStepAccess().getSpeedKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getManufacturingStepAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1106:3: ( (lv_speed_5_0= ruleEInt ) )
            // InternalMyDsl.g:1107:4: (lv_speed_5_0= ruleEInt )
            {
            // InternalMyDsl.g:1107:4: (lv_speed_5_0= ruleEInt )
            // InternalMyDsl.g:1108:5: lv_speed_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getManufacturingStepAccess().getSpeedEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_speed_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            					}
            					set(
            						current,
            						"speed",
            						lv_speed_5_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1125:3: (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1126:4: otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getManufacturingStepAccess().getTransitionKeyword_6_0());
                    			
                    // InternalMyDsl.g:1130:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1131:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1131:5: ( ruleEString )
                    // InternalMyDsl.g:1132:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getManufacturingStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1146:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMyDsl.g:1147:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getManufacturingStepAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:1151:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1152:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1152:6: ( ruleEString )
                    	    // InternalMyDsl.g:1153:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getManufacturingStepRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getManufacturingStepAccess().getSetKeyword_7());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getManufacturingStepAccess().getResponsibleKeyword_8());
            		
            // InternalMyDsl.g:1177:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1178:4: ( ruleEString )
            {
            // InternalMyDsl.g:1178:4: ( ruleEString )
            // InternalMyDsl.g:1179:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManufacturingStepRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleCrossReference_9_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getManufacturingStepAccess().getInputKeyword_10());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMyDsl.g:1201:3: ( (lv_input_15_0= ruleInputCondition ) )
            // InternalMyDsl.g:1202:4: (lv_input_15_0= ruleInputCondition )
            {
            // InternalMyDsl.g:1202:4: (lv_input_15_0= ruleInputCondition )
            // InternalMyDsl.g:1203:5: lv_input_15_0= ruleInputCondition
            {

            					newCompositeNode(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_28);
            lv_input_15_0=ruleInputCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_15_0,
            						"org.xtext.example.mydsl.MyDsl.InputCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1220:3: (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1221:4: otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_34); 

            	    				newLeafNode(otherlv_16, grammarAccess.getManufacturingStepAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:1225:4: ( (lv_input_17_0= ruleInputCondition ) )
            	    // InternalMyDsl.g:1226:5: (lv_input_17_0= ruleInputCondition )
            	    {
            	    // InternalMyDsl.g:1226:5: (lv_input_17_0= ruleInputCondition )
            	    // InternalMyDsl.g:1227:6: lv_input_17_0= ruleInputCondition
            	    {

            	    						newCompositeNode(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_input_17_0=ruleInputCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_17_0,
            	    							"org.xtext.example.mydsl.MyDsl.InputCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_18=(Token)match(input,25,FOLLOW_35); 

            			newLeafNode(otherlv_18, grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_19=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getManufacturingStepAccess().getOutputKeyword_15());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_20, grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalMyDsl.g:1257:3: ( (lv_output_21_0= ruleOutputDecision ) )
            // InternalMyDsl.g:1258:4: (lv_output_21_0= ruleOutputDecision )
            {
            // InternalMyDsl.g:1258:4: (lv_output_21_0= ruleOutputDecision )
            // InternalMyDsl.g:1259:5: lv_output_21_0= ruleOutputDecision
            {

            					newCompositeNode(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_28);
            lv_output_21_0=ruleOutputDecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            					}
            					add(
            						current,
            						"output",
            						lv_output_21_0,
            						"org.xtext.example.mydsl.MyDsl.OutputDecision");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1276:3: (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==16) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:1277:4: otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_36); 

            	    				newLeafNode(otherlv_22, grammarAccess.getManufacturingStepAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalMyDsl.g:1281:4: ( (lv_output_23_0= ruleOutputDecision ) )
            	    // InternalMyDsl.g:1282:5: (lv_output_23_0= ruleOutputDecision )
            	    {
            	    // InternalMyDsl.g:1282:5: (lv_output_23_0= ruleOutputDecision )
            	    // InternalMyDsl.g:1283:6: lv_output_23_0= ruleOutputDecision
            	    {

            	    						newCompositeNode(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_output_23_0=ruleOutputDecision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getManufacturingStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"output",
            	    							lv_output_23_0,
            	    							"org.xtext.example.mydsl.MyDsl.OutputDecision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_24=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_24, grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_19());
            		
            otherlv_25=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleManufacturingStep"


    // $ANTLR start "entryRuleTransportStep"
    // InternalMyDsl.g:1313:1: entryRuleTransportStep returns [EObject current=null] : iv_ruleTransportStep= ruleTransportStep EOF ;
    public final EObject entryRuleTransportStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransportStep = null;


        try {
            // InternalMyDsl.g:1313:54: (iv_ruleTransportStep= ruleTransportStep EOF )
            // InternalMyDsl.g:1314:2: iv_ruleTransportStep= ruleTransportStep EOF
            {
             newCompositeNode(grammarAccess.getTransportStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransportStep=ruleTransportStep();

            state._fsp--;

             current =iv_ruleTransportStep; 
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
    // $ANTLR end "entryRuleTransportStep"


    // $ANTLR start "ruleTransportStep"
    // InternalMyDsl.g:1320:1: ruleTransportStep returns [EObject current=null] : (otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject ruleTransportStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_speed_5_0 = null;

        EObject lv_input_15_0 = null;

        EObject lv_input_17_0 = null;

        EObject lv_output_21_0 = null;

        EObject lv_output_23_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1326:2: ( (otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // InternalMyDsl.g:1327:2: (otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // InternalMyDsl.g:1327:2: (otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // InternalMyDsl.g:1328:3: otherlv_0= 'TransportStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransportStepAccess().getTransportStepKeyword_0());
            		
            // InternalMyDsl.g:1332:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1333:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1333:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1334:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransportStepAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getTransportStepAccess().getSpeedKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getTransportStepAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1363:3: ( (lv_speed_5_0= ruleEInt ) )
            // InternalMyDsl.g:1364:4: (lv_speed_5_0= ruleEInt )
            {
            // InternalMyDsl.g:1364:4: (lv_speed_5_0= ruleEInt )
            // InternalMyDsl.g:1365:5: lv_speed_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTransportStepAccess().getSpeedEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_speed_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportStepRule());
            					}
            					set(
            						current,
            						"speed",
            						lv_speed_5_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1382:3: (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1383:4: otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getTransportStepAccess().getTransitionKeyword_6_0());
                    			
                    // InternalMyDsl.g:1387:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1388:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1388:5: ( ruleEString )
                    // InternalMyDsl.g:1389:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransportStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1403:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==16) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyDsl.g:1404:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getTransportStepAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:1408:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1409:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1409:6: ( ruleEString )
                    	    // InternalMyDsl.g:1410:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransportStepRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getTransportStepAccess().getSetKeyword_7());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getTransportStepAccess().getResponsibleKeyword_8());
            		
            // InternalMyDsl.g:1434:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1435:4: ( ruleEString )
            {
            // InternalMyDsl.g:1435:4: ( ruleEString )
            // InternalMyDsl.g:1436:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransportStepRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransportStepAccess().getResponsibleResponsibleCrossReference_9_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getTransportStepAccess().getInputKeyword_10());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMyDsl.g:1458:3: ( (lv_input_15_0= ruleInputCondition ) )
            // InternalMyDsl.g:1459:4: (lv_input_15_0= ruleInputCondition )
            {
            // InternalMyDsl.g:1459:4: (lv_input_15_0= ruleInputCondition )
            // InternalMyDsl.g:1460:5: lv_input_15_0= ruleInputCondition
            {

            					newCompositeNode(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_28);
            lv_input_15_0=ruleInputCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportStepRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_15_0,
            						"org.xtext.example.mydsl.MyDsl.InputCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1477:3: (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:1478:4: otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_34); 

            	    				newLeafNode(otherlv_16, grammarAccess.getTransportStepAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:1482:4: ( (lv_input_17_0= ruleInputCondition ) )
            	    // InternalMyDsl.g:1483:5: (lv_input_17_0= ruleInputCondition )
            	    {
            	    // InternalMyDsl.g:1483:5: (lv_input_17_0= ruleInputCondition )
            	    // InternalMyDsl.g:1484:6: lv_input_17_0= ruleInputCondition
            	    {

            	    						newCompositeNode(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_input_17_0=ruleInputCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransportStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_17_0,
            	    							"org.xtext.example.mydsl.MyDsl.InputCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_18=(Token)match(input,25,FOLLOW_35); 

            			newLeafNode(otherlv_18, grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_19=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getTransportStepAccess().getOutputKeyword_15());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_20, grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalMyDsl.g:1514:3: ( (lv_output_21_0= ruleOutputDecision ) )
            // InternalMyDsl.g:1515:4: (lv_output_21_0= ruleOutputDecision )
            {
            // InternalMyDsl.g:1515:4: (lv_output_21_0= ruleOutputDecision )
            // InternalMyDsl.g:1516:5: lv_output_21_0= ruleOutputDecision
            {

            					newCompositeNode(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_28);
            lv_output_21_0=ruleOutputDecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransportStepRule());
            					}
            					add(
            						current,
            						"output",
            						lv_output_21_0,
            						"org.xtext.example.mydsl.MyDsl.OutputDecision");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1533:3: (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:1534:4: otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_36); 

            	    				newLeafNode(otherlv_22, grammarAccess.getTransportStepAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalMyDsl.g:1538:4: ( (lv_output_23_0= ruleOutputDecision ) )
            	    // InternalMyDsl.g:1539:5: (lv_output_23_0= ruleOutputDecision )
            	    {
            	    // InternalMyDsl.g:1539:5: (lv_output_23_0= ruleOutputDecision )
            	    // InternalMyDsl.g:1540:6: lv_output_23_0= ruleOutputDecision
            	    {

            	    						newCompositeNode(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_output_23_0=ruleOutputDecision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransportStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"output",
            	    							lv_output_23_0,
            	    							"org.xtext.example.mydsl.MyDsl.OutputDecision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_24=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_24, grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_19());
            		
            otherlv_25=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleTransportStep"


    // $ANTLR start "entryRuleQualityAssuranceStep"
    // InternalMyDsl.g:1570:1: entryRuleQualityAssuranceStep returns [EObject current=null] : iv_ruleQualityAssuranceStep= ruleQualityAssuranceStep EOF ;
    public final EObject entryRuleQualityAssuranceStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityAssuranceStep = null;


        try {
            // InternalMyDsl.g:1570:61: (iv_ruleQualityAssuranceStep= ruleQualityAssuranceStep EOF )
            // InternalMyDsl.g:1571:2: iv_ruleQualityAssuranceStep= ruleQualityAssuranceStep EOF
            {
             newCompositeNode(grammarAccess.getQualityAssuranceStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityAssuranceStep=ruleQualityAssuranceStep();

            state._fsp--;

             current =iv_ruleQualityAssuranceStep; 
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
    // $ANTLR end "entryRuleQualityAssuranceStep"


    // $ANTLR start "ruleQualityAssuranceStep"
    // InternalMyDsl.g:1577:1: ruleQualityAssuranceStep returns [EObject current=null] : (otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject ruleQualityAssuranceStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_speed_5_0 = null;

        EObject lv_input_15_0 = null;

        EObject lv_input_17_0 = null;

        EObject lv_output_21_0 = null;

        EObject lv_output_23_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1583:2: ( (otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // InternalMyDsl.g:1584:2: (otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // InternalMyDsl.g:1584:2: (otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // InternalMyDsl.g:1585:3: otherlv_0= 'QualityAssuranceStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQualityAssuranceStepAccess().getQualityAssuranceStepKeyword_0());
            		
            // InternalMyDsl.g:1589:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1590:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1590:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1591:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getQualityAssuranceStepAccess().getSpeedKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getQualityAssuranceStepAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1620:3: ( (lv_speed_5_0= ruleEInt ) )
            // InternalMyDsl.g:1621:4: (lv_speed_5_0= ruleEInt )
            {
            // InternalMyDsl.g:1621:4: (lv_speed_5_0= ruleEInt )
            // InternalMyDsl.g:1622:5: lv_speed_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getSpeedEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_speed_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            					}
            					set(
            						current,
            						"speed",
            						lv_speed_5_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1639:3: (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1640:4: otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getQualityAssuranceStepAccess().getTransitionKeyword_6_0());
                    			
                    // InternalMyDsl.g:1644:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1645:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1645:5: ( ruleEString )
                    // InternalMyDsl.g:1646:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQualityAssuranceStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1660:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:1661:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:1665:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1666:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1666:6: ( ruleEString )
                    	    // InternalMyDsl.g:1667:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getQualityAssuranceStepRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getQualityAssuranceStepAccess().getSetKeyword_7());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getQualityAssuranceStepAccess().getResponsibleKeyword_8());
            		
            // InternalMyDsl.g:1691:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1692:4: ( ruleEString )
            {
            // InternalMyDsl.g:1692:4: ( ruleEString )
            // InternalMyDsl.g:1693:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualityAssuranceStepRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleCrossReference_9_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getQualityAssuranceStepAccess().getInputKeyword_10());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMyDsl.g:1715:3: ( (lv_input_15_0= ruleInputCondition ) )
            // InternalMyDsl.g:1716:4: (lv_input_15_0= ruleInputCondition )
            {
            // InternalMyDsl.g:1716:4: (lv_input_15_0= ruleInputCondition )
            // InternalMyDsl.g:1717:5: lv_input_15_0= ruleInputCondition
            {

            					newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_28);
            lv_input_15_0=ruleInputCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_15_0,
            						"org.xtext.example.mydsl.MyDsl.InputCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1734:3: (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:1735:4: otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_34); 

            	    				newLeafNode(otherlv_16, grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:1739:4: ( (lv_input_17_0= ruleInputCondition ) )
            	    // InternalMyDsl.g:1740:5: (lv_input_17_0= ruleInputCondition )
            	    {
            	    // InternalMyDsl.g:1740:5: (lv_input_17_0= ruleInputCondition )
            	    // InternalMyDsl.g:1741:6: lv_input_17_0= ruleInputCondition
            	    {

            	    						newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_input_17_0=ruleInputCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_17_0,
            	    							"org.xtext.example.mydsl.MyDsl.InputCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_18=(Token)match(input,25,FOLLOW_35); 

            			newLeafNode(otherlv_18, grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_19=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getQualityAssuranceStepAccess().getOutputKeyword_15());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_20, grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalMyDsl.g:1771:3: ( (lv_output_21_0= ruleOutputDecision ) )
            // InternalMyDsl.g:1772:4: (lv_output_21_0= ruleOutputDecision )
            {
            // InternalMyDsl.g:1772:4: (lv_output_21_0= ruleOutputDecision )
            // InternalMyDsl.g:1773:5: lv_output_21_0= ruleOutputDecision
            {

            					newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_28);
            lv_output_21_0=ruleOutputDecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            					}
            					add(
            						current,
            						"output",
            						lv_output_21_0,
            						"org.xtext.example.mydsl.MyDsl.OutputDecision");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1790:3: (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==16) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:1791:4: otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_36); 

            	    				newLeafNode(otherlv_22, grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalMyDsl.g:1795:4: ( (lv_output_23_0= ruleOutputDecision ) )
            	    // InternalMyDsl.g:1796:5: (lv_output_23_0= ruleOutputDecision )
            	    {
            	    // InternalMyDsl.g:1796:5: (lv_output_23_0= ruleOutputDecision )
            	    // InternalMyDsl.g:1797:6: lv_output_23_0= ruleOutputDecision
            	    {

            	    						newCompositeNode(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_output_23_0=ruleOutputDecision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQualityAssuranceStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"output",
            	    							lv_output_23_0,
            	    							"org.xtext.example.mydsl.MyDsl.OutputDecision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_24=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_24, grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_19());
            		
            otherlv_25=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleQualityAssuranceStep"


    // $ANTLR start "entryRuleCompositeManufacturingStep"
    // InternalMyDsl.g:1827:1: entryRuleCompositeManufacturingStep returns [EObject current=null] : iv_ruleCompositeManufacturingStep= ruleCompositeManufacturingStep EOF ;
    public final EObject entryRuleCompositeManufacturingStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeManufacturingStep = null;


        try {
            // InternalMyDsl.g:1827:67: (iv_ruleCompositeManufacturingStep= ruleCompositeManufacturingStep EOF )
            // InternalMyDsl.g:1828:2: iv_ruleCompositeManufacturingStep= ruleCompositeManufacturingStep EOF
            {
             newCompositeNode(grammarAccess.getCompositeManufacturingStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeManufacturingStep=ruleCompositeManufacturingStep();

            state._fsp--;

             current =iv_ruleCompositeManufacturingStep; 
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
    // $ANTLR end "entryRuleCompositeManufacturingStep"


    // $ANTLR start "ruleCompositeManufacturingStep"
    // InternalMyDsl.g:1834:1: ruleCompositeManufacturingStep returns [EObject current=null] : (otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= 'contains' ( (lv_contains_26_0= ruleManufacturingSystem ) ) otherlv_27= '}' ) ;
    public final EObject ruleCompositeManufacturingStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_speed_5_0 = null;

        EObject lv_input_15_0 = null;

        EObject lv_input_17_0 = null;

        EObject lv_output_21_0 = null;

        EObject lv_output_23_0 = null;

        EObject lv_contains_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1840:2: ( (otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= 'contains' ( (lv_contains_26_0= ruleManufacturingSystem ) ) otherlv_27= '}' ) )
            // InternalMyDsl.g:1841:2: (otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= 'contains' ( (lv_contains_26_0= ruleManufacturingSystem ) ) otherlv_27= '}' )
            {
            // InternalMyDsl.g:1841:2: (otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= 'contains' ( (lv_contains_26_0= ruleManufacturingSystem ) ) otherlv_27= '}' )
            // InternalMyDsl.g:1842:3: otherlv_0= 'CompositeManufacturingStep' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'speed' otherlv_4= '=' ( (lv_speed_5_0= ruleEInt ) ) (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )? otherlv_10= 'set' otherlv_11= 'responsible' ( ( ruleEString ) ) otherlv_13= 'input' otherlv_14= '{' ( (lv_input_15_0= ruleInputCondition ) ) (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )* otherlv_18= '}' otherlv_19= 'output' otherlv_20= '{' ( (lv_output_21_0= ruleOutputDecision ) ) (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )* otherlv_24= '}' otherlv_25= 'contains' ( (lv_contains_26_0= ruleManufacturingSystem ) ) otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeManufacturingStepAccess().getCompositeManufacturingStepKeyword_0());
            		
            // InternalMyDsl.g:1846:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1847:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1847:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1848:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeManufacturingStepAccess().getSpeedKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositeManufacturingStepAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:1877:3: ( (lv_speed_5_0= ruleEInt ) )
            // InternalMyDsl.g:1878:4: (lv_speed_5_0= ruleEInt )
            {
            // InternalMyDsl.g:1878:4: (lv_speed_5_0= ruleEInt )
            // InternalMyDsl.g:1879:5: lv_speed_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getSpeedEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_speed_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            					}
            					set(
            						current,
            						"speed",
            						lv_speed_5_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1896:3: (otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1897:4: otherlv_6= 'transition' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getCompositeManufacturingStepAccess().getTransitionKeyword_6_0());
                    			
                    // InternalMyDsl.g:1901:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1902:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1902:5: ( ruleEString )
                    // InternalMyDsl.g:1903:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeManufacturingStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1917:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==16) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyDsl.g:1918:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalMyDsl.g:1922:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1923:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1923:6: ( ruleEString )
                    	    // InternalMyDsl.g:1924:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompositeManufacturingStepRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeManufacturingStepAccess().getSetKeyword_7());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositeManufacturingStepAccess().getResponsibleKeyword_8());
            		
            // InternalMyDsl.g:1948:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1949:4: ( ruleEString )
            {
            // InternalMyDsl.g:1949:4: ( ruleEString )
            // InternalMyDsl.g:1950:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeManufacturingStepRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleCrossReference_9_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getCompositeManufacturingStepAccess().getInputKeyword_10());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMyDsl.g:1972:3: ( (lv_input_15_0= ruleInputCondition ) )
            // InternalMyDsl.g:1973:4: (lv_input_15_0= ruleInputCondition )
            {
            // InternalMyDsl.g:1973:4: (lv_input_15_0= ruleInputCondition )
            // InternalMyDsl.g:1974:5: lv_input_15_0= ruleInputCondition
            {

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_28);
            lv_input_15_0=ruleInputCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_15_0,
            						"org.xtext.example.mydsl.MyDsl.InputCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1991:3: (otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==16) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:1992:4: otherlv_16= ',' ( (lv_input_17_0= ruleInputCondition ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_34); 

            	    				newLeafNode(otherlv_16, grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:1996:4: ( (lv_input_17_0= ruleInputCondition ) )
            	    // InternalMyDsl.g:1997:5: (lv_input_17_0= ruleInputCondition )
            	    {
            	    // InternalMyDsl.g:1997:5: (lv_input_17_0= ruleInputCondition )
            	    // InternalMyDsl.g:1998:6: lv_input_17_0= ruleInputCondition
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_input_17_0=ruleInputCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_17_0,
            	    							"org.xtext.example.mydsl.MyDsl.InputCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_18=(Token)match(input,25,FOLLOW_35); 

            			newLeafNode(otherlv_18, grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_19=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getCompositeManufacturingStepAccess().getOutputKeyword_15());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_20, grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalMyDsl.g:2028:3: ( (lv_output_21_0= ruleOutputDecision ) )
            // InternalMyDsl.g:2029:4: (lv_output_21_0= ruleOutputDecision )
            {
            // InternalMyDsl.g:2029:4: (lv_output_21_0= ruleOutputDecision )
            // InternalMyDsl.g:2030:5: lv_output_21_0= ruleOutputDecision
            {

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_28);
            lv_output_21_0=ruleOutputDecision();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            					}
            					add(
            						current,
            						"output",
            						lv_output_21_0,
            						"org.xtext.example.mydsl.MyDsl.OutputDecision");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2047:3: (otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==16) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:2048:4: otherlv_22= ',' ( (lv_output_23_0= ruleOutputDecision ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_36); 

            	    				newLeafNode(otherlv_22, grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalMyDsl.g:2052:4: ( (lv_output_23_0= ruleOutputDecision ) )
            	    // InternalMyDsl.g:2053:5: (lv_output_23_0= ruleOutputDecision )
            	    {
            	    // InternalMyDsl.g:2053:5: (lv_output_23_0= ruleOutputDecision )
            	    // InternalMyDsl.g:2054:6: lv_output_23_0= ruleOutputDecision
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_output_23_0=ruleOutputDecision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"output",
            	    							lv_output_23_0,
            	    							"org.xtext.example.mydsl.MyDsl.OutputDecision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_24=(Token)match(input,25,FOLLOW_37); 

            			newLeafNode(otherlv_24, grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_19());
            		
            otherlv_25=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_25, grammarAccess.getCompositeManufacturingStepAccess().getContainsKeyword_20());
            		
            // InternalMyDsl.g:2080:3: ( (lv_contains_26_0= ruleManufacturingSystem ) )
            // InternalMyDsl.g:2081:4: (lv_contains_26_0= ruleManufacturingSystem )
            {
            // InternalMyDsl.g:2081:4: (lv_contains_26_0= ruleManufacturingSystem )
            // InternalMyDsl.g:2082:5: lv_contains_26_0= ruleManufacturingSystem
            {

            					newCompositeNode(grammarAccess.getCompositeManufacturingStepAccess().getContainsManufacturingSystemParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_25);
            lv_contains_26_0=ruleManufacturingSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeManufacturingStepRule());
            					}
            					set(
            						current,
            						"contains",
            						lv_contains_26_0,
            						"org.xtext.example.mydsl.MyDsl.ManufacturingSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_22());
            		

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
    // $ANTLR end "ruleCompositeManufacturingStep"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:2107:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:2107:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:2108:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:2114:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2120:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:2121:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:2121:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:2122:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:2122:3: (kw= '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2123:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_39); 

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


    // $ANTLR start "entryRuleInputCondition_Impl"
    // InternalMyDsl.g:2140:1: entryRuleInputCondition_Impl returns [EObject current=null] : iv_ruleInputCondition_Impl= ruleInputCondition_Impl EOF ;
    public final EObject entryRuleInputCondition_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCondition_Impl = null;


        try {
            // InternalMyDsl.g:2140:60: (iv_ruleInputCondition_Impl= ruleInputCondition_Impl EOF )
            // InternalMyDsl.g:2141:2: iv_ruleInputCondition_Impl= ruleInputCondition_Impl EOF
            {
             newCompositeNode(grammarAccess.getInputCondition_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputCondition_Impl=ruleInputCondition_Impl();

            state._fsp--;

             current =iv_ruleInputCondition_Impl; 
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
    // $ANTLR end "entryRuleInputCondition_Impl"


    // $ANTLR start "ruleInputCondition_Impl"
    // InternalMyDsl.g:2147:1: ruleInputCondition_Impl returns [EObject current=null] : ( () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInputCondition_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2153:2: ( ( () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:2154:2: ( () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:2154:2: ( () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:2155:3: () otherlv_1= 'InputCondition' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:2155:3: ()
            // InternalMyDsl.g:2156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputCondition_ImplAccess().getInputConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputCondition_ImplAccess().getInputConditionKeyword_1());
            		
            // InternalMyDsl.g:2166:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:2167:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:2167:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:2168:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputCondition_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputCondition_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleInputCondition_Impl"


    // $ANTLR start "entryRuleOutputDecision"
    // InternalMyDsl.g:2189:1: entryRuleOutputDecision returns [EObject current=null] : iv_ruleOutputDecision= ruleOutputDecision EOF ;
    public final EObject entryRuleOutputDecision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDecision = null;


        try {
            // InternalMyDsl.g:2189:55: (iv_ruleOutputDecision= ruleOutputDecision EOF )
            // InternalMyDsl.g:2190:2: iv_ruleOutputDecision= ruleOutputDecision EOF
            {
             newCompositeNode(grammarAccess.getOutputDecisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputDecision=ruleOutputDecision();

            state._fsp--;

             current =iv_ruleOutputDecision; 
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
    // $ANTLR end "entryRuleOutputDecision"


    // $ANTLR start "ruleOutputDecision"
    // InternalMyDsl.g:2196:1: ruleOutputDecision returns [EObject current=null] : ( (otherlv_0= 'output' otherlv_1= 'type' ( ( ruleEString ) ) )? otherlv_3= 'input' otherlv_4= 'condition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleOutputDecision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2202:2: ( ( (otherlv_0= 'output' otherlv_1= 'type' ( ( ruleEString ) ) )? otherlv_3= 'input' otherlv_4= 'condition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* ) )
            // InternalMyDsl.g:2203:2: ( (otherlv_0= 'output' otherlv_1= 'type' ( ( ruleEString ) ) )? otherlv_3= 'input' otherlv_4= 'condition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )
            {
            // InternalMyDsl.g:2203:2: ( (otherlv_0= 'output' otherlv_1= 'type' ( ( ruleEString ) ) )? otherlv_3= 'input' otherlv_4= 'condition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* )
            // InternalMyDsl.g:2204:3: (otherlv_0= 'output' otherlv_1= 'type' ( ( ruleEString ) ) )? otherlv_3= 'input' otherlv_4= 'condition' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )*
            {
            // InternalMyDsl.g:2204:3: (otherlv_0= 'output' otherlv_1= 'type' ( ( ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2205:4: otherlv_0= 'output' otherlv_1= 'type' ( ( ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getOutputDecisionAccess().getOutputKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOutputDecisionAccess().getTypeKeyword_0_1());
                    			
                    // InternalMyDsl.g:2213:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2214:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2214:5: ( ruleEString )
                    // InternalMyDsl.g:2215:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputDecisionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeCrossReference_0_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputDecisionAccess().getInputKeyword_1());
            		
            otherlv_4=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputDecisionAccess().getConditionKeyword_2());
            		
            // InternalMyDsl.g:2238:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2239:4: ( ruleEString )
            {
            // InternalMyDsl.g:2239:4: ( ruleEString )
            // InternalMyDsl.g:2240:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputDecisionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_3_0());
            				
            pushFollow(FOLLOW_41);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2254:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==16) ) {
                    int LA39_1 = input.LA(2);

                    if ( ((LA39_1>=RULE_STRING && LA39_1<=RULE_ID)) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalMyDsl.g:2255:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getOutputDecisionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:2259:4: ( ( ruleEString ) )
            	    // InternalMyDsl.g:2260:5: ( ruleEString )
            	    {
            	    // InternalMyDsl.g:2260:5: ( ruleEString )
            	    // InternalMyDsl.g:2261:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputDecisionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_4_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


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
    // $ANTLR end "ruleOutputDecision"


    // $ANTLR start "entryRuleWorkPieceCondition"
    // InternalMyDsl.g:2280:1: entryRuleWorkPieceCondition returns [EObject current=null] : iv_ruleWorkPieceCondition= ruleWorkPieceCondition EOF ;
    public final EObject entryRuleWorkPieceCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkPieceCondition = null;


        try {
            // InternalMyDsl.g:2280:59: (iv_ruleWorkPieceCondition= ruleWorkPieceCondition EOF )
            // InternalMyDsl.g:2281:2: iv_ruleWorkPieceCondition= ruleWorkPieceCondition EOF
            {
             newCompositeNode(grammarAccess.getWorkPieceConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkPieceCondition=ruleWorkPieceCondition();

            state._fsp--;

             current =iv_ruleWorkPieceCondition; 
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
    // $ANTLR end "entryRuleWorkPieceCondition"


    // $ANTLR start "ruleWorkPieceCondition"
    // InternalMyDsl.g:2287:1: ruleWorkPieceCondition returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'requires' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleWorkPieceCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2293:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'requires' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalMyDsl.g:2294:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'requires' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalMyDsl.g:2294:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'requires' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalMyDsl.g:2295:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'requires' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            // InternalMyDsl.g:2295:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:2296:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:2296:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:2297:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWorkPieceConditionAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkPieceConditionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkPieceConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkPieceConditionAccess().getRequiresKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkPieceConditionAccess().getTypeKeyword_3());
            		
            // InternalMyDsl.g:2326:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2327:4: ( ruleEString )
            {
            // InternalMyDsl.g:2327:4: ( ruleEString )
            // InternalMyDsl.g:2328:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkPieceConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWorkPieceConditionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleWorkPieceCondition"


    // $ANTLR start "entryRuleBinaryCondition"
    // InternalMyDsl.g:2350:1: entryRuleBinaryCondition returns [EObject current=null] : iv_ruleBinaryCondition= ruleBinaryCondition EOF ;
    public final EObject entryRuleBinaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryCondition = null;


        try {
            // InternalMyDsl.g:2350:56: (iv_ruleBinaryCondition= ruleBinaryCondition EOF )
            // InternalMyDsl.g:2351:2: iv_ruleBinaryCondition= ruleBinaryCondition EOF
            {
             newCompositeNode(grammarAccess.getBinaryConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryCondition=ruleBinaryCondition();

            state._fsp--;

             current =iv_ruleBinaryCondition; 
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
    // $ANTLR end "entryRuleBinaryCondition"


    // $ANTLR start "ruleBinaryCondition"
    // InternalMyDsl.g:2357:1: ruleBinaryCondition returns [EObject current=null] : (otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( ruleEString ) ) ( (lv_type_5_0= ruleBinaryType ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleBinaryCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2363:2: ( (otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( ruleEString ) ) ( (lv_type_5_0= ruleBinaryType ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:2364:2: (otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( ruleEString ) ) ( (lv_type_5_0= ruleBinaryType ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:2364:2: (otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( ruleEString ) ) ( (lv_type_5_0= ruleBinaryType ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalMyDsl.g:2365:3: otherlv_0= 'BinaryCondition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'left' ( ( ruleEString ) ) ( (lv_type_5_0= ruleBinaryType ) ) otherlv_6= 'right' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryConditionAccess().getBinaryConditionKeyword_0());
            		
            // InternalMyDsl.g:2369:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2370:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2370:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2371:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBinaryConditionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryConditionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getBinaryConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBinaryConditionAccess().getLeftKeyword_3());
            		
            // InternalMyDsl.g:2396:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2397:4: ( ruleEString )
            {
            // InternalMyDsl.g:2397:4: ( ruleEString )
            // InternalMyDsl.g:2398:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryConditionAccess().getLeftInputConditionCrossReference_4_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2412:3: ( (lv_type_5_0= ruleBinaryType ) )
            // InternalMyDsl.g:2413:4: (lv_type_5_0= ruleBinaryType )
            {
            // InternalMyDsl.g:2413:4: (lv_type_5_0= ruleBinaryType )
            // InternalMyDsl.g:2414:5: lv_type_5_0= ruleBinaryType
            {

            					newCompositeNode(grammarAccess.getBinaryConditionAccess().getTypeBinaryTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_45);
            lv_type_5_0=ruleBinaryType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryConditionRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.xtext.example.mydsl.MyDsl.BinaryType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getBinaryConditionAccess().getRightKeyword_6());
            		
            // InternalMyDsl.g:2435:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2436:4: ( ruleEString )
            {
            // InternalMyDsl.g:2436:4: ( ruleEString )
            // InternalMyDsl.g:2437:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryConditionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryConditionAccess().getRightInputConditionCrossReference_7_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBinaryConditionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleBinaryCondition"


    // $ANTLR start "entryRuleNegation"
    // InternalMyDsl.g:2459:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalMyDsl.g:2459:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalMyDsl.g:2460:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalMyDsl.g:2466:1: ruleNegation returns [EObject current=null] : (otherlv_0= 'Negation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' otherlv_5= 'condition' ( ( ruleEString ) ) otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2472:2: ( (otherlv_0= 'Negation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' otherlv_5= 'condition' ( ( ruleEString ) ) otherlv_7= '}' otherlv_8= '}' ) )
            // InternalMyDsl.g:2473:2: (otherlv_0= 'Negation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' otherlv_5= 'condition' ( ( ruleEString ) ) otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalMyDsl.g:2473:2: (otherlv_0= 'Negation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' otherlv_5= 'condition' ( ( ruleEString ) ) otherlv_7= '}' otherlv_8= '}' )
            // InternalMyDsl.g:2474:3: otherlv_0= 'Negation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contains' otherlv_4= '{' otherlv_5= 'condition' ( ( ruleEString ) ) otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNegationKeyword_0());
            		
            // InternalMyDsl.g:2478:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:2479:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:2479:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:2480:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNegationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getNegationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getNegationAccess().getContainsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getNegationAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getNegationAccess().getConditionKeyword_5());
            		
            // InternalMyDsl.g:2513:3: ( ( ruleEString ) )
            // InternalMyDsl.g:2514:4: ( ruleEString )
            {
            // InternalMyDsl.g:2514:4: ( ruleEString )
            // InternalMyDsl.g:2515:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNegationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNegationAccess().getContainsInputConditionCrossReference_6_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getNegationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getNegationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "ruleBinaryType"
    // InternalMyDsl.g:2541:1: ruleBinaryType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBinaryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2547:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalMyDsl.g:2548:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalMyDsl.g:2548:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            else if ( (LA40_0==52) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2549:3: (enumLiteral_0= 'and' )
                    {
                    // InternalMyDsl.g:2549:3: (enumLiteral_0= 'and' )
                    // InternalMyDsl.g:2550:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getBinaryTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBinaryTypeAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2557:3: (enumLiteral_1= 'or' )
                    {
                    // InternalMyDsl.g:2557:3: (enumLiteral_1= 'or' )
                    // InternalMyDsl.g:2558:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getBinaryTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBinaryTypeAccess().getOrEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBinaryType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003A00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003810000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000038447001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000038447000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000038446000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000008A000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000A010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004900000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});

}