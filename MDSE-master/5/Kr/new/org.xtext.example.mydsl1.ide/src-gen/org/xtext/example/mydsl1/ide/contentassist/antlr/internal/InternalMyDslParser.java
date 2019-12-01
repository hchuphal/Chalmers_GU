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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Left'", "'Right'", "'Center'", "'BrickModel'", "'{'", "'limits'", "'}'", "'Limits'", "'width'", "'height'", "'abstract'", "'Brick'", "'Dimensions'", "'.height'", "'.width'", "'createBrick'", "'('", "','", "')'", "'-'"
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


    // $ANTLR start "ruleBrickPosition"
    // InternalMyDsl.g:278:1: ruleBrickPosition : ( ( rule__BrickPosition__Alternatives ) ) ;
    public final void ruleBrickPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:282:1: ( ( ( rule__BrickPosition__Alternatives ) ) )
            // InternalMyDsl.g:283:2: ( ( rule__BrickPosition__Alternatives ) )
            {
            // InternalMyDsl.g:283:2: ( ( rule__BrickPosition__Alternatives ) )
            // InternalMyDsl.g:284:3: ( rule__BrickPosition__Alternatives )
            {
             before(grammarAccess.getBrickPositionAccess().getAlternatives()); 
            // InternalMyDsl.g:285:3: ( rule__BrickPosition__Alternatives )
            // InternalMyDsl.g:285:4: rule__BrickPosition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BrickPosition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBrickPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrickPosition"


    // $ANTLR start "rule__BrickElement__Alternatives"
    // InternalMyDsl.g:293:1: rule__BrickElement__Alternatives : ( ( ruleAbstractBrick ) | ( ruleComplexBrick ) );
    public final void rule__BrickElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( ( ruleAbstractBrick ) | ( ruleComplexBrick ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:298:2: ( ruleAbstractBrick )
                    {
                    // InternalMyDsl.g:298:2: ( ruleAbstractBrick )
                    // InternalMyDsl.g:299:3: ruleAbstractBrick
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
                    // InternalMyDsl.g:304:2: ( ruleComplexBrick )
                    {
                    // InternalMyDsl.g:304:2: ( ruleComplexBrick )
                    // InternalMyDsl.g:305:3: ruleComplexBrick
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
    // InternalMyDsl.g:314:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:319:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:319:2: ( RULE_STRING )
                    // InternalMyDsl.g:320:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:325:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:325:2: ( RULE_ID )
                    // InternalMyDsl.g:326:3: RULE_ID
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
    // InternalMyDsl.g:335:1: rule__AbstractBrick__Alternatives_5_1 : ( ( ( rule__AbstractBrick__Group_5_1_0__0 ) ) | ( ( rule__AbstractBrick__DimensionsAssignment_5_1_1 ) ) );
    public final void rule__AbstractBrick__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:339:1: ( ( ( rule__AbstractBrick__Group_5_1_0__0 ) ) | ( ( rule__AbstractBrick__DimensionsAssignment_5_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            else if ( (LA3_0==EOF||LA3_0==17||(LA3_0>=19 && LA3_0<=20)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:340:2: ( ( rule__AbstractBrick__Group_5_1_0__0 ) )
                    {
                    // InternalMyDsl.g:340:2: ( ( rule__AbstractBrick__Group_5_1_0__0 ) )
                    // InternalMyDsl.g:341:3: ( rule__AbstractBrick__Group_5_1_0__0 )
                    {
                     before(grammarAccess.getAbstractBrickAccess().getGroup_5_1_0()); 
                    // InternalMyDsl.g:342:3: ( rule__AbstractBrick__Group_5_1_0__0 )
                    // InternalMyDsl.g:342:4: rule__AbstractBrick__Group_5_1_0__0
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
                    // InternalMyDsl.g:346:2: ( ( rule__AbstractBrick__DimensionsAssignment_5_1_1 ) )
                    {
                    // InternalMyDsl.g:346:2: ( ( rule__AbstractBrick__DimensionsAssignment_5_1_1 ) )
                    // InternalMyDsl.g:347:3: ( rule__AbstractBrick__DimensionsAssignment_5_1_1 )
                    {
                     before(grammarAccess.getAbstractBrickAccess().getDimensionsAssignment_5_1_1()); 
                    // InternalMyDsl.g:348:3: ( rule__AbstractBrick__DimensionsAssignment_5_1_1 )
                    // InternalMyDsl.g:348:4: rule__AbstractBrick__DimensionsAssignment_5_1_1
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


    // $ANTLR start "rule__BrickPosition__Alternatives"
    // InternalMyDsl.g:356:1: rule__BrickPosition__Alternatives : ( ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Center' ) ) );
    public final void rule__BrickPosition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( ( ( 'Left' ) ) | ( ( 'Right' ) ) | ( ( 'Center' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:361:2: ( ( 'Left' ) )
                    {
                    // InternalMyDsl.g:361:2: ( ( 'Left' ) )
                    // InternalMyDsl.g:362:3: ( 'Left' )
                    {
                     before(grammarAccess.getBrickPositionAccess().getLeftEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:363:3: ( 'Left' )
                    // InternalMyDsl.g:363:4: 'Left'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrickPositionAccess().getLeftEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:367:2: ( ( 'Right' ) )
                    {
                    // InternalMyDsl.g:367:2: ( ( 'Right' ) )
                    // InternalMyDsl.g:368:3: ( 'Right' )
                    {
                     before(grammarAccess.getBrickPositionAccess().getRightEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:369:3: ( 'Right' )
                    // InternalMyDsl.g:369:4: 'Right'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrickPositionAccess().getRightEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:373:2: ( ( 'Center' ) )
                    {
                    // InternalMyDsl.g:373:2: ( ( 'Center' ) )
                    // InternalMyDsl.g:374:3: ( 'Center' )
                    {
                     before(grammarAccess.getBrickPositionAccess().getCenterEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:375:3: ( 'Center' )
                    // InternalMyDsl.g:375:4: 'Center'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getBrickPositionAccess().getCenterEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__BrickPosition__Alternatives"


    // $ANTLR start "rule__BrickModel__Group__0"
    // InternalMyDsl.g:383:1: rule__BrickModel__Group__0 : rule__BrickModel__Group__0__Impl rule__BrickModel__Group__1 ;
    public final void rule__BrickModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:387:1: ( rule__BrickModel__Group__0__Impl rule__BrickModel__Group__1 )
            // InternalMyDsl.g:388:2: rule__BrickModel__Group__0__Impl rule__BrickModel__Group__1
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
    // InternalMyDsl.g:395:1: rule__BrickModel__Group__0__Impl : ( 'BrickModel' ) ;
    public final void rule__BrickModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( ( 'BrickModel' ) )
            // InternalMyDsl.g:400:1: ( 'BrickModel' )
            {
            // InternalMyDsl.g:400:1: ( 'BrickModel' )
            // InternalMyDsl.g:401:2: 'BrickModel'
            {
             before(grammarAccess.getBrickModelAccess().getBrickModelKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:410:1: rule__BrickModel__Group__1 : rule__BrickModel__Group__1__Impl rule__BrickModel__Group__2 ;
    public final void rule__BrickModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:414:1: ( rule__BrickModel__Group__1__Impl rule__BrickModel__Group__2 )
            // InternalMyDsl.g:415:2: rule__BrickModel__Group__1__Impl rule__BrickModel__Group__2
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
    // InternalMyDsl.g:422:1: rule__BrickModel__Group__1__Impl : ( ( rule__BrickModel__NameAssignment_1 ) ) ;
    public final void rule__BrickModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( ( ( rule__BrickModel__NameAssignment_1 ) ) )
            // InternalMyDsl.g:427:1: ( ( rule__BrickModel__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:427:1: ( ( rule__BrickModel__NameAssignment_1 ) )
            // InternalMyDsl.g:428:2: ( rule__BrickModel__NameAssignment_1 )
            {
             before(grammarAccess.getBrickModelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:429:2: ( rule__BrickModel__NameAssignment_1 )
            // InternalMyDsl.g:429:3: rule__BrickModel__NameAssignment_1
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
    // InternalMyDsl.g:437:1: rule__BrickModel__Group__2 : rule__BrickModel__Group__2__Impl rule__BrickModel__Group__3 ;
    public final void rule__BrickModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( rule__BrickModel__Group__2__Impl rule__BrickModel__Group__3 )
            // InternalMyDsl.g:442:2: rule__BrickModel__Group__2__Impl rule__BrickModel__Group__3
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
    // InternalMyDsl.g:449:1: rule__BrickModel__Group__2__Impl : ( '{' ) ;
    public final void rule__BrickModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( '{' ) )
            // InternalMyDsl.g:454:1: ( '{' )
            {
            // InternalMyDsl.g:454:1: ( '{' )
            // InternalMyDsl.g:455:2: '{'
            {
             before(grammarAccess.getBrickModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:464:1: rule__BrickModel__Group__3 : rule__BrickModel__Group__3__Impl rule__BrickModel__Group__4 ;
    public final void rule__BrickModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:468:1: ( rule__BrickModel__Group__3__Impl rule__BrickModel__Group__4 )
            // InternalMyDsl.g:469:2: rule__BrickModel__Group__3__Impl rule__BrickModel__Group__4
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
    // InternalMyDsl.g:476:1: rule__BrickModel__Group__3__Impl : ( 'limits' ) ;
    public final void rule__BrickModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( ( 'limits' ) )
            // InternalMyDsl.g:481:1: ( 'limits' )
            {
            // InternalMyDsl.g:481:1: ( 'limits' )
            // InternalMyDsl.g:482:2: 'limits'
            {
             before(grammarAccess.getBrickModelAccess().getLimitsKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:491:1: rule__BrickModel__Group__4 : rule__BrickModel__Group__4__Impl rule__BrickModel__Group__5 ;
    public final void rule__BrickModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( rule__BrickModel__Group__4__Impl rule__BrickModel__Group__5 )
            // InternalMyDsl.g:496:2: rule__BrickModel__Group__4__Impl rule__BrickModel__Group__5
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
    // InternalMyDsl.g:503:1: rule__BrickModel__Group__4__Impl : ( ( rule__BrickModel__LimitsAssignment_4 ) ) ;
    public final void rule__BrickModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( ( rule__BrickModel__LimitsAssignment_4 ) ) )
            // InternalMyDsl.g:508:1: ( ( rule__BrickModel__LimitsAssignment_4 ) )
            {
            // InternalMyDsl.g:508:1: ( ( rule__BrickModel__LimitsAssignment_4 ) )
            // InternalMyDsl.g:509:2: ( rule__BrickModel__LimitsAssignment_4 )
            {
             before(grammarAccess.getBrickModelAccess().getLimitsAssignment_4()); 
            // InternalMyDsl.g:510:2: ( rule__BrickModel__LimitsAssignment_4 )
            // InternalMyDsl.g:510:3: rule__BrickModel__LimitsAssignment_4
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
    // InternalMyDsl.g:518:1: rule__BrickModel__Group__5 : rule__BrickModel__Group__5__Impl rule__BrickModel__Group__6 ;
    public final void rule__BrickModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:522:1: ( rule__BrickModel__Group__5__Impl rule__BrickModel__Group__6 )
            // InternalMyDsl.g:523:2: rule__BrickModel__Group__5__Impl rule__BrickModel__Group__6
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
    // InternalMyDsl.g:530:1: rule__BrickModel__Group__5__Impl : ( ( rule__BrickModel__Group_5__0 )? ) ;
    public final void rule__BrickModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( ( ( rule__BrickModel__Group_5__0 )? ) )
            // InternalMyDsl.g:535:1: ( ( rule__BrickModel__Group_5__0 )? )
            {
            // InternalMyDsl.g:535:1: ( ( rule__BrickModel__Group_5__0 )? )
            // InternalMyDsl.g:536:2: ( rule__BrickModel__Group_5__0 )?
            {
             before(grammarAccess.getBrickModelAccess().getGroup_5()); 
            // InternalMyDsl.g:537:2: ( rule__BrickModel__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=21 && LA5_0<=22)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:537:3: rule__BrickModel__Group_5__0
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
    // InternalMyDsl.g:545:1: rule__BrickModel__Group__6 : rule__BrickModel__Group__6__Impl ;
    public final void rule__BrickModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( rule__BrickModel__Group__6__Impl )
            // InternalMyDsl.g:550:2: rule__BrickModel__Group__6__Impl
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
    // InternalMyDsl.g:556:1: rule__BrickModel__Group__6__Impl : ( '}' ) ;
    public final void rule__BrickModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:560:1: ( ( '}' ) )
            // InternalMyDsl.g:561:1: ( '}' )
            {
            // InternalMyDsl.g:561:1: ( '}' )
            // InternalMyDsl.g:562:2: '}'
            {
             before(grammarAccess.getBrickModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:572:1: rule__BrickModel__Group_5__0 : rule__BrickModel__Group_5__0__Impl rule__BrickModel__Group_5__1 ;
    public final void rule__BrickModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( rule__BrickModel__Group_5__0__Impl rule__BrickModel__Group_5__1 )
            // InternalMyDsl.g:577:2: rule__BrickModel__Group_5__0__Impl rule__BrickModel__Group_5__1
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
    // InternalMyDsl.g:584:1: rule__BrickModel__Group_5__0__Impl : ( ( rule__BrickModel__ContainsAssignment_5_0 ) ) ;
    public final void rule__BrickModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( ( ( rule__BrickModel__ContainsAssignment_5_0 ) ) )
            // InternalMyDsl.g:589:1: ( ( rule__BrickModel__ContainsAssignment_5_0 ) )
            {
            // InternalMyDsl.g:589:1: ( ( rule__BrickModel__ContainsAssignment_5_0 ) )
            // InternalMyDsl.g:590:2: ( rule__BrickModel__ContainsAssignment_5_0 )
            {
             before(grammarAccess.getBrickModelAccess().getContainsAssignment_5_0()); 
            // InternalMyDsl.g:591:2: ( rule__BrickModel__ContainsAssignment_5_0 )
            // InternalMyDsl.g:591:3: rule__BrickModel__ContainsAssignment_5_0
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
    // InternalMyDsl.g:599:1: rule__BrickModel__Group_5__1 : rule__BrickModel__Group_5__1__Impl ;
    public final void rule__BrickModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( rule__BrickModel__Group_5__1__Impl )
            // InternalMyDsl.g:604:2: rule__BrickModel__Group_5__1__Impl
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
    // InternalMyDsl.g:610:1: rule__BrickModel__Group_5__1__Impl : ( ( rule__BrickModel__ContainsAssignment_5_1 )* ) ;
    public final void rule__BrickModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( ( ( rule__BrickModel__ContainsAssignment_5_1 )* ) )
            // InternalMyDsl.g:615:1: ( ( rule__BrickModel__ContainsAssignment_5_1 )* )
            {
            // InternalMyDsl.g:615:1: ( ( rule__BrickModel__ContainsAssignment_5_1 )* )
            // InternalMyDsl.g:616:2: ( rule__BrickModel__ContainsAssignment_5_1 )*
            {
             before(grammarAccess.getBrickModelAccess().getContainsAssignment_5_1()); 
            // InternalMyDsl.g:617:2: ( rule__BrickModel__ContainsAssignment_5_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:617:3: rule__BrickModel__ContainsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__BrickModel__ContainsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:626:1: rule__Limits__Group__0 : rule__Limits__Group__0__Impl rule__Limits__Group__1 ;
    public final void rule__Limits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( rule__Limits__Group__0__Impl rule__Limits__Group__1 )
            // InternalMyDsl.g:631:2: rule__Limits__Group__0__Impl rule__Limits__Group__1
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
    // InternalMyDsl.g:638:1: rule__Limits__Group__0__Impl : ( () ) ;
    public final void rule__Limits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( ( () ) )
            // InternalMyDsl.g:643:1: ( () )
            {
            // InternalMyDsl.g:643:1: ( () )
            // InternalMyDsl.g:644:2: ()
            {
             before(grammarAccess.getLimitsAccess().getLimitsAction_0()); 
            // InternalMyDsl.g:645:2: ()
            // InternalMyDsl.g:645:3: 
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
    // InternalMyDsl.g:653:1: rule__Limits__Group__1 : rule__Limits__Group__1__Impl rule__Limits__Group__2 ;
    public final void rule__Limits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:657:1: ( rule__Limits__Group__1__Impl rule__Limits__Group__2 )
            // InternalMyDsl.g:658:2: rule__Limits__Group__1__Impl rule__Limits__Group__2
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
    // InternalMyDsl.g:665:1: rule__Limits__Group__1__Impl : ( 'Limits' ) ;
    public final void rule__Limits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( ( 'Limits' ) )
            // InternalMyDsl.g:670:1: ( 'Limits' )
            {
            // InternalMyDsl.g:670:1: ( 'Limits' )
            // InternalMyDsl.g:671:2: 'Limits'
            {
             before(grammarAccess.getLimitsAccess().getLimitsKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLimitsAccess().getLimitsKeyword_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:680:1: rule__Limits__Group__2 : rule__Limits__Group__2__Impl rule__Limits__Group__3 ;
    public final void rule__Limits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( rule__Limits__Group__2__Impl rule__Limits__Group__3 )
            // InternalMyDsl.g:685:2: rule__Limits__Group__2__Impl rule__Limits__Group__3
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
    // InternalMyDsl.g:692:1: rule__Limits__Group__2__Impl : ( '{' ) ;
    public final void rule__Limits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( '{' ) )
            // InternalMyDsl.g:697:1: ( '{' )
            {
            // InternalMyDsl.g:697:1: ( '{' )
            // InternalMyDsl.g:698:2: '{'
            {
             before(grammarAccess.getLimitsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:707:1: rule__Limits__Group__3 : rule__Limits__Group__3__Impl rule__Limits__Group__4 ;
    public final void rule__Limits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( rule__Limits__Group__3__Impl rule__Limits__Group__4 )
            // InternalMyDsl.g:712:2: rule__Limits__Group__3__Impl rule__Limits__Group__4
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
    // InternalMyDsl.g:719:1: rule__Limits__Group__3__Impl : ( ( rule__Limits__Group_3__0 )? ) ;
    public final void rule__Limits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( ( rule__Limits__Group_3__0 )? ) )
            // InternalMyDsl.g:724:1: ( ( rule__Limits__Group_3__0 )? )
            {
            // InternalMyDsl.g:724:1: ( ( rule__Limits__Group_3__0 )? )
            // InternalMyDsl.g:725:2: ( rule__Limits__Group_3__0 )?
            {
             before(grammarAccess.getLimitsAccess().getGroup_3()); 
            // InternalMyDsl.g:726:2: ( rule__Limits__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:726:3: rule__Limits__Group_3__0
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
    // InternalMyDsl.g:734:1: rule__Limits__Group__4 : rule__Limits__Group__4__Impl rule__Limits__Group__5 ;
    public final void rule__Limits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:738:1: ( rule__Limits__Group__4__Impl rule__Limits__Group__5 )
            // InternalMyDsl.g:739:2: rule__Limits__Group__4__Impl rule__Limits__Group__5
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
    // InternalMyDsl.g:746:1: rule__Limits__Group__4__Impl : ( ( rule__Limits__Group_4__0 )? ) ;
    public final void rule__Limits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( ( rule__Limits__Group_4__0 )? ) )
            // InternalMyDsl.g:751:1: ( ( rule__Limits__Group_4__0 )? )
            {
            // InternalMyDsl.g:751:1: ( ( rule__Limits__Group_4__0 )? )
            // InternalMyDsl.g:752:2: ( rule__Limits__Group_4__0 )?
            {
             before(grammarAccess.getLimitsAccess().getGroup_4()); 
            // InternalMyDsl.g:753:2: ( rule__Limits__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:753:3: rule__Limits__Group_4__0
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
    // InternalMyDsl.g:761:1: rule__Limits__Group__5 : rule__Limits__Group__5__Impl ;
    public final void rule__Limits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( rule__Limits__Group__5__Impl )
            // InternalMyDsl.g:766:2: rule__Limits__Group__5__Impl
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
    // InternalMyDsl.g:772:1: rule__Limits__Group__5__Impl : ( '}' ) ;
    public final void rule__Limits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:776:1: ( ( '}' ) )
            // InternalMyDsl.g:777:1: ( '}' )
            {
            // InternalMyDsl.g:777:1: ( '}' )
            // InternalMyDsl.g:778:2: '}'
            {
             before(grammarAccess.getLimitsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:788:1: rule__Limits__Group_3__0 : rule__Limits__Group_3__0__Impl rule__Limits__Group_3__1 ;
    public final void rule__Limits__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( rule__Limits__Group_3__0__Impl rule__Limits__Group_3__1 )
            // InternalMyDsl.g:793:2: rule__Limits__Group_3__0__Impl rule__Limits__Group_3__1
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
    // InternalMyDsl.g:800:1: rule__Limits__Group_3__0__Impl : ( 'width' ) ;
    public final void rule__Limits__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( 'width' ) )
            // InternalMyDsl.g:805:1: ( 'width' )
            {
            // InternalMyDsl.g:805:1: ( 'width' )
            // InternalMyDsl.g:806:2: 'width'
            {
             before(grammarAccess.getLimitsAccess().getWidthKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:815:1: rule__Limits__Group_3__1 : rule__Limits__Group_3__1__Impl ;
    public final void rule__Limits__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( rule__Limits__Group_3__1__Impl )
            // InternalMyDsl.g:820:2: rule__Limits__Group_3__1__Impl
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
    // InternalMyDsl.g:826:1: rule__Limits__Group_3__1__Impl : ( ( rule__Limits__WidthAssignment_3_1 ) ) ;
    public final void rule__Limits__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:1: ( ( ( rule__Limits__WidthAssignment_3_1 ) ) )
            // InternalMyDsl.g:831:1: ( ( rule__Limits__WidthAssignment_3_1 ) )
            {
            // InternalMyDsl.g:831:1: ( ( rule__Limits__WidthAssignment_3_1 ) )
            // InternalMyDsl.g:832:2: ( rule__Limits__WidthAssignment_3_1 )
            {
             before(grammarAccess.getLimitsAccess().getWidthAssignment_3_1()); 
            // InternalMyDsl.g:833:2: ( rule__Limits__WidthAssignment_3_1 )
            // InternalMyDsl.g:833:3: rule__Limits__WidthAssignment_3_1
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
    // InternalMyDsl.g:842:1: rule__Limits__Group_4__0 : rule__Limits__Group_4__0__Impl rule__Limits__Group_4__1 ;
    public final void rule__Limits__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:846:1: ( rule__Limits__Group_4__0__Impl rule__Limits__Group_4__1 )
            // InternalMyDsl.g:847:2: rule__Limits__Group_4__0__Impl rule__Limits__Group_4__1
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
    // InternalMyDsl.g:854:1: rule__Limits__Group_4__0__Impl : ( 'height' ) ;
    public final void rule__Limits__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:858:1: ( ( 'height' ) )
            // InternalMyDsl.g:859:1: ( 'height' )
            {
            // InternalMyDsl.g:859:1: ( 'height' )
            // InternalMyDsl.g:860:2: 'height'
            {
             before(grammarAccess.getLimitsAccess().getHeightKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:869:1: rule__Limits__Group_4__1 : rule__Limits__Group_4__1__Impl ;
    public final void rule__Limits__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:873:1: ( rule__Limits__Group_4__1__Impl )
            // InternalMyDsl.g:874:2: rule__Limits__Group_4__1__Impl
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
    // InternalMyDsl.g:880:1: rule__Limits__Group_4__1__Impl : ( ( rule__Limits__LengthAssignment_4_1 ) ) ;
    public final void rule__Limits__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:884:1: ( ( ( rule__Limits__LengthAssignment_4_1 ) ) )
            // InternalMyDsl.g:885:1: ( ( rule__Limits__LengthAssignment_4_1 ) )
            {
            // InternalMyDsl.g:885:1: ( ( rule__Limits__LengthAssignment_4_1 ) )
            // InternalMyDsl.g:886:2: ( rule__Limits__LengthAssignment_4_1 )
            {
             before(grammarAccess.getLimitsAccess().getLengthAssignment_4_1()); 
            // InternalMyDsl.g:887:2: ( rule__Limits__LengthAssignment_4_1 )
            // InternalMyDsl.g:887:3: rule__Limits__LengthAssignment_4_1
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
    // InternalMyDsl.g:896:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalMyDsl.g:901:2: rule__Size__Group__0__Impl rule__Size__Group__1
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
    // InternalMyDsl.g:908:1: rule__Size__Group__0__Impl : ( () ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:912:1: ( ( () ) )
            // InternalMyDsl.g:913:1: ( () )
            {
            // InternalMyDsl.g:913:1: ( () )
            // InternalMyDsl.g:914:2: ()
            {
             before(grammarAccess.getSizeAccess().getSizeAction_0()); 
            // InternalMyDsl.g:915:2: ()
            // InternalMyDsl.g:915:3: 
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
    // InternalMyDsl.g:923:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalMyDsl.g:928:2: rule__Size__Group__1__Impl rule__Size__Group__2
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
    // InternalMyDsl.g:935:1: rule__Size__Group__1__Impl : ( ( rule__Size__Group_1__0 )? ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ( rule__Size__Group_1__0 )? ) )
            // InternalMyDsl.g:940:1: ( ( rule__Size__Group_1__0 )? )
            {
            // InternalMyDsl.g:940:1: ( ( rule__Size__Group_1__0 )? )
            // InternalMyDsl.g:941:2: ( rule__Size__Group_1__0 )?
            {
             before(grammarAccess.getSizeAccess().getGroup_1()); 
            // InternalMyDsl.g:942:2: ( rule__Size__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:942:3: rule__Size__Group_1__0
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
    // InternalMyDsl.g:950:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:954:1: ( rule__Size__Group__2__Impl )
            // InternalMyDsl.g:955:2: rule__Size__Group__2__Impl
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
    // InternalMyDsl.g:961:1: rule__Size__Group__2__Impl : ( ( rule__Size__Group_2__0 )? ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:965:1: ( ( ( rule__Size__Group_2__0 )? ) )
            // InternalMyDsl.g:966:1: ( ( rule__Size__Group_2__0 )? )
            {
            // InternalMyDsl.g:966:1: ( ( rule__Size__Group_2__0 )? )
            // InternalMyDsl.g:967:2: ( rule__Size__Group_2__0 )?
            {
             before(grammarAccess.getSizeAccess().getGroup_2()); 
            // InternalMyDsl.g:968:2: ( rule__Size__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:968:3: rule__Size__Group_2__0
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
    // InternalMyDsl.g:977:1: rule__Size__Group_1__0 : rule__Size__Group_1__0__Impl rule__Size__Group_1__1 ;
    public final void rule__Size__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( rule__Size__Group_1__0__Impl rule__Size__Group_1__1 )
            // InternalMyDsl.g:982:2: rule__Size__Group_1__0__Impl rule__Size__Group_1__1
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
    // InternalMyDsl.g:989:1: rule__Size__Group_1__0__Impl : ( 'height' ) ;
    public final void rule__Size__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( ( 'height' ) )
            // InternalMyDsl.g:994:1: ( 'height' )
            {
            // InternalMyDsl.g:994:1: ( 'height' )
            // InternalMyDsl.g:995:2: 'height'
            {
             before(grammarAccess.getSizeAccess().getHeightKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1004:1: rule__Size__Group_1__1 : rule__Size__Group_1__1__Impl ;
    public final void rule__Size__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( rule__Size__Group_1__1__Impl )
            // InternalMyDsl.g:1009:2: rule__Size__Group_1__1__Impl
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
    // InternalMyDsl.g:1015:1: rule__Size__Group_1__1__Impl : ( ( rule__Size__BrickHeightAssignment_1_1 ) ) ;
    public final void rule__Size__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( ( ( rule__Size__BrickHeightAssignment_1_1 ) ) )
            // InternalMyDsl.g:1020:1: ( ( rule__Size__BrickHeightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1020:1: ( ( rule__Size__BrickHeightAssignment_1_1 ) )
            // InternalMyDsl.g:1021:2: ( rule__Size__BrickHeightAssignment_1_1 )
            {
             before(grammarAccess.getSizeAccess().getBrickHeightAssignment_1_1()); 
            // InternalMyDsl.g:1022:2: ( rule__Size__BrickHeightAssignment_1_1 )
            // InternalMyDsl.g:1022:3: rule__Size__BrickHeightAssignment_1_1
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
    // InternalMyDsl.g:1031:1: rule__Size__Group_2__0 : rule__Size__Group_2__0__Impl rule__Size__Group_2__1 ;
    public final void rule__Size__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( rule__Size__Group_2__0__Impl rule__Size__Group_2__1 )
            // InternalMyDsl.g:1036:2: rule__Size__Group_2__0__Impl rule__Size__Group_2__1
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
    // InternalMyDsl.g:1043:1: rule__Size__Group_2__0__Impl : ( 'width' ) ;
    public final void rule__Size__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1047:1: ( ( 'width' ) )
            // InternalMyDsl.g:1048:1: ( 'width' )
            {
            // InternalMyDsl.g:1048:1: ( 'width' )
            // InternalMyDsl.g:1049:2: 'width'
            {
             before(grammarAccess.getSizeAccess().getWidthKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1058:1: rule__Size__Group_2__1 : rule__Size__Group_2__1__Impl ;
    public final void rule__Size__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( rule__Size__Group_2__1__Impl )
            // InternalMyDsl.g:1063:2: rule__Size__Group_2__1__Impl
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
    // InternalMyDsl.g:1069:1: rule__Size__Group_2__1__Impl : ( ( rule__Size__BrickWidthAssignment_2_1 ) ) ;
    public final void rule__Size__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1073:1: ( ( ( rule__Size__BrickWidthAssignment_2_1 ) ) )
            // InternalMyDsl.g:1074:1: ( ( rule__Size__BrickWidthAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1074:1: ( ( rule__Size__BrickWidthAssignment_2_1 ) )
            // InternalMyDsl.g:1075:2: ( rule__Size__BrickWidthAssignment_2_1 )
            {
             before(grammarAccess.getSizeAccess().getBrickWidthAssignment_2_1()); 
            // InternalMyDsl.g:1076:2: ( rule__Size__BrickWidthAssignment_2_1 )
            // InternalMyDsl.g:1076:3: rule__Size__BrickWidthAssignment_2_1
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
    // InternalMyDsl.g:1085:1: rule__AbstractBrick__Group__0 : rule__AbstractBrick__Group__0__Impl rule__AbstractBrick__Group__1 ;
    public final void rule__AbstractBrick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( rule__AbstractBrick__Group__0__Impl rule__AbstractBrick__Group__1 )
            // InternalMyDsl.g:1090:2: rule__AbstractBrick__Group__0__Impl rule__AbstractBrick__Group__1
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
    // InternalMyDsl.g:1097:1: rule__AbstractBrick__Group__0__Impl : ( () ) ;
    public final void rule__AbstractBrick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1101:1: ( ( () ) )
            // InternalMyDsl.g:1102:1: ( () )
            {
            // InternalMyDsl.g:1102:1: ( () )
            // InternalMyDsl.g:1103:2: ()
            {
             before(grammarAccess.getAbstractBrickAccess().getAbstractBrickAction_0()); 
            // InternalMyDsl.g:1104:2: ()
            // InternalMyDsl.g:1104:3: 
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
    // InternalMyDsl.g:1112:1: rule__AbstractBrick__Group__1 : rule__AbstractBrick__Group__1__Impl rule__AbstractBrick__Group__2 ;
    public final void rule__AbstractBrick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:1: ( rule__AbstractBrick__Group__1__Impl rule__AbstractBrick__Group__2 )
            // InternalMyDsl.g:1117:2: rule__AbstractBrick__Group__1__Impl rule__AbstractBrick__Group__2
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
    // InternalMyDsl.g:1124:1: rule__AbstractBrick__Group__1__Impl : ( 'abstract' ) ;
    public final void rule__AbstractBrick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1128:1: ( ( 'abstract' ) )
            // InternalMyDsl.g:1129:1: ( 'abstract' )
            {
            // InternalMyDsl.g:1129:1: ( 'abstract' )
            // InternalMyDsl.g:1130:2: 'abstract'
            {
             before(grammarAccess.getAbstractBrickAccess().getAbstractKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1139:1: rule__AbstractBrick__Group__2 : rule__AbstractBrick__Group__2__Impl rule__AbstractBrick__Group__3 ;
    public final void rule__AbstractBrick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( rule__AbstractBrick__Group__2__Impl rule__AbstractBrick__Group__3 )
            // InternalMyDsl.g:1144:2: rule__AbstractBrick__Group__2__Impl rule__AbstractBrick__Group__3
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
    // InternalMyDsl.g:1151:1: rule__AbstractBrick__Group__2__Impl : ( 'Brick' ) ;
    public final void rule__AbstractBrick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1155:1: ( ( 'Brick' ) )
            // InternalMyDsl.g:1156:1: ( 'Brick' )
            {
            // InternalMyDsl.g:1156:1: ( 'Brick' )
            // InternalMyDsl.g:1157:2: 'Brick'
            {
             before(grammarAccess.getAbstractBrickAccess().getBrickKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1166:1: rule__AbstractBrick__Group__3 : rule__AbstractBrick__Group__3__Impl rule__AbstractBrick__Group__4 ;
    public final void rule__AbstractBrick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( rule__AbstractBrick__Group__3__Impl rule__AbstractBrick__Group__4 )
            // InternalMyDsl.g:1171:2: rule__AbstractBrick__Group__3__Impl rule__AbstractBrick__Group__4
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
    // InternalMyDsl.g:1178:1: rule__AbstractBrick__Group__3__Impl : ( ( rule__AbstractBrick__NameAssignment_3 ) ) ;
    public final void rule__AbstractBrick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( ( ( rule__AbstractBrick__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1183:1: ( ( rule__AbstractBrick__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1183:1: ( ( rule__AbstractBrick__NameAssignment_3 ) )
            // InternalMyDsl.g:1184:2: ( rule__AbstractBrick__NameAssignment_3 )
            {
             before(grammarAccess.getAbstractBrickAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1185:2: ( rule__AbstractBrick__NameAssignment_3 )
            // InternalMyDsl.g:1185:3: rule__AbstractBrick__NameAssignment_3
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
    // InternalMyDsl.g:1193:1: rule__AbstractBrick__Group__4 : rule__AbstractBrick__Group__4__Impl rule__AbstractBrick__Group__5 ;
    public final void rule__AbstractBrick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( rule__AbstractBrick__Group__4__Impl rule__AbstractBrick__Group__5 )
            // InternalMyDsl.g:1198:2: rule__AbstractBrick__Group__4__Impl rule__AbstractBrick__Group__5
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
    // InternalMyDsl.g:1205:1: rule__AbstractBrick__Group__4__Impl : ( '{' ) ;
    public final void rule__AbstractBrick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1209:1: ( ( '{' ) )
            // InternalMyDsl.g:1210:1: ( '{' )
            {
            // InternalMyDsl.g:1210:1: ( '{' )
            // InternalMyDsl.g:1211:2: '{'
            {
             before(grammarAccess.getAbstractBrickAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1220:1: rule__AbstractBrick__Group__5 : rule__AbstractBrick__Group__5__Impl rule__AbstractBrick__Group__6 ;
    public final void rule__AbstractBrick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( rule__AbstractBrick__Group__5__Impl rule__AbstractBrick__Group__6 )
            // InternalMyDsl.g:1225:2: rule__AbstractBrick__Group__5__Impl rule__AbstractBrick__Group__6
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
    // InternalMyDsl.g:1232:1: rule__AbstractBrick__Group__5__Impl : ( ( rule__AbstractBrick__Group_5__0 )? ) ;
    public final void rule__AbstractBrick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1236:1: ( ( ( rule__AbstractBrick__Group_5__0 )? ) )
            // InternalMyDsl.g:1237:1: ( ( rule__AbstractBrick__Group_5__0 )? )
            {
            // InternalMyDsl.g:1237:1: ( ( rule__AbstractBrick__Group_5__0 )? )
            // InternalMyDsl.g:1238:2: ( rule__AbstractBrick__Group_5__0 )?
            {
             before(grammarAccess.getAbstractBrickAccess().getGroup_5()); 
            // InternalMyDsl.g:1239:2: ( rule__AbstractBrick__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1239:3: rule__AbstractBrick__Group_5__0
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
    // InternalMyDsl.g:1247:1: rule__AbstractBrick__Group__6 : rule__AbstractBrick__Group__6__Impl ;
    public final void rule__AbstractBrick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( rule__AbstractBrick__Group__6__Impl )
            // InternalMyDsl.g:1252:2: rule__AbstractBrick__Group__6__Impl
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
    // InternalMyDsl.g:1258:1: rule__AbstractBrick__Group__6__Impl : ( '}' ) ;
    public final void rule__AbstractBrick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( ( '}' ) )
            // InternalMyDsl.g:1263:1: ( '}' )
            {
            // InternalMyDsl.g:1263:1: ( '}' )
            // InternalMyDsl.g:1264:2: '}'
            {
             before(grammarAccess.getAbstractBrickAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:1274:1: rule__AbstractBrick__Group_5__0 : rule__AbstractBrick__Group_5__0__Impl rule__AbstractBrick__Group_5__1 ;
    public final void rule__AbstractBrick__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1278:1: ( rule__AbstractBrick__Group_5__0__Impl rule__AbstractBrick__Group_5__1 )
            // InternalMyDsl.g:1279:2: rule__AbstractBrick__Group_5__0__Impl rule__AbstractBrick__Group_5__1
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
    // InternalMyDsl.g:1286:1: rule__AbstractBrick__Group_5__0__Impl : ( 'Dimensions' ) ;
    public final void rule__AbstractBrick__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1290:1: ( ( 'Dimensions' ) )
            // InternalMyDsl.g:1291:1: ( 'Dimensions' )
            {
            // InternalMyDsl.g:1291:1: ( 'Dimensions' )
            // InternalMyDsl.g:1292:2: 'Dimensions'
            {
             before(grammarAccess.getAbstractBrickAccess().getDimensionsKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1301:1: rule__AbstractBrick__Group_5__1 : rule__AbstractBrick__Group_5__1__Impl ;
    public final void rule__AbstractBrick__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( rule__AbstractBrick__Group_5__1__Impl )
            // InternalMyDsl.g:1306:2: rule__AbstractBrick__Group_5__1__Impl
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
    // InternalMyDsl.g:1312:1: rule__AbstractBrick__Group_5__1__Impl : ( ( rule__AbstractBrick__Alternatives_5_1 ) ) ;
    public final void rule__AbstractBrick__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:1: ( ( ( rule__AbstractBrick__Alternatives_5_1 ) ) )
            // InternalMyDsl.g:1317:1: ( ( rule__AbstractBrick__Alternatives_5_1 ) )
            {
            // InternalMyDsl.g:1317:1: ( ( rule__AbstractBrick__Alternatives_5_1 ) )
            // InternalMyDsl.g:1318:2: ( rule__AbstractBrick__Alternatives_5_1 )
            {
             before(grammarAccess.getAbstractBrickAccess().getAlternatives_5_1()); 
            // InternalMyDsl.g:1319:2: ( rule__AbstractBrick__Alternatives_5_1 )
            // InternalMyDsl.g:1319:3: rule__AbstractBrick__Alternatives_5_1
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
    // InternalMyDsl.g:1328:1: rule__AbstractBrick__Group_5_1_0__0 : rule__AbstractBrick__Group_5_1_0__0__Impl rule__AbstractBrick__Group_5_1_0__1 ;
    public final void rule__AbstractBrick__Group_5_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( rule__AbstractBrick__Group_5_1_0__0__Impl rule__AbstractBrick__Group_5_1_0__1 )
            // InternalMyDsl.g:1333:2: rule__AbstractBrick__Group_5_1_0__0__Impl rule__AbstractBrick__Group_5_1_0__1
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
    // InternalMyDsl.g:1340:1: rule__AbstractBrick__Group_5_1_0__0__Impl : ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 ) ) ;
    public final void rule__AbstractBrick__Group_5_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1344:1: ( ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 ) ) )
            // InternalMyDsl.g:1345:1: ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 ) )
            {
            // InternalMyDsl.g:1345:1: ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 ) )
            // InternalMyDsl.g:1346:2: ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 )
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeAssignment_5_1_0_0()); 
            // InternalMyDsl.g:1347:2: ( rule__AbstractBrick__GetSizeAssignment_5_1_0_0 )
            // InternalMyDsl.g:1347:3: rule__AbstractBrick__GetSizeAssignment_5_1_0_0
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
    // InternalMyDsl.g:1355:1: rule__AbstractBrick__Group_5_1_0__1 : rule__AbstractBrick__Group_5_1_0__1__Impl rule__AbstractBrick__Group_5_1_0__2 ;
    public final void rule__AbstractBrick__Group_5_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( rule__AbstractBrick__Group_5_1_0__1__Impl rule__AbstractBrick__Group_5_1_0__2 )
            // InternalMyDsl.g:1360:2: rule__AbstractBrick__Group_5_1_0__1__Impl rule__AbstractBrick__Group_5_1_0__2
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
    // InternalMyDsl.g:1367:1: rule__AbstractBrick__Group_5_1_0__1__Impl : ( '.height' ) ;
    public final void rule__AbstractBrick__Group_5_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1371:1: ( ( '.height' ) )
            // InternalMyDsl.g:1372:1: ( '.height' )
            {
            // InternalMyDsl.g:1372:1: ( '.height' )
            // InternalMyDsl.g:1373:2: '.height'
            {
             before(grammarAccess.getAbstractBrickAccess().getHeightKeyword_5_1_0_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1382:1: rule__AbstractBrick__Group_5_1_0__2 : rule__AbstractBrick__Group_5_1_0__2__Impl rule__AbstractBrick__Group_5_1_0__3 ;
    public final void rule__AbstractBrick__Group_5_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( rule__AbstractBrick__Group_5_1_0__2__Impl rule__AbstractBrick__Group_5_1_0__3 )
            // InternalMyDsl.g:1387:2: rule__AbstractBrick__Group_5_1_0__2__Impl rule__AbstractBrick__Group_5_1_0__3
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
    // InternalMyDsl.g:1394:1: rule__AbstractBrick__Group_5_1_0__2__Impl : ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 ) ) ;
    public final void rule__AbstractBrick__Group_5_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1398:1: ( ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 ) ) )
            // InternalMyDsl.g:1399:1: ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 ) )
            {
            // InternalMyDsl.g:1399:1: ( ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 ) )
            // InternalMyDsl.g:1400:2: ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 )
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeAssignment_5_1_0_2()); 
            // InternalMyDsl.g:1401:2: ( rule__AbstractBrick__GetSizeAssignment_5_1_0_2 )
            // InternalMyDsl.g:1401:3: rule__AbstractBrick__GetSizeAssignment_5_1_0_2
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
    // InternalMyDsl.g:1409:1: rule__AbstractBrick__Group_5_1_0__3 : rule__AbstractBrick__Group_5_1_0__3__Impl ;
    public final void rule__AbstractBrick__Group_5_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( rule__AbstractBrick__Group_5_1_0__3__Impl )
            // InternalMyDsl.g:1414:2: rule__AbstractBrick__Group_5_1_0__3__Impl
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
    // InternalMyDsl.g:1420:1: rule__AbstractBrick__Group_5_1_0__3__Impl : ( '.width' ) ;
    public final void rule__AbstractBrick__Group_5_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( ( '.width' ) )
            // InternalMyDsl.g:1425:1: ( '.width' )
            {
            // InternalMyDsl.g:1425:1: ( '.width' )
            // InternalMyDsl.g:1426:2: '.width'
            {
             before(grammarAccess.getAbstractBrickAccess().getWidthKeyword_5_1_0_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyDsl.g:1436:1: rule__ComplexBrick__Group__0 : rule__ComplexBrick__Group__0__Impl rule__ComplexBrick__Group__1 ;
    public final void rule__ComplexBrick__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( rule__ComplexBrick__Group__0__Impl rule__ComplexBrick__Group__1 )
            // InternalMyDsl.g:1441:2: rule__ComplexBrick__Group__0__Impl rule__ComplexBrick__Group__1
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
    // InternalMyDsl.g:1448:1: rule__ComplexBrick__Group__0__Impl : ( () ) ;
    public final void rule__ComplexBrick__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1452:1: ( ( () ) )
            // InternalMyDsl.g:1453:1: ( () )
            {
            // InternalMyDsl.g:1453:1: ( () )
            // InternalMyDsl.g:1454:2: ()
            {
             before(grammarAccess.getComplexBrickAccess().getComplexBrickAction_0()); 
            // InternalMyDsl.g:1455:2: ()
            // InternalMyDsl.g:1455:3: 
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
    // InternalMyDsl.g:1463:1: rule__ComplexBrick__Group__1 : rule__ComplexBrick__Group__1__Impl rule__ComplexBrick__Group__2 ;
    public final void rule__ComplexBrick__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( rule__ComplexBrick__Group__1__Impl rule__ComplexBrick__Group__2 )
            // InternalMyDsl.g:1468:2: rule__ComplexBrick__Group__1__Impl rule__ComplexBrick__Group__2
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
    // InternalMyDsl.g:1475:1: rule__ComplexBrick__Group__1__Impl : ( 'Brick' ) ;
    public final void rule__ComplexBrick__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( ( 'Brick' ) )
            // InternalMyDsl.g:1480:1: ( 'Brick' )
            {
            // InternalMyDsl.g:1480:1: ( 'Brick' )
            // InternalMyDsl.g:1481:2: 'Brick'
            {
             before(grammarAccess.getComplexBrickAccess().getBrickKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1490:1: rule__ComplexBrick__Group__2 : rule__ComplexBrick__Group__2__Impl rule__ComplexBrick__Group__3 ;
    public final void rule__ComplexBrick__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( rule__ComplexBrick__Group__2__Impl rule__ComplexBrick__Group__3 )
            // InternalMyDsl.g:1495:2: rule__ComplexBrick__Group__2__Impl rule__ComplexBrick__Group__3
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
    // InternalMyDsl.g:1502:1: rule__ComplexBrick__Group__2__Impl : ( ( rule__ComplexBrick__NameAssignment_2 ) ) ;
    public final void rule__ComplexBrick__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1506:1: ( ( ( rule__ComplexBrick__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1507:1: ( ( rule__ComplexBrick__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1507:1: ( ( rule__ComplexBrick__NameAssignment_2 ) )
            // InternalMyDsl.g:1508:2: ( rule__ComplexBrick__NameAssignment_2 )
            {
             before(grammarAccess.getComplexBrickAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1509:2: ( rule__ComplexBrick__NameAssignment_2 )
            // InternalMyDsl.g:1509:3: rule__ComplexBrick__NameAssignment_2
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
    // InternalMyDsl.g:1517:1: rule__ComplexBrick__Group__3 : rule__ComplexBrick__Group__3__Impl rule__ComplexBrick__Group__4 ;
    public final void rule__ComplexBrick__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( rule__ComplexBrick__Group__3__Impl rule__ComplexBrick__Group__4 )
            // InternalMyDsl.g:1522:2: rule__ComplexBrick__Group__3__Impl rule__ComplexBrick__Group__4
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
    // InternalMyDsl.g:1529:1: rule__ComplexBrick__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexBrick__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( '{' ) )
            // InternalMyDsl.g:1534:1: ( '{' )
            {
            // InternalMyDsl.g:1534:1: ( '{' )
            // InternalMyDsl.g:1535:2: '{'
            {
             before(grammarAccess.getComplexBrickAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1544:1: rule__ComplexBrick__Group__4 : rule__ComplexBrick__Group__4__Impl rule__ComplexBrick__Group__5 ;
    public final void rule__ComplexBrick__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( rule__ComplexBrick__Group__4__Impl rule__ComplexBrick__Group__5 )
            // InternalMyDsl.g:1549:2: rule__ComplexBrick__Group__4__Impl rule__ComplexBrick__Group__5
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
    // InternalMyDsl.g:1556:1: rule__ComplexBrick__Group__4__Impl : ( 'createBrick' ) ;
    public final void rule__ComplexBrick__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1560:1: ( ( 'createBrick' ) )
            // InternalMyDsl.g:1561:1: ( 'createBrick' )
            {
            // InternalMyDsl.g:1561:1: ( 'createBrick' )
            // InternalMyDsl.g:1562:2: 'createBrick'
            {
             before(grammarAccess.getComplexBrickAccess().getCreateBrickKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1571:1: rule__ComplexBrick__Group__5 : rule__ComplexBrick__Group__5__Impl rule__ComplexBrick__Group__6 ;
    public final void rule__ComplexBrick__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( rule__ComplexBrick__Group__5__Impl rule__ComplexBrick__Group__6 )
            // InternalMyDsl.g:1576:2: rule__ComplexBrick__Group__5__Impl rule__ComplexBrick__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1583:1: rule__ComplexBrick__Group__5__Impl : ( '{' ) ;
    public final void rule__ComplexBrick__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1587:1: ( ( '{' ) )
            // InternalMyDsl.g:1588:1: ( '{' )
            {
            // InternalMyDsl.g:1588:1: ( '{' )
            // InternalMyDsl.g:1589:2: '{'
            {
             before(grammarAccess.getComplexBrickAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:1598:1: rule__ComplexBrick__Group__6 : rule__ComplexBrick__Group__6__Impl rule__ComplexBrick__Group__7 ;
    public final void rule__ComplexBrick__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( rule__ComplexBrick__Group__6__Impl rule__ComplexBrick__Group__7 )
            // InternalMyDsl.g:1603:2: rule__ComplexBrick__Group__6__Impl rule__ComplexBrick__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1610:1: rule__ComplexBrick__Group__6__Impl : ( 'Dimensions' ) ;
    public final void rule__ComplexBrick__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( ( 'Dimensions' ) )
            // InternalMyDsl.g:1615:1: ( 'Dimensions' )
            {
            // InternalMyDsl.g:1615:1: ( 'Dimensions' )
            // InternalMyDsl.g:1616:2: 'Dimensions'
            {
             before(grammarAccess.getComplexBrickAccess().getDimensionsKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:1625:1: rule__ComplexBrick__Group__7 : rule__ComplexBrick__Group__7__Impl rule__ComplexBrick__Group__8 ;
    public final void rule__ComplexBrick__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1629:1: ( rule__ComplexBrick__Group__7__Impl rule__ComplexBrick__Group__8 )
            // InternalMyDsl.g:1630:2: rule__ComplexBrick__Group__7__Impl rule__ComplexBrick__Group__8
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
    // InternalMyDsl.g:1637:1: rule__ComplexBrick__Group__7__Impl : ( '(' ) ;
    public final void rule__ComplexBrick__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1641:1: ( ( '(' ) )
            // InternalMyDsl.g:1642:1: ( '(' )
            {
            // InternalMyDsl.g:1642:1: ( '(' )
            // InternalMyDsl.g:1643:2: '('
            {
             before(grammarAccess.getComplexBrickAccess().getLeftParenthesisKeyword_7()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1652:1: rule__ComplexBrick__Group__8 : rule__ComplexBrick__Group__8__Impl rule__ComplexBrick__Group__9 ;
    public final void rule__ComplexBrick__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( rule__ComplexBrick__Group__8__Impl rule__ComplexBrick__Group__9 )
            // InternalMyDsl.g:1657:2: rule__ComplexBrick__Group__8__Impl rule__ComplexBrick__Group__9
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1664:1: rule__ComplexBrick__Group__8__Impl : ( ( rule__ComplexBrick__GetSizeAssignment_8 ) ) ;
    public final void rule__ComplexBrick__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1668:1: ( ( ( rule__ComplexBrick__GetSizeAssignment_8 ) ) )
            // InternalMyDsl.g:1669:1: ( ( rule__ComplexBrick__GetSizeAssignment_8 ) )
            {
            // InternalMyDsl.g:1669:1: ( ( rule__ComplexBrick__GetSizeAssignment_8 ) )
            // InternalMyDsl.g:1670:2: ( rule__ComplexBrick__GetSizeAssignment_8 )
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeAssignment_8()); 
            // InternalMyDsl.g:1671:2: ( rule__ComplexBrick__GetSizeAssignment_8 )
            // InternalMyDsl.g:1671:3: rule__ComplexBrick__GetSizeAssignment_8
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
    // InternalMyDsl.g:1679:1: rule__ComplexBrick__Group__9 : rule__ComplexBrick__Group__9__Impl rule__ComplexBrick__Group__10 ;
    public final void rule__ComplexBrick__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( rule__ComplexBrick__Group__9__Impl rule__ComplexBrick__Group__10 )
            // InternalMyDsl.g:1684:2: rule__ComplexBrick__Group__9__Impl rule__ComplexBrick__Group__10
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1691:1: rule__ComplexBrick__Group__9__Impl : ( ',' ) ;
    public final void rule__ComplexBrick__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( ( ',' ) )
            // InternalMyDsl.g:1696:1: ( ',' )
            {
            // InternalMyDsl.g:1696:1: ( ',' )
            // InternalMyDsl.g:1697:2: ','
            {
             before(grammarAccess.getComplexBrickAccess().getCommaKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getCommaKeyword_9()); 

            }


            }

        }
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
    // InternalMyDsl.g:1706:1: rule__ComplexBrick__Group__10 : rule__ComplexBrick__Group__10__Impl rule__ComplexBrick__Group__11 ;
    public final void rule__ComplexBrick__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( rule__ComplexBrick__Group__10__Impl rule__ComplexBrick__Group__11 )
            // InternalMyDsl.g:1711:2: rule__ComplexBrick__Group__10__Impl rule__ComplexBrick__Group__11
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1718:1: rule__ComplexBrick__Group__10__Impl : ( ( rule__ComplexBrick__GetSizeAssignment_10 ) ) ;
    public final void rule__ComplexBrick__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1722:1: ( ( ( rule__ComplexBrick__GetSizeAssignment_10 ) ) )
            // InternalMyDsl.g:1723:1: ( ( rule__ComplexBrick__GetSizeAssignment_10 ) )
            {
            // InternalMyDsl.g:1723:1: ( ( rule__ComplexBrick__GetSizeAssignment_10 ) )
            // InternalMyDsl.g:1724:2: ( rule__ComplexBrick__GetSizeAssignment_10 )
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeAssignment_10()); 
            // InternalMyDsl.g:1725:2: ( rule__ComplexBrick__GetSizeAssignment_10 )
            // InternalMyDsl.g:1725:3: rule__ComplexBrick__GetSizeAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__GetSizeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getComplexBrickAccess().getGetSizeAssignment_10()); 

            }


            }

        }
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
    // InternalMyDsl.g:1733:1: rule__ComplexBrick__Group__11 : rule__ComplexBrick__Group__11__Impl rule__ComplexBrick__Group__12 ;
    public final void rule__ComplexBrick__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( rule__ComplexBrick__Group__11__Impl rule__ComplexBrick__Group__12 )
            // InternalMyDsl.g:1738:2: rule__ComplexBrick__Group__11__Impl rule__ComplexBrick__Group__12
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:1745:1: rule__ComplexBrick__Group__11__Impl : ( ',' ) ;
    public final void rule__ComplexBrick__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1749:1: ( ( ',' ) )
            // InternalMyDsl.g:1750:1: ( ',' )
            {
            // InternalMyDsl.g:1750:1: ( ',' )
            // InternalMyDsl.g:1751:2: ','
            {
             before(grammarAccess.getComplexBrickAccess().getCommaKeyword_11()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getCommaKeyword_11()); 

            }


            }

        }
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
    // InternalMyDsl.g:1760:1: rule__ComplexBrick__Group__12 : rule__ComplexBrick__Group__12__Impl rule__ComplexBrick__Group__13 ;
    public final void rule__ComplexBrick__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( rule__ComplexBrick__Group__12__Impl rule__ComplexBrick__Group__13 )
            // InternalMyDsl.g:1765:2: rule__ComplexBrick__Group__12__Impl rule__ComplexBrick__Group__13
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:1772:1: rule__ComplexBrick__Group__12__Impl : ( ( rule__ComplexBrick__HasPositionAssignment_12 ) ) ;
    public final void rule__ComplexBrick__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1776:1: ( ( ( rule__ComplexBrick__HasPositionAssignment_12 ) ) )
            // InternalMyDsl.g:1777:1: ( ( rule__ComplexBrick__HasPositionAssignment_12 ) )
            {
            // InternalMyDsl.g:1777:1: ( ( rule__ComplexBrick__HasPositionAssignment_12 ) )
            // InternalMyDsl.g:1778:2: ( rule__ComplexBrick__HasPositionAssignment_12 )
            {
             before(grammarAccess.getComplexBrickAccess().getHasPositionAssignment_12()); 
            // InternalMyDsl.g:1779:2: ( rule__ComplexBrick__HasPositionAssignment_12 )
            // InternalMyDsl.g:1779:3: rule__ComplexBrick__HasPositionAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__HasPositionAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getComplexBrickAccess().getHasPositionAssignment_12()); 

            }


            }

        }
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
    // InternalMyDsl.g:1787:1: rule__ComplexBrick__Group__13 : rule__ComplexBrick__Group__13__Impl rule__ComplexBrick__Group__14 ;
    public final void rule__ComplexBrick__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( rule__ComplexBrick__Group__13__Impl rule__ComplexBrick__Group__14 )
            // InternalMyDsl.g:1792:2: rule__ComplexBrick__Group__13__Impl rule__ComplexBrick__Group__14
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:1799:1: rule__ComplexBrick__Group__13__Impl : ( ( rule__ComplexBrick__Group_13__0 )* ) ;
    public final void rule__ComplexBrick__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1803:1: ( ( ( rule__ComplexBrick__Group_13__0 )* ) )
            // InternalMyDsl.g:1804:1: ( ( rule__ComplexBrick__Group_13__0 )* )
            {
            // InternalMyDsl.g:1804:1: ( ( rule__ComplexBrick__Group_13__0 )* )
            // InternalMyDsl.g:1805:2: ( rule__ComplexBrick__Group_13__0 )*
            {
             before(grammarAccess.getComplexBrickAccess().getGroup_13()); 
            // InternalMyDsl.g:1806:2: ( rule__ComplexBrick__Group_13__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1806:3: rule__ComplexBrick__Group_13__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ComplexBrick__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComplexBrickAccess().getGroup_13()); 

            }


            }

        }
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
    // InternalMyDsl.g:1814:1: rule__ComplexBrick__Group__14 : rule__ComplexBrick__Group__14__Impl rule__ComplexBrick__Group__15 ;
    public final void rule__ComplexBrick__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( rule__ComplexBrick__Group__14__Impl rule__ComplexBrick__Group__15 )
            // InternalMyDsl.g:1819:2: rule__ComplexBrick__Group__14__Impl rule__ComplexBrick__Group__15
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:1826:1: rule__ComplexBrick__Group__14__Impl : ( ')' ) ;
    public final void rule__ComplexBrick__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1830:1: ( ( ')' ) )
            // InternalMyDsl.g:1831:1: ( ')' )
            {
            // InternalMyDsl.g:1831:1: ( ')' )
            // InternalMyDsl.g:1832:2: ')'
            {
             before(grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_14()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getRightParenthesisKeyword_14()); 

            }


            }

        }
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
    // InternalMyDsl.g:1841:1: rule__ComplexBrick__Group__15 : rule__ComplexBrick__Group__15__Impl rule__ComplexBrick__Group__16 ;
    public final void rule__ComplexBrick__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( rule__ComplexBrick__Group__15__Impl rule__ComplexBrick__Group__16 )
            // InternalMyDsl.g:1846:2: rule__ComplexBrick__Group__15__Impl rule__ComplexBrick__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__ComplexBrick__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__16();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:1853:1: rule__ComplexBrick__Group__15__Impl : ( '}' ) ;
    public final void rule__ComplexBrick__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1857:1: ( ( '}' ) )
            // InternalMyDsl.g:1858:1: ( '}' )
            {
            // InternalMyDsl.g:1858:1: ( '}' )
            // InternalMyDsl.g:1859:2: '}'
            {
             before(grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_15()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__ComplexBrick__Group__16"
    // InternalMyDsl.g:1868:1: rule__ComplexBrick__Group__16 : rule__ComplexBrick__Group__16__Impl ;
    public final void rule__ComplexBrick__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( rule__ComplexBrick__Group__16__Impl )
            // InternalMyDsl.g:1873:2: rule__ComplexBrick__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__16"


    // $ANTLR start "rule__ComplexBrick__Group__16__Impl"
    // InternalMyDsl.g:1879:1: rule__ComplexBrick__Group__16__Impl : ( '}' ) ;
    public final void rule__ComplexBrick__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1883:1: ( ( '}' ) )
            // InternalMyDsl.g:1884:1: ( '}' )
            {
            // InternalMyDsl.g:1884:1: ( '}' )
            // InternalMyDsl.g:1885:2: '}'
            {
             before(grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_16()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group__16__Impl"


    // $ANTLR start "rule__ComplexBrick__Group_13__0"
    // InternalMyDsl.g:1895:1: rule__ComplexBrick__Group_13__0 : rule__ComplexBrick__Group_13__0__Impl rule__ComplexBrick__Group_13__1 ;
    public final void rule__ComplexBrick__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( rule__ComplexBrick__Group_13__0__Impl rule__ComplexBrick__Group_13__1 )
            // InternalMyDsl.g:1900:2: rule__ComplexBrick__Group_13__0__Impl rule__ComplexBrick__Group_13__1
            {
            pushFollow(FOLLOW_24);
            rule__ComplexBrick__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group_13__0"


    // $ANTLR start "rule__ComplexBrick__Group_13__0__Impl"
    // InternalMyDsl.g:1907:1: rule__ComplexBrick__Group_13__0__Impl : ( ',' ) ;
    public final void rule__ComplexBrick__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1911:1: ( ( ',' ) )
            // InternalMyDsl.g:1912:1: ( ',' )
            {
            // InternalMyDsl.g:1912:1: ( ',' )
            // InternalMyDsl.g:1913:2: ','
            {
             before(grammarAccess.getComplexBrickAccess().getCommaKeyword_13_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group_13__0__Impl"


    // $ANTLR start "rule__ComplexBrick__Group_13__1"
    // InternalMyDsl.g:1922:1: rule__ComplexBrick__Group_13__1 : rule__ComplexBrick__Group_13__1__Impl ;
    public final void rule__ComplexBrick__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( rule__ComplexBrick__Group_13__1__Impl )
            // InternalMyDsl.g:1927:2: rule__ComplexBrick__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group_13__1"


    // $ANTLR start "rule__ComplexBrick__Group_13__1__Impl"
    // InternalMyDsl.g:1933:1: rule__ComplexBrick__Group_13__1__Impl : ( ( rule__ComplexBrick__HasPositionAssignment_13_1 ) ) ;
    public final void rule__ComplexBrick__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1937:1: ( ( ( rule__ComplexBrick__HasPositionAssignment_13_1 ) ) )
            // InternalMyDsl.g:1938:1: ( ( rule__ComplexBrick__HasPositionAssignment_13_1 ) )
            {
            // InternalMyDsl.g:1938:1: ( ( rule__ComplexBrick__HasPositionAssignment_13_1 ) )
            // InternalMyDsl.g:1939:2: ( rule__ComplexBrick__HasPositionAssignment_13_1 )
            {
             before(grammarAccess.getComplexBrickAccess().getHasPositionAssignment_13_1()); 
            // InternalMyDsl.g:1940:2: ( rule__ComplexBrick__HasPositionAssignment_13_1 )
            // InternalMyDsl.g:1940:3: rule__ComplexBrick__HasPositionAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexBrick__HasPositionAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexBrickAccess().getHasPositionAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__Group_13__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:1949:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:1954:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalMyDsl.g:1961:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1965:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1966:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1966:1: ( ( '-' )? )
            // InternalMyDsl.g:1967:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1968:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1968:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalMyDsl.g:1976:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1980:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:1981:2: rule__EInt__Group__1__Impl
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
    // InternalMyDsl.g:1987:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1991:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1992:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1992:1: ( RULE_INT )
            // InternalMyDsl.g:1993:2: RULE_INT
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
    // InternalMyDsl.g:2003:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalMyDsl.g:2008:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2015:1: rule__Position__Group__0__Impl : ( () ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2019:1: ( ( () ) )
            // InternalMyDsl.g:2020:1: ( () )
            {
            // InternalMyDsl.g:2020:1: ( () )
            // InternalMyDsl.g:2021:2: ()
            {
             before(grammarAccess.getPositionAccess().getPositionAction_0()); 
            // InternalMyDsl.g:2022:2: ()
            // InternalMyDsl.g:2022:3: 
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
    // InternalMyDsl.g:2030:1: rule__Position__Group__1 : rule__Position__Group__1__Impl ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( rule__Position__Group__1__Impl )
            // InternalMyDsl.g:2035:2: rule__Position__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyDsl.g:2041:1: rule__Position__Group__1__Impl : ( ( rule__Position__CoordinatesAssignment_1 )? ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2045:1: ( ( ( rule__Position__CoordinatesAssignment_1 )? ) )
            // InternalMyDsl.g:2046:1: ( ( rule__Position__CoordinatesAssignment_1 )? )
            {
            // InternalMyDsl.g:2046:1: ( ( rule__Position__CoordinatesAssignment_1 )? )
            // InternalMyDsl.g:2047:2: ( rule__Position__CoordinatesAssignment_1 )?
            {
             before(grammarAccess.getPositionAccess().getCoordinatesAssignment_1()); 
            // InternalMyDsl.g:2048:2: ( rule__Position__CoordinatesAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=13)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2048:3: rule__Position__CoordinatesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Position__CoordinatesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionAccess().getCoordinatesAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BrickModel__NameAssignment_1"
    // InternalMyDsl.g:2057:1: rule__BrickModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__BrickModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2061:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2062:2: ( ruleEString )
            {
            // InternalMyDsl.g:2062:2: ( ruleEString )
            // InternalMyDsl.g:2063:3: ruleEString
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
    // InternalMyDsl.g:2072:1: rule__BrickModel__LimitsAssignment_4 : ( ruleLimits ) ;
    public final void rule__BrickModel__LimitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2076:1: ( ( ruleLimits ) )
            // InternalMyDsl.g:2077:2: ( ruleLimits )
            {
            // InternalMyDsl.g:2077:2: ( ruleLimits )
            // InternalMyDsl.g:2078:3: ruleLimits
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
    // InternalMyDsl.g:2087:1: rule__BrickModel__ContainsAssignment_5_0 : ( ruleBrickElement ) ;
    public final void rule__BrickModel__ContainsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2091:1: ( ( ruleBrickElement ) )
            // InternalMyDsl.g:2092:2: ( ruleBrickElement )
            {
            // InternalMyDsl.g:2092:2: ( ruleBrickElement )
            // InternalMyDsl.g:2093:3: ruleBrickElement
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
    // InternalMyDsl.g:2102:1: rule__BrickModel__ContainsAssignment_5_1 : ( ruleBrickElement ) ;
    public final void rule__BrickModel__ContainsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2106:1: ( ( ruleBrickElement ) )
            // InternalMyDsl.g:2107:2: ( ruleBrickElement )
            {
            // InternalMyDsl.g:2107:2: ( ruleBrickElement )
            // InternalMyDsl.g:2108:3: ruleBrickElement
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
    // InternalMyDsl.g:2117:1: rule__Limits__WidthAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Limits__WidthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2121:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2122:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2122:2: ( ruleEInt )
            // InternalMyDsl.g:2123:3: ruleEInt
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
    // InternalMyDsl.g:2132:1: rule__Limits__LengthAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Limits__LengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2137:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2137:2: ( ruleEInt )
            // InternalMyDsl.g:2138:3: ruleEInt
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
    // InternalMyDsl.g:2147:1: rule__Size__BrickHeightAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__Size__BrickHeightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2152:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2152:2: ( ruleEInt )
            // InternalMyDsl.g:2153:3: ruleEInt
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
    // InternalMyDsl.g:2162:1: rule__Size__BrickWidthAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__Size__BrickWidthAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2166:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2167:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2167:2: ( ruleEInt )
            // InternalMyDsl.g:2168:3: ruleEInt
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
    // InternalMyDsl.g:2177:1: rule__AbstractBrick__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__AbstractBrick__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2181:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2182:2: ( ruleEString )
            {
            // InternalMyDsl.g:2182:2: ( ruleEString )
            // InternalMyDsl.g:2183:3: ruleEString
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
    // InternalMyDsl.g:2192:1: rule__AbstractBrick__GetSizeAssignment_5_1_0_0 : ( ( ruleEString ) ) ;
    public final void rule__AbstractBrick__GetSizeAssignment_5_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2196:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2197:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2197:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2198:3: ( ruleEString )
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementCrossReference_5_1_0_0_0()); 
            // InternalMyDsl.g:2199:3: ( ruleEString )
            // InternalMyDsl.g:2200:4: ruleEString
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
    // InternalMyDsl.g:2211:1: rule__AbstractBrick__GetSizeAssignment_5_1_0_2 : ( ( ruleEString ) ) ;
    public final void rule__AbstractBrick__GetSizeAssignment_5_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2216:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2216:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2217:3: ( ruleEString )
            {
             before(grammarAccess.getAbstractBrickAccess().getGetSizeBrickElementCrossReference_5_1_0_2_0()); 
            // InternalMyDsl.g:2218:3: ( ruleEString )
            // InternalMyDsl.g:2219:4: ruleEString
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
    // InternalMyDsl.g:2230:1: rule__AbstractBrick__DimensionsAssignment_5_1_1 : ( ruleSize ) ;
    public final void rule__AbstractBrick__DimensionsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2234:1: ( ( ruleSize ) )
            // InternalMyDsl.g:2235:2: ( ruleSize )
            {
            // InternalMyDsl.g:2235:2: ( ruleSize )
            // InternalMyDsl.g:2236:3: ruleSize
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
    // InternalMyDsl.g:2245:1: rule__ComplexBrick__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ComplexBrick__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2250:2: ( ruleEString )
            {
            // InternalMyDsl.g:2250:2: ( ruleEString )
            // InternalMyDsl.g:2251:3: ruleEString
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
    // InternalMyDsl.g:2260:1: rule__ComplexBrick__GetSizeAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__ComplexBrick__GetSizeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2265:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2265:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2266:3: ( ruleEString )
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_8_0()); 
            // InternalMyDsl.g:2267:3: ( ruleEString )
            // InternalMyDsl.g:2268:4: ruleEString
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


    // $ANTLR start "rule__ComplexBrick__GetSizeAssignment_10"
    // InternalMyDsl.g:2279:1: rule__ComplexBrick__GetSizeAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__ComplexBrick__GetSizeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2284:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2284:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2285:3: ( RULE_ID )
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_10_0()); 
            // InternalMyDsl.g:2286:3: ( RULE_ID )
            // InternalMyDsl.g:2287:4: RULE_ID
            {
             before(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getComplexBrickAccess().getGetSizeBrickElementCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__GetSizeAssignment_10"


    // $ANTLR start "rule__ComplexBrick__HasPositionAssignment_12"
    // InternalMyDsl.g:2298:1: rule__ComplexBrick__HasPositionAssignment_12 : ( rulePosition ) ;
    public final void rule__ComplexBrick__HasPositionAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2302:1: ( ( rulePosition ) )
            // InternalMyDsl.g:2303:2: ( rulePosition )
            {
            // InternalMyDsl.g:2303:2: ( rulePosition )
            // InternalMyDsl.g:2304:3: rulePosition
            {
             before(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__HasPositionAssignment_12"


    // $ANTLR start "rule__ComplexBrick__HasPositionAssignment_13_1"
    // InternalMyDsl.g:2313:1: rule__ComplexBrick__HasPositionAssignment_13_1 : ( rulePosition ) ;
    public final void rule__ComplexBrick__HasPositionAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( ( rulePosition ) )
            // InternalMyDsl.g:2318:2: ( rulePosition )
            {
            // InternalMyDsl.g:2318:2: ( rulePosition )
            // InternalMyDsl.g:2319:3: rulePosition
            {
             before(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getComplexBrickAccess().getHasPositionPositionParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexBrick__HasPositionAssignment_13_1"


    // $ANTLR start "rule__Position__CoordinatesAssignment_1"
    // InternalMyDsl.g:2328:1: rule__Position__CoordinatesAssignment_1 : ( ruleBrickPosition ) ;
    public final void rule__Position__CoordinatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( ( ruleBrickPosition ) )
            // InternalMyDsl.g:2333:2: ( ruleBrickPosition )
            {
            // InternalMyDsl.g:2333:2: ( ruleBrickPosition )
            // InternalMyDsl.g:2334:3: ruleBrickPosition
            {
             before(grammarAccess.getPositionAccess().getCoordinatesBrickPositionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBrickPosition();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getCoordinatesBrickPositionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__CoordinatesAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000620000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000020000L});

}