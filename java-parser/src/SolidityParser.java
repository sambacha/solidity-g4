// Generated from SolidityParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ReservedKeywords=1, Pragma=2, Abstract=3, Anonymous=4, Address=5, As=6, 
		Assembly=7, Bool=8, Break=9, Bytes=10, Calldata=11, Catch=12, Constant=13, 
		Constructor=14, Continue=15, Contract=16, Delete=17, Do=18, Else=19, Emit=20, 
		Enum=21, Error=22, Revert=23, Event=24, External=25, Fallback=26, False=27, 
		Fixed=28, From=29, FixedBytes=30, For=31, Function=32, Hex=33, If=34, 
		Immutable=35, Import=36, Indexed=37, Interface=38, Internal=39, Is=40, 
		Library=41, Mapping=42, Memory=43, Modifier=44, New=45, NumberUnit=46, 
		Override=47, Payable=48, Private=49, Public=50, Pure=51, Receive=52, Return=53, 
		Returns=54, SignedIntegerType=55, Storage=56, String=57, Struct=58, True=59, 
		Try=60, Type=61, Ufixed=62, Unchecked=63, UnsignedIntegerType=64, Using=65, 
		View=66, Virtual=67, While=68, LParen=69, RParen=70, LBrack=71, RBrack=72, 
		LBrace=73, RBrace=74, Colon=75, Semicolon=76, Period=77, Conditional=78, 
		DoubleArrow=79, RightArrow=80, Assign=81, AssignBitOr=82, AssignBitXor=83, 
		AssignBitAnd=84, AssignShl=85, AssignSar=86, AssignShr=87, AssignAdd=88, 
		AssignSub=89, AssignMul=90, AssignDiv=91, AssignMod=92, Comma=93, Or=94, 
		And=95, BitOr=96, BitXor=97, BitAnd=98, Shl=99, Sar=100, Shr=101, Add=102, 
		Sub=103, Mul=104, Div=105, Mod=106, Exp=107, Equal=108, NotEqual=109, 
		LessThan=110, GreaterThan=111, LessThanOrEqual=112, GreaterThanOrEqual=113, 
		Not=114, BitNot=115, Inc=116, Dec=117, DoubleQuote=118, SingleQuote=119, 
		NonEmptyStringLiteral=120, EmptyStringLiteral=121, UnicodeStringLiteral=122, 
		HexString=123, HexNumber=124, DecimalNumber=125, Identifier=126, WS=127, 
		COMMENT=128, LINE_COMMENT=129, AssemblyDialect=130, AssemblyLBrace=131, 
		AssemblyBlockWS=132, AssemblyBlockCOMMENT=133, AssemblyBlockLINE_COMMENT=134, 
		YulBreak=135, YulCase=136, YulContinue=137, YulDefault=138, YulFalse=139, 
		YulFor=140, YulFunction=141, YulIf=142, YulLeave=143, YulLet=144, YulSwitch=145, 
		YulTrue=146, YulHex=147, YulEVMBuiltin=148, YulLBrace=149, YulRBrace=150, 
		YulLParen=151, YulRParen=152, YulAssign=153, YulPeriod=154, YulComma=155, 
		YulArrow=156, YulIdentifier=157, YulHexNumber=158, YulDecimalNumber=159, 
		YulStringLiteral=160, YulHexStringLiteral=161, YulWS=162, YulCOMMENT=163, 
		YulLINE_COMMENT=164, PragmaToken=165, PragmaSemicolon=166, PragmaWS=167, 
		PragmaCOMMENT=168, PragmaLINE_COMMENT=169;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_importDirective = 2, 
		RULE_importAliases = 3, RULE_path = 4, RULE_symbolAliases = 5, RULE_contractDefinition = 6, 
		RULE_interfaceDefinition = 7, RULE_libraryDefinition = 8, RULE_inheritanceSpecifierList = 9, 
		RULE_inheritanceSpecifier = 10, RULE_contractBodyElement = 11, RULE_namedArgument = 12, 
		RULE_callArgumentList = 13, RULE_identifierPath = 14, RULE_modifierInvocation = 15, 
		RULE_visibility = 16, RULE_parameterList = 17, RULE_parameterDeclaration = 18, 
		RULE_constructorDefinition = 19, RULE_stateMutability = 20, RULE_overrideSpecifier = 21, 
		RULE_functionDefinition = 22, RULE_modifierDefinition = 23, RULE_fallbackFunctionDefinition = 24, 
		RULE_receiveFunctionDefinition = 25, RULE_structDefinition = 26, RULE_structMember = 27, 
		RULE_enumDefinition = 28, RULE_userDefinedValueTypeDefinition = 29, RULE_stateVariableDeclaration = 30, 
		RULE_constantVariableDeclaration = 31, RULE_eventParameter = 32, RULE_eventDefinition = 33, 
		RULE_errorParameter = 34, RULE_errorDefinition = 35, RULE_usingDirective = 36, 
		RULE_typeName = 37, RULE_elementaryTypeName = 38, RULE_functionTypeName = 39, 
		RULE_variableDeclaration = 40, RULE_dataLocation = 41, RULE_expression = 42, 
		RULE_assignOp = 43, RULE_tupleExpression = 44, RULE_inlineArrayExpression = 45, 
		RULE_identifier = 46, RULE_literal = 47, RULE_booleanLiteral = 48, RULE_stringLiteral = 49, 
		RULE_hexStringLiteral = 50, RULE_unicodeStringLiteral = 51, RULE_numberLiteral = 52, 
		RULE_block = 53, RULE_uncheckedBlock = 54, RULE_statement = 55, RULE_simpleStatement = 56, 
		RULE_ifStatement = 57, RULE_forStatement = 58, RULE_whileStatement = 59, 
		RULE_doWhileStatement = 60, RULE_continueStatement = 61, RULE_breakStatement = 62, 
		RULE_tryStatement = 63, RULE_catchClause = 64, RULE_returnStatement = 65, 
		RULE_emitStatement = 66, RULE_revertStatement = 67, RULE_assemblyStatement = 68, 
		RULE_variableDeclarationList = 69, RULE_variableDeclarationTuple = 70, 
		RULE_variableDeclarationStatement = 71, RULE_expressionStatement = 72, 
		RULE_mappingType = 73, RULE_mappingKeyType = 74, RULE_yulStatement = 75, 
		RULE_yulBlock = 76, RULE_yulVariableDeclaration = 77, RULE_yulAssignment = 78, 
		RULE_yulIfStatement = 79, RULE_yulForStatement = 80, RULE_yulSwitchCase = 81, 
		RULE_yulSwitchStatement = 82, RULE_yulFunctionDefinition = 83, RULE_yulPath = 84, 
		RULE_yulFunctionCall = 85, RULE_yulBoolean = 86, RULE_yulLiteral = 87, 
		RULE_yulExpression = 88;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "importDirective", "importAliases", 
			"path", "symbolAliases", "contractDefinition", "interfaceDefinition", 
			"libraryDefinition", "inheritanceSpecifierList", "inheritanceSpecifier", 
			"contractBodyElement", "namedArgument", "callArgumentList", "identifierPath", 
			"modifierInvocation", "visibility", "parameterList", "parameterDeclaration", 
			"constructorDefinition", "stateMutability", "overrideSpecifier", "functionDefinition", 
			"modifierDefinition", "fallbackFunctionDefinition", "receiveFunctionDefinition", 
			"structDefinition", "structMember", "enumDefinition", "userDefinedValueTypeDefinition", 
			"stateVariableDeclaration", "constantVariableDeclaration", "eventParameter", 
			"eventDefinition", "errorParameter", "errorDefinition", "usingDirective", 
			"typeName", "elementaryTypeName", "functionTypeName", "variableDeclaration", 
			"dataLocation", "expression", "assignOp", "tupleExpression", "inlineArrayExpression", 
			"identifier", "literal", "booleanLiteral", "stringLiteral", "hexStringLiteral", 
			"unicodeStringLiteral", "numberLiteral", "block", "uncheckedBlock", "statement", 
			"simpleStatement", "ifStatement", "forStatement", "whileStatement", "doWhileStatement", 
			"continueStatement", "breakStatement", "tryStatement", "catchClause", 
			"returnStatement", "emitStatement", "revertStatement", "assemblyStatement", 
			"variableDeclarationList", "variableDeclarationTuple", "variableDeclarationStatement", 
			"expressionStatement", "mappingType", "mappingKeyType", "yulStatement", 
			"yulBlock", "yulVariableDeclaration", "yulAssignment", "yulIfStatement", 
			"yulForStatement", "yulSwitchCase", "yulSwitchStatement", "yulFunctionDefinition", 
			"yulPath", "yulFunctionCall", "yulBoolean", "yulLiteral", "yulExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'pragma'", "'abstract'", "'anonymous'", "'address'", "'as'", 
			"'assembly'", "'bool'", null, "'bytes'", "'calldata'", "'catch'", "'constant'", 
			"'constructor'", null, "'contract'", "'delete'", "'do'", "'else'", "'emit'", 
			"'enum'", "'error'", "'revert'", "'event'", "'external'", "'fallback'", 
			null, null, "'from'", null, null, null, null, null, "'immutable'", "'import'", 
			"'indexed'", "'interface'", "'internal'", "'is'", "'library'", "'mapping'", 
			"'memory'", "'modifier'", "'new'", null, "'override'", "'payable'", "'private'", 
			"'public'", "'pure'", "'receive'", "'return'", "'returns'", null, "'storage'", 
			"'string'", "'struct'", null, "'try'", "'type'", null, "'unchecked'", 
			null, "'using'", "'view'", "'virtual'", "'while'", null, null, "'['", 
			"']'", null, null, "':'", null, null, "'?'", "'=>'", null, "'='", "'|='", 
			"'^='", "'&='", "'<<='", "'>>='", "'>>>='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", null, "'||'", "'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'>>>'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'=='", "'!='", "'<'", "'>'", 
			"'<='", "'>='", "'!'", "'~'", "'++'", "'--'", "'\"'", "'''", null, null, 
			null, null, null, null, null, null, null, null, "'\"evmasm\"'", null, 
			null, null, null, null, "'case'", null, "'default'", null, null, null, 
			null, "'leave'", "'let'", "'switch'", null, null, null, null, null, null, 
			null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ReservedKeywords", "Pragma", "Abstract", "Anonymous", "Address", 
			"As", "Assembly", "Bool", "Break", "Bytes", "Calldata", "Catch", "Constant", 
			"Constructor", "Continue", "Contract", "Delete", "Do", "Else", "Emit", 
			"Enum", "Error", "Revert", "Event", "External", "Fallback", "False", 
			"Fixed", "From", "FixedBytes", "For", "Function", "Hex", "If", "Immutable", 
			"Import", "Indexed", "Interface", "Internal", "Is", "Library", "Mapping", 
			"Memory", "Modifier", "New", "NumberUnit", "Override", "Payable", "Private", 
			"Public", "Pure", "Receive", "Return", "Returns", "SignedIntegerType", 
			"Storage", "String", "Struct", "True", "Try", "Type", "Ufixed", "Unchecked", 
			"UnsignedIntegerType", "Using", "View", "Virtual", "While", "LParen", 
			"RParen", "LBrack", "RBrack", "LBrace", "RBrace", "Colon", "Semicolon", 
			"Period", "Conditional", "DoubleArrow", "RightArrow", "Assign", "AssignBitOr", 
			"AssignBitXor", "AssignBitAnd", "AssignShl", "AssignSar", "AssignShr", 
			"AssignAdd", "AssignSub", "AssignMul", "AssignDiv", "AssignMod", "Comma", 
			"Or", "And", "BitOr", "BitXor", "BitAnd", "Shl", "Sar", "Shr", "Add", 
			"Sub", "Mul", "Div", "Mod", "Exp", "Equal", "NotEqual", "LessThan", "GreaterThan", 
			"LessThanOrEqual", "GreaterThanOrEqual", "Not", "BitNot", "Inc", "Dec", 
			"DoubleQuote", "SingleQuote", "NonEmptyStringLiteral", "EmptyStringLiteral", 
			"UnicodeStringLiteral", "HexString", "HexNumber", "DecimalNumber", "Identifier", 
			"WS", "COMMENT", "LINE_COMMENT", "AssemblyDialect", "AssemblyLBrace", 
			"AssemblyBlockWS", "AssemblyBlockCOMMENT", "AssemblyBlockLINE_COMMENT", 
			"YulBreak", "YulCase", "YulContinue", "YulDefault", "YulFalse", "YulFor", 
			"YulFunction", "YulIf", "YulLeave", "YulLet", "YulSwitch", "YulTrue", 
			"YulHex", "YulEVMBuiltin", "YulLBrace", "YulRBrace", "YulLParen", "YulRParen", 
			"YulAssign", "YulPeriod", "YulComma", "YulArrow", "YulIdentifier", "YulHexNumber", 
			"YulDecimalNumber", "YulStringLiteral", "YulHexStringLiteral", "YulWS", 
			"YulCOMMENT", "YulLINE_COMMENT", "PragmaToken", "PragmaSemicolon", "PragmaWS", 
			"PragmaCOMMENT", "PragmaLINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SolidityParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public List<InterfaceDefinitionContext> interfaceDefinition() {
			return getRuleContexts(InterfaceDefinitionContext.class);
		}
		public InterfaceDefinitionContext interfaceDefinition(int i) {
			return getRuleContext(InterfaceDefinitionContext.class,i);
		}
		public List<LibraryDefinitionContext> libraryDefinition() {
			return getRuleContexts(LibraryDefinitionContext.class);
		}
		public LibraryDefinitionContext libraryDefinition(int i) {
			return getRuleContext(LibraryDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<ConstantVariableDeclarationContext> constantVariableDeclaration() {
			return getRuleContexts(ConstantVariableDeclarationContext.class);
		}
		public ConstantVariableDeclarationContext constantVariableDeclaration(int i) {
			return getRuleContext(ConstantVariableDeclarationContext.class,i);
		}
		public List<StructDefinitionContext> structDefinition() {
			return getRuleContexts(StructDefinitionContext.class);
		}
		public StructDefinitionContext structDefinition(int i) {
			return getRuleContext(StructDefinitionContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<UserDefinedValueTypeDefinitionContext> userDefinedValueTypeDefinition() {
			return getRuleContexts(UserDefinedValueTypeDefinitionContext.class);
		}
		public UserDefinedValueTypeDefinitionContext userDefinedValueTypeDefinition(int i) {
			return getRuleContext(UserDefinedValueTypeDefinitionContext.class,i);
		}
		public List<ErrorDefinitionContext> errorDefinition() {
			return getRuleContexts(ErrorDefinitionContext.class);
		}
		public ErrorDefinitionContext errorDefinition(int i) {
			return getRuleContext(ErrorDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitSourceUnit(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(178);
						pragmaDirective();
						}
						break;
					case 2:
						{
						setState(179);
						importDirective();
						}
						break;
					case 3:
						{
						setState(180);
						contractDefinition();
						}
						break;
					case 4:
						{
						setState(181);
						interfaceDefinition();
						}
						break;
					case 5:
						{
						setState(182);
						libraryDefinition();
						}
						break;
					case 6:
						{
						setState(183);
						functionDefinition();
						}
						break;
					case 7:
						{
						setState(184);
						constantVariableDeclaration();
						}
						break;
					case 8:
						{
						setState(185);
						structDefinition();
						}
						break;
					case 9:
						{
						setState(186);
						enumDefinition();
						}
						break;
					case 10:
						{
						setState(187);
						userDefinedValueTypeDefinition();
						}
						break;
					case 11:
						{
						setState(188);
						errorDefinition();
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(194);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public TerminalNode Pragma() { return getToken(SolidityParser.Pragma, 0); }
		public TerminalNode PragmaSemicolon() { return getToken(SolidityParser.PragmaSemicolon, 0); }
		public List<TerminalNode> PragmaToken() { return getTokens(SolidityParser.PragmaToken); }
		public TerminalNode PragmaToken(int i) {
			return getToken(SolidityParser.PragmaToken, i);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitPragmaDirective(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(Pragma);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				match(PragmaToken);
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PragmaToken );
			setState(202);
			match(PragmaSemicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDirectiveContext extends ParserRuleContext {
		public IdentifierContext unitAlias;
		public TerminalNode Import() { return getToken(SolidityParser.Import, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SymbolAliasesContext symbolAliases() {
			return getRuleContext(SymbolAliasesContext.class,0);
		}
		public TerminalNode From() { return getToken(SolidityParser.From, 0); }
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TerminalNode As() { return getToken(SolidityParser.As, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitImportDirective(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Import);
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonEmptyStringLiteral:
				{
				{
				setState(205);
				path();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(206);
					match(As);
					setState(207);
					((ImportDirectiveContext)_localctx).unitAlias = identifier();
					}
				}

				}
				}
				break;
			case LBrace:
				{
				{
				setState(210);
				symbolAliases();
				setState(211);
				match(From);
				setState(212);
				path();
				}
				}
				break;
			case Mul:
				{
				{
				setState(214);
				match(Mul);
				setState(215);
				match(As);
				setState(216);
				((ImportDirectiveContext)_localctx).unitAlias = identifier();
				setState(217);
				match(From);
				setState(218);
				path();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(222);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportAliasesContext extends ParserRuleContext {
		public IdentifierContext symbol;
		public IdentifierContext alias;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode As() { return getToken(SolidityParser.As, 0); }
		public ImportAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterImportAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitImportAliases(this);
		}
	}

	public final ImportAliasesContext importAliases() throws RecognitionException {
		ImportAliasesContext _localctx = new ImportAliasesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((ImportAliasesContext)_localctx).symbol = identifier();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(225);
				match(As);
				setState(226);
				((ImportAliasesContext)_localctx).alias = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public TerminalNode NonEmptyStringLiteral() { return getToken(SolidityParser.NonEmptyStringLiteral, 0); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(NonEmptyStringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolAliasesContext extends ParserRuleContext {
		public ImportAliasesContext importAliases;
		public List<ImportAliasesContext> aliases = new ArrayList<ImportAliasesContext>();
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<ImportAliasesContext> importAliases() {
			return getRuleContexts(ImportAliasesContext.class);
		}
		public ImportAliasesContext importAliases(int i) {
			return getRuleContext(ImportAliasesContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public SymbolAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterSymbolAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitSymbolAliases(this);
		}
	}

	public final SymbolAliasesContext symbolAliases() throws RecognitionException {
		SymbolAliasesContext _localctx = new SymbolAliasesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_symbolAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(LBrace);
			setState(232);
			((SymbolAliasesContext)_localctx).importAliases = importAliases();
			((SymbolAliasesContext)_localctx).aliases.add(((SymbolAliasesContext)_localctx).importAliases);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(233);
				match(Comma);
				setState(234);
				((SymbolAliasesContext)_localctx).importAliases = importAliases();
				((SymbolAliasesContext)_localctx).aliases.add(((SymbolAliasesContext)_localctx).importAliases);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Contract() { return getToken(SolidityParser.Contract, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Abstract() { return getToken(SolidityParser.Abstract, 0); }
		public InheritanceSpecifierListContext inheritanceSpecifierList() {
			return getRuleContext(InheritanceSpecifierListContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitContractDefinition(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contractDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Abstract) {
				{
				setState(242);
				match(Abstract);
				}
			}

			setState(245);
			match(Contract);
			setState(246);
			((ContractDefinitionContext)_localctx).name = identifier();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Is) {
				{
				setState(247);
				inheritanceSpecifierList();
				}
			}

			setState(250);
			match(LBrace);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					contractBodyElement();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(257);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Interface() { return getToken(SolidityParser.Interface, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InheritanceSpecifierListContext inheritanceSpecifierList() {
			return getRuleContext(InheritanceSpecifierListContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInterfaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInterfaceDefinition(this);
		}
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(Interface);
			setState(260);
			((InterfaceDefinitionContext)_localctx).name = identifier();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Is) {
				{
				setState(261);
				inheritanceSpecifierList();
				}
			}

			setState(264);
			match(LBrace);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					contractBodyElement();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(271);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Library() { return getToken(SolidityParser.Library, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ContractBodyElementContext> contractBodyElement() {
			return getRuleContexts(ContractBodyElementContext.class);
		}
		public ContractBodyElementContext contractBodyElement(int i) {
			return getRuleContext(ContractBodyElementContext.class,i);
		}
		public LibraryDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterLibraryDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitLibraryDefinition(this);
		}
	}

	public final LibraryDefinitionContext libraryDefinition() throws RecognitionException {
		LibraryDefinitionContext _localctx = new LibraryDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_libraryDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(Library);
			setState(274);
			((LibraryDefinitionContext)_localctx).name = identifier();
			setState(275);
			match(LBrace);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					contractBodyElement();
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(282);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierListContext extends ParserRuleContext {
		public InheritanceSpecifierContext inheritanceSpecifier;
		public List<InheritanceSpecifierContext> inheritanceSpecifiers = new ArrayList<InheritanceSpecifierContext>();
		public TerminalNode Is() { return getToken(SolidityParser.Is, 0); }
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public InheritanceSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInheritanceSpecifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInheritanceSpecifierList(this);
		}
	}

	public final InheritanceSpecifierListContext inheritanceSpecifierList() throws RecognitionException {
		InheritanceSpecifierListContext _localctx = new InheritanceSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inheritanceSpecifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(Is);
			setState(285);
			((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier = inheritanceSpecifier();
			((InheritanceSpecifierListContext)_localctx).inheritanceSpecifiers.add(((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(286);
					match(Comma);
					setState(287);
					((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier = inheritanceSpecifier();
					((InheritanceSpecifierListContext)_localctx).inheritanceSpecifiers.add(((InheritanceSpecifierListContext)_localctx).inheritanceSpecifier);
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public IdentifierPathContext name;
		public CallArgumentListContext arguments;
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInheritanceSpecifier(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			((InheritanceSpecifierContext)_localctx).name = identifierPath();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LParen) {
				{
				setState(294);
				((InheritanceSpecifierContext)_localctx).arguments = callArgumentList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractBodyElementContext extends ParserRuleContext {
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FallbackFunctionDefinitionContext fallbackFunctionDefinition() {
			return getRuleContext(FallbackFunctionDefinitionContext.class,0);
		}
		public ReceiveFunctionDefinitionContext receiveFunctionDefinition() {
			return getRuleContext(ReceiveFunctionDefinitionContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public UserDefinedValueTypeDefinitionContext userDefinedValueTypeDefinition() {
			return getRuleContext(UserDefinedValueTypeDefinitionContext.class,0);
		}
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public ErrorDefinitionContext errorDefinition() {
			return getRuleContext(ErrorDefinitionContext.class,0);
		}
		public UsingDirectiveContext usingDirective() {
			return getRuleContext(UsingDirectiveContext.class,0);
		}
		public ContractBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterContractBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitContractBodyElement(this);
		}
	}

	public final ContractBodyElementContext contractBodyElement() throws RecognitionException {
		ContractBodyElementContext _localctx = new ContractBodyElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractBodyElement);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				constructorDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				modifierDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				fallbackFunctionDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				receiveFunctionDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				structDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
				enumDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(304);
				userDefinedValueTypeDefinition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(305);
				stateVariableDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(306);
				eventDefinition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(307);
				errorDefinition();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(308);
				usingDirective();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedArgumentContext extends ParserRuleContext {
		public IdentifierContext name;
		public ExpressionContext value;
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitNamedArgument(this);
		}
	}

	public final NamedArgumentContext namedArgument() throws RecognitionException {
		NamedArgumentContext _localctx = new NamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_namedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			((NamedArgumentContext)_localctx).name = identifier();
			setState(312);
			match(Colon);
			setState(313);
			((NamedArgumentContext)_localctx).value = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallArgumentListContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public CallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterCallArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitCallArgumentList(this);
		}
	}

	public final CallArgumentListContext callArgumentList() throws RecognitionException {
		CallArgumentListContext _localctx = new CallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(LParen);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(316);
					expression(0);
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(317);
						match(Comma);
						setState(318);
						expression(0);
						}
						}
						setState(323);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(326);
				match(LBrace);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
					{
					setState(327);
					namedArgument();
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(328);
						match(Comma);
						setState(329);
						namedArgument();
						}
						}
						setState(334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(337);
				match(RBrace);
				}
				break;
			}
			setState(340);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierPathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Period() { return getTokens(SolidityParser.Period); }
		public TerminalNode Period(int i) {
			return getToken(SolidityParser.Period, i);
		}
		public IdentifierPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIdentifierPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIdentifierPath(this);
		}
	}

	public final IdentifierPathContext identifierPath() throws RecognitionException {
		IdentifierPathContext _localctx = new IdentifierPathContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifierPath);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			identifier();
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(343);
					match(Period);
					setState(344);
					identifier();
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitModifierInvocation(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifierInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			identifierPath();
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(351);
				callArgumentList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityContext extends ParserRuleContext {
		public TerminalNode Internal() { return getToken(SolidityParser.Internal, 0); }
		public TerminalNode External() { return getToken(SolidityParser.External, 0); }
		public TerminalNode Private() { return getToken(SolidityParser.Private, 0); }
		public TerminalNode Public() { return getToken(SolidityParser.Public, 0); }
		public VisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVisibility(this);
		}
	}

	public final VisibilityContext visibility() throws RecognitionException {
		VisibilityContext _localctx = new VisibilityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_visibility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << External) | (1L << Internal) | (1L << Private) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration;
		public List<ParameterDeclarationContext> parameters = new ArrayList<ParameterDeclarationContext>();
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			((ParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
			((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameterDeclaration);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(357);
				match(Comma);
				setState(358);
				((ParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
				((ParameterListContext)_localctx).parameters.add(((ParameterListContext)_localctx).parameterDeclaration);
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public DataLocationContext location;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public DataLocationContext dataLocation() {
			return getRuleContext(DataLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			((ParameterDeclarationContext)_localctx).type = typeName(0);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) {
				{
				setState(365);
				((ParameterDeclarationContext)_localctx).location = dataLocation();
				}
			}

			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
				{
				setState(368);
				((ParameterDeclarationContext)_localctx).name = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public boolean payableSet = false;
		public boolean visibilitySet = false;
		public ParameterListContext arguments;
		public BlockContext body;
		public TerminalNode Constructor() { return getToken(SolidityParser.Constructor, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Payable() { return getTokens(SolidityParser.Payable); }
		public TerminalNode Payable(int i) {
			return getToken(SolidityParser.Payable, i);
		}
		public List<TerminalNode> Internal() { return getTokens(SolidityParser.Internal); }
		public TerminalNode Internal(int i) {
			return getToken(SolidityParser.Internal, i);
		}
		public List<TerminalNode> Public() { return getTokens(SolidityParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SolidityParser.Public, i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitConstructorDefinition(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(Constructor);
			setState(372);
			match(LParen);
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(373);
				((ConstructorDefinitionContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(376);
			match(RParen);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(387);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(377);
						modifierInvocation();
						}
						break;
					case 2:
						{
						setState(378);
						if (!(!_localctx.payableSet)) throw new FailedPredicateException(this, "!$payableSet");
						setState(379);
						match(Payable);
						((ConstructorDefinitionContext)_localctx).payableSet =  true;
						}
						break;
					case 3:
						{
						setState(381);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(382);
						match(Internal);
						((ConstructorDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 4:
						{
						setState(384);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(385);
						match(Public);
						((ConstructorDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(392);
			((ConstructorDefinitionContext)_localctx).body = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode Pure() { return getToken(SolidityParser.Pure, 0); }
		public TerminalNode View() { return getToken(SolidityParser.View, 0); }
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStateMutability(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (Payable - 48)) | (1L << (Pure - 48)) | (1L << (View - 48)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverrideSpecifierContext extends ParserRuleContext {
		public IdentifierPathContext identifierPath;
		public List<IdentifierPathContext> overrides = new ArrayList<IdentifierPathContext>();
		public TerminalNode Override() { return getToken(SolidityParser.Override, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<IdentifierPathContext> identifierPath() {
			return getRuleContexts(IdentifierPathContext.class);
		}
		public IdentifierPathContext identifierPath(int i) {
			return getRuleContext(IdentifierPathContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterOverrideSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitOverrideSpecifier(this);
		}
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(Override);
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(397);
				match(LParen);
				setState(398);
				((OverrideSpecifierContext)_localctx).identifierPath = identifierPath();
				((OverrideSpecifierContext)_localctx).overrides.add(((OverrideSpecifierContext)_localctx).identifierPath);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(399);
					match(Comma);
					setState(400);
					((OverrideSpecifierContext)_localctx).identifierPath = identifierPath();
					((OverrideSpecifierContext)_localctx).overrides.add(((OverrideSpecifierContext)_localctx).identifierPath);
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(RParen);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public ParameterListContext arguments;
		public ParameterListContext returnParameters;
		public BlockContext body;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Fallback() { return getToken(SolidityParser.Fallback, 0); }
		public TerminalNode Receive() { return getToken(SolidityParser.Receive, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(Function);
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Error:
			case Revert:
			case From:
			case Identifier:
				{
				setState(411);
				identifier();
				}
				break;
			case Fallback:
				{
				setState(412);
				match(Fallback);
				}
				break;
			case Receive:
				{
				setState(413);
				match(Receive);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(416);
			match(LParen);
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(417);
				((FunctionDefinitionContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(420);
			match(RParen);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(421);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(422);
						visibility();
						((FunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(425);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(426);
						stateMutability();
						((FunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(429);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(430);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(431);
						match(Virtual);
						((FunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(433);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(434);
						overrideSpecifier();
						((FunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(442);
				match(Returns);
				setState(443);
				match(LParen);
				setState(444);
				((FunctionDefinitionContext)_localctx).returnParameters = parameterList();
				setState(445);
				match(RParen);
				}
			}

			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(449);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(450);
				((FunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public IdentifierContext name;
		public ParameterListContext arguments;
		public BlockContext body;
		public TerminalNode Modifier() { return getToken(SolidityParser.Modifier, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitModifierDefinition(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifierDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(Modifier);
			setState(454);
			((ModifierDefinitionContext)_localctx).name = identifier();
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(455);
				match(LParen);
				setState(457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(456);
					((ModifierDefinitionContext)_localctx).arguments = parameterList();
					}
					break;
				}
				setState(459);
				match(RParen);
				}
				break;
			}
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						setState(462);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(463);
						match(Virtual);
						((ModifierDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 2:
						{
						setState(465);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(466);
						overrideSpecifier();
						((ModifierDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(474);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(475);
				((ModifierDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FallbackFunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public boolean hasParameters = false;
		public Token kind;
		public ParameterListContext returnParameters;
		public BlockContext body;
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public TerminalNode Fallback() { return getToken(SolidityParser.Fallback, 0); }
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public List<TerminalNode> External() { return getTokens(SolidityParser.External); }
		public TerminalNode External(int i) {
			return getToken(SolidityParser.External, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FallbackFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallbackFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFallbackFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFallbackFunctionDefinition(this);
		}
	}

	public final FallbackFunctionDefinitionContext fallbackFunctionDefinition() throws RecognitionException {
		FallbackFunctionDefinitionContext _localctx = new FallbackFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fallbackFunctionDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			((FallbackFunctionDefinitionContext)_localctx).kind = match(Fallback);
			setState(479);
			match(LParen);
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(480);
				parameterList();
				 ((FallbackFunctionDefinitionContext)_localctx).hasParameters =  true; 
				}
				break;
			}
			setState(485);
			match(RParen);
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(501);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(486);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(487);
						match(External);
						((FallbackFunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(489);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(490);
						stateMutability();
						((FallbackFunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(493);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(494);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(495);
						match(Virtual);
						((FallbackFunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(497);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(498);
						overrideSpecifier();
						((FallbackFunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(506);
				if (!(_localctx.hasParameters)) throw new FailedPredicateException(this, "$hasParameters");
				setState(507);
				match(Returns);
				setState(508);
				match(LParen);
				setState(509);
				((FallbackFunctionDefinitionContext)_localctx).returnParameters = parameterList();
				setState(510);
				match(RParen);
				}
				break;
			case 2:
				{
				setState(512);
				if (!(!_localctx.hasParameters)) throw new FailedPredicateException(this, "!$hasParameters");
				}
				break;
			}
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(515);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(516);
				((FallbackFunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiveFunctionDefinitionContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public boolean virtualSet = false;
		public boolean overrideSpecifierSet = false;
		public Token kind;
		public BlockContext body;
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Receive() { return getToken(SolidityParser.Receive, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public List<TerminalNode> External() { return getTokens(SolidityParser.External); }
		public TerminalNode External(int i) {
			return getToken(SolidityParser.External, i);
		}
		public List<TerminalNode> Payable() { return getTokens(SolidityParser.Payable); }
		public TerminalNode Payable(int i) {
			return getToken(SolidityParser.Payable, i);
		}
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<TerminalNode> Virtual() { return getTokens(SolidityParser.Virtual); }
		public TerminalNode Virtual(int i) {
			return getToken(SolidityParser.Virtual, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReceiveFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiveFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterReceiveFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitReceiveFunctionDefinition(this);
		}
	}

	public final ReceiveFunctionDefinitionContext receiveFunctionDefinition() throws RecognitionException {
		ReceiveFunctionDefinitionContext _localctx = new ReceiveFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_receiveFunctionDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			((ReceiveFunctionDefinitionContext)_localctx).kind = match(Receive);
			setState(520);
			match(LParen);
			setState(521);
			match(RParen);
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(522);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(523);
						match(External);
						((ReceiveFunctionDefinitionContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(525);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(526);
						match(Payable);
						((ReceiveFunctionDefinitionContext)_localctx).mutabilitySet =  true;
						}
						break;
					case 3:
						{
						setState(528);
						modifierInvocation();
						}
						break;
					case 4:
						{
						setState(529);
						if (!(!_localctx.virtualSet)) throw new FailedPredicateException(this, "!$virtualSet");
						setState(530);
						match(Virtual);
						((ReceiveFunctionDefinitionContext)_localctx).virtualSet =  true;
						}
						break;
					case 5:
						{
						setState(532);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(533);
						overrideSpecifier();
						((ReceiveFunctionDefinitionContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semicolon:
				{
				setState(541);
				match(Semicolon);
				}
				break;
			case LBrace:
				{
				setState(542);
				((ReceiveFunctionDefinitionContext)_localctx).body = block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public StructMemberContext members;
		public TerminalNode Struct() { return getToken(SolidityParser.Struct, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_structDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(Struct);
			setState(546);
			((StructDefinitionContext)_localctx).name = identifier();
			setState(547);
			match(LBrace);
			setState(549); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(548);
					((StructDefinitionContext)_localctx).members = structMember();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(551); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(553);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructMemberContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStructMember(this);
		}
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_structMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			((StructMemberContext)_localctx).type = typeName(0);
			setState(556);
			((StructMemberContext)_localctx).name = identifier();
			setState(557);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext identifier;
		public List<IdentifierContext> enumValues = new ArrayList<IdentifierContext>();
		public TerminalNode Enum() { return getToken(SolidityParser.Enum, 0); }
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEnumDefinition(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(Enum);
			setState(560);
			((EnumDefinitionContext)_localctx).name = identifier();
			setState(561);
			match(LBrace);
			setState(562);
			((EnumDefinitionContext)_localctx).identifier = identifier();
			((EnumDefinitionContext)_localctx).enumValues.add(((EnumDefinitionContext)_localctx).identifier);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(563);
				match(Comma);
				setState(564);
				((EnumDefinitionContext)_localctx).identifier = identifier();
				((EnumDefinitionContext)_localctx).enumValues.add(((EnumDefinitionContext)_localctx).identifier);
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserDefinedValueTypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode Type() { return getToken(SolidityParser.Type, 0); }
		public TerminalNode Is() { return getToken(SolidityParser.Is, 0); }
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserDefinedValueTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedValueTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUserDefinedValueTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUserDefinedValueTypeDefinition(this);
		}
	}

	public final UserDefinedValueTypeDefinitionContext userDefinedValueTypeDefinition() throws RecognitionException {
		UserDefinedValueTypeDefinitionContext _localctx = new UserDefinedValueTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_userDefinedValueTypeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(Type);
			setState(573);
			((UserDefinedValueTypeDefinitionContext)_localctx).name = identifier();
			setState(574);
			match(Is);
			setState(575);
			elementaryTypeName(true);
			setState(576);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public boolean constantnessSet = false;
		public boolean visibilitySet = false;
		public boolean overrideSpecifierSet = false;
		public TypeNameContext type;
		public IdentifierContext name;
		public ExpressionContext initialValue;
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> Public() { return getTokens(SolidityParser.Public); }
		public TerminalNode Public(int i) {
			return getToken(SolidityParser.Public, i);
		}
		public List<TerminalNode> Private() { return getTokens(SolidityParser.Private); }
		public TerminalNode Private(int i) {
			return getToken(SolidityParser.Private, i);
		}
		public List<TerminalNode> Internal() { return getTokens(SolidityParser.Internal); }
		public TerminalNode Internal(int i) {
			return getToken(SolidityParser.Internal, i);
		}
		public List<TerminalNode> Constant() { return getTokens(SolidityParser.Constant); }
		public TerminalNode Constant(int i) {
			return getToken(SolidityParser.Constant, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public List<TerminalNode> Immutable() { return getTokens(SolidityParser.Immutable); }
		public TerminalNode Immutable(int i) {
			return getToken(SolidityParser.Immutable, i);
		}
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStateVariableDeclaration(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_stateVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			((StateVariableDeclarationContext)_localctx).type = typeName(0);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(598);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(579);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(580);
						match(Public);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(582);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(583);
						match(Private);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 3:
						{
						setState(585);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(586);
						match(Internal);
						((StateVariableDeclarationContext)_localctx).visibilitySet =  true;
						}
						break;
					case 4:
						{
						setState(588);
						if (!(!_localctx.constantnessSet)) throw new FailedPredicateException(this, "!$constantnessSet");
						setState(589);
						match(Constant);
						((StateVariableDeclarationContext)_localctx).constantnessSet =  true;
						}
						break;
					case 5:
						{
						setState(591);
						if (!(!_localctx.overrideSpecifierSet)) throw new FailedPredicateException(this, "!$overrideSpecifierSet");
						setState(592);
						overrideSpecifier();
						((StateVariableDeclarationContext)_localctx).overrideSpecifierSet =  true;
						}
						break;
					case 6:
						{
						setState(595);
						if (!(!_localctx.constantnessSet)) throw new FailedPredicateException(this, "!$constantnessSet");
						setState(596);
						match(Immutable);
						((StateVariableDeclarationContext)_localctx).constantnessSet =  true;
						}
						break;
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(603);
			((StateVariableDeclarationContext)_localctx).name = identifier();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(604);
				match(Assign);
				setState(605);
				((StateVariableDeclarationContext)_localctx).initialValue = expression(0);
				}
			}

			setState(608);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public ExpressionContext initialValue;
		public TerminalNode Constant() { return getToken(SolidityParser.Constant, 0); }
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterConstantVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitConstantVariableDeclaration(this);
		}
	}

	public final ConstantVariableDeclarationContext constantVariableDeclaration() throws RecognitionException {
		ConstantVariableDeclarationContext _localctx = new ConstantVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constantVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			((ConstantVariableDeclarationContext)_localctx).type = typeName(0);
			setState(611);
			match(Constant);
			setState(612);
			((ConstantVariableDeclarationContext)_localctx).name = identifier();
			setState(613);
			match(Assign);
			setState(614);
			((ConstantVariableDeclarationContext)_localctx).initialValue = expression(0);
			setState(615);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Indexed() { return getToken(SolidityParser.Indexed, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEventParameter(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			((EventParameterContext)_localctx).type = typeName(0);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Indexed) {
				{
				setState(618);
				match(Indexed);
				}
			}

			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
				{
				setState(621);
				((EventParameterContext)_localctx).name = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public EventParameterContext eventParameter;
		public List<EventParameterContext> parameters = new ArrayList<EventParameterContext>();
		public TerminalNode Event() { return getToken(SolidityParser.Event, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Anonymous() { return getToken(SolidityParser.Anonymous, 0); }
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEventDefinition(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(Event);
			setState(625);
			((EventDefinitionContext)_localctx).name = identifier();
			setState(626);
			match(LParen);
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(627);
				((EventDefinitionContext)_localctx).eventParameter = eventParameter();
				((EventDefinitionContext)_localctx).parameters.add(((EventDefinitionContext)_localctx).eventParameter);
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(628);
					match(Comma);
					setState(629);
					((EventDefinitionContext)_localctx).eventParameter = eventParameter();
					((EventDefinitionContext)_localctx).parameters.add(((EventDefinitionContext)_localctx).eventParameter);
					}
					}
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(637);
			match(RParen);
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Anonymous) {
				{
				setState(638);
				match(Anonymous);
				}
			}

			setState(641);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorParameterContext extends ParserRuleContext {
		public TypeNameContext type;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterErrorParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitErrorParameter(this);
		}
	}

	public final ErrorParameterContext errorParameter() throws RecognitionException {
		ErrorParameterContext _localctx = new ErrorParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_errorParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			((ErrorParameterContext)_localctx).type = typeName(0);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
				{
				setState(644);
				((ErrorParameterContext)_localctx).name = identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public ErrorParameterContext errorParameter;
		public List<ErrorParameterContext> parameters = new ArrayList<ErrorParameterContext>();
		public TerminalNode Error() { return getToken(SolidityParser.Error, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ErrorParameterContext> errorParameter() {
			return getRuleContexts(ErrorParameterContext.class);
		}
		public ErrorParameterContext errorParameter(int i) {
			return getRuleContext(ErrorParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public ErrorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterErrorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitErrorDefinition(this);
		}
	}

	public final ErrorDefinitionContext errorDefinition() throws RecognitionException {
		ErrorDefinitionContext _localctx = new ErrorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_errorDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(Error);
			setState(648);
			((ErrorDefinitionContext)_localctx).name = identifier();
			setState(649);
			match(LParen);
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(650);
				((ErrorDefinitionContext)_localctx).errorParameter = errorParameter();
				((ErrorDefinitionContext)_localctx).parameters.add(((ErrorDefinitionContext)_localctx).errorParameter);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(651);
					match(Comma);
					setState(652);
					((ErrorDefinitionContext)_localctx).errorParameter = errorParameter();
					((ErrorDefinitionContext)_localctx).parameters.add(((ErrorDefinitionContext)_localctx).errorParameter);
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(660);
			match(RParen);
			setState(661);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingDirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(SolidityParser.Using, 0); }
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUsingDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUsingDirective(this);
		}
	}

	public final UsingDirectiveContext usingDirective() throws RecognitionException {
		UsingDirectiveContext _localctx = new UsingDirectiveContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_usingDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(Using);
			setState(664);
			identifierPath();
			setState(665);
			match(For);
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(666);
				match(Mul);
				}
				break;
			case 2:
				{
				setState(667);
				typeName(0);
				}
				break;
			}
			setState(670);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public MappingTypeContext mappingType() {
			return getRuleContext(MappingTypeContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_typeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(673);
				elementaryTypeName(true);
				}
				break;
			case 2:
				{
				setState(674);
				functionTypeName();
				}
				break;
			case 3:
				{
				setState(675);
				mappingType();
				}
				break;
			case 4:
				{
				setState(676);
				identifierPath();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(679);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(680);
					match(LBrack);
					setState(682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						setState(681);
						expression(0);
						}
						break;
					}
					setState(684);
					match(RBrack);
					}
					} 
				}
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public boolean allowAddressPayable;
		public TerminalNode Address() { return getToken(SolidityParser.Address, 0); }
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public TerminalNode Bool() { return getToken(SolidityParser.Bool, 0); }
		public TerminalNode String() { return getToken(SolidityParser.String, 0); }
		public TerminalNode Bytes() { return getToken(SolidityParser.Bytes, 0); }
		public TerminalNode SignedIntegerType() { return getToken(SolidityParser.SignedIntegerType, 0); }
		public TerminalNode UnsignedIntegerType() { return getToken(SolidityParser.UnsignedIntegerType, 0); }
		public TerminalNode FixedBytes() { return getToken(SolidityParser.FixedBytes, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState, boolean allowAddressPayable) {
			super(parent, invokingState);
			this.allowAddressPayable = allowAddressPayable;
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitElementaryTypeName(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName(boolean allowAddressPayable) throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState(), allowAddressPayable);
		enterRule(_localctx, 76, RULE_elementaryTypeName);
		try {
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(Address);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				if (!(_localctx.allowAddressPayable)) throw new FailedPredicateException(this, "$allowAddressPayable");
				setState(692);
				match(Address);
				setState(693);
				match(Payable);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(694);
				match(Bool);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(695);
				match(String);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(696);
				match(Bytes);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(697);
				match(SignedIntegerType);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(698);
				match(UnsignedIntegerType);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(699);
				match(FixedBytes);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(700);
				match(Fixed);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(701);
				match(Ufixed);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public boolean visibilitySet = false;
		public boolean mutabilitySet = false;
		public ParameterListContext arguments;
		public ParameterListContext returnParameters;
		public TerminalNode Function() { return getToken(SolidityParser.Function, 0); }
		public List<TerminalNode> LParen() { return getTokens(SolidityParser.LParen); }
		public TerminalNode LParen(int i) {
			return getToken(SolidityParser.LParen, i);
		}
		public List<TerminalNode> RParen() { return getTokens(SolidityParser.RParen); }
		public TerminalNode RParen(int i) {
			return getToken(SolidityParser.RParen, i);
		}
		public List<VisibilityContext> visibility() {
			return getRuleContexts(VisibilityContext.class);
		}
		public VisibilityContext visibility(int i) {
			return getRuleContext(VisibilityContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public List<ParameterListContext> parameterList() {
			return getRuleContexts(ParameterListContext.class);
		}
		public ParameterListContext parameterList(int i) {
			return getRuleContext(ParameterListContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFunctionTypeName(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(Function);
			setState(705);
			match(LParen);
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(706);
				((FunctionTypeNameContext)_localctx).arguments = parameterList();
				}
				break;
			}
			setState(709);
			match(RParen);
			setState(720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(718);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(710);
						if (!(!_localctx.visibilitySet)) throw new FailedPredicateException(this, "!$visibilitySet");
						setState(711);
						visibility();
						((FunctionTypeNameContext)_localctx).visibilitySet =  true;
						}
						break;
					case 2:
						{
						setState(714);
						if (!(!_localctx.mutabilitySet)) throw new FailedPredicateException(this, "!$mutabilitySet");
						setState(715);
						stateMutability();
						((FunctionTypeNameContext)_localctx).mutabilitySet =  true;
						}
						break;
					}
					} 
				}
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(723);
				match(Returns);
				setState(724);
				match(LParen);
				setState(725);
				((FunctionTypeNameContext)_localctx).returnParameters = parameterList();
				setState(726);
				match(RParen);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext type;
		public DataLocationContext location;
		public IdentifierContext name;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataLocationContext dataLocation() {
			return getRuleContext(DataLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			((VariableDeclarationContext)_localctx).type = typeName(0);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) {
				{
				setState(731);
				((VariableDeclarationContext)_localctx).location = dataLocation();
				}
			}

			setState(734);
			((VariableDeclarationContext)_localctx).name = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataLocationContext extends ParserRuleContext {
		public TerminalNode Memory() { return getToken(SolidityParser.Memory, 0); }
		public TerminalNode Storage() { return getToken(SolidityParser.Storage, 0); }
		public TerminalNode Calldata() { return getToken(SolidityParser.Calldata, 0); }
		public DataLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterDataLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitDataLocation(this);
		}
	}

	public final DataLocationContext dataLocation() throws RecognitionException {
		DataLocationContext _localctx = new DataLocationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dataLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Calldata) | (1L << Memory) | (1L << Storage))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryPrefixOperationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Inc() { return getToken(SolidityParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(SolidityParser.Dec, 0); }
		public TerminalNode Not() { return getToken(SolidityParser.Not, 0); }
		public TerminalNode BitNot() { return getToken(SolidityParser.BitNot, 0); }
		public TerminalNode Delete() { return getToken(SolidityParser.Delete, 0); }
		public TerminalNode Sub() { return getToken(SolidityParser.Sub, 0); }
		public UnaryPrefixOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUnaryPrefixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUnaryPrefixOperation(this);
		}
	}
	public static class PrimaryExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitPrimaryExpression(this);
		}
	}
	public static class OrderComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(SolidityParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(SolidityParser.GreaterThan, 0); }
		public TerminalNode LessThanOrEqual() { return getToken(SolidityParser.LessThanOrEqual, 0); }
		public TerminalNode GreaterThanOrEqual() { return getToken(SolidityParser.GreaterThanOrEqual, 0); }
		public OrderComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterOrderComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitOrderComparison(this);
		}
	}
	public static class ConditionalContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Conditional() { return getToken(SolidityParser.Conditional, 0); }
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public ConditionalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitConditional(this);
		}
	}
	public static class PayableConversionContext extends ExpressionContext {
		public TerminalNode Payable() { return getToken(SolidityParser.Payable, 0); }
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public PayableConversionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterPayableConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitPayableConversion(this);
		}
	}
	public static class AssignmentContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public AssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAssignment(this);
		}
	}
	public static class UnarySuffixOperationContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Inc() { return getToken(SolidityParser.Inc, 0); }
		public TerminalNode Dec() { return getToken(SolidityParser.Dec, 0); }
		public UnarySuffixOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUnarySuffixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUnarySuffixOperation(this);
		}
	}
	public static class ShiftOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Shl() { return getToken(SolidityParser.Shl, 0); }
		public TerminalNode Sar() { return getToken(SolidityParser.Sar, 0); }
		public TerminalNode Shr() { return getToken(SolidityParser.Shr, 0); }
		public ShiftOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterShiftOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitShiftOperation(this);
		}
	}
	public static class BitAndOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(SolidityParser.BitAnd, 0); }
		public BitAndOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBitAndOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBitAndOperation(this);
		}
	}
	public static class FunctionCallContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public FunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFunctionCall(this);
		}
	}
	public static class IndexRangeAccessContext extends ExpressionContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode Colon() { return getToken(SolidityParser.Colon, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public IndexRangeAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIndexRangeAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIndexRangeAccess(this);
		}
	}
	public static class NewExpressionContext extends ExpressionContext {
		public TerminalNode New() { return getToken(SolidityParser.New, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NewExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitNewExpression(this);
		}
	}
	public static class IndexAccessContext extends ExpressionContext {
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public IndexAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIndexAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIndexAccess(this);
		}
	}
	public static class AddSubOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(SolidityParser.Add, 0); }
		public TerminalNode Sub() { return getToken(SolidityParser.Sub, 0); }
		public AddSubOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAddSubOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAddSubOperation(this);
		}
	}
	public static class BitOrOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(SolidityParser.BitOr, 0); }
		public BitOrOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBitOrOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBitOrOperation(this);
		}
	}
	public static class ExpOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Exp() { return getToken(SolidityParser.Exp, 0); }
		public ExpOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterExpOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitExpOperation(this);
		}
	}
	public static class AndOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(SolidityParser.And, 0); }
		public AndOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAndOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAndOperation(this);
		}
	}
	public static class InlineArrayContext extends ExpressionContext {
		public InlineArrayExpressionContext inlineArrayExpression() {
			return getRuleContext(InlineArrayExpressionContext.class,0);
		}
		public InlineArrayContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInlineArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInlineArray(this);
		}
	}
	public static class OrOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(SolidityParser.Or, 0); }
		public OrOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterOrOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitOrOperation(this);
		}
	}
	public static class MemberAccessContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Period() { return getToken(SolidityParser.Period, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Address() { return getToken(SolidityParser.Address, 0); }
		public MemberAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMemberAccess(this);
		}
	}
	public static class MulDivModOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Mul() { return getToken(SolidityParser.Mul, 0); }
		public TerminalNode Div() { return getToken(SolidityParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SolidityParser.Mod, 0); }
		public MulDivModOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMulDivModOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMulDivModOperation(this);
		}
	}
	public static class FunctionCallOptionsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<NamedArgumentContext> namedArgument() {
			return getRuleContexts(NamedArgumentContext.class);
		}
		public NamedArgumentContext namedArgument(int i) {
			return getRuleContext(NamedArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public FunctionCallOptionsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterFunctionCallOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitFunctionCallOptions(this);
		}
	}
	public static class BitXorOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BitXor() { return getToken(SolidityParser.BitXor, 0); }
		public BitXorOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBitXorOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBitXorOperation(this);
		}
	}
	public static class TupleContext extends ExpressionContext {
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TupleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitTuple(this);
		}
	}
	public static class EqualityComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(SolidityParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(SolidityParser.NotEqual, 0); }
		public EqualityComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEqualityComparison(this);
		}
	}
	public static class MetaTypeContext extends ExpressionContext {
		public TerminalNode Type() { return getToken(SolidityParser.Type, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public MetaTypeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMetaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMetaType(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				_localctx = new PayableConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(739);
				match(Payable);
				setState(740);
				callArgumentList();
				}
				break;
			case 2:
				{
				_localctx = new MetaTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(741);
				match(Type);
				setState(742);
				match(LParen);
				setState(743);
				typeName(0);
				setState(744);
				match(RParen);
				}
				break;
			case 3:
				{
				_localctx = new UnaryPrefixOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(746);
				_la = _input.LA(1);
				if ( !(_la==Delete || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Sub - 103)) | (1L << (Not - 103)) | (1L << (BitNot - 103)) | (1L << (Inc - 103)) | (1L << (Dec - 103)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(747);
				expression(19);
				}
				break;
			case 4:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(748);
				match(New);
				setState(749);
				typeName(0);
				}
				break;
			case 5:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(750);
				tupleExpression();
				}
				break;
			case 6:
				{
				_localctx = new InlineArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(751);
				inlineArrayExpression();
				}
				break;
			case 7:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(752);
					identifier();
					}
					break;
				case 2:
					{
					setState(753);
					literal();
					}
					break;
				case 3:
					{
					setState(754);
					elementaryTypeName(false);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(841);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new ExpOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(759);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(760);
						match(Exp);
						setState(761);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(762);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(763);
						_la = _input.LA(1);
						if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Mul - 104)) | (1L << (Div - 104)) | (1L << (Mod - 104)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(764);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new AddSubOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(765);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(766);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(767);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ShiftOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(768);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(769);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (Shl - 99)) | (1L << (Sar - 99)) | (1L << (Shr - 99)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(770);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new BitAndOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(771);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(772);
						match(BitAnd);
						setState(773);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new BitXorOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(774);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(775);
						match(BitXor);
						setState(776);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new BitOrOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(777);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(778);
						match(BitOr);
						setState(779);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new OrderComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(780);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(781);
						_la = _input.LA(1);
						if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (LessThan - 110)) | (1L << (GreaterThan - 110)) | (1L << (LessThanOrEqual - 110)) | (1L << (GreaterThanOrEqual - 110)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(782);
						expression(11);
						}
						break;
					case 9:
						{
						_localctx = new EqualityComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(783);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(784);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(785);
						expression(10);
						}
						break;
					case 10:
						{
						_localctx = new AndOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(786);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(787);
						match(And);
						setState(788);
						expression(9);
						}
						break;
					case 11:
						{
						_localctx = new OrOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(789);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(790);
						match(Or);
						setState(791);
						expression(8);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(792);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(793);
						match(Conditional);
						setState(794);
						expression(0);
						setState(795);
						match(Colon);
						setState(796);
						expression(6);
						}
						break;
					case 13:
						{
						_localctx = new AssignmentContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(798);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(799);
						assignOp();
						setState(800);
						expression(5);
						}
						break;
					case 14:
						{
						_localctx = new IndexAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(802);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(803);
						match(LBrack);
						setState(805);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
						case 1:
							{
							setState(804);
							((IndexAccessContext)_localctx).index = expression(0);
							}
							break;
						}
						setState(807);
						match(RBrack);
						}
						break;
					case 15:
						{
						_localctx = new IndexRangeAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(808);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(809);
						match(LBrack);
						setState(811);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
						case 1:
							{
							setState(810);
							((IndexRangeAccessContext)_localctx).start = expression(0);
							}
							break;
						}
						setState(813);
						match(Colon);
						setState(815);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
						case 1:
							{
							setState(814);
							((IndexRangeAccessContext)_localctx).end = expression(0);
							}
							break;
						}
						setState(817);
						match(RBrack);
						}
						break;
					case 16:
						{
						_localctx = new MemberAccessContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(818);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(819);
						match(Period);
						setState(822);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Error:
						case Revert:
						case From:
						case Identifier:
							{
							setState(820);
							identifier();
							}
							break;
						case Address:
							{
							setState(821);
							match(Address);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 17:
						{
						_localctx = new FunctionCallOptionsContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(824);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(825);
						match(LBrace);
						setState(834);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
							{
							setState(826);
							namedArgument();
							setState(831);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(827);
								match(Comma);
								setState(828);
								namedArgument();
								}
								}
								setState(833);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(836);
						match(RBrace);
						}
						break;
					case 18:
						{
						_localctx = new FunctionCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(837);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(838);
						callArgumentList();
						}
						break;
					case 19:
						{
						_localctx = new UnarySuffixOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(839);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(840);
						_la = _input.LA(1);
						if ( !(_la==Inc || _la==Dec) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public TerminalNode AssignBitOr() { return getToken(SolidityParser.AssignBitOr, 0); }
		public TerminalNode AssignBitXor() { return getToken(SolidityParser.AssignBitXor, 0); }
		public TerminalNode AssignBitAnd() { return getToken(SolidityParser.AssignBitAnd, 0); }
		public TerminalNode AssignShl() { return getToken(SolidityParser.AssignShl, 0); }
		public TerminalNode AssignSar() { return getToken(SolidityParser.AssignSar, 0); }
		public TerminalNode AssignShr() { return getToken(SolidityParser.AssignShr, 0); }
		public TerminalNode AssignAdd() { return getToken(SolidityParser.AssignAdd, 0); }
		public TerminalNode AssignSub() { return getToken(SolidityParser.AssignSub, 0); }
		public TerminalNode AssignMul() { return getToken(SolidityParser.AssignMul, 0); }
		public TerminalNode AssignDiv() { return getToken(SolidityParser.AssignDiv, 0); }
		public TerminalNode AssignMod() { return getToken(SolidityParser.AssignMod, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAssignOp(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Assign - 81)) | (1L << (AssignBitOr - 81)) | (1L << (AssignBitXor - 81)) | (1L << (AssignBitAnd - 81)) | (1L << (AssignShl - 81)) | (1L << (AssignSar - 81)) | (1L << (AssignShr - 81)) | (1L << (AssignAdd - 81)) | (1L << (AssignSub - 81)) | (1L << (AssignMul - 81)) | (1L << (AssignDiv - 81)) | (1L << (AssignMod - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleExpressionContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitTupleExpression(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tupleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(LParen);
			{
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(849);
				expression(0);
				}
				break;
			}
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(852);
				match(Comma);
				setState(854);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(853);
					expression(0);
					}
					break;
				}
				}
				}
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(861);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineArrayExpressionContext extends ParserRuleContext {
		public TerminalNode LBrack() { return getToken(SolidityParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(SolidityParser.RBrack, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public InlineArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineArrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterInlineArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitInlineArrayExpression(this);
		}
	}

	public final InlineArrayExpressionContext inlineArrayExpression() throws RecognitionException {
		InlineArrayExpressionContext _localctx = new InlineArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inlineArrayExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(LBrack);
			{
			setState(864);
			expression(0);
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(865);
				match(Comma);
				setState(866);
				expression(0);
				}
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(872);
			match(RBrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public TerminalNode From() { return getToken(SolidityParser.From, 0); }
		public TerminalNode Error() { return getToken(SolidityParser.Error, 0); }
		public TerminalNode Revert() { return getToken(SolidityParser.Revert, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public HexStringLiteralContext hexStringLiteral() {
			return getRuleContext(HexStringLiteralContext.class,0);
		}
		public UnicodeStringLiteralContext unicodeStringLiteral() {
			return getRuleContext(UnicodeStringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_literal);
		try {
			setState(881);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonEmptyStringLiteral:
			case EmptyStringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				stringLiteral();
				}
				break;
			case HexNumber:
			case DecimalNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
				numberLiteral();
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				booleanLiteral();
				}
				break;
			case HexString:
				enterOuterAlt(_localctx, 4);
				{
				setState(879);
				hexStringLiteral();
				}
				break;
			case UnicodeStringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(880);
				unicodeStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(SolidityParser.True, 0); }
		public TerminalNode False() { return getToken(SolidityParser.False, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NonEmptyStringLiteral() { return getTokens(SolidityParser.NonEmptyStringLiteral); }
		public TerminalNode NonEmptyStringLiteral(int i) {
			return getToken(SolidityParser.NonEmptyStringLiteral, i);
		}
		public List<TerminalNode> EmptyStringLiteral() { return getTokens(SolidityParser.EmptyStringLiteral); }
		public TerminalNode EmptyStringLiteral(int i) {
			return getToken(SolidityParser.EmptyStringLiteral, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(886); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(885);
					_la = _input.LA(1);
					if ( !(_la==NonEmptyStringLiteral || _la==EmptyStringLiteral) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(888); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> HexString() { return getTokens(SolidityParser.HexString); }
		public TerminalNode HexString(int i) {
			return getToken(SolidityParser.HexString, i);
		}
		public HexStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterHexStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitHexStringLiteral(this);
		}
	}

	public final HexStringLiteralContext hexStringLiteral() throws RecognitionException {
		HexStringLiteralContext _localctx = new HexStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_hexStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(891); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(890);
					match(HexString);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(893); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnicodeStringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> UnicodeStringLiteral() { return getTokens(SolidityParser.UnicodeStringLiteral); }
		public TerminalNode UnicodeStringLiteral(int i) {
			return getToken(SolidityParser.UnicodeStringLiteral, i);
		}
		public UnicodeStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicodeStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUnicodeStringLiteral(this);
		}
	}

	public final UnicodeStringLiteralContext unicodeStringLiteral() throws RecognitionException {
		UnicodeStringLiteralContext _localctx = new UnicodeStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_unicodeStringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(896); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(895);
					match(UnicodeStringLiteral);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(898); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitNumberLiteral(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_la = _input.LA(1);
			if ( !(_la==HexNumber || _la==DecimalNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(901);
				match(NumberUnit);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(SolidityParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(SolidityParser.RBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<UncheckedBlockContext> uncheckedBlock() {
			return getRuleContexts(UncheckedBlockContext.class);
		}
		public UncheckedBlockContext uncheckedBlock(int i) {
			return getRuleContext(UncheckedBlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(LBrace);
			setState(909);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(907);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(905);
						statement();
						}
						break;
					case 2:
						{
						setState(906);
						uncheckedBlock();
						}
						break;
					}
					} 
				}
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(912);
			match(RBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UncheckedBlockContext extends ParserRuleContext {
		public TerminalNode Unchecked() { return getToken(SolidityParser.Unchecked, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncheckedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterUncheckedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitUncheckedBlock(this);
		}
	}

	public final UncheckedBlockContext uncheckedBlock() throws RecognitionException {
		UncheckedBlockContext _localctx = new UncheckedBlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_uncheckedBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(Unchecked);
			setState(915);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public RevertStatementContext revertStatement() {
			return getRuleContext(RevertStatementContext.class,0);
		}
		public AssemblyStatementContext assemblyStatement() {
			return getRuleContext(AssemblyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_statement);
		try {
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				simpleStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(919);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(920);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(921);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(922);
				doWhileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(923);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(924);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(925);
				tryStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(926);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(927);
				emitStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(928);
				revertStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(929);
				assemblyStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_simpleStatement);
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				variableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				expressionStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(SolidityParser.If, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(SolidityParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(If);
			setState(937);
			match(LParen);
			setState(938);
			expression(0);
			setState(939);
			match(RParen);
			setState(940);
			statement();
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(941);
				match(Else);
				setState(942);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(SolidityParser.For, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public List<TerminalNode> Semicolon() { return getTokens(SolidityParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(SolidityParser.Semicolon, i);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			match(For);
			setState(946);
			match(LParen);
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(947);
				simpleStatement();
				}
				break;
			case 2:
				{
				setState(948);
				match(Semicolon);
				}
				break;
			}
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(951);
				expressionStatement();
				}
				break;
			case 2:
				{
				setState(952);
				match(Semicolon);
				}
				break;
			}
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(955);
				expression(0);
				}
				break;
			}
			setState(958);
			match(RParen);
			setState(959);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(While);
			setState(962);
			match(LParen);
			setState(963);
			expression(0);
			setState(964);
			match(RParen);
			setState(965);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(SolidityParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(SolidityParser.While, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(Do);
			setState(968);
			statement();
			setState(969);
			match(While);
			setState(970);
			match(LParen);
			setState(971);
			expression(0);
			setState(972);
			match(RParen);
			setState(973);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(SolidityParser.Continue, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			match(Continue);
			setState(976);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(SolidityParser.Break, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(Break);
			setState(979);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public ParameterListContext returnParameters;
		public TerminalNode Try() { return getToken(SolidityParser.Try, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Returns() { return getToken(SolidityParser.Returns, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tryStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(Try);
			setState(982);
			expression(0);
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Returns) {
				{
				setState(983);
				match(Returns);
				setState(984);
				match(LParen);
				setState(985);
				((TryStatementContext)_localctx).returnParameters = parameterList();
				setState(986);
				match(RParen);
				}
			}

			setState(990);
			block();
			setState(992); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(991);
					catchClause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(994); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public ParameterListContext arguments;
		public TerminalNode Catch() { return getToken(SolidityParser.Catch, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(Catch);
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==LParen || _la==Identifier) {
				{
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Error) | (1L << Revert) | (1L << From))) != 0) || _la==Identifier) {
					{
					setState(997);
					identifier();
					}
				}

				setState(1000);
				match(LParen);
				{
				setState(1001);
				((CatchClauseContext)_localctx).arguments = parameterList();
				}
				setState(1002);
				match(RParen);
				}
			}

			setState(1006);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(SolidityParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(Return);
			setState(1010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1009);
				expression(0);
				}
				break;
			}
			setState(1012);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitStatementContext extends ParserRuleContext {
		public TerminalNode Emit() { return getToken(SolidityParser.Emit, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitEmitStatement(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(Emit);
			setState(1015);
			expression(0);
			setState(1016);
			callArgumentList();
			setState(1017);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevertStatementContext extends ParserRuleContext {
		public TerminalNode Revert() { return getToken(SolidityParser.Revert, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentListContext callArgumentList() {
			return getRuleContext(CallArgumentListContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public RevertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterRevertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitRevertStatement(this);
		}
	}

	public final RevertStatementContext revertStatement() throws RecognitionException {
		RevertStatementContext _localctx = new RevertStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_revertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(Revert);
			setState(1020);
			expression(0);
			setState(1021);
			callArgumentList();
			setState(1022);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssemblyStatementContext extends ParserRuleContext {
		public TerminalNode Assembly() { return getToken(SolidityParser.Assembly, 0); }
		public TerminalNode AssemblyLBrace() { return getToken(SolidityParser.AssemblyLBrace, 0); }
		public TerminalNode YulRBrace() { return getToken(SolidityParser.YulRBrace, 0); }
		public TerminalNode AssemblyDialect() { return getToken(SolidityParser.AssemblyDialect, 0); }
		public List<YulStatementContext> yulStatement() {
			return getRuleContexts(YulStatementContext.class);
		}
		public YulStatementContext yulStatement(int i) {
			return getRuleContext(YulStatementContext.class,i);
		}
		public AssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitAssemblyStatement(this);
		}
	}

	public final AssemblyStatementContext assemblyStatement() throws RecognitionException {
		AssemblyStatementContext _localctx = new AssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(Assembly);
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AssemblyDialect) {
				{
				setState(1025);
				match(AssemblyDialect);
				}
			}

			setState(1028);
			match(AssemblyLBrace);
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (YulBreak - 135)) | (1L << (YulContinue - 135)) | (1L << (YulFor - 135)) | (1L << (YulFunction - 135)) | (1L << (YulIf - 135)) | (1L << (YulLeave - 135)) | (1L << (YulLet - 135)) | (1L << (YulSwitch - 135)) | (1L << (YulEVMBuiltin - 135)) | (1L << (YulLBrace - 135)) | (1L << (YulIdentifier - 135)))) != 0)) {
				{
				{
				setState(1029);
				yulStatement();
				}
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1035);
			match(YulRBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> variableDeclarations = new ArrayList<VariableDeclarationContext>();
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			((VariableDeclarationListContext)_localctx).variableDeclaration = variableDeclaration();
			((VariableDeclarationListContext)_localctx).variableDeclarations.add(((VariableDeclarationListContext)_localctx).variableDeclaration);
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1038);
				match(Comma);
				setState(1039);
				((VariableDeclarationListContext)_localctx).variableDeclaration = variableDeclaration();
				((VariableDeclarationListContext)_localctx).variableDeclarations.add(((VariableDeclarationListContext)_localctx).variableDeclaration);
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationTupleContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration;
		public List<VariableDeclarationContext> variableDeclarations = new ArrayList<VariableDeclarationContext>();
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SolidityParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SolidityParser.Comma, i);
		}
		public VariableDeclarationTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVariableDeclarationTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVariableDeclarationTuple(this);
		}
	}

	public final VariableDeclarationTupleContext variableDeclarationTuple() throws RecognitionException {
		VariableDeclarationTupleContext _localctx = new VariableDeclarationTupleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_variableDeclarationTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(LParen);
			{
			setState(1049);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1046);
					match(Comma);
					}
					} 
				}
				setState(1051);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(1052);
			((VariableDeclarationTupleContext)_localctx).variableDeclaration = variableDeclaration();
			((VariableDeclarationTupleContext)_localctx).variableDeclarations.add(((VariableDeclarationTupleContext)_localctx).variableDeclaration);
			}
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1054);
				match(Comma);
				setState(1056);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1055);
					((VariableDeclarationTupleContext)_localctx).variableDeclaration = variableDeclaration();
					((VariableDeclarationTupleContext)_localctx).variableDeclarations.add(((VariableDeclarationTupleContext)_localctx).variableDeclaration);
					}
					break;
				}
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationTupleContext variableDeclarationTuple() {
			return getRuleContext(VariableDeclarationTupleContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SolidityParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				{
				setState(1065);
				variableDeclaration();
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(1066);
					match(Assign);
					setState(1067);
					expression(0);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1070);
				variableDeclarationTuple();
				setState(1071);
				match(Assign);
				setState(1072);
				expression(0);
				}
				}
				break;
			}
			setState(1076);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(SolidityParser.Semicolon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			expression(0);
			setState(1079);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingTypeContext extends ParserRuleContext {
		public MappingKeyTypeContext key;
		public TypeNameContext value;
		public TerminalNode Mapping() { return getToken(SolidityParser.Mapping, 0); }
		public TerminalNode LParen() { return getToken(SolidityParser.LParen, 0); }
		public TerminalNode DoubleArrow() { return getToken(SolidityParser.DoubleArrow, 0); }
		public TerminalNode RParen() { return getToken(SolidityParser.RParen, 0); }
		public MappingKeyTypeContext mappingKeyType() {
			return getRuleContext(MappingKeyTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMappingType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMappingType(this);
		}
	}

	public final MappingTypeContext mappingType() throws RecognitionException {
		MappingTypeContext _localctx = new MappingTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_mappingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(Mapping);
			setState(1082);
			match(LParen);
			setState(1083);
			((MappingTypeContext)_localctx).key = mappingKeyType();
			setState(1084);
			match(DoubleArrow);
			setState(1085);
			((MappingTypeContext)_localctx).value = typeName(0);
			setState(1086);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingKeyTypeContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public IdentifierPathContext identifierPath() {
			return getRuleContext(IdentifierPathContext.class,0);
		}
		public MappingKeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingKeyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterMappingKeyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitMappingKeyType(this);
		}
	}

	public final MappingKeyTypeContext mappingKeyType() throws RecognitionException {
		MappingKeyTypeContext _localctx = new MappingKeyTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_mappingKeyType);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				elementaryTypeName(false);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				identifierPath();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulStatementContext extends ParserRuleContext {
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulVariableDeclarationContext yulVariableDeclaration() {
			return getRuleContext(YulVariableDeclarationContext.class,0);
		}
		public YulAssignmentContext yulAssignment() {
			return getRuleContext(YulAssignmentContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulIfStatementContext yulIfStatement() {
			return getRuleContext(YulIfStatementContext.class,0);
		}
		public YulForStatementContext yulForStatement() {
			return getRuleContext(YulForStatementContext.class,0);
		}
		public YulSwitchStatementContext yulSwitchStatement() {
			return getRuleContext(YulSwitchStatementContext.class,0);
		}
		public TerminalNode YulLeave() { return getToken(SolidityParser.YulLeave, 0); }
		public TerminalNode YulBreak() { return getToken(SolidityParser.YulBreak, 0); }
		public TerminalNode YulContinue() { return getToken(SolidityParser.YulContinue, 0); }
		public YulFunctionDefinitionContext yulFunctionDefinition() {
			return getRuleContext(YulFunctionDefinitionContext.class,0);
		}
		public YulStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulStatement(this);
		}
	}

	public final YulStatementContext yulStatement() throws RecognitionException {
		YulStatementContext _localctx = new YulStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_yulStatement);
		try {
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				yulBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				yulVariableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
				yulAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1095);
				yulFunctionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1096);
				yulIfStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1097);
				yulForStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1098);
				yulSwitchStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1099);
				match(YulLeave);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1100);
				match(YulBreak);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1101);
				match(YulContinue);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1102);
				yulFunctionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulBlockContext extends ParserRuleContext {
		public TerminalNode YulLBrace() { return getToken(SolidityParser.YulLBrace, 0); }
		public TerminalNode YulRBrace() { return getToken(SolidityParser.YulRBrace, 0); }
		public List<YulStatementContext> yulStatement() {
			return getRuleContexts(YulStatementContext.class);
		}
		public YulStatementContext yulStatement(int i) {
			return getRuleContext(YulStatementContext.class,i);
		}
		public YulBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulBlock(this);
		}
	}

	public final YulBlockContext yulBlock() throws RecognitionException {
		YulBlockContext _localctx = new YulBlockContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_yulBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(YulLBrace);
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (YulBreak - 135)) | (1L << (YulContinue - 135)) | (1L << (YulFor - 135)) | (1L << (YulFunction - 135)) | (1L << (YulIf - 135)) | (1L << (YulLeave - 135)) | (1L << (YulLet - 135)) | (1L << (YulSwitch - 135)) | (1L << (YulEVMBuiltin - 135)) | (1L << (YulLBrace - 135)) | (1L << (YulIdentifier - 135)))) != 0)) {
				{
				{
				setState(1106);
				yulStatement();
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1112);
			match(YulRBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulVariableDeclarationContext extends ParserRuleContext {
		public Token YulIdentifier;
		public List<Token> variables = new ArrayList<Token>();
		public TerminalNode YulLet() { return getToken(SolidityParser.YulLet, 0); }
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public TerminalNode YulAssign() { return getToken(SolidityParser.YulAssign, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulVariableDeclaration(this);
		}
	}

	public final YulVariableDeclarationContext yulVariableDeclaration() throws RecognitionException {
		YulVariableDeclarationContext _localctx = new YulVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_yulVariableDeclaration);
		int _la;
		try {
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1114);
				match(YulLet);
				setState(1115);
				((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulAssign) {
					{
					setState(1116);
					match(YulAssign);
					setState(1117);
					yulExpression();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1120);
				match(YulLet);
				setState(1121);
				((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1122);
					match(YulComma);
					setState(1123);
					((YulVariableDeclarationContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulVariableDeclarationContext)_localctx).variables.add(((YulVariableDeclarationContext)_localctx).YulIdentifier);
					}
					}
					setState(1128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulAssign) {
					{
					setState(1129);
					match(YulAssign);
					setState(1130);
					yulFunctionCall();
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulAssignmentContext extends ParserRuleContext {
		public List<YulPathContext> yulPath() {
			return getRuleContexts(YulPathContext.class);
		}
		public YulPathContext yulPath(int i) {
			return getRuleContext(YulPathContext.class,i);
		}
		public TerminalNode YulAssign() { return getToken(SolidityParser.YulAssign, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulAssignment(this);
		}
	}

	public final YulAssignmentContext yulAssignment() throws RecognitionException {
		YulAssignmentContext _localctx = new YulAssignmentContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_yulAssignment);
		int _la;
		try {
			setState(1149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				yulPath();
				setState(1136);
				match(YulAssign);
				setState(1137);
				yulExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1139);
				yulPath();
				setState(1142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1140);
					match(YulComma);
					setState(1141);
					yulPath();
					}
					}
					setState(1144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==YulComma );
				}
				setState(1146);
				match(YulAssign);
				setState(1147);
				yulFunctionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulIfStatementContext extends ParserRuleContext {
		public YulExpressionContext cond;
		public YulBlockContext body;
		public TerminalNode YulIf() { return getToken(SolidityParser.YulIf, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulIfStatement(this);
		}
	}

	public final YulIfStatementContext yulIfStatement() throws RecognitionException {
		YulIfStatementContext _localctx = new YulIfStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_yulIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(YulIf);
			setState(1152);
			((YulIfStatementContext)_localctx).cond = yulExpression();
			setState(1153);
			((YulIfStatementContext)_localctx).body = yulBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulForStatementContext extends ParserRuleContext {
		public YulBlockContext init;
		public YulExpressionContext cond;
		public YulBlockContext post;
		public YulBlockContext body;
		public TerminalNode YulFor() { return getToken(SolidityParser.YulFor, 0); }
		public List<YulBlockContext> yulBlock() {
			return getRuleContexts(YulBlockContext.class);
		}
		public YulBlockContext yulBlock(int i) {
			return getRuleContext(YulBlockContext.class,i);
		}
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public YulForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulForStatement(this);
		}
	}

	public final YulForStatementContext yulForStatement() throws RecognitionException {
		YulForStatementContext _localctx = new YulForStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_yulForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(YulFor);
			setState(1156);
			((YulForStatementContext)_localctx).init = yulBlock();
			setState(1157);
			((YulForStatementContext)_localctx).cond = yulExpression();
			setState(1158);
			((YulForStatementContext)_localctx).post = yulBlock();
			setState(1159);
			((YulForStatementContext)_localctx).body = yulBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulSwitchCaseContext extends ParserRuleContext {
		public TerminalNode YulCase() { return getToken(SolidityParser.YulCase, 0); }
		public YulLiteralContext yulLiteral() {
			return getRuleContext(YulLiteralContext.class,0);
		}
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public YulSwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulSwitchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulSwitchCase(this);
		}
	}

	public final YulSwitchCaseContext yulSwitchCase() throws RecognitionException {
		YulSwitchCaseContext _localctx = new YulSwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_yulSwitchCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1161);
			match(YulCase);
			setState(1162);
			yulLiteral();
			setState(1163);
			yulBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulSwitchStatementContext extends ParserRuleContext {
		public TerminalNode YulSwitch() { return getToken(SolidityParser.YulSwitch, 0); }
		public YulExpressionContext yulExpression() {
			return getRuleContext(YulExpressionContext.class,0);
		}
		public TerminalNode YulDefault() { return getToken(SolidityParser.YulDefault, 0); }
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public List<YulSwitchCaseContext> yulSwitchCase() {
			return getRuleContexts(YulSwitchCaseContext.class);
		}
		public YulSwitchCaseContext yulSwitchCase(int i) {
			return getRuleContext(YulSwitchCaseContext.class,i);
		}
		public YulSwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulSwitchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulSwitchStatement(this);
		}
	}

	public final YulSwitchStatementContext yulSwitchStatement() throws RecognitionException {
		YulSwitchStatementContext _localctx = new YulSwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_yulSwitchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(YulSwitch);
			setState(1166);
			yulExpression();
			setState(1178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YulCase:
				{
				{
				setState(1168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1167);
					yulSwitchCase();
					}
					}
					setState(1170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==YulCase );
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==YulDefault) {
					{
					setState(1172);
					match(YulDefault);
					setState(1173);
					yulBlock();
					}
				}

				}
				}
				break;
			case YulDefault:
				{
				{
				setState(1176);
				match(YulDefault);
				setState(1177);
				yulBlock();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulFunctionDefinitionContext extends ParserRuleContext {
		public Token YulIdentifier;
		public List<Token> arguments = new ArrayList<Token>();
		public List<Token> returnParameters = new ArrayList<Token>();
		public YulBlockContext body;
		public TerminalNode YulFunction() { return getToken(SolidityParser.YulFunction, 0); }
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public TerminalNode YulLParen() { return getToken(SolidityParser.YulLParen, 0); }
		public TerminalNode YulRParen() { return getToken(SolidityParser.YulRParen, 0); }
		public YulBlockContext yulBlock() {
			return getRuleContext(YulBlockContext.class,0);
		}
		public TerminalNode YulArrow() { return getToken(SolidityParser.YulArrow, 0); }
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulFunctionDefinition(this);
		}
	}

	public final YulFunctionDefinitionContext yulFunctionDefinition() throws RecognitionException {
		YulFunctionDefinitionContext _localctx = new YulFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_yulFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(YulFunction);
			setState(1181);
			match(YulIdentifier);
			setState(1182);
			match(YulLParen);
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YulIdentifier) {
				{
				setState(1183);
				((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulFunctionDefinitionContext)_localctx).arguments.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1184);
					match(YulComma);
					setState(1185);
					((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulFunctionDefinitionContext)_localctx).arguments.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
					}
					}
					setState(1190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1193);
			match(YulRParen);
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==YulArrow) {
				{
				setState(1194);
				match(YulArrow);
				setState(1195);
				((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
				((YulFunctionDefinitionContext)_localctx).returnParameters.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1196);
					match(YulComma);
					setState(1197);
					((YulFunctionDefinitionContext)_localctx).YulIdentifier = match(YulIdentifier);
					((YulFunctionDefinitionContext)_localctx).returnParameters.add(((YulFunctionDefinitionContext)_localctx).YulIdentifier);
					}
					}
					setState(1202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1205);
			((YulFunctionDefinitionContext)_localctx).body = yulBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulPathContext extends ParserRuleContext {
		public List<TerminalNode> YulIdentifier() { return getTokens(SolidityParser.YulIdentifier); }
		public TerminalNode YulIdentifier(int i) {
			return getToken(SolidityParser.YulIdentifier, i);
		}
		public List<TerminalNode> YulPeriod() { return getTokens(SolidityParser.YulPeriod); }
		public TerminalNode YulPeriod(int i) {
			return getToken(SolidityParser.YulPeriod, i);
		}
		public YulPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulPath(this);
		}
	}

	public final YulPathContext yulPath() throws RecognitionException {
		YulPathContext _localctx = new YulPathContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_yulPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(YulIdentifier);
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==YulPeriod) {
				{
				{
				setState(1208);
				match(YulPeriod);
				setState(1209);
				match(YulIdentifier);
				}
				}
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulFunctionCallContext extends ParserRuleContext {
		public TerminalNode YulLParen() { return getToken(SolidityParser.YulLParen, 0); }
		public TerminalNode YulRParen() { return getToken(SolidityParser.YulRParen, 0); }
		public TerminalNode YulIdentifier() { return getToken(SolidityParser.YulIdentifier, 0); }
		public TerminalNode YulEVMBuiltin() { return getToken(SolidityParser.YulEVMBuiltin, 0); }
		public List<YulExpressionContext> yulExpression() {
			return getRuleContexts(YulExpressionContext.class);
		}
		public YulExpressionContext yulExpression(int i) {
			return getRuleContext(YulExpressionContext.class,i);
		}
		public List<TerminalNode> YulComma() { return getTokens(SolidityParser.YulComma); }
		public TerminalNode YulComma(int i) {
			return getToken(SolidityParser.YulComma, i);
		}
		public YulFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulFunctionCall(this);
		}
	}

	public final YulFunctionCallContext yulFunctionCall() throws RecognitionException {
		YulFunctionCallContext _localctx = new YulFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_yulFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_la = _input.LA(1);
			if ( !(_la==YulEVMBuiltin || _la==YulIdentifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1216);
			match(YulLParen);
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (YulFalse - 139)) | (1L << (YulTrue - 139)) | (1L << (YulEVMBuiltin - 139)) | (1L << (YulIdentifier - 139)) | (1L << (YulHexNumber - 139)) | (1L << (YulDecimalNumber - 139)) | (1L << (YulStringLiteral - 139)) | (1L << (YulHexStringLiteral - 139)))) != 0)) {
				{
				setState(1217);
				yulExpression();
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==YulComma) {
					{
					{
					setState(1218);
					match(YulComma);
					setState(1219);
					yulExpression();
					}
					}
					setState(1224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1227);
			match(YulRParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulBooleanContext extends ParserRuleContext {
		public TerminalNode YulTrue() { return getToken(SolidityParser.YulTrue, 0); }
		public TerminalNode YulFalse() { return getToken(SolidityParser.YulFalse, 0); }
		public YulBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulBoolean(this);
		}
	}

	public final YulBooleanContext yulBoolean() throws RecognitionException {
		YulBooleanContext _localctx = new YulBooleanContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_yulBoolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			_la = _input.LA(1);
			if ( !(_la==YulFalse || _la==YulTrue) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulLiteralContext extends ParserRuleContext {
		public TerminalNode YulDecimalNumber() { return getToken(SolidityParser.YulDecimalNumber, 0); }
		public TerminalNode YulStringLiteral() { return getToken(SolidityParser.YulStringLiteral, 0); }
		public TerminalNode YulHexNumber() { return getToken(SolidityParser.YulHexNumber, 0); }
		public YulBooleanContext yulBoolean() {
			return getRuleContext(YulBooleanContext.class,0);
		}
		public TerminalNode YulHexStringLiteral() { return getToken(SolidityParser.YulHexStringLiteral, 0); }
		public YulLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulLiteral(this);
		}
	}

	public final YulLiteralContext yulLiteral() throws RecognitionException {
		YulLiteralContext _localctx = new YulLiteralContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_yulLiteral);
		try {
			setState(1236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YulDecimalNumber:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				match(YulDecimalNumber);
				}
				break;
			case YulStringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				match(YulStringLiteral);
				}
				break;
			case YulHexNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(1233);
				match(YulHexNumber);
				}
				break;
			case YulFalse:
			case YulTrue:
				enterOuterAlt(_localctx, 4);
				{
				setState(1234);
				yulBoolean();
				}
				break;
			case YulHexStringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(1235);
				match(YulHexStringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YulExpressionContext extends ParserRuleContext {
		public YulPathContext yulPath() {
			return getRuleContext(YulPathContext.class,0);
		}
		public YulFunctionCallContext yulFunctionCall() {
			return getRuleContext(YulFunctionCallContext.class,0);
		}
		public YulLiteralContext yulLiteral() {
			return getRuleContext(YulLiteralContext.class,0);
		}
		public YulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yulExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).enterYulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityParserListener ) ((SolidityParserListener)listener).exitYulExpression(this);
		}
	}

	public final YulExpressionContext yulExpression() throws RecognitionException {
		YulExpressionContext _localctx = new YulExpressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_yulExpression);
		try {
			setState(1241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				yulPath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239);
				yulFunctionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1240);
				yulLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return constructorDefinition_sempred((ConstructorDefinitionContext)_localctx, predIndex);
		case 22:
			return functionDefinition_sempred((FunctionDefinitionContext)_localctx, predIndex);
		case 23:
			return modifierDefinition_sempred((ModifierDefinitionContext)_localctx, predIndex);
		case 24:
			return fallbackFunctionDefinition_sempred((FallbackFunctionDefinitionContext)_localctx, predIndex);
		case 25:
			return receiveFunctionDefinition_sempred((ReceiveFunctionDefinitionContext)_localctx, predIndex);
		case 30:
			return stateVariableDeclaration_sempred((StateVariableDeclarationContext)_localctx, predIndex);
		case 37:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 38:
			return elementaryTypeName_sempred((ElementaryTypeNameContext)_localctx, predIndex);
		case 39:
			return functionTypeName_sempred((FunctionTypeNameContext)_localctx, predIndex);
		case 42:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constructorDefinition_sempred(ConstructorDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_localctx.payableSet;
		case 1:
			return !_localctx.visibilitySet;
		case 2:
			return !_localctx.visibilitySet;
		}
		return true;
	}
	private boolean functionDefinition_sempred(FunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_localctx.visibilitySet;
		case 4:
			return !_localctx.mutabilitySet;
		case 5:
			return !_localctx.virtualSet;
		case 6:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean modifierDefinition_sempred(ModifierDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return !_localctx.virtualSet;
		case 8:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean fallbackFunctionDefinition_sempred(FallbackFunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return !_localctx.visibilitySet;
		case 10:
			return !_localctx.mutabilitySet;
		case 11:
			return !_localctx.virtualSet;
		case 12:
			return !_localctx.overrideSpecifierSet;
		case 13:
			return _localctx.hasParameters;
		case 14:
			return !_localctx.hasParameters;
		}
		return true;
	}
	private boolean receiveFunctionDefinition_sempred(ReceiveFunctionDefinitionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return !_localctx.visibilitySet;
		case 16:
			return !_localctx.mutabilitySet;
		case 17:
			return !_localctx.virtualSet;
		case 18:
			return !_localctx.overrideSpecifierSet;
		}
		return true;
	}
	private boolean stateVariableDeclaration_sempred(StateVariableDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !_localctx.visibilitySet;
		case 20:
			return !_localctx.visibilitySet;
		case 21:
			return !_localctx.visibilitySet;
		case 22:
			return !_localctx.constantnessSet;
		case 23:
			return !_localctx.overrideSpecifierSet;
		case 24:
			return !_localctx.constantnessSet;
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean elementaryTypeName_sempred(ElementaryTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return _localctx.allowAddressPayable;
		}
		return true;
	}
	private boolean functionTypeName_sempred(FunctionTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return !_localctx.visibilitySet;
		case 28:
			return !_localctx.mutabilitySet;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 17);
		case 30:
			return precpred(_ctx, 16);
		case 31:
			return precpred(_ctx, 15);
		case 32:
			return precpred(_ctx, 14);
		case 33:
			return precpred(_ctx, 13);
		case 34:
			return precpred(_ctx, 12);
		case 35:
			return precpred(_ctx, 11);
		case 36:
			return precpred(_ctx, 10);
		case 37:
			return precpred(_ctx, 9);
		case 38:
			return precpred(_ctx, 8);
		case 39:
			return precpred(_ctx, 7);
		case 40:
			return precpred(_ctx, 6);
		case 41:
			return precpred(_ctx, 5);
		case 42:
			return precpred(_ctx, 26);
		case 43:
			return precpred(_ctx, 25);
		case 44:
			return precpred(_ctx, 24);
		case 45:
			return precpred(_ctx, 23);
		case 46:
			return precpred(_ctx, 22);
		case 47:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ab\u04de\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\7\2\u00c0\n\2\f\2\16\2\u00c3\13\2\3\2\3\2\3\3\3\3\6\3\u00c9"+
		"\n\3\r\3\16\3\u00ca\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u00d3\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00df\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u00e6"+
		"\n\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00ee\n\7\f\7\16\7\u00f1\13\7\3\7\3\7"+
		"\3\b\5\b\u00f6\n\b\3\b\3\b\3\b\5\b\u00fb\n\b\3\b\3\b\7\b\u00ff\n\b\f\b"+
		"\16\b\u0102\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u0109\n\t\3\t\3\t\7\t\u010d\n"+
		"\t\f\t\16\t\u0110\13\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0118\n\n\f\n\16\n"+
		"\u011b\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0123\n\13\f\13\16\13\u0126"+
		"\13\13\3\f\3\f\5\f\u012a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0138\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0142"+
		"\n\17\f\17\16\17\u0145\13\17\5\17\u0147\n\17\3\17\3\17\3\17\3\17\7\17"+
		"\u014d\n\17\f\17\16\17\u0150\13\17\5\17\u0152\n\17\3\17\5\17\u0155\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\7\20\u015c\n\20\f\20\16\20\u015f\13\20\3\21"+
		"\3\21\5\21\u0163\n\21\3\22\3\22\3\23\3\23\3\23\7\23\u016a\n\23\f\23\16"+
		"\23\u016d\13\23\3\24\3\24\5\24\u0171\n\24\3\24\5\24\u0174\n\24\3\25\3"+
		"\25\3\25\5\25\u0179\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0186\n\25\f\25\16\25\u0189\13\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u0194\n\27\f\27\16\27\u0197\13\27\3\27"+
		"\3\27\5\27\u019b\n\27\3\30\3\30\3\30\3\30\5\30\u01a1\n\30\3\30\3\30\5"+
		"\30\u01a5\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01b8\n\30\f\30\16\30\u01bb\13\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u01c2\n\30\3\30\3\30\5\30\u01c6\n\30\3"+
		"\31\3\31\3\31\3\31\5\31\u01cc\n\31\3\31\5\31\u01cf\n\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u01d8\n\31\f\31\16\31\u01db\13\31\3\31\3\31"+
		"\5\31\u01df\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u01e6\n\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7"+
		"\32\u01f8\n\32\f\32\16\32\u01fb\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u0204\n\32\3\32\3\32\5\32\u0208\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u021b"+
		"\n\33\f\33\16\33\u021e\13\33\3\33\3\33\5\33\u0222\n\33\3\34\3\34\3\34"+
		"\3\34\6\34\u0228\n\34\r\34\16\34\u0229\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\7\36\u0238\n\36\f\36\16\36\u023b\13\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0259\n \f \16 \u025c\13 \3 \3 \3 \5 "+
		"\u0261\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\5\"\u026e\n\"\3\"\5\"\u0271"+
		"\n\"\3#\3#\3#\3#\3#\3#\7#\u0279\n#\f#\16#\u027c\13#\5#\u027e\n#\3#\3#"+
		"\5#\u0282\n#\3#\3#\3$\3$\5$\u0288\n$\3%\3%\3%\3%\3%\3%\7%\u0290\n%\f%"+
		"\16%\u0293\13%\5%\u0295\n%\3%\3%\3%\3&\3&\3&\3&\3&\5&\u029f\n&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\5\'\u02a8\n\'\3\'\3\'\3\'\5\'\u02ad\n\'\3\'\7\'\u02b0"+
		"\n\'\f\'\16\'\u02b3\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02c1"+
		"\n(\3)\3)\3)\5)\u02c6\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u02d1\n)\f)\16"+
		")\u02d4\13)\3)\3)\3)\3)\3)\5)\u02db\n)\3*\3*\5*\u02df\n*\3*\3*\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02f6\n,\5,\u02f8"+
		"\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\5,\u0328\n,\3,\3,\3,\3,\5,\u032e\n,\3,\3,\5,\u0332\n,\3,\3,\3,\3,"+
		"\3,\5,\u0339\n,\3,\3,\3,\3,\3,\7,\u0340\n,\f,\16,\u0343\13,\5,\u0345\n"+
		",\3,\3,\3,\3,\3,\7,\u034c\n,\f,\16,\u034f\13,\3-\3-\3.\3.\5.\u0355\n."+
		"\3.\3.\5.\u0359\n.\7.\u035b\n.\f.\16.\u035e\13.\3.\3.\3/\3/\3/\3/\7/\u0366"+
		"\n/\f/\16/\u0369\13/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\5\61\u0374"+
		"\n\61\3\62\3\62\3\63\6\63\u0379\n\63\r\63\16\63\u037a\3\64\6\64\u037e"+
		"\n\64\r\64\16\64\u037f\3\65\6\65\u0383\n\65\r\65\16\65\u0384\3\66\3\66"+
		"\5\66\u0389\n\66\3\67\3\67\3\67\7\67\u038e\n\67\f\67\16\67\u0391\13\67"+
		"\3\67\3\67\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u03a5\n"+
		"9\3:\3:\5:\u03a9\n:\3;\3;\3;\3;\3;\3;\3;\5;\u03b2\n;\3<\3<\3<\3<\5<\u03b8"+
		"\n<\3<\3<\5<\u03bc\n<\3<\5<\u03bf\n<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>"+
		"\3>\3>\3>\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\5A\u03df\nA"+
		"\3A\3A\6A\u03e3\nA\rA\16A\u03e4\3B\3B\5B\u03e9\nB\3B\3B\3B\3B\5B\u03ef"+
		"\nB\3B\3B\3C\3C\5C\u03f5\nC\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F"+
		"\5F\u0405\nF\3F\3F\7F\u0409\nF\fF\16F\u040c\13F\3F\3F\3G\3G\3G\7G\u0413"+
		"\nG\fG\16G\u0416\13G\3H\3H\7H\u041a\nH\fH\16H\u041d\13H\3H\3H\3H\3H\5"+
		"H\u0423\nH\7H\u0425\nH\fH\16H\u0428\13H\3H\3H\3I\3I\3I\5I\u042f\nI\3I"+
		"\3I\3I\3I\5I\u0435\nI\3I\3I\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\5L\u0445"+
		"\nL\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0452\nM\3N\3N\7N\u0456\nN\fN"+
		"\16N\u0459\13N\3N\3N\3O\3O\3O\3O\5O\u0461\nO\3O\3O\3O\3O\7O\u0467\nO\f"+
		"O\16O\u046a\13O\3O\3O\5O\u046e\nO\5O\u0470\nO\3P\3P\3P\3P\3P\3P\3P\6P"+
		"\u0479\nP\rP\16P\u047a\3P\3P\3P\5P\u0480\nP\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3"+
		"R\3R\3S\3S\3S\3S\3T\3T\3T\6T\u0493\nT\rT\16T\u0494\3T\3T\5T\u0499\nT\3"+
		"T\3T\5T\u049d\nT\3U\3U\3U\3U\3U\3U\7U\u04a5\nU\fU\16U\u04a8\13U\5U\u04aa"+
		"\nU\3U\3U\3U\3U\3U\7U\u04b1\nU\fU\16U\u04b4\13U\5U\u04b6\nU\3U\3U\3V\3"+
		"V\3V\7V\u04bd\nV\fV\16V\u04c0\13V\3W\3W\3W\3W\3W\7W\u04c7\nW\fW\16W\u04ca"+
		"\13W\5W\u04cc\nW\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\5Y\u04d7\nY\3Z\3Z\3Z\5Z\u04dc"+
		"\nZ\3Z\3\u0124\4LV[\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\2\23\5\2"+
		"\33\33))\63\64\5\2\62\62\65\65DD\5\2\r\r--::\5\2\23\23iitw\3\2jl\3\2h"+
		"i\3\2eg\3\2ps\3\2no\3\2vw\3\2S^\5\2\30\31\37\37\u0080\u0080\4\2\35\35"+
		"==\3\2z{\3\2~\177\4\2\u0096\u0096\u009f\u009f\4\2\u008d\u008d\u0094\u0094"+
		"\2\u056a\2\u00c1\3\2\2\2\4\u00c6\3\2\2\2\6\u00ce\3\2\2\2\b\u00e2\3\2\2"+
		"\2\n\u00e7\3\2\2\2\f\u00e9\3\2\2\2\16\u00f5\3\2\2\2\20\u0105\3\2\2\2\22"+
		"\u0113\3\2\2\2\24\u011e\3\2\2\2\26\u0127\3\2\2\2\30\u0137\3\2\2\2\32\u0139"+
		"\3\2\2\2\34\u013d\3\2\2\2\36\u0158\3\2\2\2 \u0160\3\2\2\2\"\u0164\3\2"+
		"\2\2$\u0166\3\2\2\2&\u016e\3\2\2\2(\u0175\3\2\2\2*\u018c\3\2\2\2,\u018e"+
		"\3\2\2\2.\u019c\3\2\2\2\60\u01c7\3\2\2\2\62\u01e0\3\2\2\2\64\u0209\3\2"+
		"\2\2\66\u0223\3\2\2\28\u022d\3\2\2\2:\u0231\3\2\2\2<\u023e\3\2\2\2>\u0244"+
		"\3\2\2\2@\u0264\3\2\2\2B\u026b\3\2\2\2D\u0272\3\2\2\2F\u0285\3\2\2\2H"+
		"\u0289\3\2\2\2J\u0299\3\2\2\2L\u02a7\3\2\2\2N\u02c0\3\2\2\2P\u02c2\3\2"+
		"\2\2R\u02dc\3\2\2\2T\u02e2\3\2\2\2V\u02f7\3\2\2\2X\u0350\3\2\2\2Z\u0352"+
		"\3\2\2\2\\\u0361\3\2\2\2^\u036c\3\2\2\2`\u0373\3\2\2\2b\u0375\3\2\2\2"+
		"d\u0378\3\2\2\2f\u037d\3\2\2\2h\u0382\3\2\2\2j\u0386\3\2\2\2l\u038a\3"+
		"\2\2\2n\u0394\3\2\2\2p\u03a4\3\2\2\2r\u03a8\3\2\2\2t\u03aa\3\2\2\2v\u03b3"+
		"\3\2\2\2x\u03c3\3\2\2\2z\u03c9\3\2\2\2|\u03d1\3\2\2\2~\u03d4\3\2\2\2\u0080"+
		"\u03d7\3\2\2\2\u0082\u03e6\3\2\2\2\u0084\u03f2\3\2\2\2\u0086\u03f8\3\2"+
		"\2\2\u0088\u03fd\3\2\2\2\u008a\u0402\3\2\2\2\u008c\u040f\3\2\2\2\u008e"+
		"\u0417\3\2\2\2\u0090\u0434\3\2\2\2\u0092\u0438\3\2\2\2\u0094\u043b\3\2"+
		"\2\2\u0096\u0444\3\2\2\2\u0098\u0451\3\2\2\2\u009a\u0453\3\2\2\2\u009c"+
		"\u046f\3\2\2\2\u009e\u047f\3\2\2\2\u00a0\u0481\3\2\2\2\u00a2\u0485\3\2"+
		"\2\2\u00a4\u048b\3\2\2\2\u00a6\u048f\3\2\2\2\u00a8\u049e\3\2\2\2\u00aa"+
		"\u04b9\3\2\2\2\u00ac\u04c1\3\2\2\2\u00ae\u04cf\3\2\2\2\u00b0\u04d6\3\2"+
		"\2\2\u00b2\u04db\3\2\2\2\u00b4\u00c0\5\4\3\2\u00b5\u00c0\5\6\4\2\u00b6"+
		"\u00c0\5\16\b\2\u00b7\u00c0\5\20\t\2\u00b8\u00c0\5\22\n\2\u00b9\u00c0"+
		"\5.\30\2\u00ba\u00c0\5@!\2\u00bb\u00c0\5\66\34\2\u00bc\u00c0\5:\36\2\u00bd"+
		"\u00c0\5<\37\2\u00be\u00c0\5H%\2\u00bf\u00b4\3\2\2\2\u00bf\u00b5\3\2\2"+
		"\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00b9"+
		"\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\7\2\2\3\u00c5\3\3\2\2\2\u00c6\u00c8\7\4\2\2\u00c7\u00c9\7\u00a7"+
		"\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\u00a8\2\2\u00cd\5\3\2"+
		"\2\2\u00ce\u00de\7&\2\2\u00cf\u00d2\5\n\6\2\u00d0\u00d1\7\b\2\2\u00d1"+
		"\u00d3\5^\60\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00df\3\2"+
		"\2\2\u00d4\u00d5\5\f\7\2\u00d5\u00d6\7\37\2\2\u00d6\u00d7\5\n\6\2\u00d7"+
		"\u00df\3\2\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da\7\b\2\2\u00da\u00db\5^\60"+
		"\2\u00db\u00dc\7\37\2\2\u00dc\u00dd\5\n\6\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00cf\3\2\2\2\u00de\u00d4\3\2\2\2\u00de\u00d8\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\7N\2\2\u00e1\7\3\2\2\2\u00e2\u00e5\5^\60\2\u00e3\u00e4"+
		"\7\b\2\2\u00e4\u00e6\5^\60\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\t\3\2\2\2\u00e7\u00e8\7z\2\2\u00e8\13\3\2\2\2\u00e9\u00ea\7K\2\2\u00ea"+
		"\u00ef\5\b\5\2\u00eb\u00ec\7_\2\2\u00ec\u00ee\5\b\5\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7L\2\2\u00f3\r\3\2\2\2"+
		"\u00f4\u00f6\7\5\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f8\7\22\2\2\u00f8\u00fa\5^\60\2\u00f9\u00fb\5\24\13"+
		"\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100"+
		"\7K\2\2\u00fd\u00ff\5\30\r\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u0104\7L\2\2\u0104\17\3\2\2\2\u0105\u0106\7(\2\2\u0106\u0108"+
		"\5^\60\2\u0107\u0109\5\24\13\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u010a\u010e\7K\2\2\u010b\u010d\5\30\r\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7L\2\2\u0112\21\3\2\2\2"+
		"\u0113\u0114\7+\2\2\u0114\u0115\5^\60\2\u0115\u0119\7K\2\2\u0116\u0118"+
		"\5\30\r\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d"+
		"\7L\2\2\u011d\23\3\2\2\2\u011e\u011f\7*\2\2\u011f\u0124\5\26\f\2\u0120"+
		"\u0121\7_\2\2\u0121\u0123\5\26\f\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\25\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u0129\5\36\20\2\u0128\u012a\5\34\17\2\u0129\u0128\3\2\2"+
		"\2\u0129\u012a\3\2\2\2\u012a\27\3\2\2\2\u012b\u0138\5(\25\2\u012c\u0138"+
		"\5.\30\2\u012d\u0138\5\60\31\2\u012e\u0138\5\62\32\2\u012f\u0138\5\64"+
		"\33\2\u0130\u0138\5\66\34\2\u0131\u0138\5:\36\2\u0132\u0138\5<\37\2\u0133"+
		"\u0138\5> \2\u0134\u0138\5D#\2\u0135\u0138\5H%\2\u0136\u0138\5J&\2\u0137"+
		"\u012b\3\2\2\2\u0137\u012c\3\2\2\2\u0137\u012d\3\2\2\2\u0137\u012e\3\2"+
		"\2\2\u0137\u012f\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0131\3\2\2\2\u0137"+
		"\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0136\3\2\2\2\u0138\31\3\2\2\2\u0139\u013a\5^\60\2\u013a\u013b"+
		"\7M\2\2\u013b\u013c\5V,\2\u013c\33\3\2\2\2\u013d\u0154\7G\2\2\u013e\u0143"+
		"\5V,\2\u013f\u0140\7_\2\2\u0140\u0142\5V,\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0155\3\2\2\2\u0148\u0151\7K\2\2\u0149\u014e\5\32\16\2\u014a\u014b\7"+
		"_\2\2\u014b\u014d\5\32\16\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0149\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0155\7L\2\2\u0154\u0146\3\2\2\2\u0154\u0148\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0157\7H\2\2\u0157\35\3\2\2\2\u0158\u015d\5^\60\2\u0159\u015a"+
		"\7O\2\2\u015a\u015c\5^\60\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\37\3\2\2\2\u015f\u015d\3\2\2"+
		"\2\u0160\u0162\5\36\20\2\u0161\u0163\5\34\17\2\u0162\u0161\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163!\3\2\2\2\u0164\u0165\t\2\2\2\u0165#\3\2\2\2\u0166"+
		"\u016b\5&\24\2\u0167\u0168\7_\2\2\u0168\u016a\5&\24\2\u0169\u0167\3\2"+
		"\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"%\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\5L\'\2\u016f\u0171\5T+\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0174\5^"+
		"\60\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174\'\3\2\2\2\u0175\u0176"+
		"\7\20\2\2\u0176\u0178\7G\2\2\u0177\u0179\5$\23\2\u0178\u0177\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0187\7H\2\2\u017b\u0186\5 \21"+
		"\2\u017c\u017d\6\25\2\3\u017d\u017e\7\62\2\2\u017e\u0186\b\25\1\2\u017f"+
		"\u0180\6\25\3\3\u0180\u0181\7)\2\2\u0181\u0186\b\25\1\2\u0182\u0183\6"+
		"\25\4\3\u0183\u0184\7\64\2\2\u0184\u0186\b\25\1\2\u0185\u017b\3\2\2\2"+
		"\u0185\u017c\3\2\2\2\u0185\u017f\3\2\2\2\u0185\u0182\3\2\2\2\u0186\u0189"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u018a\u018b\5l\67\2\u018b)\3\2\2\2\u018c\u018d\t\3\2\2"+
		"\u018d+\3\2\2\2\u018e\u019a\7\61\2\2\u018f\u0190\7G\2\2\u0190\u0195\5"+
		"\36\20\2\u0191\u0192\7_\2\2\u0192\u0194\5\36\20\2\u0193\u0191\3\2\2\2"+
		"\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7H\2\2\u0199\u019b\3\2\2\2\u019a"+
		"\u018f\3\2\2\2\u019a\u019b\3\2\2\2\u019b-\3\2\2\2\u019c\u01a0\7\"\2\2"+
		"\u019d\u01a1\5^\60\2\u019e\u01a1\7\34\2\2\u019f\u01a1\7\66\2\2\u01a0\u019d"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\7G\2\2\u01a3\u01a5\5$\23\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01b9\7H\2\2\u01a7\u01a8\6\30\5\3\u01a8"+
		"\u01a9\5\"\22\2\u01a9\u01aa\b\30\1\2\u01aa\u01b8\3\2\2\2\u01ab\u01ac\6"+
		"\30\6\3\u01ac\u01ad\5*\26\2\u01ad\u01ae\b\30\1\2\u01ae\u01b8\3\2\2\2\u01af"+
		"\u01b8\5 \21\2\u01b0\u01b1\6\30\7\3\u01b1\u01b2\7E\2\2\u01b2\u01b8\b\30"+
		"\1\2\u01b3\u01b4\6\30\b\3\u01b4\u01b5\5,\27\2\u01b5\u01b6\b\30\1\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01a7\3\2\2\2\u01b7\u01ab\3\2\2\2\u01b7\u01af\3\2"+
		"\2\2\u01b7\u01b0\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01c1\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01bd\78\2\2\u01bd\u01be\7G\2\2\u01be\u01bf\5$\23\2\u01bf\u01c0"+
		"\7H\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bc\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c6\7N\2\2\u01c4\u01c6\5l\67\2\u01c5\u01c3\3\2"+
		"\2\2\u01c5\u01c4\3\2\2\2\u01c6/\3\2\2\2\u01c7\u01c8\7.\2\2\u01c8\u01ce"+
		"\5^\60\2\u01c9\u01cb\7G\2\2\u01ca\u01cc\5$\23\2\u01cb\u01ca\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\7H\2\2\u01ce\u01c9\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d9\3\2\2\2\u01d0\u01d1\6\31\t\3\u01d1"+
		"\u01d2\7E\2\2\u01d2\u01d8\b\31\1\2\u01d3\u01d4\6\31\n\3\u01d4\u01d5\5"+
		",\27\2\u01d5\u01d6\b\31\1\2\u01d6\u01d8\3\2\2\2\u01d7\u01d0\3\2\2\2\u01d7"+
		"\u01d3\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01de\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01df\7N\2\2\u01dd"+
		"\u01df\5l\67\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\61\3\2\2"+
		"\2\u01e0\u01e1\7\34\2\2\u01e1\u01e5\7G\2\2\u01e2\u01e3\5$\23\2\u01e3\u01e4"+
		"\b\32\1\2\u01e4\u01e6\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e5\u01e6\3\2\2\2"+
		"\u01e6\u01e7\3\2\2\2\u01e7\u01f9\7H\2\2\u01e8\u01e9\6\32\13\3\u01e9\u01ea"+
		"\7\33\2\2\u01ea\u01f8\b\32\1\2\u01eb\u01ec\6\32\f\3\u01ec\u01ed\5*\26"+
		"\2\u01ed\u01ee\b\32\1\2\u01ee\u01f8\3\2\2\2\u01ef\u01f8\5 \21\2\u01f0"+
		"\u01f1\6\32\r\3\u01f1\u01f2\7E\2\2\u01f2\u01f8\b\32\1\2\u01f3\u01f4\6"+
		"\32\16\3\u01f4\u01f5\5,\27\2\u01f5\u01f6\b\32\1\2\u01f6\u01f8\3\2\2\2"+
		"\u01f7\u01e8\3\2\2\2\u01f7\u01eb\3\2\2\2\u01f7\u01ef\3\2\2\2\u01f7\u01f0"+
		"\3\2\2\2\u01f7\u01f3\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u0203\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u01fd\6\32"+
		"\17\3\u01fd\u01fe\78\2\2\u01fe\u01ff\7G\2\2\u01ff\u0200\5$\23\2\u0200"+
		"\u0201\7H\2\2\u0201\u0204\3\2\2\2\u0202\u0204\6\32\20\3\u0203\u01fc\3"+
		"\2\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0208\7N\2\2\u0206"+
		"\u0208\5l\67\2\u0207\u0205\3\2\2\2\u0207\u0206\3\2\2\2\u0208\63\3\2\2"+
		"\2\u0209\u020a\7\66\2\2\u020a\u020b\7G\2\2\u020b\u021c\7H\2\2\u020c\u020d"+
		"\6\33\21\3\u020d\u020e\7\33\2\2\u020e\u021b\b\33\1\2\u020f\u0210\6\33"+
		"\22\3\u0210\u0211\7\62\2\2\u0211\u021b\b\33\1\2\u0212\u021b\5 \21\2\u0213"+
		"\u0214\6\33\23\3\u0214\u0215\7E\2\2\u0215\u021b\b\33\1\2\u0216\u0217\6"+
		"\33\24\3\u0217\u0218\5,\27\2\u0218\u0219\b\33\1\2\u0219\u021b\3\2\2\2"+
		"\u021a\u020c\3\2\2\2\u021a\u020f\3\2\2\2\u021a\u0212\3\2\2\2\u021a\u0213"+
		"\3\2\2\2\u021a\u0216\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u0221\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0222\7N"+
		"\2\2\u0220\u0222\5l\67\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222"+
		"\65\3\2\2\2\u0223\u0224\7<\2\2\u0224\u0225\5^\60\2\u0225\u0227\7K\2\2"+
		"\u0226\u0228\58\35\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7L\2\2\u022c"+
		"\67\3\2\2\2\u022d\u022e\5L\'\2\u022e\u022f\5^\60\2\u022f\u0230\7N\2\2"+
		"\u02309\3\2\2\2\u0231\u0232\7\27\2\2\u0232\u0233\5^\60\2\u0233\u0234\7"+
		"K\2\2\u0234\u0239\5^\60\2\u0235\u0236\7_\2\2\u0236\u0238\5^\60\2\u0237"+
		"\u0235\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\7L\2\2\u023d"+
		";\3\2\2\2\u023e\u023f\7?\2\2\u023f\u0240\5^\60\2\u0240\u0241\7*\2\2\u0241"+
		"\u0242\5N(\2\u0242\u0243\7N\2\2\u0243=\3\2\2\2\u0244\u025a\5L\'\2\u0245"+
		"\u0246\6 \25\3\u0246\u0247\7\64\2\2\u0247\u0259\b \1\2\u0248\u0249\6 "+
		"\26\3\u0249\u024a\7\63\2\2\u024a\u0259\b \1\2\u024b\u024c\6 \27\3\u024c"+
		"\u024d\7)\2\2\u024d\u0259\b \1\2\u024e\u024f\6 \30\3\u024f\u0250\7\17"+
		"\2\2\u0250\u0259\b \1\2\u0251\u0252\6 \31\3\u0252\u0253\5,\27\2\u0253"+
		"\u0254\b \1\2\u0254\u0259\3\2\2\2\u0255\u0256\6 \32\3\u0256\u0257\7%\2"+
		"\2\u0257\u0259\b \1\2\u0258\u0245\3\2\2\2\u0258\u0248\3\2\2\2\u0258\u024b"+
		"\3\2\2\2\u0258\u024e\3\2\2\2\u0258\u0251\3\2\2\2\u0258\u0255\3\2\2\2\u0259"+
		"\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2"+
		"\2\2\u025c\u025a\3\2\2\2\u025d\u0260\5^\60\2\u025e\u025f\7S\2\2\u025f"+
		"\u0261\5V,\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2"+
		"\2\u0262\u0263\7N\2\2\u0263?\3\2\2\2\u0264\u0265\5L\'\2\u0265\u0266\7"+
		"\17\2\2\u0266\u0267\5^\60\2\u0267\u0268\7S\2\2\u0268\u0269\5V,\2\u0269"+
		"\u026a\7N\2\2\u026aA\3\2\2\2\u026b\u026d\5L\'\2\u026c\u026e\7\'\2\2\u026d"+
		"\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u0271\5^"+
		"\60\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271C\3\2\2\2\u0272\u0273"+
		"\7\32\2\2\u0273\u0274\5^\60\2\u0274\u027d\7G\2\2\u0275\u027a\5B\"\2\u0276"+
		"\u0277\7_\2\2\u0277\u0279\5B\"\2\u0278\u0276\3\2\2\2\u0279\u027c\3\2\2"+
		"\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a"+
		"\3\2\2\2\u027d\u0275\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0281\7H\2\2\u0280\u0282\7\6\2\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0283\3\2\2\2\u0283\u0284\7N\2\2\u0284E\3\2\2\2\u0285\u0287"+
		"\5L\'\2\u0286\u0288\5^\60\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"G\3\2\2\2\u0289\u028a\7\30\2\2\u028a\u028b\5^\60\2\u028b\u0294\7G\2\2"+
		"\u028c\u0291\5F$\2\u028d\u028e\7_\2\2\u028e\u0290\5F$\2\u028f\u028d\3"+
		"\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u028c\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0296\3\2\2\2\u0296\u0297\7H\2\2\u0297\u0298\7N\2\2\u0298I"+
		"\3\2\2\2\u0299\u029a\7C\2\2\u029a\u029b\5\36\20\2\u029b\u029e\7!\2\2\u029c"+
		"\u029f\7j\2\2\u029d\u029f\5L\'\2\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2"+
		"\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7N\2\2\u02a1K\3\2\2\2\u02a2\u02a3\b"+
		"\'\1\2\u02a3\u02a8\5N(\2\u02a4\u02a8\5P)\2\u02a5\u02a8\5\u0094K\2\u02a6"+
		"\u02a8\5\36\20\2\u02a7\u02a2\3\2\2\2\u02a7\u02a4\3\2\2\2\u02a7\u02a5\3"+
		"\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02b1\3\2\2\2\u02a9\u02aa\f\3\2\2\u02aa"+
		"\u02ac\7I\2\2\u02ab\u02ad\5V,\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2"+
		"\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\7J\2\2\u02af\u02a9\3\2\2\2\u02b0\u02b3"+
		"\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2M\3\2\2\2\u02b3"+
		"\u02b1\3\2\2\2\u02b4\u02c1\7\7\2\2\u02b5\u02b6\6(\34\3\u02b6\u02b7\7\7"+
		"\2\2\u02b7\u02c1\7\62\2\2\u02b8\u02c1\7\n\2\2\u02b9\u02c1\7;\2\2\u02ba"+
		"\u02c1\7\f\2\2\u02bb\u02c1\79\2\2\u02bc\u02c1\7B\2\2\u02bd\u02c1\7 \2"+
		"\2\u02be\u02c1\7\36\2\2\u02bf\u02c1\7@\2\2\u02c0\u02b4\3\2\2\2\u02c0\u02b5"+
		"\3\2\2\2\u02c0\u02b8\3\2\2\2\u02c0\u02b9\3\2\2\2\u02c0\u02ba\3\2\2\2\u02c0"+
		"\u02bb\3\2\2\2\u02c0\u02bc\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c0\u02be\3\2"+
		"\2\2\u02c0\u02bf\3\2\2\2\u02c1O\3\2\2\2\u02c2\u02c3\7\"\2\2\u02c3\u02c5"+
		"\7G\2\2\u02c4\u02c6\5$\23\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02d2\7H\2\2\u02c8\u02c9\6)\35\3\u02c9\u02ca\5\""+
		"\22\2\u02ca\u02cb\b)\1\2\u02cb\u02d1\3\2\2\2\u02cc\u02cd\6)\36\3\u02cd"+
		"\u02ce\5*\26\2\u02ce\u02cf\b)\1\2\u02cf\u02d1\3\2\2\2\u02d0\u02c8\3\2"+
		"\2\2\u02d0\u02cc\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02da\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d6\78"+
		"\2\2\u02d6\u02d7\7G\2\2\u02d7\u02d8\5$\23\2\u02d8\u02d9\7H\2\2\u02d9\u02db"+
		"\3\2\2\2\u02da\u02d5\3\2\2\2\u02da\u02db\3\2\2\2\u02dbQ\3\2\2\2\u02dc"+
		"\u02de\5L\'\2\u02dd\u02df\5T+\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2"+
		"\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\5^\60\2\u02e1S\3\2\2\2\u02e2\u02e3"+
		"\t\4\2\2\u02e3U\3\2\2\2\u02e4\u02e5\b,\1\2\u02e5\u02e6\7\62\2\2\u02e6"+
		"\u02f8\5\34\17\2\u02e7\u02e8\7?\2\2\u02e8\u02e9\7G\2\2\u02e9\u02ea\5L"+
		"\'\2\u02ea\u02eb\7H\2\2\u02eb\u02f8\3\2\2\2\u02ec\u02ed\t\5\2\2\u02ed"+
		"\u02f8\5V,\25\u02ee\u02ef\7/\2\2\u02ef\u02f8\5L\'\2\u02f0\u02f8\5Z.\2"+
		"\u02f1\u02f8\5\\/\2\u02f2\u02f6\5^\60\2\u02f3\u02f6\5`\61\2\u02f4\u02f6"+
		"\5N(\2\u02f5\u02f2\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6"+
		"\u02f8\3\2\2\2\u02f7\u02e4\3\2\2\2\u02f7\u02e7\3\2\2\2\u02f7\u02ec\3\2"+
		"\2\2\u02f7\u02ee\3\2\2\2\u02f7\u02f0\3\2\2\2\u02f7\u02f1\3\2\2\2\u02f7"+
		"\u02f5\3\2\2\2\u02f8\u034d\3\2\2\2\u02f9\u02fa\f\23\2\2\u02fa\u02fb\7"+
		"m\2\2\u02fb\u034c\5V,\23\u02fc\u02fd\f\22\2\2\u02fd\u02fe\t\6\2\2\u02fe"+
		"\u034c\5V,\23\u02ff\u0300\f\21\2\2\u0300\u0301\t\7\2\2\u0301\u034c\5V"+
		",\22\u0302\u0303\f\20\2\2\u0303\u0304\t\b\2\2\u0304\u034c\5V,\21\u0305"+
		"\u0306\f\17\2\2\u0306\u0307\7d\2\2\u0307\u034c\5V,\20\u0308\u0309\f\16"+
		"\2\2\u0309\u030a\7c\2\2\u030a\u034c\5V,\17\u030b\u030c\f\r\2\2\u030c\u030d"+
		"\7b\2\2\u030d\u034c\5V,\16\u030e\u030f\f\f\2\2\u030f\u0310\t\t\2\2\u0310"+
		"\u034c\5V,\r\u0311\u0312\f\13\2\2\u0312\u0313\t\n\2\2\u0313\u034c\5V,"+
		"\f\u0314\u0315\f\n\2\2\u0315\u0316\7a\2\2\u0316\u034c\5V,\13\u0317\u0318"+
		"\f\t\2\2\u0318\u0319\7`\2\2\u0319\u034c\5V,\n\u031a\u031b\f\b\2\2\u031b"+
		"\u031c\7P\2\2\u031c\u031d\5V,\2\u031d\u031e\7M\2\2\u031e\u031f\5V,\b\u031f"+
		"\u034c\3\2\2\2\u0320\u0321\f\7\2\2\u0321\u0322\5X-\2\u0322\u0323\5V,\7"+
		"\u0323\u034c\3\2\2\2\u0324\u0325\f\34\2\2\u0325\u0327\7I\2\2\u0326\u0328"+
		"\5V,\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329"+
		"\u034c\7J\2\2\u032a\u032b\f\33\2\2\u032b\u032d\7I\2\2\u032c\u032e\5V,"+
		"\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331"+
		"\7M\2\2\u0330\u0332\5V,\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u034c\7J\2\2\u0334\u0335\f\32\2\2\u0335\u0338\7O"+
		"\2\2\u0336\u0339\5^\60\2\u0337\u0339\7\7\2\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0337\3\2\2\2\u0339\u034c\3\2\2\2\u033a\u033b\f\31\2\2\u033b\u0344\7"+
		"K\2\2\u033c\u0341\5\32\16\2\u033d\u033e\7_\2\2\u033e\u0340\5\32\16\2\u033f"+
		"\u033d\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u033c\3\2\2\2\u0344"+
		"\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034c\7L\2\2\u0347\u0348\f\30"+
		"\2\2\u0348\u034c\5\34\17\2\u0349\u034a\f\24\2\2\u034a\u034c\t\13\2\2\u034b"+
		"\u02f9\3\2\2\2\u034b\u02fc\3\2\2\2\u034b\u02ff\3\2\2\2\u034b\u0302\3\2"+
		"\2\2\u034b\u0305\3\2\2\2\u034b\u0308\3\2\2\2\u034b\u030b\3\2\2\2\u034b"+
		"\u030e\3\2\2\2\u034b\u0311\3\2\2\2\u034b\u0314\3\2\2\2\u034b\u0317\3\2"+
		"\2\2\u034b\u031a\3\2\2\2\u034b\u0320\3\2\2\2\u034b\u0324\3\2\2\2\u034b"+
		"\u032a\3\2\2\2\u034b\u0334\3\2\2\2\u034b\u033a\3\2\2\2\u034b\u0347\3\2"+
		"\2\2\u034b\u0349\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034eW\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0351\t\f\2\2"+
		"\u0351Y\3\2\2\2\u0352\u0354\7G\2\2\u0353\u0355\5V,\2\u0354\u0353\3\2\2"+
		"\2\u0354\u0355\3\2\2\2\u0355\u035c\3\2\2\2\u0356\u0358\7_\2\2\u0357\u0359"+
		"\5V,\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a"+
		"\u0356\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035d\3\2"+
		"\2\2\u035d\u035f\3\2\2\2\u035e\u035c\3\2\2\2\u035f\u0360\7H\2\2\u0360"+
		"[\3\2\2\2\u0361\u0362\7I\2\2\u0362\u0367\5V,\2\u0363\u0364\7_\2\2\u0364"+
		"\u0366\5V,\2\u0365\u0363\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2"+
		"\2\u0367\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u036b"+
		"\7J\2\2\u036b]\3\2\2\2\u036c\u036d\t\r\2\2\u036d_\3\2\2\2\u036e\u0374"+
		"\5d\63\2\u036f\u0374\5j\66\2\u0370\u0374\5b\62\2\u0371\u0374\5f\64\2\u0372"+
		"\u0374\5h\65\2\u0373\u036e\3\2\2\2\u0373\u036f\3\2\2\2\u0373\u0370\3\2"+
		"\2\2\u0373\u0371\3\2\2\2\u0373\u0372\3\2\2\2\u0374a\3\2\2\2\u0375\u0376"+
		"\t\16\2\2\u0376c\3\2\2\2\u0377\u0379\t\17\2\2\u0378\u0377\3\2\2\2\u0379"+
		"\u037a\3\2\2\2\u037a\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037be\3\2\2\2"+
		"\u037c\u037e\7}\2\2\u037d\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u037d"+
		"\3\2\2\2\u037f\u0380\3\2\2\2\u0380g\3\2\2\2\u0381\u0383\7|\2\2\u0382\u0381"+
		"\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"i\3\2\2\2\u0386\u0388\t\20\2\2\u0387\u0389\7\60\2\2\u0388\u0387\3\2\2"+
		"\2\u0388\u0389\3\2\2\2\u0389k\3\2\2\2\u038a\u038f\7K\2\2\u038b\u038e\5"+
		"p9\2\u038c\u038e\5n8\2\u038d\u038b\3\2\2\2\u038d\u038c\3\2\2\2\u038e\u0391"+
		"\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0392\u0393\7L\2\2\u0393m\3\2\2\2\u0394\u0395\7A\2\2\u0395"+
		"\u0396\5l\67\2\u0396o\3\2\2\2\u0397\u03a5\5l\67\2\u0398\u03a5\5r:\2\u0399"+
		"\u03a5\5t;\2\u039a\u03a5\5v<\2\u039b\u03a5\5x=\2\u039c\u03a5\5z>\2\u039d"+
		"\u03a5\5|?\2\u039e\u03a5\5~@\2\u039f\u03a5\5\u0080A\2\u03a0\u03a5\5\u0084"+
		"C\2\u03a1\u03a5\5\u0086D\2\u03a2\u03a5\5\u0088E\2\u03a3\u03a5\5\u008a"+
		"F\2\u03a4\u0397\3\2\2\2\u03a4\u0398\3\2\2\2\u03a4\u0399\3\2\2\2\u03a4"+
		"\u039a\3\2\2\2\u03a4\u039b\3\2\2\2\u03a4\u039c\3\2\2\2\u03a4\u039d\3\2"+
		"\2\2\u03a4\u039e\3\2\2\2\u03a4\u039f\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a4"+
		"\u03a1\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5q\3\2\2\2"+
		"\u03a6\u03a9\5\u0090I\2\u03a7\u03a9\5\u0092J\2\u03a8\u03a6\3\2\2\2\u03a8"+
		"\u03a7\3\2\2\2\u03a9s\3\2\2\2\u03aa\u03ab\7$\2\2\u03ab\u03ac\7G\2\2\u03ac"+
		"\u03ad\5V,\2\u03ad\u03ae\7H\2\2\u03ae\u03b1\5p9\2\u03af\u03b0\7\25\2\2"+
		"\u03b0\u03b2\5p9\2\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2u\3\2"+
		"\2\2\u03b3\u03b4\7!\2\2\u03b4\u03b7\7G\2\2\u03b5\u03b8\5r:\2\u03b6\u03b8"+
		"\7N\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b6\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9"+
		"\u03bc\5\u0092J\2\u03ba\u03bc\7N\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03ba\3"+
		"\2\2\2\u03bc\u03be\3\2\2\2\u03bd\u03bf\5V,\2\u03be\u03bd\3\2\2\2\u03be"+
		"\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\7H\2\2\u03c1\u03c2\5p9"+
		"\2\u03c2w\3\2\2\2\u03c3\u03c4\7F\2\2\u03c4\u03c5\7G\2\2\u03c5\u03c6\5"+
		"V,\2\u03c6\u03c7\7H\2\2\u03c7\u03c8\5p9\2\u03c8y\3\2\2\2\u03c9\u03ca\7"+
		"\24\2\2\u03ca\u03cb\5p9\2\u03cb\u03cc\7F\2\2\u03cc\u03cd\7G\2\2\u03cd"+
		"\u03ce\5V,\2\u03ce\u03cf\7H\2\2\u03cf\u03d0\7N\2\2\u03d0{\3\2\2\2\u03d1"+
		"\u03d2\7\21\2\2\u03d2\u03d3\7N\2\2\u03d3}\3\2\2\2\u03d4\u03d5\7\13\2\2"+
		"\u03d5\u03d6\7N\2\2\u03d6\177\3\2\2\2\u03d7\u03d8\7>\2\2\u03d8\u03de\5"+
		"V,\2\u03d9\u03da\78\2\2\u03da\u03db\7G\2\2\u03db\u03dc\5$\23\2\u03dc\u03dd"+
		"\7H\2\2\u03dd\u03df\3\2\2\2\u03de\u03d9\3\2\2\2\u03de\u03df\3\2\2\2\u03df"+
		"\u03e0\3\2\2\2\u03e0\u03e2\5l\67\2\u03e1\u03e3\5\u0082B\2\u03e2\u03e1"+
		"\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5"+
		"\u0081\3\2\2\2\u03e6\u03ee\7\16\2\2\u03e7\u03e9\5^\60\2\u03e8\u03e7\3"+
		"\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\7G\2\2\u03eb"+
		"\u03ec\5$\23\2\u03ec\u03ed\7H\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03e8\3\2"+
		"\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\5l\67\2\u03f1"+
		"\u0083\3\2\2\2\u03f2\u03f4\7\67\2\2\u03f3\u03f5\5V,\2\u03f4\u03f3\3\2"+
		"\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\7N\2\2\u03f7"+
		"\u0085\3\2\2\2\u03f8\u03f9\7\26\2\2\u03f9\u03fa\5V,\2\u03fa\u03fb\5\34"+
		"\17\2\u03fb\u03fc\7N\2\2\u03fc\u0087\3\2\2\2\u03fd\u03fe\7\31\2\2\u03fe"+
		"\u03ff\5V,\2\u03ff\u0400\5\34\17\2\u0400\u0401\7N\2\2\u0401\u0089\3\2"+
		"\2\2\u0402\u0404\7\t\2\2\u0403\u0405\7\u0084\2\2\u0404\u0403\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u040a\7\u0085\2\2\u0407\u0409"+
		"\5\u0098M\2\u0408\u0407\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408\3\2\2"+
		"\2\u040a\u040b\3\2\2\2\u040b\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u040e"+
		"\7\u0098\2\2\u040e\u008b\3\2\2\2\u040f\u0414\5R*\2\u0410\u0411\7_\2\2"+
		"\u0411\u0413\5R*\2\u0412\u0410\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412"+
		"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u008d\3\2\2\2\u0416\u0414\3\2\2\2\u0417"+
		"\u041b\7G\2\2\u0418\u041a\7_\2\2\u0419\u0418\3\2\2\2\u041a\u041d\3\2\2"+
		"\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u041e\3\2\2\2\u041d\u041b"+
		"\3\2\2\2\u041e\u041f\5R*\2\u041f\u0426\3\2\2\2\u0420\u0422\7_\2\2\u0421"+
		"\u0423\5R*\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0425\3\2\2"+
		"\2\u0424\u0420\3\2\2\2\u0425\u0428\3\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427"+
		"\3\2\2\2\u0427\u0429\3\2\2\2\u0428\u0426\3\2\2\2\u0429\u042a\7H\2\2\u042a"+
		"\u008f\3\2\2\2\u042b\u042e\5R*\2\u042c\u042d\7S\2\2\u042d\u042f\5V,\2"+
		"\u042e\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0435\3\2\2\2\u0430\u0431"+
		"\5\u008eH\2\u0431\u0432\7S\2\2\u0432\u0433\5V,\2\u0433\u0435\3\2\2\2\u0434"+
		"\u042b\3\2\2\2\u0434\u0430\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\7N"+
		"\2\2\u0437\u0091\3\2\2\2\u0438\u0439\5V,\2\u0439\u043a\7N\2\2\u043a\u0093"+
		"\3\2\2\2\u043b\u043c\7,\2\2\u043c\u043d\7G\2\2\u043d\u043e\5\u0096L\2"+
		"\u043e\u043f\7Q\2\2\u043f\u0440\5L\'\2\u0440\u0441\7H\2\2\u0441\u0095"+
		"\3\2\2\2\u0442\u0445\5N(\2\u0443\u0445\5\36\20\2\u0444\u0442\3\2\2\2\u0444"+
		"\u0443\3\2\2\2\u0445\u0097\3\2\2\2\u0446\u0452\5\u009aN\2\u0447\u0452"+
		"\5\u009cO\2\u0448\u0452\5\u009eP\2\u0449\u0452\5\u00acW\2\u044a\u0452"+
		"\5\u00a0Q\2\u044b\u0452\5\u00a2R\2\u044c\u0452\5\u00a6T\2\u044d\u0452"+
		"\7\u0091\2\2\u044e\u0452\7\u0089\2\2\u044f\u0452\7\u008b\2\2\u0450\u0452"+
		"\5\u00a8U\2\u0451\u0446\3\2\2\2\u0451\u0447\3\2\2\2\u0451\u0448\3\2\2"+
		"\2\u0451\u0449\3\2\2\2\u0451\u044a\3\2\2\2\u0451\u044b\3\2\2\2\u0451\u044c"+
		"\3\2\2\2\u0451\u044d\3\2\2\2\u0451\u044e\3\2\2\2\u0451\u044f\3\2\2\2\u0451"+
		"\u0450\3\2\2\2\u0452\u0099\3\2\2\2\u0453\u0457\7\u0097\2\2\u0454\u0456"+
		"\5\u0098M\2\u0455\u0454\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2"+
		"\2\u0457\u0458\3\2\2\2\u0458\u045a\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b"+
		"\7\u0098\2\2\u045b\u009b\3\2\2\2\u045c\u045d\7\u0092\2\2\u045d\u0460\7"+
		"\u009f\2\2\u045e\u045f\7\u009b\2\2\u045f\u0461\5\u00b2Z\2\u0460\u045e"+
		"\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0470\3\2\2\2\u0462\u0463\7\u0092\2"+
		"\2\u0463\u0468\7\u009f\2\2\u0464\u0465\7\u009d\2\2\u0465\u0467\7\u009f"+
		"\2\2\u0466\u0464\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u0466\3\2\2\2\u0468"+
		"\u0469\3\2\2\2\u0469\u046d\3\2\2\2\u046a\u0468\3\2\2\2\u046b\u046c\7\u009b"+
		"\2\2\u046c\u046e\5\u00acW\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u0470\3\2\2\2\u046f\u045c\3\2\2\2\u046f\u0462\3\2\2\2\u0470\u009d\3\2"+
		"\2\2\u0471\u0472\5\u00aaV\2\u0472\u0473\7\u009b\2\2\u0473\u0474\5\u00b2"+
		"Z\2\u0474\u0480\3\2\2\2\u0475\u0478\5\u00aaV\2\u0476\u0477\7\u009d\2\2"+
		"\u0477\u0479\5\u00aaV\2\u0478\u0476\3\2\2\2\u0479\u047a\3\2\2\2\u047a"+
		"\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\7\u009b"+
		"\2\2\u047d\u047e\5\u00acW\2\u047e\u0480\3\2\2\2\u047f\u0471\3\2\2\2\u047f"+
		"\u0475\3\2\2\2\u0480\u009f\3\2\2\2\u0481\u0482\7\u0090\2\2\u0482\u0483"+
		"\5\u00b2Z\2\u0483\u0484\5\u009aN\2\u0484\u00a1\3\2\2\2\u0485\u0486\7\u008e"+
		"\2\2\u0486\u0487\5\u009aN\2\u0487\u0488\5\u00b2Z\2\u0488\u0489\5\u009a"+
		"N\2\u0489\u048a\5\u009aN\2\u048a\u00a3\3\2\2\2\u048b\u048c\7\u008a\2\2"+
		"\u048c\u048d\5\u00b0Y\2\u048d\u048e\5\u009aN\2\u048e\u00a5\3\2\2\2\u048f"+
		"\u0490\7\u0093\2\2\u0490\u049c\5\u00b2Z\2\u0491\u0493\5\u00a4S\2\u0492"+
		"\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0492\3\2\2\2\u0494\u0495\3\2"+
		"\2\2\u0495\u0498\3\2\2\2\u0496\u0497\7\u008c\2\2\u0497\u0499\5\u009aN"+
		"\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049d\3\2\2\2\u049a\u049b"+
		"\7\u008c\2\2\u049b\u049d\5\u009aN\2\u049c\u0492\3\2\2\2\u049c\u049a\3"+
		"\2\2\2\u049d\u00a7\3\2\2\2\u049e\u049f\7\u008f\2\2\u049f\u04a0\7\u009f"+
		"\2\2\u04a0\u04a9\7\u0099\2\2\u04a1\u04a6\7\u009f\2\2\u04a2\u04a3\7\u009d"+
		"\2\2\u04a3\u04a5\7\u009f\2\2\u04a4\u04a2\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6"+
		"\u04a4\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3\2"+
		"\2\2\u04a9\u04a1\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab"+
		"\u04b5\7\u009a\2\2\u04ac\u04ad\7\u009e\2\2\u04ad\u04b2\7\u009f\2\2\u04ae"+
		"\u04af\7\u009d\2\2\u04af\u04b1\7\u009f\2\2\u04b0\u04ae\3\2\2\2\u04b1\u04b4"+
		"\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4"+
		"\u04b2\3\2\2\2\u04b5\u04ac\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\3\2"+
		"\2\2\u04b7\u04b8\5\u009aN\2\u04b8\u00a9\3\2\2\2\u04b9\u04be\7\u009f\2"+
		"\2\u04ba\u04bb\7\u009c\2\2\u04bb\u04bd\7\u009f\2\2\u04bc\u04ba\3\2\2\2"+
		"\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u00ab"+
		"\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1\u04c2\t\21\2\2\u04c2\u04cb\7\u0099"+
		"\2\2\u04c3\u04c8\5\u00b2Z\2\u04c4\u04c5\7\u009d\2\2\u04c5\u04c7\5\u00b2"+
		"Z\2\u04c6\u04c4\3\2\2\2\u04c7\u04ca\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c8"+
		"\u04c9\3\2\2\2\u04c9\u04cc\3\2\2\2\u04ca\u04c8\3\2\2\2\u04cb\u04c3\3\2"+
		"\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\7\u009a\2\2\u04ce"+
		"\u00ad\3\2\2\2\u04cf\u04d0\t\22\2\2\u04d0\u00af\3\2\2\2\u04d1\u04d7\7"+
		"\u00a1\2\2\u04d2\u04d7\7\u00a2\2\2\u04d3\u04d7\7\u00a0\2\2\u04d4\u04d7"+
		"\5\u00aeX\2\u04d5\u04d7\7\u00a3\2\2\u04d6\u04d1\3\2\2\2\u04d6\u04d2\3"+
		"\2\2\2\u04d6\u04d3\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d5\3\2\2\2\u04d7"+
		"\u00b1\3\2\2\2\u04d8\u04dc\5\u00aaV\2\u04d9\u04dc\5\u00acW\2\u04da\u04dc"+
		"\5\u00b0Y\2\u04db\u04d8\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04da\3\2\2"+
		"\2\u04dc\u00b3\3\2\2\2\u0088\u00bf\u00c1\u00ca\u00d2\u00de\u00e5\u00ef"+
		"\u00f5\u00fa\u0100\u0108\u010e\u0119\u0124\u0129\u0137\u0143\u0146\u014e"+
		"\u0151\u0154\u015d\u0162\u016b\u0170\u0173\u0178\u0185\u0187\u0195\u019a"+
		"\u01a0\u01a4\u01b7\u01b9\u01c1\u01c5\u01cb\u01ce\u01d7\u01d9\u01de\u01e5"+
		"\u01f7\u01f9\u0203\u0207\u021a\u021c\u0221\u0229\u0239\u0258\u025a\u0260"+
		"\u026d\u0270\u027a\u027d\u0281\u0287\u0291\u0294\u029e\u02a7\u02ac\u02b1"+
		"\u02c0\u02c5\u02d0\u02d2\u02da\u02de\u02f5\u02f7\u0327\u032d\u0331\u0338"+
		"\u0341\u0344\u034b\u034d\u0354\u0358\u035c\u0367\u0373\u037a\u037f\u0384"+
		"\u0388\u038d\u038f\u03a4\u03a8\u03b1\u03b7\u03bb\u03be\u03de\u03e4\u03e8"+
		"\u03ee\u03f4\u0404\u040a\u0414\u041b\u0422\u0426\u042e\u0434\u0444\u0451"+
		"\u0457\u0460\u0468\u046d\u046f\u047a\u047f\u0494\u0498\u049c\u04a6\u04a9"+
		"\u04b2\u04b5\u04be\u04c8\u04cb\u04d6\u04db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}