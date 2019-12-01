package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'and'", "'or'", "'ManufacturingSystem'", "'{'", "'set'", "'start'", "'storage'", "'end'", "'create'", "'responsible'", "'lead'", "'}'", "','", "'workpiece'", "'type'", "'processes'", "'initiate'", "'ManufacturingSystemElement'", "'transition'", "'('", "')'", "'StoragePoint'", "'stores'", "'WorkPiece'", "'of'", "'ManufacturingStep'", "'speed'", "'='", "'input'", "'output'", "'TransportStep'", "'QualityAssuranceStep'", "'CompositeManufacturingStep'", "'contains'", "'-'", "'InputCondition'", "'condition'", "'requires'", "'BinaryCondition'", "'left'", "'right'", "'Negation'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleManufacturingSystem"
    // InternalMyDsl.g:53:1: entryRuleManufacturingSystem : ruleManufacturingSystem EOF ;
    public final void entryRuleManufacturingSystem() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleManufacturingSystem EOF )
            // InternalMyDsl.g:55:1: ruleManufacturingSystem EOF
            {
             before(grammarAccess.getManufacturingSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleManufacturingSystem();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManufacturingSystem"


    // $ANTLR start "ruleManufacturingSystem"
    // InternalMyDsl.g:62:1: ruleManufacturingSystem : ( ( rule__ManufacturingSystem__Group__0 ) ) ;
    public final void ruleManufacturingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ManufacturingSystem__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ManufacturingSystem__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ManufacturingSystem__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ManufacturingSystem__Group__0 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ManufacturingSystem__Group__0 )
            // InternalMyDsl.g:69:4: rule__ManufacturingSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManufacturingSystem"


    // $ANTLR start "entryRuleManufacturingSystemElement"
    // InternalMyDsl.g:78:1: entryRuleManufacturingSystemElement : ruleManufacturingSystemElement EOF ;
    public final void entryRuleManufacturingSystemElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleManufacturingSystemElement EOF )
            // InternalMyDsl.g:80:1: ruleManufacturingSystemElement EOF
            {
             before(grammarAccess.getManufacturingSystemElementRule()); 
            pushFollow(FOLLOW_1);
            ruleManufacturingSystemElement();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManufacturingSystemElement"


    // $ANTLR start "ruleManufacturingSystemElement"
    // InternalMyDsl.g:87:1: ruleManufacturingSystemElement : ( ( rule__ManufacturingSystemElement__Alternatives ) ) ;
    public final void ruleManufacturingSystemElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ManufacturingSystemElement__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ManufacturingSystemElement__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ManufacturingSystemElement__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__ManufacturingSystemElement__Alternatives )
            {
             before(grammarAccess.getManufacturingSystemElementAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__ManufacturingSystemElement__Alternatives )
            // InternalMyDsl.g:94:4: rule__ManufacturingSystemElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManufacturingSystemElement"


    // $ANTLR start "entryRuleInputCondition"
    // InternalMyDsl.g:103:1: entryRuleInputCondition : ruleInputCondition EOF ;
    public final void entryRuleInputCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleInputCondition EOF )
            // InternalMyDsl.g:105:1: ruleInputCondition EOF
            {
             before(grammarAccess.getInputConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getInputConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputCondition"


    // $ANTLR start "ruleInputCondition"
    // InternalMyDsl.g:112:1: ruleInputCondition : ( ( rule__InputCondition__Alternatives ) ) ;
    public final void ruleInputCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__InputCondition__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__InputCondition__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__InputCondition__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__InputCondition__Alternatives )
            {
             before(grammarAccess.getInputConditionAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__InputCondition__Alternatives )
            // InternalMyDsl.g:119:4: rule__InputCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InputCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputCondition"


    // $ANTLR start "entryRuleManufacturingSystemElement_Impl"
    // InternalMyDsl.g:128:1: entryRuleManufacturingSystemElement_Impl : ruleManufacturingSystemElement_Impl EOF ;
    public final void entryRuleManufacturingSystemElement_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleManufacturingSystemElement_Impl EOF )
            // InternalMyDsl.g:130:1: ruleManufacturingSystemElement_Impl EOF
            {
             before(grammarAccess.getManufacturingSystemElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleManufacturingSystemElement_Impl();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManufacturingSystemElement_Impl"


    // $ANTLR start "ruleManufacturingSystemElement_Impl"
    // InternalMyDsl.g:137:1: ruleManufacturingSystemElement_Impl : ( ( rule__ManufacturingSystemElement_Impl__Group__0 ) ) ;
    public final void ruleManufacturingSystemElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ManufacturingSystemElement_Impl__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ManufacturingSystemElement_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ManufacturingSystemElement_Impl__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__ManufacturingSystemElement_Impl__Group__0 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ManufacturingSystemElement_Impl__Group__0 )
            // InternalMyDsl.g:144:4: rule__ManufacturingSystemElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManufacturingSystemElement_Impl"


    // $ANTLR start "entryRuleStoragePoint"
    // InternalMyDsl.g:153:1: entryRuleStoragePoint : ruleStoragePoint EOF ;
    public final void entryRuleStoragePoint() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleStoragePoint EOF )
            // InternalMyDsl.g:155:1: ruleStoragePoint EOF
            {
             before(grammarAccess.getStoragePointRule()); 
            pushFollow(FOLLOW_1);
            ruleStoragePoint();

            state._fsp--;

             after(grammarAccess.getStoragePointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStoragePoint"


    // $ANTLR start "ruleStoragePoint"
    // InternalMyDsl.g:162:1: ruleStoragePoint : ( ( rule__StoragePoint__Group__0 ) ) ;
    public final void ruleStoragePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__StoragePoint__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__StoragePoint__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__StoragePoint__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__StoragePoint__Group__0 )
            {
             before(grammarAccess.getStoragePointAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__StoragePoint__Group__0 )
            // InternalMyDsl.g:169:4: rule__StoragePoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStoragePoint"


    // $ANTLR start "entryRuleWorkPieceType"
    // InternalMyDsl.g:178:1: entryRuleWorkPieceType : ruleWorkPieceType EOF ;
    public final void entryRuleWorkPieceType() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleWorkPieceType EOF )
            // InternalMyDsl.g:180:1: ruleWorkPieceType EOF
            {
             before(grammarAccess.getWorkPieceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkPieceType();

            state._fsp--;

             after(grammarAccess.getWorkPieceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkPieceType"


    // $ANTLR start "ruleWorkPieceType"
    // InternalMyDsl.g:187:1: ruleWorkPieceType : ( ( rule__WorkPieceType__Group__0 ) ) ;
    public final void ruleWorkPieceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__WorkPieceType__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__WorkPieceType__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__WorkPieceType__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__WorkPieceType__Group__0 )
            {
             before(grammarAccess.getWorkPieceTypeAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__WorkPieceType__Group__0 )
            // InternalMyDsl.g:194:4: rule__WorkPieceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkPieceType"


    // $ANTLR start "entryRuleWorkPiece"
    // InternalMyDsl.g:203:1: entryRuleWorkPiece : ruleWorkPiece EOF ;
    public final void entryRuleWorkPiece() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleWorkPiece EOF )
            // InternalMyDsl.g:205:1: ruleWorkPiece EOF
            {
             before(grammarAccess.getWorkPieceRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkPiece();

            state._fsp--;

             after(grammarAccess.getWorkPieceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkPiece"


    // $ANTLR start "ruleWorkPiece"
    // InternalMyDsl.g:212:1: ruleWorkPiece : ( ( rule__WorkPiece__Group__0 ) ) ;
    public final void ruleWorkPiece() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__WorkPiece__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__WorkPiece__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__WorkPiece__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__WorkPiece__Group__0 )
            {
             before(grammarAccess.getWorkPieceAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__WorkPiece__Group__0 )
            // InternalMyDsl.g:219:4: rule__WorkPiece__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkPiece"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleEString EOF )
            // InternalMyDsl.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:244:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleResponsible"
    // InternalMyDsl.g:253:1: entryRuleResponsible : ruleResponsible EOF ;
    public final void entryRuleResponsible() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleResponsible EOF )
            // InternalMyDsl.g:255:1: ruleResponsible EOF
            {
             before(grammarAccess.getResponsibleRule()); 
            pushFollow(FOLLOW_1);
            ruleResponsible();

            state._fsp--;

             after(grammarAccess.getResponsibleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResponsible"


    // $ANTLR start "ruleResponsible"
    // InternalMyDsl.g:262:1: ruleResponsible : ( ( rule__Responsible__Group__0 ) ) ;
    public final void ruleResponsible() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Responsible__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Responsible__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Responsible__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Responsible__Group__0 )
            {
             before(grammarAccess.getResponsibleAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Responsible__Group__0 )
            // InternalMyDsl.g:269:4: rule__Responsible__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Responsible__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponsibleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponsible"


    // $ANTLR start "entryRuleManufacturingStep"
    // InternalMyDsl.g:278:1: entryRuleManufacturingStep : ruleManufacturingStep EOF ;
    public final void entryRuleManufacturingStep() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleManufacturingStep EOF )
            // InternalMyDsl.g:280:1: ruleManufacturingStep EOF
            {
             before(grammarAccess.getManufacturingStepRule()); 
            pushFollow(FOLLOW_1);
            ruleManufacturingStep();

            state._fsp--;

             after(grammarAccess.getManufacturingStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManufacturingStep"


    // $ANTLR start "ruleManufacturingStep"
    // InternalMyDsl.g:287:1: ruleManufacturingStep : ( ( rule__ManufacturingStep__Group__0 ) ) ;
    public final void ruleManufacturingStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ManufacturingStep__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ManufacturingStep__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ManufacturingStep__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ManufacturingStep__Group__0 )
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ManufacturingStep__Group__0 )
            // InternalMyDsl.g:294:4: rule__ManufacturingStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManufacturingStep"


    // $ANTLR start "entryRuleTransportStep"
    // InternalMyDsl.g:303:1: entryRuleTransportStep : ruleTransportStep EOF ;
    public final void entryRuleTransportStep() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleTransportStep EOF )
            // InternalMyDsl.g:305:1: ruleTransportStep EOF
            {
             before(grammarAccess.getTransportStepRule()); 
            pushFollow(FOLLOW_1);
            ruleTransportStep();

            state._fsp--;

             after(grammarAccess.getTransportStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransportStep"


    // $ANTLR start "ruleTransportStep"
    // InternalMyDsl.g:312:1: ruleTransportStep : ( ( rule__TransportStep__Group__0 ) ) ;
    public final void ruleTransportStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__TransportStep__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__TransportStep__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__TransportStep__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__TransportStep__Group__0 )
            {
             before(grammarAccess.getTransportStepAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__TransportStep__Group__0 )
            // InternalMyDsl.g:319:4: rule__TransportStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransportStep"


    // $ANTLR start "entryRuleQualityAssuranceStep"
    // InternalMyDsl.g:328:1: entryRuleQualityAssuranceStep : ruleQualityAssuranceStep EOF ;
    public final void entryRuleQualityAssuranceStep() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleQualityAssuranceStep EOF )
            // InternalMyDsl.g:330:1: ruleQualityAssuranceStep EOF
            {
             before(grammarAccess.getQualityAssuranceStepRule()); 
            pushFollow(FOLLOW_1);
            ruleQualityAssuranceStep();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualityAssuranceStep"


    // $ANTLR start "ruleQualityAssuranceStep"
    // InternalMyDsl.g:337:1: ruleQualityAssuranceStep : ( ( rule__QualityAssuranceStep__Group__0 ) ) ;
    public final void ruleQualityAssuranceStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__QualityAssuranceStep__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__QualityAssuranceStep__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__QualityAssuranceStep__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__QualityAssuranceStep__Group__0 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__QualityAssuranceStep__Group__0 )
            // InternalMyDsl.g:344:4: rule__QualityAssuranceStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualityAssuranceStep"


    // $ANTLR start "entryRuleCompositeManufacturingStep"
    // InternalMyDsl.g:353:1: entryRuleCompositeManufacturingStep : ruleCompositeManufacturingStep EOF ;
    public final void entryRuleCompositeManufacturingStep() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleCompositeManufacturingStep EOF )
            // InternalMyDsl.g:355:1: ruleCompositeManufacturingStep EOF
            {
             before(grammarAccess.getCompositeManufacturingStepRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeManufacturingStep();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeManufacturingStep"


    // $ANTLR start "ruleCompositeManufacturingStep"
    // InternalMyDsl.g:362:1: ruleCompositeManufacturingStep : ( ( rule__CompositeManufacturingStep__Group__0 ) ) ;
    public final void ruleCompositeManufacturingStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__CompositeManufacturingStep__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__CompositeManufacturingStep__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__CompositeManufacturingStep__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__CompositeManufacturingStep__Group__0 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__CompositeManufacturingStep__Group__0 )
            // InternalMyDsl.g:369:4: rule__CompositeManufacturingStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeManufacturingStep"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleEInt EOF )
            // InternalMyDsl.g:380:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:394:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleInputCondition_Impl"
    // InternalMyDsl.g:403:1: entryRuleInputCondition_Impl : ruleInputCondition_Impl EOF ;
    public final void entryRuleInputCondition_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleInputCondition_Impl EOF )
            // InternalMyDsl.g:405:1: ruleInputCondition_Impl EOF
            {
             before(grammarAccess.getInputCondition_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleInputCondition_Impl();

            state._fsp--;

             after(grammarAccess.getInputCondition_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputCondition_Impl"


    // $ANTLR start "ruleInputCondition_Impl"
    // InternalMyDsl.g:412:1: ruleInputCondition_Impl : ( ( rule__InputCondition_Impl__Group__0 ) ) ;
    public final void ruleInputCondition_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__InputCondition_Impl__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__InputCondition_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__InputCondition_Impl__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__InputCondition_Impl__Group__0 )
            {
             before(grammarAccess.getInputCondition_ImplAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__InputCondition_Impl__Group__0 )
            // InternalMyDsl.g:419:4: rule__InputCondition_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputCondition_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputCondition_Impl"


    // $ANTLR start "entryRuleOutputDecision"
    // InternalMyDsl.g:428:1: entryRuleOutputDecision : ruleOutputDecision EOF ;
    public final void entryRuleOutputDecision() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleOutputDecision EOF )
            // InternalMyDsl.g:430:1: ruleOutputDecision EOF
            {
             before(grammarAccess.getOutputDecisionRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getOutputDecisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutputDecision"


    // $ANTLR start "ruleOutputDecision"
    // InternalMyDsl.g:437:1: ruleOutputDecision : ( ( rule__OutputDecision__Group__0 ) ) ;
    public final void ruleOutputDecision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__OutputDecision__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__OutputDecision__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__OutputDecision__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__OutputDecision__Group__0 )
            {
             before(grammarAccess.getOutputDecisionAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__OutputDecision__Group__0 )
            // InternalMyDsl.g:444:4: rule__OutputDecision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputDecisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputDecision"


    // $ANTLR start "entryRuleWorkPieceCondition"
    // InternalMyDsl.g:453:1: entryRuleWorkPieceCondition : ruleWorkPieceCondition EOF ;
    public final void entryRuleWorkPieceCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleWorkPieceCondition EOF )
            // InternalMyDsl.g:455:1: ruleWorkPieceCondition EOF
            {
             before(grammarAccess.getWorkPieceConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkPieceCondition();

            state._fsp--;

             after(grammarAccess.getWorkPieceConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorkPieceCondition"


    // $ANTLR start "ruleWorkPieceCondition"
    // InternalMyDsl.g:462:1: ruleWorkPieceCondition : ( ( rule__WorkPieceCondition__Group__0 ) ) ;
    public final void ruleWorkPieceCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__WorkPieceCondition__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__WorkPieceCondition__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__WorkPieceCondition__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__WorkPieceCondition__Group__0 )
            {
             before(grammarAccess.getWorkPieceConditionAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__WorkPieceCondition__Group__0 )
            // InternalMyDsl.g:469:4: rule__WorkPieceCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkPieceCondition"


    // $ANTLR start "entryRuleBinaryCondition"
    // InternalMyDsl.g:478:1: entryRuleBinaryCondition : ruleBinaryCondition EOF ;
    public final void entryRuleBinaryCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleBinaryCondition EOF )
            // InternalMyDsl.g:480:1: ruleBinaryCondition EOF
            {
             before(grammarAccess.getBinaryConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryCondition();

            state._fsp--;

             after(grammarAccess.getBinaryConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinaryCondition"


    // $ANTLR start "ruleBinaryCondition"
    // InternalMyDsl.g:487:1: ruleBinaryCondition : ( ( rule__BinaryCondition__Group__0 ) ) ;
    public final void ruleBinaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__BinaryCondition__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__BinaryCondition__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__BinaryCondition__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__BinaryCondition__Group__0 )
            {
             before(grammarAccess.getBinaryConditionAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__BinaryCondition__Group__0 )
            // InternalMyDsl.g:494:4: rule__BinaryCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryCondition"


    // $ANTLR start "entryRuleNegation"
    // InternalMyDsl.g:503:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleNegation EOF )
            // InternalMyDsl.g:505:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_1);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalMyDsl.g:512:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Negation__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Negation__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Negation__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Negation__Group__0 )
            // InternalMyDsl.g:519:4: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "ruleBinaryType"
    // InternalMyDsl.g:528:1: ruleBinaryType : ( ( rule__BinaryType__Alternatives ) ) ;
    public final void ruleBinaryType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( ( ( rule__BinaryType__Alternatives ) ) )
            // InternalMyDsl.g:533:2: ( ( rule__BinaryType__Alternatives ) )
            {
            // InternalMyDsl.g:533:2: ( ( rule__BinaryType__Alternatives ) )
            // InternalMyDsl.g:534:3: ( rule__BinaryType__Alternatives )
            {
             before(grammarAccess.getBinaryTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:535:3: ( rule__BinaryType__Alternatives )
            // InternalMyDsl.g:535:4: rule__BinaryType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryType"


    // $ANTLR start "rule__ManufacturingSystem__Alternatives_23_1"
    // InternalMyDsl.g:543:1: rule__ManufacturingSystem__Alternatives_23_1 : ( ( ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0 )* ) | ( ( rule__ManufacturingSystem__Group_23_1_1__0 ) ) );
    public final void rule__ManufacturingSystem__Alternatives_23_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:547:1: ( ( ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0 )* ) | ( ( rule__ManufacturingSystem__Group_23_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22||(LA2_0>=27 && LA2_0<=28)||LA2_0==32||LA2_0==36||(LA2_0>=41 && LA2_0<=43)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:548:2: ( ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0 )* )
                    {
                    // InternalMyDsl.g:548:2: ( ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0 )* )
                    // InternalMyDsl.g:549:3: ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0 )*
                    {
                     before(grammarAccess.getManufacturingSystemAccess().getConsistsOfAssignment_23_1_0()); 
                    // InternalMyDsl.g:550:3: ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==28||LA1_0==32||LA1_0==36||(LA1_0>=41 && LA1_0<=43)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:550:4: rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getManufacturingSystemAccess().getConsistsOfAssignment_23_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:554:2: ( ( rule__ManufacturingSystem__Group_23_1_1__0 ) )
                    {
                    // InternalMyDsl.g:554:2: ( ( rule__ManufacturingSystem__Group_23_1_1__0 ) )
                    // InternalMyDsl.g:555:3: ( rule__ManufacturingSystem__Group_23_1_1__0 )
                    {
                     before(grammarAccess.getManufacturingSystemAccess().getGroup_23_1_1()); 
                    // InternalMyDsl.g:556:3: ( rule__ManufacturingSystem__Group_23_1_1__0 )
                    // InternalMyDsl.g:556:4: rule__ManufacturingSystem__Group_23_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystem__Group_23_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getManufacturingSystemAccess().getGroup_23_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Alternatives_23_1"


    // $ANTLR start "rule__ManufacturingSystemElement__Alternatives"
    // InternalMyDsl.g:564:1: rule__ManufacturingSystemElement__Alternatives : ( ( ruleManufacturingSystemElement_Impl ) | ( ruleManufacturingStep ) | ( ruleTransportStep ) | ( ruleQualityAssuranceStep ) | ( ruleStoragePoint ) | ( ruleCompositeManufacturingStep ) );
    public final void rule__ManufacturingSystemElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( ( ruleManufacturingSystemElement_Impl ) | ( ruleManufacturingStep ) | ( ruleTransportStep ) | ( ruleQualityAssuranceStep ) | ( ruleStoragePoint ) | ( ruleCompositeManufacturingStep ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 36:
                {
                alt3=2;
                }
                break;
            case 41:
                {
                alt3=3;
                }
                break;
            case 42:
                {
                alt3=4;
                }
                break;
            case 32:
                {
                alt3=5;
                }
                break;
            case 43:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:569:2: ( ruleManufacturingSystemElement_Impl )
                    {
                    // InternalMyDsl.g:569:2: ( ruleManufacturingSystemElement_Impl )
                    // InternalMyDsl.g:570:3: ruleManufacturingSystemElement_Impl
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getManufacturingSystemElement_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleManufacturingSystemElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getManufacturingSystemElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:575:2: ( ruleManufacturingStep )
                    {
                    // InternalMyDsl.g:575:2: ( ruleManufacturingStep )
                    // InternalMyDsl.g:576:3: ruleManufacturingStep
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getManufacturingStepParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleManufacturingStep();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getManufacturingStepParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:581:2: ( ruleTransportStep )
                    {
                    // InternalMyDsl.g:581:2: ( ruleTransportStep )
                    // InternalMyDsl.g:582:3: ruleTransportStep
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getTransportStepParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTransportStep();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getTransportStepParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:587:2: ( ruleQualityAssuranceStep )
                    {
                    // InternalMyDsl.g:587:2: ( ruleQualityAssuranceStep )
                    // InternalMyDsl.g:588:3: ruleQualityAssuranceStep
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getQualityAssuranceStepParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleQualityAssuranceStep();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getQualityAssuranceStepParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:593:2: ( ruleStoragePoint )
                    {
                    // InternalMyDsl.g:593:2: ( ruleStoragePoint )
                    // InternalMyDsl.g:594:3: ruleStoragePoint
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getStoragePointParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStoragePoint();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getStoragePointParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:599:2: ( ruleCompositeManufacturingStep )
                    {
                    // InternalMyDsl.g:599:2: ( ruleCompositeManufacturingStep )
                    // InternalMyDsl.g:600:3: ruleCompositeManufacturingStep
                    {
                     before(grammarAccess.getManufacturingSystemElementAccess().getCompositeManufacturingStepParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeManufacturingStep();

                    state._fsp--;

                     after(grammarAccess.getManufacturingSystemElementAccess().getCompositeManufacturingStepParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement__Alternatives"


    // $ANTLR start "rule__InputCondition__Alternatives"
    // InternalMyDsl.g:609:1: rule__InputCondition__Alternatives : ( ( ruleInputCondition_Impl ) | ( ruleWorkPieceCondition ) | ( ruleBinaryCondition ) | ( ruleNegation ) );
    public final void rule__InputCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:613:1: ( ( ruleInputCondition_Impl ) | ( ruleWorkPieceCondition ) | ( ruleBinaryCondition ) | ( ruleNegation ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 49:
                {
                alt4=3;
                }
                break;
            case 52:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:614:2: ( ruleInputCondition_Impl )
                    {
                    // InternalMyDsl.g:614:2: ( ruleInputCondition_Impl )
                    // InternalMyDsl.g:615:3: ruleInputCondition_Impl
                    {
                     before(grammarAccess.getInputConditionAccess().getInputCondition_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInputCondition_Impl();

                    state._fsp--;

                     after(grammarAccess.getInputConditionAccess().getInputCondition_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:620:2: ( ruleWorkPieceCondition )
                    {
                    // InternalMyDsl.g:620:2: ( ruleWorkPieceCondition )
                    // InternalMyDsl.g:621:3: ruleWorkPieceCondition
                    {
                     before(grammarAccess.getInputConditionAccess().getWorkPieceConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkPieceCondition();

                    state._fsp--;

                     after(grammarAccess.getInputConditionAccess().getWorkPieceConditionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:626:2: ( ruleBinaryCondition )
                    {
                    // InternalMyDsl.g:626:2: ( ruleBinaryCondition )
                    // InternalMyDsl.g:627:3: ruleBinaryCondition
                    {
                     before(grammarAccess.getInputConditionAccess().getBinaryConditionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryCondition();

                    state._fsp--;

                     after(grammarAccess.getInputConditionAccess().getBinaryConditionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:632:2: ( ruleNegation )
                    {
                    // InternalMyDsl.g:632:2: ( ruleNegation )
                    // InternalMyDsl.g:633:3: ruleNegation
                    {
                     before(grammarAccess.getInputConditionAccess().getNegationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNegation();

                    state._fsp--;

                     after(grammarAccess.getInputConditionAccess().getNegationParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:642:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:647:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:647:2: ( RULE_STRING )
                    // InternalMyDsl.g:648:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:653:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:653:2: ( RULE_ID )
                    // InternalMyDsl.g:654:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__BinaryType__Alternatives"
    // InternalMyDsl.g:663:1: rule__BinaryType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__BinaryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:668:2: ( ( 'and' ) )
                    {
                    // InternalMyDsl.g:668:2: ( ( 'and' ) )
                    // InternalMyDsl.g:669:3: ( 'and' )
                    {
                     before(grammarAccess.getBinaryTypeAccess().getAndEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:670:3: ( 'and' )
                    // InternalMyDsl.g:670:4: 'and'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryTypeAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:674:2: ( ( 'or' ) )
                    {
                    // InternalMyDsl.g:674:2: ( ( 'or' ) )
                    // InternalMyDsl.g:675:3: ( 'or' )
                    {
                     before(grammarAccess.getBinaryTypeAccess().getOrEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:676:3: ( 'or' )
                    // InternalMyDsl.g:676:4: 'or'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBinaryTypeAccess().getOrEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryType__Alternatives"


    // $ANTLR start "rule__ManufacturingSystem__Group__0"
    // InternalMyDsl.g:684:1: rule__ManufacturingSystem__Group__0 : rule__ManufacturingSystem__Group__0__Impl rule__ManufacturingSystem__Group__1 ;
    public final void rule__ManufacturingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( rule__ManufacturingSystem__Group__0__Impl rule__ManufacturingSystem__Group__1 )
            // InternalMyDsl.g:689:2: rule__ManufacturingSystem__Group__0__Impl rule__ManufacturingSystem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__0"


    // $ANTLR start "rule__ManufacturingSystem__Group__0__Impl"
    // InternalMyDsl.g:696:1: rule__ManufacturingSystem__Group__0__Impl : ( 'ManufacturingSystem' ) ;
    public final void rule__ManufacturingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( ( 'ManufacturingSystem' ) )
            // InternalMyDsl.g:701:1: ( 'ManufacturingSystem' )
            {
            // InternalMyDsl.g:701:1: ( 'ManufacturingSystem' )
            // InternalMyDsl.g:702:2: 'ManufacturingSystem'
            {
             before(grammarAccess.getManufacturingSystemAccess().getManufacturingSystemKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getManufacturingSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__1"
    // InternalMyDsl.g:711:1: rule__ManufacturingSystem__Group__1 : rule__ManufacturingSystem__Group__1__Impl rule__ManufacturingSystem__Group__2 ;
    public final void rule__ManufacturingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( rule__ManufacturingSystem__Group__1__Impl rule__ManufacturingSystem__Group__2 )
            // InternalMyDsl.g:716:2: rule__ManufacturingSystem__Group__1__Impl rule__ManufacturingSystem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ManufacturingSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__1"


    // $ANTLR start "rule__ManufacturingSystem__Group__1__Impl"
    // InternalMyDsl.g:723:1: rule__ManufacturingSystem__Group__1__Impl : ( ( rule__ManufacturingSystem__NameAssignment_1 ) ) ;
    public final void rule__ManufacturingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ( rule__ManufacturingSystem__NameAssignment_1 ) ) )
            // InternalMyDsl.g:728:1: ( ( rule__ManufacturingSystem__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:728:1: ( ( rule__ManufacturingSystem__NameAssignment_1 ) )
            // InternalMyDsl.g:729:2: ( rule__ManufacturingSystem__NameAssignment_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:730:2: ( rule__ManufacturingSystem__NameAssignment_1 )
            // InternalMyDsl.g:730:3: rule__ManufacturingSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__2"
    // InternalMyDsl.g:738:1: rule__ManufacturingSystem__Group__2 : rule__ManufacturingSystem__Group__2__Impl rule__ManufacturingSystem__Group__3 ;
    public final void rule__ManufacturingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( rule__ManufacturingSystem__Group__2__Impl rule__ManufacturingSystem__Group__3 )
            // InternalMyDsl.g:743:2: rule__ManufacturingSystem__Group__2__Impl rule__ManufacturingSystem__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ManufacturingSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__2"


    // $ANTLR start "rule__ManufacturingSystem__Group__2__Impl"
    // InternalMyDsl.g:750:1: rule__ManufacturingSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__ManufacturingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( ( '{' ) )
            // InternalMyDsl.g:755:1: ( '{' )
            {
            // InternalMyDsl.g:755:1: ( '{' )
            // InternalMyDsl.g:756:2: '{'
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__2__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__3"
    // InternalMyDsl.g:765:1: rule__ManufacturingSystem__Group__3 : rule__ManufacturingSystem__Group__3__Impl rule__ManufacturingSystem__Group__4 ;
    public final void rule__ManufacturingSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( rule__ManufacturingSystem__Group__3__Impl rule__ManufacturingSystem__Group__4 )
            // InternalMyDsl.g:770:2: rule__ManufacturingSystem__Group__3__Impl rule__ManufacturingSystem__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ManufacturingSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__3"


    // $ANTLR start "rule__ManufacturingSystem__Group__3__Impl"
    // InternalMyDsl.g:777:1: rule__ManufacturingSystem__Group__3__Impl : ( 'set' ) ;
    public final void rule__ManufacturingSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( ( 'set' ) )
            // InternalMyDsl.g:782:1: ( 'set' )
            {
            // InternalMyDsl.g:782:1: ( 'set' )
            // InternalMyDsl.g:783:2: 'set'
            {
             before(grammarAccess.getManufacturingSystemAccess().getSetKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getSetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__3__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__4"
    // InternalMyDsl.g:792:1: rule__ManufacturingSystem__Group__4 : rule__ManufacturingSystem__Group__4__Impl rule__ManufacturingSystem__Group__5 ;
    public final void rule__ManufacturingSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( rule__ManufacturingSystem__Group__4__Impl rule__ManufacturingSystem__Group__5 )
            // InternalMyDsl.g:797:2: rule__ManufacturingSystem__Group__4__Impl rule__ManufacturingSystem__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ManufacturingSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__4"


    // $ANTLR start "rule__ManufacturingSystem__Group__4__Impl"
    // InternalMyDsl.g:804:1: rule__ManufacturingSystem__Group__4__Impl : ( 'start' ) ;
    public final void rule__ManufacturingSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( ( 'start' ) )
            // InternalMyDsl.g:809:1: ( 'start' )
            {
            // InternalMyDsl.g:809:1: ( 'start' )
            // InternalMyDsl.g:810:2: 'start'
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getStartKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__4__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__5"
    // InternalMyDsl.g:819:1: rule__ManufacturingSystem__Group__5 : rule__ManufacturingSystem__Group__5__Impl rule__ManufacturingSystem__Group__6 ;
    public final void rule__ManufacturingSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( rule__ManufacturingSystem__Group__5__Impl rule__ManufacturingSystem__Group__6 )
            // InternalMyDsl.g:824:2: rule__ManufacturingSystem__Group__5__Impl rule__ManufacturingSystem__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__5"


    // $ANTLR start "rule__ManufacturingSystem__Group__5__Impl"
    // InternalMyDsl.g:831:1: rule__ManufacturingSystem__Group__5__Impl : ( 'storage' ) ;
    public final void rule__ManufacturingSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:835:1: ( ( 'storage' ) )
            // InternalMyDsl.g:836:1: ( 'storage' )
            {
            // InternalMyDsl.g:836:1: ( 'storage' )
            // InternalMyDsl.g:837:2: 'storage'
            {
             before(grammarAccess.getManufacturingSystemAccess().getStorageKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getStorageKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__5__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__6"
    // InternalMyDsl.g:846:1: rule__ManufacturingSystem__Group__6 : rule__ManufacturingSystem__Group__6__Impl rule__ManufacturingSystem__Group__7 ;
    public final void rule__ManufacturingSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( rule__ManufacturingSystem__Group__6__Impl rule__ManufacturingSystem__Group__7 )
            // InternalMyDsl.g:851:2: rule__ManufacturingSystem__Group__6__Impl rule__ManufacturingSystem__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ManufacturingSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__6"


    // $ANTLR start "rule__ManufacturingSystem__Group__6__Impl"
    // InternalMyDsl.g:858:1: rule__ManufacturingSystem__Group__6__Impl : ( ( rule__ManufacturingSystem__StartAssignment_6 ) ) ;
    public final void rule__ManufacturingSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( ( ( rule__ManufacturingSystem__StartAssignment_6 ) ) )
            // InternalMyDsl.g:863:1: ( ( rule__ManufacturingSystem__StartAssignment_6 ) )
            {
            // InternalMyDsl.g:863:1: ( ( rule__ManufacturingSystem__StartAssignment_6 ) )
            // InternalMyDsl.g:864:2: ( rule__ManufacturingSystem__StartAssignment_6 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartAssignment_6()); 
            // InternalMyDsl.g:865:2: ( rule__ManufacturingSystem__StartAssignment_6 )
            // InternalMyDsl.g:865:3: rule__ManufacturingSystem__StartAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__StartAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getStartAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__6__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__7"
    // InternalMyDsl.g:873:1: rule__ManufacturingSystem__Group__7 : rule__ManufacturingSystem__Group__7__Impl rule__ManufacturingSystem__Group__8 ;
    public final void rule__ManufacturingSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( rule__ManufacturingSystem__Group__7__Impl rule__ManufacturingSystem__Group__8 )
            // InternalMyDsl.g:878:2: rule__ManufacturingSystem__Group__7__Impl rule__ManufacturingSystem__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__ManufacturingSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__7"


    // $ANTLR start "rule__ManufacturingSystem__Group__7__Impl"
    // InternalMyDsl.g:885:1: rule__ManufacturingSystem__Group__7__Impl : ( ( rule__ManufacturingSystem__Group_7__0 )* ) ;
    public final void rule__ManufacturingSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:889:1: ( ( ( rule__ManufacturingSystem__Group_7__0 )* ) )
            // InternalMyDsl.g:890:1: ( ( rule__ManufacturingSystem__Group_7__0 )* )
            {
            // InternalMyDsl.g:890:1: ( ( rule__ManufacturingSystem__Group_7__0 )* )
            // InternalMyDsl.g:891:2: ( rule__ManufacturingSystem__Group_7__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_7()); 
            // InternalMyDsl.g:892:2: ( rule__ManufacturingSystem__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:892:3: rule__ManufacturingSystem__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ManufacturingSystem__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__7__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__8"
    // InternalMyDsl.g:900:1: rule__ManufacturingSystem__Group__8 : rule__ManufacturingSystem__Group__8__Impl rule__ManufacturingSystem__Group__9 ;
    public final void rule__ManufacturingSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( rule__ManufacturingSystem__Group__8__Impl rule__ManufacturingSystem__Group__9 )
            // InternalMyDsl.g:905:2: rule__ManufacturingSystem__Group__8__Impl rule__ManufacturingSystem__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__ManufacturingSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__8"


    // $ANTLR start "rule__ManufacturingSystem__Group__8__Impl"
    // InternalMyDsl.g:912:1: rule__ManufacturingSystem__Group__8__Impl : ( 'set' ) ;
    public final void rule__ManufacturingSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( ( 'set' ) )
            // InternalMyDsl.g:917:1: ( 'set' )
            {
            // InternalMyDsl.g:917:1: ( 'set' )
            // InternalMyDsl.g:918:2: 'set'
            {
             before(grammarAccess.getManufacturingSystemAccess().getSetKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getSetKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__8__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__9"
    // InternalMyDsl.g:927:1: rule__ManufacturingSystem__Group__9 : rule__ManufacturingSystem__Group__9__Impl rule__ManufacturingSystem__Group__10 ;
    public final void rule__ManufacturingSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( rule__ManufacturingSystem__Group__9__Impl rule__ManufacturingSystem__Group__10 )
            // InternalMyDsl.g:932:2: rule__ManufacturingSystem__Group__9__Impl rule__ManufacturingSystem__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__ManufacturingSystem__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__9"


    // $ANTLR start "rule__ManufacturingSystem__Group__9__Impl"
    // InternalMyDsl.g:939:1: rule__ManufacturingSystem__Group__9__Impl : ( 'end' ) ;
    public final void rule__ManufacturingSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( ( 'end' ) )
            // InternalMyDsl.g:944:1: ( 'end' )
            {
            // InternalMyDsl.g:944:1: ( 'end' )
            // InternalMyDsl.g:945:2: 'end'
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndKeyword_9()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getEndKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__9__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__10"
    // InternalMyDsl.g:954:1: rule__ManufacturingSystem__Group__10 : rule__ManufacturingSystem__Group__10__Impl rule__ManufacturingSystem__Group__11 ;
    public final void rule__ManufacturingSystem__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( rule__ManufacturingSystem__Group__10__Impl rule__ManufacturingSystem__Group__11 )
            // InternalMyDsl.g:959:2: rule__ManufacturingSystem__Group__10__Impl rule__ManufacturingSystem__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__10"


    // $ANTLR start "rule__ManufacturingSystem__Group__10__Impl"
    // InternalMyDsl.g:966:1: rule__ManufacturingSystem__Group__10__Impl : ( 'storage' ) ;
    public final void rule__ManufacturingSystem__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( ( 'storage' ) )
            // InternalMyDsl.g:971:1: ( 'storage' )
            {
            // InternalMyDsl.g:971:1: ( 'storage' )
            // InternalMyDsl.g:972:2: 'storage'
            {
             before(grammarAccess.getManufacturingSystemAccess().getStorageKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getStorageKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__10__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__11"
    // InternalMyDsl.g:981:1: rule__ManufacturingSystem__Group__11 : rule__ManufacturingSystem__Group__11__Impl rule__ManufacturingSystem__Group__12 ;
    public final void rule__ManufacturingSystem__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( rule__ManufacturingSystem__Group__11__Impl rule__ManufacturingSystem__Group__12 )
            // InternalMyDsl.g:986:2: rule__ManufacturingSystem__Group__11__Impl rule__ManufacturingSystem__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__11"


    // $ANTLR start "rule__ManufacturingSystem__Group__11__Impl"
    // InternalMyDsl.g:993:1: rule__ManufacturingSystem__Group__11__Impl : ( ( rule__ManufacturingSystem__EndAssignment_11 ) ) ;
    public final void rule__ManufacturingSystem__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( ( ( rule__ManufacturingSystem__EndAssignment_11 ) ) )
            // InternalMyDsl.g:998:1: ( ( rule__ManufacturingSystem__EndAssignment_11 ) )
            {
            // InternalMyDsl.g:998:1: ( ( rule__ManufacturingSystem__EndAssignment_11 ) )
            // InternalMyDsl.g:999:2: ( rule__ManufacturingSystem__EndAssignment_11 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndAssignment_11()); 
            // InternalMyDsl.g:1000:2: ( rule__ManufacturingSystem__EndAssignment_11 )
            // InternalMyDsl.g:1000:3: rule__ManufacturingSystem__EndAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__EndAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getEndAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__11__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__12"
    // InternalMyDsl.g:1008:1: rule__ManufacturingSystem__Group__12 : rule__ManufacturingSystem__Group__12__Impl rule__ManufacturingSystem__Group__13 ;
    public final void rule__ManufacturingSystem__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( rule__ManufacturingSystem__Group__12__Impl rule__ManufacturingSystem__Group__13 )
            // InternalMyDsl.g:1013:2: rule__ManufacturingSystem__Group__12__Impl rule__ManufacturingSystem__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__ManufacturingSystem__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__12"


    // $ANTLR start "rule__ManufacturingSystem__Group__12__Impl"
    // InternalMyDsl.g:1020:1: rule__ManufacturingSystem__Group__12__Impl : ( ( rule__ManufacturingSystem__Group_12__0 )* ) ;
    public final void rule__ManufacturingSystem__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( ( ( rule__ManufacturingSystem__Group_12__0 )* ) )
            // InternalMyDsl.g:1025:1: ( ( rule__ManufacturingSystem__Group_12__0 )* )
            {
            // InternalMyDsl.g:1025:1: ( ( rule__ManufacturingSystem__Group_12__0 )* )
            // InternalMyDsl.g:1026:2: ( rule__ManufacturingSystem__Group_12__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_12()); 
            // InternalMyDsl.g:1027:2: ( rule__ManufacturingSystem__Group_12__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1027:3: rule__ManufacturingSystem__Group_12__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ManufacturingSystem__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__12__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__13"
    // InternalMyDsl.g:1035:1: rule__ManufacturingSystem__Group__13 : rule__ManufacturingSystem__Group__13__Impl rule__ManufacturingSystem__Group__14 ;
    public final void rule__ManufacturingSystem__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( rule__ManufacturingSystem__Group__13__Impl rule__ManufacturingSystem__Group__14 )
            // InternalMyDsl.g:1040:2: rule__ManufacturingSystem__Group__13__Impl rule__ManufacturingSystem__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__ManufacturingSystem__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__13"


    // $ANTLR start "rule__ManufacturingSystem__Group__13__Impl"
    // InternalMyDsl.g:1047:1: rule__ManufacturingSystem__Group__13__Impl : ( 'create' ) ;
    public final void rule__ManufacturingSystem__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( ( 'create' ) )
            // InternalMyDsl.g:1052:1: ( 'create' )
            {
            // InternalMyDsl.g:1052:1: ( 'create' )
            // InternalMyDsl.g:1053:2: 'create'
            {
             before(grammarAccess.getManufacturingSystemAccess().getCreateKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCreateKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__13__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__14"
    // InternalMyDsl.g:1062:1: rule__ManufacturingSystem__Group__14 : rule__ManufacturingSystem__Group__14__Impl rule__ManufacturingSystem__Group__15 ;
    public final void rule__ManufacturingSystem__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( rule__ManufacturingSystem__Group__14__Impl rule__ManufacturingSystem__Group__15 )
            // InternalMyDsl.g:1067:2: rule__ManufacturingSystem__Group__14__Impl rule__ManufacturingSystem__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__14"


    // $ANTLR start "rule__ManufacturingSystem__Group__14__Impl"
    // InternalMyDsl.g:1074:1: rule__ManufacturingSystem__Group__14__Impl : ( 'responsible' ) ;
    public final void rule__ManufacturingSystem__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( ( 'responsible' ) )
            // InternalMyDsl.g:1079:1: ( 'responsible' )
            {
            // InternalMyDsl.g:1079:1: ( 'responsible' )
            // InternalMyDsl.g:1080:2: 'responsible'
            {
             before(grammarAccess.getManufacturingSystemAccess().getResponsibleKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getResponsibleKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__14__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__15"
    // InternalMyDsl.g:1089:1: rule__ManufacturingSystem__Group__15 : rule__ManufacturingSystem__Group__15__Impl rule__ManufacturingSystem__Group__16 ;
    public final void rule__ManufacturingSystem__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( rule__ManufacturingSystem__Group__15__Impl rule__ManufacturingSystem__Group__16 )
            // InternalMyDsl.g:1094:2: rule__ManufacturingSystem__Group__15__Impl rule__ManufacturingSystem__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__ManufacturingSystem__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__15"


    // $ANTLR start "rule__ManufacturingSystem__Group__15__Impl"
    // InternalMyDsl.g:1101:1: rule__ManufacturingSystem__Group__15__Impl : ( ( rule__ManufacturingSystem__StaffAssignment_15 ) ) ;
    public final void rule__ManufacturingSystem__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( ( ( rule__ManufacturingSystem__StaffAssignment_15 ) ) )
            // InternalMyDsl.g:1106:1: ( ( rule__ManufacturingSystem__StaffAssignment_15 ) )
            {
            // InternalMyDsl.g:1106:1: ( ( rule__ManufacturingSystem__StaffAssignment_15 ) )
            // InternalMyDsl.g:1107:2: ( rule__ManufacturingSystem__StaffAssignment_15 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStaffAssignment_15()); 
            // InternalMyDsl.g:1108:2: ( rule__ManufacturingSystem__StaffAssignment_15 )
            // InternalMyDsl.g:1108:3: rule__ManufacturingSystem__StaffAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__StaffAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getStaffAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__15__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__16"
    // InternalMyDsl.g:1116:1: rule__ManufacturingSystem__Group__16 : rule__ManufacturingSystem__Group__16__Impl rule__ManufacturingSystem__Group__17 ;
    public final void rule__ManufacturingSystem__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( rule__ManufacturingSystem__Group__16__Impl rule__ManufacturingSystem__Group__17 )
            // InternalMyDsl.g:1121:2: rule__ManufacturingSystem__Group__16__Impl rule__ManufacturingSystem__Group__17
            {
            pushFollow(FOLLOW_9);
            rule__ManufacturingSystem__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__16"


    // $ANTLR start "rule__ManufacturingSystem__Group__16__Impl"
    // InternalMyDsl.g:1128:1: rule__ManufacturingSystem__Group__16__Impl : ( ( rule__ManufacturingSystem__Group_16__0 )* ) ;
    public final void rule__ManufacturingSystem__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( ( rule__ManufacturingSystem__Group_16__0 )* ) )
            // InternalMyDsl.g:1133:1: ( ( rule__ManufacturingSystem__Group_16__0 )* )
            {
            // InternalMyDsl.g:1133:1: ( ( rule__ManufacturingSystem__Group_16__0 )* )
            // InternalMyDsl.g:1134:2: ( rule__ManufacturingSystem__Group_16__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_16()); 
            // InternalMyDsl.g:1135:2: ( rule__ManufacturingSystem__Group_16__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1135:3: rule__ManufacturingSystem__Group_16__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ManufacturingSystem__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__16__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__17"
    // InternalMyDsl.g:1143:1: rule__ManufacturingSystem__Group__17 : rule__ManufacturingSystem__Group__17__Impl rule__ManufacturingSystem__Group__18 ;
    public final void rule__ManufacturingSystem__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( rule__ManufacturingSystem__Group__17__Impl rule__ManufacturingSystem__Group__18 )
            // InternalMyDsl.g:1148:2: rule__ManufacturingSystem__Group__17__Impl rule__ManufacturingSystem__Group__18
            {
            pushFollow(FOLLOW_14);
            rule__ManufacturingSystem__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__17"


    // $ANTLR start "rule__ManufacturingSystem__Group__17__Impl"
    // InternalMyDsl.g:1155:1: rule__ManufacturingSystem__Group__17__Impl : ( 'set' ) ;
    public final void rule__ManufacturingSystem__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( ( 'set' ) )
            // InternalMyDsl.g:1160:1: ( 'set' )
            {
            // InternalMyDsl.g:1160:1: ( 'set' )
            // InternalMyDsl.g:1161:2: 'set'
            {
             before(grammarAccess.getManufacturingSystemAccess().getSetKeyword_17()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getSetKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__17__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__18"
    // InternalMyDsl.g:1170:1: rule__ManufacturingSystem__Group__18 : rule__ManufacturingSystem__Group__18__Impl rule__ManufacturingSystem__Group__19 ;
    public final void rule__ManufacturingSystem__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( rule__ManufacturingSystem__Group__18__Impl rule__ManufacturingSystem__Group__19 )
            // InternalMyDsl.g:1175:2: rule__ManufacturingSystem__Group__18__Impl rule__ManufacturingSystem__Group__19
            {
            pushFollow(FOLLOW_13);
            rule__ManufacturingSystem__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__18"


    // $ANTLR start "rule__ManufacturingSystem__Group__18__Impl"
    // InternalMyDsl.g:1182:1: rule__ManufacturingSystem__Group__18__Impl : ( 'lead' ) ;
    public final void rule__ManufacturingSystem__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( ( 'lead' ) )
            // InternalMyDsl.g:1187:1: ( 'lead' )
            {
            // InternalMyDsl.g:1187:1: ( 'lead' )
            // InternalMyDsl.g:1188:2: 'lead'
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeadKeyword_18()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeadKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__18__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__19"
    // InternalMyDsl.g:1197:1: rule__ManufacturingSystem__Group__19 : rule__ManufacturingSystem__Group__19__Impl rule__ManufacturingSystem__Group__20 ;
    public final void rule__ManufacturingSystem__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( rule__ManufacturingSystem__Group__19__Impl rule__ManufacturingSystem__Group__20 )
            // InternalMyDsl.g:1202:2: rule__ManufacturingSystem__Group__19__Impl rule__ManufacturingSystem__Group__20
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__19"


    // $ANTLR start "rule__ManufacturingSystem__Group__19__Impl"
    // InternalMyDsl.g:1209:1: rule__ManufacturingSystem__Group__19__Impl : ( 'responsible' ) ;
    public final void rule__ManufacturingSystem__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( ( 'responsible' ) )
            // InternalMyDsl.g:1214:1: ( 'responsible' )
            {
            // InternalMyDsl.g:1214:1: ( 'responsible' )
            // InternalMyDsl.g:1215:2: 'responsible'
            {
             before(grammarAccess.getManufacturingSystemAccess().getResponsibleKeyword_19()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getResponsibleKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__19__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__20"
    // InternalMyDsl.g:1224:1: rule__ManufacturingSystem__Group__20 : rule__ManufacturingSystem__Group__20__Impl rule__ManufacturingSystem__Group__21 ;
    public final void rule__ManufacturingSystem__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( rule__ManufacturingSystem__Group__20__Impl rule__ManufacturingSystem__Group__21 )
            // InternalMyDsl.g:1229:2: rule__ManufacturingSystem__Group__20__Impl rule__ManufacturingSystem__Group__21
            {
            pushFollow(FOLLOW_15);
            rule__ManufacturingSystem__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__20"


    // $ANTLR start "rule__ManufacturingSystem__Group__20__Impl"
    // InternalMyDsl.g:1236:1: rule__ManufacturingSystem__Group__20__Impl : ( ( rule__ManufacturingSystem__ResponsibleAssignment_20 ) ) ;
    public final void rule__ManufacturingSystem__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( ( ( rule__ManufacturingSystem__ResponsibleAssignment_20 ) ) )
            // InternalMyDsl.g:1241:1: ( ( rule__ManufacturingSystem__ResponsibleAssignment_20 ) )
            {
            // InternalMyDsl.g:1241:1: ( ( rule__ManufacturingSystem__ResponsibleAssignment_20 ) )
            // InternalMyDsl.g:1242:2: ( rule__ManufacturingSystem__ResponsibleAssignment_20 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getResponsibleAssignment_20()); 
            // InternalMyDsl.g:1243:2: ( rule__ManufacturingSystem__ResponsibleAssignment_20 )
            // InternalMyDsl.g:1243:3: rule__ManufacturingSystem__ResponsibleAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__ResponsibleAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getResponsibleAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__20__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__21"
    // InternalMyDsl.g:1251:1: rule__ManufacturingSystem__Group__21 : rule__ManufacturingSystem__Group__21__Impl rule__ManufacturingSystem__Group__22 ;
    public final void rule__ManufacturingSystem__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( rule__ManufacturingSystem__Group__21__Impl rule__ManufacturingSystem__Group__22 )
            // InternalMyDsl.g:1256:2: rule__ManufacturingSystem__Group__21__Impl rule__ManufacturingSystem__Group__22
            {
            pushFollow(FOLLOW_15);
            rule__ManufacturingSystem__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__21"


    // $ANTLR start "rule__ManufacturingSystem__Group__21__Impl"
    // InternalMyDsl.g:1263:1: rule__ManufacturingSystem__Group__21__Impl : ( ( rule__ManufacturingSystem__Group_21__0 )? ) ;
    public final void rule__ManufacturingSystem__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( ( ( rule__ManufacturingSystem__Group_21__0 )? ) )
            // InternalMyDsl.g:1268:1: ( ( rule__ManufacturingSystem__Group_21__0 )? )
            {
            // InternalMyDsl.g:1268:1: ( ( rule__ManufacturingSystem__Group_21__0 )? )
            // InternalMyDsl.g:1269:2: ( rule__ManufacturingSystem__Group_21__0 )?
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_21()); 
            // InternalMyDsl.g:1270:2: ( rule__ManufacturingSystem__Group_21__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1270:3: rule__ManufacturingSystem__Group_21__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystem__Group_21__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingSystemAccess().getGroup_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__21__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__22"
    // InternalMyDsl.g:1278:1: rule__ManufacturingSystem__Group__22 : rule__ManufacturingSystem__Group__22__Impl rule__ManufacturingSystem__Group__23 ;
    public final void rule__ManufacturingSystem__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1282:1: ( rule__ManufacturingSystem__Group__22__Impl rule__ManufacturingSystem__Group__23 )
            // InternalMyDsl.g:1283:2: rule__ManufacturingSystem__Group__22__Impl rule__ManufacturingSystem__Group__23
            {
            pushFollow(FOLLOW_15);
            rule__ManufacturingSystem__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__22"


    // $ANTLR start "rule__ManufacturingSystem__Group__22__Impl"
    // InternalMyDsl.g:1290:1: rule__ManufacturingSystem__Group__22__Impl : ( ( rule__ManufacturingSystem__Group_22__0 )? ) ;
    public final void rule__ManufacturingSystem__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( ( ( rule__ManufacturingSystem__Group_22__0 )? ) )
            // InternalMyDsl.g:1295:1: ( ( rule__ManufacturingSystem__Group_22__0 )? )
            {
            // InternalMyDsl.g:1295:1: ( ( rule__ManufacturingSystem__Group_22__0 )? )
            // InternalMyDsl.g:1296:2: ( rule__ManufacturingSystem__Group_22__0 )?
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_22()); 
            // InternalMyDsl.g:1297:2: ( rule__ManufacturingSystem__Group_22__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1297:3: rule__ManufacturingSystem__Group_22__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystem__Group_22__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingSystemAccess().getGroup_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__22__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__23"
    // InternalMyDsl.g:1305:1: rule__ManufacturingSystem__Group__23 : rule__ManufacturingSystem__Group__23__Impl rule__ManufacturingSystem__Group__24 ;
    public final void rule__ManufacturingSystem__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( rule__ManufacturingSystem__Group__23__Impl rule__ManufacturingSystem__Group__24 )
            // InternalMyDsl.g:1310:2: rule__ManufacturingSystem__Group__23__Impl rule__ManufacturingSystem__Group__24
            {
            pushFollow(FOLLOW_15);
            rule__ManufacturingSystem__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__23"


    // $ANTLR start "rule__ManufacturingSystem__Group__23__Impl"
    // InternalMyDsl.g:1317:1: rule__ManufacturingSystem__Group__23__Impl : ( ( rule__ManufacturingSystem__Group_23__0 )* ) ;
    public final void rule__ManufacturingSystem__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( ( ( rule__ManufacturingSystem__Group_23__0 )* ) )
            // InternalMyDsl.g:1322:1: ( ( rule__ManufacturingSystem__Group_23__0 )* )
            {
            // InternalMyDsl.g:1322:1: ( ( rule__ManufacturingSystem__Group_23__0 )* )
            // InternalMyDsl.g:1323:2: ( rule__ManufacturingSystem__Group_23__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_23()); 
            // InternalMyDsl.g:1324:2: ( rule__ManufacturingSystem__Group_23__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1324:3: rule__ManufacturingSystem__Group_23__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ManufacturingSystem__Group_23__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__23__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group__24"
    // InternalMyDsl.g:1332:1: rule__ManufacturingSystem__Group__24 : rule__ManufacturingSystem__Group__24__Impl ;
    public final void rule__ManufacturingSystem__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1336:1: ( rule__ManufacturingSystem__Group__24__Impl )
            // InternalMyDsl.g:1337:2: rule__ManufacturingSystem__Group__24__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group__24__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__24"


    // $ANTLR start "rule__ManufacturingSystem__Group__24__Impl"
    // InternalMyDsl.g:1343:1: rule__ManufacturingSystem__Group__24__Impl : ( '}' ) ;
    public final void rule__ManufacturingSystem__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1347:1: ( ( '}' ) )
            // InternalMyDsl.g:1348:1: ( '}' )
            {
            // InternalMyDsl.g:1348:1: ( '}' )
            // InternalMyDsl.g:1349:2: '}'
            {
             before(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_24()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group__24__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_7__0"
    // InternalMyDsl.g:1359:1: rule__ManufacturingSystem__Group_7__0 : rule__ManufacturingSystem__Group_7__0__Impl rule__ManufacturingSystem__Group_7__1 ;
    public final void rule__ManufacturingSystem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( rule__ManufacturingSystem__Group_7__0__Impl rule__ManufacturingSystem__Group_7__1 )
            // InternalMyDsl.g:1364:2: rule__ManufacturingSystem__Group_7__0__Impl rule__ManufacturingSystem__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_7__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_7__0__Impl"
    // InternalMyDsl.g:1371:1: rule__ManufacturingSystem__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( ( ',' ) )
            // InternalMyDsl.g:1376:1: ( ',' )
            {
            // InternalMyDsl.g:1376:1: ( ',' )
            // InternalMyDsl.g:1377:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_7__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_7__1"
    // InternalMyDsl.g:1386:1: rule__ManufacturingSystem__Group_7__1 : rule__ManufacturingSystem__Group_7__1__Impl ;
    public final void rule__ManufacturingSystem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( rule__ManufacturingSystem__Group_7__1__Impl )
            // InternalMyDsl.g:1391:2: rule__ManufacturingSystem__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_7__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_7__1__Impl"
    // InternalMyDsl.g:1397:1: rule__ManufacturingSystem__Group_7__1__Impl : ( ( rule__ManufacturingSystem__StartAssignment_7_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( ( ( rule__ManufacturingSystem__StartAssignment_7_1 ) ) )
            // InternalMyDsl.g:1402:1: ( ( rule__ManufacturingSystem__StartAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1402:1: ( ( rule__ManufacturingSystem__StartAssignment_7_1 ) )
            // InternalMyDsl.g:1403:2: ( rule__ManufacturingSystem__StartAssignment_7_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartAssignment_7_1()); 
            // InternalMyDsl.g:1404:2: ( rule__ManufacturingSystem__StartAssignment_7_1 )
            // InternalMyDsl.g:1404:3: rule__ManufacturingSystem__StartAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__StartAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getStartAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_7__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_12__0"
    // InternalMyDsl.g:1413:1: rule__ManufacturingSystem__Group_12__0 : rule__ManufacturingSystem__Group_12__0__Impl rule__ManufacturingSystem__Group_12__1 ;
    public final void rule__ManufacturingSystem__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( rule__ManufacturingSystem__Group_12__0__Impl rule__ManufacturingSystem__Group_12__1 )
            // InternalMyDsl.g:1418:2: rule__ManufacturingSystem__Group_12__0__Impl rule__ManufacturingSystem__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_12__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_12__0__Impl"
    // InternalMyDsl.g:1425:1: rule__ManufacturingSystem__Group_12__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( ( ',' ) )
            // InternalMyDsl.g:1430:1: ( ',' )
            {
            // InternalMyDsl.g:1430:1: ( ',' )
            // InternalMyDsl.g:1431:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_12_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_12__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_12__1"
    // InternalMyDsl.g:1440:1: rule__ManufacturingSystem__Group_12__1 : rule__ManufacturingSystem__Group_12__1__Impl ;
    public final void rule__ManufacturingSystem__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( rule__ManufacturingSystem__Group_12__1__Impl )
            // InternalMyDsl.g:1445:2: rule__ManufacturingSystem__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_12__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_12__1__Impl"
    // InternalMyDsl.g:1451:1: rule__ManufacturingSystem__Group_12__1__Impl : ( ( rule__ManufacturingSystem__EndAssignment_12_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1455:1: ( ( ( rule__ManufacturingSystem__EndAssignment_12_1 ) ) )
            // InternalMyDsl.g:1456:1: ( ( rule__ManufacturingSystem__EndAssignment_12_1 ) )
            {
            // InternalMyDsl.g:1456:1: ( ( rule__ManufacturingSystem__EndAssignment_12_1 ) )
            // InternalMyDsl.g:1457:2: ( rule__ManufacturingSystem__EndAssignment_12_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndAssignment_12_1()); 
            // InternalMyDsl.g:1458:2: ( rule__ManufacturingSystem__EndAssignment_12_1 )
            // InternalMyDsl.g:1458:3: rule__ManufacturingSystem__EndAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__EndAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getEndAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_12__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_16__0"
    // InternalMyDsl.g:1467:1: rule__ManufacturingSystem__Group_16__0 : rule__ManufacturingSystem__Group_16__0__Impl rule__ManufacturingSystem__Group_16__1 ;
    public final void rule__ManufacturingSystem__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( rule__ManufacturingSystem__Group_16__0__Impl rule__ManufacturingSystem__Group_16__1 )
            // InternalMyDsl.g:1472:2: rule__ManufacturingSystem__Group_16__0__Impl rule__ManufacturingSystem__Group_16__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_16__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_16__0__Impl"
    // InternalMyDsl.g:1479:1: rule__ManufacturingSystem__Group_16__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( ( ',' ) )
            // InternalMyDsl.g:1484:1: ( ',' )
            {
            // InternalMyDsl.g:1484:1: ( ',' )
            // InternalMyDsl.g:1485:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_16_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_16__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_16__1"
    // InternalMyDsl.g:1494:1: rule__ManufacturingSystem__Group_16__1 : rule__ManufacturingSystem__Group_16__1__Impl ;
    public final void rule__ManufacturingSystem__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( rule__ManufacturingSystem__Group_16__1__Impl )
            // InternalMyDsl.g:1499:2: rule__ManufacturingSystem__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_16__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_16__1__Impl"
    // InternalMyDsl.g:1505:1: rule__ManufacturingSystem__Group_16__1__Impl : ( ( rule__ManufacturingSystem__StaffAssignment_16_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1509:1: ( ( ( rule__ManufacturingSystem__StaffAssignment_16_1 ) ) )
            // InternalMyDsl.g:1510:1: ( ( rule__ManufacturingSystem__StaffAssignment_16_1 ) )
            {
            // InternalMyDsl.g:1510:1: ( ( rule__ManufacturingSystem__StaffAssignment_16_1 ) )
            // InternalMyDsl.g:1511:2: ( rule__ManufacturingSystem__StaffAssignment_16_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStaffAssignment_16_1()); 
            // InternalMyDsl.g:1512:2: ( rule__ManufacturingSystem__StaffAssignment_16_1 )
            // InternalMyDsl.g:1512:3: rule__ManufacturingSystem__StaffAssignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__StaffAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getStaffAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_16__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__0"
    // InternalMyDsl.g:1521:1: rule__ManufacturingSystem__Group_21__0 : rule__ManufacturingSystem__Group_21__0__Impl rule__ManufacturingSystem__Group_21__1 ;
    public final void rule__ManufacturingSystem__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( rule__ManufacturingSystem__Group_21__0__Impl rule__ManufacturingSystem__Group_21__1 )
            // InternalMyDsl.g:1526:2: rule__ManufacturingSystem__Group_21__0__Impl rule__ManufacturingSystem__Group_21__1
            {
            pushFollow(FOLLOW_17);
            rule__ManufacturingSystem__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__0__Impl"
    // InternalMyDsl.g:1533:1: rule__ManufacturingSystem__Group_21__0__Impl : ( 'workpiece' ) ;
    public final void rule__ManufacturingSystem__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( ( 'workpiece' ) )
            // InternalMyDsl.g:1538:1: ( 'workpiece' )
            {
            // InternalMyDsl.g:1538:1: ( 'workpiece' )
            // InternalMyDsl.g:1539:2: 'workpiece'
            {
             before(grammarAccess.getManufacturingSystemAccess().getWorkpieceKeyword_21_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getWorkpieceKeyword_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__1"
    // InternalMyDsl.g:1548:1: rule__ManufacturingSystem__Group_21__1 : rule__ManufacturingSystem__Group_21__1__Impl rule__ManufacturingSystem__Group_21__2 ;
    public final void rule__ManufacturingSystem__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( rule__ManufacturingSystem__Group_21__1__Impl rule__ManufacturingSystem__Group_21__2 )
            // InternalMyDsl.g:1553:2: rule__ManufacturingSystem__Group_21__1__Impl rule__ManufacturingSystem__Group_21__2
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group_21__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__1__Impl"
    // InternalMyDsl.g:1560:1: rule__ManufacturingSystem__Group_21__1__Impl : ( 'type' ) ;
    public final void rule__ManufacturingSystem__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( ( 'type' ) )
            // InternalMyDsl.g:1565:1: ( 'type' )
            {
            // InternalMyDsl.g:1565:1: ( 'type' )
            // InternalMyDsl.g:1566:2: 'type'
            {
             before(grammarAccess.getManufacturingSystemAccess().getTypeKeyword_21_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getTypeKeyword_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__2"
    // InternalMyDsl.g:1575:1: rule__ManufacturingSystem__Group_21__2 : rule__ManufacturingSystem__Group_21__2__Impl rule__ManufacturingSystem__Group_21__3 ;
    public final void rule__ManufacturingSystem__Group_21__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( rule__ManufacturingSystem__Group_21__2__Impl rule__ManufacturingSystem__Group_21__3 )
            // InternalMyDsl.g:1580:2: rule__ManufacturingSystem__Group_21__2__Impl rule__ManufacturingSystem__Group_21__3
            {
            pushFollow(FOLLOW_18);
            rule__ManufacturingSystem__Group_21__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__2"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__2__Impl"
    // InternalMyDsl.g:1587:1: rule__ManufacturingSystem__Group_21__2__Impl : ( ( rule__ManufacturingSystem__UsesAssignment_21_2 ) ) ;
    public final void rule__ManufacturingSystem__Group_21__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( ( ( rule__ManufacturingSystem__UsesAssignment_21_2 ) ) )
            // InternalMyDsl.g:1592:1: ( ( rule__ManufacturingSystem__UsesAssignment_21_2 ) )
            {
            // InternalMyDsl.g:1592:1: ( ( rule__ManufacturingSystem__UsesAssignment_21_2 ) )
            // InternalMyDsl.g:1593:2: ( rule__ManufacturingSystem__UsesAssignment_21_2 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getUsesAssignment_21_2()); 
            // InternalMyDsl.g:1594:2: ( rule__ManufacturingSystem__UsesAssignment_21_2 )
            // InternalMyDsl.g:1594:3: rule__ManufacturingSystem__UsesAssignment_21_2
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__UsesAssignment_21_2();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getUsesAssignment_21_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__2__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__3"
    // InternalMyDsl.g:1602:1: rule__ManufacturingSystem__Group_21__3 : rule__ManufacturingSystem__Group_21__3__Impl ;
    public final void rule__ManufacturingSystem__Group_21__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( rule__ManufacturingSystem__Group_21__3__Impl )
            // InternalMyDsl.g:1607:2: rule__ManufacturingSystem__Group_21__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__3"


    // $ANTLR start "rule__ManufacturingSystem__Group_21__3__Impl"
    // InternalMyDsl.g:1613:1: rule__ManufacturingSystem__Group_21__3__Impl : ( ( rule__ManufacturingSystem__Group_21_3__0 )* ) ;
    public final void rule__ManufacturingSystem__Group_21__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1617:1: ( ( ( rule__ManufacturingSystem__Group_21_3__0 )* ) )
            // InternalMyDsl.g:1618:1: ( ( rule__ManufacturingSystem__Group_21_3__0 )* )
            {
            // InternalMyDsl.g:1618:1: ( ( rule__ManufacturingSystem__Group_21_3__0 )* )
            // InternalMyDsl.g:1619:2: ( rule__ManufacturingSystem__Group_21_3__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_21_3()); 
            // InternalMyDsl.g:1620:2: ( rule__ManufacturingSystem__Group_21_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1620:3: rule__ManufacturingSystem__Group_21_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ManufacturingSystem__Group_21_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_21_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21__3__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21_3__0"
    // InternalMyDsl.g:1629:1: rule__ManufacturingSystem__Group_21_3__0 : rule__ManufacturingSystem__Group_21_3__0__Impl rule__ManufacturingSystem__Group_21_3__1 ;
    public final void rule__ManufacturingSystem__Group_21_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( rule__ManufacturingSystem__Group_21_3__0__Impl rule__ManufacturingSystem__Group_21_3__1 )
            // InternalMyDsl.g:1634:2: rule__ManufacturingSystem__Group_21_3__0__Impl rule__ManufacturingSystem__Group_21_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystem__Group_21_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21_3__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_21_3__0__Impl"
    // InternalMyDsl.g:1641:1: rule__ManufacturingSystem__Group_21_3__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_21_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( ( ',' ) )
            // InternalMyDsl.g:1646:1: ( ',' )
            {
            // InternalMyDsl.g:1646:1: ( ',' )
            // InternalMyDsl.g:1647:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_21_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_21_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21_3__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_21_3__1"
    // InternalMyDsl.g:1656:1: rule__ManufacturingSystem__Group_21_3__1 : rule__ManufacturingSystem__Group_21_3__1__Impl ;
    public final void rule__ManufacturingSystem__Group_21_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( rule__ManufacturingSystem__Group_21_3__1__Impl )
            // InternalMyDsl.g:1661:2: rule__ManufacturingSystem__Group_21_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_21_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21_3__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_21_3__1__Impl"
    // InternalMyDsl.g:1667:1: rule__ManufacturingSystem__Group_21_3__1__Impl : ( ( rule__ManufacturingSystem__UsesAssignment_21_3_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_21_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1671:1: ( ( ( rule__ManufacturingSystem__UsesAssignment_21_3_1 ) ) )
            // InternalMyDsl.g:1672:1: ( ( rule__ManufacturingSystem__UsesAssignment_21_3_1 ) )
            {
            // InternalMyDsl.g:1672:1: ( ( rule__ManufacturingSystem__UsesAssignment_21_3_1 ) )
            // InternalMyDsl.g:1673:2: ( rule__ManufacturingSystem__UsesAssignment_21_3_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getUsesAssignment_21_3_1()); 
            // InternalMyDsl.g:1674:2: ( rule__ManufacturingSystem__UsesAssignment_21_3_1 )
            // InternalMyDsl.g:1674:3: rule__ManufacturingSystem__UsesAssignment_21_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__UsesAssignment_21_3_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getUsesAssignment_21_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_21_3__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_22__0"
    // InternalMyDsl.g:1683:1: rule__ManufacturingSystem__Group_22__0 : rule__ManufacturingSystem__Group_22__0__Impl rule__ManufacturingSystem__Group_22__1 ;
    public final void rule__ManufacturingSystem__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( rule__ManufacturingSystem__Group_22__0__Impl rule__ManufacturingSystem__Group_22__1 )
            // InternalMyDsl.g:1688:2: rule__ManufacturingSystem__Group_22__0__Impl rule__ManufacturingSystem__Group_22__1
            {
            pushFollow(FOLLOW_19);
            rule__ManufacturingSystem__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_22__0__Impl"
    // InternalMyDsl.g:1695:1: rule__ManufacturingSystem__Group_22__0__Impl : ( 'processes' ) ;
    public final void rule__ManufacturingSystem__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( ( 'processes' ) )
            // InternalMyDsl.g:1700:1: ( 'processes' )
            {
            // InternalMyDsl.g:1700:1: ( 'processes' )
            // InternalMyDsl.g:1701:2: 'processes'
            {
             before(grammarAccess.getManufacturingSystemAccess().getProcessesKeyword_22_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getProcessesKeyword_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_22__1"
    // InternalMyDsl.g:1710:1: rule__ManufacturingSystem__Group_22__1 : rule__ManufacturingSystem__Group_22__1__Impl rule__ManufacturingSystem__Group_22__2 ;
    public final void rule__ManufacturingSystem__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( rule__ManufacturingSystem__Group_22__1__Impl rule__ManufacturingSystem__Group_22__2 )
            // InternalMyDsl.g:1715:2: rule__ManufacturingSystem__Group_22__1__Impl rule__ManufacturingSystem__Group_22__2
            {
            pushFollow(FOLLOW_18);
            rule__ManufacturingSystem__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_22__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_22__1__Impl"
    // InternalMyDsl.g:1722:1: rule__ManufacturingSystem__Group_22__1__Impl : ( ( rule__ManufacturingSystem__TransformsAssignment_22_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( ( ( rule__ManufacturingSystem__TransformsAssignment_22_1 ) ) )
            // InternalMyDsl.g:1727:1: ( ( rule__ManufacturingSystem__TransformsAssignment_22_1 ) )
            {
            // InternalMyDsl.g:1727:1: ( ( rule__ManufacturingSystem__TransformsAssignment_22_1 ) )
            // InternalMyDsl.g:1728:2: ( rule__ManufacturingSystem__TransformsAssignment_22_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getTransformsAssignment_22_1()); 
            // InternalMyDsl.g:1729:2: ( rule__ManufacturingSystem__TransformsAssignment_22_1 )
            // InternalMyDsl.g:1729:3: rule__ManufacturingSystem__TransformsAssignment_22_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__TransformsAssignment_22_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getTransformsAssignment_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_22__2"
    // InternalMyDsl.g:1737:1: rule__ManufacturingSystem__Group_22__2 : rule__ManufacturingSystem__Group_22__2__Impl ;
    public final void rule__ManufacturingSystem__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( rule__ManufacturingSystem__Group_22__2__Impl )
            // InternalMyDsl.g:1742:2: rule__ManufacturingSystem__Group_22__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_22__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22__2"


    // $ANTLR start "rule__ManufacturingSystem__Group_22__2__Impl"
    // InternalMyDsl.g:1748:1: rule__ManufacturingSystem__Group_22__2__Impl : ( ( rule__ManufacturingSystem__Group_22_2__0 )* ) ;
    public final void rule__ManufacturingSystem__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1752:1: ( ( ( rule__ManufacturingSystem__Group_22_2__0 )* ) )
            // InternalMyDsl.g:1753:1: ( ( rule__ManufacturingSystem__Group_22_2__0 )* )
            {
            // InternalMyDsl.g:1753:1: ( ( rule__ManufacturingSystem__Group_22_2__0 )* )
            // InternalMyDsl.g:1754:2: ( rule__ManufacturingSystem__Group_22_2__0 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getGroup_22_2()); 
            // InternalMyDsl.g:1755:2: ( rule__ManufacturingSystem__Group_22_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1755:3: rule__ManufacturingSystem__Group_22_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ManufacturingSystem__Group_22_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getGroup_22_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22__2__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_22_2__0"
    // InternalMyDsl.g:1764:1: rule__ManufacturingSystem__Group_22_2__0 : rule__ManufacturingSystem__Group_22_2__0__Impl rule__ManufacturingSystem__Group_22_2__1 ;
    public final void rule__ManufacturingSystem__Group_22_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( rule__ManufacturingSystem__Group_22_2__0__Impl rule__ManufacturingSystem__Group_22_2__1 )
            // InternalMyDsl.g:1769:2: rule__ManufacturingSystem__Group_22_2__0__Impl rule__ManufacturingSystem__Group_22_2__1
            {
            pushFollow(FOLLOW_19);
            rule__ManufacturingSystem__Group_22_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_22_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22_2__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_22_2__0__Impl"
    // InternalMyDsl.g:1776:1: rule__ManufacturingSystem__Group_22_2__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystem__Group_22_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( ( ',' ) )
            // InternalMyDsl.g:1781:1: ( ',' )
            {
            // InternalMyDsl.g:1781:1: ( ',' )
            // InternalMyDsl.g:1782:2: ','
            {
             before(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_22_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getCommaKeyword_22_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22_2__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_22_2__1"
    // InternalMyDsl.g:1791:1: rule__ManufacturingSystem__Group_22_2__1 : rule__ManufacturingSystem__Group_22_2__1__Impl ;
    public final void rule__ManufacturingSystem__Group_22_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( rule__ManufacturingSystem__Group_22_2__1__Impl )
            // InternalMyDsl.g:1796:2: rule__ManufacturingSystem__Group_22_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_22_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22_2__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_22_2__1__Impl"
    // InternalMyDsl.g:1802:1: rule__ManufacturingSystem__Group_22_2__1__Impl : ( ( rule__ManufacturingSystem__TransformsAssignment_22_2_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_22_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1806:1: ( ( ( rule__ManufacturingSystem__TransformsAssignment_22_2_1 ) ) )
            // InternalMyDsl.g:1807:1: ( ( rule__ManufacturingSystem__TransformsAssignment_22_2_1 ) )
            {
            // InternalMyDsl.g:1807:1: ( ( rule__ManufacturingSystem__TransformsAssignment_22_2_1 ) )
            // InternalMyDsl.g:1808:2: ( rule__ManufacturingSystem__TransformsAssignment_22_2_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getTransformsAssignment_22_2_1()); 
            // InternalMyDsl.g:1809:2: ( rule__ManufacturingSystem__TransformsAssignment_22_2_1 )
            // InternalMyDsl.g:1809:3: rule__ManufacturingSystem__TransformsAssignment_22_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__TransformsAssignment_22_2_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getTransformsAssignment_22_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_22_2__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_23__0"
    // InternalMyDsl.g:1818:1: rule__ManufacturingSystem__Group_23__0 : rule__ManufacturingSystem__Group_23__0__Impl rule__ManufacturingSystem__Group_23__1 ;
    public final void rule__ManufacturingSystem__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( rule__ManufacturingSystem__Group_23__0__Impl rule__ManufacturingSystem__Group_23__1 )
            // InternalMyDsl.g:1823:2: rule__ManufacturingSystem__Group_23__0__Impl rule__ManufacturingSystem__Group_23__1
            {
            pushFollow(FOLLOW_20);
            rule__ManufacturingSystem__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_23__0__Impl"
    // InternalMyDsl.g:1830:1: rule__ManufacturingSystem__Group_23__0__Impl : ( 'initiate' ) ;
    public final void rule__ManufacturingSystem__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( 'initiate' ) )
            // InternalMyDsl.g:1835:1: ( 'initiate' )
            {
            // InternalMyDsl.g:1835:1: ( 'initiate' )
            // InternalMyDsl.g:1836:2: 'initiate'
            {
             before(grammarAccess.getManufacturingSystemAccess().getInitiateKeyword_23_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getInitiateKeyword_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_23__1"
    // InternalMyDsl.g:1845:1: rule__ManufacturingSystem__Group_23__1 : rule__ManufacturingSystem__Group_23__1__Impl ;
    public final void rule__ManufacturingSystem__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( rule__ManufacturingSystem__Group_23__1__Impl )
            // InternalMyDsl.g:1850:2: rule__ManufacturingSystem__Group_23__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_23__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_23__1__Impl"
    // InternalMyDsl.g:1856:1: rule__ManufacturingSystem__Group_23__1__Impl : ( ( rule__ManufacturingSystem__Alternatives_23_1 ) ) ;
    public final void rule__ManufacturingSystem__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1860:1: ( ( ( rule__ManufacturingSystem__Alternatives_23_1 ) ) )
            // InternalMyDsl.g:1861:1: ( ( rule__ManufacturingSystem__Alternatives_23_1 ) )
            {
            // InternalMyDsl.g:1861:1: ( ( rule__ManufacturingSystem__Alternatives_23_1 ) )
            // InternalMyDsl.g:1862:2: ( rule__ManufacturingSystem__Alternatives_23_1 )
            {
             before(grammarAccess.getManufacturingSystemAccess().getAlternatives_23_1()); 
            // InternalMyDsl.g:1863:2: ( rule__ManufacturingSystem__Alternatives_23_1 )
            // InternalMyDsl.g:1863:3: rule__ManufacturingSystem__Alternatives_23_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Alternatives_23_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemAccess().getAlternatives_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_23_1_1__0"
    // InternalMyDsl.g:1872:1: rule__ManufacturingSystem__Group_23_1_1__0 : rule__ManufacturingSystem__Group_23_1_1__0__Impl rule__ManufacturingSystem__Group_23_1_1__1 ;
    public final void rule__ManufacturingSystem__Group_23_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( rule__ManufacturingSystem__Group_23_1_1__0__Impl rule__ManufacturingSystem__Group_23_1_1__1 )
            // InternalMyDsl.g:1877:2: rule__ManufacturingSystem__Group_23_1_1__0__Impl rule__ManufacturingSystem__Group_23_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__ManufacturingSystem__Group_23_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_23_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23_1_1__0"


    // $ANTLR start "rule__ManufacturingSystem__Group_23_1_1__0__Impl"
    // InternalMyDsl.g:1884:1: rule__ManufacturingSystem__Group_23_1_1__0__Impl : ( '{' ) ;
    public final void rule__ManufacturingSystem__Group_23_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( ( '{' ) )
            // InternalMyDsl.g:1889:1: ( '{' )
            {
            // InternalMyDsl.g:1889:1: ( '{' )
            // InternalMyDsl.g:1890:2: '{'
            {
             before(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_23_1_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getLeftCurlyBracketKeyword_23_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23_1_1__0__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_23_1_1__1"
    // InternalMyDsl.g:1899:1: rule__ManufacturingSystem__Group_23_1_1__1 : rule__ManufacturingSystem__Group_23_1_1__1__Impl rule__ManufacturingSystem__Group_23_1_1__2 ;
    public final void rule__ManufacturingSystem__Group_23_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1903:1: ( rule__ManufacturingSystem__Group_23_1_1__1__Impl rule__ManufacturingSystem__Group_23_1_1__2 )
            // InternalMyDsl.g:1904:2: rule__ManufacturingSystem__Group_23_1_1__1__Impl rule__ManufacturingSystem__Group_23_1_1__2
            {
            pushFollow(FOLLOW_21);
            rule__ManufacturingSystem__Group_23_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_23_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23_1_1__1"


    // $ANTLR start "rule__ManufacturingSystem__Group_23_1_1__1__Impl"
    // InternalMyDsl.g:1911:1: rule__ManufacturingSystem__Group_23_1_1__1__Impl : ( ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1 )* ) ;
    public final void rule__ManufacturingSystem__Group_23_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( ( ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1 )* ) )
            // InternalMyDsl.g:1916:1: ( ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1 )* )
            {
            // InternalMyDsl.g:1916:1: ( ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1 )* )
            // InternalMyDsl.g:1917:2: ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1 )*
            {
             before(grammarAccess.getManufacturingSystemAccess().getConsistsOfAssignment_23_1_1_1()); 
            // InternalMyDsl.g:1918:2: ( rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28||LA15_0==32||LA15_0==36||(LA15_0>=41 && LA15_0<=43)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1918:3: rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemAccess().getConsistsOfAssignment_23_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23_1_1__1__Impl"


    // $ANTLR start "rule__ManufacturingSystem__Group_23_1_1__2"
    // InternalMyDsl.g:1926:1: rule__ManufacturingSystem__Group_23_1_1__2 : rule__ManufacturingSystem__Group_23_1_1__2__Impl ;
    public final void rule__ManufacturingSystem__Group_23_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( rule__ManufacturingSystem__Group_23_1_1__2__Impl )
            // InternalMyDsl.g:1931:2: rule__ManufacturingSystem__Group_23_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystem__Group_23_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23_1_1__2"


    // $ANTLR start "rule__ManufacturingSystem__Group_23_1_1__2__Impl"
    // InternalMyDsl.g:1937:1: rule__ManufacturingSystem__Group_23_1_1__2__Impl : ( '}' ) ;
    public final void rule__ManufacturingSystem__Group_23_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1941:1: ( ( '}' ) )
            // InternalMyDsl.g:1942:1: ( '}' )
            {
            // InternalMyDsl.g:1942:1: ( '}' )
            // InternalMyDsl.g:1943:2: '}'
            {
             before(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_23_1_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemAccess().getRightCurlyBracketKeyword_23_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__Group_23_1_1__2__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__0"
    // InternalMyDsl.g:1953:1: rule__ManufacturingSystemElement_Impl__Group__0 : rule__ManufacturingSystemElement_Impl__Group__0__Impl rule__ManufacturingSystemElement_Impl__Group__1 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1957:1: ( rule__ManufacturingSystemElement_Impl__Group__0__Impl rule__ManufacturingSystemElement_Impl__Group__1 )
            // InternalMyDsl.g:1958:2: rule__ManufacturingSystemElement_Impl__Group__0__Impl rule__ManufacturingSystemElement_Impl__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__ManufacturingSystemElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__0"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__0__Impl"
    // InternalMyDsl.g:1965:1: rule__ManufacturingSystemElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( ( () ) )
            // InternalMyDsl.g:1970:1: ( () )
            {
            // InternalMyDsl.g:1970:1: ( () )
            // InternalMyDsl.g:1971:2: ()
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementAction_0()); 
            // InternalMyDsl.g:1972:2: ()
            // InternalMyDsl.g:1972:3: 
            {
            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__1"
    // InternalMyDsl.g:1980:1: rule__ManufacturingSystemElement_Impl__Group__1 : rule__ManufacturingSystemElement_Impl__Group__1__Impl rule__ManufacturingSystemElement_Impl__Group__2 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( rule__ManufacturingSystemElement_Impl__Group__1__Impl rule__ManufacturingSystemElement_Impl__Group__2 )
            // InternalMyDsl.g:1985:2: rule__ManufacturingSystemElement_Impl__Group__1__Impl rule__ManufacturingSystemElement_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystemElement_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__1__Impl"
    // InternalMyDsl.g:1992:1: rule__ManufacturingSystemElement_Impl__Group__1__Impl : ( 'ManufacturingSystemElement' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( ( 'ManufacturingSystemElement' ) )
            // InternalMyDsl.g:1997:1: ( 'ManufacturingSystemElement' )
            {
            // InternalMyDsl.g:1997:1: ( 'ManufacturingSystemElement' )
            // InternalMyDsl.g:1998:2: 'ManufacturingSystemElement'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getManufacturingSystemElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__2"
    // InternalMyDsl.g:2007:1: rule__ManufacturingSystemElement_Impl__Group__2 : rule__ManufacturingSystemElement_Impl__Group__2__Impl rule__ManufacturingSystemElement_Impl__Group__3 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( rule__ManufacturingSystemElement_Impl__Group__2__Impl rule__ManufacturingSystemElement_Impl__Group__3 )
            // InternalMyDsl.g:2012:2: rule__ManufacturingSystemElement_Impl__Group__2__Impl rule__ManufacturingSystemElement_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ManufacturingSystemElement_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__2"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__2__Impl"
    // InternalMyDsl.g:2019:1: rule__ManufacturingSystemElement_Impl__Group__2__Impl : ( ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( ( ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2024:1: ( ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2024:1: ( ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 ) )
            // InternalMyDsl.g:2025:2: ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2026:2: ( rule__ManufacturingSystemElement_Impl__NameAssignment_2 )
            // InternalMyDsl.g:2026:3: rule__ManufacturingSystemElement_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__2__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__3"
    // InternalMyDsl.g:2034:1: rule__ManufacturingSystemElement_Impl__Group__3 : rule__ManufacturingSystemElement_Impl__Group__3__Impl rule__ManufacturingSystemElement_Impl__Group__4 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2038:1: ( rule__ManufacturingSystemElement_Impl__Group__3__Impl rule__ManufacturingSystemElement_Impl__Group__4 )
            // InternalMyDsl.g:2039:2: rule__ManufacturingSystemElement_Impl__Group__3__Impl rule__ManufacturingSystemElement_Impl__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ManufacturingSystemElement_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__3"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__3__Impl"
    // InternalMyDsl.g:2046:1: rule__ManufacturingSystemElement_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( ( '{' ) )
            // InternalMyDsl.g:2051:1: ( '{' )
            {
            // InternalMyDsl.g:2051:1: ( '{' )
            // InternalMyDsl.g:2052:2: '{'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__3__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__4"
    // InternalMyDsl.g:2061:1: rule__ManufacturingSystemElement_Impl__Group__4 : rule__ManufacturingSystemElement_Impl__Group__4__Impl rule__ManufacturingSystemElement_Impl__Group__5 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( rule__ManufacturingSystemElement_Impl__Group__4__Impl rule__ManufacturingSystemElement_Impl__Group__5 )
            // InternalMyDsl.g:2066:2: rule__ManufacturingSystemElement_Impl__Group__4__Impl rule__ManufacturingSystemElement_Impl__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ManufacturingSystemElement_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__4"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__4__Impl"
    // InternalMyDsl.g:2073:1: rule__ManufacturingSystemElement_Impl__Group__4__Impl : ( ( rule__ManufacturingSystemElement_Impl__Group_4__0 )? ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( ( ( rule__ManufacturingSystemElement_Impl__Group_4__0 )? ) )
            // InternalMyDsl.g:2078:1: ( ( rule__ManufacturingSystemElement_Impl__Group_4__0 )? )
            {
            // InternalMyDsl.g:2078:1: ( ( rule__ManufacturingSystemElement_Impl__Group_4__0 )? )
            // InternalMyDsl.g:2079:2: ( rule__ManufacturingSystemElement_Impl__Group_4__0 )?
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_4()); 
            // InternalMyDsl.g:2080:2: ( rule__ManufacturingSystemElement_Impl__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2080:3: rule__ManufacturingSystemElement_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingSystemElement_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__4__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__5"
    // InternalMyDsl.g:2088:1: rule__ManufacturingSystemElement_Impl__Group__5 : rule__ManufacturingSystemElement_Impl__Group__5__Impl rule__ManufacturingSystemElement_Impl__Group__6 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( rule__ManufacturingSystemElement_Impl__Group__5__Impl rule__ManufacturingSystemElement_Impl__Group__6 )
            // InternalMyDsl.g:2093:2: rule__ManufacturingSystemElement_Impl__Group__5__Impl rule__ManufacturingSystemElement_Impl__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ManufacturingSystemElement_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__5"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__5__Impl"
    // InternalMyDsl.g:2100:1: rule__ManufacturingSystemElement_Impl__Group__5__Impl : ( 'set' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( ( 'set' ) )
            // InternalMyDsl.g:2105:1: ( 'set' )
            {
            // InternalMyDsl.g:2105:1: ( 'set' )
            // InternalMyDsl.g:2106:2: 'set'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getSetKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getSetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__5__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__6"
    // InternalMyDsl.g:2115:1: rule__ManufacturingSystemElement_Impl__Group__6 : rule__ManufacturingSystemElement_Impl__Group__6__Impl rule__ManufacturingSystemElement_Impl__Group__7 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( rule__ManufacturingSystemElement_Impl__Group__6__Impl rule__ManufacturingSystemElement_Impl__Group__7 )
            // InternalMyDsl.g:2120:2: rule__ManufacturingSystemElement_Impl__Group__6__Impl rule__ManufacturingSystemElement_Impl__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystemElement_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__6"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__6__Impl"
    // InternalMyDsl.g:2127:1: rule__ManufacturingSystemElement_Impl__Group__6__Impl : ( 'responsible' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( ( 'responsible' ) )
            // InternalMyDsl.g:2132:1: ( 'responsible' )
            {
            // InternalMyDsl.g:2132:1: ( 'responsible' )
            // InternalMyDsl.g:2133:2: 'responsible'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__6__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__7"
    // InternalMyDsl.g:2142:1: rule__ManufacturingSystemElement_Impl__Group__7 : rule__ManufacturingSystemElement_Impl__Group__7__Impl rule__ManufacturingSystemElement_Impl__Group__8 ;
    public final void rule__ManufacturingSystemElement_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( rule__ManufacturingSystemElement_Impl__Group__7__Impl rule__ManufacturingSystemElement_Impl__Group__8 )
            // InternalMyDsl.g:2147:2: rule__ManufacturingSystemElement_Impl__Group__7__Impl rule__ManufacturingSystemElement_Impl__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__ManufacturingSystemElement_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__7"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__7__Impl"
    // InternalMyDsl.g:2154:1: rule__ManufacturingSystemElement_Impl__Group__7__Impl : ( ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7 ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( ( ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7 ) ) )
            // InternalMyDsl.g:2159:1: ( ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7 ) )
            {
            // InternalMyDsl.g:2159:1: ( ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7 ) )
            // InternalMyDsl.g:2160:2: ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleAssignment_7()); 
            // InternalMyDsl.g:2161:2: ( rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7 )
            // InternalMyDsl.g:2161:3: rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__7__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__8"
    // InternalMyDsl.g:2169:1: rule__ManufacturingSystemElement_Impl__Group__8 : rule__ManufacturingSystemElement_Impl__Group__8__Impl ;
    public final void rule__ManufacturingSystemElement_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2173:1: ( rule__ManufacturingSystemElement_Impl__Group__8__Impl )
            // InternalMyDsl.g:2174:2: rule__ManufacturingSystemElement_Impl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__8"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group__8__Impl"
    // InternalMyDsl.g:2180:1: rule__ManufacturingSystemElement_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2184:1: ( ( '}' ) )
            // InternalMyDsl.g:2185:1: ( '}' )
            {
            // InternalMyDsl.g:2185:1: ( '}' )
            // InternalMyDsl.g:2186:2: '}'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group__8__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__0"
    // InternalMyDsl.g:2196:1: rule__ManufacturingSystemElement_Impl__Group_4__0 : rule__ManufacturingSystemElement_Impl__Group_4__0__Impl rule__ManufacturingSystemElement_Impl__Group_4__1 ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( rule__ManufacturingSystemElement_Impl__Group_4__0__Impl rule__ManufacturingSystemElement_Impl__Group_4__1 )
            // InternalMyDsl.g:2201:2: rule__ManufacturingSystemElement_Impl__Group_4__0__Impl rule__ManufacturingSystemElement_Impl__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__ManufacturingSystemElement_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__0"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__0__Impl"
    // InternalMyDsl.g:2208:1: rule__ManufacturingSystemElement_Impl__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( ( 'transition' ) )
            // InternalMyDsl.g:2213:1: ( 'transition' )
            {
            // InternalMyDsl.g:2213:1: ( 'transition' )
            // InternalMyDsl.g:2214:2: 'transition'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__1"
    // InternalMyDsl.g:2223:1: rule__ManufacturingSystemElement_Impl__Group_4__1 : rule__ManufacturingSystemElement_Impl__Group_4__1__Impl rule__ManufacturingSystemElement_Impl__Group_4__2 ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( rule__ManufacturingSystemElement_Impl__Group_4__1__Impl rule__ManufacturingSystemElement_Impl__Group_4__2 )
            // InternalMyDsl.g:2228:2: rule__ManufacturingSystemElement_Impl__Group_4__1__Impl rule__ManufacturingSystemElement_Impl__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystemElement_Impl__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__1__Impl"
    // InternalMyDsl.g:2235:1: rule__ManufacturingSystemElement_Impl__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( ( '(' ) )
            // InternalMyDsl.g:2240:1: ( '(' )
            {
            // InternalMyDsl.g:2240:1: ( '(' )
            // InternalMyDsl.g:2241:2: '('
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__2"
    // InternalMyDsl.g:2250:1: rule__ManufacturingSystemElement_Impl__Group_4__2 : rule__ManufacturingSystemElement_Impl__Group_4__2__Impl rule__ManufacturingSystemElement_Impl__Group_4__3 ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( rule__ManufacturingSystemElement_Impl__Group_4__2__Impl rule__ManufacturingSystemElement_Impl__Group_4__3 )
            // InternalMyDsl.g:2255:2: rule__ManufacturingSystemElement_Impl__Group_4__2__Impl rule__ManufacturingSystemElement_Impl__Group_4__3
            {
            pushFollow(FOLLOW_26);
            rule__ManufacturingSystemElement_Impl__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__2"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__2__Impl"
    // InternalMyDsl.g:2262:1: rule__ManufacturingSystemElement_Impl__Group_4__2__Impl : ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2 ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2 ) ) )
            // InternalMyDsl.g:2267:1: ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2 ) )
            {
            // InternalMyDsl.g:2267:1: ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2 ) )
            // InternalMyDsl.g:2268:2: ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionAssignment_4_2()); 
            // InternalMyDsl.g:2269:2: ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2 )
            // InternalMyDsl.g:2269:3: rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__2__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__3"
    // InternalMyDsl.g:2277:1: rule__ManufacturingSystemElement_Impl__Group_4__3 : rule__ManufacturingSystemElement_Impl__Group_4__3__Impl rule__ManufacturingSystemElement_Impl__Group_4__4 ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2281:1: ( rule__ManufacturingSystemElement_Impl__Group_4__3__Impl rule__ManufacturingSystemElement_Impl__Group_4__4 )
            // InternalMyDsl.g:2282:2: rule__ManufacturingSystemElement_Impl__Group_4__3__Impl rule__ManufacturingSystemElement_Impl__Group_4__4
            {
            pushFollow(FOLLOW_26);
            rule__ManufacturingSystemElement_Impl__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__3"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__3__Impl"
    // InternalMyDsl.g:2289:1: rule__ManufacturingSystemElement_Impl__Group_4__3__Impl : ( ( rule__ManufacturingSystemElement_Impl__Group_4_3__0 )* ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( ( ( rule__ManufacturingSystemElement_Impl__Group_4_3__0 )* ) )
            // InternalMyDsl.g:2294:1: ( ( rule__ManufacturingSystemElement_Impl__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:2294:1: ( ( rule__ManufacturingSystemElement_Impl__Group_4_3__0 )* )
            // InternalMyDsl.g:2295:2: ( rule__ManufacturingSystemElement_Impl__Group_4_3__0 )*
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_4_3()); 
            // InternalMyDsl.g:2296:2: ( rule__ManufacturingSystemElement_Impl__Group_4_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2296:3: rule__ManufacturingSystemElement_Impl__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ManufacturingSystemElement_Impl__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__3__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__4"
    // InternalMyDsl.g:2304:1: rule__ManufacturingSystemElement_Impl__Group_4__4 : rule__ManufacturingSystemElement_Impl__Group_4__4__Impl ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( rule__ManufacturingSystemElement_Impl__Group_4__4__Impl )
            // InternalMyDsl.g:2309:2: rule__ManufacturingSystemElement_Impl__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__4"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4__4__Impl"
    // InternalMyDsl.g:2315:1: rule__ManufacturingSystemElement_Impl__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2319:1: ( ( ')' ) )
            // InternalMyDsl.g:2320:1: ( ')' )
            {
            // InternalMyDsl.g:2320:1: ( ')' )
            // InternalMyDsl.g:2321:2: ')'
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getRightParenthesisKeyword_4_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4__4__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4_3__0"
    // InternalMyDsl.g:2331:1: rule__ManufacturingSystemElement_Impl__Group_4_3__0 : rule__ManufacturingSystemElement_Impl__Group_4_3__0__Impl rule__ManufacturingSystemElement_Impl__Group_4_3__1 ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2335:1: ( rule__ManufacturingSystemElement_Impl__Group_4_3__0__Impl rule__ManufacturingSystemElement_Impl__Group_4_3__1 )
            // InternalMyDsl.g:2336:2: rule__ManufacturingSystemElement_Impl__Group_4_3__0__Impl rule__ManufacturingSystemElement_Impl__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingSystemElement_Impl__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4_3__0"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4_3__0__Impl"
    // InternalMyDsl.g:2343:1: rule__ManufacturingSystemElement_Impl__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( ( ',' ) )
            // InternalMyDsl.g:2348:1: ( ',' )
            {
            // InternalMyDsl.g:2348:1: ( ',' )
            // InternalMyDsl.g:2349:2: ','
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getCommaKeyword_4_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4_3__0__Impl"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4_3__1"
    // InternalMyDsl.g:2358:1: rule__ManufacturingSystemElement_Impl__Group_4_3__1 : rule__ManufacturingSystemElement_Impl__Group_4_3__1__Impl ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( rule__ManufacturingSystemElement_Impl__Group_4_3__1__Impl )
            // InternalMyDsl.g:2363:2: rule__ManufacturingSystemElement_Impl__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4_3__1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__Group_4_3__1__Impl"
    // InternalMyDsl.g:2369:1: rule__ManufacturingSystemElement_Impl__Group_4_3__1__Impl : ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1 ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:2374:1: ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:2374:1: ( ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1 ) )
            // InternalMyDsl.g:2375:2: ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1 )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionAssignment_4_3_1()); 
            // InternalMyDsl.g:2376:2: ( rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1 )
            // InternalMyDsl.g:2376:3: rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__Group_4_3__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group__0"
    // InternalMyDsl.g:2385:1: rule__StoragePoint__Group__0 : rule__StoragePoint__Group__0__Impl rule__StoragePoint__Group__1 ;
    public final void rule__StoragePoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( rule__StoragePoint__Group__0__Impl rule__StoragePoint__Group__1 )
            // InternalMyDsl.g:2390:2: rule__StoragePoint__Group__0__Impl rule__StoragePoint__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StoragePoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__0"


    // $ANTLR start "rule__StoragePoint__Group__0__Impl"
    // InternalMyDsl.g:2397:1: rule__StoragePoint__Group__0__Impl : ( 'StoragePoint' ) ;
    public final void rule__StoragePoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( ( 'StoragePoint' ) )
            // InternalMyDsl.g:2402:1: ( 'StoragePoint' )
            {
            // InternalMyDsl.g:2402:1: ( 'StoragePoint' )
            // InternalMyDsl.g:2403:2: 'StoragePoint'
            {
             before(grammarAccess.getStoragePointAccess().getStoragePointKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getStoragePointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group__1"
    // InternalMyDsl.g:2412:1: rule__StoragePoint__Group__1 : rule__StoragePoint__Group__1__Impl rule__StoragePoint__Group__2 ;
    public final void rule__StoragePoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2416:1: ( rule__StoragePoint__Group__1__Impl rule__StoragePoint__Group__2 )
            // InternalMyDsl.g:2417:2: rule__StoragePoint__Group__1__Impl rule__StoragePoint__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StoragePoint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__1"


    // $ANTLR start "rule__StoragePoint__Group__1__Impl"
    // InternalMyDsl.g:2424:1: rule__StoragePoint__Group__1__Impl : ( ( rule__StoragePoint__NameAssignment_1 ) ) ;
    public final void rule__StoragePoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( ( ( rule__StoragePoint__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2429:1: ( ( rule__StoragePoint__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2429:1: ( ( rule__StoragePoint__NameAssignment_1 ) )
            // InternalMyDsl.g:2430:2: ( rule__StoragePoint__NameAssignment_1 )
            {
             before(grammarAccess.getStoragePointAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2431:2: ( rule__StoragePoint__NameAssignment_1 )
            // InternalMyDsl.g:2431:3: rule__StoragePoint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group__2"
    // InternalMyDsl.g:2439:1: rule__StoragePoint__Group__2 : rule__StoragePoint__Group__2__Impl rule__StoragePoint__Group__3 ;
    public final void rule__StoragePoint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( rule__StoragePoint__Group__2__Impl rule__StoragePoint__Group__3 )
            // InternalMyDsl.g:2444:2: rule__StoragePoint__Group__2__Impl rule__StoragePoint__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StoragePoint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__2"


    // $ANTLR start "rule__StoragePoint__Group__2__Impl"
    // InternalMyDsl.g:2451:1: rule__StoragePoint__Group__2__Impl : ( '{' ) ;
    public final void rule__StoragePoint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( ( '{' ) )
            // InternalMyDsl.g:2456:1: ( '{' )
            {
            // InternalMyDsl.g:2456:1: ( '{' )
            // InternalMyDsl.g:2457:2: '{'
            {
             before(grammarAccess.getStoragePointAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__2__Impl"


    // $ANTLR start "rule__StoragePoint__Group__3"
    // InternalMyDsl.g:2466:1: rule__StoragePoint__Group__3 : rule__StoragePoint__Group__3__Impl rule__StoragePoint__Group__4 ;
    public final void rule__StoragePoint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2470:1: ( rule__StoragePoint__Group__3__Impl rule__StoragePoint__Group__4 )
            // InternalMyDsl.g:2471:2: rule__StoragePoint__Group__3__Impl rule__StoragePoint__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__StoragePoint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__3"


    // $ANTLR start "rule__StoragePoint__Group__3__Impl"
    // InternalMyDsl.g:2478:1: rule__StoragePoint__Group__3__Impl : ( 'set' ) ;
    public final void rule__StoragePoint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( ( 'set' ) )
            // InternalMyDsl.g:2483:1: ( 'set' )
            {
            // InternalMyDsl.g:2483:1: ( 'set' )
            // InternalMyDsl.g:2484:2: 'set'
            {
             before(grammarAccess.getStoragePointAccess().getSetKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getSetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__3__Impl"


    // $ANTLR start "rule__StoragePoint__Group__4"
    // InternalMyDsl.g:2493:1: rule__StoragePoint__Group__4 : rule__StoragePoint__Group__4__Impl rule__StoragePoint__Group__5 ;
    public final void rule__StoragePoint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( rule__StoragePoint__Group__4__Impl rule__StoragePoint__Group__5 )
            // InternalMyDsl.g:2498:2: rule__StoragePoint__Group__4__Impl rule__StoragePoint__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__StoragePoint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__4"


    // $ANTLR start "rule__StoragePoint__Group__4__Impl"
    // InternalMyDsl.g:2505:1: rule__StoragePoint__Group__4__Impl : ( 'responsible' ) ;
    public final void rule__StoragePoint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( ( 'responsible' ) )
            // InternalMyDsl.g:2510:1: ( 'responsible' )
            {
            // InternalMyDsl.g:2510:1: ( 'responsible' )
            // InternalMyDsl.g:2511:2: 'responsible'
            {
             before(grammarAccess.getStoragePointAccess().getResponsibleKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getResponsibleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__4__Impl"


    // $ANTLR start "rule__StoragePoint__Group__5"
    // InternalMyDsl.g:2520:1: rule__StoragePoint__Group__5 : rule__StoragePoint__Group__5__Impl rule__StoragePoint__Group__6 ;
    public final void rule__StoragePoint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2524:1: ( rule__StoragePoint__Group__5__Impl rule__StoragePoint__Group__6 )
            // InternalMyDsl.g:2525:2: rule__StoragePoint__Group__5__Impl rule__StoragePoint__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__StoragePoint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__5"


    // $ANTLR start "rule__StoragePoint__Group__5__Impl"
    // InternalMyDsl.g:2532:1: rule__StoragePoint__Group__5__Impl : ( ( rule__StoragePoint__ResponsibleAssignment_5 ) ) ;
    public final void rule__StoragePoint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( ( ( rule__StoragePoint__ResponsibleAssignment_5 ) ) )
            // InternalMyDsl.g:2537:1: ( ( rule__StoragePoint__ResponsibleAssignment_5 ) )
            {
            // InternalMyDsl.g:2537:1: ( ( rule__StoragePoint__ResponsibleAssignment_5 ) )
            // InternalMyDsl.g:2538:2: ( rule__StoragePoint__ResponsibleAssignment_5 )
            {
             before(grammarAccess.getStoragePointAccess().getResponsibleAssignment_5()); 
            // InternalMyDsl.g:2539:2: ( rule__StoragePoint__ResponsibleAssignment_5 )
            // InternalMyDsl.g:2539:3: rule__StoragePoint__ResponsibleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__ResponsibleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getResponsibleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__5__Impl"


    // $ANTLR start "rule__StoragePoint__Group__6"
    // InternalMyDsl.g:2547:1: rule__StoragePoint__Group__6 : rule__StoragePoint__Group__6__Impl rule__StoragePoint__Group__7 ;
    public final void rule__StoragePoint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( rule__StoragePoint__Group__6__Impl rule__StoragePoint__Group__7 )
            // InternalMyDsl.g:2552:2: rule__StoragePoint__Group__6__Impl rule__StoragePoint__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__StoragePoint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__6"


    // $ANTLR start "rule__StoragePoint__Group__6__Impl"
    // InternalMyDsl.g:2559:1: rule__StoragePoint__Group__6__Impl : ( ( rule__StoragePoint__Group_6__0 )? ) ;
    public final void rule__StoragePoint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( ( ( rule__StoragePoint__Group_6__0 )? ) )
            // InternalMyDsl.g:2564:1: ( ( rule__StoragePoint__Group_6__0 )? )
            {
            // InternalMyDsl.g:2564:1: ( ( rule__StoragePoint__Group_6__0 )? )
            // InternalMyDsl.g:2565:2: ( rule__StoragePoint__Group_6__0 )?
            {
             before(grammarAccess.getStoragePointAccess().getGroup_6()); 
            // InternalMyDsl.g:2566:2: ( rule__StoragePoint__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2566:3: rule__StoragePoint__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StoragePoint__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoragePointAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__6__Impl"


    // $ANTLR start "rule__StoragePoint__Group__7"
    // InternalMyDsl.g:2574:1: rule__StoragePoint__Group__7 : rule__StoragePoint__Group__7__Impl rule__StoragePoint__Group__8 ;
    public final void rule__StoragePoint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2578:1: ( rule__StoragePoint__Group__7__Impl rule__StoragePoint__Group__8 )
            // InternalMyDsl.g:2579:2: rule__StoragePoint__Group__7__Impl rule__StoragePoint__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__StoragePoint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__7"


    // $ANTLR start "rule__StoragePoint__Group__7__Impl"
    // InternalMyDsl.g:2586:1: rule__StoragePoint__Group__7__Impl : ( ( rule__StoragePoint__Group_7__0 )? ) ;
    public final void rule__StoragePoint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( ( ( rule__StoragePoint__Group_7__0 )? ) )
            // InternalMyDsl.g:2591:1: ( ( rule__StoragePoint__Group_7__0 )? )
            {
            // InternalMyDsl.g:2591:1: ( ( rule__StoragePoint__Group_7__0 )? )
            // InternalMyDsl.g:2592:2: ( rule__StoragePoint__Group_7__0 )?
            {
             before(grammarAccess.getStoragePointAccess().getGroup_7()); 
            // InternalMyDsl.g:2593:2: ( rule__StoragePoint__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2593:3: rule__StoragePoint__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StoragePoint__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoragePointAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__7__Impl"


    // $ANTLR start "rule__StoragePoint__Group__8"
    // InternalMyDsl.g:2601:1: rule__StoragePoint__Group__8 : rule__StoragePoint__Group__8__Impl ;
    public final void rule__StoragePoint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2605:1: ( rule__StoragePoint__Group__8__Impl )
            // InternalMyDsl.g:2606:2: rule__StoragePoint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__8"


    // $ANTLR start "rule__StoragePoint__Group__8__Impl"
    // InternalMyDsl.g:2612:1: rule__StoragePoint__Group__8__Impl : ( '}' ) ;
    public final void rule__StoragePoint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2616:1: ( ( '}' ) )
            // InternalMyDsl.g:2617:1: ( '}' )
            {
            // InternalMyDsl.g:2617:1: ( '}' )
            // InternalMyDsl.g:2618:2: '}'
            {
             before(grammarAccess.getStoragePointAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group__8__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6__0"
    // InternalMyDsl.g:2628:1: rule__StoragePoint__Group_6__0 : rule__StoragePoint__Group_6__0__Impl rule__StoragePoint__Group_6__1 ;
    public final void rule__StoragePoint__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2632:1: ( rule__StoragePoint__Group_6__0__Impl rule__StoragePoint__Group_6__1 )
            // InternalMyDsl.g:2633:2: rule__StoragePoint__Group_6__0__Impl rule__StoragePoint__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__StoragePoint__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__0"


    // $ANTLR start "rule__StoragePoint__Group_6__0__Impl"
    // InternalMyDsl.g:2640:1: rule__StoragePoint__Group_6__0__Impl : ( 'stores' ) ;
    public final void rule__StoragePoint__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( ( 'stores' ) )
            // InternalMyDsl.g:2645:1: ( 'stores' )
            {
            // InternalMyDsl.g:2645:1: ( 'stores' )
            // InternalMyDsl.g:2646:2: 'stores'
            {
             before(grammarAccess.getStoragePointAccess().getStoresKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getStoresKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6__1"
    // InternalMyDsl.g:2655:1: rule__StoragePoint__Group_6__1 : rule__StoragePoint__Group_6__1__Impl rule__StoragePoint__Group_6__2 ;
    public final void rule__StoragePoint__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( rule__StoragePoint__Group_6__1__Impl rule__StoragePoint__Group_6__2 )
            // InternalMyDsl.g:2660:2: rule__StoragePoint__Group_6__1__Impl rule__StoragePoint__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__StoragePoint__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__1"


    // $ANTLR start "rule__StoragePoint__Group_6__1__Impl"
    // InternalMyDsl.g:2667:1: rule__StoragePoint__Group_6__1__Impl : ( ( rule__StoragePoint__StoresAssignment_6_1 ) ) ;
    public final void rule__StoragePoint__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( ( ( rule__StoragePoint__StoresAssignment_6_1 ) ) )
            // InternalMyDsl.g:2672:1: ( ( rule__StoragePoint__StoresAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2672:1: ( ( rule__StoragePoint__StoresAssignment_6_1 ) )
            // InternalMyDsl.g:2673:2: ( rule__StoragePoint__StoresAssignment_6_1 )
            {
             before(grammarAccess.getStoragePointAccess().getStoresAssignment_6_1()); 
            // InternalMyDsl.g:2674:2: ( rule__StoragePoint__StoresAssignment_6_1 )
            // InternalMyDsl.g:2674:3: rule__StoragePoint__StoresAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__StoresAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getStoresAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6__2"
    // InternalMyDsl.g:2682:1: rule__StoragePoint__Group_6__2 : rule__StoragePoint__Group_6__2__Impl ;
    public final void rule__StoragePoint__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( rule__StoragePoint__Group_6__2__Impl )
            // InternalMyDsl.g:2687:2: rule__StoragePoint__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__2"


    // $ANTLR start "rule__StoragePoint__Group_6__2__Impl"
    // InternalMyDsl.g:2693:1: rule__StoragePoint__Group_6__2__Impl : ( ( rule__StoragePoint__Group_6_2__0 )* ) ;
    public final void rule__StoragePoint__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2697:1: ( ( ( rule__StoragePoint__Group_6_2__0 )* ) )
            // InternalMyDsl.g:2698:1: ( ( rule__StoragePoint__Group_6_2__0 )* )
            {
            // InternalMyDsl.g:2698:1: ( ( rule__StoragePoint__Group_6_2__0 )* )
            // InternalMyDsl.g:2699:2: ( rule__StoragePoint__Group_6_2__0 )*
            {
             before(grammarAccess.getStoragePointAccess().getGroup_6_2()); 
            // InternalMyDsl.g:2700:2: ( rule__StoragePoint__Group_6_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2700:3: rule__StoragePoint__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__StoragePoint__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStoragePointAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6__2__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6_2__0"
    // InternalMyDsl.g:2709:1: rule__StoragePoint__Group_6_2__0 : rule__StoragePoint__Group_6_2__0__Impl rule__StoragePoint__Group_6_2__1 ;
    public final void rule__StoragePoint__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( rule__StoragePoint__Group_6_2__0__Impl rule__StoragePoint__Group_6_2__1 )
            // InternalMyDsl.g:2714:2: rule__StoragePoint__Group_6_2__0__Impl rule__StoragePoint__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__StoragePoint__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6_2__0"


    // $ANTLR start "rule__StoragePoint__Group_6_2__0__Impl"
    // InternalMyDsl.g:2721:1: rule__StoragePoint__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__StoragePoint__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( ( ',' ) )
            // InternalMyDsl.g:2726:1: ( ',' )
            {
            // InternalMyDsl.g:2726:1: ( ',' )
            // InternalMyDsl.g:2727:2: ','
            {
             before(grammarAccess.getStoragePointAccess().getCommaKeyword_6_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6_2__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group_6_2__1"
    // InternalMyDsl.g:2736:1: rule__StoragePoint__Group_6_2__1 : rule__StoragePoint__Group_6_2__1__Impl ;
    public final void rule__StoragePoint__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2740:1: ( rule__StoragePoint__Group_6_2__1__Impl )
            // InternalMyDsl.g:2741:2: rule__StoragePoint__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6_2__1"


    // $ANTLR start "rule__StoragePoint__Group_6_2__1__Impl"
    // InternalMyDsl.g:2747:1: rule__StoragePoint__Group_6_2__1__Impl : ( ( rule__StoragePoint__StoresAssignment_6_2_1 ) ) ;
    public final void rule__StoragePoint__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2751:1: ( ( ( rule__StoragePoint__StoresAssignment_6_2_1 ) ) )
            // InternalMyDsl.g:2752:1: ( ( rule__StoragePoint__StoresAssignment_6_2_1 ) )
            {
            // InternalMyDsl.g:2752:1: ( ( rule__StoragePoint__StoresAssignment_6_2_1 ) )
            // InternalMyDsl.g:2753:2: ( rule__StoragePoint__StoresAssignment_6_2_1 )
            {
             before(grammarAccess.getStoragePointAccess().getStoresAssignment_6_2_1()); 
            // InternalMyDsl.g:2754:2: ( rule__StoragePoint__StoresAssignment_6_2_1 )
            // InternalMyDsl.g:2754:3: rule__StoragePoint__StoresAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__StoresAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getStoresAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_6_2__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group_7__0"
    // InternalMyDsl.g:2763:1: rule__StoragePoint__Group_7__0 : rule__StoragePoint__Group_7__0__Impl rule__StoragePoint__Group_7__1 ;
    public final void rule__StoragePoint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2767:1: ( rule__StoragePoint__Group_7__0__Impl rule__StoragePoint__Group_7__1 )
            // InternalMyDsl.g:2768:2: rule__StoragePoint__Group_7__0__Impl rule__StoragePoint__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__StoragePoint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7__0"


    // $ANTLR start "rule__StoragePoint__Group_7__0__Impl"
    // InternalMyDsl.g:2775:1: rule__StoragePoint__Group_7__0__Impl : ( 'transition' ) ;
    public final void rule__StoragePoint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( ( 'transition' ) )
            // InternalMyDsl.g:2780:1: ( 'transition' )
            {
            // InternalMyDsl.g:2780:1: ( 'transition' )
            // InternalMyDsl.g:2781:2: 'transition'
            {
             before(grammarAccess.getStoragePointAccess().getTransitionKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getTransitionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group_7__1"
    // InternalMyDsl.g:2790:1: rule__StoragePoint__Group_7__1 : rule__StoragePoint__Group_7__1__Impl rule__StoragePoint__Group_7__2 ;
    public final void rule__StoragePoint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( rule__StoragePoint__Group_7__1__Impl rule__StoragePoint__Group_7__2 )
            // InternalMyDsl.g:2795:2: rule__StoragePoint__Group_7__1__Impl rule__StoragePoint__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__StoragePoint__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7__1"


    // $ANTLR start "rule__StoragePoint__Group_7__1__Impl"
    // InternalMyDsl.g:2802:1: rule__StoragePoint__Group_7__1__Impl : ( ( rule__StoragePoint__TransitionAssignment_7_1 ) ) ;
    public final void rule__StoragePoint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( ( ( rule__StoragePoint__TransitionAssignment_7_1 ) ) )
            // InternalMyDsl.g:2807:1: ( ( rule__StoragePoint__TransitionAssignment_7_1 ) )
            {
            // InternalMyDsl.g:2807:1: ( ( rule__StoragePoint__TransitionAssignment_7_1 ) )
            // InternalMyDsl.g:2808:2: ( rule__StoragePoint__TransitionAssignment_7_1 )
            {
             before(grammarAccess.getStoragePointAccess().getTransitionAssignment_7_1()); 
            // InternalMyDsl.g:2809:2: ( rule__StoragePoint__TransitionAssignment_7_1 )
            // InternalMyDsl.g:2809:3: rule__StoragePoint__TransitionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__TransitionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getTransitionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7__1__Impl"


    // $ANTLR start "rule__StoragePoint__Group_7__2"
    // InternalMyDsl.g:2817:1: rule__StoragePoint__Group_7__2 : rule__StoragePoint__Group_7__2__Impl ;
    public final void rule__StoragePoint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2821:1: ( rule__StoragePoint__Group_7__2__Impl )
            // InternalMyDsl.g:2822:2: rule__StoragePoint__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7__2"


    // $ANTLR start "rule__StoragePoint__Group_7__2__Impl"
    // InternalMyDsl.g:2828:1: rule__StoragePoint__Group_7__2__Impl : ( ( rule__StoragePoint__Group_7_2__0 )* ) ;
    public final void rule__StoragePoint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2832:1: ( ( ( rule__StoragePoint__Group_7_2__0 )* ) )
            // InternalMyDsl.g:2833:1: ( ( rule__StoragePoint__Group_7_2__0 )* )
            {
            // InternalMyDsl.g:2833:1: ( ( rule__StoragePoint__Group_7_2__0 )* )
            // InternalMyDsl.g:2834:2: ( rule__StoragePoint__Group_7_2__0 )*
            {
             before(grammarAccess.getStoragePointAccess().getGroup_7_2()); 
            // InternalMyDsl.g:2835:2: ( rule__StoragePoint__Group_7_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2835:3: rule__StoragePoint__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__StoragePoint__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStoragePointAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7__2__Impl"


    // $ANTLR start "rule__StoragePoint__Group_7_2__0"
    // InternalMyDsl.g:2844:1: rule__StoragePoint__Group_7_2__0 : rule__StoragePoint__Group_7_2__0__Impl rule__StoragePoint__Group_7_2__1 ;
    public final void rule__StoragePoint__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( rule__StoragePoint__Group_7_2__0__Impl rule__StoragePoint__Group_7_2__1 )
            // InternalMyDsl.g:2849:2: rule__StoragePoint__Group_7_2__0__Impl rule__StoragePoint__Group_7_2__1
            {
            pushFollow(FOLLOW_4);
            rule__StoragePoint__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7_2__0"


    // $ANTLR start "rule__StoragePoint__Group_7_2__0__Impl"
    // InternalMyDsl.g:2856:1: rule__StoragePoint__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__StoragePoint__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( ( ',' ) )
            // InternalMyDsl.g:2861:1: ( ',' )
            {
            // InternalMyDsl.g:2861:1: ( ',' )
            // InternalMyDsl.g:2862:2: ','
            {
             before(grammarAccess.getStoragePointAccess().getCommaKeyword_7_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStoragePointAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7_2__0__Impl"


    // $ANTLR start "rule__StoragePoint__Group_7_2__1"
    // InternalMyDsl.g:2871:1: rule__StoragePoint__Group_7_2__1 : rule__StoragePoint__Group_7_2__1__Impl ;
    public final void rule__StoragePoint__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( rule__StoragePoint__Group_7_2__1__Impl )
            // InternalMyDsl.g:2876:2: rule__StoragePoint__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7_2__1"


    // $ANTLR start "rule__StoragePoint__Group_7_2__1__Impl"
    // InternalMyDsl.g:2882:1: rule__StoragePoint__Group_7_2__1__Impl : ( ( rule__StoragePoint__TransitionAssignment_7_2_1 ) ) ;
    public final void rule__StoragePoint__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2886:1: ( ( ( rule__StoragePoint__TransitionAssignment_7_2_1 ) ) )
            // InternalMyDsl.g:2887:1: ( ( rule__StoragePoint__TransitionAssignment_7_2_1 ) )
            {
            // InternalMyDsl.g:2887:1: ( ( rule__StoragePoint__TransitionAssignment_7_2_1 ) )
            // InternalMyDsl.g:2888:2: ( rule__StoragePoint__TransitionAssignment_7_2_1 )
            {
             before(grammarAccess.getStoragePointAccess().getTransitionAssignment_7_2_1()); 
            // InternalMyDsl.g:2889:2: ( rule__StoragePoint__TransitionAssignment_7_2_1 )
            // InternalMyDsl.g:2889:3: rule__StoragePoint__TransitionAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StoragePoint__TransitionAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStoragePointAccess().getTransitionAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__Group_7_2__1__Impl"


    // $ANTLR start "rule__WorkPieceType__Group__0"
    // InternalMyDsl.g:2898:1: rule__WorkPieceType__Group__0 : rule__WorkPieceType__Group__0__Impl rule__WorkPieceType__Group__1 ;
    public final void rule__WorkPieceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2902:1: ( rule__WorkPieceType__Group__0__Impl rule__WorkPieceType__Group__1 )
            // InternalMyDsl.g:2903:2: rule__WorkPieceType__Group__0__Impl rule__WorkPieceType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__WorkPieceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceType__Group__0"


    // $ANTLR start "rule__WorkPieceType__Group__0__Impl"
    // InternalMyDsl.g:2910:1: rule__WorkPieceType__Group__0__Impl : ( () ) ;
    public final void rule__WorkPieceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( ( () ) )
            // InternalMyDsl.g:2915:1: ( () )
            {
            // InternalMyDsl.g:2915:1: ( () )
            // InternalMyDsl.g:2916:2: ()
            {
             before(grammarAccess.getWorkPieceTypeAccess().getWorkPieceTypeAction_0()); 
            // InternalMyDsl.g:2917:2: ()
            // InternalMyDsl.g:2917:3: 
            {
            }

             after(grammarAccess.getWorkPieceTypeAccess().getWorkPieceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceType__Group__0__Impl"


    // $ANTLR start "rule__WorkPieceType__Group__1"
    // InternalMyDsl.g:2925:1: rule__WorkPieceType__Group__1 : rule__WorkPieceType__Group__1__Impl ;
    public final void rule__WorkPieceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( rule__WorkPieceType__Group__1__Impl )
            // InternalMyDsl.g:2930:2: rule__WorkPieceType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceType__Group__1"


    // $ANTLR start "rule__WorkPieceType__Group__1__Impl"
    // InternalMyDsl.g:2936:1: rule__WorkPieceType__Group__1__Impl : ( ( rule__WorkPieceType__NameAssignment_1 ) ) ;
    public final void rule__WorkPieceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2940:1: ( ( ( rule__WorkPieceType__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2941:1: ( ( rule__WorkPieceType__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2941:1: ( ( rule__WorkPieceType__NameAssignment_1 ) )
            // InternalMyDsl.g:2942:2: ( rule__WorkPieceType__NameAssignment_1 )
            {
             before(grammarAccess.getWorkPieceTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2943:2: ( rule__WorkPieceType__NameAssignment_1 )
            // InternalMyDsl.g:2943:3: rule__WorkPieceType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceType__Group__1__Impl"


    // $ANTLR start "rule__WorkPiece__Group__0"
    // InternalMyDsl.g:2952:1: rule__WorkPiece__Group__0 : rule__WorkPiece__Group__0__Impl rule__WorkPiece__Group__1 ;
    public final void rule__WorkPiece__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2956:1: ( rule__WorkPiece__Group__0__Impl rule__WorkPiece__Group__1 )
            // InternalMyDsl.g:2957:2: rule__WorkPiece__Group__0__Impl rule__WorkPiece__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__WorkPiece__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__0"


    // $ANTLR start "rule__WorkPiece__Group__0__Impl"
    // InternalMyDsl.g:2964:1: rule__WorkPiece__Group__0__Impl : ( 'WorkPiece' ) ;
    public final void rule__WorkPiece__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2968:1: ( ( 'WorkPiece' ) )
            // InternalMyDsl.g:2969:1: ( 'WorkPiece' )
            {
            // InternalMyDsl.g:2969:1: ( 'WorkPiece' )
            // InternalMyDsl.g:2970:2: 'WorkPiece'
            {
             before(grammarAccess.getWorkPieceAccess().getWorkPieceKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getWorkPieceAccess().getWorkPieceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__0__Impl"


    // $ANTLR start "rule__WorkPiece__Group__1"
    // InternalMyDsl.g:2979:1: rule__WorkPiece__Group__1 : rule__WorkPiece__Group__1__Impl rule__WorkPiece__Group__2 ;
    public final void rule__WorkPiece__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2983:1: ( rule__WorkPiece__Group__1__Impl rule__WorkPiece__Group__2 )
            // InternalMyDsl.g:2984:2: rule__WorkPiece__Group__1__Impl rule__WorkPiece__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__WorkPiece__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__1"


    // $ANTLR start "rule__WorkPiece__Group__1__Impl"
    // InternalMyDsl.g:2991:1: rule__WorkPiece__Group__1__Impl : ( '{' ) ;
    public final void rule__WorkPiece__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( ( '{' ) )
            // InternalMyDsl.g:2996:1: ( '{' )
            {
            // InternalMyDsl.g:2996:1: ( '{' )
            // InternalMyDsl.g:2997:2: '{'
            {
             before(grammarAccess.getWorkPieceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWorkPieceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__1__Impl"


    // $ANTLR start "rule__WorkPiece__Group__2"
    // InternalMyDsl.g:3006:1: rule__WorkPiece__Group__2 : rule__WorkPiece__Group__2__Impl rule__WorkPiece__Group__3 ;
    public final void rule__WorkPiece__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3010:1: ( rule__WorkPiece__Group__2__Impl rule__WorkPiece__Group__3 )
            // InternalMyDsl.g:3011:2: rule__WorkPiece__Group__2__Impl rule__WorkPiece__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__WorkPiece__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__2"


    // $ANTLR start "rule__WorkPiece__Group__2__Impl"
    // InternalMyDsl.g:3018:1: rule__WorkPiece__Group__2__Impl : ( 'of' ) ;
    public final void rule__WorkPiece__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( ( 'of' ) )
            // InternalMyDsl.g:3023:1: ( 'of' )
            {
            // InternalMyDsl.g:3023:1: ( 'of' )
            // InternalMyDsl.g:3024:2: 'of'
            {
             before(grammarAccess.getWorkPieceAccess().getOfKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getWorkPieceAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__2__Impl"


    // $ANTLR start "rule__WorkPiece__Group__3"
    // InternalMyDsl.g:3033:1: rule__WorkPiece__Group__3 : rule__WorkPiece__Group__3__Impl rule__WorkPiece__Group__4 ;
    public final void rule__WorkPiece__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( rule__WorkPiece__Group__3__Impl rule__WorkPiece__Group__4 )
            // InternalMyDsl.g:3038:2: rule__WorkPiece__Group__3__Impl rule__WorkPiece__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__WorkPiece__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__3"


    // $ANTLR start "rule__WorkPiece__Group__3__Impl"
    // InternalMyDsl.g:3045:1: rule__WorkPiece__Group__3__Impl : ( 'type' ) ;
    public final void rule__WorkPiece__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( ( 'type' ) )
            // InternalMyDsl.g:3050:1: ( 'type' )
            {
            // InternalMyDsl.g:3050:1: ( 'type' )
            // InternalMyDsl.g:3051:2: 'type'
            {
             before(grammarAccess.getWorkPieceAccess().getTypeKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkPieceAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__3__Impl"


    // $ANTLR start "rule__WorkPiece__Group__4"
    // InternalMyDsl.g:3060:1: rule__WorkPiece__Group__4 : rule__WorkPiece__Group__4__Impl rule__WorkPiece__Group__5 ;
    public final void rule__WorkPiece__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3064:1: ( rule__WorkPiece__Group__4__Impl rule__WorkPiece__Group__5 )
            // InternalMyDsl.g:3065:2: rule__WorkPiece__Group__4__Impl rule__WorkPiece__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__WorkPiece__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__4"


    // $ANTLR start "rule__WorkPiece__Group__4__Impl"
    // InternalMyDsl.g:3072:1: rule__WorkPiece__Group__4__Impl : ( ( rule__WorkPiece__HasTypeAssignment_4 ) ) ;
    public final void rule__WorkPiece__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( ( ( rule__WorkPiece__HasTypeAssignment_4 ) ) )
            // InternalMyDsl.g:3077:1: ( ( rule__WorkPiece__HasTypeAssignment_4 ) )
            {
            // InternalMyDsl.g:3077:1: ( ( rule__WorkPiece__HasTypeAssignment_4 ) )
            // InternalMyDsl.g:3078:2: ( rule__WorkPiece__HasTypeAssignment_4 )
            {
             before(grammarAccess.getWorkPieceAccess().getHasTypeAssignment_4()); 
            // InternalMyDsl.g:3079:2: ( rule__WorkPiece__HasTypeAssignment_4 )
            // InternalMyDsl.g:3079:3: rule__WorkPiece__HasTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WorkPiece__HasTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceAccess().getHasTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__4__Impl"


    // $ANTLR start "rule__WorkPiece__Group__5"
    // InternalMyDsl.g:3087:1: rule__WorkPiece__Group__5 : rule__WorkPiece__Group__5__Impl ;
    public final void rule__WorkPiece__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( rule__WorkPiece__Group__5__Impl )
            // InternalMyDsl.g:3092:2: rule__WorkPiece__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkPiece__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__5"


    // $ANTLR start "rule__WorkPiece__Group__5__Impl"
    // InternalMyDsl.g:3098:1: rule__WorkPiece__Group__5__Impl : ( '}' ) ;
    public final void rule__WorkPiece__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3102:1: ( ( '}' ) )
            // InternalMyDsl.g:3103:1: ( '}' )
            {
            // InternalMyDsl.g:3103:1: ( '}' )
            // InternalMyDsl.g:3104:2: '}'
            {
             before(grammarAccess.getWorkPieceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkPieceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__Group__5__Impl"


    // $ANTLR start "rule__Responsible__Group__0"
    // InternalMyDsl.g:3114:1: rule__Responsible__Group__0 : rule__Responsible__Group__0__Impl rule__Responsible__Group__1 ;
    public final void rule__Responsible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3118:1: ( rule__Responsible__Group__0__Impl rule__Responsible__Group__1 )
            // InternalMyDsl.g:3119:2: rule__Responsible__Group__0__Impl rule__Responsible__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Responsible__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Responsible__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responsible__Group__0"


    // $ANTLR start "rule__Responsible__Group__0__Impl"
    // InternalMyDsl.g:3126:1: rule__Responsible__Group__0__Impl : ( () ) ;
    public final void rule__Responsible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( ( () ) )
            // InternalMyDsl.g:3131:1: ( () )
            {
            // InternalMyDsl.g:3131:1: ( () )
            // InternalMyDsl.g:3132:2: ()
            {
             before(grammarAccess.getResponsibleAccess().getResponsibleAction_0()); 
            // InternalMyDsl.g:3133:2: ()
            // InternalMyDsl.g:3133:3: 
            {
            }

             after(grammarAccess.getResponsibleAccess().getResponsibleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responsible__Group__0__Impl"


    // $ANTLR start "rule__Responsible__Group__1"
    // InternalMyDsl.g:3141:1: rule__Responsible__Group__1 : rule__Responsible__Group__1__Impl ;
    public final void rule__Responsible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3145:1: ( rule__Responsible__Group__1__Impl )
            // InternalMyDsl.g:3146:2: rule__Responsible__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Responsible__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responsible__Group__1"


    // $ANTLR start "rule__Responsible__Group__1__Impl"
    // InternalMyDsl.g:3152:1: rule__Responsible__Group__1__Impl : ( ( rule__Responsible__NameAssignment_1 ) ) ;
    public final void rule__Responsible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3156:1: ( ( ( rule__Responsible__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3157:1: ( ( rule__Responsible__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3157:1: ( ( rule__Responsible__NameAssignment_1 ) )
            // InternalMyDsl.g:3158:2: ( rule__Responsible__NameAssignment_1 )
            {
             before(grammarAccess.getResponsibleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3159:2: ( rule__Responsible__NameAssignment_1 )
            // InternalMyDsl.g:3159:3: rule__Responsible__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Responsible__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResponsibleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responsible__Group__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__0"
    // InternalMyDsl.g:3168:1: rule__ManufacturingStep__Group__0 : rule__ManufacturingStep__Group__0__Impl rule__ManufacturingStep__Group__1 ;
    public final void rule__ManufacturingStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3172:1: ( rule__ManufacturingStep__Group__0__Impl rule__ManufacturingStep__Group__1 )
            // InternalMyDsl.g:3173:2: rule__ManufacturingStep__Group__0__Impl rule__ManufacturingStep__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__0"


    // $ANTLR start "rule__ManufacturingStep__Group__0__Impl"
    // InternalMyDsl.g:3180:1: rule__ManufacturingStep__Group__0__Impl : ( 'ManufacturingStep' ) ;
    public final void rule__ManufacturingStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( ( 'ManufacturingStep' ) )
            // InternalMyDsl.g:3185:1: ( 'ManufacturingStep' )
            {
            // InternalMyDsl.g:3185:1: ( 'ManufacturingStep' )
            // InternalMyDsl.g:3186:2: 'ManufacturingStep'
            {
             before(grammarAccess.getManufacturingStepAccess().getManufacturingStepKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getManufacturingStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__1"
    // InternalMyDsl.g:3195:1: rule__ManufacturingStep__Group__1 : rule__ManufacturingStep__Group__1__Impl rule__ManufacturingStep__Group__2 ;
    public final void rule__ManufacturingStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3199:1: ( rule__ManufacturingStep__Group__1__Impl rule__ManufacturingStep__Group__2 )
            // InternalMyDsl.g:3200:2: rule__ManufacturingStep__Group__1__Impl rule__ManufacturingStep__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ManufacturingStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__1"


    // $ANTLR start "rule__ManufacturingStep__Group__1__Impl"
    // InternalMyDsl.g:3207:1: rule__ManufacturingStep__Group__1__Impl : ( ( rule__ManufacturingStep__NameAssignment_1 ) ) ;
    public final void rule__ManufacturingStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( ( ( rule__ManufacturingStep__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3212:1: ( ( rule__ManufacturingStep__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3212:1: ( ( rule__ManufacturingStep__NameAssignment_1 ) )
            // InternalMyDsl.g:3213:2: ( rule__ManufacturingStep__NameAssignment_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3214:2: ( rule__ManufacturingStep__NameAssignment_1 )
            // InternalMyDsl.g:3214:3: rule__ManufacturingStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__2"
    // InternalMyDsl.g:3222:1: rule__ManufacturingStep__Group__2 : rule__ManufacturingStep__Group__2__Impl rule__ManufacturingStep__Group__3 ;
    public final void rule__ManufacturingStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3226:1: ( rule__ManufacturingStep__Group__2__Impl rule__ManufacturingStep__Group__3 )
            // InternalMyDsl.g:3227:2: rule__ManufacturingStep__Group__2__Impl rule__ManufacturingStep__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ManufacturingStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__2"


    // $ANTLR start "rule__ManufacturingStep__Group__2__Impl"
    // InternalMyDsl.g:3234:1: rule__ManufacturingStep__Group__2__Impl : ( '{' ) ;
    public final void rule__ManufacturingStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3238:1: ( ( '{' ) )
            // InternalMyDsl.g:3239:1: ( '{' )
            {
            // InternalMyDsl.g:3239:1: ( '{' )
            // InternalMyDsl.g:3240:2: '{'
            {
             before(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__2__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__3"
    // InternalMyDsl.g:3249:1: rule__ManufacturingStep__Group__3 : rule__ManufacturingStep__Group__3__Impl rule__ManufacturingStep__Group__4 ;
    public final void rule__ManufacturingStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3253:1: ( rule__ManufacturingStep__Group__3__Impl rule__ManufacturingStep__Group__4 )
            // InternalMyDsl.g:3254:2: rule__ManufacturingStep__Group__3__Impl rule__ManufacturingStep__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__ManufacturingStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__3"


    // $ANTLR start "rule__ManufacturingStep__Group__3__Impl"
    // InternalMyDsl.g:3261:1: rule__ManufacturingStep__Group__3__Impl : ( 'speed' ) ;
    public final void rule__ManufacturingStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3265:1: ( ( 'speed' ) )
            // InternalMyDsl.g:3266:1: ( 'speed' )
            {
            // InternalMyDsl.g:3266:1: ( 'speed' )
            // InternalMyDsl.g:3267:2: 'speed'
            {
             before(grammarAccess.getManufacturingStepAccess().getSpeedKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getSpeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__3__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__4"
    // InternalMyDsl.g:3276:1: rule__ManufacturingStep__Group__4 : rule__ManufacturingStep__Group__4__Impl rule__ManufacturingStep__Group__5 ;
    public final void rule__ManufacturingStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3280:1: ( rule__ManufacturingStep__Group__4__Impl rule__ManufacturingStep__Group__5 )
            // InternalMyDsl.g:3281:2: rule__ManufacturingStep__Group__4__Impl rule__ManufacturingStep__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__ManufacturingStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__4"


    // $ANTLR start "rule__ManufacturingStep__Group__4__Impl"
    // InternalMyDsl.g:3288:1: rule__ManufacturingStep__Group__4__Impl : ( '=' ) ;
    public final void rule__ManufacturingStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( ( '=' ) )
            // InternalMyDsl.g:3293:1: ( '=' )
            {
            // InternalMyDsl.g:3293:1: ( '=' )
            // InternalMyDsl.g:3294:2: '='
            {
             before(grammarAccess.getManufacturingStepAccess().getEqualsSignKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__4__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__5"
    // InternalMyDsl.g:3303:1: rule__ManufacturingStep__Group__5 : rule__ManufacturingStep__Group__5__Impl rule__ManufacturingStep__Group__6 ;
    public final void rule__ManufacturingStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3307:1: ( rule__ManufacturingStep__Group__5__Impl rule__ManufacturingStep__Group__6 )
            // InternalMyDsl.g:3308:2: rule__ManufacturingStep__Group__5__Impl rule__ManufacturingStep__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__ManufacturingStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__5"


    // $ANTLR start "rule__ManufacturingStep__Group__5__Impl"
    // InternalMyDsl.g:3315:1: rule__ManufacturingStep__Group__5__Impl : ( ( rule__ManufacturingStep__SpeedAssignment_5 ) ) ;
    public final void rule__ManufacturingStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( ( ( rule__ManufacturingStep__SpeedAssignment_5 ) ) )
            // InternalMyDsl.g:3320:1: ( ( rule__ManufacturingStep__SpeedAssignment_5 ) )
            {
            // InternalMyDsl.g:3320:1: ( ( rule__ManufacturingStep__SpeedAssignment_5 ) )
            // InternalMyDsl.g:3321:2: ( rule__ManufacturingStep__SpeedAssignment_5 )
            {
             before(grammarAccess.getManufacturingStepAccess().getSpeedAssignment_5()); 
            // InternalMyDsl.g:3322:2: ( rule__ManufacturingStep__SpeedAssignment_5 )
            // InternalMyDsl.g:3322:3: rule__ManufacturingStep__SpeedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__SpeedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getSpeedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__5__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__6"
    // InternalMyDsl.g:3330:1: rule__ManufacturingStep__Group__6 : rule__ManufacturingStep__Group__6__Impl rule__ManufacturingStep__Group__7 ;
    public final void rule__ManufacturingStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3334:1: ( rule__ManufacturingStep__Group__6__Impl rule__ManufacturingStep__Group__7 )
            // InternalMyDsl.g:3335:2: rule__ManufacturingStep__Group__6__Impl rule__ManufacturingStep__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__ManufacturingStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__6"


    // $ANTLR start "rule__ManufacturingStep__Group__6__Impl"
    // InternalMyDsl.g:3342:1: rule__ManufacturingStep__Group__6__Impl : ( ( rule__ManufacturingStep__Group_6__0 )? ) ;
    public final void rule__ManufacturingStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3346:1: ( ( ( rule__ManufacturingStep__Group_6__0 )? ) )
            // InternalMyDsl.g:3347:1: ( ( rule__ManufacturingStep__Group_6__0 )? )
            {
            // InternalMyDsl.g:3347:1: ( ( rule__ManufacturingStep__Group_6__0 )? )
            // InternalMyDsl.g:3348:2: ( rule__ManufacturingStep__Group_6__0 )?
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_6()); 
            // InternalMyDsl.g:3349:2: ( rule__ManufacturingStep__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:3349:3: rule__ManufacturingStep__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ManufacturingStep__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getManufacturingStepAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__6__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__7"
    // InternalMyDsl.g:3357:1: rule__ManufacturingStep__Group__7 : rule__ManufacturingStep__Group__7__Impl rule__ManufacturingStep__Group__8 ;
    public final void rule__ManufacturingStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3361:1: ( rule__ManufacturingStep__Group__7__Impl rule__ManufacturingStep__Group__8 )
            // InternalMyDsl.g:3362:2: rule__ManufacturingStep__Group__7__Impl rule__ManufacturingStep__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__ManufacturingStep__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__7"


    // $ANTLR start "rule__ManufacturingStep__Group__7__Impl"
    // InternalMyDsl.g:3369:1: rule__ManufacturingStep__Group__7__Impl : ( 'set' ) ;
    public final void rule__ManufacturingStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3373:1: ( ( 'set' ) )
            // InternalMyDsl.g:3374:1: ( 'set' )
            {
            // InternalMyDsl.g:3374:1: ( 'set' )
            // InternalMyDsl.g:3375:2: 'set'
            {
             before(grammarAccess.getManufacturingStepAccess().getSetKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getSetKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__7__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__8"
    // InternalMyDsl.g:3384:1: rule__ManufacturingStep__Group__8 : rule__ManufacturingStep__Group__8__Impl rule__ManufacturingStep__Group__9 ;
    public final void rule__ManufacturingStep__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3388:1: ( rule__ManufacturingStep__Group__8__Impl rule__ManufacturingStep__Group__9 )
            // InternalMyDsl.g:3389:2: rule__ManufacturingStep__Group__8__Impl rule__ManufacturingStep__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingStep__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__8"


    // $ANTLR start "rule__ManufacturingStep__Group__8__Impl"
    // InternalMyDsl.g:3396:1: rule__ManufacturingStep__Group__8__Impl : ( 'responsible' ) ;
    public final void rule__ManufacturingStep__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3400:1: ( ( 'responsible' ) )
            // InternalMyDsl.g:3401:1: ( 'responsible' )
            {
            // InternalMyDsl.g:3401:1: ( 'responsible' )
            // InternalMyDsl.g:3402:2: 'responsible'
            {
             before(grammarAccess.getManufacturingStepAccess().getResponsibleKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getResponsibleKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__8__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__9"
    // InternalMyDsl.g:3411:1: rule__ManufacturingStep__Group__9 : rule__ManufacturingStep__Group__9__Impl rule__ManufacturingStep__Group__10 ;
    public final void rule__ManufacturingStep__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3415:1: ( rule__ManufacturingStep__Group__9__Impl rule__ManufacturingStep__Group__10 )
            // InternalMyDsl.g:3416:2: rule__ManufacturingStep__Group__9__Impl rule__ManufacturingStep__Group__10
            {
            pushFollow(FOLLOW_32);
            rule__ManufacturingStep__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__9"


    // $ANTLR start "rule__ManufacturingStep__Group__9__Impl"
    // InternalMyDsl.g:3423:1: rule__ManufacturingStep__Group__9__Impl : ( ( rule__ManufacturingStep__ResponsibleAssignment_9 ) ) ;
    public final void rule__ManufacturingStep__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( ( ( rule__ManufacturingStep__ResponsibleAssignment_9 ) ) )
            // InternalMyDsl.g:3428:1: ( ( rule__ManufacturingStep__ResponsibleAssignment_9 ) )
            {
            // InternalMyDsl.g:3428:1: ( ( rule__ManufacturingStep__ResponsibleAssignment_9 ) )
            // InternalMyDsl.g:3429:2: ( rule__ManufacturingStep__ResponsibleAssignment_9 )
            {
             before(grammarAccess.getManufacturingStepAccess().getResponsibleAssignment_9()); 
            // InternalMyDsl.g:3430:2: ( rule__ManufacturingStep__ResponsibleAssignment_9 )
            // InternalMyDsl.g:3430:3: rule__ManufacturingStep__ResponsibleAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__ResponsibleAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getResponsibleAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__9__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__10"
    // InternalMyDsl.g:3438:1: rule__ManufacturingStep__Group__10 : rule__ManufacturingStep__Group__10__Impl rule__ManufacturingStep__Group__11 ;
    public final void rule__ManufacturingStep__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3442:1: ( rule__ManufacturingStep__Group__10__Impl rule__ManufacturingStep__Group__11 )
            // InternalMyDsl.g:3443:2: rule__ManufacturingStep__Group__10__Impl rule__ManufacturingStep__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__ManufacturingStep__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__10"


    // $ANTLR start "rule__ManufacturingStep__Group__10__Impl"
    // InternalMyDsl.g:3450:1: rule__ManufacturingStep__Group__10__Impl : ( 'input' ) ;
    public final void rule__ManufacturingStep__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3454:1: ( ( 'input' ) )
            // InternalMyDsl.g:3455:1: ( 'input' )
            {
            // InternalMyDsl.g:3455:1: ( 'input' )
            // InternalMyDsl.g:3456:2: 'input'
            {
             before(grammarAccess.getManufacturingStepAccess().getInputKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getInputKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__10__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__11"
    // InternalMyDsl.g:3465:1: rule__ManufacturingStep__Group__11 : rule__ManufacturingStep__Group__11__Impl rule__ManufacturingStep__Group__12 ;
    public final void rule__ManufacturingStep__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3469:1: ( rule__ManufacturingStep__Group__11__Impl rule__ManufacturingStep__Group__12 )
            // InternalMyDsl.g:3470:2: rule__ManufacturingStep__Group__11__Impl rule__ManufacturingStep__Group__12
            {
            pushFollow(FOLLOW_33);
            rule__ManufacturingStep__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__11"


    // $ANTLR start "rule__ManufacturingStep__Group__11__Impl"
    // InternalMyDsl.g:3477:1: rule__ManufacturingStep__Group__11__Impl : ( '{' ) ;
    public final void rule__ManufacturingStep__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3481:1: ( ( '{' ) )
            // InternalMyDsl.g:3482:1: ( '{' )
            {
            // InternalMyDsl.g:3482:1: ( '{' )
            // InternalMyDsl.g:3483:2: '{'
            {
             before(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__11__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__12"
    // InternalMyDsl.g:3492:1: rule__ManufacturingStep__Group__12 : rule__ManufacturingStep__Group__12__Impl rule__ManufacturingStep__Group__13 ;
    public final void rule__ManufacturingStep__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3496:1: ( rule__ManufacturingStep__Group__12__Impl rule__ManufacturingStep__Group__13 )
            // InternalMyDsl.g:3497:2: rule__ManufacturingStep__Group__12__Impl rule__ManufacturingStep__Group__13
            {
            pushFollow(FOLLOW_34);
            rule__ManufacturingStep__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__12"


    // $ANTLR start "rule__ManufacturingStep__Group__12__Impl"
    // InternalMyDsl.g:3504:1: rule__ManufacturingStep__Group__12__Impl : ( ( rule__ManufacturingStep__InputAssignment_12 ) ) ;
    public final void rule__ManufacturingStep__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3508:1: ( ( ( rule__ManufacturingStep__InputAssignment_12 ) ) )
            // InternalMyDsl.g:3509:1: ( ( rule__ManufacturingStep__InputAssignment_12 ) )
            {
            // InternalMyDsl.g:3509:1: ( ( rule__ManufacturingStep__InputAssignment_12 ) )
            // InternalMyDsl.g:3510:2: ( rule__ManufacturingStep__InputAssignment_12 )
            {
             before(grammarAccess.getManufacturingStepAccess().getInputAssignment_12()); 
            // InternalMyDsl.g:3511:2: ( rule__ManufacturingStep__InputAssignment_12 )
            // InternalMyDsl.g:3511:3: rule__ManufacturingStep__InputAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__InputAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getInputAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__12__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__13"
    // InternalMyDsl.g:3519:1: rule__ManufacturingStep__Group__13 : rule__ManufacturingStep__Group__13__Impl rule__ManufacturingStep__Group__14 ;
    public final void rule__ManufacturingStep__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3523:1: ( rule__ManufacturingStep__Group__13__Impl rule__ManufacturingStep__Group__14 )
            // InternalMyDsl.g:3524:2: rule__ManufacturingStep__Group__13__Impl rule__ManufacturingStep__Group__14
            {
            pushFollow(FOLLOW_34);
            rule__ManufacturingStep__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__13"


    // $ANTLR start "rule__ManufacturingStep__Group__13__Impl"
    // InternalMyDsl.g:3531:1: rule__ManufacturingStep__Group__13__Impl : ( ( rule__ManufacturingStep__Group_13__0 )* ) ;
    public final void rule__ManufacturingStep__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( ( ( rule__ManufacturingStep__Group_13__0 )* ) )
            // InternalMyDsl.g:3536:1: ( ( rule__ManufacturingStep__Group_13__0 )* )
            {
            // InternalMyDsl.g:3536:1: ( ( rule__ManufacturingStep__Group_13__0 )* )
            // InternalMyDsl.g:3537:2: ( rule__ManufacturingStep__Group_13__0 )*
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_13()); 
            // InternalMyDsl.g:3538:2: ( rule__ManufacturingStep__Group_13__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:3538:3: rule__ManufacturingStep__Group_13__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ManufacturingStep__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getManufacturingStepAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__13__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__14"
    // InternalMyDsl.g:3546:1: rule__ManufacturingStep__Group__14 : rule__ManufacturingStep__Group__14__Impl rule__ManufacturingStep__Group__15 ;
    public final void rule__ManufacturingStep__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3550:1: ( rule__ManufacturingStep__Group__14__Impl rule__ManufacturingStep__Group__15 )
            // InternalMyDsl.g:3551:2: rule__ManufacturingStep__Group__14__Impl rule__ManufacturingStep__Group__15
            {
            pushFollow(FOLLOW_35);
            rule__ManufacturingStep__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__14"


    // $ANTLR start "rule__ManufacturingStep__Group__14__Impl"
    // InternalMyDsl.g:3558:1: rule__ManufacturingStep__Group__14__Impl : ( '}' ) ;
    public final void rule__ManufacturingStep__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3562:1: ( ( '}' ) )
            // InternalMyDsl.g:3563:1: ( '}' )
            {
            // InternalMyDsl.g:3563:1: ( '}' )
            // InternalMyDsl.g:3564:2: '}'
            {
             before(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__14__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__15"
    // InternalMyDsl.g:3573:1: rule__ManufacturingStep__Group__15 : rule__ManufacturingStep__Group__15__Impl rule__ManufacturingStep__Group__16 ;
    public final void rule__ManufacturingStep__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3577:1: ( rule__ManufacturingStep__Group__15__Impl rule__ManufacturingStep__Group__16 )
            // InternalMyDsl.g:3578:2: rule__ManufacturingStep__Group__15__Impl rule__ManufacturingStep__Group__16
            {
            pushFollow(FOLLOW_5);
            rule__ManufacturingStep__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__15"


    // $ANTLR start "rule__ManufacturingStep__Group__15__Impl"
    // InternalMyDsl.g:3585:1: rule__ManufacturingStep__Group__15__Impl : ( 'output' ) ;
    public final void rule__ManufacturingStep__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3589:1: ( ( 'output' ) )
            // InternalMyDsl.g:3590:1: ( 'output' )
            {
            // InternalMyDsl.g:3590:1: ( 'output' )
            // InternalMyDsl.g:3591:2: 'output'
            {
             before(grammarAccess.getManufacturingStepAccess().getOutputKeyword_15()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getOutputKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__15__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__16"
    // InternalMyDsl.g:3600:1: rule__ManufacturingStep__Group__16 : rule__ManufacturingStep__Group__16__Impl rule__ManufacturingStep__Group__17 ;
    public final void rule__ManufacturingStep__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3604:1: ( rule__ManufacturingStep__Group__16__Impl rule__ManufacturingStep__Group__17 )
            // InternalMyDsl.g:3605:2: rule__ManufacturingStep__Group__16__Impl rule__ManufacturingStep__Group__17
            {
            pushFollow(FOLLOW_36);
            rule__ManufacturingStep__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__16"


    // $ANTLR start "rule__ManufacturingStep__Group__16__Impl"
    // InternalMyDsl.g:3612:1: rule__ManufacturingStep__Group__16__Impl : ( '{' ) ;
    public final void rule__ManufacturingStep__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3616:1: ( ( '{' ) )
            // InternalMyDsl.g:3617:1: ( '{' )
            {
            // InternalMyDsl.g:3617:1: ( '{' )
            // InternalMyDsl.g:3618:2: '{'
            {
             before(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getLeftCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__16__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__17"
    // InternalMyDsl.g:3627:1: rule__ManufacturingStep__Group__17 : rule__ManufacturingStep__Group__17__Impl rule__ManufacturingStep__Group__18 ;
    public final void rule__ManufacturingStep__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3631:1: ( rule__ManufacturingStep__Group__17__Impl rule__ManufacturingStep__Group__18 )
            // InternalMyDsl.g:3632:2: rule__ManufacturingStep__Group__17__Impl rule__ManufacturingStep__Group__18
            {
            pushFollow(FOLLOW_34);
            rule__ManufacturingStep__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__17"


    // $ANTLR start "rule__ManufacturingStep__Group__17__Impl"
    // InternalMyDsl.g:3639:1: rule__ManufacturingStep__Group__17__Impl : ( ( rule__ManufacturingStep__OutputAssignment_17 ) ) ;
    public final void rule__ManufacturingStep__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3643:1: ( ( ( rule__ManufacturingStep__OutputAssignment_17 ) ) )
            // InternalMyDsl.g:3644:1: ( ( rule__ManufacturingStep__OutputAssignment_17 ) )
            {
            // InternalMyDsl.g:3644:1: ( ( rule__ManufacturingStep__OutputAssignment_17 ) )
            // InternalMyDsl.g:3645:2: ( rule__ManufacturingStep__OutputAssignment_17 )
            {
             before(grammarAccess.getManufacturingStepAccess().getOutputAssignment_17()); 
            // InternalMyDsl.g:3646:2: ( rule__ManufacturingStep__OutputAssignment_17 )
            // InternalMyDsl.g:3646:3: rule__ManufacturingStep__OutputAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__OutputAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getOutputAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__17__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__18"
    // InternalMyDsl.g:3654:1: rule__ManufacturingStep__Group__18 : rule__ManufacturingStep__Group__18__Impl rule__ManufacturingStep__Group__19 ;
    public final void rule__ManufacturingStep__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3658:1: ( rule__ManufacturingStep__Group__18__Impl rule__ManufacturingStep__Group__19 )
            // InternalMyDsl.g:3659:2: rule__ManufacturingStep__Group__18__Impl rule__ManufacturingStep__Group__19
            {
            pushFollow(FOLLOW_34);
            rule__ManufacturingStep__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__18"


    // $ANTLR start "rule__ManufacturingStep__Group__18__Impl"
    // InternalMyDsl.g:3666:1: rule__ManufacturingStep__Group__18__Impl : ( ( rule__ManufacturingStep__Group_18__0 )* ) ;
    public final void rule__ManufacturingStep__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3670:1: ( ( ( rule__ManufacturingStep__Group_18__0 )* ) )
            // InternalMyDsl.g:3671:1: ( ( rule__ManufacturingStep__Group_18__0 )* )
            {
            // InternalMyDsl.g:3671:1: ( ( rule__ManufacturingStep__Group_18__0 )* )
            // InternalMyDsl.g:3672:2: ( rule__ManufacturingStep__Group_18__0 )*
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_18()); 
            // InternalMyDsl.g:3673:2: ( rule__ManufacturingStep__Group_18__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:3673:3: rule__ManufacturingStep__Group_18__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ManufacturingStep__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getManufacturingStepAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__18__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__19"
    // InternalMyDsl.g:3681:1: rule__ManufacturingStep__Group__19 : rule__ManufacturingStep__Group__19__Impl rule__ManufacturingStep__Group__20 ;
    public final void rule__ManufacturingStep__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3685:1: ( rule__ManufacturingStep__Group__19__Impl rule__ManufacturingStep__Group__20 )
            // InternalMyDsl.g:3686:2: rule__ManufacturingStep__Group__19__Impl rule__ManufacturingStep__Group__20
            {
            pushFollow(FOLLOW_24);
            rule__ManufacturingStep__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__19"


    // $ANTLR start "rule__ManufacturingStep__Group__19__Impl"
    // InternalMyDsl.g:3693:1: rule__ManufacturingStep__Group__19__Impl : ( '}' ) ;
    public final void rule__ManufacturingStep__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3697:1: ( ( '}' ) )
            // InternalMyDsl.g:3698:1: ( '}' )
            {
            // InternalMyDsl.g:3698:1: ( '}' )
            // InternalMyDsl.g:3699:2: '}'
            {
             before(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__19__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group__20"
    // InternalMyDsl.g:3708:1: rule__ManufacturingStep__Group__20 : rule__ManufacturingStep__Group__20__Impl ;
    public final void rule__ManufacturingStep__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3712:1: ( rule__ManufacturingStep__Group__20__Impl )
            // InternalMyDsl.g:3713:2: rule__ManufacturingStep__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__20"


    // $ANTLR start "rule__ManufacturingStep__Group__20__Impl"
    // InternalMyDsl.g:3719:1: rule__ManufacturingStep__Group__20__Impl : ( '}' ) ;
    public final void rule__ManufacturingStep__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3723:1: ( ( '}' ) )
            // InternalMyDsl.g:3724:1: ( '}' )
            {
            // InternalMyDsl.g:3724:1: ( '}' )
            // InternalMyDsl.g:3725:2: '}'
            {
             before(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_20()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group__20__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_6__0"
    // InternalMyDsl.g:3735:1: rule__ManufacturingStep__Group_6__0 : rule__ManufacturingStep__Group_6__0__Impl rule__ManufacturingStep__Group_6__1 ;
    public final void rule__ManufacturingStep__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3739:1: ( rule__ManufacturingStep__Group_6__0__Impl rule__ManufacturingStep__Group_6__1 )
            // InternalMyDsl.g:3740:2: rule__ManufacturingStep__Group_6__0__Impl rule__ManufacturingStep__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingStep__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6__0"


    // $ANTLR start "rule__ManufacturingStep__Group_6__0__Impl"
    // InternalMyDsl.g:3747:1: rule__ManufacturingStep__Group_6__0__Impl : ( 'transition' ) ;
    public final void rule__ManufacturingStep__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3751:1: ( ( 'transition' ) )
            // InternalMyDsl.g:3752:1: ( 'transition' )
            {
            // InternalMyDsl.g:3752:1: ( 'transition' )
            // InternalMyDsl.g:3753:2: 'transition'
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getTransitionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_6__1"
    // InternalMyDsl.g:3762:1: rule__ManufacturingStep__Group_6__1 : rule__ManufacturingStep__Group_6__1__Impl rule__ManufacturingStep__Group_6__2 ;
    public final void rule__ManufacturingStep__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3766:1: ( rule__ManufacturingStep__Group_6__1__Impl rule__ManufacturingStep__Group_6__2 )
            // InternalMyDsl.g:3767:2: rule__ManufacturingStep__Group_6__1__Impl rule__ManufacturingStep__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__ManufacturingStep__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6__1"


    // $ANTLR start "rule__ManufacturingStep__Group_6__1__Impl"
    // InternalMyDsl.g:3774:1: rule__ManufacturingStep__Group_6__1__Impl : ( ( rule__ManufacturingStep__TransitionAssignment_6_1 ) ) ;
    public final void rule__ManufacturingStep__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3778:1: ( ( ( rule__ManufacturingStep__TransitionAssignment_6_1 ) ) )
            // InternalMyDsl.g:3779:1: ( ( rule__ManufacturingStep__TransitionAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3779:1: ( ( rule__ManufacturingStep__TransitionAssignment_6_1 ) )
            // InternalMyDsl.g:3780:2: ( rule__ManufacturingStep__TransitionAssignment_6_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionAssignment_6_1()); 
            // InternalMyDsl.g:3781:2: ( rule__ManufacturingStep__TransitionAssignment_6_1 )
            // InternalMyDsl.g:3781:3: rule__ManufacturingStep__TransitionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__TransitionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getTransitionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_6__2"
    // InternalMyDsl.g:3789:1: rule__ManufacturingStep__Group_6__2 : rule__ManufacturingStep__Group_6__2__Impl ;
    public final void rule__ManufacturingStep__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3793:1: ( rule__ManufacturingStep__Group_6__2__Impl )
            // InternalMyDsl.g:3794:2: rule__ManufacturingStep__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6__2"


    // $ANTLR start "rule__ManufacturingStep__Group_6__2__Impl"
    // InternalMyDsl.g:3800:1: rule__ManufacturingStep__Group_6__2__Impl : ( ( rule__ManufacturingStep__Group_6_2__0 )* ) ;
    public final void rule__ManufacturingStep__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3804:1: ( ( ( rule__ManufacturingStep__Group_6_2__0 )* ) )
            // InternalMyDsl.g:3805:1: ( ( rule__ManufacturingStep__Group_6_2__0 )* )
            {
            // InternalMyDsl.g:3805:1: ( ( rule__ManufacturingStep__Group_6_2__0 )* )
            // InternalMyDsl.g:3806:2: ( rule__ManufacturingStep__Group_6_2__0 )*
            {
             before(grammarAccess.getManufacturingStepAccess().getGroup_6_2()); 
            // InternalMyDsl.g:3807:2: ( rule__ManufacturingStep__Group_6_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:3807:3: rule__ManufacturingStep__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ManufacturingStep__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getManufacturingStepAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6__2__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_6_2__0"
    // InternalMyDsl.g:3816:1: rule__ManufacturingStep__Group_6_2__0 : rule__ManufacturingStep__Group_6_2__0__Impl rule__ManufacturingStep__Group_6_2__1 ;
    public final void rule__ManufacturingStep__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3820:1: ( rule__ManufacturingStep__Group_6_2__0__Impl rule__ManufacturingStep__Group_6_2__1 )
            // InternalMyDsl.g:3821:2: rule__ManufacturingStep__Group_6_2__0__Impl rule__ManufacturingStep__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ManufacturingStep__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6_2__0"


    // $ANTLR start "rule__ManufacturingStep__Group_6_2__0__Impl"
    // InternalMyDsl.g:3828:1: rule__ManufacturingStep__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingStep__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3832:1: ( ( ',' ) )
            // InternalMyDsl.g:3833:1: ( ',' )
            {
            // InternalMyDsl.g:3833:1: ( ',' )
            // InternalMyDsl.g:3834:2: ','
            {
             before(grammarAccess.getManufacturingStepAccess().getCommaKeyword_6_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6_2__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_6_2__1"
    // InternalMyDsl.g:3843:1: rule__ManufacturingStep__Group_6_2__1 : rule__ManufacturingStep__Group_6_2__1__Impl ;
    public final void rule__ManufacturingStep__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3847:1: ( rule__ManufacturingStep__Group_6_2__1__Impl )
            // InternalMyDsl.g:3848:2: rule__ManufacturingStep__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6_2__1"


    // $ANTLR start "rule__ManufacturingStep__Group_6_2__1__Impl"
    // InternalMyDsl.g:3854:1: rule__ManufacturingStep__Group_6_2__1__Impl : ( ( rule__ManufacturingStep__TransitionAssignment_6_2_1 ) ) ;
    public final void rule__ManufacturingStep__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3858:1: ( ( ( rule__ManufacturingStep__TransitionAssignment_6_2_1 ) ) )
            // InternalMyDsl.g:3859:1: ( ( rule__ManufacturingStep__TransitionAssignment_6_2_1 ) )
            {
            // InternalMyDsl.g:3859:1: ( ( rule__ManufacturingStep__TransitionAssignment_6_2_1 ) )
            // InternalMyDsl.g:3860:2: ( rule__ManufacturingStep__TransitionAssignment_6_2_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionAssignment_6_2_1()); 
            // InternalMyDsl.g:3861:2: ( rule__ManufacturingStep__TransitionAssignment_6_2_1 )
            // InternalMyDsl.g:3861:3: rule__ManufacturingStep__TransitionAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__TransitionAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getTransitionAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_6_2__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_13__0"
    // InternalMyDsl.g:3870:1: rule__ManufacturingStep__Group_13__0 : rule__ManufacturingStep__Group_13__0__Impl rule__ManufacturingStep__Group_13__1 ;
    public final void rule__ManufacturingStep__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3874:1: ( rule__ManufacturingStep__Group_13__0__Impl rule__ManufacturingStep__Group_13__1 )
            // InternalMyDsl.g:3875:2: rule__ManufacturingStep__Group_13__0__Impl rule__ManufacturingStep__Group_13__1
            {
            pushFollow(FOLLOW_33);
            rule__ManufacturingStep__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_13__0"


    // $ANTLR start "rule__ManufacturingStep__Group_13__0__Impl"
    // InternalMyDsl.g:3882:1: rule__ManufacturingStep__Group_13__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingStep__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3886:1: ( ( ',' ) )
            // InternalMyDsl.g:3887:1: ( ',' )
            {
            // InternalMyDsl.g:3887:1: ( ',' )
            // InternalMyDsl.g:3888:2: ','
            {
             before(grammarAccess.getManufacturingStepAccess().getCommaKeyword_13_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_13__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_13__1"
    // InternalMyDsl.g:3897:1: rule__ManufacturingStep__Group_13__1 : rule__ManufacturingStep__Group_13__1__Impl ;
    public final void rule__ManufacturingStep__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3901:1: ( rule__ManufacturingStep__Group_13__1__Impl )
            // InternalMyDsl.g:3902:2: rule__ManufacturingStep__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_13__1"


    // $ANTLR start "rule__ManufacturingStep__Group_13__1__Impl"
    // InternalMyDsl.g:3908:1: rule__ManufacturingStep__Group_13__1__Impl : ( ( rule__ManufacturingStep__InputAssignment_13_1 ) ) ;
    public final void rule__ManufacturingStep__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3912:1: ( ( ( rule__ManufacturingStep__InputAssignment_13_1 ) ) )
            // InternalMyDsl.g:3913:1: ( ( rule__ManufacturingStep__InputAssignment_13_1 ) )
            {
            // InternalMyDsl.g:3913:1: ( ( rule__ManufacturingStep__InputAssignment_13_1 ) )
            // InternalMyDsl.g:3914:2: ( rule__ManufacturingStep__InputAssignment_13_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getInputAssignment_13_1()); 
            // InternalMyDsl.g:3915:2: ( rule__ManufacturingStep__InputAssignment_13_1 )
            // InternalMyDsl.g:3915:3: rule__ManufacturingStep__InputAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__InputAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getInputAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_13__1__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_18__0"
    // InternalMyDsl.g:3924:1: rule__ManufacturingStep__Group_18__0 : rule__ManufacturingStep__Group_18__0__Impl rule__ManufacturingStep__Group_18__1 ;
    public final void rule__ManufacturingStep__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3928:1: ( rule__ManufacturingStep__Group_18__0__Impl rule__ManufacturingStep__Group_18__1 )
            // InternalMyDsl.g:3929:2: rule__ManufacturingStep__Group_18__0__Impl rule__ManufacturingStep__Group_18__1
            {
            pushFollow(FOLLOW_36);
            rule__ManufacturingStep__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_18__0"


    // $ANTLR start "rule__ManufacturingStep__Group_18__0__Impl"
    // InternalMyDsl.g:3936:1: rule__ManufacturingStep__Group_18__0__Impl : ( ',' ) ;
    public final void rule__ManufacturingStep__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3940:1: ( ( ',' ) )
            // InternalMyDsl.g:3941:1: ( ',' )
            {
            // InternalMyDsl.g:3941:1: ( ',' )
            // InternalMyDsl.g:3942:2: ','
            {
             before(grammarAccess.getManufacturingStepAccess().getCommaKeyword_18_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getManufacturingStepAccess().getCommaKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_18__0__Impl"


    // $ANTLR start "rule__ManufacturingStep__Group_18__1"
    // InternalMyDsl.g:3951:1: rule__ManufacturingStep__Group_18__1 : rule__ManufacturingStep__Group_18__1__Impl ;
    public final void rule__ManufacturingStep__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3955:1: ( rule__ManufacturingStep__Group_18__1__Impl )
            // InternalMyDsl.g:3956:2: rule__ManufacturingStep__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_18__1"


    // $ANTLR start "rule__ManufacturingStep__Group_18__1__Impl"
    // InternalMyDsl.g:3962:1: rule__ManufacturingStep__Group_18__1__Impl : ( ( rule__ManufacturingStep__OutputAssignment_18_1 ) ) ;
    public final void rule__ManufacturingStep__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3966:1: ( ( ( rule__ManufacturingStep__OutputAssignment_18_1 ) ) )
            // InternalMyDsl.g:3967:1: ( ( rule__ManufacturingStep__OutputAssignment_18_1 ) )
            {
            // InternalMyDsl.g:3967:1: ( ( rule__ManufacturingStep__OutputAssignment_18_1 ) )
            // InternalMyDsl.g:3968:2: ( rule__ManufacturingStep__OutputAssignment_18_1 )
            {
             before(grammarAccess.getManufacturingStepAccess().getOutputAssignment_18_1()); 
            // InternalMyDsl.g:3969:2: ( rule__ManufacturingStep__OutputAssignment_18_1 )
            // InternalMyDsl.g:3969:3: rule__ManufacturingStep__OutputAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__ManufacturingStep__OutputAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getManufacturingStepAccess().getOutputAssignment_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__Group_18__1__Impl"


    // $ANTLR start "rule__TransportStep__Group__0"
    // InternalMyDsl.g:3978:1: rule__TransportStep__Group__0 : rule__TransportStep__Group__0__Impl rule__TransportStep__Group__1 ;
    public final void rule__TransportStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3982:1: ( rule__TransportStep__Group__0__Impl rule__TransportStep__Group__1 )
            // InternalMyDsl.g:3983:2: rule__TransportStep__Group__0__Impl rule__TransportStep__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TransportStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__0"


    // $ANTLR start "rule__TransportStep__Group__0__Impl"
    // InternalMyDsl.g:3990:1: rule__TransportStep__Group__0__Impl : ( 'TransportStep' ) ;
    public final void rule__TransportStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3994:1: ( ( 'TransportStep' ) )
            // InternalMyDsl.g:3995:1: ( 'TransportStep' )
            {
            // InternalMyDsl.g:3995:1: ( 'TransportStep' )
            // InternalMyDsl.g:3996:2: 'TransportStep'
            {
             before(grammarAccess.getTransportStepAccess().getTransportStepKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getTransportStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__0__Impl"


    // $ANTLR start "rule__TransportStep__Group__1"
    // InternalMyDsl.g:4005:1: rule__TransportStep__Group__1 : rule__TransportStep__Group__1__Impl rule__TransportStep__Group__2 ;
    public final void rule__TransportStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4009:1: ( rule__TransportStep__Group__1__Impl rule__TransportStep__Group__2 )
            // InternalMyDsl.g:4010:2: rule__TransportStep__Group__1__Impl rule__TransportStep__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TransportStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__1"


    // $ANTLR start "rule__TransportStep__Group__1__Impl"
    // InternalMyDsl.g:4017:1: rule__TransportStep__Group__1__Impl : ( ( rule__TransportStep__NameAssignment_1 ) ) ;
    public final void rule__TransportStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4021:1: ( ( ( rule__TransportStep__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4022:1: ( ( rule__TransportStep__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4022:1: ( ( rule__TransportStep__NameAssignment_1 ) )
            // InternalMyDsl.g:4023:2: ( rule__TransportStep__NameAssignment_1 )
            {
             before(grammarAccess.getTransportStepAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4024:2: ( rule__TransportStep__NameAssignment_1 )
            // InternalMyDsl.g:4024:3: rule__TransportStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__1__Impl"


    // $ANTLR start "rule__TransportStep__Group__2"
    // InternalMyDsl.g:4032:1: rule__TransportStep__Group__2 : rule__TransportStep__Group__2__Impl rule__TransportStep__Group__3 ;
    public final void rule__TransportStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4036:1: ( rule__TransportStep__Group__2__Impl rule__TransportStep__Group__3 )
            // InternalMyDsl.g:4037:2: rule__TransportStep__Group__2__Impl rule__TransportStep__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__TransportStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__2"


    // $ANTLR start "rule__TransportStep__Group__2__Impl"
    // InternalMyDsl.g:4044:1: rule__TransportStep__Group__2__Impl : ( '{' ) ;
    public final void rule__TransportStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4048:1: ( ( '{' ) )
            // InternalMyDsl.g:4049:1: ( '{' )
            {
            // InternalMyDsl.g:4049:1: ( '{' )
            // InternalMyDsl.g:4050:2: '{'
            {
             before(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__2__Impl"


    // $ANTLR start "rule__TransportStep__Group__3"
    // InternalMyDsl.g:4059:1: rule__TransportStep__Group__3 : rule__TransportStep__Group__3__Impl rule__TransportStep__Group__4 ;
    public final void rule__TransportStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4063:1: ( rule__TransportStep__Group__3__Impl rule__TransportStep__Group__4 )
            // InternalMyDsl.g:4064:2: rule__TransportStep__Group__3__Impl rule__TransportStep__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__TransportStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__3"


    // $ANTLR start "rule__TransportStep__Group__3__Impl"
    // InternalMyDsl.g:4071:1: rule__TransportStep__Group__3__Impl : ( 'speed' ) ;
    public final void rule__TransportStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4075:1: ( ( 'speed' ) )
            // InternalMyDsl.g:4076:1: ( 'speed' )
            {
            // InternalMyDsl.g:4076:1: ( 'speed' )
            // InternalMyDsl.g:4077:2: 'speed'
            {
             before(grammarAccess.getTransportStepAccess().getSpeedKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getSpeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__3__Impl"


    // $ANTLR start "rule__TransportStep__Group__4"
    // InternalMyDsl.g:4086:1: rule__TransportStep__Group__4 : rule__TransportStep__Group__4__Impl rule__TransportStep__Group__5 ;
    public final void rule__TransportStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4090:1: ( rule__TransportStep__Group__4__Impl rule__TransportStep__Group__5 )
            // InternalMyDsl.g:4091:2: rule__TransportStep__Group__4__Impl rule__TransportStep__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__TransportStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__4"


    // $ANTLR start "rule__TransportStep__Group__4__Impl"
    // InternalMyDsl.g:4098:1: rule__TransportStep__Group__4__Impl : ( '=' ) ;
    public final void rule__TransportStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4102:1: ( ( '=' ) )
            // InternalMyDsl.g:4103:1: ( '=' )
            {
            // InternalMyDsl.g:4103:1: ( '=' )
            // InternalMyDsl.g:4104:2: '='
            {
             before(grammarAccess.getTransportStepAccess().getEqualsSignKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__4__Impl"


    // $ANTLR start "rule__TransportStep__Group__5"
    // InternalMyDsl.g:4113:1: rule__TransportStep__Group__5 : rule__TransportStep__Group__5__Impl rule__TransportStep__Group__6 ;
    public final void rule__TransportStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4117:1: ( rule__TransportStep__Group__5__Impl rule__TransportStep__Group__6 )
            // InternalMyDsl.g:4118:2: rule__TransportStep__Group__5__Impl rule__TransportStep__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__TransportStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__5"


    // $ANTLR start "rule__TransportStep__Group__5__Impl"
    // InternalMyDsl.g:4125:1: rule__TransportStep__Group__5__Impl : ( ( rule__TransportStep__SpeedAssignment_5 ) ) ;
    public final void rule__TransportStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4129:1: ( ( ( rule__TransportStep__SpeedAssignment_5 ) ) )
            // InternalMyDsl.g:4130:1: ( ( rule__TransportStep__SpeedAssignment_5 ) )
            {
            // InternalMyDsl.g:4130:1: ( ( rule__TransportStep__SpeedAssignment_5 ) )
            // InternalMyDsl.g:4131:2: ( rule__TransportStep__SpeedAssignment_5 )
            {
             before(grammarAccess.getTransportStepAccess().getSpeedAssignment_5()); 
            // InternalMyDsl.g:4132:2: ( rule__TransportStep__SpeedAssignment_5 )
            // InternalMyDsl.g:4132:3: rule__TransportStep__SpeedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__SpeedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getSpeedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__5__Impl"


    // $ANTLR start "rule__TransportStep__Group__6"
    // InternalMyDsl.g:4140:1: rule__TransportStep__Group__6 : rule__TransportStep__Group__6__Impl rule__TransportStep__Group__7 ;
    public final void rule__TransportStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4144:1: ( rule__TransportStep__Group__6__Impl rule__TransportStep__Group__7 )
            // InternalMyDsl.g:4145:2: rule__TransportStep__Group__6__Impl rule__TransportStep__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__TransportStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__6"


    // $ANTLR start "rule__TransportStep__Group__6__Impl"
    // InternalMyDsl.g:4152:1: rule__TransportStep__Group__6__Impl : ( ( rule__TransportStep__Group_6__0 )? ) ;
    public final void rule__TransportStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4156:1: ( ( ( rule__TransportStep__Group_6__0 )? ) )
            // InternalMyDsl.g:4157:1: ( ( rule__TransportStep__Group_6__0 )? )
            {
            // InternalMyDsl.g:4157:1: ( ( rule__TransportStep__Group_6__0 )? )
            // InternalMyDsl.g:4158:2: ( rule__TransportStep__Group_6__0 )?
            {
             before(grammarAccess.getTransportStepAccess().getGroup_6()); 
            // InternalMyDsl.g:4159:2: ( rule__TransportStep__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:4159:3: rule__TransportStep__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransportStep__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransportStepAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__6__Impl"


    // $ANTLR start "rule__TransportStep__Group__7"
    // InternalMyDsl.g:4167:1: rule__TransportStep__Group__7 : rule__TransportStep__Group__7__Impl rule__TransportStep__Group__8 ;
    public final void rule__TransportStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4171:1: ( rule__TransportStep__Group__7__Impl rule__TransportStep__Group__8 )
            // InternalMyDsl.g:4172:2: rule__TransportStep__Group__7__Impl rule__TransportStep__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__TransportStep__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__7"


    // $ANTLR start "rule__TransportStep__Group__7__Impl"
    // InternalMyDsl.g:4179:1: rule__TransportStep__Group__7__Impl : ( 'set' ) ;
    public final void rule__TransportStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4183:1: ( ( 'set' ) )
            // InternalMyDsl.g:4184:1: ( 'set' )
            {
            // InternalMyDsl.g:4184:1: ( 'set' )
            // InternalMyDsl.g:4185:2: 'set'
            {
             before(grammarAccess.getTransportStepAccess().getSetKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getSetKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__7__Impl"


    // $ANTLR start "rule__TransportStep__Group__8"
    // InternalMyDsl.g:4194:1: rule__TransportStep__Group__8 : rule__TransportStep__Group__8__Impl rule__TransportStep__Group__9 ;
    public final void rule__TransportStep__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4198:1: ( rule__TransportStep__Group__8__Impl rule__TransportStep__Group__9 )
            // InternalMyDsl.g:4199:2: rule__TransportStep__Group__8__Impl rule__TransportStep__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__TransportStep__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__8"


    // $ANTLR start "rule__TransportStep__Group__8__Impl"
    // InternalMyDsl.g:4206:1: rule__TransportStep__Group__8__Impl : ( 'responsible' ) ;
    public final void rule__TransportStep__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4210:1: ( ( 'responsible' ) )
            // InternalMyDsl.g:4211:1: ( 'responsible' )
            {
            // InternalMyDsl.g:4211:1: ( 'responsible' )
            // InternalMyDsl.g:4212:2: 'responsible'
            {
             before(grammarAccess.getTransportStepAccess().getResponsibleKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getResponsibleKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__8__Impl"


    // $ANTLR start "rule__TransportStep__Group__9"
    // InternalMyDsl.g:4221:1: rule__TransportStep__Group__9 : rule__TransportStep__Group__9__Impl rule__TransportStep__Group__10 ;
    public final void rule__TransportStep__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4225:1: ( rule__TransportStep__Group__9__Impl rule__TransportStep__Group__10 )
            // InternalMyDsl.g:4226:2: rule__TransportStep__Group__9__Impl rule__TransportStep__Group__10
            {
            pushFollow(FOLLOW_32);
            rule__TransportStep__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__9"


    // $ANTLR start "rule__TransportStep__Group__9__Impl"
    // InternalMyDsl.g:4233:1: rule__TransportStep__Group__9__Impl : ( ( rule__TransportStep__ResponsibleAssignment_9 ) ) ;
    public final void rule__TransportStep__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4237:1: ( ( ( rule__TransportStep__ResponsibleAssignment_9 ) ) )
            // InternalMyDsl.g:4238:1: ( ( rule__TransportStep__ResponsibleAssignment_9 ) )
            {
            // InternalMyDsl.g:4238:1: ( ( rule__TransportStep__ResponsibleAssignment_9 ) )
            // InternalMyDsl.g:4239:2: ( rule__TransportStep__ResponsibleAssignment_9 )
            {
             before(grammarAccess.getTransportStepAccess().getResponsibleAssignment_9()); 
            // InternalMyDsl.g:4240:2: ( rule__TransportStep__ResponsibleAssignment_9 )
            // InternalMyDsl.g:4240:3: rule__TransportStep__ResponsibleAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__ResponsibleAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getResponsibleAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__9__Impl"


    // $ANTLR start "rule__TransportStep__Group__10"
    // InternalMyDsl.g:4248:1: rule__TransportStep__Group__10 : rule__TransportStep__Group__10__Impl rule__TransportStep__Group__11 ;
    public final void rule__TransportStep__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4252:1: ( rule__TransportStep__Group__10__Impl rule__TransportStep__Group__11 )
            // InternalMyDsl.g:4253:2: rule__TransportStep__Group__10__Impl rule__TransportStep__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__TransportStep__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__10"


    // $ANTLR start "rule__TransportStep__Group__10__Impl"
    // InternalMyDsl.g:4260:1: rule__TransportStep__Group__10__Impl : ( 'input' ) ;
    public final void rule__TransportStep__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4264:1: ( ( 'input' ) )
            // InternalMyDsl.g:4265:1: ( 'input' )
            {
            // InternalMyDsl.g:4265:1: ( 'input' )
            // InternalMyDsl.g:4266:2: 'input'
            {
             before(grammarAccess.getTransportStepAccess().getInputKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getInputKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__10__Impl"


    // $ANTLR start "rule__TransportStep__Group__11"
    // InternalMyDsl.g:4275:1: rule__TransportStep__Group__11 : rule__TransportStep__Group__11__Impl rule__TransportStep__Group__12 ;
    public final void rule__TransportStep__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4279:1: ( rule__TransportStep__Group__11__Impl rule__TransportStep__Group__12 )
            // InternalMyDsl.g:4280:2: rule__TransportStep__Group__11__Impl rule__TransportStep__Group__12
            {
            pushFollow(FOLLOW_33);
            rule__TransportStep__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__11"


    // $ANTLR start "rule__TransportStep__Group__11__Impl"
    // InternalMyDsl.g:4287:1: rule__TransportStep__Group__11__Impl : ( '{' ) ;
    public final void rule__TransportStep__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4291:1: ( ( '{' ) )
            // InternalMyDsl.g:4292:1: ( '{' )
            {
            // InternalMyDsl.g:4292:1: ( '{' )
            // InternalMyDsl.g:4293:2: '{'
            {
             before(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__11__Impl"


    // $ANTLR start "rule__TransportStep__Group__12"
    // InternalMyDsl.g:4302:1: rule__TransportStep__Group__12 : rule__TransportStep__Group__12__Impl rule__TransportStep__Group__13 ;
    public final void rule__TransportStep__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4306:1: ( rule__TransportStep__Group__12__Impl rule__TransportStep__Group__13 )
            // InternalMyDsl.g:4307:2: rule__TransportStep__Group__12__Impl rule__TransportStep__Group__13
            {
            pushFollow(FOLLOW_34);
            rule__TransportStep__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__12"


    // $ANTLR start "rule__TransportStep__Group__12__Impl"
    // InternalMyDsl.g:4314:1: rule__TransportStep__Group__12__Impl : ( ( rule__TransportStep__InputAssignment_12 ) ) ;
    public final void rule__TransportStep__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4318:1: ( ( ( rule__TransportStep__InputAssignment_12 ) ) )
            // InternalMyDsl.g:4319:1: ( ( rule__TransportStep__InputAssignment_12 ) )
            {
            // InternalMyDsl.g:4319:1: ( ( rule__TransportStep__InputAssignment_12 ) )
            // InternalMyDsl.g:4320:2: ( rule__TransportStep__InputAssignment_12 )
            {
             before(grammarAccess.getTransportStepAccess().getInputAssignment_12()); 
            // InternalMyDsl.g:4321:2: ( rule__TransportStep__InputAssignment_12 )
            // InternalMyDsl.g:4321:3: rule__TransportStep__InputAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__InputAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getInputAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__12__Impl"


    // $ANTLR start "rule__TransportStep__Group__13"
    // InternalMyDsl.g:4329:1: rule__TransportStep__Group__13 : rule__TransportStep__Group__13__Impl rule__TransportStep__Group__14 ;
    public final void rule__TransportStep__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4333:1: ( rule__TransportStep__Group__13__Impl rule__TransportStep__Group__14 )
            // InternalMyDsl.g:4334:2: rule__TransportStep__Group__13__Impl rule__TransportStep__Group__14
            {
            pushFollow(FOLLOW_34);
            rule__TransportStep__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__13"


    // $ANTLR start "rule__TransportStep__Group__13__Impl"
    // InternalMyDsl.g:4341:1: rule__TransportStep__Group__13__Impl : ( ( rule__TransportStep__Group_13__0 )* ) ;
    public final void rule__TransportStep__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4345:1: ( ( ( rule__TransportStep__Group_13__0 )* ) )
            // InternalMyDsl.g:4346:1: ( ( rule__TransportStep__Group_13__0 )* )
            {
            // InternalMyDsl.g:4346:1: ( ( rule__TransportStep__Group_13__0 )* )
            // InternalMyDsl.g:4347:2: ( rule__TransportStep__Group_13__0 )*
            {
             before(grammarAccess.getTransportStepAccess().getGroup_13()); 
            // InternalMyDsl.g:4348:2: ( rule__TransportStep__Group_13__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==23) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:4348:3: rule__TransportStep__Group_13__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TransportStep__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getTransportStepAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__13__Impl"


    // $ANTLR start "rule__TransportStep__Group__14"
    // InternalMyDsl.g:4356:1: rule__TransportStep__Group__14 : rule__TransportStep__Group__14__Impl rule__TransportStep__Group__15 ;
    public final void rule__TransportStep__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4360:1: ( rule__TransportStep__Group__14__Impl rule__TransportStep__Group__15 )
            // InternalMyDsl.g:4361:2: rule__TransportStep__Group__14__Impl rule__TransportStep__Group__15
            {
            pushFollow(FOLLOW_35);
            rule__TransportStep__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__14"


    // $ANTLR start "rule__TransportStep__Group__14__Impl"
    // InternalMyDsl.g:4368:1: rule__TransportStep__Group__14__Impl : ( '}' ) ;
    public final void rule__TransportStep__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4372:1: ( ( '}' ) )
            // InternalMyDsl.g:4373:1: ( '}' )
            {
            // InternalMyDsl.g:4373:1: ( '}' )
            // InternalMyDsl.g:4374:2: '}'
            {
             before(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__14__Impl"


    // $ANTLR start "rule__TransportStep__Group__15"
    // InternalMyDsl.g:4383:1: rule__TransportStep__Group__15 : rule__TransportStep__Group__15__Impl rule__TransportStep__Group__16 ;
    public final void rule__TransportStep__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4387:1: ( rule__TransportStep__Group__15__Impl rule__TransportStep__Group__16 )
            // InternalMyDsl.g:4388:2: rule__TransportStep__Group__15__Impl rule__TransportStep__Group__16
            {
            pushFollow(FOLLOW_5);
            rule__TransportStep__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__15"


    // $ANTLR start "rule__TransportStep__Group__15__Impl"
    // InternalMyDsl.g:4395:1: rule__TransportStep__Group__15__Impl : ( 'output' ) ;
    public final void rule__TransportStep__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4399:1: ( ( 'output' ) )
            // InternalMyDsl.g:4400:1: ( 'output' )
            {
            // InternalMyDsl.g:4400:1: ( 'output' )
            // InternalMyDsl.g:4401:2: 'output'
            {
             before(grammarAccess.getTransportStepAccess().getOutputKeyword_15()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getOutputKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__15__Impl"


    // $ANTLR start "rule__TransportStep__Group__16"
    // InternalMyDsl.g:4410:1: rule__TransportStep__Group__16 : rule__TransportStep__Group__16__Impl rule__TransportStep__Group__17 ;
    public final void rule__TransportStep__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4414:1: ( rule__TransportStep__Group__16__Impl rule__TransportStep__Group__17 )
            // InternalMyDsl.g:4415:2: rule__TransportStep__Group__16__Impl rule__TransportStep__Group__17
            {
            pushFollow(FOLLOW_36);
            rule__TransportStep__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__16"


    // $ANTLR start "rule__TransportStep__Group__16__Impl"
    // InternalMyDsl.g:4422:1: rule__TransportStep__Group__16__Impl : ( '{' ) ;
    public final void rule__TransportStep__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4426:1: ( ( '{' ) )
            // InternalMyDsl.g:4427:1: ( '{' )
            {
            // InternalMyDsl.g:4427:1: ( '{' )
            // InternalMyDsl.g:4428:2: '{'
            {
             before(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getLeftCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__16__Impl"


    // $ANTLR start "rule__TransportStep__Group__17"
    // InternalMyDsl.g:4437:1: rule__TransportStep__Group__17 : rule__TransportStep__Group__17__Impl rule__TransportStep__Group__18 ;
    public final void rule__TransportStep__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4441:1: ( rule__TransportStep__Group__17__Impl rule__TransportStep__Group__18 )
            // InternalMyDsl.g:4442:2: rule__TransportStep__Group__17__Impl rule__TransportStep__Group__18
            {
            pushFollow(FOLLOW_34);
            rule__TransportStep__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__17"


    // $ANTLR start "rule__TransportStep__Group__17__Impl"
    // InternalMyDsl.g:4449:1: rule__TransportStep__Group__17__Impl : ( ( rule__TransportStep__OutputAssignment_17 ) ) ;
    public final void rule__TransportStep__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4453:1: ( ( ( rule__TransportStep__OutputAssignment_17 ) ) )
            // InternalMyDsl.g:4454:1: ( ( rule__TransportStep__OutputAssignment_17 ) )
            {
            // InternalMyDsl.g:4454:1: ( ( rule__TransportStep__OutputAssignment_17 ) )
            // InternalMyDsl.g:4455:2: ( rule__TransportStep__OutputAssignment_17 )
            {
             before(grammarAccess.getTransportStepAccess().getOutputAssignment_17()); 
            // InternalMyDsl.g:4456:2: ( rule__TransportStep__OutputAssignment_17 )
            // InternalMyDsl.g:4456:3: rule__TransportStep__OutputAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__OutputAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getOutputAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__17__Impl"


    // $ANTLR start "rule__TransportStep__Group__18"
    // InternalMyDsl.g:4464:1: rule__TransportStep__Group__18 : rule__TransportStep__Group__18__Impl rule__TransportStep__Group__19 ;
    public final void rule__TransportStep__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4468:1: ( rule__TransportStep__Group__18__Impl rule__TransportStep__Group__19 )
            // InternalMyDsl.g:4469:2: rule__TransportStep__Group__18__Impl rule__TransportStep__Group__19
            {
            pushFollow(FOLLOW_34);
            rule__TransportStep__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__18"


    // $ANTLR start "rule__TransportStep__Group__18__Impl"
    // InternalMyDsl.g:4476:1: rule__TransportStep__Group__18__Impl : ( ( rule__TransportStep__Group_18__0 )* ) ;
    public final void rule__TransportStep__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4480:1: ( ( ( rule__TransportStep__Group_18__0 )* ) )
            // InternalMyDsl.g:4481:1: ( ( rule__TransportStep__Group_18__0 )* )
            {
            // InternalMyDsl.g:4481:1: ( ( rule__TransportStep__Group_18__0 )* )
            // InternalMyDsl.g:4482:2: ( rule__TransportStep__Group_18__0 )*
            {
             before(grammarAccess.getTransportStepAccess().getGroup_18()); 
            // InternalMyDsl.g:4483:2: ( rule__TransportStep__Group_18__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==23) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:4483:3: rule__TransportStep__Group_18__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TransportStep__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getTransportStepAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__18__Impl"


    // $ANTLR start "rule__TransportStep__Group__19"
    // InternalMyDsl.g:4491:1: rule__TransportStep__Group__19 : rule__TransportStep__Group__19__Impl rule__TransportStep__Group__20 ;
    public final void rule__TransportStep__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4495:1: ( rule__TransportStep__Group__19__Impl rule__TransportStep__Group__20 )
            // InternalMyDsl.g:4496:2: rule__TransportStep__Group__19__Impl rule__TransportStep__Group__20
            {
            pushFollow(FOLLOW_24);
            rule__TransportStep__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__19"


    // $ANTLR start "rule__TransportStep__Group__19__Impl"
    // InternalMyDsl.g:4503:1: rule__TransportStep__Group__19__Impl : ( '}' ) ;
    public final void rule__TransportStep__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4507:1: ( ( '}' ) )
            // InternalMyDsl.g:4508:1: ( '}' )
            {
            // InternalMyDsl.g:4508:1: ( '}' )
            // InternalMyDsl.g:4509:2: '}'
            {
             before(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__19__Impl"


    // $ANTLR start "rule__TransportStep__Group__20"
    // InternalMyDsl.g:4518:1: rule__TransportStep__Group__20 : rule__TransportStep__Group__20__Impl ;
    public final void rule__TransportStep__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4522:1: ( rule__TransportStep__Group__20__Impl )
            // InternalMyDsl.g:4523:2: rule__TransportStep__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__20"


    // $ANTLR start "rule__TransportStep__Group__20__Impl"
    // InternalMyDsl.g:4529:1: rule__TransportStep__Group__20__Impl : ( '}' ) ;
    public final void rule__TransportStep__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4533:1: ( ( '}' ) )
            // InternalMyDsl.g:4534:1: ( '}' )
            {
            // InternalMyDsl.g:4534:1: ( '}' )
            // InternalMyDsl.g:4535:2: '}'
            {
             before(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_20()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group__20__Impl"


    // $ANTLR start "rule__TransportStep__Group_6__0"
    // InternalMyDsl.g:4545:1: rule__TransportStep__Group_6__0 : rule__TransportStep__Group_6__0__Impl rule__TransportStep__Group_6__1 ;
    public final void rule__TransportStep__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4549:1: ( rule__TransportStep__Group_6__0__Impl rule__TransportStep__Group_6__1 )
            // InternalMyDsl.g:4550:2: rule__TransportStep__Group_6__0__Impl rule__TransportStep__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__TransportStep__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6__0"


    // $ANTLR start "rule__TransportStep__Group_6__0__Impl"
    // InternalMyDsl.g:4557:1: rule__TransportStep__Group_6__0__Impl : ( 'transition' ) ;
    public final void rule__TransportStep__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4561:1: ( ( 'transition' ) )
            // InternalMyDsl.g:4562:1: ( 'transition' )
            {
            // InternalMyDsl.g:4562:1: ( 'transition' )
            // InternalMyDsl.g:4563:2: 'transition'
            {
             before(grammarAccess.getTransportStepAccess().getTransitionKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getTransitionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_6__1"
    // InternalMyDsl.g:4572:1: rule__TransportStep__Group_6__1 : rule__TransportStep__Group_6__1__Impl rule__TransportStep__Group_6__2 ;
    public final void rule__TransportStep__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4576:1: ( rule__TransportStep__Group_6__1__Impl rule__TransportStep__Group_6__2 )
            // InternalMyDsl.g:4577:2: rule__TransportStep__Group_6__1__Impl rule__TransportStep__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__TransportStep__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6__1"


    // $ANTLR start "rule__TransportStep__Group_6__1__Impl"
    // InternalMyDsl.g:4584:1: rule__TransportStep__Group_6__1__Impl : ( ( rule__TransportStep__TransitionAssignment_6_1 ) ) ;
    public final void rule__TransportStep__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4588:1: ( ( ( rule__TransportStep__TransitionAssignment_6_1 ) ) )
            // InternalMyDsl.g:4589:1: ( ( rule__TransportStep__TransitionAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4589:1: ( ( rule__TransportStep__TransitionAssignment_6_1 ) )
            // InternalMyDsl.g:4590:2: ( rule__TransportStep__TransitionAssignment_6_1 )
            {
             before(grammarAccess.getTransportStepAccess().getTransitionAssignment_6_1()); 
            // InternalMyDsl.g:4591:2: ( rule__TransportStep__TransitionAssignment_6_1 )
            // InternalMyDsl.g:4591:3: rule__TransportStep__TransitionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__TransitionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getTransitionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6__1__Impl"


    // $ANTLR start "rule__TransportStep__Group_6__2"
    // InternalMyDsl.g:4599:1: rule__TransportStep__Group_6__2 : rule__TransportStep__Group_6__2__Impl ;
    public final void rule__TransportStep__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4603:1: ( rule__TransportStep__Group_6__2__Impl )
            // InternalMyDsl.g:4604:2: rule__TransportStep__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6__2"


    // $ANTLR start "rule__TransportStep__Group_6__2__Impl"
    // InternalMyDsl.g:4610:1: rule__TransportStep__Group_6__2__Impl : ( ( rule__TransportStep__Group_6_2__0 )* ) ;
    public final void rule__TransportStep__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4614:1: ( ( ( rule__TransportStep__Group_6_2__0 )* ) )
            // InternalMyDsl.g:4615:1: ( ( rule__TransportStep__Group_6_2__0 )* )
            {
            // InternalMyDsl.g:4615:1: ( ( rule__TransportStep__Group_6_2__0 )* )
            // InternalMyDsl.g:4616:2: ( rule__TransportStep__Group_6_2__0 )*
            {
             before(grammarAccess.getTransportStepAccess().getGroup_6_2()); 
            // InternalMyDsl.g:4617:2: ( rule__TransportStep__Group_6_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:4617:3: rule__TransportStep__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TransportStep__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTransportStepAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6__2__Impl"


    // $ANTLR start "rule__TransportStep__Group_6_2__0"
    // InternalMyDsl.g:4626:1: rule__TransportStep__Group_6_2__0 : rule__TransportStep__Group_6_2__0__Impl rule__TransportStep__Group_6_2__1 ;
    public final void rule__TransportStep__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4630:1: ( rule__TransportStep__Group_6_2__0__Impl rule__TransportStep__Group_6_2__1 )
            // InternalMyDsl.g:4631:2: rule__TransportStep__Group_6_2__0__Impl rule__TransportStep__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__TransportStep__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6_2__0"


    // $ANTLR start "rule__TransportStep__Group_6_2__0__Impl"
    // InternalMyDsl.g:4638:1: rule__TransportStep__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__TransportStep__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4642:1: ( ( ',' ) )
            // InternalMyDsl.g:4643:1: ( ',' )
            {
            // InternalMyDsl.g:4643:1: ( ',' )
            // InternalMyDsl.g:4644:2: ','
            {
             before(grammarAccess.getTransportStepAccess().getCommaKeyword_6_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6_2__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_6_2__1"
    // InternalMyDsl.g:4653:1: rule__TransportStep__Group_6_2__1 : rule__TransportStep__Group_6_2__1__Impl ;
    public final void rule__TransportStep__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4657:1: ( rule__TransportStep__Group_6_2__1__Impl )
            // InternalMyDsl.g:4658:2: rule__TransportStep__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6_2__1"


    // $ANTLR start "rule__TransportStep__Group_6_2__1__Impl"
    // InternalMyDsl.g:4664:1: rule__TransportStep__Group_6_2__1__Impl : ( ( rule__TransportStep__TransitionAssignment_6_2_1 ) ) ;
    public final void rule__TransportStep__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4668:1: ( ( ( rule__TransportStep__TransitionAssignment_6_2_1 ) ) )
            // InternalMyDsl.g:4669:1: ( ( rule__TransportStep__TransitionAssignment_6_2_1 ) )
            {
            // InternalMyDsl.g:4669:1: ( ( rule__TransportStep__TransitionAssignment_6_2_1 ) )
            // InternalMyDsl.g:4670:2: ( rule__TransportStep__TransitionAssignment_6_2_1 )
            {
             before(grammarAccess.getTransportStepAccess().getTransitionAssignment_6_2_1()); 
            // InternalMyDsl.g:4671:2: ( rule__TransportStep__TransitionAssignment_6_2_1 )
            // InternalMyDsl.g:4671:3: rule__TransportStep__TransitionAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__TransitionAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getTransitionAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_6_2__1__Impl"


    // $ANTLR start "rule__TransportStep__Group_13__0"
    // InternalMyDsl.g:4680:1: rule__TransportStep__Group_13__0 : rule__TransportStep__Group_13__0__Impl rule__TransportStep__Group_13__1 ;
    public final void rule__TransportStep__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4684:1: ( rule__TransportStep__Group_13__0__Impl rule__TransportStep__Group_13__1 )
            // InternalMyDsl.g:4685:2: rule__TransportStep__Group_13__0__Impl rule__TransportStep__Group_13__1
            {
            pushFollow(FOLLOW_33);
            rule__TransportStep__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_13__0"


    // $ANTLR start "rule__TransportStep__Group_13__0__Impl"
    // InternalMyDsl.g:4692:1: rule__TransportStep__Group_13__0__Impl : ( ',' ) ;
    public final void rule__TransportStep__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4696:1: ( ( ',' ) )
            // InternalMyDsl.g:4697:1: ( ',' )
            {
            // InternalMyDsl.g:4697:1: ( ',' )
            // InternalMyDsl.g:4698:2: ','
            {
             before(grammarAccess.getTransportStepAccess().getCommaKeyword_13_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_13__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_13__1"
    // InternalMyDsl.g:4707:1: rule__TransportStep__Group_13__1 : rule__TransportStep__Group_13__1__Impl ;
    public final void rule__TransportStep__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4711:1: ( rule__TransportStep__Group_13__1__Impl )
            // InternalMyDsl.g:4712:2: rule__TransportStep__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_13__1"


    // $ANTLR start "rule__TransportStep__Group_13__1__Impl"
    // InternalMyDsl.g:4718:1: rule__TransportStep__Group_13__1__Impl : ( ( rule__TransportStep__InputAssignment_13_1 ) ) ;
    public final void rule__TransportStep__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4722:1: ( ( ( rule__TransportStep__InputAssignment_13_1 ) ) )
            // InternalMyDsl.g:4723:1: ( ( rule__TransportStep__InputAssignment_13_1 ) )
            {
            // InternalMyDsl.g:4723:1: ( ( rule__TransportStep__InputAssignment_13_1 ) )
            // InternalMyDsl.g:4724:2: ( rule__TransportStep__InputAssignment_13_1 )
            {
             before(grammarAccess.getTransportStepAccess().getInputAssignment_13_1()); 
            // InternalMyDsl.g:4725:2: ( rule__TransportStep__InputAssignment_13_1 )
            // InternalMyDsl.g:4725:3: rule__TransportStep__InputAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__InputAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getInputAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_13__1__Impl"


    // $ANTLR start "rule__TransportStep__Group_18__0"
    // InternalMyDsl.g:4734:1: rule__TransportStep__Group_18__0 : rule__TransportStep__Group_18__0__Impl rule__TransportStep__Group_18__1 ;
    public final void rule__TransportStep__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4738:1: ( rule__TransportStep__Group_18__0__Impl rule__TransportStep__Group_18__1 )
            // InternalMyDsl.g:4739:2: rule__TransportStep__Group_18__0__Impl rule__TransportStep__Group_18__1
            {
            pushFollow(FOLLOW_36);
            rule__TransportStep__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_18__0"


    // $ANTLR start "rule__TransportStep__Group_18__0__Impl"
    // InternalMyDsl.g:4746:1: rule__TransportStep__Group_18__0__Impl : ( ',' ) ;
    public final void rule__TransportStep__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4750:1: ( ( ',' ) )
            // InternalMyDsl.g:4751:1: ( ',' )
            {
            // InternalMyDsl.g:4751:1: ( ',' )
            // InternalMyDsl.g:4752:2: ','
            {
             before(grammarAccess.getTransportStepAccess().getCommaKeyword_18_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransportStepAccess().getCommaKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_18__0__Impl"


    // $ANTLR start "rule__TransportStep__Group_18__1"
    // InternalMyDsl.g:4761:1: rule__TransportStep__Group_18__1 : rule__TransportStep__Group_18__1__Impl ;
    public final void rule__TransportStep__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4765:1: ( rule__TransportStep__Group_18__1__Impl )
            // InternalMyDsl.g:4766:2: rule__TransportStep__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_18__1"


    // $ANTLR start "rule__TransportStep__Group_18__1__Impl"
    // InternalMyDsl.g:4772:1: rule__TransportStep__Group_18__1__Impl : ( ( rule__TransportStep__OutputAssignment_18_1 ) ) ;
    public final void rule__TransportStep__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4776:1: ( ( ( rule__TransportStep__OutputAssignment_18_1 ) ) )
            // InternalMyDsl.g:4777:1: ( ( rule__TransportStep__OutputAssignment_18_1 ) )
            {
            // InternalMyDsl.g:4777:1: ( ( rule__TransportStep__OutputAssignment_18_1 ) )
            // InternalMyDsl.g:4778:2: ( rule__TransportStep__OutputAssignment_18_1 )
            {
             before(grammarAccess.getTransportStepAccess().getOutputAssignment_18_1()); 
            // InternalMyDsl.g:4779:2: ( rule__TransportStep__OutputAssignment_18_1 )
            // InternalMyDsl.g:4779:3: rule__TransportStep__OutputAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__TransportStep__OutputAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportStepAccess().getOutputAssignment_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__Group_18__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__0"
    // InternalMyDsl.g:4788:1: rule__QualityAssuranceStep__Group__0 : rule__QualityAssuranceStep__Group__0__Impl rule__QualityAssuranceStep__Group__1 ;
    public final void rule__QualityAssuranceStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4792:1: ( rule__QualityAssuranceStep__Group__0__Impl rule__QualityAssuranceStep__Group__1 )
            // InternalMyDsl.g:4793:2: rule__QualityAssuranceStep__Group__0__Impl rule__QualityAssuranceStep__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__QualityAssuranceStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group__0__Impl"
    // InternalMyDsl.g:4800:1: rule__QualityAssuranceStep__Group__0__Impl : ( 'QualityAssuranceStep' ) ;
    public final void rule__QualityAssuranceStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4804:1: ( ( 'QualityAssuranceStep' ) )
            // InternalMyDsl.g:4805:1: ( 'QualityAssuranceStep' )
            {
            // InternalMyDsl.g:4805:1: ( 'QualityAssuranceStep' )
            // InternalMyDsl.g:4806:2: 'QualityAssuranceStep'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getQualityAssuranceStepKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getQualityAssuranceStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__1"
    // InternalMyDsl.g:4815:1: rule__QualityAssuranceStep__Group__1 : rule__QualityAssuranceStep__Group__1__Impl rule__QualityAssuranceStep__Group__2 ;
    public final void rule__QualityAssuranceStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4819:1: ( rule__QualityAssuranceStep__Group__1__Impl rule__QualityAssuranceStep__Group__2 )
            // InternalMyDsl.g:4820:2: rule__QualityAssuranceStep__Group__1__Impl rule__QualityAssuranceStep__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__QualityAssuranceStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group__1__Impl"
    // InternalMyDsl.g:4827:1: rule__QualityAssuranceStep__Group__1__Impl : ( ( rule__QualityAssuranceStep__NameAssignment_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4831:1: ( ( ( rule__QualityAssuranceStep__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4832:1: ( ( rule__QualityAssuranceStep__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4832:1: ( ( rule__QualityAssuranceStep__NameAssignment_1 ) )
            // InternalMyDsl.g:4833:2: ( rule__QualityAssuranceStep__NameAssignment_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4834:2: ( rule__QualityAssuranceStep__NameAssignment_1 )
            // InternalMyDsl.g:4834:3: rule__QualityAssuranceStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__2"
    // InternalMyDsl.g:4842:1: rule__QualityAssuranceStep__Group__2 : rule__QualityAssuranceStep__Group__2__Impl rule__QualityAssuranceStep__Group__3 ;
    public final void rule__QualityAssuranceStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4846:1: ( rule__QualityAssuranceStep__Group__2__Impl rule__QualityAssuranceStep__Group__3 )
            // InternalMyDsl.g:4847:2: rule__QualityAssuranceStep__Group__2__Impl rule__QualityAssuranceStep__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__QualityAssuranceStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__2"


    // $ANTLR start "rule__QualityAssuranceStep__Group__2__Impl"
    // InternalMyDsl.g:4854:1: rule__QualityAssuranceStep__Group__2__Impl : ( '{' ) ;
    public final void rule__QualityAssuranceStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4858:1: ( ( '{' ) )
            // InternalMyDsl.g:4859:1: ( '{' )
            {
            // InternalMyDsl.g:4859:1: ( '{' )
            // InternalMyDsl.g:4860:2: '{'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__2__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__3"
    // InternalMyDsl.g:4869:1: rule__QualityAssuranceStep__Group__3 : rule__QualityAssuranceStep__Group__3__Impl rule__QualityAssuranceStep__Group__4 ;
    public final void rule__QualityAssuranceStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4873:1: ( rule__QualityAssuranceStep__Group__3__Impl rule__QualityAssuranceStep__Group__4 )
            // InternalMyDsl.g:4874:2: rule__QualityAssuranceStep__Group__3__Impl rule__QualityAssuranceStep__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__QualityAssuranceStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__3"


    // $ANTLR start "rule__QualityAssuranceStep__Group__3__Impl"
    // InternalMyDsl.g:4881:1: rule__QualityAssuranceStep__Group__3__Impl : ( 'speed' ) ;
    public final void rule__QualityAssuranceStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4885:1: ( ( 'speed' ) )
            // InternalMyDsl.g:4886:1: ( 'speed' )
            {
            // InternalMyDsl.g:4886:1: ( 'speed' )
            // InternalMyDsl.g:4887:2: 'speed'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getSpeedKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getSpeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__3__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__4"
    // InternalMyDsl.g:4896:1: rule__QualityAssuranceStep__Group__4 : rule__QualityAssuranceStep__Group__4__Impl rule__QualityAssuranceStep__Group__5 ;
    public final void rule__QualityAssuranceStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4900:1: ( rule__QualityAssuranceStep__Group__4__Impl rule__QualityAssuranceStep__Group__5 )
            // InternalMyDsl.g:4901:2: rule__QualityAssuranceStep__Group__4__Impl rule__QualityAssuranceStep__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__QualityAssuranceStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__4"


    // $ANTLR start "rule__QualityAssuranceStep__Group__4__Impl"
    // InternalMyDsl.g:4908:1: rule__QualityAssuranceStep__Group__4__Impl : ( '=' ) ;
    public final void rule__QualityAssuranceStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4912:1: ( ( '=' ) )
            // InternalMyDsl.g:4913:1: ( '=' )
            {
            // InternalMyDsl.g:4913:1: ( '=' )
            // InternalMyDsl.g:4914:2: '='
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getEqualsSignKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__4__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__5"
    // InternalMyDsl.g:4923:1: rule__QualityAssuranceStep__Group__5 : rule__QualityAssuranceStep__Group__5__Impl rule__QualityAssuranceStep__Group__6 ;
    public final void rule__QualityAssuranceStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4927:1: ( rule__QualityAssuranceStep__Group__5__Impl rule__QualityAssuranceStep__Group__6 )
            // InternalMyDsl.g:4928:2: rule__QualityAssuranceStep__Group__5__Impl rule__QualityAssuranceStep__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__QualityAssuranceStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__5"


    // $ANTLR start "rule__QualityAssuranceStep__Group__5__Impl"
    // InternalMyDsl.g:4935:1: rule__QualityAssuranceStep__Group__5__Impl : ( ( rule__QualityAssuranceStep__SpeedAssignment_5 ) ) ;
    public final void rule__QualityAssuranceStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4939:1: ( ( ( rule__QualityAssuranceStep__SpeedAssignment_5 ) ) )
            // InternalMyDsl.g:4940:1: ( ( rule__QualityAssuranceStep__SpeedAssignment_5 ) )
            {
            // InternalMyDsl.g:4940:1: ( ( rule__QualityAssuranceStep__SpeedAssignment_5 ) )
            // InternalMyDsl.g:4941:2: ( rule__QualityAssuranceStep__SpeedAssignment_5 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getSpeedAssignment_5()); 
            // InternalMyDsl.g:4942:2: ( rule__QualityAssuranceStep__SpeedAssignment_5 )
            // InternalMyDsl.g:4942:3: rule__QualityAssuranceStep__SpeedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__SpeedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getSpeedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__5__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__6"
    // InternalMyDsl.g:4950:1: rule__QualityAssuranceStep__Group__6 : rule__QualityAssuranceStep__Group__6__Impl rule__QualityAssuranceStep__Group__7 ;
    public final void rule__QualityAssuranceStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4954:1: ( rule__QualityAssuranceStep__Group__6__Impl rule__QualityAssuranceStep__Group__7 )
            // InternalMyDsl.g:4955:2: rule__QualityAssuranceStep__Group__6__Impl rule__QualityAssuranceStep__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__QualityAssuranceStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__6"


    // $ANTLR start "rule__QualityAssuranceStep__Group__6__Impl"
    // InternalMyDsl.g:4962:1: rule__QualityAssuranceStep__Group__6__Impl : ( ( rule__QualityAssuranceStep__Group_6__0 )? ) ;
    public final void rule__QualityAssuranceStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4966:1: ( ( ( rule__QualityAssuranceStep__Group_6__0 )? ) )
            // InternalMyDsl.g:4967:1: ( ( rule__QualityAssuranceStep__Group_6__0 )? )
            {
            // InternalMyDsl.g:4967:1: ( ( rule__QualityAssuranceStep__Group_6__0 )? )
            // InternalMyDsl.g:4968:2: ( rule__QualityAssuranceStep__Group_6__0 )?
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_6()); 
            // InternalMyDsl.g:4969:2: ( rule__QualityAssuranceStep__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:4969:3: rule__QualityAssuranceStep__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualityAssuranceStep__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__6__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__7"
    // InternalMyDsl.g:4977:1: rule__QualityAssuranceStep__Group__7 : rule__QualityAssuranceStep__Group__7__Impl rule__QualityAssuranceStep__Group__8 ;
    public final void rule__QualityAssuranceStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4981:1: ( rule__QualityAssuranceStep__Group__7__Impl rule__QualityAssuranceStep__Group__8 )
            // InternalMyDsl.g:4982:2: rule__QualityAssuranceStep__Group__7__Impl rule__QualityAssuranceStep__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__QualityAssuranceStep__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__7"


    // $ANTLR start "rule__QualityAssuranceStep__Group__7__Impl"
    // InternalMyDsl.g:4989:1: rule__QualityAssuranceStep__Group__7__Impl : ( 'set' ) ;
    public final void rule__QualityAssuranceStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4993:1: ( ( 'set' ) )
            // InternalMyDsl.g:4994:1: ( 'set' )
            {
            // InternalMyDsl.g:4994:1: ( 'set' )
            // InternalMyDsl.g:4995:2: 'set'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getSetKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getSetKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__7__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__8"
    // InternalMyDsl.g:5004:1: rule__QualityAssuranceStep__Group__8 : rule__QualityAssuranceStep__Group__8__Impl rule__QualityAssuranceStep__Group__9 ;
    public final void rule__QualityAssuranceStep__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5008:1: ( rule__QualityAssuranceStep__Group__8__Impl rule__QualityAssuranceStep__Group__9 )
            // InternalMyDsl.g:5009:2: rule__QualityAssuranceStep__Group__8__Impl rule__QualityAssuranceStep__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__QualityAssuranceStep__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__8"


    // $ANTLR start "rule__QualityAssuranceStep__Group__8__Impl"
    // InternalMyDsl.g:5016:1: rule__QualityAssuranceStep__Group__8__Impl : ( 'responsible' ) ;
    public final void rule__QualityAssuranceStep__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5020:1: ( ( 'responsible' ) )
            // InternalMyDsl.g:5021:1: ( 'responsible' )
            {
            // InternalMyDsl.g:5021:1: ( 'responsible' )
            // InternalMyDsl.g:5022:2: 'responsible'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getResponsibleKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getResponsibleKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__8__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__9"
    // InternalMyDsl.g:5031:1: rule__QualityAssuranceStep__Group__9 : rule__QualityAssuranceStep__Group__9__Impl rule__QualityAssuranceStep__Group__10 ;
    public final void rule__QualityAssuranceStep__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5035:1: ( rule__QualityAssuranceStep__Group__9__Impl rule__QualityAssuranceStep__Group__10 )
            // InternalMyDsl.g:5036:2: rule__QualityAssuranceStep__Group__9__Impl rule__QualityAssuranceStep__Group__10
            {
            pushFollow(FOLLOW_32);
            rule__QualityAssuranceStep__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__9"


    // $ANTLR start "rule__QualityAssuranceStep__Group__9__Impl"
    // InternalMyDsl.g:5043:1: rule__QualityAssuranceStep__Group__9__Impl : ( ( rule__QualityAssuranceStep__ResponsibleAssignment_9 ) ) ;
    public final void rule__QualityAssuranceStep__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5047:1: ( ( ( rule__QualityAssuranceStep__ResponsibleAssignment_9 ) ) )
            // InternalMyDsl.g:5048:1: ( ( rule__QualityAssuranceStep__ResponsibleAssignment_9 ) )
            {
            // InternalMyDsl.g:5048:1: ( ( rule__QualityAssuranceStep__ResponsibleAssignment_9 ) )
            // InternalMyDsl.g:5049:2: ( rule__QualityAssuranceStep__ResponsibleAssignment_9 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getResponsibleAssignment_9()); 
            // InternalMyDsl.g:5050:2: ( rule__QualityAssuranceStep__ResponsibleAssignment_9 )
            // InternalMyDsl.g:5050:3: rule__QualityAssuranceStep__ResponsibleAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__ResponsibleAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getResponsibleAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__9__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__10"
    // InternalMyDsl.g:5058:1: rule__QualityAssuranceStep__Group__10 : rule__QualityAssuranceStep__Group__10__Impl rule__QualityAssuranceStep__Group__11 ;
    public final void rule__QualityAssuranceStep__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5062:1: ( rule__QualityAssuranceStep__Group__10__Impl rule__QualityAssuranceStep__Group__11 )
            // InternalMyDsl.g:5063:2: rule__QualityAssuranceStep__Group__10__Impl rule__QualityAssuranceStep__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__QualityAssuranceStep__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__10"


    // $ANTLR start "rule__QualityAssuranceStep__Group__10__Impl"
    // InternalMyDsl.g:5070:1: rule__QualityAssuranceStep__Group__10__Impl : ( 'input' ) ;
    public final void rule__QualityAssuranceStep__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5074:1: ( ( 'input' ) )
            // InternalMyDsl.g:5075:1: ( 'input' )
            {
            // InternalMyDsl.g:5075:1: ( 'input' )
            // InternalMyDsl.g:5076:2: 'input'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getInputKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__10__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__11"
    // InternalMyDsl.g:5085:1: rule__QualityAssuranceStep__Group__11 : rule__QualityAssuranceStep__Group__11__Impl rule__QualityAssuranceStep__Group__12 ;
    public final void rule__QualityAssuranceStep__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5089:1: ( rule__QualityAssuranceStep__Group__11__Impl rule__QualityAssuranceStep__Group__12 )
            // InternalMyDsl.g:5090:2: rule__QualityAssuranceStep__Group__11__Impl rule__QualityAssuranceStep__Group__12
            {
            pushFollow(FOLLOW_33);
            rule__QualityAssuranceStep__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__11"


    // $ANTLR start "rule__QualityAssuranceStep__Group__11__Impl"
    // InternalMyDsl.g:5097:1: rule__QualityAssuranceStep__Group__11__Impl : ( '{' ) ;
    public final void rule__QualityAssuranceStep__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5101:1: ( ( '{' ) )
            // InternalMyDsl.g:5102:1: ( '{' )
            {
            // InternalMyDsl.g:5102:1: ( '{' )
            // InternalMyDsl.g:5103:2: '{'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__11__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__12"
    // InternalMyDsl.g:5112:1: rule__QualityAssuranceStep__Group__12 : rule__QualityAssuranceStep__Group__12__Impl rule__QualityAssuranceStep__Group__13 ;
    public final void rule__QualityAssuranceStep__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5116:1: ( rule__QualityAssuranceStep__Group__12__Impl rule__QualityAssuranceStep__Group__13 )
            // InternalMyDsl.g:5117:2: rule__QualityAssuranceStep__Group__12__Impl rule__QualityAssuranceStep__Group__13
            {
            pushFollow(FOLLOW_34);
            rule__QualityAssuranceStep__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__12"


    // $ANTLR start "rule__QualityAssuranceStep__Group__12__Impl"
    // InternalMyDsl.g:5124:1: rule__QualityAssuranceStep__Group__12__Impl : ( ( rule__QualityAssuranceStep__InputAssignment_12 ) ) ;
    public final void rule__QualityAssuranceStep__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5128:1: ( ( ( rule__QualityAssuranceStep__InputAssignment_12 ) ) )
            // InternalMyDsl.g:5129:1: ( ( rule__QualityAssuranceStep__InputAssignment_12 ) )
            {
            // InternalMyDsl.g:5129:1: ( ( rule__QualityAssuranceStep__InputAssignment_12 ) )
            // InternalMyDsl.g:5130:2: ( rule__QualityAssuranceStep__InputAssignment_12 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputAssignment_12()); 
            // InternalMyDsl.g:5131:2: ( rule__QualityAssuranceStep__InputAssignment_12 )
            // InternalMyDsl.g:5131:3: rule__QualityAssuranceStep__InputAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__InputAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getInputAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__12__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__13"
    // InternalMyDsl.g:5139:1: rule__QualityAssuranceStep__Group__13 : rule__QualityAssuranceStep__Group__13__Impl rule__QualityAssuranceStep__Group__14 ;
    public final void rule__QualityAssuranceStep__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5143:1: ( rule__QualityAssuranceStep__Group__13__Impl rule__QualityAssuranceStep__Group__14 )
            // InternalMyDsl.g:5144:2: rule__QualityAssuranceStep__Group__13__Impl rule__QualityAssuranceStep__Group__14
            {
            pushFollow(FOLLOW_34);
            rule__QualityAssuranceStep__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__13"


    // $ANTLR start "rule__QualityAssuranceStep__Group__13__Impl"
    // InternalMyDsl.g:5151:1: rule__QualityAssuranceStep__Group__13__Impl : ( ( rule__QualityAssuranceStep__Group_13__0 )* ) ;
    public final void rule__QualityAssuranceStep__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5155:1: ( ( ( rule__QualityAssuranceStep__Group_13__0 )* ) )
            // InternalMyDsl.g:5156:1: ( ( rule__QualityAssuranceStep__Group_13__0 )* )
            {
            // InternalMyDsl.g:5156:1: ( ( rule__QualityAssuranceStep__Group_13__0 )* )
            // InternalMyDsl.g:5157:2: ( rule__QualityAssuranceStep__Group_13__0 )*
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_13()); 
            // InternalMyDsl.g:5158:2: ( rule__QualityAssuranceStep__Group_13__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==23) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:5158:3: rule__QualityAssuranceStep__Group_13__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualityAssuranceStep__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__13__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__14"
    // InternalMyDsl.g:5166:1: rule__QualityAssuranceStep__Group__14 : rule__QualityAssuranceStep__Group__14__Impl rule__QualityAssuranceStep__Group__15 ;
    public final void rule__QualityAssuranceStep__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5170:1: ( rule__QualityAssuranceStep__Group__14__Impl rule__QualityAssuranceStep__Group__15 )
            // InternalMyDsl.g:5171:2: rule__QualityAssuranceStep__Group__14__Impl rule__QualityAssuranceStep__Group__15
            {
            pushFollow(FOLLOW_35);
            rule__QualityAssuranceStep__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__14"


    // $ANTLR start "rule__QualityAssuranceStep__Group__14__Impl"
    // InternalMyDsl.g:5178:1: rule__QualityAssuranceStep__Group__14__Impl : ( '}' ) ;
    public final void rule__QualityAssuranceStep__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5182:1: ( ( '}' ) )
            // InternalMyDsl.g:5183:1: ( '}' )
            {
            // InternalMyDsl.g:5183:1: ( '}' )
            // InternalMyDsl.g:5184:2: '}'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__14__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__15"
    // InternalMyDsl.g:5193:1: rule__QualityAssuranceStep__Group__15 : rule__QualityAssuranceStep__Group__15__Impl rule__QualityAssuranceStep__Group__16 ;
    public final void rule__QualityAssuranceStep__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5197:1: ( rule__QualityAssuranceStep__Group__15__Impl rule__QualityAssuranceStep__Group__16 )
            // InternalMyDsl.g:5198:2: rule__QualityAssuranceStep__Group__15__Impl rule__QualityAssuranceStep__Group__16
            {
            pushFollow(FOLLOW_5);
            rule__QualityAssuranceStep__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__15"


    // $ANTLR start "rule__QualityAssuranceStep__Group__15__Impl"
    // InternalMyDsl.g:5205:1: rule__QualityAssuranceStep__Group__15__Impl : ( 'output' ) ;
    public final void rule__QualityAssuranceStep__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5209:1: ( ( 'output' ) )
            // InternalMyDsl.g:5210:1: ( 'output' )
            {
            // InternalMyDsl.g:5210:1: ( 'output' )
            // InternalMyDsl.g:5211:2: 'output'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOutputKeyword_15()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getOutputKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__15__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__16"
    // InternalMyDsl.g:5220:1: rule__QualityAssuranceStep__Group__16 : rule__QualityAssuranceStep__Group__16__Impl rule__QualityAssuranceStep__Group__17 ;
    public final void rule__QualityAssuranceStep__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5224:1: ( rule__QualityAssuranceStep__Group__16__Impl rule__QualityAssuranceStep__Group__17 )
            // InternalMyDsl.g:5225:2: rule__QualityAssuranceStep__Group__16__Impl rule__QualityAssuranceStep__Group__17
            {
            pushFollow(FOLLOW_36);
            rule__QualityAssuranceStep__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__16"


    // $ANTLR start "rule__QualityAssuranceStep__Group__16__Impl"
    // InternalMyDsl.g:5232:1: rule__QualityAssuranceStep__Group__16__Impl : ( '{' ) ;
    public final void rule__QualityAssuranceStep__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5236:1: ( ( '{' ) )
            // InternalMyDsl.g:5237:1: ( '{' )
            {
            // InternalMyDsl.g:5237:1: ( '{' )
            // InternalMyDsl.g:5238:2: '{'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getLeftCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__16__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__17"
    // InternalMyDsl.g:5247:1: rule__QualityAssuranceStep__Group__17 : rule__QualityAssuranceStep__Group__17__Impl rule__QualityAssuranceStep__Group__18 ;
    public final void rule__QualityAssuranceStep__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5251:1: ( rule__QualityAssuranceStep__Group__17__Impl rule__QualityAssuranceStep__Group__18 )
            // InternalMyDsl.g:5252:2: rule__QualityAssuranceStep__Group__17__Impl rule__QualityAssuranceStep__Group__18
            {
            pushFollow(FOLLOW_34);
            rule__QualityAssuranceStep__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__17"


    // $ANTLR start "rule__QualityAssuranceStep__Group__17__Impl"
    // InternalMyDsl.g:5259:1: rule__QualityAssuranceStep__Group__17__Impl : ( ( rule__QualityAssuranceStep__OutputAssignment_17 ) ) ;
    public final void rule__QualityAssuranceStep__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5263:1: ( ( ( rule__QualityAssuranceStep__OutputAssignment_17 ) ) )
            // InternalMyDsl.g:5264:1: ( ( rule__QualityAssuranceStep__OutputAssignment_17 ) )
            {
            // InternalMyDsl.g:5264:1: ( ( rule__QualityAssuranceStep__OutputAssignment_17 ) )
            // InternalMyDsl.g:5265:2: ( rule__QualityAssuranceStep__OutputAssignment_17 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOutputAssignment_17()); 
            // InternalMyDsl.g:5266:2: ( rule__QualityAssuranceStep__OutputAssignment_17 )
            // InternalMyDsl.g:5266:3: rule__QualityAssuranceStep__OutputAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__OutputAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getOutputAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__17__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__18"
    // InternalMyDsl.g:5274:1: rule__QualityAssuranceStep__Group__18 : rule__QualityAssuranceStep__Group__18__Impl rule__QualityAssuranceStep__Group__19 ;
    public final void rule__QualityAssuranceStep__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5278:1: ( rule__QualityAssuranceStep__Group__18__Impl rule__QualityAssuranceStep__Group__19 )
            // InternalMyDsl.g:5279:2: rule__QualityAssuranceStep__Group__18__Impl rule__QualityAssuranceStep__Group__19
            {
            pushFollow(FOLLOW_34);
            rule__QualityAssuranceStep__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__18"


    // $ANTLR start "rule__QualityAssuranceStep__Group__18__Impl"
    // InternalMyDsl.g:5286:1: rule__QualityAssuranceStep__Group__18__Impl : ( ( rule__QualityAssuranceStep__Group_18__0 )* ) ;
    public final void rule__QualityAssuranceStep__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5290:1: ( ( ( rule__QualityAssuranceStep__Group_18__0 )* ) )
            // InternalMyDsl.g:5291:1: ( ( rule__QualityAssuranceStep__Group_18__0 )* )
            {
            // InternalMyDsl.g:5291:1: ( ( rule__QualityAssuranceStep__Group_18__0 )* )
            // InternalMyDsl.g:5292:2: ( rule__QualityAssuranceStep__Group_18__0 )*
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_18()); 
            // InternalMyDsl.g:5293:2: ( rule__QualityAssuranceStep__Group_18__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==23) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:5293:3: rule__QualityAssuranceStep__Group_18__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualityAssuranceStep__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__18__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__19"
    // InternalMyDsl.g:5301:1: rule__QualityAssuranceStep__Group__19 : rule__QualityAssuranceStep__Group__19__Impl rule__QualityAssuranceStep__Group__20 ;
    public final void rule__QualityAssuranceStep__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5305:1: ( rule__QualityAssuranceStep__Group__19__Impl rule__QualityAssuranceStep__Group__20 )
            // InternalMyDsl.g:5306:2: rule__QualityAssuranceStep__Group__19__Impl rule__QualityAssuranceStep__Group__20
            {
            pushFollow(FOLLOW_24);
            rule__QualityAssuranceStep__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__19"


    // $ANTLR start "rule__QualityAssuranceStep__Group__19__Impl"
    // InternalMyDsl.g:5313:1: rule__QualityAssuranceStep__Group__19__Impl : ( '}' ) ;
    public final void rule__QualityAssuranceStep__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5317:1: ( ( '}' ) )
            // InternalMyDsl.g:5318:1: ( '}' )
            {
            // InternalMyDsl.g:5318:1: ( '}' )
            // InternalMyDsl.g:5319:2: '}'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__19__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group__20"
    // InternalMyDsl.g:5328:1: rule__QualityAssuranceStep__Group__20 : rule__QualityAssuranceStep__Group__20__Impl ;
    public final void rule__QualityAssuranceStep__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5332:1: ( rule__QualityAssuranceStep__Group__20__Impl )
            // InternalMyDsl.g:5333:2: rule__QualityAssuranceStep__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__20"


    // $ANTLR start "rule__QualityAssuranceStep__Group__20__Impl"
    // InternalMyDsl.g:5339:1: rule__QualityAssuranceStep__Group__20__Impl : ( '}' ) ;
    public final void rule__QualityAssuranceStep__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5343:1: ( ( '}' ) )
            // InternalMyDsl.g:5344:1: ( '}' )
            {
            // InternalMyDsl.g:5344:1: ( '}' )
            // InternalMyDsl.g:5345:2: '}'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_20()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group__20__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6__0"
    // InternalMyDsl.g:5355:1: rule__QualityAssuranceStep__Group_6__0 : rule__QualityAssuranceStep__Group_6__0__Impl rule__QualityAssuranceStep__Group_6__1 ;
    public final void rule__QualityAssuranceStep__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5359:1: ( rule__QualityAssuranceStep__Group_6__0__Impl rule__QualityAssuranceStep__Group_6__1 )
            // InternalMyDsl.g:5360:2: rule__QualityAssuranceStep__Group_6__0__Impl rule__QualityAssuranceStep__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__QualityAssuranceStep__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6__0__Impl"
    // InternalMyDsl.g:5367:1: rule__QualityAssuranceStep__Group_6__0__Impl : ( 'transition' ) ;
    public final void rule__QualityAssuranceStep__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5371:1: ( ( 'transition' ) )
            // InternalMyDsl.g:5372:1: ( 'transition' )
            {
            // InternalMyDsl.g:5372:1: ( 'transition' )
            // InternalMyDsl.g:5373:2: 'transition'
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6__1"
    // InternalMyDsl.g:5382:1: rule__QualityAssuranceStep__Group_6__1 : rule__QualityAssuranceStep__Group_6__1__Impl rule__QualityAssuranceStep__Group_6__2 ;
    public final void rule__QualityAssuranceStep__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5386:1: ( rule__QualityAssuranceStep__Group_6__1__Impl rule__QualityAssuranceStep__Group_6__2 )
            // InternalMyDsl.g:5387:2: rule__QualityAssuranceStep__Group_6__1__Impl rule__QualityAssuranceStep__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__QualityAssuranceStep__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6__1__Impl"
    // InternalMyDsl.g:5394:1: rule__QualityAssuranceStep__Group_6__1__Impl : ( ( rule__QualityAssuranceStep__TransitionAssignment_6_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5398:1: ( ( ( rule__QualityAssuranceStep__TransitionAssignment_6_1 ) ) )
            // InternalMyDsl.g:5399:1: ( ( rule__QualityAssuranceStep__TransitionAssignment_6_1 ) )
            {
            // InternalMyDsl.g:5399:1: ( ( rule__QualityAssuranceStep__TransitionAssignment_6_1 ) )
            // InternalMyDsl.g:5400:2: ( rule__QualityAssuranceStep__TransitionAssignment_6_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionAssignment_6_1()); 
            // InternalMyDsl.g:5401:2: ( rule__QualityAssuranceStep__TransitionAssignment_6_1 )
            // InternalMyDsl.g:5401:3: rule__QualityAssuranceStep__TransitionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__TransitionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6__2"
    // InternalMyDsl.g:5409:1: rule__QualityAssuranceStep__Group_6__2 : rule__QualityAssuranceStep__Group_6__2__Impl ;
    public final void rule__QualityAssuranceStep__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5413:1: ( rule__QualityAssuranceStep__Group_6__2__Impl )
            // InternalMyDsl.g:5414:2: rule__QualityAssuranceStep__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6__2"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6__2__Impl"
    // InternalMyDsl.g:5420:1: rule__QualityAssuranceStep__Group_6__2__Impl : ( ( rule__QualityAssuranceStep__Group_6_2__0 )* ) ;
    public final void rule__QualityAssuranceStep__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5424:1: ( ( ( rule__QualityAssuranceStep__Group_6_2__0 )* ) )
            // InternalMyDsl.g:5425:1: ( ( rule__QualityAssuranceStep__Group_6_2__0 )* )
            {
            // InternalMyDsl.g:5425:1: ( ( rule__QualityAssuranceStep__Group_6_2__0 )* )
            // InternalMyDsl.g:5426:2: ( rule__QualityAssuranceStep__Group_6_2__0 )*
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getGroup_6_2()); 
            // InternalMyDsl.g:5427:2: ( rule__QualityAssuranceStep__Group_6_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==23) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:5427:3: rule__QualityAssuranceStep__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QualityAssuranceStep__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getQualityAssuranceStepAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6__2__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6_2__0"
    // InternalMyDsl.g:5436:1: rule__QualityAssuranceStep__Group_6_2__0 : rule__QualityAssuranceStep__Group_6_2__0__Impl rule__QualityAssuranceStep__Group_6_2__1 ;
    public final void rule__QualityAssuranceStep__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5440:1: ( rule__QualityAssuranceStep__Group_6_2__0__Impl rule__QualityAssuranceStep__Group_6_2__1 )
            // InternalMyDsl.g:5441:2: rule__QualityAssuranceStep__Group_6_2__0__Impl rule__QualityAssuranceStep__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__QualityAssuranceStep__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6_2__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6_2__0__Impl"
    // InternalMyDsl.g:5448:1: rule__QualityAssuranceStep__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__QualityAssuranceStep__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5452:1: ( ( ',' ) )
            // InternalMyDsl.g:5453:1: ( ',' )
            {
            // InternalMyDsl.g:5453:1: ( ',' )
            // InternalMyDsl.g:5454:2: ','
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_6_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6_2__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6_2__1"
    // InternalMyDsl.g:5463:1: rule__QualityAssuranceStep__Group_6_2__1 : rule__QualityAssuranceStep__Group_6_2__1__Impl ;
    public final void rule__QualityAssuranceStep__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5467:1: ( rule__QualityAssuranceStep__Group_6_2__1__Impl )
            // InternalMyDsl.g:5468:2: rule__QualityAssuranceStep__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6_2__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_6_2__1__Impl"
    // InternalMyDsl.g:5474:1: rule__QualityAssuranceStep__Group_6_2__1__Impl : ( ( rule__QualityAssuranceStep__TransitionAssignment_6_2_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5478:1: ( ( ( rule__QualityAssuranceStep__TransitionAssignment_6_2_1 ) ) )
            // InternalMyDsl.g:5479:1: ( ( rule__QualityAssuranceStep__TransitionAssignment_6_2_1 ) )
            {
            // InternalMyDsl.g:5479:1: ( ( rule__QualityAssuranceStep__TransitionAssignment_6_2_1 ) )
            // InternalMyDsl.g:5480:2: ( rule__QualityAssuranceStep__TransitionAssignment_6_2_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionAssignment_6_2_1()); 
            // InternalMyDsl.g:5481:2: ( rule__QualityAssuranceStep__TransitionAssignment_6_2_1 )
            // InternalMyDsl.g:5481:3: rule__QualityAssuranceStep__TransitionAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__TransitionAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_6_2__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_13__0"
    // InternalMyDsl.g:5490:1: rule__QualityAssuranceStep__Group_13__0 : rule__QualityAssuranceStep__Group_13__0__Impl rule__QualityAssuranceStep__Group_13__1 ;
    public final void rule__QualityAssuranceStep__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5494:1: ( rule__QualityAssuranceStep__Group_13__0__Impl rule__QualityAssuranceStep__Group_13__1 )
            // InternalMyDsl.g:5495:2: rule__QualityAssuranceStep__Group_13__0__Impl rule__QualityAssuranceStep__Group_13__1
            {
            pushFollow(FOLLOW_33);
            rule__QualityAssuranceStep__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_13__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_13__0__Impl"
    // InternalMyDsl.g:5502:1: rule__QualityAssuranceStep__Group_13__0__Impl : ( ',' ) ;
    public final void rule__QualityAssuranceStep__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5506:1: ( ( ',' ) )
            // InternalMyDsl.g:5507:1: ( ',' )
            {
            // InternalMyDsl.g:5507:1: ( ',' )
            // InternalMyDsl.g:5508:2: ','
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_13_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_13__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_13__1"
    // InternalMyDsl.g:5517:1: rule__QualityAssuranceStep__Group_13__1 : rule__QualityAssuranceStep__Group_13__1__Impl ;
    public final void rule__QualityAssuranceStep__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5521:1: ( rule__QualityAssuranceStep__Group_13__1__Impl )
            // InternalMyDsl.g:5522:2: rule__QualityAssuranceStep__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_13__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_13__1__Impl"
    // InternalMyDsl.g:5528:1: rule__QualityAssuranceStep__Group_13__1__Impl : ( ( rule__QualityAssuranceStep__InputAssignment_13_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5532:1: ( ( ( rule__QualityAssuranceStep__InputAssignment_13_1 ) ) )
            // InternalMyDsl.g:5533:1: ( ( rule__QualityAssuranceStep__InputAssignment_13_1 ) )
            {
            // InternalMyDsl.g:5533:1: ( ( rule__QualityAssuranceStep__InputAssignment_13_1 ) )
            // InternalMyDsl.g:5534:2: ( rule__QualityAssuranceStep__InputAssignment_13_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputAssignment_13_1()); 
            // InternalMyDsl.g:5535:2: ( rule__QualityAssuranceStep__InputAssignment_13_1 )
            // InternalMyDsl.g:5535:3: rule__QualityAssuranceStep__InputAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__InputAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getInputAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_13__1__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_18__0"
    // InternalMyDsl.g:5544:1: rule__QualityAssuranceStep__Group_18__0 : rule__QualityAssuranceStep__Group_18__0__Impl rule__QualityAssuranceStep__Group_18__1 ;
    public final void rule__QualityAssuranceStep__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5548:1: ( rule__QualityAssuranceStep__Group_18__0__Impl rule__QualityAssuranceStep__Group_18__1 )
            // InternalMyDsl.g:5549:2: rule__QualityAssuranceStep__Group_18__0__Impl rule__QualityAssuranceStep__Group_18__1
            {
            pushFollow(FOLLOW_36);
            rule__QualityAssuranceStep__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_18__0"


    // $ANTLR start "rule__QualityAssuranceStep__Group_18__0__Impl"
    // InternalMyDsl.g:5556:1: rule__QualityAssuranceStep__Group_18__0__Impl : ( ',' ) ;
    public final void rule__QualityAssuranceStep__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5560:1: ( ( ',' ) )
            // InternalMyDsl.g:5561:1: ( ',' )
            {
            // InternalMyDsl.g:5561:1: ( ',' )
            // InternalMyDsl.g:5562:2: ','
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_18_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQualityAssuranceStepAccess().getCommaKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_18__0__Impl"


    // $ANTLR start "rule__QualityAssuranceStep__Group_18__1"
    // InternalMyDsl.g:5571:1: rule__QualityAssuranceStep__Group_18__1 : rule__QualityAssuranceStep__Group_18__1__Impl ;
    public final void rule__QualityAssuranceStep__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5575:1: ( rule__QualityAssuranceStep__Group_18__1__Impl )
            // InternalMyDsl.g:5576:2: rule__QualityAssuranceStep__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_18__1"


    // $ANTLR start "rule__QualityAssuranceStep__Group_18__1__Impl"
    // InternalMyDsl.g:5582:1: rule__QualityAssuranceStep__Group_18__1__Impl : ( ( rule__QualityAssuranceStep__OutputAssignment_18_1 ) ) ;
    public final void rule__QualityAssuranceStep__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5586:1: ( ( ( rule__QualityAssuranceStep__OutputAssignment_18_1 ) ) )
            // InternalMyDsl.g:5587:1: ( ( rule__QualityAssuranceStep__OutputAssignment_18_1 ) )
            {
            // InternalMyDsl.g:5587:1: ( ( rule__QualityAssuranceStep__OutputAssignment_18_1 ) )
            // InternalMyDsl.g:5588:2: ( rule__QualityAssuranceStep__OutputAssignment_18_1 )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOutputAssignment_18_1()); 
            // InternalMyDsl.g:5589:2: ( rule__QualityAssuranceStep__OutputAssignment_18_1 )
            // InternalMyDsl.g:5589:3: rule__QualityAssuranceStep__OutputAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__QualityAssuranceStep__OutputAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getQualityAssuranceStepAccess().getOutputAssignment_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__Group_18__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__0"
    // InternalMyDsl.g:5598:1: rule__CompositeManufacturingStep__Group__0 : rule__CompositeManufacturingStep__Group__0__Impl rule__CompositeManufacturingStep__Group__1 ;
    public final void rule__CompositeManufacturingStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5602:1: ( rule__CompositeManufacturingStep__Group__0__Impl rule__CompositeManufacturingStep__Group__1 )
            // InternalMyDsl.g:5603:2: rule__CompositeManufacturingStep__Group__0__Impl rule__CompositeManufacturingStep__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CompositeManufacturingStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__0__Impl"
    // InternalMyDsl.g:5610:1: rule__CompositeManufacturingStep__Group__0__Impl : ( 'CompositeManufacturingStep' ) ;
    public final void rule__CompositeManufacturingStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5614:1: ( ( 'CompositeManufacturingStep' ) )
            // InternalMyDsl.g:5615:1: ( 'CompositeManufacturingStep' )
            {
            // InternalMyDsl.g:5615:1: ( 'CompositeManufacturingStep' )
            // InternalMyDsl.g:5616:2: 'CompositeManufacturingStep'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getCompositeManufacturingStepKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getCompositeManufacturingStepKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__1"
    // InternalMyDsl.g:5625:1: rule__CompositeManufacturingStep__Group__1 : rule__CompositeManufacturingStep__Group__1__Impl rule__CompositeManufacturingStep__Group__2 ;
    public final void rule__CompositeManufacturingStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5629:1: ( rule__CompositeManufacturingStep__Group__1__Impl rule__CompositeManufacturingStep__Group__2 )
            // InternalMyDsl.g:5630:2: rule__CompositeManufacturingStep__Group__1__Impl rule__CompositeManufacturingStep__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CompositeManufacturingStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__1__Impl"
    // InternalMyDsl.g:5637:1: rule__CompositeManufacturingStep__Group__1__Impl : ( ( rule__CompositeManufacturingStep__NameAssignment_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5641:1: ( ( ( rule__CompositeManufacturingStep__NameAssignment_1 ) ) )
            // InternalMyDsl.g:5642:1: ( ( rule__CompositeManufacturingStep__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:5642:1: ( ( rule__CompositeManufacturingStep__NameAssignment_1 ) )
            // InternalMyDsl.g:5643:2: ( rule__CompositeManufacturingStep__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:5644:2: ( rule__CompositeManufacturingStep__NameAssignment_1 )
            // InternalMyDsl.g:5644:3: rule__CompositeManufacturingStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__2"
    // InternalMyDsl.g:5652:1: rule__CompositeManufacturingStep__Group__2 : rule__CompositeManufacturingStep__Group__2__Impl rule__CompositeManufacturingStep__Group__3 ;
    public final void rule__CompositeManufacturingStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5656:1: ( rule__CompositeManufacturingStep__Group__2__Impl rule__CompositeManufacturingStep__Group__3 )
            // InternalMyDsl.g:5657:2: rule__CompositeManufacturingStep__Group__2__Impl rule__CompositeManufacturingStep__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__CompositeManufacturingStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__2"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__2__Impl"
    // InternalMyDsl.g:5664:1: rule__CompositeManufacturingStep__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeManufacturingStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5668:1: ( ( '{' ) )
            // InternalMyDsl.g:5669:1: ( '{' )
            {
            // InternalMyDsl.g:5669:1: ( '{' )
            // InternalMyDsl.g:5670:2: '{'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__2__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__3"
    // InternalMyDsl.g:5679:1: rule__CompositeManufacturingStep__Group__3 : rule__CompositeManufacturingStep__Group__3__Impl rule__CompositeManufacturingStep__Group__4 ;
    public final void rule__CompositeManufacturingStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5683:1: ( rule__CompositeManufacturingStep__Group__3__Impl rule__CompositeManufacturingStep__Group__4 )
            // InternalMyDsl.g:5684:2: rule__CompositeManufacturingStep__Group__3__Impl rule__CompositeManufacturingStep__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__CompositeManufacturingStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__3"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__3__Impl"
    // InternalMyDsl.g:5691:1: rule__CompositeManufacturingStep__Group__3__Impl : ( 'speed' ) ;
    public final void rule__CompositeManufacturingStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5695:1: ( ( 'speed' ) )
            // InternalMyDsl.g:5696:1: ( 'speed' )
            {
            // InternalMyDsl.g:5696:1: ( 'speed' )
            // InternalMyDsl.g:5697:2: 'speed'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getSpeedKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getSpeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__3__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__4"
    // InternalMyDsl.g:5706:1: rule__CompositeManufacturingStep__Group__4 : rule__CompositeManufacturingStep__Group__4__Impl rule__CompositeManufacturingStep__Group__5 ;
    public final void rule__CompositeManufacturingStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5710:1: ( rule__CompositeManufacturingStep__Group__4__Impl rule__CompositeManufacturingStep__Group__5 )
            // InternalMyDsl.g:5711:2: rule__CompositeManufacturingStep__Group__4__Impl rule__CompositeManufacturingStep__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__CompositeManufacturingStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__4"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__4__Impl"
    // InternalMyDsl.g:5718:1: rule__CompositeManufacturingStep__Group__4__Impl : ( '=' ) ;
    public final void rule__CompositeManufacturingStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5722:1: ( ( '=' ) )
            // InternalMyDsl.g:5723:1: ( '=' )
            {
            // InternalMyDsl.g:5723:1: ( '=' )
            // InternalMyDsl.g:5724:2: '='
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getEqualsSignKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__4__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__5"
    // InternalMyDsl.g:5733:1: rule__CompositeManufacturingStep__Group__5 : rule__CompositeManufacturingStep__Group__5__Impl rule__CompositeManufacturingStep__Group__6 ;
    public final void rule__CompositeManufacturingStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5737:1: ( rule__CompositeManufacturingStep__Group__5__Impl rule__CompositeManufacturingStep__Group__6 )
            // InternalMyDsl.g:5738:2: rule__CompositeManufacturingStep__Group__5__Impl rule__CompositeManufacturingStep__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__CompositeManufacturingStep__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__5"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__5__Impl"
    // InternalMyDsl.g:5745:1: rule__CompositeManufacturingStep__Group__5__Impl : ( ( rule__CompositeManufacturingStep__SpeedAssignment_5 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5749:1: ( ( ( rule__CompositeManufacturingStep__SpeedAssignment_5 ) ) )
            // InternalMyDsl.g:5750:1: ( ( rule__CompositeManufacturingStep__SpeedAssignment_5 ) )
            {
            // InternalMyDsl.g:5750:1: ( ( rule__CompositeManufacturingStep__SpeedAssignment_5 ) )
            // InternalMyDsl.g:5751:2: ( rule__CompositeManufacturingStep__SpeedAssignment_5 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getSpeedAssignment_5()); 
            // InternalMyDsl.g:5752:2: ( rule__CompositeManufacturingStep__SpeedAssignment_5 )
            // InternalMyDsl.g:5752:3: rule__CompositeManufacturingStep__SpeedAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__SpeedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getSpeedAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__5__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__6"
    // InternalMyDsl.g:5760:1: rule__CompositeManufacturingStep__Group__6 : rule__CompositeManufacturingStep__Group__6__Impl rule__CompositeManufacturingStep__Group__7 ;
    public final void rule__CompositeManufacturingStep__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5764:1: ( rule__CompositeManufacturingStep__Group__6__Impl rule__CompositeManufacturingStep__Group__7 )
            // InternalMyDsl.g:5765:2: rule__CompositeManufacturingStep__Group__6__Impl rule__CompositeManufacturingStep__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__CompositeManufacturingStep__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__6"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__6__Impl"
    // InternalMyDsl.g:5772:1: rule__CompositeManufacturingStep__Group__6__Impl : ( ( rule__CompositeManufacturingStep__Group_6__0 )? ) ;
    public final void rule__CompositeManufacturingStep__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5776:1: ( ( ( rule__CompositeManufacturingStep__Group_6__0 )? ) )
            // InternalMyDsl.g:5777:1: ( ( rule__CompositeManufacturingStep__Group_6__0 )? )
            {
            // InternalMyDsl.g:5777:1: ( ( rule__CompositeManufacturingStep__Group_6__0 )? )
            // InternalMyDsl.g:5778:2: ( rule__CompositeManufacturingStep__Group_6__0 )?
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_6()); 
            // InternalMyDsl.g:5779:2: ( rule__CompositeManufacturingStep__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:5779:3: rule__CompositeManufacturingStep__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeManufacturingStep__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__6__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__7"
    // InternalMyDsl.g:5787:1: rule__CompositeManufacturingStep__Group__7 : rule__CompositeManufacturingStep__Group__7__Impl rule__CompositeManufacturingStep__Group__8 ;
    public final void rule__CompositeManufacturingStep__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5791:1: ( rule__CompositeManufacturingStep__Group__7__Impl rule__CompositeManufacturingStep__Group__8 )
            // InternalMyDsl.g:5792:2: rule__CompositeManufacturingStep__Group__7__Impl rule__CompositeManufacturingStep__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__CompositeManufacturingStep__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__7"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__7__Impl"
    // InternalMyDsl.g:5799:1: rule__CompositeManufacturingStep__Group__7__Impl : ( 'set' ) ;
    public final void rule__CompositeManufacturingStep__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5803:1: ( ( 'set' ) )
            // InternalMyDsl.g:5804:1: ( 'set' )
            {
            // InternalMyDsl.g:5804:1: ( 'set' )
            // InternalMyDsl.g:5805:2: 'set'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getSetKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getSetKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__7__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__8"
    // InternalMyDsl.g:5814:1: rule__CompositeManufacturingStep__Group__8 : rule__CompositeManufacturingStep__Group__8__Impl rule__CompositeManufacturingStep__Group__9 ;
    public final void rule__CompositeManufacturingStep__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5818:1: ( rule__CompositeManufacturingStep__Group__8__Impl rule__CompositeManufacturingStep__Group__9 )
            // InternalMyDsl.g:5819:2: rule__CompositeManufacturingStep__Group__8__Impl rule__CompositeManufacturingStep__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__CompositeManufacturingStep__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__8"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__8__Impl"
    // InternalMyDsl.g:5826:1: rule__CompositeManufacturingStep__Group__8__Impl : ( 'responsible' ) ;
    public final void rule__CompositeManufacturingStep__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5830:1: ( ( 'responsible' ) )
            // InternalMyDsl.g:5831:1: ( 'responsible' )
            {
            // InternalMyDsl.g:5831:1: ( 'responsible' )
            // InternalMyDsl.g:5832:2: 'responsible'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__8__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__9"
    // InternalMyDsl.g:5841:1: rule__CompositeManufacturingStep__Group__9 : rule__CompositeManufacturingStep__Group__9__Impl rule__CompositeManufacturingStep__Group__10 ;
    public final void rule__CompositeManufacturingStep__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5845:1: ( rule__CompositeManufacturingStep__Group__9__Impl rule__CompositeManufacturingStep__Group__10 )
            // InternalMyDsl.g:5846:2: rule__CompositeManufacturingStep__Group__9__Impl rule__CompositeManufacturingStep__Group__10
            {
            pushFollow(FOLLOW_32);
            rule__CompositeManufacturingStep__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__9"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__9__Impl"
    // InternalMyDsl.g:5853:1: rule__CompositeManufacturingStep__Group__9__Impl : ( ( rule__CompositeManufacturingStep__ResponsibleAssignment_9 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5857:1: ( ( ( rule__CompositeManufacturingStep__ResponsibleAssignment_9 ) ) )
            // InternalMyDsl.g:5858:1: ( ( rule__CompositeManufacturingStep__ResponsibleAssignment_9 ) )
            {
            // InternalMyDsl.g:5858:1: ( ( rule__CompositeManufacturingStep__ResponsibleAssignment_9 ) )
            // InternalMyDsl.g:5859:2: ( rule__CompositeManufacturingStep__ResponsibleAssignment_9 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleAssignment_9()); 
            // InternalMyDsl.g:5860:2: ( rule__CompositeManufacturingStep__ResponsibleAssignment_9 )
            // InternalMyDsl.g:5860:3: rule__CompositeManufacturingStep__ResponsibleAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__ResponsibleAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__9__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__10"
    // InternalMyDsl.g:5868:1: rule__CompositeManufacturingStep__Group__10 : rule__CompositeManufacturingStep__Group__10__Impl rule__CompositeManufacturingStep__Group__11 ;
    public final void rule__CompositeManufacturingStep__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5872:1: ( rule__CompositeManufacturingStep__Group__10__Impl rule__CompositeManufacturingStep__Group__11 )
            // InternalMyDsl.g:5873:2: rule__CompositeManufacturingStep__Group__10__Impl rule__CompositeManufacturingStep__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__CompositeManufacturingStep__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__10"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__10__Impl"
    // InternalMyDsl.g:5880:1: rule__CompositeManufacturingStep__Group__10__Impl : ( 'input' ) ;
    public final void rule__CompositeManufacturingStep__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5884:1: ( ( 'input' ) )
            // InternalMyDsl.g:5885:1: ( 'input' )
            {
            // InternalMyDsl.g:5885:1: ( 'input' )
            // InternalMyDsl.g:5886:2: 'input'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getInputKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__10__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__11"
    // InternalMyDsl.g:5895:1: rule__CompositeManufacturingStep__Group__11 : rule__CompositeManufacturingStep__Group__11__Impl rule__CompositeManufacturingStep__Group__12 ;
    public final void rule__CompositeManufacturingStep__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5899:1: ( rule__CompositeManufacturingStep__Group__11__Impl rule__CompositeManufacturingStep__Group__12 )
            // InternalMyDsl.g:5900:2: rule__CompositeManufacturingStep__Group__11__Impl rule__CompositeManufacturingStep__Group__12
            {
            pushFollow(FOLLOW_33);
            rule__CompositeManufacturingStep__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__11"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__11__Impl"
    // InternalMyDsl.g:5907:1: rule__CompositeManufacturingStep__Group__11__Impl : ( '{' ) ;
    public final void rule__CompositeManufacturingStep__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5911:1: ( ( '{' ) )
            // InternalMyDsl.g:5912:1: ( '{' )
            {
            // InternalMyDsl.g:5912:1: ( '{' )
            // InternalMyDsl.g:5913:2: '{'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__11__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__12"
    // InternalMyDsl.g:5922:1: rule__CompositeManufacturingStep__Group__12 : rule__CompositeManufacturingStep__Group__12__Impl rule__CompositeManufacturingStep__Group__13 ;
    public final void rule__CompositeManufacturingStep__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5926:1: ( rule__CompositeManufacturingStep__Group__12__Impl rule__CompositeManufacturingStep__Group__13 )
            // InternalMyDsl.g:5927:2: rule__CompositeManufacturingStep__Group__12__Impl rule__CompositeManufacturingStep__Group__13
            {
            pushFollow(FOLLOW_34);
            rule__CompositeManufacturingStep__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__12"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__12__Impl"
    // InternalMyDsl.g:5934:1: rule__CompositeManufacturingStep__Group__12__Impl : ( ( rule__CompositeManufacturingStep__InputAssignment_12 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5938:1: ( ( ( rule__CompositeManufacturingStep__InputAssignment_12 ) ) )
            // InternalMyDsl.g:5939:1: ( ( rule__CompositeManufacturingStep__InputAssignment_12 ) )
            {
            // InternalMyDsl.g:5939:1: ( ( rule__CompositeManufacturingStep__InputAssignment_12 ) )
            // InternalMyDsl.g:5940:2: ( rule__CompositeManufacturingStep__InputAssignment_12 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputAssignment_12()); 
            // InternalMyDsl.g:5941:2: ( rule__CompositeManufacturingStep__InputAssignment_12 )
            // InternalMyDsl.g:5941:3: rule__CompositeManufacturingStep__InputAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__InputAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getInputAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__12__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__13"
    // InternalMyDsl.g:5949:1: rule__CompositeManufacturingStep__Group__13 : rule__CompositeManufacturingStep__Group__13__Impl rule__CompositeManufacturingStep__Group__14 ;
    public final void rule__CompositeManufacturingStep__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5953:1: ( rule__CompositeManufacturingStep__Group__13__Impl rule__CompositeManufacturingStep__Group__14 )
            // InternalMyDsl.g:5954:2: rule__CompositeManufacturingStep__Group__13__Impl rule__CompositeManufacturingStep__Group__14
            {
            pushFollow(FOLLOW_34);
            rule__CompositeManufacturingStep__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__13"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__13__Impl"
    // InternalMyDsl.g:5961:1: rule__CompositeManufacturingStep__Group__13__Impl : ( ( rule__CompositeManufacturingStep__Group_13__0 )* ) ;
    public final void rule__CompositeManufacturingStep__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5965:1: ( ( ( rule__CompositeManufacturingStep__Group_13__0 )* ) )
            // InternalMyDsl.g:5966:1: ( ( rule__CompositeManufacturingStep__Group_13__0 )* )
            {
            // InternalMyDsl.g:5966:1: ( ( rule__CompositeManufacturingStep__Group_13__0 )* )
            // InternalMyDsl.g:5967:2: ( rule__CompositeManufacturingStep__Group_13__0 )*
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_13()); 
            // InternalMyDsl.g:5968:2: ( rule__CompositeManufacturingStep__Group_13__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==23) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:5968:3: rule__CompositeManufacturingStep__Group_13__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CompositeManufacturingStep__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__13__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__14"
    // InternalMyDsl.g:5976:1: rule__CompositeManufacturingStep__Group__14 : rule__CompositeManufacturingStep__Group__14__Impl rule__CompositeManufacturingStep__Group__15 ;
    public final void rule__CompositeManufacturingStep__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5980:1: ( rule__CompositeManufacturingStep__Group__14__Impl rule__CompositeManufacturingStep__Group__15 )
            // InternalMyDsl.g:5981:2: rule__CompositeManufacturingStep__Group__14__Impl rule__CompositeManufacturingStep__Group__15
            {
            pushFollow(FOLLOW_35);
            rule__CompositeManufacturingStep__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__14"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__14__Impl"
    // InternalMyDsl.g:5988:1: rule__CompositeManufacturingStep__Group__14__Impl : ( '}' ) ;
    public final void rule__CompositeManufacturingStep__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5992:1: ( ( '}' ) )
            // InternalMyDsl.g:5993:1: ( '}' )
            {
            // InternalMyDsl.g:5993:1: ( '}' )
            // InternalMyDsl.g:5994:2: '}'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_14()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__14__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__15"
    // InternalMyDsl.g:6003:1: rule__CompositeManufacturingStep__Group__15 : rule__CompositeManufacturingStep__Group__15__Impl rule__CompositeManufacturingStep__Group__16 ;
    public final void rule__CompositeManufacturingStep__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6007:1: ( rule__CompositeManufacturingStep__Group__15__Impl rule__CompositeManufacturingStep__Group__16 )
            // InternalMyDsl.g:6008:2: rule__CompositeManufacturingStep__Group__15__Impl rule__CompositeManufacturingStep__Group__16
            {
            pushFollow(FOLLOW_5);
            rule__CompositeManufacturingStep__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__15"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__15__Impl"
    // InternalMyDsl.g:6015:1: rule__CompositeManufacturingStep__Group__15__Impl : ( 'output' ) ;
    public final void rule__CompositeManufacturingStep__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6019:1: ( ( 'output' ) )
            // InternalMyDsl.g:6020:1: ( 'output' )
            {
            // InternalMyDsl.g:6020:1: ( 'output' )
            // InternalMyDsl.g:6021:2: 'output'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOutputKeyword_15()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getOutputKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__15__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__16"
    // InternalMyDsl.g:6030:1: rule__CompositeManufacturingStep__Group__16 : rule__CompositeManufacturingStep__Group__16__Impl rule__CompositeManufacturingStep__Group__17 ;
    public final void rule__CompositeManufacturingStep__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6034:1: ( rule__CompositeManufacturingStep__Group__16__Impl rule__CompositeManufacturingStep__Group__17 )
            // InternalMyDsl.g:6035:2: rule__CompositeManufacturingStep__Group__16__Impl rule__CompositeManufacturingStep__Group__17
            {
            pushFollow(FOLLOW_36);
            rule__CompositeManufacturingStep__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__16"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__16__Impl"
    // InternalMyDsl.g:6042:1: rule__CompositeManufacturingStep__Group__16__Impl : ( '{' ) ;
    public final void rule__CompositeManufacturingStep__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6046:1: ( ( '{' ) )
            // InternalMyDsl.g:6047:1: ( '{' )
            {
            // InternalMyDsl.g:6047:1: ( '{' )
            // InternalMyDsl.g:6048:2: '{'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getLeftCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__16__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__17"
    // InternalMyDsl.g:6057:1: rule__CompositeManufacturingStep__Group__17 : rule__CompositeManufacturingStep__Group__17__Impl rule__CompositeManufacturingStep__Group__18 ;
    public final void rule__CompositeManufacturingStep__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6061:1: ( rule__CompositeManufacturingStep__Group__17__Impl rule__CompositeManufacturingStep__Group__18 )
            // InternalMyDsl.g:6062:2: rule__CompositeManufacturingStep__Group__17__Impl rule__CompositeManufacturingStep__Group__18
            {
            pushFollow(FOLLOW_34);
            rule__CompositeManufacturingStep__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__17"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__17__Impl"
    // InternalMyDsl.g:6069:1: rule__CompositeManufacturingStep__Group__17__Impl : ( ( rule__CompositeManufacturingStep__OutputAssignment_17 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6073:1: ( ( ( rule__CompositeManufacturingStep__OutputAssignment_17 ) ) )
            // InternalMyDsl.g:6074:1: ( ( rule__CompositeManufacturingStep__OutputAssignment_17 ) )
            {
            // InternalMyDsl.g:6074:1: ( ( rule__CompositeManufacturingStep__OutputAssignment_17 ) )
            // InternalMyDsl.g:6075:2: ( rule__CompositeManufacturingStep__OutputAssignment_17 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOutputAssignment_17()); 
            // InternalMyDsl.g:6076:2: ( rule__CompositeManufacturingStep__OutputAssignment_17 )
            // InternalMyDsl.g:6076:3: rule__CompositeManufacturingStep__OutputAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__OutputAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getOutputAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__17__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__18"
    // InternalMyDsl.g:6084:1: rule__CompositeManufacturingStep__Group__18 : rule__CompositeManufacturingStep__Group__18__Impl rule__CompositeManufacturingStep__Group__19 ;
    public final void rule__CompositeManufacturingStep__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6088:1: ( rule__CompositeManufacturingStep__Group__18__Impl rule__CompositeManufacturingStep__Group__19 )
            // InternalMyDsl.g:6089:2: rule__CompositeManufacturingStep__Group__18__Impl rule__CompositeManufacturingStep__Group__19
            {
            pushFollow(FOLLOW_34);
            rule__CompositeManufacturingStep__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__18"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__18__Impl"
    // InternalMyDsl.g:6096:1: rule__CompositeManufacturingStep__Group__18__Impl : ( ( rule__CompositeManufacturingStep__Group_18__0 )* ) ;
    public final void rule__CompositeManufacturingStep__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6100:1: ( ( ( rule__CompositeManufacturingStep__Group_18__0 )* ) )
            // InternalMyDsl.g:6101:1: ( ( rule__CompositeManufacturingStep__Group_18__0 )* )
            {
            // InternalMyDsl.g:6101:1: ( ( rule__CompositeManufacturingStep__Group_18__0 )* )
            // InternalMyDsl.g:6102:2: ( rule__CompositeManufacturingStep__Group_18__0 )*
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_18()); 
            // InternalMyDsl.g:6103:2: ( rule__CompositeManufacturingStep__Group_18__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==23) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMyDsl.g:6103:3: rule__CompositeManufacturingStep__Group_18__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CompositeManufacturingStep__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__18__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__19"
    // InternalMyDsl.g:6111:1: rule__CompositeManufacturingStep__Group__19 : rule__CompositeManufacturingStep__Group__19__Impl rule__CompositeManufacturingStep__Group__20 ;
    public final void rule__CompositeManufacturingStep__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6115:1: ( rule__CompositeManufacturingStep__Group__19__Impl rule__CompositeManufacturingStep__Group__20 )
            // InternalMyDsl.g:6116:2: rule__CompositeManufacturingStep__Group__19__Impl rule__CompositeManufacturingStep__Group__20
            {
            pushFollow(FOLLOW_37);
            rule__CompositeManufacturingStep__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__19"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__19__Impl"
    // InternalMyDsl.g:6123:1: rule__CompositeManufacturingStep__Group__19__Impl : ( '}' ) ;
    public final void rule__CompositeManufacturingStep__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6127:1: ( ( '}' ) )
            // InternalMyDsl.g:6128:1: ( '}' )
            {
            // InternalMyDsl.g:6128:1: ( '}' )
            // InternalMyDsl.g:6129:2: '}'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__19__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__20"
    // InternalMyDsl.g:6138:1: rule__CompositeManufacturingStep__Group__20 : rule__CompositeManufacturingStep__Group__20__Impl rule__CompositeManufacturingStep__Group__21 ;
    public final void rule__CompositeManufacturingStep__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6142:1: ( rule__CompositeManufacturingStep__Group__20__Impl rule__CompositeManufacturingStep__Group__21 )
            // InternalMyDsl.g:6143:2: rule__CompositeManufacturingStep__Group__20__Impl rule__CompositeManufacturingStep__Group__21
            {
            pushFollow(FOLLOW_38);
            rule__CompositeManufacturingStep__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__20"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__20__Impl"
    // InternalMyDsl.g:6150:1: rule__CompositeManufacturingStep__Group__20__Impl : ( 'contains' ) ;
    public final void rule__CompositeManufacturingStep__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6154:1: ( ( 'contains' ) )
            // InternalMyDsl.g:6155:1: ( 'contains' )
            {
            // InternalMyDsl.g:6155:1: ( 'contains' )
            // InternalMyDsl.g:6156:2: 'contains'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getContainsKeyword_20()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getContainsKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__20__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__21"
    // InternalMyDsl.g:6165:1: rule__CompositeManufacturingStep__Group__21 : rule__CompositeManufacturingStep__Group__21__Impl rule__CompositeManufacturingStep__Group__22 ;
    public final void rule__CompositeManufacturingStep__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6169:1: ( rule__CompositeManufacturingStep__Group__21__Impl rule__CompositeManufacturingStep__Group__22 )
            // InternalMyDsl.g:6170:2: rule__CompositeManufacturingStep__Group__21__Impl rule__CompositeManufacturingStep__Group__22
            {
            pushFollow(FOLLOW_24);
            rule__CompositeManufacturingStep__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__21"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__21__Impl"
    // InternalMyDsl.g:6177:1: rule__CompositeManufacturingStep__Group__21__Impl : ( ( rule__CompositeManufacturingStep__ContainsAssignment_21 ) ) ;
    public final void rule__CompositeManufacturingStep__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6181:1: ( ( ( rule__CompositeManufacturingStep__ContainsAssignment_21 ) ) )
            // InternalMyDsl.g:6182:1: ( ( rule__CompositeManufacturingStep__ContainsAssignment_21 ) )
            {
            // InternalMyDsl.g:6182:1: ( ( rule__CompositeManufacturingStep__ContainsAssignment_21 ) )
            // InternalMyDsl.g:6183:2: ( rule__CompositeManufacturingStep__ContainsAssignment_21 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getContainsAssignment_21()); 
            // InternalMyDsl.g:6184:2: ( rule__CompositeManufacturingStep__ContainsAssignment_21 )
            // InternalMyDsl.g:6184:3: rule__CompositeManufacturingStep__ContainsAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__ContainsAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getContainsAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__21__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__22"
    // InternalMyDsl.g:6192:1: rule__CompositeManufacturingStep__Group__22 : rule__CompositeManufacturingStep__Group__22__Impl ;
    public final void rule__CompositeManufacturingStep__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6196:1: ( rule__CompositeManufacturingStep__Group__22__Impl )
            // InternalMyDsl.g:6197:2: rule__CompositeManufacturingStep__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__22"


    // $ANTLR start "rule__CompositeManufacturingStep__Group__22__Impl"
    // InternalMyDsl.g:6203:1: rule__CompositeManufacturingStep__Group__22__Impl : ( '}' ) ;
    public final void rule__CompositeManufacturingStep__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6207:1: ( ( '}' ) )
            // InternalMyDsl.g:6208:1: ( '}' )
            {
            // InternalMyDsl.g:6208:1: ( '}' )
            // InternalMyDsl.g:6209:2: '}'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_22()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group__22__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6__0"
    // InternalMyDsl.g:6219:1: rule__CompositeManufacturingStep__Group_6__0 : rule__CompositeManufacturingStep__Group_6__0__Impl rule__CompositeManufacturingStep__Group_6__1 ;
    public final void rule__CompositeManufacturingStep__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6223:1: ( rule__CompositeManufacturingStep__Group_6__0__Impl rule__CompositeManufacturingStep__Group_6__1 )
            // InternalMyDsl.g:6224:2: rule__CompositeManufacturingStep__Group_6__0__Impl rule__CompositeManufacturingStep__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__CompositeManufacturingStep__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6__0__Impl"
    // InternalMyDsl.g:6231:1: rule__CompositeManufacturingStep__Group_6__0__Impl : ( 'transition' ) ;
    public final void rule__CompositeManufacturingStep__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6235:1: ( ( 'transition' ) )
            // InternalMyDsl.g:6236:1: ( 'transition' )
            {
            // InternalMyDsl.g:6236:1: ( 'transition' )
            // InternalMyDsl.g:6237:2: 'transition'
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6__1"
    // InternalMyDsl.g:6246:1: rule__CompositeManufacturingStep__Group_6__1 : rule__CompositeManufacturingStep__Group_6__1__Impl rule__CompositeManufacturingStep__Group_6__2 ;
    public final void rule__CompositeManufacturingStep__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6250:1: ( rule__CompositeManufacturingStep__Group_6__1__Impl rule__CompositeManufacturingStep__Group_6__2 )
            // InternalMyDsl.g:6251:2: rule__CompositeManufacturingStep__Group_6__1__Impl rule__CompositeManufacturingStep__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__CompositeManufacturingStep__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6__1__Impl"
    // InternalMyDsl.g:6258:1: rule__CompositeManufacturingStep__Group_6__1__Impl : ( ( rule__CompositeManufacturingStep__TransitionAssignment_6_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6262:1: ( ( ( rule__CompositeManufacturingStep__TransitionAssignment_6_1 ) ) )
            // InternalMyDsl.g:6263:1: ( ( rule__CompositeManufacturingStep__TransitionAssignment_6_1 ) )
            {
            // InternalMyDsl.g:6263:1: ( ( rule__CompositeManufacturingStep__TransitionAssignment_6_1 ) )
            // InternalMyDsl.g:6264:2: ( rule__CompositeManufacturingStep__TransitionAssignment_6_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionAssignment_6_1()); 
            // InternalMyDsl.g:6265:2: ( rule__CompositeManufacturingStep__TransitionAssignment_6_1 )
            // InternalMyDsl.g:6265:3: rule__CompositeManufacturingStep__TransitionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__TransitionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6__2"
    // InternalMyDsl.g:6273:1: rule__CompositeManufacturingStep__Group_6__2 : rule__CompositeManufacturingStep__Group_6__2__Impl ;
    public final void rule__CompositeManufacturingStep__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6277:1: ( rule__CompositeManufacturingStep__Group_6__2__Impl )
            // InternalMyDsl.g:6278:2: rule__CompositeManufacturingStep__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6__2"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6__2__Impl"
    // InternalMyDsl.g:6284:1: rule__CompositeManufacturingStep__Group_6__2__Impl : ( ( rule__CompositeManufacturingStep__Group_6_2__0 )* ) ;
    public final void rule__CompositeManufacturingStep__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6288:1: ( ( ( rule__CompositeManufacturingStep__Group_6_2__0 )* ) )
            // InternalMyDsl.g:6289:1: ( ( rule__CompositeManufacturingStep__Group_6_2__0 )* )
            {
            // InternalMyDsl.g:6289:1: ( ( rule__CompositeManufacturingStep__Group_6_2__0 )* )
            // InternalMyDsl.g:6290:2: ( rule__CompositeManufacturingStep__Group_6_2__0 )*
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getGroup_6_2()); 
            // InternalMyDsl.g:6291:2: ( rule__CompositeManufacturingStep__Group_6_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==23) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:6291:3: rule__CompositeManufacturingStep__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__CompositeManufacturingStep__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getCompositeManufacturingStepAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6__2__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6_2__0"
    // InternalMyDsl.g:6300:1: rule__CompositeManufacturingStep__Group_6_2__0 : rule__CompositeManufacturingStep__Group_6_2__0__Impl rule__CompositeManufacturingStep__Group_6_2__1 ;
    public final void rule__CompositeManufacturingStep__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6304:1: ( rule__CompositeManufacturingStep__Group_6_2__0__Impl rule__CompositeManufacturingStep__Group_6_2__1 )
            // InternalMyDsl.g:6305:2: rule__CompositeManufacturingStep__Group_6_2__0__Impl rule__CompositeManufacturingStep__Group_6_2__1
            {
            pushFollow(FOLLOW_4);
            rule__CompositeManufacturingStep__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6_2__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6_2__0__Impl"
    // InternalMyDsl.g:6312:1: rule__CompositeManufacturingStep__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeManufacturingStep__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6316:1: ( ( ',' ) )
            // InternalMyDsl.g:6317:1: ( ',' )
            {
            // InternalMyDsl.g:6317:1: ( ',' )
            // InternalMyDsl.g:6318:2: ','
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_6_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6_2__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6_2__1"
    // InternalMyDsl.g:6327:1: rule__CompositeManufacturingStep__Group_6_2__1 : rule__CompositeManufacturingStep__Group_6_2__1__Impl ;
    public final void rule__CompositeManufacturingStep__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6331:1: ( rule__CompositeManufacturingStep__Group_6_2__1__Impl )
            // InternalMyDsl.g:6332:2: rule__CompositeManufacturingStep__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6_2__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_6_2__1__Impl"
    // InternalMyDsl.g:6338:1: rule__CompositeManufacturingStep__Group_6_2__1__Impl : ( ( rule__CompositeManufacturingStep__TransitionAssignment_6_2_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6342:1: ( ( ( rule__CompositeManufacturingStep__TransitionAssignment_6_2_1 ) ) )
            // InternalMyDsl.g:6343:1: ( ( rule__CompositeManufacturingStep__TransitionAssignment_6_2_1 ) )
            {
            // InternalMyDsl.g:6343:1: ( ( rule__CompositeManufacturingStep__TransitionAssignment_6_2_1 ) )
            // InternalMyDsl.g:6344:2: ( rule__CompositeManufacturingStep__TransitionAssignment_6_2_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionAssignment_6_2_1()); 
            // InternalMyDsl.g:6345:2: ( rule__CompositeManufacturingStep__TransitionAssignment_6_2_1 )
            // InternalMyDsl.g:6345:3: rule__CompositeManufacturingStep__TransitionAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__TransitionAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_6_2__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_13__0"
    // InternalMyDsl.g:6354:1: rule__CompositeManufacturingStep__Group_13__0 : rule__CompositeManufacturingStep__Group_13__0__Impl rule__CompositeManufacturingStep__Group_13__1 ;
    public final void rule__CompositeManufacturingStep__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6358:1: ( rule__CompositeManufacturingStep__Group_13__0__Impl rule__CompositeManufacturingStep__Group_13__1 )
            // InternalMyDsl.g:6359:2: rule__CompositeManufacturingStep__Group_13__0__Impl rule__CompositeManufacturingStep__Group_13__1
            {
            pushFollow(FOLLOW_33);
            rule__CompositeManufacturingStep__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_13__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_13__0__Impl"
    // InternalMyDsl.g:6366:1: rule__CompositeManufacturingStep__Group_13__0__Impl : ( ',' ) ;
    public final void rule__CompositeManufacturingStep__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6370:1: ( ( ',' ) )
            // InternalMyDsl.g:6371:1: ( ',' )
            {
            // InternalMyDsl.g:6371:1: ( ',' )
            // InternalMyDsl.g:6372:2: ','
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_13_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_13__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_13__1"
    // InternalMyDsl.g:6381:1: rule__CompositeManufacturingStep__Group_13__1 : rule__CompositeManufacturingStep__Group_13__1__Impl ;
    public final void rule__CompositeManufacturingStep__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6385:1: ( rule__CompositeManufacturingStep__Group_13__1__Impl )
            // InternalMyDsl.g:6386:2: rule__CompositeManufacturingStep__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_13__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_13__1__Impl"
    // InternalMyDsl.g:6392:1: rule__CompositeManufacturingStep__Group_13__1__Impl : ( ( rule__CompositeManufacturingStep__InputAssignment_13_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6396:1: ( ( ( rule__CompositeManufacturingStep__InputAssignment_13_1 ) ) )
            // InternalMyDsl.g:6397:1: ( ( rule__CompositeManufacturingStep__InputAssignment_13_1 ) )
            {
            // InternalMyDsl.g:6397:1: ( ( rule__CompositeManufacturingStep__InputAssignment_13_1 ) )
            // InternalMyDsl.g:6398:2: ( rule__CompositeManufacturingStep__InputAssignment_13_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputAssignment_13_1()); 
            // InternalMyDsl.g:6399:2: ( rule__CompositeManufacturingStep__InputAssignment_13_1 )
            // InternalMyDsl.g:6399:3: rule__CompositeManufacturingStep__InputAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__InputAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getInputAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_13__1__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_18__0"
    // InternalMyDsl.g:6408:1: rule__CompositeManufacturingStep__Group_18__0 : rule__CompositeManufacturingStep__Group_18__0__Impl rule__CompositeManufacturingStep__Group_18__1 ;
    public final void rule__CompositeManufacturingStep__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6412:1: ( rule__CompositeManufacturingStep__Group_18__0__Impl rule__CompositeManufacturingStep__Group_18__1 )
            // InternalMyDsl.g:6413:2: rule__CompositeManufacturingStep__Group_18__0__Impl rule__CompositeManufacturingStep__Group_18__1
            {
            pushFollow(FOLLOW_36);
            rule__CompositeManufacturingStep__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_18__0"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_18__0__Impl"
    // InternalMyDsl.g:6420:1: rule__CompositeManufacturingStep__Group_18__0__Impl : ( ',' ) ;
    public final void rule__CompositeManufacturingStep__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6424:1: ( ( ',' ) )
            // InternalMyDsl.g:6425:1: ( ',' )
            {
            // InternalMyDsl.g:6425:1: ( ',' )
            // InternalMyDsl.g:6426:2: ','
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_18_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCompositeManufacturingStepAccess().getCommaKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_18__0__Impl"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_18__1"
    // InternalMyDsl.g:6435:1: rule__CompositeManufacturingStep__Group_18__1 : rule__CompositeManufacturingStep__Group_18__1__Impl ;
    public final void rule__CompositeManufacturingStep__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6439:1: ( rule__CompositeManufacturingStep__Group_18__1__Impl )
            // InternalMyDsl.g:6440:2: rule__CompositeManufacturingStep__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_18__1"


    // $ANTLR start "rule__CompositeManufacturingStep__Group_18__1__Impl"
    // InternalMyDsl.g:6446:1: rule__CompositeManufacturingStep__Group_18__1__Impl : ( ( rule__CompositeManufacturingStep__OutputAssignment_18_1 ) ) ;
    public final void rule__CompositeManufacturingStep__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6450:1: ( ( ( rule__CompositeManufacturingStep__OutputAssignment_18_1 ) ) )
            // InternalMyDsl.g:6451:1: ( ( rule__CompositeManufacturingStep__OutputAssignment_18_1 ) )
            {
            // InternalMyDsl.g:6451:1: ( ( rule__CompositeManufacturingStep__OutputAssignment_18_1 ) )
            // InternalMyDsl.g:6452:2: ( rule__CompositeManufacturingStep__OutputAssignment_18_1 )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOutputAssignment_18_1()); 
            // InternalMyDsl.g:6453:2: ( rule__CompositeManufacturingStep__OutputAssignment_18_1 )
            // InternalMyDsl.g:6453:3: rule__CompositeManufacturingStep__OutputAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeManufacturingStep__OutputAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getOutputAssignment_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__Group_18__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:6462:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6466:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:6467:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:6474:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6478:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:6479:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:6479:1: ( ( '-' )? )
            // InternalMyDsl.g:6480:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:6481:2: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:6481:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:6489:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6493:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:6494:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:6500:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6504:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:6505:1: ( RULE_INT )
            {
            // InternalMyDsl.g:6505:1: ( RULE_INT )
            // InternalMyDsl.g:6506:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__InputCondition_Impl__Group__0"
    // InternalMyDsl.g:6516:1: rule__InputCondition_Impl__Group__0 : rule__InputCondition_Impl__Group__0__Impl rule__InputCondition_Impl__Group__1 ;
    public final void rule__InputCondition_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6520:1: ( rule__InputCondition_Impl__Group__0__Impl rule__InputCondition_Impl__Group__1 )
            // InternalMyDsl.g:6521:2: rule__InputCondition_Impl__Group__0__Impl rule__InputCondition_Impl__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__InputCondition_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__Group__0"


    // $ANTLR start "rule__InputCondition_Impl__Group__0__Impl"
    // InternalMyDsl.g:6528:1: rule__InputCondition_Impl__Group__0__Impl : ( () ) ;
    public final void rule__InputCondition_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6532:1: ( ( () ) )
            // InternalMyDsl.g:6533:1: ( () )
            {
            // InternalMyDsl.g:6533:1: ( () )
            // InternalMyDsl.g:6534:2: ()
            {
             before(grammarAccess.getInputCondition_ImplAccess().getInputConditionAction_0()); 
            // InternalMyDsl.g:6535:2: ()
            // InternalMyDsl.g:6535:3: 
            {
            }

             after(grammarAccess.getInputCondition_ImplAccess().getInputConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__Group__0__Impl"


    // $ANTLR start "rule__InputCondition_Impl__Group__1"
    // InternalMyDsl.g:6543:1: rule__InputCondition_Impl__Group__1 : rule__InputCondition_Impl__Group__1__Impl rule__InputCondition_Impl__Group__2 ;
    public final void rule__InputCondition_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6547:1: ( rule__InputCondition_Impl__Group__1__Impl rule__InputCondition_Impl__Group__2 )
            // InternalMyDsl.g:6548:2: rule__InputCondition_Impl__Group__1__Impl rule__InputCondition_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InputCondition_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__Group__1"


    // $ANTLR start "rule__InputCondition_Impl__Group__1__Impl"
    // InternalMyDsl.g:6555:1: rule__InputCondition_Impl__Group__1__Impl : ( 'InputCondition' ) ;
    public final void rule__InputCondition_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6559:1: ( ( 'InputCondition' ) )
            // InternalMyDsl.g:6560:1: ( 'InputCondition' )
            {
            // InternalMyDsl.g:6560:1: ( 'InputCondition' )
            // InternalMyDsl.g:6561:2: 'InputCondition'
            {
             before(grammarAccess.getInputCondition_ImplAccess().getInputConditionKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getInputCondition_ImplAccess().getInputConditionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__Group__1__Impl"


    // $ANTLR start "rule__InputCondition_Impl__Group__2"
    // InternalMyDsl.g:6570:1: rule__InputCondition_Impl__Group__2 : rule__InputCondition_Impl__Group__2__Impl ;
    public final void rule__InputCondition_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6574:1: ( rule__InputCondition_Impl__Group__2__Impl )
            // InternalMyDsl.g:6575:2: rule__InputCondition_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__Group__2"


    // $ANTLR start "rule__InputCondition_Impl__Group__2__Impl"
    // InternalMyDsl.g:6581:1: rule__InputCondition_Impl__Group__2__Impl : ( ( rule__InputCondition_Impl__NameAssignment_2 ) ) ;
    public final void rule__InputCondition_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6585:1: ( ( ( rule__InputCondition_Impl__NameAssignment_2 ) ) )
            // InternalMyDsl.g:6586:1: ( ( rule__InputCondition_Impl__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:6586:1: ( ( rule__InputCondition_Impl__NameAssignment_2 ) )
            // InternalMyDsl.g:6587:2: ( rule__InputCondition_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getInputCondition_ImplAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:6588:2: ( rule__InputCondition_Impl__NameAssignment_2 )
            // InternalMyDsl.g:6588:3: rule__InputCondition_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InputCondition_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputCondition_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__Group__2__Impl"


    // $ANTLR start "rule__OutputDecision__Group__0"
    // InternalMyDsl.g:6597:1: rule__OutputDecision__Group__0 : rule__OutputDecision__Group__0__Impl rule__OutputDecision__Group__1 ;
    public final void rule__OutputDecision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6601:1: ( rule__OutputDecision__Group__0__Impl rule__OutputDecision__Group__1 )
            // InternalMyDsl.g:6602:2: rule__OutputDecision__Group__0__Impl rule__OutputDecision__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__OutputDecision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__0"


    // $ANTLR start "rule__OutputDecision__Group__0__Impl"
    // InternalMyDsl.g:6609:1: rule__OutputDecision__Group__0__Impl : ( ( rule__OutputDecision__Group_0__0 )? ) ;
    public final void rule__OutputDecision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6613:1: ( ( ( rule__OutputDecision__Group_0__0 )? ) )
            // InternalMyDsl.g:6614:1: ( ( rule__OutputDecision__Group_0__0 )? )
            {
            // InternalMyDsl.g:6614:1: ( ( rule__OutputDecision__Group_0__0 )? )
            // InternalMyDsl.g:6615:2: ( rule__OutputDecision__Group_0__0 )?
            {
             before(grammarAccess.getOutputDecisionAccess().getGroup_0()); 
            // InternalMyDsl.g:6616:2: ( rule__OutputDecision__Group_0__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:6616:3: rule__OutputDecision__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputDecision__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputDecisionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__0__Impl"


    // $ANTLR start "rule__OutputDecision__Group__1"
    // InternalMyDsl.g:6624:1: rule__OutputDecision__Group__1 : rule__OutputDecision__Group__1__Impl rule__OutputDecision__Group__2 ;
    public final void rule__OutputDecision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6628:1: ( rule__OutputDecision__Group__1__Impl rule__OutputDecision__Group__2 )
            // InternalMyDsl.g:6629:2: rule__OutputDecision__Group__1__Impl rule__OutputDecision__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__OutputDecision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__1"


    // $ANTLR start "rule__OutputDecision__Group__1__Impl"
    // InternalMyDsl.g:6636:1: rule__OutputDecision__Group__1__Impl : ( 'input' ) ;
    public final void rule__OutputDecision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6640:1: ( ( 'input' ) )
            // InternalMyDsl.g:6641:1: ( 'input' )
            {
            // InternalMyDsl.g:6641:1: ( 'input' )
            // InternalMyDsl.g:6642:2: 'input'
            {
             before(grammarAccess.getOutputDecisionAccess().getInputKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOutputDecisionAccess().getInputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__1__Impl"


    // $ANTLR start "rule__OutputDecision__Group__2"
    // InternalMyDsl.g:6651:1: rule__OutputDecision__Group__2 : rule__OutputDecision__Group__2__Impl rule__OutputDecision__Group__3 ;
    public final void rule__OutputDecision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6655:1: ( rule__OutputDecision__Group__2__Impl rule__OutputDecision__Group__3 )
            // InternalMyDsl.g:6656:2: rule__OutputDecision__Group__2__Impl rule__OutputDecision__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__OutputDecision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__2"


    // $ANTLR start "rule__OutputDecision__Group__2__Impl"
    // InternalMyDsl.g:6663:1: rule__OutputDecision__Group__2__Impl : ( 'condition' ) ;
    public final void rule__OutputDecision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6667:1: ( ( 'condition' ) )
            // InternalMyDsl.g:6668:1: ( 'condition' )
            {
            // InternalMyDsl.g:6668:1: ( 'condition' )
            // InternalMyDsl.g:6669:2: 'condition'
            {
             before(grammarAccess.getOutputDecisionAccess().getConditionKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOutputDecisionAccess().getConditionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__2__Impl"


    // $ANTLR start "rule__OutputDecision__Group__3"
    // InternalMyDsl.g:6678:1: rule__OutputDecision__Group__3 : rule__OutputDecision__Group__3__Impl rule__OutputDecision__Group__4 ;
    public final void rule__OutputDecision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6682:1: ( rule__OutputDecision__Group__3__Impl rule__OutputDecision__Group__4 )
            // InternalMyDsl.g:6683:2: rule__OutputDecision__Group__3__Impl rule__OutputDecision__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__OutputDecision__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__3"


    // $ANTLR start "rule__OutputDecision__Group__3__Impl"
    // InternalMyDsl.g:6690:1: rule__OutputDecision__Group__3__Impl : ( ( rule__OutputDecision__InputAssignment_3 ) ) ;
    public final void rule__OutputDecision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6694:1: ( ( ( rule__OutputDecision__InputAssignment_3 ) ) )
            // InternalMyDsl.g:6695:1: ( ( rule__OutputDecision__InputAssignment_3 ) )
            {
            // InternalMyDsl.g:6695:1: ( ( rule__OutputDecision__InputAssignment_3 ) )
            // InternalMyDsl.g:6696:2: ( rule__OutputDecision__InputAssignment_3 )
            {
             before(grammarAccess.getOutputDecisionAccess().getInputAssignment_3()); 
            // InternalMyDsl.g:6697:2: ( rule__OutputDecision__InputAssignment_3 )
            // InternalMyDsl.g:6697:3: rule__OutputDecision__InputAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__InputAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputDecisionAccess().getInputAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__3__Impl"


    // $ANTLR start "rule__OutputDecision__Group__4"
    // InternalMyDsl.g:6705:1: rule__OutputDecision__Group__4 : rule__OutputDecision__Group__4__Impl ;
    public final void rule__OutputDecision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6709:1: ( rule__OutputDecision__Group__4__Impl )
            // InternalMyDsl.g:6710:2: rule__OutputDecision__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__4"


    // $ANTLR start "rule__OutputDecision__Group__4__Impl"
    // InternalMyDsl.g:6716:1: rule__OutputDecision__Group__4__Impl : ( ( rule__OutputDecision__Group_4__0 )* ) ;
    public final void rule__OutputDecision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6720:1: ( ( ( rule__OutputDecision__Group_4__0 )* ) )
            // InternalMyDsl.g:6721:1: ( ( rule__OutputDecision__Group_4__0 )* )
            {
            // InternalMyDsl.g:6721:1: ( ( rule__OutputDecision__Group_4__0 )* )
            // InternalMyDsl.g:6722:2: ( rule__OutputDecision__Group_4__0 )*
            {
             before(grammarAccess.getOutputDecisionAccess().getGroup_4()); 
            // InternalMyDsl.g:6723:2: ( rule__OutputDecision__Group_4__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==23) ) {
                    int LA40_2 = input.LA(2);

                    if ( ((LA40_2>=RULE_STRING && LA40_2<=RULE_ID)) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:6723:3: rule__OutputDecision__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__OutputDecision__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getOutputDecisionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group__4__Impl"


    // $ANTLR start "rule__OutputDecision__Group_0__0"
    // InternalMyDsl.g:6732:1: rule__OutputDecision__Group_0__0 : rule__OutputDecision__Group_0__0__Impl rule__OutputDecision__Group_0__1 ;
    public final void rule__OutputDecision__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6736:1: ( rule__OutputDecision__Group_0__0__Impl rule__OutputDecision__Group_0__1 )
            // InternalMyDsl.g:6737:2: rule__OutputDecision__Group_0__0__Impl rule__OutputDecision__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__OutputDecision__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_0__0"


    // $ANTLR start "rule__OutputDecision__Group_0__0__Impl"
    // InternalMyDsl.g:6744:1: rule__OutputDecision__Group_0__0__Impl : ( 'output' ) ;
    public final void rule__OutputDecision__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6748:1: ( ( 'output' ) )
            // InternalMyDsl.g:6749:1: ( 'output' )
            {
            // InternalMyDsl.g:6749:1: ( 'output' )
            // InternalMyDsl.g:6750:2: 'output'
            {
             before(grammarAccess.getOutputDecisionAccess().getOutputKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getOutputDecisionAccess().getOutputKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_0__0__Impl"


    // $ANTLR start "rule__OutputDecision__Group_0__1"
    // InternalMyDsl.g:6759:1: rule__OutputDecision__Group_0__1 : rule__OutputDecision__Group_0__1__Impl rule__OutputDecision__Group_0__2 ;
    public final void rule__OutputDecision__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6763:1: ( rule__OutputDecision__Group_0__1__Impl rule__OutputDecision__Group_0__2 )
            // InternalMyDsl.g:6764:2: rule__OutputDecision__Group_0__1__Impl rule__OutputDecision__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__OutputDecision__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_0__1"


    // $ANTLR start "rule__OutputDecision__Group_0__1__Impl"
    // InternalMyDsl.g:6771:1: rule__OutputDecision__Group_0__1__Impl : ( 'type' ) ;
    public final void rule__OutputDecision__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6775:1: ( ( 'type' ) )
            // InternalMyDsl.g:6776:1: ( 'type' )
            {
            // InternalMyDsl.g:6776:1: ( 'type' )
            // InternalMyDsl.g:6777:2: 'type'
            {
             before(grammarAccess.getOutputDecisionAccess().getTypeKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOutputDecisionAccess().getTypeKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_0__1__Impl"


    // $ANTLR start "rule__OutputDecision__Group_0__2"
    // InternalMyDsl.g:6786:1: rule__OutputDecision__Group_0__2 : rule__OutputDecision__Group_0__2__Impl ;
    public final void rule__OutputDecision__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6790:1: ( rule__OutputDecision__Group_0__2__Impl )
            // InternalMyDsl.g:6791:2: rule__OutputDecision__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_0__2"


    // $ANTLR start "rule__OutputDecision__Group_0__2__Impl"
    // InternalMyDsl.g:6797:1: rule__OutputDecision__Group_0__2__Impl : ( ( rule__OutputDecision__OutputTypesAssignment_0_2 ) ) ;
    public final void rule__OutputDecision__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6801:1: ( ( ( rule__OutputDecision__OutputTypesAssignment_0_2 ) ) )
            // InternalMyDsl.g:6802:1: ( ( rule__OutputDecision__OutputTypesAssignment_0_2 ) )
            {
            // InternalMyDsl.g:6802:1: ( ( rule__OutputDecision__OutputTypesAssignment_0_2 ) )
            // InternalMyDsl.g:6803:2: ( rule__OutputDecision__OutputTypesAssignment_0_2 )
            {
             before(grammarAccess.getOutputDecisionAccess().getOutputTypesAssignment_0_2()); 
            // InternalMyDsl.g:6804:2: ( rule__OutputDecision__OutputTypesAssignment_0_2 )
            // InternalMyDsl.g:6804:3: rule__OutputDecision__OutputTypesAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__OutputTypesAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputDecisionAccess().getOutputTypesAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_0__2__Impl"


    // $ANTLR start "rule__OutputDecision__Group_4__0"
    // InternalMyDsl.g:6813:1: rule__OutputDecision__Group_4__0 : rule__OutputDecision__Group_4__0__Impl rule__OutputDecision__Group_4__1 ;
    public final void rule__OutputDecision__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6817:1: ( rule__OutputDecision__Group_4__0__Impl rule__OutputDecision__Group_4__1 )
            // InternalMyDsl.g:6818:2: rule__OutputDecision__Group_4__0__Impl rule__OutputDecision__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__OutputDecision__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_4__0"


    // $ANTLR start "rule__OutputDecision__Group_4__0__Impl"
    // InternalMyDsl.g:6825:1: rule__OutputDecision__Group_4__0__Impl : ( ',' ) ;
    public final void rule__OutputDecision__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6829:1: ( ( ',' ) )
            // InternalMyDsl.g:6830:1: ( ',' )
            {
            // InternalMyDsl.g:6830:1: ( ',' )
            // InternalMyDsl.g:6831:2: ','
            {
             before(grammarAccess.getOutputDecisionAccess().getCommaKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOutputDecisionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_4__0__Impl"


    // $ANTLR start "rule__OutputDecision__Group_4__1"
    // InternalMyDsl.g:6840:1: rule__OutputDecision__Group_4__1 : rule__OutputDecision__Group_4__1__Impl ;
    public final void rule__OutputDecision__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6844:1: ( rule__OutputDecision__Group_4__1__Impl )
            // InternalMyDsl.g:6845:2: rule__OutputDecision__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_4__1"


    // $ANTLR start "rule__OutputDecision__Group_4__1__Impl"
    // InternalMyDsl.g:6851:1: rule__OutputDecision__Group_4__1__Impl : ( ( rule__OutputDecision__InputAssignment_4_1 ) ) ;
    public final void rule__OutputDecision__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6855:1: ( ( ( rule__OutputDecision__InputAssignment_4_1 ) ) )
            // InternalMyDsl.g:6856:1: ( ( rule__OutputDecision__InputAssignment_4_1 ) )
            {
            // InternalMyDsl.g:6856:1: ( ( rule__OutputDecision__InputAssignment_4_1 ) )
            // InternalMyDsl.g:6857:2: ( rule__OutputDecision__InputAssignment_4_1 )
            {
             before(grammarAccess.getOutputDecisionAccess().getInputAssignment_4_1()); 
            // InternalMyDsl.g:6858:2: ( rule__OutputDecision__InputAssignment_4_1 )
            // InternalMyDsl.g:6858:3: rule__OutputDecision__InputAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputDecision__InputAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputDecisionAccess().getInputAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__Group_4__1__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__0"
    // InternalMyDsl.g:6867:1: rule__WorkPieceCondition__Group__0 : rule__WorkPieceCondition__Group__0__Impl rule__WorkPieceCondition__Group__1 ;
    public final void rule__WorkPieceCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6871:1: ( rule__WorkPieceCondition__Group__0__Impl rule__WorkPieceCondition__Group__1 )
            // InternalMyDsl.g:6872:2: rule__WorkPieceCondition__Group__0__Impl rule__WorkPieceCondition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__WorkPieceCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__0"


    // $ANTLR start "rule__WorkPieceCondition__Group__0__Impl"
    // InternalMyDsl.g:6879:1: rule__WorkPieceCondition__Group__0__Impl : ( ( rule__WorkPieceCondition__NameAssignment_0 ) ) ;
    public final void rule__WorkPieceCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6883:1: ( ( ( rule__WorkPieceCondition__NameAssignment_0 ) ) )
            // InternalMyDsl.g:6884:1: ( ( rule__WorkPieceCondition__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:6884:1: ( ( rule__WorkPieceCondition__NameAssignment_0 ) )
            // InternalMyDsl.g:6885:2: ( rule__WorkPieceCondition__NameAssignment_0 )
            {
             before(grammarAccess.getWorkPieceConditionAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:6886:2: ( rule__WorkPieceCondition__NameAssignment_0 )
            // InternalMyDsl.g:6886:3: rule__WorkPieceCondition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceConditionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__0__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__1"
    // InternalMyDsl.g:6894:1: rule__WorkPieceCondition__Group__1 : rule__WorkPieceCondition__Group__1__Impl rule__WorkPieceCondition__Group__2 ;
    public final void rule__WorkPieceCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6898:1: ( rule__WorkPieceCondition__Group__1__Impl rule__WorkPieceCondition__Group__2 )
            // InternalMyDsl.g:6899:2: rule__WorkPieceCondition__Group__1__Impl rule__WorkPieceCondition__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__WorkPieceCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__1"


    // $ANTLR start "rule__WorkPieceCondition__Group__1__Impl"
    // InternalMyDsl.g:6906:1: rule__WorkPieceCondition__Group__1__Impl : ( '{' ) ;
    public final void rule__WorkPieceCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6910:1: ( ( '{' ) )
            // InternalMyDsl.g:6911:1: ( '{' )
            {
            // InternalMyDsl.g:6911:1: ( '{' )
            // InternalMyDsl.g:6912:2: '{'
            {
             before(grammarAccess.getWorkPieceConditionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWorkPieceConditionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__1__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__2"
    // InternalMyDsl.g:6921:1: rule__WorkPieceCondition__Group__2 : rule__WorkPieceCondition__Group__2__Impl rule__WorkPieceCondition__Group__3 ;
    public final void rule__WorkPieceCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6925:1: ( rule__WorkPieceCondition__Group__2__Impl rule__WorkPieceCondition__Group__3 )
            // InternalMyDsl.g:6926:2: rule__WorkPieceCondition__Group__2__Impl rule__WorkPieceCondition__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__WorkPieceCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__2"


    // $ANTLR start "rule__WorkPieceCondition__Group__2__Impl"
    // InternalMyDsl.g:6933:1: rule__WorkPieceCondition__Group__2__Impl : ( 'requires' ) ;
    public final void rule__WorkPieceCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6937:1: ( ( 'requires' ) )
            // InternalMyDsl.g:6938:1: ( 'requires' )
            {
            // InternalMyDsl.g:6938:1: ( 'requires' )
            // InternalMyDsl.g:6939:2: 'requires'
            {
             before(grammarAccess.getWorkPieceConditionAccess().getRequiresKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getWorkPieceConditionAccess().getRequiresKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__2__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__3"
    // InternalMyDsl.g:6948:1: rule__WorkPieceCondition__Group__3 : rule__WorkPieceCondition__Group__3__Impl rule__WorkPieceCondition__Group__4 ;
    public final void rule__WorkPieceCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6952:1: ( rule__WorkPieceCondition__Group__3__Impl rule__WorkPieceCondition__Group__4 )
            // InternalMyDsl.g:6953:2: rule__WorkPieceCondition__Group__3__Impl rule__WorkPieceCondition__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__WorkPieceCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__3"


    // $ANTLR start "rule__WorkPieceCondition__Group__3__Impl"
    // InternalMyDsl.g:6960:1: rule__WorkPieceCondition__Group__3__Impl : ( 'type' ) ;
    public final void rule__WorkPieceCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6964:1: ( ( 'type' ) )
            // InternalMyDsl.g:6965:1: ( 'type' )
            {
            // InternalMyDsl.g:6965:1: ( 'type' )
            // InternalMyDsl.g:6966:2: 'type'
            {
             before(grammarAccess.getWorkPieceConditionAccess().getTypeKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWorkPieceConditionAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__3__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__4"
    // InternalMyDsl.g:6975:1: rule__WorkPieceCondition__Group__4 : rule__WorkPieceCondition__Group__4__Impl rule__WorkPieceCondition__Group__5 ;
    public final void rule__WorkPieceCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6979:1: ( rule__WorkPieceCondition__Group__4__Impl rule__WorkPieceCondition__Group__5 )
            // InternalMyDsl.g:6980:2: rule__WorkPieceCondition__Group__4__Impl rule__WorkPieceCondition__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__WorkPieceCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__4"


    // $ANTLR start "rule__WorkPieceCondition__Group__4__Impl"
    // InternalMyDsl.g:6987:1: rule__WorkPieceCondition__Group__4__Impl : ( ( rule__WorkPieceCondition__RequiresTypeAssignment_4 ) ) ;
    public final void rule__WorkPieceCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6991:1: ( ( ( rule__WorkPieceCondition__RequiresTypeAssignment_4 ) ) )
            // InternalMyDsl.g:6992:1: ( ( rule__WorkPieceCondition__RequiresTypeAssignment_4 ) )
            {
            // InternalMyDsl.g:6992:1: ( ( rule__WorkPieceCondition__RequiresTypeAssignment_4 ) )
            // InternalMyDsl.g:6993:2: ( rule__WorkPieceCondition__RequiresTypeAssignment_4 )
            {
             before(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeAssignment_4()); 
            // InternalMyDsl.g:6994:2: ( rule__WorkPieceCondition__RequiresTypeAssignment_4 )
            // InternalMyDsl.g:6994:3: rule__WorkPieceCondition__RequiresTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__RequiresTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__4__Impl"


    // $ANTLR start "rule__WorkPieceCondition__Group__5"
    // InternalMyDsl.g:7002:1: rule__WorkPieceCondition__Group__5 : rule__WorkPieceCondition__Group__5__Impl ;
    public final void rule__WorkPieceCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7006:1: ( rule__WorkPieceCondition__Group__5__Impl )
            // InternalMyDsl.g:7007:2: rule__WorkPieceCondition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WorkPieceCondition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__5"


    // $ANTLR start "rule__WorkPieceCondition__Group__5__Impl"
    // InternalMyDsl.g:7013:1: rule__WorkPieceCondition__Group__5__Impl : ( '}' ) ;
    public final void rule__WorkPieceCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7017:1: ( ( '}' ) )
            // InternalMyDsl.g:7018:1: ( '}' )
            {
            // InternalMyDsl.g:7018:1: ( '}' )
            // InternalMyDsl.g:7019:2: '}'
            {
             before(grammarAccess.getWorkPieceConditionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWorkPieceConditionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__Group__5__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__0"
    // InternalMyDsl.g:7029:1: rule__BinaryCondition__Group__0 : rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 ;
    public final void rule__BinaryCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7033:1: ( rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1 )
            // InternalMyDsl.g:7034:2: rule__BinaryCondition__Group__0__Impl rule__BinaryCondition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__0"


    // $ANTLR start "rule__BinaryCondition__Group__0__Impl"
    // InternalMyDsl.g:7041:1: rule__BinaryCondition__Group__0__Impl : ( 'BinaryCondition' ) ;
    public final void rule__BinaryCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7045:1: ( ( 'BinaryCondition' ) )
            // InternalMyDsl.g:7046:1: ( 'BinaryCondition' )
            {
            // InternalMyDsl.g:7046:1: ( 'BinaryCondition' )
            // InternalMyDsl.g:7047:2: 'BinaryCondition'
            {
             before(grammarAccess.getBinaryConditionAccess().getBinaryConditionKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBinaryConditionAccess().getBinaryConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__0__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__1"
    // InternalMyDsl.g:7056:1: rule__BinaryCondition__Group__1 : rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2 ;
    public final void rule__BinaryCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7060:1: ( rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2 )
            // InternalMyDsl.g:7061:2: rule__BinaryCondition__Group__1__Impl rule__BinaryCondition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__BinaryCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__1"


    // $ANTLR start "rule__BinaryCondition__Group__1__Impl"
    // InternalMyDsl.g:7068:1: rule__BinaryCondition__Group__1__Impl : ( ( rule__BinaryCondition__NameAssignment_1 ) ) ;
    public final void rule__BinaryCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7072:1: ( ( ( rule__BinaryCondition__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7073:1: ( ( rule__BinaryCondition__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7073:1: ( ( rule__BinaryCondition__NameAssignment_1 ) )
            // InternalMyDsl.g:7074:2: ( rule__BinaryCondition__NameAssignment_1 )
            {
             before(grammarAccess.getBinaryConditionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7075:2: ( rule__BinaryCondition__NameAssignment_1 )
            // InternalMyDsl.g:7075:3: rule__BinaryCondition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__1__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__2"
    // InternalMyDsl.g:7083:1: rule__BinaryCondition__Group__2 : rule__BinaryCondition__Group__2__Impl rule__BinaryCondition__Group__3 ;
    public final void rule__BinaryCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7087:1: ( rule__BinaryCondition__Group__2__Impl rule__BinaryCondition__Group__3 )
            // InternalMyDsl.g:7088:2: rule__BinaryCondition__Group__2__Impl rule__BinaryCondition__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__BinaryCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__2"


    // $ANTLR start "rule__BinaryCondition__Group__2__Impl"
    // InternalMyDsl.g:7095:1: rule__BinaryCondition__Group__2__Impl : ( '{' ) ;
    public final void rule__BinaryCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7099:1: ( ( '{' ) )
            // InternalMyDsl.g:7100:1: ( '{' )
            {
            // InternalMyDsl.g:7100:1: ( '{' )
            // InternalMyDsl.g:7101:2: '{'
            {
             before(grammarAccess.getBinaryConditionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBinaryConditionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__2__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__3"
    // InternalMyDsl.g:7110:1: rule__BinaryCondition__Group__3 : rule__BinaryCondition__Group__3__Impl rule__BinaryCondition__Group__4 ;
    public final void rule__BinaryCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7114:1: ( rule__BinaryCondition__Group__3__Impl rule__BinaryCondition__Group__4 )
            // InternalMyDsl.g:7115:2: rule__BinaryCondition__Group__3__Impl rule__BinaryCondition__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__3"


    // $ANTLR start "rule__BinaryCondition__Group__3__Impl"
    // InternalMyDsl.g:7122:1: rule__BinaryCondition__Group__3__Impl : ( 'left' ) ;
    public final void rule__BinaryCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7126:1: ( ( 'left' ) )
            // InternalMyDsl.g:7127:1: ( 'left' )
            {
            // InternalMyDsl.g:7127:1: ( 'left' )
            // InternalMyDsl.g:7128:2: 'left'
            {
             before(grammarAccess.getBinaryConditionAccess().getLeftKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getBinaryConditionAccess().getLeftKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__3__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__4"
    // InternalMyDsl.g:7137:1: rule__BinaryCondition__Group__4 : rule__BinaryCondition__Group__4__Impl rule__BinaryCondition__Group__5 ;
    public final void rule__BinaryCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7141:1: ( rule__BinaryCondition__Group__4__Impl rule__BinaryCondition__Group__5 )
            // InternalMyDsl.g:7142:2: rule__BinaryCondition__Group__4__Impl rule__BinaryCondition__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__BinaryCondition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__4"


    // $ANTLR start "rule__BinaryCondition__Group__4__Impl"
    // InternalMyDsl.g:7149:1: rule__BinaryCondition__Group__4__Impl : ( ( rule__BinaryCondition__LeftAssignment_4 ) ) ;
    public final void rule__BinaryCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7153:1: ( ( ( rule__BinaryCondition__LeftAssignment_4 ) ) )
            // InternalMyDsl.g:7154:1: ( ( rule__BinaryCondition__LeftAssignment_4 ) )
            {
            // InternalMyDsl.g:7154:1: ( ( rule__BinaryCondition__LeftAssignment_4 ) )
            // InternalMyDsl.g:7155:2: ( rule__BinaryCondition__LeftAssignment_4 )
            {
             before(grammarAccess.getBinaryConditionAccess().getLeftAssignment_4()); 
            // InternalMyDsl.g:7156:2: ( rule__BinaryCondition__LeftAssignment_4 )
            // InternalMyDsl.g:7156:3: rule__BinaryCondition__LeftAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__LeftAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getLeftAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__4__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__5"
    // InternalMyDsl.g:7164:1: rule__BinaryCondition__Group__5 : rule__BinaryCondition__Group__5__Impl rule__BinaryCondition__Group__6 ;
    public final void rule__BinaryCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7168:1: ( rule__BinaryCondition__Group__5__Impl rule__BinaryCondition__Group__6 )
            // InternalMyDsl.g:7169:2: rule__BinaryCondition__Group__5__Impl rule__BinaryCondition__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__BinaryCondition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__5"


    // $ANTLR start "rule__BinaryCondition__Group__5__Impl"
    // InternalMyDsl.g:7176:1: rule__BinaryCondition__Group__5__Impl : ( ( rule__BinaryCondition__TypeAssignment_5 ) ) ;
    public final void rule__BinaryCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7180:1: ( ( ( rule__BinaryCondition__TypeAssignment_5 ) ) )
            // InternalMyDsl.g:7181:1: ( ( rule__BinaryCondition__TypeAssignment_5 ) )
            {
            // InternalMyDsl.g:7181:1: ( ( rule__BinaryCondition__TypeAssignment_5 ) )
            // InternalMyDsl.g:7182:2: ( rule__BinaryCondition__TypeAssignment_5 )
            {
             before(grammarAccess.getBinaryConditionAccess().getTypeAssignment_5()); 
            // InternalMyDsl.g:7183:2: ( rule__BinaryCondition__TypeAssignment_5 )
            // InternalMyDsl.g:7183:3: rule__BinaryCondition__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__5__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__6"
    // InternalMyDsl.g:7191:1: rule__BinaryCondition__Group__6 : rule__BinaryCondition__Group__6__Impl rule__BinaryCondition__Group__7 ;
    public final void rule__BinaryCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7195:1: ( rule__BinaryCondition__Group__6__Impl rule__BinaryCondition__Group__7 )
            // InternalMyDsl.g:7196:2: rule__BinaryCondition__Group__6__Impl rule__BinaryCondition__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__BinaryCondition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__6"


    // $ANTLR start "rule__BinaryCondition__Group__6__Impl"
    // InternalMyDsl.g:7203:1: rule__BinaryCondition__Group__6__Impl : ( 'right' ) ;
    public final void rule__BinaryCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7207:1: ( ( 'right' ) )
            // InternalMyDsl.g:7208:1: ( 'right' )
            {
            // InternalMyDsl.g:7208:1: ( 'right' )
            // InternalMyDsl.g:7209:2: 'right'
            {
             before(grammarAccess.getBinaryConditionAccess().getRightKeyword_6()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBinaryConditionAccess().getRightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__6__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__7"
    // InternalMyDsl.g:7218:1: rule__BinaryCondition__Group__7 : rule__BinaryCondition__Group__7__Impl rule__BinaryCondition__Group__8 ;
    public final void rule__BinaryCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7222:1: ( rule__BinaryCondition__Group__7__Impl rule__BinaryCondition__Group__8 )
            // InternalMyDsl.g:7223:2: rule__BinaryCondition__Group__7__Impl rule__BinaryCondition__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__BinaryCondition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__7"


    // $ANTLR start "rule__BinaryCondition__Group__7__Impl"
    // InternalMyDsl.g:7230:1: rule__BinaryCondition__Group__7__Impl : ( ( rule__BinaryCondition__RightAssignment_7 ) ) ;
    public final void rule__BinaryCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7234:1: ( ( ( rule__BinaryCondition__RightAssignment_7 ) ) )
            // InternalMyDsl.g:7235:1: ( ( rule__BinaryCondition__RightAssignment_7 ) )
            {
            // InternalMyDsl.g:7235:1: ( ( rule__BinaryCondition__RightAssignment_7 ) )
            // InternalMyDsl.g:7236:2: ( rule__BinaryCondition__RightAssignment_7 )
            {
             before(grammarAccess.getBinaryConditionAccess().getRightAssignment_7()); 
            // InternalMyDsl.g:7237:2: ( rule__BinaryCondition__RightAssignment_7 )
            // InternalMyDsl.g:7237:3: rule__BinaryCondition__RightAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__RightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBinaryConditionAccess().getRightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__7__Impl"


    // $ANTLR start "rule__BinaryCondition__Group__8"
    // InternalMyDsl.g:7245:1: rule__BinaryCondition__Group__8 : rule__BinaryCondition__Group__8__Impl ;
    public final void rule__BinaryCondition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7249:1: ( rule__BinaryCondition__Group__8__Impl )
            // InternalMyDsl.g:7250:2: rule__BinaryCondition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryCondition__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__8"


    // $ANTLR start "rule__BinaryCondition__Group__8__Impl"
    // InternalMyDsl.g:7256:1: rule__BinaryCondition__Group__8__Impl : ( '}' ) ;
    public final void rule__BinaryCondition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7260:1: ( ( '}' ) )
            // InternalMyDsl.g:7261:1: ( '}' )
            {
            // InternalMyDsl.g:7261:1: ( '}' )
            // InternalMyDsl.g:7262:2: '}'
            {
             before(grammarAccess.getBinaryConditionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBinaryConditionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__Group__8__Impl"


    // $ANTLR start "rule__Negation__Group__0"
    // InternalMyDsl.g:7272:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7276:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // InternalMyDsl.g:7277:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0"


    // $ANTLR start "rule__Negation__Group__0__Impl"
    // InternalMyDsl.g:7284:1: rule__Negation__Group__0__Impl : ( 'Negation' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7288:1: ( ( 'Negation' ) )
            // InternalMyDsl.g:7289:1: ( 'Negation' )
            {
            // InternalMyDsl.g:7289:1: ( 'Negation' )
            // InternalMyDsl.g:7290:2: 'Negation'
            {
             before(grammarAccess.getNegationAccess().getNegationKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getNegationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0__Impl"


    // $ANTLR start "rule__Negation__Group__1"
    // InternalMyDsl.g:7299:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl rule__Negation__Group__2 ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7303:1: ( rule__Negation__Group__1__Impl rule__Negation__Group__2 )
            // InternalMyDsl.g:7304:2: rule__Negation__Group__1__Impl rule__Negation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Negation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1"


    // $ANTLR start "rule__Negation__Group__1__Impl"
    // InternalMyDsl.g:7311:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__NameAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7315:1: ( ( ( rule__Negation__NameAssignment_1 ) ) )
            // InternalMyDsl.g:7316:1: ( ( rule__Negation__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:7316:1: ( ( rule__Negation__NameAssignment_1 ) )
            // InternalMyDsl.g:7317:2: ( rule__Negation__NameAssignment_1 )
            {
             before(grammarAccess.getNegationAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:7318:2: ( rule__Negation__NameAssignment_1 )
            // InternalMyDsl.g:7318:3: rule__Negation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Negation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1__Impl"


    // $ANTLR start "rule__Negation__Group__2"
    // InternalMyDsl.g:7326:1: rule__Negation__Group__2 : rule__Negation__Group__2__Impl rule__Negation__Group__3 ;
    public final void rule__Negation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7330:1: ( rule__Negation__Group__2__Impl rule__Negation__Group__3 )
            // InternalMyDsl.g:7331:2: rule__Negation__Group__2__Impl rule__Negation__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Negation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__2"


    // $ANTLR start "rule__Negation__Group__2__Impl"
    // InternalMyDsl.g:7338:1: rule__Negation__Group__2__Impl : ( '{' ) ;
    public final void rule__Negation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7342:1: ( ( '{' ) )
            // InternalMyDsl.g:7343:1: ( '{' )
            {
            // InternalMyDsl.g:7343:1: ( '{' )
            // InternalMyDsl.g:7344:2: '{'
            {
             before(grammarAccess.getNegationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__2__Impl"


    // $ANTLR start "rule__Negation__Group__3"
    // InternalMyDsl.g:7353:1: rule__Negation__Group__3 : rule__Negation__Group__3__Impl rule__Negation__Group__4 ;
    public final void rule__Negation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7357:1: ( rule__Negation__Group__3__Impl rule__Negation__Group__4 )
            // InternalMyDsl.g:7358:2: rule__Negation__Group__3__Impl rule__Negation__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Negation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__3"


    // $ANTLR start "rule__Negation__Group__3__Impl"
    // InternalMyDsl.g:7365:1: rule__Negation__Group__3__Impl : ( 'contains' ) ;
    public final void rule__Negation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7369:1: ( ( 'contains' ) )
            // InternalMyDsl.g:7370:1: ( 'contains' )
            {
            // InternalMyDsl.g:7370:1: ( 'contains' )
            // InternalMyDsl.g:7371:2: 'contains'
            {
             before(grammarAccess.getNegationAccess().getContainsKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getContainsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__3__Impl"


    // $ANTLR start "rule__Negation__Group__4"
    // InternalMyDsl.g:7380:1: rule__Negation__Group__4 : rule__Negation__Group__4__Impl rule__Negation__Group__5 ;
    public final void rule__Negation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7384:1: ( rule__Negation__Group__4__Impl rule__Negation__Group__5 )
            // InternalMyDsl.g:7385:2: rule__Negation__Group__4__Impl rule__Negation__Group__5
            {
            pushFollow(FOLLOW_40);
            rule__Negation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__4"


    // $ANTLR start "rule__Negation__Group__4__Impl"
    // InternalMyDsl.g:7392:1: rule__Negation__Group__4__Impl : ( '{' ) ;
    public final void rule__Negation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7396:1: ( ( '{' ) )
            // InternalMyDsl.g:7397:1: ( '{' )
            {
            // InternalMyDsl.g:7397:1: ( '{' )
            // InternalMyDsl.g:7398:2: '{'
            {
             before(grammarAccess.getNegationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__4__Impl"


    // $ANTLR start "rule__Negation__Group__5"
    // InternalMyDsl.g:7407:1: rule__Negation__Group__5 : rule__Negation__Group__5__Impl rule__Negation__Group__6 ;
    public final void rule__Negation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7411:1: ( rule__Negation__Group__5__Impl rule__Negation__Group__6 )
            // InternalMyDsl.g:7412:2: rule__Negation__Group__5__Impl rule__Negation__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Negation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__5"


    // $ANTLR start "rule__Negation__Group__5__Impl"
    // InternalMyDsl.g:7419:1: rule__Negation__Group__5__Impl : ( 'condition' ) ;
    public final void rule__Negation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7423:1: ( ( 'condition' ) )
            // InternalMyDsl.g:7424:1: ( 'condition' )
            {
            // InternalMyDsl.g:7424:1: ( 'condition' )
            // InternalMyDsl.g:7425:2: 'condition'
            {
             before(grammarAccess.getNegationAccess().getConditionKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getConditionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__5__Impl"


    // $ANTLR start "rule__Negation__Group__6"
    // InternalMyDsl.g:7434:1: rule__Negation__Group__6 : rule__Negation__Group__6__Impl rule__Negation__Group__7 ;
    public final void rule__Negation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7438:1: ( rule__Negation__Group__6__Impl rule__Negation__Group__7 )
            // InternalMyDsl.g:7439:2: rule__Negation__Group__6__Impl rule__Negation__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Negation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__6"


    // $ANTLR start "rule__Negation__Group__6__Impl"
    // InternalMyDsl.g:7446:1: rule__Negation__Group__6__Impl : ( ( rule__Negation__ContainsAssignment_6 ) ) ;
    public final void rule__Negation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7450:1: ( ( ( rule__Negation__ContainsAssignment_6 ) ) )
            // InternalMyDsl.g:7451:1: ( ( rule__Negation__ContainsAssignment_6 ) )
            {
            // InternalMyDsl.g:7451:1: ( ( rule__Negation__ContainsAssignment_6 ) )
            // InternalMyDsl.g:7452:2: ( rule__Negation__ContainsAssignment_6 )
            {
             before(grammarAccess.getNegationAccess().getContainsAssignment_6()); 
            // InternalMyDsl.g:7453:2: ( rule__Negation__ContainsAssignment_6 )
            // InternalMyDsl.g:7453:3: rule__Negation__ContainsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Negation__ContainsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getContainsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__6__Impl"


    // $ANTLR start "rule__Negation__Group__7"
    // InternalMyDsl.g:7461:1: rule__Negation__Group__7 : rule__Negation__Group__7__Impl rule__Negation__Group__8 ;
    public final void rule__Negation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7465:1: ( rule__Negation__Group__7__Impl rule__Negation__Group__8 )
            // InternalMyDsl.g:7466:2: rule__Negation__Group__7__Impl rule__Negation__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Negation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__7"


    // $ANTLR start "rule__Negation__Group__7__Impl"
    // InternalMyDsl.g:7473:1: rule__Negation__Group__7__Impl : ( '}' ) ;
    public final void rule__Negation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7477:1: ( ( '}' ) )
            // InternalMyDsl.g:7478:1: ( '}' )
            {
            // InternalMyDsl.g:7478:1: ( '}' )
            // InternalMyDsl.g:7479:2: '}'
            {
             before(grammarAccess.getNegationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__7__Impl"


    // $ANTLR start "rule__Negation__Group__8"
    // InternalMyDsl.g:7488:1: rule__Negation__Group__8 : rule__Negation__Group__8__Impl ;
    public final void rule__Negation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7492:1: ( rule__Negation__Group__8__Impl )
            // InternalMyDsl.g:7493:2: rule__Negation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__8"


    // $ANTLR start "rule__Negation__Group__8__Impl"
    // InternalMyDsl.g:7499:1: rule__Negation__Group__8__Impl : ( '}' ) ;
    public final void rule__Negation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7503:1: ( ( '}' ) )
            // InternalMyDsl.g:7504:1: ( '}' )
            {
            // InternalMyDsl.g:7504:1: ( '}' )
            // InternalMyDsl.g:7505:2: '}'
            {
             before(grammarAccess.getNegationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNegationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__8__Impl"


    // $ANTLR start "rule__ManufacturingSystem__NameAssignment_1"
    // InternalMyDsl.g:7515:1: rule__ManufacturingSystem__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ManufacturingSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7519:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7520:2: ( ruleEString )
            {
            // InternalMyDsl.g:7520:2: ( ruleEString )
            // InternalMyDsl.g:7521:3: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__NameAssignment_1"


    // $ANTLR start "rule__ManufacturingSystem__StartAssignment_6"
    // InternalMyDsl.g:7530:1: rule__ManufacturingSystem__StartAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__StartAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7534:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7535:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7535:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7536:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_6_0()); 
            // InternalMyDsl.g:7537:3: ( ruleEString )
            // InternalMyDsl.g:7538:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartStoragePointEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getStartStoragePointEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__StartAssignment_6"


    // $ANTLR start "rule__ManufacturingSystem__StartAssignment_7_1"
    // InternalMyDsl.g:7549:1: rule__ManufacturingSystem__StartAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__StartAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7553:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7554:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7554:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7555:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_7_1_0()); 
            // InternalMyDsl.g:7556:3: ( ruleEString )
            // InternalMyDsl.g:7557:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getStartStoragePointEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getStartStoragePointEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getStartStoragePointCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__StartAssignment_7_1"


    // $ANTLR start "rule__ManufacturingSystem__EndAssignment_11"
    // InternalMyDsl.g:7568:1: rule__ManufacturingSystem__EndAssignment_11 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__EndAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7572:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7573:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7573:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7574:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_11_0()); 
            // InternalMyDsl.g:7575:3: ( ruleEString )
            // InternalMyDsl.g:7576:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndStoragePointEStringParserRuleCall_11_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getEndStoragePointEStringParserRuleCall_11_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__EndAssignment_11"


    // $ANTLR start "rule__ManufacturingSystem__EndAssignment_12_1"
    // InternalMyDsl.g:7587:1: rule__ManufacturingSystem__EndAssignment_12_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__EndAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7591:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7592:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7592:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7593:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_12_1_0()); 
            // InternalMyDsl.g:7594:3: ( ruleEString )
            // InternalMyDsl.g:7595:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getEndStoragePointEStringParserRuleCall_12_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getEndStoragePointEStringParserRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getEndStoragePointCrossReference_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__EndAssignment_12_1"


    // $ANTLR start "rule__ManufacturingSystem__StaffAssignment_15"
    // InternalMyDsl.g:7606:1: rule__ManufacturingSystem__StaffAssignment_15 : ( ruleResponsible ) ;
    public final void rule__ManufacturingSystem__StaffAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7610:1: ( ( ruleResponsible ) )
            // InternalMyDsl.g:7611:2: ( ruleResponsible )
            {
            // InternalMyDsl.g:7611:2: ( ruleResponsible )
            // InternalMyDsl.g:7612:3: ruleResponsible
            {
             before(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleResponsible();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__StaffAssignment_15"


    // $ANTLR start "rule__ManufacturingSystem__StaffAssignment_16_1"
    // InternalMyDsl.g:7621:1: rule__ManufacturingSystem__StaffAssignment_16_1 : ( ruleResponsible ) ;
    public final void rule__ManufacturingSystem__StaffAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7625:1: ( ( ruleResponsible ) )
            // InternalMyDsl.g:7626:2: ( ruleResponsible )
            {
            // InternalMyDsl.g:7626:2: ( ruleResponsible )
            // InternalMyDsl.g:7627:3: ruleResponsible
            {
             before(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResponsible();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getStaffResponsibleParserRuleCall_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__StaffAssignment_16_1"


    // $ANTLR start "rule__ManufacturingSystem__ResponsibleAssignment_20"
    // InternalMyDsl.g:7636:1: rule__ManufacturingSystem__ResponsibleAssignment_20 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystem__ResponsibleAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7640:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7641:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7641:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7642:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleCrossReference_20_0()); 
            // InternalMyDsl.g:7643:3: ( ruleEString )
            // InternalMyDsl.g:7644:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleEStringParserRuleCall_20_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleEStringParserRuleCall_20_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemAccess().getResponsibleResponsibleCrossReference_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__ResponsibleAssignment_20"


    // $ANTLR start "rule__ManufacturingSystem__UsesAssignment_21_2"
    // InternalMyDsl.g:7655:1: rule__ManufacturingSystem__UsesAssignment_21_2 : ( ruleWorkPieceType ) ;
    public final void rule__ManufacturingSystem__UsesAssignment_21_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7659:1: ( ( ruleWorkPieceType ) )
            // InternalMyDsl.g:7660:2: ( ruleWorkPieceType )
            {
            // InternalMyDsl.g:7660:2: ( ruleWorkPieceType )
            // InternalMyDsl.g:7661:3: ruleWorkPieceType
            {
             before(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_21_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkPieceType();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_21_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__UsesAssignment_21_2"


    // $ANTLR start "rule__ManufacturingSystem__UsesAssignment_21_3_1"
    // InternalMyDsl.g:7670:1: rule__ManufacturingSystem__UsesAssignment_21_3_1 : ( ruleWorkPieceType ) ;
    public final void rule__ManufacturingSystem__UsesAssignment_21_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7674:1: ( ( ruleWorkPieceType ) )
            // InternalMyDsl.g:7675:2: ( ruleWorkPieceType )
            {
            // InternalMyDsl.g:7675:2: ( ruleWorkPieceType )
            // InternalMyDsl.g:7676:3: ruleWorkPieceType
            {
             before(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_21_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkPieceType();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getUsesWorkPieceTypeParserRuleCall_21_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__UsesAssignment_21_3_1"


    // $ANTLR start "rule__ManufacturingSystem__TransformsAssignment_22_1"
    // InternalMyDsl.g:7685:1: rule__ManufacturingSystem__TransformsAssignment_22_1 : ( ruleWorkPiece ) ;
    public final void rule__ManufacturingSystem__TransformsAssignment_22_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7689:1: ( ( ruleWorkPiece ) )
            // InternalMyDsl.g:7690:2: ( ruleWorkPiece )
            {
            // InternalMyDsl.g:7690:2: ( ruleWorkPiece )
            // InternalMyDsl.g:7691:3: ruleWorkPiece
            {
             before(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_22_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkPiece();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_22_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__TransformsAssignment_22_1"


    // $ANTLR start "rule__ManufacturingSystem__TransformsAssignment_22_2_1"
    // InternalMyDsl.g:7700:1: rule__ManufacturingSystem__TransformsAssignment_22_2_1 : ( ruleWorkPiece ) ;
    public final void rule__ManufacturingSystem__TransformsAssignment_22_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7704:1: ( ( ruleWorkPiece ) )
            // InternalMyDsl.g:7705:2: ( ruleWorkPiece )
            {
            // InternalMyDsl.g:7705:2: ( ruleWorkPiece )
            // InternalMyDsl.g:7706:3: ruleWorkPiece
            {
             before(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_22_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWorkPiece();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getTransformsWorkPieceParserRuleCall_22_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__TransformsAssignment_22_2_1"


    // $ANTLR start "rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0"
    // InternalMyDsl.g:7715:1: rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0 : ( ruleManufacturingSystemElement ) ;
    public final void rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7719:1: ( ( ruleManufacturingSystemElement ) )
            // InternalMyDsl.g:7720:2: ( ruleManufacturingSystemElement )
            {
            // InternalMyDsl.g:7720:2: ( ruleManufacturingSystemElement )
            // InternalMyDsl.g:7721:3: ruleManufacturingSystemElement
            {
             before(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_23_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturingSystemElement();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_23_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__ConsistsOfAssignment_23_1_0"


    // $ANTLR start "rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1"
    // InternalMyDsl.g:7730:1: rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1 : ( ruleManufacturingSystemElement ) ;
    public final void rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7734:1: ( ( ruleManufacturingSystemElement ) )
            // InternalMyDsl.g:7735:2: ( ruleManufacturingSystemElement )
            {
            // InternalMyDsl.g:7735:2: ( ruleManufacturingSystemElement )
            // InternalMyDsl.g:7736:3: ruleManufacturingSystemElement
            {
             before(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_23_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturingSystemElement();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemAccess().getConsistsOfManufacturingSystemElementParserRuleCall_23_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystem__ConsistsOfAssignment_23_1_1_1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__NameAssignment_2"
    // InternalMyDsl.g:7745:1: rule__ManufacturingSystemElement_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ManufacturingSystemElement_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7749:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7750:2: ( ruleEString )
            {
            // InternalMyDsl.g:7750:2: ( ruleEString )
            // InternalMyDsl.g:7751:3: ruleEString
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__NameAssignment_2"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2"
    // InternalMyDsl.g:7760:1: rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7764:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7765:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7765:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7766:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_2_0()); 
            // InternalMyDsl.g:7767:3: ( ruleEString )
            // InternalMyDsl.g:7768:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_2"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1"
    // InternalMyDsl.g:7779:1: rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7783:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7784:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7784:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7785:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_3_1_0()); 
            // InternalMyDsl.g:7786:3: ( ruleEString )
            // InternalMyDsl.g:7787:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getTransitionManufacturingSystemElementCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__TransitionAssignment_4_3_1"


    // $ANTLR start "rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7"
    // InternalMyDsl.g:7798:1: rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7802:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7803:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7803:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7804:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleCrossReference_7_0()); 
            // InternalMyDsl.g:7805:3: ( ruleEString )
            // InternalMyDsl.g:7806:4: ruleEString
            {
             before(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getManufacturingSystemElement_ImplAccess().getResponsibleResponsibleCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingSystemElement_Impl__ResponsibleAssignment_7"


    // $ANTLR start "rule__StoragePoint__NameAssignment_1"
    // InternalMyDsl.g:7817:1: rule__StoragePoint__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StoragePoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7821:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7822:2: ( ruleEString )
            {
            // InternalMyDsl.g:7822:2: ( ruleEString )
            // InternalMyDsl.g:7823:3: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__NameAssignment_1"


    // $ANTLR start "rule__StoragePoint__ResponsibleAssignment_5"
    // InternalMyDsl.g:7832:1: rule__StoragePoint__ResponsibleAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__ResponsibleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7836:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7837:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7837:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7838:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getResponsibleResponsibleCrossReference_5_0()); 
            // InternalMyDsl.g:7839:3: ( ruleEString )
            // InternalMyDsl.g:7840:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getResponsibleResponsibleEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getResponsibleResponsibleEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getResponsibleResponsibleCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__ResponsibleAssignment_5"


    // $ANTLR start "rule__StoragePoint__StoresAssignment_6_1"
    // InternalMyDsl.g:7851:1: rule__StoragePoint__StoresAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__StoresAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7855:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7856:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7856:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7857:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_1_0()); 
            // InternalMyDsl.g:7858:3: ( ruleEString )
            // InternalMyDsl.g:7859:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__StoresAssignment_6_1"


    // $ANTLR start "rule__StoragePoint__StoresAssignment_6_2_1"
    // InternalMyDsl.g:7870:1: rule__StoragePoint__StoresAssignment_6_2_1 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__StoresAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7874:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7875:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7875:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7876:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_2_1_0()); 
            // InternalMyDsl.g:7877:3: ( ruleEString )
            // InternalMyDsl.g:7878:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeEStringParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeEStringParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getStoresWorkPieceTypeCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__StoresAssignment_6_2_1"


    // $ANTLR start "rule__StoragePoint__TransitionAssignment_7_1"
    // InternalMyDsl.g:7889:1: rule__StoragePoint__TransitionAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__TransitionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7893:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7894:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7894:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7895:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_7_1_0()); 
            // InternalMyDsl.g:7896:3: ( ruleEString )
            // InternalMyDsl.g:7897:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__TransitionAssignment_7_1"


    // $ANTLR start "rule__StoragePoint__TransitionAssignment_7_2_1"
    // InternalMyDsl.g:7908:1: rule__StoragePoint__TransitionAssignment_7_2_1 : ( ( ruleEString ) ) ;
    public final void rule__StoragePoint__TransitionAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7912:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7913:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7913:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7914:3: ( ruleEString )
            {
             before(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_7_2_1_0()); 
            // InternalMyDsl.g:7915:3: ( ruleEString )
            // InternalMyDsl.g:7916:4: ruleEString
            {
             before(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_7_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_7_2_1_0_1()); 

            }

             after(grammarAccess.getStoragePointAccess().getTransitionManufacturingSystemElementCrossReference_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoragePoint__TransitionAssignment_7_2_1"


    // $ANTLR start "rule__WorkPieceType__NameAssignment_1"
    // InternalMyDsl.g:7927:1: rule__WorkPieceType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WorkPieceType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7931:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7932:2: ( ruleEString )
            {
            // InternalMyDsl.g:7932:2: ( ruleEString )
            // InternalMyDsl.g:7933:3: ruleEString
            {
             before(grammarAccess.getWorkPieceTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkPieceTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceType__NameAssignment_1"


    // $ANTLR start "rule__WorkPiece__HasTypeAssignment_4"
    // InternalMyDsl.g:7942:1: rule__WorkPiece__HasTypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__WorkPiece__HasTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7946:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7947:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7947:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7948:3: ( ruleEString )
            {
             before(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeCrossReference_4_0()); 
            // InternalMyDsl.g:7949:3: ( ruleEString )
            // InternalMyDsl.g:7950:4: ruleEString
            {
             before(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getWorkPieceAccess().getHasTypeWorkPieceTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPiece__HasTypeAssignment_4"


    // $ANTLR start "rule__Responsible__NameAssignment_1"
    // InternalMyDsl.g:7961:1: rule__Responsible__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Responsible__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7965:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7966:2: ( ruleEString )
            {
            // InternalMyDsl.g:7966:2: ( ruleEString )
            // InternalMyDsl.g:7967:3: ruleEString
            {
             before(grammarAccess.getResponsibleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResponsibleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Responsible__NameAssignment_1"


    // $ANTLR start "rule__ManufacturingStep__NameAssignment_1"
    // InternalMyDsl.g:7976:1: rule__ManufacturingStep__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ManufacturingStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7980:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7981:2: ( ruleEString )
            {
            // InternalMyDsl.g:7981:2: ( ruleEString )
            // InternalMyDsl.g:7982:3: ruleEString
            {
             before(grammarAccess.getManufacturingStepAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__NameAssignment_1"


    // $ANTLR start "rule__ManufacturingStep__SpeedAssignment_5"
    // InternalMyDsl.g:7991:1: rule__ManufacturingStep__SpeedAssignment_5 : ( ruleEInt ) ;
    public final void rule__ManufacturingStep__SpeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7995:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:7996:2: ( ruleEInt )
            {
            // InternalMyDsl.g:7996:2: ( ruleEInt )
            // InternalMyDsl.g:7997:3: ruleEInt
            {
             before(grammarAccess.getManufacturingStepAccess().getSpeedEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getSpeedEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__SpeedAssignment_5"


    // $ANTLR start "rule__ManufacturingStep__TransitionAssignment_6_1"
    // InternalMyDsl.g:8006:1: rule__ManufacturingStep__TransitionAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingStep__TransitionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8010:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8011:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8011:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8012:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0()); 
            // InternalMyDsl.g:8013:3: ( ruleEString )
            // InternalMyDsl.g:8014:4: ruleEString
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__TransitionAssignment_6_1"


    // $ANTLR start "rule__ManufacturingStep__TransitionAssignment_6_2_1"
    // InternalMyDsl.g:8025:1: rule__ManufacturingStep__TransitionAssignment_6_2_1 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingStep__TransitionAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8029:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8030:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8030:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8031:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0()); 
            // InternalMyDsl.g:8032:3: ( ruleEString )
            // InternalMyDsl.g:8033:4: ruleEString
            {
             before(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__TransitionAssignment_6_2_1"


    // $ANTLR start "rule__ManufacturingStep__ResponsibleAssignment_9"
    // InternalMyDsl.g:8044:1: rule__ManufacturingStep__ResponsibleAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__ManufacturingStep__ResponsibleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8048:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8049:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8049:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8050:3: ( ruleEString )
            {
             before(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleCrossReference_9_0()); 
            // InternalMyDsl.g:8051:3: ( ruleEString )
            // InternalMyDsl.g:8052:4: ruleEString
            {
             before(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getManufacturingStepAccess().getResponsibleResponsibleCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__ResponsibleAssignment_9"


    // $ANTLR start "rule__ManufacturingStep__InputAssignment_12"
    // InternalMyDsl.g:8063:1: rule__ManufacturingStep__InputAssignment_12 : ( ruleInputCondition ) ;
    public final void rule__ManufacturingStep__InputAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8067:1: ( ( ruleInputCondition ) )
            // InternalMyDsl.g:8068:2: ( ruleInputCondition )
            {
            // InternalMyDsl.g:8068:2: ( ruleInputCondition )
            // InternalMyDsl.g:8069:3: ruleInputCondition
            {
             before(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__InputAssignment_12"


    // $ANTLR start "rule__ManufacturingStep__InputAssignment_13_1"
    // InternalMyDsl.g:8078:1: rule__ManufacturingStep__InputAssignment_13_1 : ( ruleInputCondition ) ;
    public final void rule__ManufacturingStep__InputAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8082:1: ( ( ruleInputCondition ) )
            // InternalMyDsl.g:8083:2: ( ruleInputCondition )
            {
            // InternalMyDsl.g:8083:2: ( ruleInputCondition )
            // InternalMyDsl.g:8084:3: ruleInputCondition
            {
             before(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getInputInputConditionParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__InputAssignment_13_1"


    // $ANTLR start "rule__ManufacturingStep__OutputAssignment_17"
    // InternalMyDsl.g:8093:1: rule__ManufacturingStep__OutputAssignment_17 : ( ruleOutputDecision ) ;
    public final void rule__ManufacturingStep__OutputAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8097:1: ( ( ruleOutputDecision ) )
            // InternalMyDsl.g:8098:2: ( ruleOutputDecision )
            {
            // InternalMyDsl.g:8098:2: ( ruleOutputDecision )
            // InternalMyDsl.g:8099:3: ruleOutputDecision
            {
             before(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__OutputAssignment_17"


    // $ANTLR start "rule__ManufacturingStep__OutputAssignment_18_1"
    // InternalMyDsl.g:8108:1: rule__ManufacturingStep__OutputAssignment_18_1 : ( ruleOutputDecision ) ;
    public final void rule__ManufacturingStep__OutputAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8112:1: ( ( ruleOutputDecision ) )
            // InternalMyDsl.g:8113:2: ( ruleOutputDecision )
            {
            // InternalMyDsl.g:8113:2: ( ruleOutputDecision )
            // InternalMyDsl.g:8114:3: ruleOutputDecision
            {
             before(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ManufacturingStep__OutputAssignment_18_1"


    // $ANTLR start "rule__TransportStep__NameAssignment_1"
    // InternalMyDsl.g:8123:1: rule__TransportStep__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TransportStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8127:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8128:2: ( ruleEString )
            {
            // InternalMyDsl.g:8128:2: ( ruleEString )
            // InternalMyDsl.g:8129:3: ruleEString
            {
             before(grammarAccess.getTransportStepAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__NameAssignment_1"


    // $ANTLR start "rule__TransportStep__SpeedAssignment_5"
    // InternalMyDsl.g:8138:1: rule__TransportStep__SpeedAssignment_5 : ( ruleEInt ) ;
    public final void rule__TransportStep__SpeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8142:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8143:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8143:2: ( ruleEInt )
            // InternalMyDsl.g:8144:3: ruleEInt
            {
             before(grammarAccess.getTransportStepAccess().getSpeedEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getSpeedEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__SpeedAssignment_5"


    // $ANTLR start "rule__TransportStep__TransitionAssignment_6_1"
    // InternalMyDsl.g:8153:1: rule__TransportStep__TransitionAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__TransportStep__TransitionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8157:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8158:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8158:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8159:3: ( ruleEString )
            {
             before(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0()); 
            // InternalMyDsl.g:8160:3: ( ruleEString )
            // InternalMyDsl.g:8161:4: ruleEString
            {
             before(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__TransitionAssignment_6_1"


    // $ANTLR start "rule__TransportStep__TransitionAssignment_6_2_1"
    // InternalMyDsl.g:8172:1: rule__TransportStep__TransitionAssignment_6_2_1 : ( ( ruleEString ) ) ;
    public final void rule__TransportStep__TransitionAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8176:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8177:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8177:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8178:3: ( ruleEString )
            {
             before(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0()); 
            // InternalMyDsl.g:8179:3: ( ruleEString )
            // InternalMyDsl.g:8180:4: ruleEString
            {
             before(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getTransportStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__TransitionAssignment_6_2_1"


    // $ANTLR start "rule__TransportStep__ResponsibleAssignment_9"
    // InternalMyDsl.g:8191:1: rule__TransportStep__ResponsibleAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__TransportStep__ResponsibleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8195:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8196:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8196:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8197:3: ( ruleEString )
            {
             before(grammarAccess.getTransportStepAccess().getResponsibleResponsibleCrossReference_9_0()); 
            // InternalMyDsl.g:8198:3: ( ruleEString )
            // InternalMyDsl.g:8199:4: ruleEString
            {
             before(grammarAccess.getTransportStepAccess().getResponsibleResponsibleEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getResponsibleResponsibleEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getTransportStepAccess().getResponsibleResponsibleCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__ResponsibleAssignment_9"


    // $ANTLR start "rule__TransportStep__InputAssignment_12"
    // InternalMyDsl.g:8210:1: rule__TransportStep__InputAssignment_12 : ( ruleInputCondition ) ;
    public final void rule__TransportStep__InputAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8214:1: ( ( ruleInputCondition ) )
            // InternalMyDsl.g:8215:2: ( ruleInputCondition )
            {
            // InternalMyDsl.g:8215:2: ( ruleInputCondition )
            // InternalMyDsl.g:8216:3: ruleInputCondition
            {
             before(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__InputAssignment_12"


    // $ANTLR start "rule__TransportStep__InputAssignment_13_1"
    // InternalMyDsl.g:8225:1: rule__TransportStep__InputAssignment_13_1 : ( ruleInputCondition ) ;
    public final void rule__TransportStep__InputAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8229:1: ( ( ruleInputCondition ) )
            // InternalMyDsl.g:8230:2: ( ruleInputCondition )
            {
            // InternalMyDsl.g:8230:2: ( ruleInputCondition )
            // InternalMyDsl.g:8231:3: ruleInputCondition
            {
             before(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getInputInputConditionParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__InputAssignment_13_1"


    // $ANTLR start "rule__TransportStep__OutputAssignment_17"
    // InternalMyDsl.g:8240:1: rule__TransportStep__OutputAssignment_17 : ( ruleOutputDecision ) ;
    public final void rule__TransportStep__OutputAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8244:1: ( ( ruleOutputDecision ) )
            // InternalMyDsl.g:8245:2: ( ruleOutputDecision )
            {
            // InternalMyDsl.g:8245:2: ( ruleOutputDecision )
            // InternalMyDsl.g:8246:3: ruleOutputDecision
            {
             before(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__OutputAssignment_17"


    // $ANTLR start "rule__TransportStep__OutputAssignment_18_1"
    // InternalMyDsl.g:8255:1: rule__TransportStep__OutputAssignment_18_1 : ( ruleOutputDecision ) ;
    public final void rule__TransportStep__OutputAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8259:1: ( ( ruleOutputDecision ) )
            // InternalMyDsl.g:8260:2: ( ruleOutputDecision )
            {
            // InternalMyDsl.g:8260:2: ( ruleOutputDecision )
            // InternalMyDsl.g:8261:3: ruleOutputDecision
            {
             before(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getTransportStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportStep__OutputAssignment_18_1"


    // $ANTLR start "rule__QualityAssuranceStep__NameAssignment_1"
    // InternalMyDsl.g:8270:1: rule__QualityAssuranceStep__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__QualityAssuranceStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8274:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8275:2: ( ruleEString )
            {
            // InternalMyDsl.g:8275:2: ( ruleEString )
            // InternalMyDsl.g:8276:3: ruleEString
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__NameAssignment_1"


    // $ANTLR start "rule__QualityAssuranceStep__SpeedAssignment_5"
    // InternalMyDsl.g:8285:1: rule__QualityAssuranceStep__SpeedAssignment_5 : ( ruleEInt ) ;
    public final void rule__QualityAssuranceStep__SpeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8289:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8290:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8290:2: ( ruleEInt )
            // InternalMyDsl.g:8291:3: ruleEInt
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getSpeedEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getSpeedEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__SpeedAssignment_5"


    // $ANTLR start "rule__QualityAssuranceStep__TransitionAssignment_6_1"
    // InternalMyDsl.g:8300:1: rule__QualityAssuranceStep__TransitionAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__QualityAssuranceStep__TransitionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8304:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8305:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8305:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8306:3: ( ruleEString )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0()); 
            // InternalMyDsl.g:8307:3: ( ruleEString )
            // InternalMyDsl.g:8308:4: ruleEString
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__TransitionAssignment_6_1"


    // $ANTLR start "rule__QualityAssuranceStep__TransitionAssignment_6_2_1"
    // InternalMyDsl.g:8319:1: rule__QualityAssuranceStep__TransitionAssignment_6_2_1 : ( ( ruleEString ) ) ;
    public final void rule__QualityAssuranceStep__TransitionAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8323:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8324:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8324:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8325:3: ( ruleEString )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0()); 
            // InternalMyDsl.g:8326:3: ( ruleEString )
            // InternalMyDsl.g:8327:4: ruleEString
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__TransitionAssignment_6_2_1"


    // $ANTLR start "rule__QualityAssuranceStep__ResponsibleAssignment_9"
    // InternalMyDsl.g:8338:1: rule__QualityAssuranceStep__ResponsibleAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__QualityAssuranceStep__ResponsibleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8342:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8343:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8343:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8344:3: ( ruleEString )
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleCrossReference_9_0()); 
            // InternalMyDsl.g:8345:3: ( ruleEString )
            // InternalMyDsl.g:8346:4: ruleEString
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getQualityAssuranceStepAccess().getResponsibleResponsibleCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__ResponsibleAssignment_9"


    // $ANTLR start "rule__QualityAssuranceStep__InputAssignment_12"
    // InternalMyDsl.g:8357:1: rule__QualityAssuranceStep__InputAssignment_12 : ( ruleInputCondition ) ;
    public final void rule__QualityAssuranceStep__InputAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8361:1: ( ( ruleInputCondition ) )
            // InternalMyDsl.g:8362:2: ( ruleInputCondition )
            {
            // InternalMyDsl.g:8362:2: ( ruleInputCondition )
            // InternalMyDsl.g:8363:3: ruleInputCondition
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__InputAssignment_12"


    // $ANTLR start "rule__QualityAssuranceStep__InputAssignment_13_1"
    // InternalMyDsl.g:8372:1: rule__QualityAssuranceStep__InputAssignment_13_1 : ( ruleInputCondition ) ;
    public final void rule__QualityAssuranceStep__InputAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8376:1: ( ( ruleInputCondition ) )
            // InternalMyDsl.g:8377:2: ( ruleInputCondition )
            {
            // InternalMyDsl.g:8377:2: ( ruleInputCondition )
            // InternalMyDsl.g:8378:3: ruleInputCondition
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getInputInputConditionParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__InputAssignment_13_1"


    // $ANTLR start "rule__QualityAssuranceStep__OutputAssignment_17"
    // InternalMyDsl.g:8387:1: rule__QualityAssuranceStep__OutputAssignment_17 : ( ruleOutputDecision ) ;
    public final void rule__QualityAssuranceStep__OutputAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8391:1: ( ( ruleOutputDecision ) )
            // InternalMyDsl.g:8392:2: ( ruleOutputDecision )
            {
            // InternalMyDsl.g:8392:2: ( ruleOutputDecision )
            // InternalMyDsl.g:8393:3: ruleOutputDecision
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__OutputAssignment_17"


    // $ANTLR start "rule__QualityAssuranceStep__OutputAssignment_18_1"
    // InternalMyDsl.g:8402:1: rule__QualityAssuranceStep__OutputAssignment_18_1 : ( ruleOutputDecision ) ;
    public final void rule__QualityAssuranceStep__OutputAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8406:1: ( ( ruleOutputDecision ) )
            // InternalMyDsl.g:8407:2: ( ruleOutputDecision )
            {
            // InternalMyDsl.g:8407:2: ( ruleOutputDecision )
            // InternalMyDsl.g:8408:3: ruleOutputDecision
            {
             before(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getQualityAssuranceStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualityAssuranceStep__OutputAssignment_18_1"


    // $ANTLR start "rule__CompositeManufacturingStep__NameAssignment_1"
    // InternalMyDsl.g:8417:1: rule__CompositeManufacturingStep__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeManufacturingStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8421:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8422:2: ( ruleEString )
            {
            // InternalMyDsl.g:8422:2: ( ruleEString )
            // InternalMyDsl.g:8423:3: ruleEString
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__NameAssignment_1"


    // $ANTLR start "rule__CompositeManufacturingStep__SpeedAssignment_5"
    // InternalMyDsl.g:8432:1: rule__CompositeManufacturingStep__SpeedAssignment_5 : ( ruleEInt ) ;
    public final void rule__CompositeManufacturingStep__SpeedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8436:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8437:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8437:2: ( ruleEInt )
            // InternalMyDsl.g:8438:3: ruleEInt
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getSpeedEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getSpeedEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__SpeedAssignment_5"


    // $ANTLR start "rule__CompositeManufacturingStep__TransitionAssignment_6_1"
    // InternalMyDsl.g:8447:1: rule__CompositeManufacturingStep__TransitionAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeManufacturingStep__TransitionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8451:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8452:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8452:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8453:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0()); 
            // InternalMyDsl.g:8454:3: ( ruleEString )
            // InternalMyDsl.g:8455:4: ruleEString
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__TransitionAssignment_6_1"


    // $ANTLR start "rule__CompositeManufacturingStep__TransitionAssignment_6_2_1"
    // InternalMyDsl.g:8466:1: rule__CompositeManufacturingStep__TransitionAssignment_6_2_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeManufacturingStep__TransitionAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8470:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8471:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8471:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8472:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0()); 
            // InternalMyDsl.g:8473:3: ( ruleEString )
            // InternalMyDsl.g:8474:4: ruleEString
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementEStringParserRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getTransitionManufacturingSystemElementCrossReference_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__TransitionAssignment_6_2_1"


    // $ANTLR start "rule__CompositeManufacturingStep__ResponsibleAssignment_9"
    // InternalMyDsl.g:8485:1: rule__CompositeManufacturingStep__ResponsibleAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__CompositeManufacturingStep__ResponsibleAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8489:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8490:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8490:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8491:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleCrossReference_9_0()); 
            // InternalMyDsl.g:8492:3: ( ruleEString )
            // InternalMyDsl.g:8493:4: ruleEString
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getCompositeManufacturingStepAccess().getResponsibleResponsibleCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__ResponsibleAssignment_9"


    // $ANTLR start "rule__CompositeManufacturingStep__InputAssignment_12"
    // InternalMyDsl.g:8504:1: rule__CompositeManufacturingStep__InputAssignment_12 : ( ruleInputCondition ) ;
    public final void rule__CompositeManufacturingStep__InputAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8508:1: ( ( ruleInputCondition ) )
            // InternalMyDsl.g:8509:2: ( ruleInputCondition )
            {
            // InternalMyDsl.g:8509:2: ( ruleInputCondition )
            // InternalMyDsl.g:8510:3: ruleInputCondition
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__InputAssignment_12"


    // $ANTLR start "rule__CompositeManufacturingStep__InputAssignment_13_1"
    // InternalMyDsl.g:8519:1: rule__CompositeManufacturingStep__InputAssignment_13_1 : ( ruleInputCondition ) ;
    public final void rule__CompositeManufacturingStep__InputAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8523:1: ( ( ruleInputCondition ) )
            // InternalMyDsl.g:8524:2: ( ruleInputCondition )
            {
            // InternalMyDsl.g:8524:2: ( ruleInputCondition )
            // InternalMyDsl.g:8525:3: ruleInputCondition
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInputCondition();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getInputInputConditionParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__InputAssignment_13_1"


    // $ANTLR start "rule__CompositeManufacturingStep__OutputAssignment_17"
    // InternalMyDsl.g:8534:1: rule__CompositeManufacturingStep__OutputAssignment_17 : ( ruleOutputDecision ) ;
    public final void rule__CompositeManufacturingStep__OutputAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8538:1: ( ( ruleOutputDecision ) )
            // InternalMyDsl.g:8539:2: ( ruleOutputDecision )
            {
            // InternalMyDsl.g:8539:2: ( ruleOutputDecision )
            // InternalMyDsl.g:8540:3: ruleOutputDecision
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__OutputAssignment_17"


    // $ANTLR start "rule__CompositeManufacturingStep__OutputAssignment_18_1"
    // InternalMyDsl.g:8549:1: rule__CompositeManufacturingStep__OutputAssignment_18_1 : ( ruleOutputDecision ) ;
    public final void rule__CompositeManufacturingStep__OutputAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8553:1: ( ( ruleOutputDecision ) )
            // InternalMyDsl.g:8554:2: ( ruleOutputDecision )
            {
            // InternalMyDsl.g:8554:2: ( ruleOutputDecision )
            // InternalMyDsl.g:8555:3: ruleOutputDecision
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutputDecision();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getOutputOutputDecisionParserRuleCall_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__OutputAssignment_18_1"


    // $ANTLR start "rule__CompositeManufacturingStep__ContainsAssignment_21"
    // InternalMyDsl.g:8564:1: rule__CompositeManufacturingStep__ContainsAssignment_21 : ( ruleManufacturingSystem ) ;
    public final void rule__CompositeManufacturingStep__ContainsAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8568:1: ( ( ruleManufacturingSystem ) )
            // InternalMyDsl.g:8569:2: ( ruleManufacturingSystem )
            {
            // InternalMyDsl.g:8569:2: ( ruleManufacturingSystem )
            // InternalMyDsl.g:8570:3: ruleManufacturingSystem
            {
             before(grammarAccess.getCompositeManufacturingStepAccess().getContainsManufacturingSystemParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleManufacturingSystem();

            state._fsp--;

             after(grammarAccess.getCompositeManufacturingStepAccess().getContainsManufacturingSystemParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeManufacturingStep__ContainsAssignment_21"


    // $ANTLR start "rule__InputCondition_Impl__NameAssignment_2"
    // InternalMyDsl.g:8579:1: rule__InputCondition_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputCondition_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8583:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8584:2: ( ruleEString )
            {
            // InternalMyDsl.g:8584:2: ( ruleEString )
            // InternalMyDsl.g:8585:3: ruleEString
            {
             before(grammarAccess.getInputCondition_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCondition_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCondition_Impl__NameAssignment_2"


    // $ANTLR start "rule__OutputDecision__OutputTypesAssignment_0_2"
    // InternalMyDsl.g:8594:1: rule__OutputDecision__OutputTypesAssignment_0_2 : ( ( ruleEString ) ) ;
    public final void rule__OutputDecision__OutputTypesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8598:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8599:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8599:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8600:3: ( ruleEString )
            {
             before(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeCrossReference_0_2_0()); 
            // InternalMyDsl.g:8601:3: ( ruleEString )
            // InternalMyDsl.g:8602:4: ruleEString
            {
             before(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeEStringParserRuleCall_0_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeEStringParserRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getOutputDecisionAccess().getOutputTypesWorkPieceTypeCrossReference_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__OutputTypesAssignment_0_2"


    // $ANTLR start "rule__OutputDecision__InputAssignment_3"
    // InternalMyDsl.g:8613:1: rule__OutputDecision__InputAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__OutputDecision__InputAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8617:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8618:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8618:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8619:3: ( ruleEString )
            {
             before(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_3_0()); 
            // InternalMyDsl.g:8620:3: ( ruleEString )
            // InternalMyDsl.g:8621:4: ruleEString
            {
             before(grammarAccess.getOutputDecisionAccess().getInputInputConditionEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputDecisionAccess().getInputInputConditionEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__InputAssignment_3"


    // $ANTLR start "rule__OutputDecision__InputAssignment_4_1"
    // InternalMyDsl.g:8632:1: rule__OutputDecision__InputAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__OutputDecision__InputAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8636:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8637:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8637:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8638:3: ( ruleEString )
            {
             before(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_4_1_0()); 
            // InternalMyDsl.g:8639:3: ( ruleEString )
            // InternalMyDsl.g:8640:4: ruleEString
            {
             before(grammarAccess.getOutputDecisionAccess().getInputInputConditionEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputDecisionAccess().getInputInputConditionEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getOutputDecisionAccess().getInputInputConditionCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputDecision__InputAssignment_4_1"


    // $ANTLR start "rule__WorkPieceCondition__NameAssignment_0"
    // InternalMyDsl.g:8651:1: rule__WorkPieceCondition__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__WorkPieceCondition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8655:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8656:2: ( ruleEString )
            {
            // InternalMyDsl.g:8656:2: ( ruleEString )
            // InternalMyDsl.g:8657:3: ruleEString
            {
             before(grammarAccess.getWorkPieceConditionAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkPieceConditionAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__NameAssignment_0"


    // $ANTLR start "rule__WorkPieceCondition__RequiresTypeAssignment_4"
    // InternalMyDsl.g:8666:1: rule__WorkPieceCondition__RequiresTypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__WorkPieceCondition__RequiresTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8670:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8671:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8671:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8672:3: ( ruleEString )
            {
             before(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeCrossReference_4_0()); 
            // InternalMyDsl.g:8673:3: ( ruleEString )
            // InternalMyDsl.g:8674:4: ruleEString
            {
             before(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getWorkPieceConditionAccess().getRequiresTypeWorkPieceTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorkPieceCondition__RequiresTypeAssignment_4"


    // $ANTLR start "rule__BinaryCondition__NameAssignment_1"
    // InternalMyDsl.g:8685:1: rule__BinaryCondition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BinaryCondition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8689:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8690:2: ( ruleEString )
            {
            // InternalMyDsl.g:8690:2: ( ruleEString )
            // InternalMyDsl.g:8691:3: ruleEString
            {
             before(grammarAccess.getBinaryConditionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__NameAssignment_1"


    // $ANTLR start "rule__BinaryCondition__LeftAssignment_4"
    // InternalMyDsl.g:8700:1: rule__BinaryCondition__LeftAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__BinaryCondition__LeftAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8704:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8705:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8705:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8706:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryConditionAccess().getLeftInputConditionCrossReference_4_0()); 
            // InternalMyDsl.g:8707:3: ( ruleEString )
            // InternalMyDsl.g:8708:4: ruleEString
            {
             before(grammarAccess.getBinaryConditionAccess().getLeftInputConditionEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getLeftInputConditionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getBinaryConditionAccess().getLeftInputConditionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__LeftAssignment_4"


    // $ANTLR start "rule__BinaryCondition__TypeAssignment_5"
    // InternalMyDsl.g:8719:1: rule__BinaryCondition__TypeAssignment_5 : ( ruleBinaryType ) ;
    public final void rule__BinaryCondition__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8723:1: ( ( ruleBinaryType ) )
            // InternalMyDsl.g:8724:2: ( ruleBinaryType )
            {
            // InternalMyDsl.g:8724:2: ( ruleBinaryType )
            // InternalMyDsl.g:8725:3: ruleBinaryType
            {
             before(grammarAccess.getBinaryConditionAccess().getTypeBinaryTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleBinaryType();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getTypeBinaryTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__TypeAssignment_5"


    // $ANTLR start "rule__BinaryCondition__RightAssignment_7"
    // InternalMyDsl.g:8734:1: rule__BinaryCondition__RightAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__BinaryCondition__RightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8738:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8739:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8739:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8740:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryConditionAccess().getRightInputConditionCrossReference_7_0()); 
            // InternalMyDsl.g:8741:3: ( ruleEString )
            // InternalMyDsl.g:8742:4: ruleEString
            {
             before(grammarAccess.getBinaryConditionAccess().getRightInputConditionEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryConditionAccess().getRightInputConditionEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getBinaryConditionAccess().getRightInputConditionCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryCondition__RightAssignment_7"


    // $ANTLR start "rule__Negation__NameAssignment_1"
    // InternalMyDsl.g:8753:1: rule__Negation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Negation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8757:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8758:2: ( ruleEString )
            {
            // InternalMyDsl.g:8758:2: ( ruleEString )
            // InternalMyDsl.g:8759:3: ruleEString
            {
             before(grammarAccess.getNegationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__NameAssignment_1"


    // $ANTLR start "rule__Negation__ContainsAssignment_6"
    // InternalMyDsl.g:8768:1: rule__Negation__ContainsAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Negation__ContainsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8772:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8773:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8773:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8774:3: ( ruleEString )
            {
             before(grammarAccess.getNegationAccess().getContainsInputConditionCrossReference_6_0()); 
            // InternalMyDsl.g:8775:3: ( ruleEString )
            // InternalMyDsl.g:8776:4: ruleEString
            {
             before(grammarAccess.getNegationAccess().getContainsInputConditionEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getContainsInputConditionEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getNegationAccess().getContainsInputConditionCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__ContainsAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000E1110000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000D400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000E1110004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000E1110400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000220400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0012400000000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});

}