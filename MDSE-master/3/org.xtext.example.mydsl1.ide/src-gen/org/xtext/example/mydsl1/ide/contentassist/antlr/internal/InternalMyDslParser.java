package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleBrickModel"
    // InternalMyDsl.g:53:1: entryRuleBrickModel : ruleBrickModel EOF ;
    public final void entryRuleBrickModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleBrickModel EOF )
            // InternalMyDsl.g:55:1: ruleBrickModel EOF
            {
             before(grammarAccess.getBrickModelRule()); 
            pushFollow(FOLLOW_1);
            ruleBrickModel();

            state._fsp--;

             after(grammarAccess.getBrickModelRule()); 
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
    // $ANTLR end "entryRuleBrickModel"


    // $ANTLR start "ruleBrickModel"
    // InternalMyDsl.g:62:1: ruleBrickModel : ( ( rule__BrickModel__Group__0 ) ) ;
    public final void ruleBrickModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__BrickModel__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__BrickModel__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__BrickModel__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__BrickModel__Group__0 )
            {
             before(grammarAccess.getBrickModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__BrickModel__Group__0 )
            // InternalMyDsl.g:69:4: rule__BrickModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BrickModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBrickModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrickModel"


    // $ANTLR start "entryRuleBrickElement"
    // InternalMyDsl.g:78:1: entryRuleBrickElement : ruleBrickElement EOF ;
    public final void entryRuleBrickElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleBrickElement EOF )
            // InternalMyDsl.g:80:1: ruleBrickElement EOF
            {
             before(grammarAccess.getBrickElementRule()); 
            pushFollow(FOLLOW_1);
            ruleBrickElement();

            state._fsp--;

             after(grammarAccess.getBrickElementRule()); 
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
    // $ANTLR end "entryRuleBrickElement"


    // $ANTLR start "ruleBrickElement"
    // InternalMyDsl.g:87:1: ruleBrickElement : ( ( rule__BrickElement__Alternatives ) ) ;
    public final void ruleBrickElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__BrickElement__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__BrickElement__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__BrickElement__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__BrickElement__Alternatives )
            {
             before(grammarAccess.getBrickElementAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__BrickElement__Alternatives )
            // InternalMyDsl.g:94:4: rule__BrickElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BrickElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBrickElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrickElement"


    // $ANTLR start "entryRuleLimits"
    // InternalMyDsl.g:103:1: entryRuleLimits : ruleLimits EOF ;
    public final void entryRuleLimits() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLimits EOF )
            // InternalMyDsl.g:105:1: ruleLimits EOF
            {
             before(grammarAccess.getLimitsRule()); 
            pushFollow(FOLLOW_1);
            ruleLimits();

            state._fsp--;

             after(grammarAccess.getLimitsRule()); 
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
    // $ANTLR end "entryRuleLimits"


    // $ANTLR start "ruleLimits"
    // InternalMyDsl.g:112:1: ruleLimits : ( ( rule__Limits__Group__0 ) ) ;
    public final void ruleLimits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Limits__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Limits__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Limits__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Limits__Group__0 )
            {
             before(grammarAccess.getLimitsAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Limits__Group__0 )
            // InternalMyDsl.g:119:4: rule__Limits__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Limits__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimits"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleEString EOF )
            // InternalMyDsl.g:130:1: ruleEString EOF
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
    // InternalMyDsl.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:144:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleSize"
    // InternalMyDsl.g:153:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSize EOF )
            // InternalMyDsl.g:155:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
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
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalMyDsl.g:162:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Size__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Size__Group__0 )
            // InternalMyDsl.g:169:4: rule__Size__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleAbstractBrick"
    // InternalMyDsl.g:178:1: entryRuleAbstractBrick : ruleAbstractBrick EOF ;
    public final void entryRuleAbstractBrick() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAbstractBrick EOF )
            // InternalMyDsl.g:180:1: ruleAbstractBrick EOF
            {
             before(grammarAccess.getAbstractBrickRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractBrick();

            state._fsp--;

             after(grammarAccess.getAbstractBrickRule()); 
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
    // $ANTLR end "entryRuleAbstractBrick"


    // $ANTLR start "ruleAbstractBrick"
    // InternalMyDsl.g:187:1: ruleAbstractBrick : ( ( rule__AbstractBrick__Group__0 ) ) ;
    public final void ruleAbstractBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AbstractBrick__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AbstractBrick__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AbstractBrick__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AbstractBrick__Group__0 )
            {
             before(grammarAccess.getAbstractBrickAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AbstractBrick__Group__0 )
            // InternalMyDsl.g:194:4: rule__AbstractBrick__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractBrickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractBrick"


    // $ANTLR start "entryRuleComplexBrick"
    // InternalMyDsl.g:203:1: entryRuleComplexBrick : ruleComplexBrick EOF ;
    public final void entryRuleComplexBrick() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleComplexBrick EOF )
            // InternalMyDsl.g:205:1: ruleComplexBrick EOF
            {
             before(grammarAccess.getComplexBrickRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexBrick();

            state._fsp--;

             after(grammarAccess.getComplexBrickRule()); 
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
    // $ANTLR end "entryRuleComplexBrick"


    // $ANTLR start "ruleComplexBrick"
    // InternalMyDsl.g:212:1: ruleComplexBrick : ( ( rule__ComplexBrick__Group__0 ) ) ;
    public final void ruleComplexBrick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ComplexBrick__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ComplexBrick__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ComplexBrick__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__ComplexBrick__Group__0 )
            {
             before(grammarAccess.getComplexBrickAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__ComplexBrick__Group__0 )
            // InternalMyDsl.g:219:4: rule__ComplexBrick__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexBrickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexBrick"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleEInt EOF )
            // InternalMyDsl.g:230:1: ruleEInt EOF
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
    // InternalMyDsl.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:244:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRulePosition"
    // InternalMyDsl.g:253:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( rulePosition EOF )
            // InternalMyDsl.g:255:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalMyDsl.g:262:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Position__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Position__Group__0 )
            // InternalMyDsl.g:269:4: rule__Position__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "rule__BrickElement__Alternatives"
    // InternalMyDsl.g:277:1: rule__BrickElement__Alternatives : ( ( ruleAbstractBrick ) | ( ruleComplexBrick ) );
    public final void rule__BrickElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( ruleAbstractBrick ) | ( ruleComplexBrick ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( ruleAbstractBrick )
                    {
                    // InternalMyDsl.g:282:2: ( ruleAbstractBrick )
                    // InternalMyDsl.g:283:3: ruleAbstractBrick
                    {
                     before(grammarAccess.getBrickElementAccess().getAbstractBrickParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractBrick();

                    state._fsp--;

                     after(grammarAccess.getBrickElementAccess().getAbstractBrickParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( ruleComplexBrick )
                    {
                    // InternalMyDsl.g:288:2: ( ruleComplexBrick )
                    // InternalMyDsl.g:289:3: ruleComplexBrick
                    {
                     before(grammarAccess.getBrickElementAccess().getComplexBrickParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexBrick();

                    state._fsp--;

                     after(grammarAccess.getBrickElementAccess().getComplexBrickParserRuleCall_1()); 

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
    // $ANTLR end "rule__BrickElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:298:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:302:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:303:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:303:2: ( RULE_STRING )
                    // InternalMyDsl.g:304:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:309:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:309:2: ( RULE_ID )
                    // InternalMyDsl.g:310:3: RULE_ID
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


    // $ANTLR start "rule__AbstractBrick__Alternatives_5_1"
    // InternalMyDsl.g:319:1: rule__AbstractBrick__Alternatives_5_1 : ( ( ( rule__AbstractBrick__Group_5_1_0__0 ) ) | ( ( rule__AbstractBrick__DimensionsAssignment_5_1_1 ) ) );
    public final void rule__AbstractBrick__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:1: ( ( ( rule__AbstractBrick__Group_5_1_0__0 ) ) | ( ( rule__AbstractBrick__DimensionsAssignment_5_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==14||(LA3_0>=16 && LA3_0<=17)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:324:2: ( ( rule__AbstractBrick__Group_5_1_0__0 ) )
                    {
                    // InternalMyDsl.g:324:2: ( ( rule__AbstractBrick__Group_5_1_0__0 ) )
                    // InternalMyDsl.g:325:3: ( rule__AbstractBrick__Group_5_1_0__0 )
                    {
                     before(grammarAccess.getAbstractBrickAccess().getGroup_5_1_0()); 
                    // InternalMyDsl.g:326:3: ( rule__AbstractBrick__Group_5_1_0__0 )
                    // InternalMyDsl.g:326:4: rule__AbstractBrick__Group_5_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractBrick__Group_5_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractBrickAccess().getGroup_5_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:330:2: ( ( rule__AbstractBrick__DimensionsAssignment_5_1_1 ) )
                    {
                    // InternalMyDsl.g:330:2: ( ( rule__AbstractBrick__DimensionsAssignment_5_1_1 ) )
                    // InternalMyDsl.g:331:3: ( rule__AbstractBrick__DimensionsAssignment_5_1_1 )
                    {
                     before(grammarAccess.getAbstractBrickAccess().getDimensionsAssignment_5_1_1()); 
                    // InternalMyDsl.g:332:3: ( rule__AbstractBrick__DimensionsAssignment_5_1_1 )
                    // InternalMyDsl.g:332:4: rule__AbstractBrick__DimensionsAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractBrick__DimensionsAssignment_5_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractBrickAccess().getDimensionsAssignment_5_1_1()); 

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
    // $ANTLR end "rule__AbstractBrick__Alternatives_5_1"


    // $ANTLR start "rule__BrickModel__Group__0"
    // InternalMyDsl.g:340:1: rule__BrickModel__Group__0 : rule__BrickModel__Group__0__Impl rule__BrickModel__Group__1 ;
    public final void rule__BrickModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:344:1: ( rule__BrickModel__Group__0__Impl rule__BrickModel__Group__1 )
            // InternalMyDsl.g:345:2: rule__BrickModel__Group__0__Impl rule__BrickModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BrickModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrickModel__Group__1();

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
    // $ANTLR end "rule__BrickModel__Group__0"


    // $ANTLR start "rule__BrickModel__Group__0__Impl"
    // InternalMyDsl.g:352:1: rule__BrickModel__Group__0__Impl : ( 'BrickModel' ) ;
    public final void rule__BrickModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( ( 'BrickModel' ) )
            // InternalMyDsl.g:357:1: ( 'BrickModel' )
            {
            // InternalMyDsl.g:357:1: ( 'BrickModel' )
            // InternalMyDsl.g:358:2: 'BrickModel'
            {
             before(grammarAccess.getBrickModelAccess().getBrickModelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBrickModelAccess().getBrickModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__Group__0__Impl"


    // $ANTLR start "rule__BrickModel__Group__1"
    // InternalMyDsl.g:367:1: rule__BrickModel__Group__1 : rule__BrickModel__Group__1__Impl rule__BrickModel__Group__2 ;
    public final void rule__BrickModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:371:1: ( rule__BrickModel__Group__1__Impl rule__BrickModel__Group__2 )
            // InternalMyDsl.g:372:2: rule__BrickModel__Group__1__Impl rule__BrickModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BrickModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrickModel__Group__2();

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
    // $ANTLR end "rule__BrickModel__Group__1"


    // $ANTLR start "rule__BrickModel__Group__1__Impl"
    // InternalMyDsl.g:379:1: rule__BrickModel__Group__1__Impl : ( ( rule__BrickModel__NameAssignment_1 ) ) ;
    public final void rule__BrickModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( ( ( rule__BrickModel__NameAssignment_1 ) ) )
            // InternalMyDsl.g:384:1: ( ( rule__BrickModel__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:384:1: ( ( rule__BrickModel__NameAssignment_1 ) )
            // InternalMyDsl.g:385:2: ( rule__BrickModel__NameAssignment_1 )
            {
             before(grammarAccess.getBrickModelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:386:2: ( rule__BrickModel__NameAssignment_1 )
            // InternalMyDsl.g:386:3: rule__BrickModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BrickModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBrickModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__Group__1__Impl"


    // $ANTLR start "rule__BrickModel__Group__2"
    // InternalMyDsl.g:394:1: rule__BrickModel__Group__2 : rule__BrickModel__Group__2__Impl rule__BrickModel__Group__3 ;
    public final void rule__BrickModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:398:1: ( rule__BrickModel__Group__2__Impl rule__BrickModel__Group__3 )
            // InternalMyDsl.g:399:2: rule__BrickModel__Group__2__Impl rule__BrickModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__BrickModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrickModel__Group__3();

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
    // $ANTLR end "rule__BrickModel__Group__2"


    // $ANTLR start "rule__BrickModel__Group__2__Impl"
    // InternalMyDsl.g:406:1: rule__BrickModel__Group__2__Impl : ( '{' ) ;
    public final void rule__BrickModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( ( '{' ) )
            // InternalMyDsl.g:411:1: ( '{' )
            {
            // InternalMyDsl.g:411:1: ( '{' )
            // InternalMyDsl.g:412:2: '{'
            {
             before(grammarAccess.getBrickModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBrickModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__Group__2__Impl"


    // $ANTLR start "rule__BrickModel__Group__3"
    // InternalMyDsl.g:421:1: rule__BrickModel__Group__3 : rule__BrickModel__Group__3__Impl rule__BrickModel__Group__4 ;
    public final void rule__BrickModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:425:1: ( rule__BrickModel__Group__3__Impl rule__BrickModel__Group__4 )
            // InternalMyDsl.g:426:2: rule__BrickModel__Group__3__Impl rule__BrickModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__BrickModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrickModel__Group__4();

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
    // $ANTLR end "rule__BrickModel__Group__3"


    // $ANTLR start "rule__BrickModel__Group__3__Impl"
    // InternalMyDsl.g:433:1: rule__BrickModel__Group__3__Impl : ( 'limits' ) ;
    public final void rule__BrickModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( ( 'limits' ) )
            // InternalMyDsl.g:438:1: ( 'limits' )
            {
            // InternalMyDsl.g:438:1: ( 'limits' )
            // InternalMyDsl.g:439:2: 'limits'
            {
             before(grammarAccess.getBrickModelAccess().getLimitsKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBrickModelAccess().getLimitsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__Group__3__Impl"


    // $ANTLR start "rule__BrickModel__Group__4"
    // InternalMyDsl.g:448:1: rule__BrickModel__Group__4 : rule__BrickModel__Group__4__Impl rule__BrickModel__Group__5 ;
    public final void rule__BrickModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( rule__BrickModel__Group__4__Impl rule__BrickModel__Group__5 )
            // InternalMyDsl.g:453:2: rule__BrickModel__Group__4__Impl rule__BrickModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__BrickModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrickModel__Group__5();

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
    // $ANTLR end "rule__BrickModel__Group__4"


    // $ANTLR start "rule__BrickModel__Group__4__Impl"
    // InternalMyDsl.g:460:1: rule__BrickModel__Group__4__Impl : ( ( rule__BrickModel__LimitsAssignment_4 ) ) ;
    public final void rule__BrickModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( ( ( rule__BrickModel__LimitsAssignment_4 ) ) )
            // InternalMyDsl.g:465:1: ( ( rule__BrickModel__LimitsAssignment_4 ) )
            {
            // InternalMyDsl.g:465:1: ( ( rule__BrickModel__LimitsAssignment_4 ) )
            // InternalMyDsl.g:466:2: ( rule__BrickModel__LimitsAssignment_4 )
            {
             before(grammarAccess.getBrickModelAccess().getLimitsAssignment_4()); 
            // InternalMyDsl.g:467:2: ( rule__BrickModel__LimitsAssignment_4 )
            // InternalMyDsl.g:467:3: rule__BrickModel__LimitsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BrickModel__LimitsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBrickModelAccess().getLimitsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__Group__4__Impl"


    // $ANTLR start "rule__BrickModel__Group__5"
    // InternalMyDsl.g:475:1: rule__BrickModel__Group__5 : rule__BrickModel__Group__5__Impl rule__BrickModel__Group__6 ;
    public final void rule__BrickModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:479:1: ( rule__BrickModel__Group__5__Impl rule__BrickModel__Group__6 )
            // InternalMyDsl.g:480:2: rule__BrickModel__Group__5__Impl rule__BrickModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__BrickModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrickModel__Group__6();

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
    // $ANTLR end "rule__BrickModel__Group__5"


    // $ANTLR start "rule__BrickModel__Group__5__Impl"
    // InternalMyDsl.g:487:1: rule__BrickModel__Group__5__Impl : ( ( rule__BrickModel__Group_5__0 )? ) ;
    public final void rule__BrickModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( ( ( rule__BrickModel__Group_5__0 )? ) )
            // InternalMyDsl.g:492:1: ( ( rule__BrickModel__Group_5__0 )? )
            {
            // InternalMyDsl.g:492:1: ( ( rule__BrickModel__Group_5__0 )? )
            // InternalMyDsl.g:493:2: ( rule__BrickModel__Group_5__0 )?
            {
             before(grammarAccess.getBrickModelAccess().getGroup_5()); 
            // InternalMyDsl.g:494:2: ( rule__BrickModel__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:494:3: rule__BrickModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BrickModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBrickModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__Group__5__Impl"


    // $ANTLR start "rule__BrickModel__Group__6"
    // InternalMyDsl.g:502:1: rule__BrickModel__Group__6 : rule__BrickModel__Group__6__Impl ;
    public final void rule__BrickModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( rule__BrickModel__Group__6__Impl )
            // InternalMyDsl.g:507:2: rule__BrickModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BrickModel__Group__6__Impl();

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
    // $ANTLR end "rule__BrickModel__Group__6"


    // $ANTLR start "rule__BrickModel__Group__6__Impl"
    // InternalMyDsl.g:513:1: rule__BrickModel__Group__6__Impl : ( '}' ) ;
    public final void rule__BrickModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( ( '}' ) )
            // InternalMyDsl.g:518:1: ( '}' )
            {
            // InternalMyDsl.g:518:1: ( '}' )
            // InternalMyDsl.g:519:2: '}'
            {
             before(grammarAccess.getBrickModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBrickModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__Group__6__Impl"


    // $ANTLR start "rule__BrickModel__Group_5__0"
    // InternalMyDsl.g:529:1: rule__BrickModel__Group_5__0 : rule__BrickModel__Group_5__0__Impl rule__BrickModel__Group_5__1 ;
    public final void rule__BrickModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:533:1: ( rule__BrickModel__Group_5__0__Impl rule__BrickModel__Group_5__1 )
            // InternalMyDsl.g:534:2: rule__BrickModel__Group_5__0__Impl rule__BrickModel__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__BrickModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BrickModel__Group_5__1();

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
    // $ANTLR end "rule__BrickModel__Group_5__0"


    // $ANTLR start "rule__BrickModel__Group_5__0__Impl"
    // InternalMyDsl.g:541:1: rule__BrickModel__Group_5__0__Impl : ( ( rule__BrickModel__ContainsAssignment_5_0 ) ) ;
    public final void rule__BrickModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( ( ( rule__BrickModel__ContainsAssignment_5_0 ) ) )
            // InternalMyDsl.g:546:1: ( ( rule__BrickModel__ContainsAssignment_5_0 ) )
            {
            // InternalMyDsl.g:546:1: ( ( rule__BrickModel__ContainsAssignment_5_0 ) )
            // InternalMyDsl.g:547:2: ( rule__BrickModel__ContainsAssignment_5_0 )
            {
             before(grammarAccess.getBrickModelAccess().getContainsAssignment_5_0()); 
            // InternalMyDsl.g:548:2: ( rule__BrickModel__ContainsAssignment_5_0 )
            // InternalMyDsl.g:548:3: rule__BrickModel__ContainsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__BrickModel__ContainsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getBrickModelAccess().getContainsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__Group_5__0__Impl"


    // $ANTLR start "rule__BrickModel__Group_5__1"
    // InternalMyDsl.g:556:1: rule__BrickModel__Group_5__1 : rule__BrickModel__Group_5__1__Impl ;
    public final void rule__BrickModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:560:1: ( rule__BrickModel__Group_5__1__Impl )
            // InternalMyDsl.g:561:2: rule__BrickModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BrickModel__Group_5__1__Impl();

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
    // $ANTLR end "rule__BrickModel__Group_5__1"


    // $ANTLR start "rule__BrickModel__Group_5__1__Impl"
    // InternalMyDsl.g:567:1: rule__BrickModel__Group_5__1__Impl : ( ( rule__BrickModel__ContainsAssignment_5_1 )* ) ;
    public final void rule__BrickModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( ( rule__BrickModel__ContainsAssignment_5_1 )* ) )
            // InternalMyDsl.g:572:1: ( ( rule__BrickModel__ContainsAssignment_5_1 )* )
            {
            // InternalMyDsl.g:572:1: ( ( rule__BrickModel__ContainsAssignment_5_1 )* )
            // InternalMyDsl.g:573:2: ( rule__BrickModel__ContainsAssignment_5_1 )*
            {
             before(grammarAccess.getBrickModelAccess().getContainsAssignment_5_1()); 
            // InternalMyDsl.g:574:2: ( rule__BrickModel__ContainsAssignment_5_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=18 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:574:3: rule__BrickModel__ContainsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BrickModel__ContainsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getBrickModelAccess().getContainsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__Group_5__1__Impl"


    // $ANTLR start "rule__Limits__Group__0"
    // InternalMyDsl.g:583:1: rule__Limits__Group__0 : rule__Limits__Group__0__Impl rule__Limits__Group__1 ;
    public final void rule__Limits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( rule__Limits__Group__0__Impl rule__Limits__Group__1 )
            // InternalMyDsl.g:588:2: rule__Limits__Group__0__Impl rule__Limits__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Limits__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limits__Group__1();

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
    // $ANTLR end "rule__Limits__Group__0"


    // $ANTLR start "rule__Limits__Group__0__Impl"
    // InternalMyDsl.g:595:1: rule__Limits__Group__0__Impl : ( () ) ;
    public final void rule__Limits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( ( () ) )
            // InternalMyDsl.g:600:1: ( () )
            {
            // InternalMyDsl.g:600:1: ( () )
            // InternalMyDsl.g:601:2: ()
            {
             before(grammarAccess.getLimitsAccess().getLimitsAction_0()); 
            // InternalMyDsl.g:602:2: ()
            // InternalMyDsl.g:602:3: 
            {
            }

             after(grammarAccess.getLimitsAccess().getLimitsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group__0__Impl"


    // $ANTLR start "rule__Limits__Group__1"
    // InternalMyDsl.g:610:1: rule__Limits__Group__1 : rule__Limits__Group__1__Impl rule__Limits__Group__2 ;
    public final void rule__Limits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( rule__Limits__Group__1__Impl rule__Limits__Group__2 )
            // InternalMyDsl.g:615:2: rule__Limits__Group__1__Impl rule__Limits__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Limits__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limits__Group__2();

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
    // $ANTLR end "rule__Limits__Group__1"


    // $ANTLR start "rule__Limits__Group__1__Impl"
    // InternalMyDsl.g:622:1: rule__Limits__Group__1__Impl : ( 'Dimensions' ) ;
    public final void rule__Limits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( ( 'Dimensions' ) )
            // InternalMyDsl.g:627:1: ( 'Dimensions' )
            {
            // InternalMyDsl.g:627:1: ( 'Dimensions' )
            // InternalMyDsl.g:628:2: 'Dimensions'
            {
             before(grammarAccess.getLimitsAccess().getDimensionsKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLimitsAccess().getDimensionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group__1__Impl"


    // $ANTLR start "rule__Limits__Group__2"
    // InternalMyDsl.g:637:1: rule__Limits__Group__2 : rule__Limits__Group__2__Impl rule__Limits__Group__3 ;
    public final void rule__Limits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:1: ( rule__Limits__Group__2__Impl rule__Limits__Group__3 )
            // InternalMyDsl.g:642:2: rule__Limits__Group__2__Impl rule__Limits__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Limits__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limits__Group__3();

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
    // $ANTLR end "rule__Limits__Group__2"


    // $ANTLR start "rule__Limits__Group__2__Impl"
    // InternalMyDsl.g:649:1: rule__Limits__Group__2__Impl : ( '{' ) ;
    public final void rule__Limits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( ( '{' ) )
            // InternalMyDsl.g:654:1: ( '{' )
            {
            // InternalMyDsl.g:654:1: ( '{' )
            // InternalMyDsl.g:655:2: '{'
            {
             before(grammarAccess.getLimitsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLimitsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group__2__Impl"


    // $ANTLR start "rule__Limits__Group__3"
    // InternalMyDsl.g:664:1: rule__Limits__Group__3 : rule__Limits__Group__3__Impl rule__Limits__Group__4 ;
    public final void rule__Limits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:668:1: ( rule__Limits__Group__3__Impl rule__Limits__Group__4 )
            // InternalMyDsl.g:669:2: rule__Limits__Group__3__Impl rule__Limits__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Limits__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limits__Group__4();

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
    // $ANTLR end "rule__Limits__Group__3"


    // $ANTLR start "rule__Limits__Group__3__Impl"
    // InternalMyDsl.g:676:1: rule__Limits__Group__3__Impl : ( ( rule__Limits__Group_3__0 )? ) ;
    public final void rule__Limits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( ( ( rule__Limits__Group_3__0 )? ) )
            // InternalMyDsl.g:681:1: ( ( rule__Limits__Group_3__0 )? )
            {
            // InternalMyDsl.g:681:1: ( ( rule__Limits__Group_3__0 )? )
            // InternalMyDsl.g:682:2: ( rule__Limits__Group_3__0 )?
            {
             before(grammarAccess.getLimitsAccess().getGroup_3()); 
            // InternalMyDsl.g:683:2: ( rule__Limits__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:683:3: rule__Limits__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limits__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group__3__Impl"


    // $ANTLR start "rule__Limits__Group__4"
    // InternalMyDsl.g:691:1: rule__Limits__Group__4 : rule__Limits__Group__4__Impl rule__Limits__Group__5 ;
    public final void rule__Limits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:695:1: ( rule__Limits__Group__4__Impl rule__Limits__Group__5 )
            // InternalMyDsl.g:696:2: rule__Limits__Group__4__Impl rule__Limits__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Limits__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limits__Group__5();

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
    // $ANTLR end "rule__Limits__Group__4"


    // $ANTLR start "rule__Limits__Group__4__Impl"
    // InternalMyDsl.g:703:1: rule__Limits__Group__4__Impl : ( ( rule__Limits__Group_4__0 )? ) ;
    public final void rule__Limits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( ( ( rule__Limits__Group_4__0 )? ) )
            // InternalMyDsl.g:708:1: ( ( rule__Limits__Group_4__0 )? )
            {
            // InternalMyDsl.g:708:1: ( ( rule__Limits__Group_4__0 )? )
            // InternalMyDsl.g:709:2: ( rule__Limits__Group_4__0 )?
            {
             before(grammarAccess.getLimitsAccess().getGroup_4()); 
            // InternalMyDsl.g:710:2: ( rule__Limits__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:710:3: rule__Limits__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limits__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group__4__Impl"


    // $ANTLR start "rule__Limits__Group__5"
    // InternalMyDsl.g:718:1: rule__Limits__Group__5 : rule__Limits__Group__5__Impl ;
    public final void rule__Limits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:722:1: ( rule__Limits__Group__5__Impl )
            // InternalMyDsl.g:723:2: rule__Limits__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limits__Group__5__Impl();

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
    // $ANTLR end "rule__Limits__Group__5"


    // $ANTLR start "rule__Limits__Group__5__Impl"
    // InternalMyDsl.g:729:1: rule__Limits__Group__5__Impl : ( '}' ) ;
    public final void rule__Limits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( ( '}' ) )
            // InternalMyDsl.g:734:1: ( '}' )
            {
            // InternalMyDsl.g:734:1: ( '}' )
            // InternalMyDsl.g:735:2: '}'
            {
             before(grammarAccess.getLimitsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLimitsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group__5__Impl"


    // $ANTLR start "rule__Limits__Group_3__0"
    // InternalMyDsl.g:745:1: rule__Limits__Group_3__0 : rule__Limits__Group_3__0__Impl rule__Limits__Group_3__1 ;
    public final void rule__Limits__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:749:1: ( rule__Limits__Group_3__0__Impl rule__Limits__Group_3__1 )
            // InternalMyDsl.g:750:2: rule__Limits__Group_3__0__Impl rule__Limits__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Limits__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limits__Group_3__1();

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
    // $ANTLR end "rule__Limits__Group_3__0"


    // $ANTLR start "rule__Limits__Group_3__0__Impl"
    // InternalMyDsl.g:757:1: rule__Limits__Group_3__0__Impl : ( 'width' ) ;
    public final void rule__Limits__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( ( 'width' ) )
            // InternalMyDsl.g:762:1: ( 'width' )
            {
            // InternalMyDsl.g:762:1: ( 'width' )
            // InternalMyDsl.g:763:2: 'width'
            {
             before(grammarAccess.getLimitsAccess().getWidthKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLimitsAccess().getWidthKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group_3__0__Impl"


    // $ANTLR start "rule__Limits__Group_3__1"
    // InternalMyDsl.g:772:1: rule__Limits__Group_3__1 : rule__Limits__Group_3__1__Impl ;
    public final void rule__Limits__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:776:1: ( rule__Limits__Group_3__1__Impl )
            // InternalMyDsl.g:777:2: rule__Limits__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limits__Group_3__1__Impl();

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
    // $ANTLR end "rule__Limits__Group_3__1"


    // $ANTLR start "rule__Limits__Group_3__1__Impl"
    // InternalMyDsl.g:783:1: rule__Limits__Group_3__1__Impl : ( ( rule__Limits__WidthAssignment_3_1 ) ) ;
    public final void rule__Limits__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( ( ( rule__Limits__WidthAssignment_3_1 ) ) )
            // InternalMyDsl.g:788:1: ( ( rule__Limits__WidthAssignment_3_1 ) )
            {
            // InternalMyDsl.g:788:1: ( ( rule__Limits__WidthAssignment_3_1 ) )
            // InternalMyDsl.g:789:2: ( rule__Limits__WidthAssignment_3_1 )
            {
             before(grammarAccess.getLimitsAccess().getWidthAssignment_3_1()); 
            // InternalMyDsl.g:790:2: ( rule__Limits__WidthAssignment_3_1 )
            // InternalMyDsl.g:790:3: rule__Limits__WidthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Limits__WidthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitsAccess().getWidthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group_3__1__Impl"


    // $ANTLR start "rule__Limits__Group_4__0"
    // InternalMyDsl.g:799:1: rule__Limits__Group_4__0 : rule__Limits__Group_4__0__Impl rule__Limits__Group_4__1 ;
    public final void rule__Limits__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:803:1: ( rule__Limits__Group_4__0__Impl rule__Limits__Group_4__1 )
            // InternalMyDsl.g:804:2: rule__Limits__Group_4__0__Impl rule__Limits__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Limits__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limits__Group_4__1();

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
    // $ANTLR end "rule__Limits__Group_4__0"


    // $ANTLR start "rule__Limits__Group_4__0__Impl"
    // InternalMyDsl.g:811:1: rule__Limits__Group_4__0__Impl : ( 'height' ) ;
    public final void rule__Limits__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( ( 'height' ) )
            // InternalMyDsl.g:816:1: ( 'height' )
            {
            // InternalMyDsl.g:816:1: ( 'height' )
            // InternalMyDsl.g:817:2: 'height'
            {
             before(grammarAccess.getLimitsAccess().getHeightKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLimitsAccess().getHeightKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group_4__0__Impl"


    // $ANTLR start "rule__Limits__Group_4__1"
    // InternalMyDsl.g:826:1: rule__Limits__Group_4__1 : rule__Limits__Group_4__1__Impl ;
    public final void rule__Limits__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:1: ( rule__Limits__Group_4__1__Impl )
            // InternalMyDsl.g:831:2: rule__Limits__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limits__Group_4__1__Impl();

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
    // $ANTLR end "rule__Limits__Group_4__1"


    // $ANTLR start "rule__Limits__Group_4__1__Impl"
    // InternalMyDsl.g:837:1: rule__Limits__Group_4__1__Impl : ( ( rule__Limits__LengthAssignment_4_1 ) ) ;
    public final void rule__Limits__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( ( rule__Limits__LengthAssignment_4_1 ) ) )
            // InternalMyDsl.g:842:1: ( ( rule__Limits__LengthAssignment_4_1 ) )
            {
            // InternalMyDsl.g:842:1: ( ( rule__Limits__LengthAssignment_4_1 ) )
            // InternalMyDsl.g:843:2: ( rule__Limits__LengthAssignment_4_1 )
            {
             before(grammarAccess.getLimitsAccess().getLengthAssignment_4_1()); 
            // InternalMyDsl.g:844:2: ( rule__Limits__LengthAssignment_4_1 )
            // InternalMyDsl.g:844:3: rule__Limits__LengthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Limits__LengthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLimitsAccess().getLengthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__Group_4__1__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // InternalMyDsl.g:853:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:857:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalMyDsl.g:858:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__1();

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
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // InternalMyDsl.g:865:1: rule__Size__Group__0__Impl : ( () ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( ( () ) )
            // InternalMyDsl.g:870:1: ( () )
            {
            // InternalMyDsl.g:870:1: ( () )
            // InternalMyDsl.g:871:2: ()
            {
             before(grammarAccess.getSizeAccess().getSizeAction_0()); 
            // InternalMyDsl.g:872:2: ()
            // InternalMyDsl.g:872:3: 
            {
            }

             after(grammarAccess.getSizeAccess().getSizeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // InternalMyDsl.g:880:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:884:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalMyDsl.g:885:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Size__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__2();

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
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // InternalMyDsl.g:892:1: rule__Size__Group__1__Impl : ( ( rule__Size__Group_1__0 )? ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( ( ( rule__Size__Group_1__0 )? ) )
            // InternalMyDsl.g:897:1: ( ( rule__Size__Group_1__0 )? )
            {
            // InternalMyDsl.g:897:1: ( ( rule__Size__Group_1__0 )? )
            // InternalMyDsl.g:898:2: ( rule__Size__Group_1__0 )?
            {
             before(grammarAccess.getSizeAccess().getGroup_1()); 
            // InternalMyDsl.g:899:2: ( rule__Size__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:899:3: rule__Size__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Size__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSizeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // InternalMyDsl.g:907:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:911:1: ( rule__Size__Group__2__Impl )
            // InternalMyDsl.g:912:2: rule__Size__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__2__Impl();

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
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // InternalMyDsl.g:918:1: rule__Size__Group__2__Impl : ( ( rule__Size__Group_2__0 )? ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( ( ( rule__Size__Group_2__0 )? ) )
            // InternalMyDsl.g:923:1: ( ( rule__Size__Group_2__0 )? )
            {
            // InternalMyDsl.g:923:1: ( ( rule__Size__Group_2__0 )? )
            // InternalMyDsl.g:924:2: ( rule__Size__Group_2__0 )?
            {
             before(grammarAccess.getSizeAccess().getGroup_2()); 
            // InternalMyDsl.g:925:2: ( rule__Size__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:925:3: rule__Size__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Size__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSizeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__Size__Group_1__0"
    // InternalMyDsl.g:934:1: rule__Size__Group_1__0 : rule__Size__Group_1__0__Impl rule__Size__Group_1__1 ;
    public final void rule__Size__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:938:1: ( rule__Size__Group_1__0__Impl rule__Size__Group_1__1 )
            // InternalMyDsl.g:939:2: rule__Size__Group_1__0__Impl rule__Size__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Size__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group_1__1();

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
    // $ANTLR end "rule__Size__Group_1__0"


    // $ANTLR start "rule__Size__Group_1__0__Impl"
    // InternalMyDsl.g:946:1: rule__Size__Group_1__0__Impl : ( 'height' ) ;
    public final void rule__Size__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( ( 'height' ) )
            // InternalMyDsl.g:951:1: ( 'height' )
            {
            // InternalMyDsl.g:951:1: ( 'height' )
            // InternalMyDsl.g:952:2: 'height'
            {
             before(grammarAccess.getSizeAccess().getHeightKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getHeightKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__0__Impl"


    // $ANTLR start "rule__Size__Group_1__1"
    // InternalMyDsl.g:961:1: rule__Size__Group_1__1 : rule__Size__Group_1__1__Impl ;
    public final void rule__Size__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:965:1: ( rule__Size__Group_1__1__Impl )
            // InternalMyDsl.g:966:2: rule__Size__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group_1__1__Impl();

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
    // $ANTLR end "rule__Size__Group_1__1"


    // $ANTLR start "rule__Size__Group_1__1__Impl"
    // InternalMyDsl.g:972:1: rule__Size__Group_1__1__Impl : ( ( rule__Size__BrickHeightAssignment_1_1 ) ) ;
    public final void rule__Size__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( ( ( rule__Size__BrickHeightAssignment_1_1 ) ) )
            // InternalMyDsl.g:977:1: ( ( rule__Size__BrickHeightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:977:1: ( ( rule__Size__BrickHeightAssignment_1_1 ) )
            // InternalMyDsl.g:978:2: ( rule__Size__BrickHeightAssignment_1_1 )
            {
             before(grammarAccess.getSizeAccess().getBrickHeightAssignment_1_1()); 
            // InternalMyDsl.g:979:2: ( rule__Size__BrickHeightAssignment_1_1 )
            // InternalMyDsl.g:979:3: rule__Size__BrickHeightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Size__BrickHeightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getBrickHeightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_1__1__Impl"


    // $ANTLR start "rule__Size__Group_2__0"
    // InternalMyDsl.g:988:1: rule__Size__Group_2__0 : rule__Size__Group_2__0__Impl rule__Size__Group_2__1 ;
    public final void rule__Size__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( rule__Size__Group_2__0__Impl rule__Size__Group_2__1 )
            // InternalMyDsl.g:993:2: rule__Size__Group_2__0__Impl rule__Size__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Size__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group_2__1();

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
    // $ANTLR end "rule__Size__Group_2__0"


    // $ANTLR start "rule__Size__Group_2__0__Impl"
    // InternalMyDsl.g:1000:1: rule__Size__Group_2__0__Impl : ( 'width' ) ;
    public final void rule__Size__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( ( 'width' ) )
            // InternalMyDsl.g:1005:1: ( 'width' )
            {
            // InternalMyDsl.g:1005:1: ( 'width' )
            // InternalMyDsl.g:1006:2: 'width'
            {
             before(grammarAccess.getSizeAccess().getWidthKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getWidthKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_2__0__Impl"


    // $ANTLR start "rule__Size__Group_2__1"
    // InternalMyDsl.g:1015:1: rule__Size__Group_2__1 : rule__Size__Group_2__1__Impl ;
    public final void rule__Size__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( rule__Size__Group_2__1__Impl )
            // InternalMyDsl.g:1020:2: rule__Size__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group_2__1__Impl();

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
    // $ANTLR end "rule__Size__Group_2__1"


    // $ANTLR start "rule__Size__Group_2__1__Impl"
    // InternalMyDsl.g:1026:1: rule__Size__Group_2__1__Impl : ( ( rule__Size__BrickWidthAssignment_2_1 ) ) ;
    public final void rule__Size__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( ( ( rule__Size__BrickWidthAssignment_2_1 ) ) )
            // InternalMyDsl.g:1031:1: ( ( rule__Size__BrickWidthAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1031:1: ( ( rule__Size__BrickWidthAssignment_2_1 ) )
            // InternalMyDsl.g:1032:2: ( rule__Size__BrickWidthAssignment_2_1 )
            {
             before(grammarAccess.getSizeAccess().getBrickWidthAssignment_2_1()); 
            // InternalMyDsl.g:1033:2: ( rule__Size__BrickWidthAssignment_2_1 )
            // InternalMyDsl.g:1033:3: rule__Size__BrickWidthAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Size__BrickWidthAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getBrickWidthAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group_2__1__Impl"


    // $ANTLR start "rule__AbstractBrick__Group__0"
    // InternalMyDsl.g:1042:1: rule__AbstractBrick__Group__0 : rule__AbstractBrick__Group__0__Impl rule__AbstractBrick__Group__1 ;
    public final void rule__AbstractBrick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( rule__AbstractBrick__Group__0__Impl rule__AbstractBrick__Group__1 )
            // InternalMyDsl.g:1047:2: rule__AbstractBrick__Group__0__Impl rule__AbstractBrick__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AbstractBrick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group__1();

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
    // $ANTLR end "rule__AbstractBrick__Group__0"


    // $ANTLR start "rule__AbstractBrick__Group__0__Impl"
    // InternalMyDsl.g:1054:1: rule__AbstractBrick__Group__0__Impl : ( () ) ;
    public final void rule__AbstractBrick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( ( () ) )
            // InternalMyDsl.g:1059:1: ( () )
            {
            // InternalMyDsl.g:1059:1: ( () )
            // InternalMyDsl.g:1060:2: ()
            {
             before(grammarAccess.getAbstractBrickAccess().getAbstractBrickAction_0()); 
            // InternalMyDsl.g:1061:2: ()
            // InternalMyDsl.g:1061:3: 
            {
            }

             after(grammarAccess.getAbstractBrickAccess().getAbstractBrickAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group__0__Impl"


    // $ANTLR start "rule__AbstractBrick__Group__1"
    // InternalMyDsl.g:1069:1: rule__AbstractBrick__Group__1 : rule__AbstractBrick__Group__1__Impl rule__AbstractBrick__Group__2 ;
    public final void rule__AbstractBrick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1073:1: ( rule__AbstractBrick__Group__1__Impl rule__AbstractBrick__Group__2 )
            // InternalMyDsl.g:1074:2: rule__AbstractBrick__Group__1__Impl rule__AbstractBrick__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AbstractBrick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group__2();

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
    // $ANTLR end "rule__AbstractBrick__Group__1"


    // $ANTLR start "rule__AbstractBrick__Group__1__Impl"
    // InternalMyDsl.g:1081:1: rule__AbstractBrick__Group__1__Impl : ( 'abstract' ) ;
    public final void rule__AbstractBrick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( ( 'abstract' ) )
            // InternalMyDsl.g:1086:1: ( 'abstract' )
            {
            // InternalMyDsl.g:1086:1: ( 'abstract' )
            // InternalMyDsl.g:1087:2: 'abstract'
            {
             before(grammarAccess.getAbstractBrickAccess().getAbstractKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAbstractBrickAccess().getAbstractKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group__1__Impl"


    // $ANTLR start "rule__AbstractBrick__Group__2"
    // InternalMyDsl.g:1096:1: rule__AbstractBrick__Group__2 : rule__AbstractBrick__Group__2__Impl rule__AbstractBrick__Group__3 ;
    public final void rule__AbstractBrick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1100:1: ( rule__AbstractBrick__Group__2__Impl rule__AbstractBrick__Group__3 )
            // InternalMyDsl.g:1101:2: rule__AbstractBrick__Group__2__Impl rule__AbstractBrick__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__AbstractBrick__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group__3();

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
    // $ANTLR end "rule__AbstractBrick__Group__2"


    // $ANTLR start "rule__AbstractBrick__Group__2__Impl"
    // InternalMyDsl.g:1108:1: rule__AbstractBrick__Group__2__Impl : ( 'Brick' ) ;
    public final void rule__AbstractBrick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( ( 'Brick' ) )
            // InternalMyDsl.g:1113:1: ( 'Brick' )
            {
            // InternalMyDsl.g:1113:1: ( 'Brick' )
            // InternalMyDsl.g:1114:2: 'Brick'
            {
             before(grammarAccess.getAbstractBrickAccess().getBrickKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAbstractBrickAccess().getBrickKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group__2__Impl"


    // $ANTLR start "rule__AbstractBrick__Group__3"
    // InternalMyDsl.g:1123:1: rule__AbstractBrick__Group__3 : rule__AbstractBrick__Group__3__Impl rule__AbstractBrick__Group__4 ;
    public final void rule__AbstractBrick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1127:1: ( rule__AbstractBrick__Group__3__Impl rule__AbstractBrick__Group__4 )
            // InternalMyDsl.g:1128:2: rule__AbstractBrick__Group__3__Impl rule__AbstractBrick__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AbstractBrick__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group__4();

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
    // $ANTLR end "rule__AbstractBrick__Group__3"


    // $ANTLR start "rule__AbstractBrick__Group__3__Impl"
    // InternalMyDsl.g:1135:1: rule__AbstractBrick__Group__3__Impl : ( ( rule__AbstractBrick__NameAssignment_3 ) ) ;
    public final void rule__AbstractBrick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( ( ( rule__AbstractBrick__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1140:1: ( ( rule__AbstractBrick__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1140:1: ( ( rule__AbstractBrick__NameAssignment_3 ) )
            // InternalMyDsl.g:1141:2: ( rule__AbstractBrick__NameAssignment_3 )
            {
             before(grammarAccess.getAbstractBrickAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1142:2: ( rule__AbstractBrick__NameAssignment_3 )
            // InternalMyDsl.g:1142:3: rule__AbstractBrick__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBrick__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAbstractBrickAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group__3__Impl"


    // $ANTLR start "rule__AbstractBrick__Group__4"
    // InternalMyDsl.g:1150:1: rule__AbstractBrick__Group__4 : rule__AbstractBrick__Group__4__Impl rule__AbstractBrick__Group__5 ;
    public final void rule__AbstractBrick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1154:1: ( rule__AbstractBrick__Group__4__Impl rule__AbstractBrick__Group__5 )
            // InternalMyDsl.g:1155:2: rule__AbstractBrick__Group__4__Impl rule__AbstractBrick__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__AbstractBrick__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group__5();

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
    // $ANTLR end "rule__AbstractBrick__Group__4"


    // $ANTLR start "rule__AbstractBrick__Group__4__Impl"
    // InternalMyDsl.g:1162:1: rule__AbstractBrick__Group__4__Impl : ( '{' ) ;
    public final void rule__AbstractBrick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( ( '{' ) )
            // InternalMyDsl.g:1167:1: ( '{' )
            {
            // InternalMyDsl.g:1167:1: ( '{' )
            // InternalMyDsl.g:1168:2: '{'
            {
             before(grammarAccess.getAbstractBrickAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAbstractBrickAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group__4__Impl"


    // $ANTLR start "rule__AbstractBrick__Group__5"
    // InternalMyDsl.g:1177:1: rule__AbstractBrick__Group__5 : rule__AbstractBrick__Group__5__Impl rule__AbstractBrick__Group__6 ;
    public final void rule__AbstractBrick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1181:1: ( rule__AbstractBrick__Group__5__Impl rule__AbstractBrick__Group__6 )
            // InternalMyDsl.g:1182:2: rule__AbstractBrick__Group__5__Impl rule__AbstractBrick__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__AbstractBrick__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group__6();

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
    // $ANTLR end "rule__AbstractBrick__Group__5"


    // $ANTLR start "rule__AbstractBrick__Group__5__Impl"
    // InternalMyDsl.g:1189:1: rule__AbstractBrick__Group__5__Impl : ( ( rule__AbstractBrick__Group_5__0 )? ) ;
    public final void rule__AbstractBrick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( ( ( rule__AbstractBrick__Group_5__0 )? ) )
            // InternalMyDsl.g:1194:1: ( ( rule__AbstractBrick__Group_5__0 )? )
            {
            // InternalMyDsl.g:1194:1: ( ( rule__AbstractBrick__Group_5__0 )? )
            // InternalMyDsl.g:1195:2: ( rule__AbstractBrick__Group_5__0 )?
            {
             before(grammarAccess.getAbstractBrickAccess().getGroup_5()); 
            // InternalMyDsl.g:1196:2: ( rule__AbstractBrick__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1196:3: rule__AbstractBrick__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractBrick__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractBrickAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group__5__Impl"


    // $ANTLR start "rule__AbstractBrick__Group__6"
    // InternalMyDsl.g:1204:1: rule__AbstractBrick__Group__6 : rule__AbstractBrick__Group__6__Impl ;
    public final void rule__AbstractBrick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1208:1: ( rule__AbstractBrick__Group__6__Impl )
            // InternalMyDsl.g:1209:2: rule__AbstractBrick__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group__6__Impl();

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
    // $ANTLR end "rule__AbstractBrick__Group__6"


    // $ANTLR start "rule__AbstractBrick__Group__6__Impl"
    // InternalMyDsl.g:1215:1: rule__AbstractBrick__Group__6__Impl : ( '}' ) ;
    public final void rule__AbstractBrick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( '}' ) )
            // InternalMyDsl.g:1220:1: ( '}' )
            {
            // InternalMyDsl.g:1220:1: ( '}' )
            // InternalMyDsl.g:1221:2: '}'
            {
             before(grammarAccess.getAbstractBrickAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAbstractBrickAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group__6__Impl"


    // $ANTLR start "rule__AbstractBrick__Group_5__0"
    // InternalMyDsl.g:1231:1: rule__AbstractBrick__Group_5__0 : rule__AbstractBrick__Group_5__0__Impl rule__AbstractBrick__Group_5__1 ;
    public final void rule__AbstractBrick__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1235:1: ( rule__AbstractBrick__Group_5__0__Impl rule__AbstractBrick__Group_5__1 )
            // InternalMyDsl.g:1236:2: rule__AbstractBrick__Group_5__0__Impl rule__AbstractBrick__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__AbstractBrick__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group_5__1();

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
    // $ANTLR end "rule__AbstractBrick__Group_5__0"


    // $ANTLR start "rule__AbstractBrick__Group_5__0__Impl"
    // InternalMyDsl.g:1243:1: rule__AbstractBrick__Group_5__0__Impl : ( 'Dimensions' ) ;
    public final void rule__AbstractBrick__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( ( 'Dimensions' ) )
            // InternalMyDsl.g:1248:1: ( 'Dimensions' )
            {
            // InternalMyDsl.g:1248:1: ( 'Dimensions' )
            // InternalMyDsl.g:1249:2: 'Dimensions'
            {
             before(grammarAccess.getAbstractBrickAccess().getDimensionsKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAbstractBrickAccess().getDimensionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group_5__0__Impl"


    // $ANTLR start "rule__AbstractBrick__Group_5__1"
    // InternalMyDsl.g:1258:1: rule__AbstractBrick__Group_5__1 : rule__AbstractBrick__Group_5__1__Impl ;
    public final void rule__AbstractBrick__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( rule__AbstractBrick__Group_5__1__Impl )
            // InternalMyDsl.g:1263:2: rule__AbstractBrick__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group_5__1__Impl();

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
    // $ANTLR end "rule__AbstractBrick__Group_5__1"


    // $ANTLR start "rule__AbstractBrick__Group_5__1__Impl"
    // InternalMyDsl.g:1269:1: rule__AbstractBrick__Group_5__1__Impl : ( ( rule__AbstractBrick__Alternatives_5_1 ) ) ;
    public final void rule__AbstractBrick__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( ( ( rule__AbstractBrick__Alternatives_5_1 ) ) )
            // InternalMyDsl.g:1274:1: ( ( rule__AbstractBrick__Alternatives_5_1 ) )
            {
            // InternalMyDsl.g:1274:1: ( ( rule__AbstractBrick__Alternatives_5_1 ) )
            // InternalMyDsl.g:1275:2: ( rule__AbstractBrick__Alternatives_5_1 )
            {
             before(grammarAccess.getAbstractBrickAccess().getAlternatives_5_1()); 
            // InternalMyDsl.g:1276:2: ( rule__AbstractBrick__Alternatives_5_1 )
            // InternalMyDsl.g:1276:3: rule__AbstractBrick__Alternatives_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Alternatives_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractBrickAccess().getAlternatives_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group_5__1__Impl"


    // $ANTLR start "rule__AbstractBrick__Group_5_1_0__0"
    // InternalMyDsl.g:1285:1: rule__AbstractBrick__Group_5_1_0__0 : rule__AbstractBrick__Group_5_1_0__0__Impl rule__AbstractBrick__Group_5_1_0__1 ;
    public final void rule__AbstractBrick__Group_5_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1289:1: ( rule__AbstractBrick__Group_5_1_0__0__Impl rule__AbstractBrick__Group_5_1_0__1 )
            // InternalMyDsl.g:1290:2: rule__AbstractBrick__Group_5_1_0__0__Impl rule__AbstractBrick__Group_5_1_0__1
            {
            pushFollow(FOLLOW_17);
            rule__AbstractBrick__Group_5_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group_5_1_0__1();

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
    // $ANTLR end "rule__AbstractBrick__Group_5_1_0__0"


    // $ANTLR start "rule__AbstractBrick__Group_5_1_0__0__Impl"
    // InternalMyDsl.g:1297:1: rule__AbstractBrick__Group_5_1_0__0__Impl : ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 ) ) ;
    public final void rule__AbstractBrick__Group_5_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 ) ) )
            // InternalMyDsl.g:1302:1: ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 ) )
            {
            // InternalMyDsl.g:1302:1: ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 ) )
            // InternalMyDsl.g:1303:2: ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 )
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeAssignment_5_1_0_0()); 
            // InternalMyDsl.g:1304:2: ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 )
            // InternalMyDsl.g:1304:3: rule__AbstractBrick__GetSizeAssignment_5_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBrick__GetSizeAssignment_5_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractBrickAccess().getGetSizeAssignment_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group_5_1_0__0__Impl"


    // $ANTLR start "rule__AbstractBrick__Group_5_1_0__1"
    // InternalMyDsl.g:1312:1: rule__AbstractBrick__Group_5_1_0__1 : rule__AbstractBrick__Group_5_1_0__1__Impl rule__AbstractBrick__Group_5_1_0__2 ;
    public final void rule__AbstractBrick__Group_5_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:1: ( rule__AbstractBrick__Group_5_1_0__1__Impl rule__AbstractBrick__Group_5_1_0__2 )
            // InternalMyDsl.g:1317:2: rule__AbstractBrick__Group_5_1_0__1__Impl rule__AbstractBrick__Group_5_1_0__2
            {
            pushFollow(FOLLOW_3);
            rule__AbstractBrick__Group_5_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group_5_1_0__2();

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
    // $ANTLR end "rule__AbstractBrick__Group_5_1_0__1"


    // $ANTLR start "rule__AbstractBrick__Group_5_1_0__1__Impl"
    // InternalMyDsl.g:1324:1: rule__AbstractBrick__Group_5_1_0__1__Impl : ( '.height' ) ;
    public final void rule__AbstractBrick__Group_5_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( ( '.height' ) )
            // InternalMyDsl.g:1329:1: ( '.height' )
            {
            // InternalMyDsl.g:1329:1: ( '.height' )
            // InternalMyDsl.g:1330:2: '.height'
            {
             before(grammarAccess.getAbstractBrickAccess().getHeightKeyword_5_1_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAbstractBrickAccess().getHeightKeyword_5_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group_5_1_0__1__Impl"


    // $ANTLR start "rule__AbstractBrick__Group_5_1_0__2"
    // InternalMyDsl.g:1339:1: rule__AbstractBrick__Group_5_1_0__2 : rule__AbstractBrick__Group_5_1_0__2__Impl rule__AbstractBrick__Group_5_1_0__3 ;
    public final void rule__AbstractBrick__Group_5_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1343:1: ( rule__AbstractBrick__Group_5_1_0__2__Impl rule__AbstractBrick__Group_5_1_0__3 )
            // InternalMyDsl.g:1344:2: rule__AbstractBrick__Group_5_1_0__2__Impl rule__AbstractBrick__Group_5_1_0__3
            {
            pushFollow(FOLLOW_18);
            rule__AbstractBrick__Group_5_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group_5_1_0__3();

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
    // $ANTLR end "rule__AbstractBrick__Group_5_1_0__2"


    // $ANTLR start "rule__AbstractBrick__Group_5_1_0__2__Impl"
    // InternalMyDsl.g:1351:1: rule__AbstractBrick__Group_5_1_0__2__Impl : ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 ) ) ;
    public final void rule__AbstractBrick__Group_5_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 ) ) )
            // InternalMyDsl.g:1356:1: ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 ) )
            {
            // InternalMyDsl.g:1356:1: ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 ) )
            // InternalMyDsl.g:1357:2: ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 )
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeAssignment_5_1_0_2()); 
            // InternalMyDsl.g:1358:2: ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 )
            // InternalMyDsl.g:1358:3: rule__AbstractBrick__GetSizeAssignment_5_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBrick__GetSizeAssignment_5_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAbstractBrickAccess().getGetSizeAssignment_5_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group_5_1_0__2__Impl"


    // $ANTLR start "rule__AbstractBrick__Group_5_1_0__3"
    // InternalMyDsl.g:1366:1: rule__AbstractBrick__Group_5_1_0__3 : rule__AbstractBrick__Group_5_1_0__3__Impl ;
    public final void rule__AbstractBrick__Group_5_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1370:1: ( rule__AbstractBrick__Group_5_1_0__3__Impl )
            // InternalMyDsl.g:1371:2: rule__AbstractBrick__Group_5_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractBrick__Group_5_1_0__3__Impl();

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
    // $ANTLR end "rule__AbstractBrick__Group_5_1_0__3"


    // $ANTLR start "rule__AbstractBrick__Group_5_1_0__3__Impl"
    // InternalMyDsl.g:1377:1: rule__AbstractBrick__Group_5_1_0__3__Impl : ( '.width' ) ;
    public final void rule__AbstractBrick__Group_5_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1381:1: ( ( '.width' ) )
            // InternalMyDsl.g:1382:1: ( '.width' )
            {
            // InternalMyDsl.g:1382:1: ( '.width' )
            // InternalMyDsl.g:1383:2: '.width'
            {
             before(grammarAccess.getAbstractBrickAccess().getWidthKeyword_5_1_0_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAbstractBrickAccess().getWidthKeyword_5_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__Group_5_1_0__3__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__0"
    // InternalMyDsl.g:1393:1: rule__ComplexBrick__Group__0 : rule__ComplexBrick__Group__0__Impl rule__ComplexBrick__Group__1 ;
    public final void rule__ComplexBrick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1397:1: ( rule__ComplexBrick__Group__0__Impl rule__ComplexBrick__Group__1 )
            // InternalMyDsl.g:1398:2: rule__ComplexBrick__Group__0__Impl rule__ComplexBrick__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ComplexBrick__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__1();

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
    // $ANTLR end "rule__ComplexBrick__Group__0"


    // $ANTLR start "rule__ComplexBrick__Group__0__Impl"
    // InternalMyDsl.g:1405:1: rule__ComplexBrick__Group__0__Impl : ( () ) ;
    public final void rule__ComplexBrick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( ( () ) )
            // InternalMyDsl.g:1410:1: ( () )
            {
            // InternalMyDsl.g:1410:1: ( () )
            // InternalMyDsl.g:1411:2: ()
            {
             before(grammarAccess.getComplexBrickAccess().getComplexBrickAction_0()); 
            // InternalMyDsl.g:1412:2: ()
            // InternalMyDsl.g:1412:3: 
            {
            }

             after(grammarAccess.getComplexBrickAccess().getComplexBrickAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__0__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__1"
    // InternalMyDsl.g:1420:1: rule__ComplexBrick__Group__1 : rule__ComplexBrick__Group__1__Impl rule__ComplexBrick__Group__2 ;
    public final void rule__ComplexBrick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( rule__ComplexBrick__Group__1__Impl rule__ComplexBrick__Group__2 )
            // InternalMyDsl.g:1425:2: rule__ComplexBrick__Group__1__Impl rule__ComplexBrick__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ComplexBrick__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__2();

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
    // $ANTLR end "rule__ComplexBrick__Group__1"


    // $ANTLR start "rule__ComplexBrick__Group__1__Impl"
    // InternalMyDsl.g:1432:1: rule__ComplexBrick__Group__1__Impl : ( 'Brick' ) ;
    public final void rule__ComplexBrick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( ( 'Brick' ) )
            // InternalMyDsl.g:1437:1: ( 'Brick' )
            {
            // InternalMyDsl.g:1437:1: ( 'Brick' )
            // InternalMyDsl.g:1438:2: 'Brick'
            {
             before(grammarAccess.getComplexBrickAccess().getBrickKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getBrickKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__1__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__2"
    // InternalMyDsl.g:1447:1: rule__ComplexBrick__Group__2 : rule__ComplexBrick__Group__2__Impl rule__ComplexBrick__Group__3 ;
    public final void rule__ComplexBrick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1451:1: ( rule__ComplexBrick__Group__2__Impl rule__ComplexBrick__Group__3 )
            // InternalMyDsl.g:1452:2: rule__ComplexBrick__Group__2__Impl rule__ComplexBrick__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ComplexBrick__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__3();

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
    // $ANTLR end "rule__ComplexBrick__Group__2"


    // $ANTLR start "rule__ComplexBrick__Group__2__Impl"
    // InternalMyDsl.g:1459:1: rule__ComplexBrick__Group__2__Impl : ( ( rule__ComplexBrick__NameAssignment_2 ) ) ;
    public final void rule__ComplexBrick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( ( rule__ComplexBrick__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1464:1: ( ( rule__ComplexBrick__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1464:1: ( ( rule__ComplexBrick__NameAssignment_2 ) )
            // InternalMyDsl.g:1465:2: ( rule__ComplexBrick__NameAssignment_2 )
            {
             before(grammarAccess.getComplexBrickAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1466:2: ( rule__ComplexBrick__NameAssignment_2 )
            // InternalMyDsl.g:1466:3: rule__ComplexBrick__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexBrickAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__2__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__3"
    // InternalMyDsl.g:1474:1: rule__ComplexBrick__Group__3 : rule__ComplexBrick__Group__3__Impl rule__ComplexBrick__Group__4 ;
    public final void rule__ComplexBrick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1478:1: ( rule__ComplexBrick__Group__3__Impl rule__ComplexBrick__Group__4 )
            // InternalMyDsl.g:1479:2: rule__ComplexBrick__Group__3__Impl rule__ComplexBrick__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ComplexBrick__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__4();

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
    // $ANTLR end "rule__ComplexBrick__Group__3"


    // $ANTLR start "rule__ComplexBrick__Group__3__Impl"
    // InternalMyDsl.g:1486:1: rule__ComplexBrick__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexBrick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( ( '{' ) )
            // InternalMyDsl.g:1491:1: ( '{' )
            {
            // InternalMyDsl.g:1491:1: ( '{' )
            // InternalMyDsl.g:1492:2: '{'
            {
             before(grammarAccess.getComplexBrickAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__3__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__4"
    // InternalMyDsl.g:1501:1: rule__ComplexBrick__Group__4 : rule__ComplexBrick__Group__4__Impl rule__ComplexBrick__Group__5 ;
    public final void rule__ComplexBrick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1505:1: ( rule__ComplexBrick__Group__4__Impl rule__ComplexBrick__Group__5 )
            // InternalMyDsl.g:1506:2: rule__ComplexBrick__Group__4__Impl rule__ComplexBrick__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ComplexBrick__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__5();

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
    // $ANTLR end "rule__ComplexBrick__Group__4"


    // $ANTLR start "rule__ComplexBrick__Group__4__Impl"
    // InternalMyDsl.g:1513:1: rule__ComplexBrick__Group__4__Impl : ( 'createBrick' ) ;
    public final void rule__ComplexBrick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( ( 'createBrick' ) )
            // InternalMyDsl.g:1518:1: ( 'createBrick' )
            {
            // InternalMyDsl.g:1518:1: ( 'createBrick' )
            // InternalMyDsl.g:1519:2: 'createBrick'
            {
             before(grammarAccess.getComplexBrickAccess().getCreateBrickKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getCreateBrickKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__4__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__5"
    // InternalMyDsl.g:1528:1: rule__ComplexBrick__Group__5 : rule__ComplexBrick__Group__5__Impl rule__ComplexBrick__Group__6 ;
    public final void rule__ComplexBrick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1532:1: ( rule__ComplexBrick__Group__5__Impl rule__ComplexBrick__Group__6 )
            // InternalMyDsl.g:1533:2: rule__ComplexBrick__Group__5__Impl rule__ComplexBrick__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ComplexBrick__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__6();

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
    // $ANTLR end "rule__ComplexBrick__Group__5"


    // $ANTLR start "rule__ComplexBrick__Group__5__Impl"
    // InternalMyDsl.g:1540:1: rule__ComplexBrick__Group__5__Impl : ( '{' ) ;
    public final void rule__ComplexBrick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( ( '{' ) )
            // InternalMyDsl.g:1545:1: ( '{' )
            {
            // InternalMyDsl.g:1545:1: ( '{' )
            // InternalMyDsl.g:1546:2: '{'
            {
             before(grammarAccess.getComplexBrickAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__5__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__6"
    // InternalMyDsl.g:1555:1: rule__ComplexBrick__Group__6 : rule__ComplexBrick__Group__6__Impl rule__ComplexBrick__Group__7 ;
    public final void rule__ComplexBrick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1559:1: ( rule__ComplexBrick__Group__6__Impl rule__ComplexBrick__Group__7 )
            // InternalMyDsl.g:1560:2: rule__ComplexBrick__Group__6__Impl rule__ComplexBrick__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__ComplexBrick__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__7();

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
    // $ANTLR end "rule__ComplexBrick__Group__6"


    // $ANTLR start "rule__ComplexBrick__Group__6__Impl"
    // InternalMyDsl.g:1567:1: rule__ComplexBrick__Group__6__Impl : ( 'Dimensions' ) ;
    public final void rule__ComplexBrick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( ( 'Dimensions' ) )
            // InternalMyDsl.g:1572:1: ( 'Dimensions' )
            {
            // InternalMyDsl.g:1572:1: ( 'Dimensions' )
            // InternalMyDsl.g:1573:2: 'Dimensions'
            {
             before(grammarAccess.getComplexBrickAccess().getDimensionsKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getDimensionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__6__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__7"
    // InternalMyDsl.g:1582:1: rule__ComplexBrick__Group__7 : rule__ComplexBrick__Group__7__Impl rule__ComplexBrick__Group__8 ;
    public final void rule__ComplexBrick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1586:1: ( rule__ComplexBrick__Group__7__Impl rule__ComplexBrick__Group__8 )
            // InternalMyDsl.g:1587:2: rule__ComplexBrick__Group__7__Impl rule__ComplexBrick__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__ComplexBrick__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__8();

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
    // $ANTLR end "rule__ComplexBrick__Group__7"


    // $ANTLR start "rule__ComplexBrick__Group__7__Impl"
    // InternalMyDsl.g:1594:1: rule__ComplexBrick__Group__7__Impl : ( '(' ) ;
    public final void rule__ComplexBrick__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( ( '(' ) )
            // InternalMyDsl.g:1599:1: ( '(' )
            {
            // InternalMyDsl.g:1599:1: ( '(' )
            // InternalMyDsl.g:1600:2: '('
            {
             before(grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__7__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__8"
    // InternalMyDsl.g:1609:1: rule__ComplexBrick__Group__8 : rule__ComplexBrick__Group__8__Impl rule__ComplexBrick__Group__9 ;
    public final void rule__ComplexBrick__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1613:1: ( rule__ComplexBrick__Group__8__Impl rule__ComplexBrick__Group__9 )
            // InternalMyDsl.g:1614:2: rule__ComplexBrick__Group__8__Impl rule__ComplexBrick__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__ComplexBrick__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__9();

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
    // $ANTLR end "rule__ComplexBrick__Group__8"


    // $ANTLR start "rule__ComplexBrick__Group__8__Impl"
    // InternalMyDsl.g:1621:1: rule__ComplexBrick__Group__8__Impl : ( ( rule__ComplexBrick__GetSizeAssignment_8 ) ) ;
    public final void rule__ComplexBrick__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( ( ( rule__ComplexBrick__GetSizeAssignment_8 ) ) )
            // InternalMyDsl.g:1626:1: ( ( rule__ComplexBrick__GetSizeAssignment_8 ) )
            {
            // InternalMyDsl.g:1626:1: ( ( rule__ComplexBrick__GetSizeAssignment_8 ) )
            // InternalMyDsl.g:1627:2: ( rule__ComplexBrick__GetSizeAssignment_8 )
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeAssignment_8()); 
            // InternalMyDsl.g:1628:2: ( rule__ComplexBrick__GetSizeAssignment_8 )
            // InternalMyDsl.g:1628:3: rule__ComplexBrick__GetSizeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__GetSizeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getComplexBrickAccess().getGetSizeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__8__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__9"
    // InternalMyDsl.g:1636:1: rule__ComplexBrick__Group__9 : rule__ComplexBrick__Group__9__Impl rule__ComplexBrick__Group__10 ;
    public final void rule__ComplexBrick__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1640:1: ( rule__ComplexBrick__Group__9__Impl rule__ComplexBrick__Group__10 )
            // InternalMyDsl.g:1641:2: rule__ComplexBrick__Group__9__Impl rule__ComplexBrick__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__ComplexBrick__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__10();

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
    // $ANTLR end "rule__ComplexBrick__Group__9"


    // $ANTLR start "rule__ComplexBrick__Group__9__Impl"
    // InternalMyDsl.g:1648:1: rule__ComplexBrick__Group__9__Impl : ( '(' ) ;
    public final void rule__ComplexBrick__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( ( '(' ) )
            // InternalMyDsl.g:1653:1: ( '(' )
            {
            // InternalMyDsl.g:1653:1: ( '(' )
            // InternalMyDsl.g:1654:2: '('
            {
             before(grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__9__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__10"
    // InternalMyDsl.g:1663:1: rule__ComplexBrick__Group__10 : rule__ComplexBrick__Group__10__Impl rule__ComplexBrick__Group__11 ;
    public final void rule__ComplexBrick__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1667:1: ( rule__ComplexBrick__Group__10__Impl rule__ComplexBrick__Group__11 )
            // InternalMyDsl.g:1668:2: rule__ComplexBrick__Group__10__Impl rule__ComplexBrick__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__ComplexBrick__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__11();

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
    // $ANTLR end "rule__ComplexBrick__Group__10"


    // $ANTLR start "rule__ComplexBrick__Group__10__Impl"
    // InternalMyDsl.g:1675:1: rule__ComplexBrick__Group__10__Impl : ( ( rule__ComplexBrick__HasPositionAssignment_10 ) ) ;
    public final void rule__ComplexBrick__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( ( ( rule__ComplexBrick__HasPositionAssignment_10 ) ) )
            // InternalMyDsl.g:1680:1: ( ( rule__ComplexBrick__HasPositionAssignment_10 ) )
            {
            // InternalMyDsl.g:1680:1: ( ( rule__ComplexBrick__HasPositionAssignment_10 ) )
            // InternalMyDsl.g:1681:2: ( rule__ComplexBrick__HasPositionAssignment_10 )
            {
             before(grammarAccess.getComplexBrickAccess().getHasPositionAssignment_10()); 
            // InternalMyDsl.g:1682:2: ( rule__ComplexBrick__HasPositionAssignment_10 )
            // InternalMyDsl.g:1682:3: rule__ComplexBrick__HasPositionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__HasPositionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getComplexBrickAccess().getHasPositionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__10__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__11"
    // InternalMyDsl.g:1690:1: rule__ComplexBrick__Group__11 : rule__ComplexBrick__Group__11__Impl rule__ComplexBrick__Group__12 ;
    public final void rule__ComplexBrick__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1694:1: ( rule__ComplexBrick__Group__11__Impl rule__ComplexBrick__Group__12 )
            // InternalMyDsl.g:1695:2: rule__ComplexBrick__Group__11__Impl rule__ComplexBrick__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__ComplexBrick__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__12();

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
    // $ANTLR end "rule__ComplexBrick__Group__11"


    // $ANTLR start "rule__ComplexBrick__Group__11__Impl"
    // InternalMyDsl.g:1702:1: rule__ComplexBrick__Group__11__Impl : ( ')' ) ;
    public final void rule__ComplexBrick__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( ( ')' ) )
            // InternalMyDsl.g:1707:1: ( ')' )
            {
            // InternalMyDsl.g:1707:1: ( ')' )
            // InternalMyDsl.g:1708:2: ')'
            {
             before(grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_11()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__11__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__12"
    // InternalMyDsl.g:1717:1: rule__ComplexBrick__Group__12 : rule__ComplexBrick__Group__12__Impl rule__ComplexBrick__Group__13 ;
    public final void rule__ComplexBrick__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1721:1: ( rule__ComplexBrick__Group__12__Impl rule__ComplexBrick__Group__13 )
            // InternalMyDsl.g:1722:2: rule__ComplexBrick__Group__12__Impl rule__ComplexBrick__Group__13
            {
            pushFollow(FOLLOW_22);
            rule__ComplexBrick__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__13();

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
    // $ANTLR end "rule__ComplexBrick__Group__12"


    // $ANTLR start "rule__ComplexBrick__Group__12__Impl"
    // InternalMyDsl.g:1729:1: rule__ComplexBrick__Group__12__Impl : ( ( rule__ComplexBrick__Group_12__0 )* ) ;
    public final void rule__ComplexBrick__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( ( ( rule__ComplexBrick__Group_12__0 )* ) )
            // InternalMyDsl.g:1734:1: ( ( rule__ComplexBrick__Group_12__0 )* )
            {
            // InternalMyDsl.g:1734:1: ( ( rule__ComplexBrick__Group_12__0 )* )
            // InternalMyDsl.g:1735:2: ( rule__ComplexBrick__Group_12__0 )*
            {
             before(grammarAccess.getComplexBrickAccess().getGroup_12()); 
            // InternalMyDsl.g:1736:2: ( rule__ComplexBrick__Group_12__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1736:3: rule__ComplexBrick__Group_12__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ComplexBrick__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComplexBrickAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__12__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__13"
    // InternalMyDsl.g:1744:1: rule__ComplexBrick__Group__13 : rule__ComplexBrick__Group__13__Impl rule__ComplexBrick__Group__14 ;
    public final void rule__ComplexBrick__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1748:1: ( rule__ComplexBrick__Group__13__Impl rule__ComplexBrick__Group__14 )
            // InternalMyDsl.g:1749:2: rule__ComplexBrick__Group__13__Impl rule__ComplexBrick__Group__14
            {
            pushFollow(FOLLOW_24);
            rule__ComplexBrick__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__14();

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
    // $ANTLR end "rule__ComplexBrick__Group__13"


    // $ANTLR start "rule__ComplexBrick__Group__13__Impl"
    // InternalMyDsl.g:1756:1: rule__ComplexBrick__Group__13__Impl : ( ')' ) ;
    public final void rule__ComplexBrick__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( ( ')' ) )
            // InternalMyDsl.g:1761:1: ( ')' )
            {
            // InternalMyDsl.g:1761:1: ( ')' )
            // InternalMyDsl.g:1762:2: ')'
            {
             before(grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_13()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__13__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__14"
    // InternalMyDsl.g:1771:1: rule__ComplexBrick__Group__14 : rule__ComplexBrick__Group__14__Impl rule__ComplexBrick__Group__15 ;
    public final void rule__ComplexBrick__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1775:1: ( rule__ComplexBrick__Group__14__Impl rule__ComplexBrick__Group__15 )
            // InternalMyDsl.g:1776:2: rule__ComplexBrick__Group__14__Impl rule__ComplexBrick__Group__15
            {
            pushFollow(FOLLOW_24);
            rule__ComplexBrick__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__15();

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
    // $ANTLR end "rule__ComplexBrick__Group__14"


    // $ANTLR start "rule__ComplexBrick__Group__14__Impl"
    // InternalMyDsl.g:1783:1: rule__ComplexBrick__Group__14__Impl : ( '}' ) ;
    public final void rule__ComplexBrick__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( ( '}' ) )
            // InternalMyDsl.g:1788:1: ( '}' )
            {
            // InternalMyDsl.g:1788:1: ( '}' )
            // InternalMyDsl.g:1789:2: '}'
            {
             before(grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_14()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__14__Impl"


    // $ANTLR start "rule__ComplexBrick__Group__15"
    // InternalMyDsl.g:1798:1: rule__ComplexBrick__Group__15 : rule__ComplexBrick__Group__15__Impl ;
    public final void rule__ComplexBrick__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1802:1: ( rule__ComplexBrick__Group__15__Impl )
            // InternalMyDsl.g:1803:2: rule__ComplexBrick__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__15__Impl();

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
    // $ANTLR end "rule__ComplexBrick__Group__15"


    // $ANTLR start "rule__ComplexBrick__Group__15__Impl"
    // InternalMyDsl.g:1809:1: rule__ComplexBrick__Group__15__Impl : ( '}' ) ;
    public final void rule__ComplexBrick__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( ( '}' ) )
            // InternalMyDsl.g:1814:1: ( '}' )
            {
            // InternalMyDsl.g:1814:1: ( '}' )
            // InternalMyDsl.g:1815:2: '}'
            {
             before(grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_15()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__15__Impl"


    // $ANTLR start "rule__ComplexBrick__Group_12__0"
    // InternalMyDsl.g:1825:1: rule__ComplexBrick__Group_12__0 : rule__ComplexBrick__Group_12__0__Impl rule__ComplexBrick__Group_12__1 ;
    public final void rule__ComplexBrick__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1829:1: ( rule__ComplexBrick__Group_12__0__Impl rule__ComplexBrick__Group_12__1 )
            // InternalMyDsl.g:1830:2: rule__ComplexBrick__Group_12__0__Impl rule__ComplexBrick__Group_12__1
            {
            pushFollow(FOLLOW_25);
            rule__ComplexBrick__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group_12__1();

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
    // $ANTLR end "rule__ComplexBrick__Group_12__0"


    // $ANTLR start "rule__ComplexBrick__Group_12__0__Impl"
    // InternalMyDsl.g:1837:1: rule__ComplexBrick__Group_12__0__Impl : ( ',' ) ;
    public final void rule__ComplexBrick__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( ( ',' ) )
            // InternalMyDsl.g:1842:1: ( ',' )
            {
            // InternalMyDsl.g:1842:1: ( ',' )
            // InternalMyDsl.g:1843:2: ','
            {
             before(grammarAccess.getComplexBrickAccess().getCommaKeyword_12_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group_12__0__Impl"


    // $ANTLR start "rule__ComplexBrick__Group_12__1"
    // InternalMyDsl.g:1852:1: rule__ComplexBrick__Group_12__1 : rule__ComplexBrick__Group_12__1__Impl rule__ComplexBrick__Group_12__2 ;
    public final void rule__ComplexBrick__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1856:1: ( rule__ComplexBrick__Group_12__1__Impl rule__ComplexBrick__Group_12__2 )
            // InternalMyDsl.g:1857:2: rule__ComplexBrick__Group_12__1__Impl rule__ComplexBrick__Group_12__2
            {
            pushFollow(FOLLOW_20);
            rule__ComplexBrick__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group_12__2();

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
    // $ANTLR end "rule__ComplexBrick__Group_12__1"


    // $ANTLR start "rule__ComplexBrick__Group_12__1__Impl"
    // InternalMyDsl.g:1864:1: rule__ComplexBrick__Group_12__1__Impl : ( ( rule__ComplexBrick__GetSizeAssignment_12_1 ) ) ;
    public final void rule__ComplexBrick__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( ( ( rule__ComplexBrick__GetSizeAssignment_12_1 ) ) )
            // InternalMyDsl.g:1869:1: ( ( rule__ComplexBrick__GetSizeAssignment_12_1 ) )
            {
            // InternalMyDsl.g:1869:1: ( ( rule__ComplexBrick__GetSizeAssignment_12_1 ) )
            // InternalMyDsl.g:1870:2: ( rule__ComplexBrick__GetSizeAssignment_12_1 )
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeAssignment_12_1()); 
            // InternalMyDsl.g:1871:2: ( rule__ComplexBrick__GetSizeAssignment_12_1 )
            // InternalMyDsl.g:1871:3: rule__ComplexBrick__GetSizeAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__GetSizeAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexBrickAccess().getGetSizeAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group_12__1__Impl"


    // $ANTLR start "rule__ComplexBrick__Group_12__2"
    // InternalMyDsl.g:1879:1: rule__ComplexBrick__Group_12__2 : rule__ComplexBrick__Group_12__2__Impl rule__ComplexBrick__Group_12__3 ;
    public final void rule__ComplexBrick__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1883:1: ( rule__ComplexBrick__Group_12__2__Impl rule__ComplexBrick__Group_12__3 )
            // InternalMyDsl.g:1884:2: rule__ComplexBrick__Group_12__2__Impl rule__ComplexBrick__Group_12__3
            {
            pushFollow(FOLLOW_11);
            rule__ComplexBrick__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group_12__3();

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
    // $ANTLR end "rule__ComplexBrick__Group_12__2"


    // $ANTLR start "rule__ComplexBrick__Group_12__2__Impl"
    // InternalMyDsl.g:1891:1: rule__ComplexBrick__Group_12__2__Impl : ( '(' ) ;
    public final void rule__ComplexBrick__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( ( '(' ) )
            // InternalMyDsl.g:1896:1: ( '(' )
            {
            // InternalMyDsl.g:1896:1: ( '(' )
            // InternalMyDsl.g:1897:2: '('
            {
             before(grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_12_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group_12__2__Impl"


    // $ANTLR start "rule__ComplexBrick__Group_12__3"
    // InternalMyDsl.g:1906:1: rule__ComplexBrick__Group_12__3 : rule__ComplexBrick__Group_12__3__Impl rule__ComplexBrick__Group_12__4 ;
    public final void rule__ComplexBrick__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1910:1: ( rule__ComplexBrick__Group_12__3__Impl rule__ComplexBrick__Group_12__4 )
            // InternalMyDsl.g:1911:2: rule__ComplexBrick__Group_12__3__Impl rule__ComplexBrick__Group_12__4
            {
            pushFollow(FOLLOW_21);
            rule__ComplexBrick__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group_12__4();

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
    // $ANTLR end "rule__ComplexBrick__Group_12__3"


    // $ANTLR start "rule__ComplexBrick__Group_12__3__Impl"
    // InternalMyDsl.g:1918:1: rule__ComplexBrick__Group_12__3__Impl : ( ( rule__ComplexBrick__HasPositionAssignment_12_3 ) ) ;
    public final void rule__ComplexBrick__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( ( ( rule__ComplexBrick__HasPositionAssignment_12_3 ) ) )
            // InternalMyDsl.g:1923:1: ( ( rule__ComplexBrick__HasPositionAssignment_12_3 ) )
            {
            // InternalMyDsl.g:1923:1: ( ( rule__ComplexBrick__HasPositionAssignment_12_3 ) )
            // InternalMyDsl.g:1924:2: ( rule__ComplexBrick__HasPositionAssignment_12_3 )
            {
             before(grammarAccess.getComplexBrickAccess().getHasPositionAssignment_12_3()); 
            // InternalMyDsl.g:1925:2: ( rule__ComplexBrick__HasPositionAssignment_12_3 )
            // InternalMyDsl.g:1925:3: rule__ComplexBrick__HasPositionAssignment_12_3
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__HasPositionAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getComplexBrickAccess().getHasPositionAssignment_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group_12__3__Impl"


    // $ANTLR start "rule__ComplexBrick__Group_12__4"
    // InternalMyDsl.g:1933:1: rule__ComplexBrick__Group_12__4 : rule__ComplexBrick__Group_12__4__Impl ;
    public final void rule__ComplexBrick__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1937:1: ( rule__ComplexBrick__Group_12__4__Impl )
            // InternalMyDsl.g:1938:2: rule__ComplexBrick__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group_12__4__Impl();

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
    // $ANTLR end "rule__ComplexBrick__Group_12__4"


    // $ANTLR start "rule__ComplexBrick__Group_12__4__Impl"
    // InternalMyDsl.g:1944:1: rule__ComplexBrick__Group_12__4__Impl : ( ')' ) ;
    public final void rule__ComplexBrick__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1948:1: ( ( ')' ) )
            // InternalMyDsl.g:1949:1: ( ')' )
            {
            // InternalMyDsl.g:1949:1: ( ')' )
            // InternalMyDsl.g:1950:2: ')'
            {
             before(grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_12_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group_12__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:1960:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1964:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:1965:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1972:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1977:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1977:1: ( ( '-' )? )
            // InternalMyDsl.g:1978:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1979:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1979:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

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
    // InternalMyDsl.g:1987:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1991:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:1992:2: rule__EInt__Group__1__Impl
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
    // InternalMyDsl.g:1998:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2002:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2003:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2003:1: ( RULE_INT )
            // InternalMyDsl.g:2004:2: RULE_INT
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


    // $ANTLR start "rule__Position__Group__0"
    // InternalMyDsl.g:2014:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2018:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalMyDsl.g:2019:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Position__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__1();

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
    // $ANTLR end "rule__Position__Group__0"


    // $ANTLR start "rule__Position__Group__0__Impl"
    // InternalMyDsl.g:2026:1: rule__Position__Group__0__Impl : ( () ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( ( () ) )
            // InternalMyDsl.g:2031:1: ( () )
            {
            // InternalMyDsl.g:2031:1: ( () )
            // InternalMyDsl.g:2032:2: ()
            {
             before(grammarAccess.getPositionAccess().getPositionAction_0()); 
            // InternalMyDsl.g:2033:2: ()
            // InternalMyDsl.g:2033:3: 
            {
            }

             after(grammarAccess.getPositionAccess().getPositionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0__Impl"


    // $ANTLR start "rule__Position__Group__1"
    // InternalMyDsl.g:2041:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2045:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalMyDsl.g:2046:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Position__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__2();

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
    // $ANTLR end "rule__Position__Group__1"


    // $ANTLR start "rule__Position__Group__1__Impl"
    // InternalMyDsl.g:2053:1: rule__Position__Group__1__Impl : ( ( rule__Position__XAssignment_1 ) ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( ( ( rule__Position__XAssignment_1 ) ) )
            // InternalMyDsl.g:2058:1: ( ( rule__Position__XAssignment_1 ) )
            {
            // InternalMyDsl.g:2058:1: ( ( rule__Position__XAssignment_1 ) )
            // InternalMyDsl.g:2059:2: ( rule__Position__XAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getXAssignment_1()); 
            // InternalMyDsl.g:2060:2: ( rule__Position__XAssignment_1 )
            // InternalMyDsl.g:2060:3: rule__Position__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Position__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1__Impl"


    // $ANTLR start "rule__Position__Group__2"
    // InternalMyDsl.g:2068:1: rule__Position__Group__2 : rule__Position__Group__2__Impl rule__Position__Group__3 ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2072:1: ( rule__Position__Group__2__Impl rule__Position__Group__3 )
            // InternalMyDsl.g:2073:2: rule__Position__Group__2__Impl rule__Position__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Position__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__3();

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
    // $ANTLR end "rule__Position__Group__2"


    // $ANTLR start "rule__Position__Group__2__Impl"
    // InternalMyDsl.g:2080:1: rule__Position__Group__2__Impl : ( ',' ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( ( ',' ) )
            // InternalMyDsl.g:2085:1: ( ',' )
            {
            // InternalMyDsl.g:2085:1: ( ',' )
            // InternalMyDsl.g:2086:2: ','
            {
             before(grammarAccess.getPositionAccess().getCommaKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__3"
    // InternalMyDsl.g:2095:1: rule__Position__Group__3 : rule__Position__Group__3__Impl ;
    public final void rule__Position__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2099:1: ( rule__Position__Group__3__Impl )
            // InternalMyDsl.g:2100:2: rule__Position__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__3__Impl();

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
    // $ANTLR end "rule__Position__Group__3"


    // $ANTLR start "rule__Position__Group__3__Impl"
    // InternalMyDsl.g:2106:1: rule__Position__Group__3__Impl : ( ( rule__Position__YAssignment_3 ) ) ;
    public final void rule__Position__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2110:1: ( ( ( rule__Position__YAssignment_3 ) ) )
            // InternalMyDsl.g:2111:1: ( ( rule__Position__YAssignment_3 ) )
            {
            // InternalMyDsl.g:2111:1: ( ( rule__Position__YAssignment_3 ) )
            // InternalMyDsl.g:2112:2: ( rule__Position__YAssignment_3 )
            {
             before(grammarAccess.getPositionAccess().getYAssignment_3()); 
            // InternalMyDsl.g:2113:2: ( rule__Position__YAssignment_3 )
            // InternalMyDsl.g:2113:3: rule__Position__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Position__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3__Impl"


    // $ANTLR start "rule__BrickModel__NameAssignment_1"
    // InternalMyDsl.g:2122:1: rule__BrickModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BrickModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2126:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2127:2: ( ruleEString )
            {
            // InternalMyDsl.g:2127:2: ( ruleEString )
            // InternalMyDsl.g:2128:3: ruleEString
            {
             before(grammarAccess.getBrickModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBrickModelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__NameAssignment_1"


    // $ANTLR start "rule__BrickModel__LimitsAssignment_4"
    // InternalMyDsl.g:2137:1: rule__BrickModel__LimitsAssignment_4 : ( ruleLimits ) ;
    public final void rule__BrickModel__LimitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( ( ruleLimits ) )
            // InternalMyDsl.g:2142:2: ( ruleLimits )
            {
            // InternalMyDsl.g:2142:2: ( ruleLimits )
            // InternalMyDsl.g:2143:3: ruleLimits
            {
             before(grammarAccess.getBrickModelAccess().getLimitsLimitsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLimits();

            state._fsp--;

             after(grammarAccess.getBrickModelAccess().getLimitsLimitsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__LimitsAssignment_4"


    // $ANTLR start "rule__BrickModel__ContainsAssignment_5_0"
    // InternalMyDsl.g:2152:1: rule__BrickModel__ContainsAssignment_5_0 : ( ruleBrickElement ) ;
    public final void rule__BrickModel__ContainsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( ( ruleBrickElement ) )
            // InternalMyDsl.g:2157:2: ( ruleBrickElement )
            {
            // InternalMyDsl.g:2157:2: ( ruleBrickElement )
            // InternalMyDsl.g:2158:3: ruleBrickElement
            {
             before(grammarAccess.getBrickModelAccess().getContainsBrickElementParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBrickElement();

            state._fsp--;

             after(grammarAccess.getBrickModelAccess().getContainsBrickElementParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__ContainsAssignment_5_0"


    // $ANTLR start "rule__BrickModel__ContainsAssignment_5_1"
    // InternalMyDsl.g:2167:1: rule__BrickModel__ContainsAssignment_5_1 : ( ruleBrickElement ) ;
    public final void rule__BrickModel__ContainsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2171:1: ( ( ruleBrickElement ) )
            // InternalMyDsl.g:2172:2: ( ruleBrickElement )
            {
            // InternalMyDsl.g:2172:2: ( ruleBrickElement )
            // InternalMyDsl.g:2173:3: ruleBrickElement
            {
             before(grammarAccess.getBrickModelAccess().getContainsBrickElementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBrickElement();

            state._fsp--;

             after(grammarAccess.getBrickModelAccess().getContainsBrickElementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrickModel__ContainsAssignment_5_1"


    // $ANTLR start "rule__Limits__WidthAssignment_3_1"
    // InternalMyDsl.g:2182:1: rule__Limits__WidthAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Limits__WidthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2186:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2187:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2187:2: ( ruleEInt )
            // InternalMyDsl.g:2188:3: ruleEInt
            {
             before(grammarAccess.getLimitsAccess().getWidthEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLimitsAccess().getWidthEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__WidthAssignment_3_1"


    // $ANTLR start "rule__Limits__LengthAssignment_4_1"
    // InternalMyDsl.g:2197:1: rule__Limits__LengthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Limits__LengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2201:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2202:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2202:2: ( ruleEInt )
            // InternalMyDsl.g:2203:3: ruleEInt
            {
             before(grammarAccess.getLimitsAccess().getLengthEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLimitsAccess().getLengthEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limits__LengthAssignment_4_1"


    // $ANTLR start "rule__Size__BrickHeightAssignment_1_1"
    // InternalMyDsl.g:2212:1: rule__Size__BrickHeightAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__Size__BrickHeightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2217:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2217:2: ( ruleEInt )
            // InternalMyDsl.g:2218:3: ruleEInt
            {
             before(grammarAccess.getSizeAccess().getBrickHeightEIntParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSizeAccess().getBrickHeightEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__BrickHeightAssignment_1_1"


    // $ANTLR start "rule__Size__BrickWidthAssignment_2_1"
    // InternalMyDsl.g:2227:1: rule__Size__BrickWidthAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Size__BrickWidthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2232:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2232:2: ( ruleEInt )
            // InternalMyDsl.g:2233:3: ruleEInt
            {
             before(grammarAccess.getSizeAccess().getBrickWidthEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSizeAccess().getBrickWidthEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__BrickWidthAssignment_2_1"


    // $ANTLR start "rule__AbstractBrick__NameAssignment_3"
    // InternalMyDsl.g:2242:1: rule__AbstractBrick__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__AbstractBrick__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2247:2: ( ruleEString )
            {
            // InternalMyDsl.g:2247:2: ( ruleEString )
            // InternalMyDsl.g:2248:3: ruleEString
            {
             before(grammarAccess.getAbstractBrickAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAbstractBrickAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__NameAssignment_3"


    // $ANTLR start "rule__AbstractBrick__GetSizeAssignment_5_1_0_0"
    // InternalMyDsl.g:2257:1: rule__AbstractBrick__GetSizeAssignment_5_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__AbstractBrick__GetSizeAssignment_5_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2261:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2262:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2262:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2263:3: ( ruleEString )
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementCrossReference_5_1_0_0_0()); 
            // InternalMyDsl.g:2264:3: ( ruleEString )
            // InternalMyDsl.g:2265:4: ruleEString
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementEStringParserRuleCall_5_1_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementEStringParserRuleCall_5_1_0_0_0_1()); 

            }

             after(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementCrossReference_5_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__GetSizeAssignment_5_1_0_0"


    // $ANTLR start "rule__AbstractBrick__GetSizeAssignment_5_1_0_2"
    // InternalMyDsl.g:2276:1: rule__AbstractBrick__GetSizeAssignment_5_1_0_2 : ( ( ruleEString ) ) ;
    public final void rule__AbstractBrick__GetSizeAssignment_5_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2280:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2281:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2281:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2282:3: ( ruleEString )
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementCrossReference_5_1_0_2_0()); 
            // InternalMyDsl.g:2283:3: ( ruleEString )
            // InternalMyDsl.g:2284:4: ruleEString
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementEStringParserRuleCall_5_1_0_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementEStringParserRuleCall_5_1_0_2_0_1()); 

            }

             after(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementCrossReference_5_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__GetSizeAssignment_5_1_0_2"


    // $ANTLR start "rule__AbstractBrick__DimensionsAssignment_5_1_1"
    // InternalMyDsl.g:2295:1: rule__AbstractBrick__DimensionsAssignment_5_1_1 : ( ruleSize ) ;
    public final void rule__AbstractBrick__DimensionsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2299:1: ( ( ruleSize ) )
            // InternalMyDsl.g:2300:2: ( ruleSize )
            {
            // InternalMyDsl.g:2300:2: ( ruleSize )
            // InternalMyDsl.g:2301:3: ruleSize
            {
             before(grammarAccess.getAbstractBrickAccess().getDimensionsSizeParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getAbstractBrickAccess().getDimensionsSizeParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractBrick__DimensionsAssignment_5_1_1"


    // $ANTLR start "rule__ComplexBrick__NameAssignment_2"
    // InternalMyDsl.g:2310:1: rule__ComplexBrick__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ComplexBrick__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2314:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2315:2: ( ruleEString )
            {
            // InternalMyDsl.g:2315:2: ( ruleEString )
            // InternalMyDsl.g:2316:3: ruleEString
            {
             before(grammarAccess.getComplexBrickAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexBrickAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__NameAssignment_2"


    // $ANTLR start "rule__ComplexBrick__GetSizeAssignment_8"
    // InternalMyDsl.g:2325:1: rule__ComplexBrick__GetSizeAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__ComplexBrick__GetSizeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2329:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2330:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2330:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2331:3: ( ruleEString )
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_8_0()); 
            // InternalMyDsl.g:2332:3: ( ruleEString )
            // InternalMyDsl.g:2333:4: ruleEString
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__GetSizeAssignment_8"


    // $ANTLR start "rule__ComplexBrick__HasPositionAssignment_10"
    // InternalMyDsl.g:2344:1: rule__ComplexBrick__HasPositionAssignment_10 : ( rulePosition ) ;
    public final void rule__ComplexBrick__HasPositionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2348:1: ( ( rulePosition ) )
            // InternalMyDsl.g:2349:2: ( rulePosition )
            {
            // InternalMyDsl.g:2349:2: ( rulePosition )
            // InternalMyDsl.g:2350:3: rulePosition
            {
             before(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__HasPositionAssignment_10"


    // $ANTLR start "rule__ComplexBrick__GetSizeAssignment_12_1"
    // InternalMyDsl.g:2359:1: rule__ComplexBrick__GetSizeAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__ComplexBrick__GetSizeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2363:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2364:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2364:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2365:3: ( RULE_ID )
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_12_1_0()); 
            // InternalMyDsl.g:2366:3: ( RULE_ID )
            // InternalMyDsl.g:2367:4: RULE_ID
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementIDTerminalRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__GetSizeAssignment_12_1"


    // $ANTLR start "rule__ComplexBrick__HasPositionAssignment_12_3"
    // InternalMyDsl.g:2378:1: rule__ComplexBrick__HasPositionAssignment_12_3 : ( rulePosition ) ;
    public final void rule__ComplexBrick__HasPositionAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2382:1: ( ( rulePosition ) )
            // InternalMyDsl.g:2383:2: ( rulePosition )
            {
            // InternalMyDsl.g:2383:2: ( rulePosition )
            // InternalMyDsl.g:2384:3: rulePosition
            {
             before(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_12_3_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__HasPositionAssignment_12_3"


    // $ANTLR start "rule__Position__XAssignment_1"
    // InternalMyDsl.g:2393:1: rule__Position__XAssignment_1 : ( ruleEInt ) ;
    public final void rule__Position__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2397:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2398:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2398:2: ( ruleEInt )
            // InternalMyDsl.g:2399:3: ruleEInt
            {
             before(grammarAccess.getPositionAccess().getXEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getXEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__XAssignment_1"


    // $ANTLR start "rule__Position__YAssignment_3"
    // InternalMyDsl.g:2408:1: rule__Position__YAssignment_3 : ( ruleEInt ) ;
    public final void rule__Position__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2412:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2413:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2413:2: ( ruleEInt )
            // InternalMyDsl.g:2414:3: ruleEInt
            {
             before(grammarAccess.getPositionAccess().getYEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getYEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__YAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});

}